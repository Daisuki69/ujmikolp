package androidx.heifwriter;

import We.s;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.heifwriter.HeifEncoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class HeifWriter implements AutoCloseable {
    private static final boolean DEBUG = false;
    public static final int INPUT_MODE_BITMAP = 2;
    public static final int INPUT_MODE_BUFFER = 0;
    public static final int INPUT_MODE_SURFACE = 1;
    private static final int MUXER_DATA_FLAG = 16;
    private static final String TAG = "HeifWriter";
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private HeifEncoder mHeifEncoder;
    private final int mInputMode;
    final int mMaxImages;
    MediaMuxer mMuxer;
    int mNumTiles;
    int mOutputIndex;
    final int mPrimaryIndex;
    final int mRotation;
    private boolean mStarted;
    int[] mTrackIndexArray;
    final ResultWaiter mResultWaiter = new ResultWaiter();
    final AtomicBoolean mMuxerStarted = new AtomicBoolean(false);
    private final List<Pair<Integer, ByteBuffer>> mExifList = new ArrayList();

    public static final class Builder {
        private final FileDescriptor mFd;
        private boolean mGridEnabled;
        private Handler mHandler;
        private final int mHeight;
        private final int mInputMode;
        private int mMaxImages;
        private final String mPath;
        private int mPrimaryIndex;
        private int mQuality;
        private int mRotation;
        private final int mWidth;

        public Builder(@NonNull String str, int i, int i4, int i6) {
            this(str, null, i, i4, i6);
        }

        public HeifWriter build() throws IOException {
            return new HeifWriter(this.mPath, this.mFd, this.mWidth, this.mHeight, this.mRotation, this.mGridEnabled, this.mQuality, this.mMaxImages, this.mPrimaryIndex, this.mInputMode, this.mHandler);
        }

        public Builder setGridEnabled(boolean z4) {
            this.mGridEnabled = z4;
            return this;
        }

        public Builder setHandler(@Nullable Handler handler) {
            this.mHandler = handler;
            return this;
        }

        public Builder setMaxImages(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(s.f(i, "Invalid maxImage: "));
            }
            this.mMaxImages = i;
            return this;
        }

        public Builder setPrimaryIndex(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(s.f(i, "Invalid primaryIndex: "));
            }
            this.mPrimaryIndex = i;
            return this;
        }

        public Builder setQuality(int i) {
            if (i < 0 || i > 100) {
                throw new IllegalArgumentException(s.f(i, "Invalid quality: "));
            }
            this.mQuality = i;
            return this;
        }

        public Builder setRotation(int i) {
            if (i != 0 && i != 90 && i != 180 && i != 270) {
                throw new IllegalArgumentException(s.f(i, "Invalid rotation angle: "));
            }
            this.mRotation = i;
            return this;
        }

        public Builder(@NonNull FileDescriptor fileDescriptor, int i, int i4, int i6) {
            this(null, fileDescriptor, i, i4, i6);
        }

        private Builder(String str, FileDescriptor fileDescriptor, int i, int i4, int i6) {
            this.mGridEnabled = true;
            this.mQuality = 100;
            this.mMaxImages = 1;
            this.mPrimaryIndex = 0;
            this.mRotation = 0;
            if (i > 0 && i4 > 0) {
                this.mPath = str;
                this.mFd = fileDescriptor;
                this.mWidth = i;
                this.mHeight = i4;
                this.mInputMode = i6;
                return;
            }
            throw new IllegalArgumentException(a.c(i, i4, "Invalid image size: ", "x"));
        }
    }

    public class HeifCallback extends HeifEncoder.Callback {
        private boolean mEncoderStopped;

        public HeifCallback() {
        }

        private void stopAndNotify(@Nullable Exception exc) {
            if (this.mEncoderStopped) {
                return;
            }
            this.mEncoderStopped = true;
            HeifWriter.this.mResultWaiter.signalResult(exc);
        }

        @Override // androidx.heifwriter.HeifEncoder.Callback
        public void onComplete(@NonNull HeifEncoder heifEncoder) {
            stopAndNotify(null);
        }

        @Override // androidx.heifwriter.HeifEncoder.Callback
        public void onDrainOutputBuffer(@NonNull HeifEncoder heifEncoder, @NonNull ByteBuffer byteBuffer) {
            if (this.mEncoderStopped) {
                return;
            }
            HeifWriter heifWriter = HeifWriter.this;
            if (heifWriter.mTrackIndexArray == null) {
                stopAndNotify(new IllegalStateException("Output buffer received before format info"));
                return;
            }
            if (heifWriter.mOutputIndex < heifWriter.mMaxImages * heifWriter.mNumTiles) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0L, 0);
                HeifWriter heifWriter2 = HeifWriter.this;
                heifWriter2.mMuxer.writeSampleData(heifWriter2.mTrackIndexArray[heifWriter2.mOutputIndex / heifWriter2.mNumTiles], byteBuffer, bufferInfo);
            }
            HeifWriter heifWriter3 = HeifWriter.this;
            int i = heifWriter3.mOutputIndex + 1;
            heifWriter3.mOutputIndex = i;
            if (i == heifWriter3.mMaxImages * heifWriter3.mNumTiles) {
                stopAndNotify(null);
            }
        }

        @Override // androidx.heifwriter.HeifEncoder.Callback
        public void onError(@NonNull HeifEncoder heifEncoder, @NonNull MediaCodec.CodecException codecException) {
            stopAndNotify(codecException);
        }

        @Override // androidx.heifwriter.HeifEncoder.Callback
        public void onOutputFormatChanged(@NonNull HeifEncoder heifEncoder, @NonNull MediaFormat mediaFormat) {
            if (this.mEncoderStopped) {
                return;
            }
            if (HeifWriter.this.mTrackIndexArray != null) {
                stopAndNotify(new IllegalStateException("Output format changed after muxer started"));
                return;
            }
            try {
                HeifWriter.this.mNumTiles = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
            } catch (ClassCastException | NullPointerException unused) {
                HeifWriter.this.mNumTiles = 1;
            }
            HeifWriter heifWriter = HeifWriter.this;
            heifWriter.mTrackIndexArray = new int[heifWriter.mMaxImages];
            if (heifWriter.mRotation > 0) {
                Log.d(HeifWriter.TAG, "setting rotation: " + HeifWriter.this.mRotation);
                HeifWriter heifWriter2 = HeifWriter.this;
                heifWriter2.mMuxer.setOrientationHint(heifWriter2.mRotation);
            }
            int i = 0;
            while (true) {
                HeifWriter heifWriter3 = HeifWriter.this;
                if (i >= heifWriter3.mTrackIndexArray.length) {
                    heifWriter3.mMuxer.start();
                    HeifWriter.this.mMuxerStarted.set(true);
                    HeifWriter.this.processExifData();
                    return;
                } else {
                    mediaFormat.setInteger("is-default", i == heifWriter3.mPrimaryIndex ? 1 : 0);
                    HeifWriter heifWriter4 = HeifWriter.this;
                    heifWriter4.mTrackIndexArray[i] = heifWriter4.mMuxer.addTrack(mediaFormat);
                    i++;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public static class ResultWaiter {
        private boolean mDone;
        private Exception mException;

        public synchronized void signalResult(@Nullable Exception exc) {
            if (!this.mDone) {
                this.mDone = true;
                this.mException = exc;
                notifyAll();
            }
        }

        public synchronized void waitForResult(long j) throws Exception {
            if (j < 0) {
                throw new IllegalArgumentException("timeoutMs is negative");
            }
            if (j == 0) {
                while (!this.mDone) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (!this.mDone && j > 0) {
                    try {
                        wait(j);
                    } catch (InterruptedException unused2) {
                    }
                    j -= System.currentTimeMillis() - jCurrentTimeMillis;
                }
            }
            if (!this.mDone) {
                this.mDone = true;
                this.mException = new TimeoutException("timed out waiting for result");
            }
            Exception exc = this.mException;
            if (exc != null) {
                throw exc;
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public HeifWriter(@NonNull String str, @NonNull FileDescriptor fileDescriptor, int i, int i4, int i6, boolean z4, int i10, int i11, int i12, int i13, @Nullable Handler handler) throws IOException {
        if (i12 >= i11) {
            throw new IllegalArgumentException(a.h("Invalid maxImages (", i11, ") or primaryIndex (", i12, ")"));
        }
        MediaFormat.createVideoFormat("image/vnd.android.heic", i, i4);
        this.mNumTiles = 1;
        this.mRotation = i6;
        this.mInputMode = i13;
        this.mMaxImages = i11;
        this.mPrimaryIndex = i12;
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
        this.mMuxer = str != null ? new MediaMuxer(str, 3) : androidx.core.graphics.a.o(fileDescriptor);
        this.mHeifEncoder = new HeifEncoder(i, i4, z4, i10, i13, handler2, new HeifCallback());
    }

    private void checkMode(int i) {
        if (this.mInputMode == i) {
            return;
        }
        throw new IllegalStateException("Not valid in input mode " + this.mInputMode);
    }

    private void checkStarted(boolean z4) {
        if (this.mStarted != z4) {
            throw new IllegalStateException("Already started");
        }
    }

    private void checkStartedAndMode(int i) {
        checkStarted(true);
        checkMode(i);
    }

    public void addBitmap(@NonNull Bitmap bitmap) {
        checkStartedAndMode(2);
        synchronized (this) {
            try {
                HeifEncoder heifEncoder = this.mHeifEncoder;
                if (heifEncoder != null) {
                    heifEncoder.addBitmap(bitmap);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addExifData(int i, @NonNull byte[] bArr, int i4, int i6) {
        checkStarted(true);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i6);
        byteBufferAllocateDirect.put(bArr, i4, i6);
        byteBufferAllocateDirect.flip();
        synchronized (this.mExifList) {
            this.mExifList.add(new Pair<>(Integer.valueOf(i), byteBufferAllocateDirect));
        }
        processExifData();
    }

    public void addYuvBuffer(int i, @NonNull byte[] bArr) {
        checkStartedAndMode(0);
        synchronized (this) {
            try {
                HeifEncoder heifEncoder = this.mHeifEncoder;
                if (heifEncoder != null) {
                    heifEncoder.addYuvBuffer(i, bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHandler.postAtFrontOfQueue(new Runnable() { // from class: androidx.heifwriter.HeifWriter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HeifWriter.this.closeInternal();
                } catch (Exception unused) {
                }
            }
        });
    }

    public void closeInternal() {
        MediaMuxer mediaMuxer = this.mMuxer;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.mMuxer.release();
            this.mMuxer = null;
        }
        HeifEncoder heifEncoder = this.mHeifEncoder;
        if (heifEncoder != null) {
            heifEncoder.close();
            synchronized (this) {
                this.mHeifEncoder = null;
            }
        }
    }

    @NonNull
    public Surface getInputSurface() {
        checkStarted(false);
        checkMode(1);
        return this.mHeifEncoder.getInputSurface();
    }

    @SuppressLint({"WrongConstant"})
    public void processExifData() {
        Pair<Integer, ByteBuffer> pairRemove;
        if (!this.mMuxerStarted.get()) {
            return;
        }
        while (true) {
            synchronized (this.mExifList) {
                try {
                    if (this.mExifList.isEmpty()) {
                        return;
                    } else {
                        pairRemove = this.mExifList.remove(0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) pairRemove.second).position(), ((ByteBuffer) pairRemove.second).remaining(), 0L, 16);
            this.mMuxer.writeSampleData(this.mTrackIndexArray[((Integer) pairRemove.first).intValue()], (ByteBuffer) pairRemove.second, bufferInfo);
        }
    }

    public void setInputEndOfStreamTimestamp(long j) {
        checkStartedAndMode(1);
        synchronized (this) {
            try {
                HeifEncoder heifEncoder = this.mHeifEncoder;
                if (heifEncoder != null) {
                    heifEncoder.setEndOfInputStreamTimestamp(j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void start() {
        checkStarted(false);
        this.mStarted = true;
        this.mHeifEncoder.start();
    }

    public void stop(long j) throws Exception {
        checkStarted(true);
        synchronized (this) {
            try {
                HeifEncoder heifEncoder = this.mHeifEncoder;
                if (heifEncoder != null) {
                    heifEncoder.stopAsync();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mResultWaiter.waitForResult(j);
        processExifData();
        closeInternal();
    }
}
