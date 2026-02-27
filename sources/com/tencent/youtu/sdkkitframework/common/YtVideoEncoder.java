package com.tencent.youtu.sdkkitframework.common;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class YtVideoEncoder {
    public static final String MIME_TYPE = "video/avc";
    public static final String TAG = "YtVideoEncoder";
    public static MediaCodecInfo codecInfo = null;
    public static int colorFormat = 21;
    public CountDownLatch mNewFrameLatch;
    public File mOutputFile;
    public MediaMuxer mediaMuxer;
    public MediaFormat mediaMuxerFormat;
    public String outputFileString;
    public MediaCodec videoEncoder;
    public int videoTrackIndex;
    public ConcurrentLinkedQueue<YTImageData> videoEncodeQueue = new ConcurrentLinkedQueue<>();
    public boolean isMediaMuxerStarted = false;
    public final Object mFrameSync = new Object();
    public final Object mediaMuxerSync = new Object();
    public int videoGenerateIndex = 0;
    public int addedTrackCount = 0;
    public boolean mNoMoreFrames = false;
    public boolean isEncodingStarted = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VideoEncodeResultCode {
        public static final int VIDEO_ENCODE_FAIL = -2;
        public static final int VIDEO_ENCODE_SUCCESS = 0;
        public static final int VIDEO_MEDIA_NOT_HAS_USE = -1;
        public static final int VIDEO_START_SUCCESS = 0;
    }

    private long computePresentationTime(long j, int i) {
        return ((j * 1000000) / ((long) i)) + 132;
    }

    public static boolean findColorFormats(int i, int[] iArr) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.videoEncoder.getInputBuffer(i);
    }

    public static int getMediaCodecInfo() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            codecInfo = null;
            for (int i = 0; i < codecCount && codecInfo == null; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    boolean z4 = false;
                    for (int i4 = 0; i4 < supportedTypes.length && !z4; i4++) {
                        if (supportedTypes[i4].equals("video/avc")) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        codecInfo = codecInfoAt;
                    }
                }
            }
            MediaCodecInfo mediaCodecInfo = codecInfo;
            if (mediaCodecInfo == null) {
                return -1;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
            YtLogger.o(TAG, "codecInfoName:" + codecInfo.getName() + " colorFormat:" + Arrays.toString(capabilitiesForType.colorFormats));
            if (findColorFormats(21, capabilitiesForType.colorFormats)) {
                colorFormat = 21;
                return 0;
            }
            if (!findColorFormats(19, capabilitiesForType.colorFormats)) {
                return -1;
            }
            colorFormat = 19;
            return 0;
        } catch (Exception e) {
            YtLogger.e(TAG, "get color format type error", e);
            return -1;
        }
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.videoEncoder.getOutputBuffer(i);
    }

    private void release() {
        synchronized (this.mediaMuxerSync) {
            try {
                if (this.videoEncoder != null) {
                    String str = TAG;
                    YtLogger.d(str, "reset media codec");
                    this.videoEncoder.reset();
                    YtLogger.d(str, "stop media codec");
                    this.videoEncoder.stop();
                    YtLogger.d(str, "Release media codec");
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                    YtLogger.d(str, "RELEASE Video CODEC");
                }
                if (this.mediaMuxer != null) {
                    String str2 = TAG;
                    YtLogger.d(str2, "Stop media muxer");
                    this.mediaMuxer.stop();
                    YtLogger.d(str2, "Release media muxer");
                    this.mediaMuxer.release();
                    this.mediaMuxer = null;
                    this.isMediaMuxerStarted = false;
                    YtLogger.d(str2, "RELEASE MUXER");
                }
                this.mediaMuxerFormat = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void startMediaMuxer(MediaFormat mediaFormat) {
        synchronized (this.mediaMuxerSync) {
            if (this.isMediaMuxerStarted) {
                MediaFormat mediaFormat2 = this.mediaMuxerFormat;
                if (mediaFormat2 != null && mediaFormat != null && mediaFormat2.toString().equals(mediaFormat.toString())) {
                    return;
                }
                try {
                    this.mediaMuxer.stop();
                } catch (Exception e) {
                    YtLogger.e(TAG, "media muxer stop failed:", e);
                }
                this.mediaMuxer.release();
                this.mediaMuxer = null;
                this.isMediaMuxerStarted = false;
                try {
                    this.mediaMuxer = new MediaMuxer(this.outputFileString, 0);
                } catch (Exception e7) {
                    YtLogger.e(TAG, "Unable to get path for ", e7);
                    return;
                }
            }
            this.mediaMuxerFormat = mediaFormat;
            this.videoTrackIndex = this.mediaMuxer.addTrack(mediaFormat);
            int i = this.addedTrackCount + 1;
            this.addedTrackCount = i;
            if (i >= 1) {
                YtLogger.d(TAG, "Media muxer is starting...");
                this.mediaMuxer.start();
                this.isMediaMuxerStarted = true;
                this.mediaMuxerSync.notifyAll();
            }
        }
    }

    public void abortEncoding() {
        this.isEncodingStarted = false;
        if (this.mOutputFile != null) {
            YtLogger.d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            YtLogger.i(TAG, "Failed to abort encoding since it never started");
            return;
        }
        YtLogger.i(TAG, "Aborting encoding");
        release();
        this.mNoMoreFrames = true;
        this.videoEncodeQueue = new ConcurrentLinkedQueue<>();
        synchronized (this.mFrameSync) {
            try {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearCache() {
        if (this.mOutputFile != null) {
            YtLogger.d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.isEncodingStarted) {
            try {
                this.videoEncoder.stop();
                this.videoEncoder.release();
            } catch (IllegalStateException e) {
                YtLogger.e(TAG, "restart:stop video error", e);
            }
        }
        if (this.mediaMuxer != null) {
            this.mediaMuxer = null;
        }
        this.videoEncodeQueue.clear();
        this.isEncodingStarted = false;
    }

    public void encode(int i) throws Exception {
        CountDownLatch countDownLatch;
        if (!this.isEncodingStarted) {
            throw new Exception("encode not started");
        }
        YtLogger.d(TAG, "Encoder started");
        if (this.mNoMoreFrames && this.videoEncodeQueue.size() == 0) {
            return;
        }
        YTImageData yTImageDataPoll = this.videoEncodeQueue.poll();
        if (yTImageDataPoll == null) {
            synchronized (this.mFrameSync) {
                countDownLatch = new CountDownLatch(1);
                this.mNewFrameLatch = countDownLatch;
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                YtLogger.e(TAG, "Queueing frame", e);
            }
            yTImageDataPoll = this.videoEncodeQueue.poll();
        }
        if (yTImageDataPoll == null) {
            YtLogger.e(TAG, "encode data is Null!!: ", null);
            return;
        }
        int iDequeueInputBuffer = this.videoEncoder.dequeueInputBuffer(200000L);
        long jComputePresentationTime = computePresentationTime(this.videoGenerateIndex, i);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer inputBuffer = getInputBuffer(iDequeueInputBuffer);
            inputBuffer.clear();
            inputBuffer.put(yTImageDataPoll.imgData);
            this.videoEncoder.queueInputBuffer(iDequeueInputBuffer, 0, yTImageDataPoll.imgData.length, jComputePresentationTime, 0);
            this.videoGenerateIndex++;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(bufferInfo, 200000L);
        if (iDequeueOutputBuffer == -1) {
            YtLogger.e(TAG, "No output from encoder available", null);
            return;
        }
        if (iDequeueOutputBuffer == -2) {
            startMediaMuxer(this.videoEncoder.getOutputFormat());
            return;
        }
        if (iDequeueOutputBuffer < 0) {
            YtLogger.e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null);
            return;
        }
        if (bufferInfo.size != 0) {
            ByteBuffer outputBuffer = getOutputBuffer(iDequeueOutputBuffer);
            if (outputBuffer == null) {
                YtLogger.e(TAG, "encoderOutputBuffer " + iDequeueOutputBuffer + " was null", null);
                return;
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            YtLogger.d(TAG, "media muxer write video data outputindex " + this.videoGenerateIndex);
            synchronized (this.mediaMuxer) {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, bufferInfo);
            }
            this.videoEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
    }

    public MediaCodecInfo getCodecInfo() {
        return codecInfo;
    }

    public int getColorFormat() {
        return colorFormat;
    }

    public String getSupportCodecJSONStr() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaCodecInfo mediaCodecInfo = codecInfo;
            jSONObject.put("codec_info:", mediaCodecInfo == null ? "codecInfo null" : mediaCodecInfo.getName());
            jSONObject.put("color_format:", colorFormat);
        } catch (JSONException e) {
            YtLogger.e(TAG, "video encode make json error:", e);
        }
        return jSONObject.toString();
    }

    public boolean isEncodingStarted() {
        return this.isEncodingStarted;
    }

    public void queueFrame(YTImageData yTImageData) {
        if (this.isEncodingStarted) {
            if (this.videoEncoder == null || this.mediaMuxer == null) {
                Log.d(TAG, "Failed to queue frame. Encoding not started");
                return;
            }
            YtLogger.d(TAG, "Queueing frame");
            this.videoEncodeQueue.add(yTImageData);
            synchronized (this.mFrameSync) {
                try {
                    CountDownLatch countDownLatch = this.mNewFrameLatch;
                    if (countDownLatch != null && countDownLatch.getCount() > 0) {
                        this.mNewFrameLatch.countDown();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void startEncoding(int i, int i4, File file, int i6, int i10, int i11, int i12) throws IOException {
        this.mOutputFile = file;
        file.delete();
        this.outputFileString = file.getCanonicalPath();
        String str = TAG;
        YtLogger.o(str, "found codec: " + codecInfo.getName() + "|colorFormat:" + colorFormat + "|width=" + i + "|height=" + i4 + "|videoRotation=" + i12);
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i4);
        mediaFormatCreateVideoFormat.setInteger("color-format", colorFormat);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i10);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i6);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i11);
        mediaFormatCreateVideoFormat.setInteger("width", i);
        mediaFormatCreateVideoFormat.setInteger("height", i4);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.videoEncoder = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.videoEncoder.start();
        if (this.mediaMuxer == null) {
            MediaMuxer mediaMuxer = new MediaMuxer(this.outputFileString, 0);
            this.mediaMuxer = mediaMuxer;
            mediaMuxer.setOrientationHint(i12 == 0 ? 90 : 0);
        }
        YtLogger.i(str, "Initialization complete. Starting encoder...");
        this.isEncodingStarted = true;
    }

    public void stopEncoding() {
        this.isEncodingStarted = false;
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            Log.i(TAG, "Failed to stop encoding since it never started");
            return;
        }
        YtLogger.i(TAG, "Stopping encoding");
        this.mNoMoreFrames = true;
        synchronized (this.mFrameSync) {
            try {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        release();
    }
}
