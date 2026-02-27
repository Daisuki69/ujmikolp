package androidx.heifwriter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class HeifEncoder implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    private static final boolean DEBUG = false;
    private static final int GRID_HEIGHT = 512;
    private static final int GRID_WIDTH = 512;
    private static final int INPUT_BUFFER_POOL_SIZE = 2;
    public static final int INPUT_MODE_BITMAP = 2;
    public static final int INPUT_MODE_BUFFER = 0;
    public static final int INPUT_MODE_SURFACE = 1;
    private static final double MAX_COMPRESS_RATIO = 0.25d;
    private static final String TAG = "HeifEncoder";
    final Callback mCallback;
    private ByteBuffer mCurrentBuffer;
    private final Rect mDstRect;
    SurfaceEOSTracker mEOSTracker;
    MediaCodec mEncoder;
    private EglWindowSurface mEncoderEglSurface;
    private Surface mEncoderSurface;
    final int mGridCols;
    final int mGridHeight;
    final int mGridRows;
    final int mGridWidth;
    final Handler mHandler;
    private final HandlerThread mHandlerThread;
    final int mHeight;
    boolean mInputEOS;
    private int mInputIndex;
    private final int mInputMode;
    private Surface mInputSurface;
    private SurfaceTexture mInputTexture;
    private final int mNumTiles;
    private EglRectBlt mRectBlt;
    private final Rect mSrcRect;
    private int mTextureId;
    final boolean mUseGrid;
    final int mWidth;
    private final ArrayList<ByteBuffer> mEmptyBuffers = new ArrayList<>();
    private final ArrayList<ByteBuffer> mFilledBuffers = new ArrayList<>();
    final ArrayList<Integer> mCodecInputBuffers = new ArrayList<>();
    private final float[] mTmpMatrix = new float[16];

    public static abstract class Callback {
        public abstract void onComplete(@NonNull HeifEncoder heifEncoder);

        public abstract void onDrainOutputBuffer(@NonNull HeifEncoder heifEncoder, @NonNull ByteBuffer byteBuffer);

        public abstract void onError(@NonNull HeifEncoder heifEncoder, @NonNull MediaCodec.CodecException codecException);

        public abstract void onOutputFormatChanged(@NonNull HeifEncoder heifEncoder, @NonNull MediaFormat mediaFormat);
    }

    public class EncoderCallback extends MediaCodec.Callback {
        private boolean mOutputEOS;

        public EncoderCallback() {
        }

        private void stopAndNotify(@Nullable MediaCodec.CodecException codecException) {
            HeifEncoder.this.stopInternal();
            if (codecException == null) {
                HeifEncoder heifEncoder = HeifEncoder.this;
                heifEncoder.mCallback.onComplete(heifEncoder);
            } else {
                HeifEncoder heifEncoder2 = HeifEncoder.this;
                heifEncoder2.mCallback.onError(heifEncoder2, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec != HeifEncoder.this.mEncoder) {
                return;
            }
            Log.e(HeifEncoder.TAG, "onError: " + codecException);
            stopAndNotify(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            HeifEncoder heifEncoder = HeifEncoder.this;
            if (mediaCodec != heifEncoder.mEncoder || heifEncoder.mInputEOS) {
                return;
            }
            heifEncoder.mCodecInputBuffers.add(Integer.valueOf(i));
            HeifEncoder.this.maybeCopyOneTileYUV();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec != HeifEncoder.this.mEncoder || this.mOutputEOS) {
                return;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                SurfaceEOSTracker surfaceEOSTracker = HeifEncoder.this.mEOSTracker;
                if (surfaceEOSTracker != null) {
                    surfaceEOSTracker.updateLastOutputTime(bufferInfo.presentationTimeUs);
                }
                HeifEncoder heifEncoder = HeifEncoder.this;
                heifEncoder.mCallback.onDrainOutputBuffer(heifEncoder, outputBuffer);
            }
            this.mOutputEOS = ((bufferInfo.flags & 4) != 0) | this.mOutputEOS;
            mediaCodec.releaseOutputBuffer(i, false);
            if (this.mOutputEOS) {
                stopAndNotify(null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec != HeifEncoder.this.mEncoder) {
                return;
            }
            if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                mediaFormat.setString("mime", "image/vnd.android.heic");
                mediaFormat.setInteger("width", HeifEncoder.this.mWidth);
                mediaFormat.setInteger("height", HeifEncoder.this.mHeight);
                HeifEncoder heifEncoder = HeifEncoder.this;
                if (heifEncoder.mUseGrid) {
                    mediaFormat.setInteger("tile-width", heifEncoder.mGridWidth);
                    mediaFormat.setInteger("tile-height", HeifEncoder.this.mGridHeight);
                    mediaFormat.setInteger("grid-rows", HeifEncoder.this.mGridRows);
                    mediaFormat.setInteger("grid-cols", HeifEncoder.this.mGridCols);
                }
            }
            HeifEncoder heifEncoder2 = HeifEncoder.this;
            heifEncoder2.mCallback.onOutputFormatChanged(heifEncoder2, mediaFormat);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public class SurfaceEOSTracker {
        private static final boolean DEBUG_EOS = false;
        final boolean mCopyTiles;
        boolean mSignaled;
        long mInputEOSTimeNs = -1;
        long mLastInputTimeNs = -1;
        long mEncoderEOSTimeUs = -1;
        long mLastEncoderTimeUs = -1;
        long mLastOutputTimeUs = -1;

        public SurfaceEOSTracker(boolean z4) {
            this.mCopyTiles = z4;
        }

        private void doSignalEOSLocked() {
            HeifEncoder.this.mHandler.post(new Runnable() { // from class: androidx.heifwriter.HeifEncoder.SurfaceEOSTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaCodec mediaCodec = HeifEncoder.this.mEncoder;
                    if (mediaCodec != null) {
                        mediaCodec.signalEndOfInputStream();
                    }
                }
            });
            this.mSignaled = true;
        }

        private void updateEOSLocked() {
            if (this.mSignaled) {
                return;
            }
            if (this.mEncoderEOSTimeUs < 0) {
                long j = this.mInputEOSTimeNs;
                if (j >= 0 && this.mLastInputTimeNs >= j) {
                    long j6 = this.mLastEncoderTimeUs;
                    if (j6 < 0) {
                        doSignalEOSLocked();
                        return;
                    }
                    this.mEncoderEOSTimeUs = j6;
                }
            }
            long j7 = this.mEncoderEOSTimeUs;
            if (j7 < 0 || j7 > this.mLastOutputTimeUs) {
                return;
            }
            doSignalEOSLocked();
        }

        public synchronized void updateInputEOSTime(long j) {
            try {
                if (this.mCopyTiles) {
                    if (this.mInputEOSTimeNs < 0) {
                        this.mInputEOSTimeNs = j;
                    }
                } else if (this.mEncoderEOSTimeUs < 0) {
                    this.mEncoderEOSTimeUs = j / 1000;
                }
                updateEOSLocked();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean updateLastInputAndEncoderTime(long j, long j6) {
            boolean z4;
            try {
                long j7 = this.mInputEOSTimeNs;
                z4 = j7 < 0 || j <= j7;
                if (z4) {
                    this.mLastEncoderTimeUs = j6;
                }
                this.mLastInputTimeNs = j;
                updateEOSLocked();
            } catch (Throwable th2) {
                throw th2;
            }
            return z4;
        }

        public synchronized void updateLastOutputTime(long j) {
            this.mLastOutputTimeUs = j;
            updateEOSLocked();
        }
    }

    public HeifEncoder(int i, int i4, boolean z4, int i6, int i10, @Nullable Handler handler, @NonNull Callback callback) throws IOException {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z5;
        int i11;
        boolean z8;
        int i12;
        int i13;
        if (i < 0 || i4 < 0 || i6 < 0 || i6 > 100) {
            throw new IllegalArgumentException("invalid encoder inputs");
        }
        int i14 = 512;
        boolean z9 = z4 & (i > 512 || i4 > 512);
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("image/vnd.android.heic");
            this.mEncoder = mediaCodecCreateEncoderByType;
            capabilitiesForType = mediaCodecCreateEncoderByType.getCodecInfo().getCapabilitiesForType("image/vnd.android.heic");
            if (!capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i4)) {
                this.mEncoder.release();
                this.mEncoder = null;
                throw new Exception();
            }
            z5 = true;
        } catch (Exception unused) {
            MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType(MimeTypes.VIDEO_H265);
            this.mEncoder = mediaCodecCreateEncoderByType2;
            capabilitiesForType = mediaCodecCreateEncoderByType2.getCodecInfo().getCapabilitiesForType(MimeTypes.VIDEO_H265);
            z9 |= !capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i4);
            z5 = false;
        }
        this.mInputMode = i10;
        this.mCallback = callback;
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            looper = handlerThread.getLooper();
        } else {
            this.mHandlerThread = null;
        }
        Handler handler2 = new Handler(looper);
        this.mHandler = handler2;
        boolean z10 = i10 == 1 || i10 == 2;
        int i15 = z10 ? 2130708361 : 2135033992;
        this.mWidth = i;
        this.mHeight = i4;
        this.mUseGrid = z9;
        if (z9) {
            i13 = (i4 + FrameMetricsAggregator.EVERY_DURATION) / 512;
            z8 = z9;
            i12 = (i + FrameMetricsAggregator.EVERY_DURATION) / 512;
            i11 = 512;
        } else {
            i14 = i;
            i11 = i4;
            z8 = z9;
            i12 = 1;
            i13 = 1;
        }
        MediaFormat mediaFormatCreateVideoFormat = z5 ? MediaFormat.createVideoFormat("image/vnd.android.heic", i, i4) : MediaFormat.createVideoFormat(MimeTypes.VIDEO_H265, i14, i11);
        if (z8) {
            mediaFormatCreateVideoFormat.setInteger("tile-width", i14);
            mediaFormatCreateVideoFormat.setInteger("tile-height", i11);
            mediaFormatCreateVideoFormat.setInteger("grid-cols", i12);
            mediaFormatCreateVideoFormat.setInteger("grid-rows", i13);
        }
        if (z5) {
            this.mGridWidth = i;
            this.mGridHeight = i4;
            this.mGridRows = 1;
            this.mGridCols = 1;
        } else {
            this.mGridWidth = i14;
            this.mGridHeight = i11;
            this.mGridRows = i13;
            this.mGridCols = i12;
        }
        int i16 = this.mGridRows * this.mGridCols;
        this.mNumTiles = i16;
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 0);
        mediaFormatCreateVideoFormat.setInteger("color-format", i15);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i16);
        mediaFormatCreateVideoFormat.setInteger("capture-rate", i16 * 30);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities.isBitrateModeSupported(0)) {
            Log.d(TAG, "Setting bitrate mode to constant quality");
            Range qualityRange = encoderCapabilities.getQualityRange();
            Log.d(TAG, "Quality range: " + qualityRange);
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 0);
            mediaFormatCreateVideoFormat.setInteger("quality", (int) ((((double) ((((Integer) qualityRange.getUpper()).intValue() - ((Integer) qualityRange.getLower()).intValue()) * i6)) / 100.0d) + ((double) ((Integer) qualityRange.getLower()).intValue())));
        } else {
            if (encoderCapabilities.isBitrateModeSupported(2)) {
                Log.d(TAG, "Setting bitrate mode to constant bitrate");
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
            } else {
                Log.d(TAG, "Setting bitrate mode to variable bitrate");
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 1);
            }
            mediaFormatCreateVideoFormat.setInteger("bitrate", (int) (((((((double) (i * i4)) * 1.5d) * 8.0d) * MAX_COMPRESS_RATIO) * ((double) i6)) / 100.0d));
        }
        this.mEncoder.setCallback(new EncoderCallback(), handler2);
        this.mEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        if (z10) {
            this.mEncoderSurface = this.mEncoder.createInputSurface();
            boolean z11 = (z8 && !z5) || i10 == 2;
            this.mEOSTracker = new SurfaceEOSTracker(z11);
            if (z11) {
                EglWindowSurface eglWindowSurface = new EglWindowSurface(this.mEncoderSurface);
                this.mEncoderEglSurface = eglWindowSurface;
                eglWindowSurface.makeCurrent();
                EglRectBlt eglRectBlt = new EglRectBlt(new Texture2dProgram(i10 == 2 ? 0 : 1), i, i4);
                this.mRectBlt = eglRectBlt;
                this.mTextureId = eglRectBlt.createTextureObject();
                if (i10 == 1) {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureId, true);
                    this.mInputTexture = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.mInputTexture.setDefaultBufferSize(i, i4);
                    this.mInputSurface = new Surface(this.mInputTexture);
                }
                this.mEncoderEglSurface.makeUnCurrent();
            } else {
                this.mInputSurface = this.mEncoderSurface;
            }
        } else {
            for (int i17 = 0; i17 < 2; i17++) {
                this.mEmptyBuffers.add(ByteBuffer.allocateDirect(((this.mWidth * this.mHeight) * 3) / 2));
            }
        }
        this.mDstRect = new Rect(0, 0, this.mGridWidth, this.mGridHeight);
        this.mSrcRect = new Rect();
    }

    private ByteBuffer acquireEmptyBuffer() {
        ByteBuffer byteBufferRemove;
        synchronized (this.mEmptyBuffers) {
            while (!this.mInputEOS && this.mEmptyBuffers.isEmpty()) {
                try {
                    this.mEmptyBuffers.wait();
                } catch (InterruptedException unused) {
                }
            }
            byteBufferRemove = this.mInputEOS ? null : this.mEmptyBuffers.remove(0);
        }
        return byteBufferRemove;
    }

    private void addYuvBufferInternal(@Nullable byte[] bArr) {
        ByteBuffer byteBufferAcquireEmptyBuffer = acquireEmptyBuffer();
        if (byteBufferAcquireEmptyBuffer == null) {
            return;
        }
        byteBufferAcquireEmptyBuffer.clear();
        if (bArr != null) {
            byteBufferAcquireEmptyBuffer.put(bArr);
        }
        byteBufferAcquireEmptyBuffer.flip();
        synchronized (this.mFilledBuffers) {
            this.mFilledBuffers.add(byteBufferAcquireEmptyBuffer);
        }
        this.mHandler.post(new Runnable() { // from class: androidx.heifwriter.HeifEncoder.1
            @Override // java.lang.Runnable
            public void run() {
                HeifEncoder.this.maybeCopyOneTileYUV();
            }
        });
    }

    private long computePresentationTime(int i) {
        return ((((long) i) * 1000000) / ((long) this.mNumTiles)) + 132;
    }

    private static void copyOneTileYUV(ByteBuffer byteBuffer, Image image, int i, int i4, Rect rect, Rect rect2) {
        int i6;
        int i10;
        if (rect.width() != rect2.width() || rect.height() != rect2.height()) {
            throw new IllegalArgumentException("src and dst rect size are different!");
        }
        if (i % 2 == 0 && i4 % 2 == 0) {
            int i11 = 2;
            if (rect.left % 2 == 0 && rect.top % 2 == 0 && rect.right % 2 == 0 && rect.bottom % 2 == 0 && rect2.left % 2 == 0 && rect2.top % 2 == 0 && rect2.right % 2 == 0 && rect2.bottom % 2 == 0) {
                Image.Plane[] planes = image.getPlanes();
                int i12 = 0;
                while (i12 < planes.length) {
                    ByteBuffer buffer = planes[i12].getBuffer();
                    int pixelStride = planes[i12].getPixelStride();
                    int iMin = Math.min(rect.width(), i - rect.left);
                    int iMin2 = Math.min(rect.height(), i4 - rect.top);
                    if (i12 > 0) {
                        i10 = ((i12 + 3) * (i * i4)) / 4;
                        i6 = i11;
                    } else {
                        i6 = 1;
                        i10 = 0;
                    }
                    for (int i13 = 0; i13 < iMin2 / i6; i13++) {
                        byteBuffer.position((rect.left / i6) + ((((rect.top / i6) + i13) * i) / i6) + i10);
                        buffer.position(((rect2.left * pixelStride) / i6) + (planes[i12].getRowStride() * ((rect2.top / i6) + i13)));
                        int i14 = 0;
                        while (true) {
                            int i15 = iMin / i6;
                            if (i14 < i15) {
                                buffer.put(byteBuffer.get());
                                if (pixelStride > 1 && i14 != i15 - 1) {
                                    buffer.position((buffer.position() + pixelStride) - 1);
                                }
                                i14++;
                            }
                        }
                    }
                    i12++;
                    i11 = 2;
                }
                return;
            }
        }
        throw new IllegalArgumentException("src or dst are not aligned!");
    }

    private void copyTilesGL() {
        GLES20.glViewport(0, 0, this.mGridWidth, this.mGridHeight);
        for (int i = 0; i < this.mGridRows; i++) {
            for (int i4 = 0; i4 < this.mGridCols; i4++) {
                int i6 = this.mGridWidth;
                int i10 = i4 * i6;
                int i11 = this.mGridHeight;
                int i12 = i * i11;
                this.mSrcRect.set(i10, i12, i6 + i10, i11 + i12);
                this.mRectBlt.copyRect(this.mTextureId, Texture2dProgram.V_FLIP_MATRIX, this.mSrcRect);
                EglWindowSurface eglWindowSurface = this.mEncoderEglSurface;
                int i13 = this.mInputIndex;
                this.mInputIndex = i13 + 1;
                eglWindowSurface.setPresentationTime(computePresentationTime(i13) * 1000);
                this.mEncoderEglSurface.swapBuffers();
            }
        }
    }

    private ByteBuffer getCurrentBuffer() {
        if (!this.mInputEOS && this.mCurrentBuffer == null) {
            synchronized (this.mFilledBuffers) {
                this.mCurrentBuffer = this.mFilledBuffers.isEmpty() ? null : this.mFilledBuffers.remove(0);
            }
        }
        if (this.mInputEOS) {
            return null;
        }
        return this.mCurrentBuffer;
    }

    private void returnEmptyBufferAndNotify(boolean z4) {
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = z4 | this.mInputEOS;
            this.mEmptyBuffers.add(this.mCurrentBuffer);
            this.mEmptyBuffers.notifyAll();
        }
        this.mCurrentBuffer = null;
    }

    public void addBitmap(@NonNull Bitmap bitmap) {
        if (this.mInputMode != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        }
        if (this.mEOSTracker.updateLastInputAndEncoderTime(computePresentationTime(this.mInputIndex) * 1000, computePresentationTime((this.mInputIndex + this.mNumTiles) - 1))) {
            synchronized (this) {
                try {
                    EglWindowSurface eglWindowSurface = this.mEncoderEglSurface;
                    if (eglWindowSurface == null) {
                        return;
                    }
                    eglWindowSurface.makeCurrent();
                    this.mRectBlt.loadTexture(this.mTextureId, bitmap);
                    copyTilesGL();
                    this.mEncoderEglSurface.makeUnCurrent();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void addYuvBuffer(int i, @NonNull byte[] bArr) {
        if (this.mInputMode != 0) {
            throw new IllegalStateException("addYuvBuffer is only allowed in buffer input mode");
        }
        if (bArr == null || bArr.length != ((this.mWidth * this.mHeight) * 3) / 2) {
            throw new IllegalArgumentException("invalid data");
        }
        addYuvBufferInternal(bArr);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = true;
            this.mEmptyBuffers.notifyAll();
        }
        this.mHandler.postAtFrontOfQueue(new Runnable() { // from class: androidx.heifwriter.HeifEncoder.2
            @Override // java.lang.Runnable
            public void run() {
                HeifEncoder.this.stopInternal();
            }
        });
    }

    @NonNull
    public Surface getInputSurface() {
        if (this.mInputMode == 1) {
            return this.mInputSurface;
        }
        throw new IllegalStateException("getInputSurface is only allowed in surface input mode");
    }

    public void maybeCopyOneTileYUV() {
        while (true) {
            ByteBuffer currentBuffer = getCurrentBuffer();
            if (currentBuffer == null || this.mCodecInputBuffers.isEmpty()) {
                return;
            }
            int iIntValue = this.mCodecInputBuffers.remove(0).intValue();
            boolean z4 = this.mInputIndex % this.mNumTiles == 0 && currentBuffer.remaining() == 0;
            if (!z4) {
                Image inputImage = this.mEncoder.getInputImage(iIntValue);
                int i = this.mGridWidth;
                int i4 = this.mInputIndex;
                int i6 = this.mGridCols;
                int i10 = (i4 % i6) * i;
                int i11 = this.mGridHeight;
                int i12 = ((i4 / i6) % this.mGridRows) * i11;
                this.mSrcRect.set(i10, i12, i + i10, i11 + i12);
                copyOneTileYUV(currentBuffer, inputImage, this.mWidth, this.mHeight, this.mSrcRect, this.mDstRect);
            }
            MediaCodec mediaCodec = this.mEncoder;
            int iCapacity = z4 ? 0 : mediaCodec.getInputBuffer(iIntValue).capacity();
            int i13 = this.mInputIndex;
            this.mInputIndex = i13 + 1;
            mediaCodec.queueInputBuffer(iIntValue, 0, iCapacity, computePresentationTime(i13), z4 ? 4 : 0);
            if (z4 || this.mInputIndex % this.mNumTiles == 0) {
                returnEmptyBufferAndNotify(z4);
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            try {
                EglWindowSurface eglWindowSurface = this.mEncoderEglSurface;
                if (eglWindowSurface == null) {
                    return;
                }
                eglWindowSurface.makeCurrent();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.mTmpMatrix);
                if (this.mEOSTracker.updateLastInputAndEncoderTime(surfaceTexture.getTimestamp(), computePresentationTime((this.mInputIndex + this.mNumTiles) - 1))) {
                    copyTilesGL();
                }
                surfaceTexture.releaseTexImage();
                this.mEncoderEglSurface.makeUnCurrent();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setEndOfInputStreamTimestamp(long j) {
        if (this.mInputMode != 1) {
            throw new IllegalStateException("setEndOfInputStreamTimestamp is only allowed in surface input mode");
        }
        SurfaceEOSTracker surfaceEOSTracker = this.mEOSTracker;
        if (surfaceEOSTracker != null) {
            surfaceEOSTracker.updateInputEOSTime(j);
        }
    }

    public void start() {
        this.mEncoder.start();
    }

    public void stopAsync() {
        int i = this.mInputMode;
        if (i == 2) {
            this.mEOSTracker.updateInputEOSTime(0L);
        } else if (i == 0) {
            addYuvBufferInternal(null);
        }
    }

    public void stopInternal() {
        MediaCodec mediaCodec = this.mEncoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mEncoder.release();
            this.mEncoder = null;
        }
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = true;
            this.mEmptyBuffers.notifyAll();
        }
        synchronized (this) {
            try {
                EglRectBlt eglRectBlt = this.mRectBlt;
                if (eglRectBlt != null) {
                    eglRectBlt.release(false);
                    this.mRectBlt = null;
                }
                EglWindowSurface eglWindowSurface = this.mEncoderEglSurface;
                if (eglWindowSurface != null) {
                    eglWindowSurface.release();
                    this.mEncoderEglSurface = null;
                }
                SurfaceTexture surfaceTexture = this.mInputTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.mInputTexture = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
