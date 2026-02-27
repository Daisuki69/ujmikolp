package androidx.camera.video.internal.audio;

import M8.RunnableC0350e1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class AudioStreamImpl implements AudioStream {
    private static final long DIFF_LIMIT_FROM_SYSTEM_TIME_NS = TimeUnit.MILLISECONDS.toNanos(500);
    private static final String TAG = "AudioStreamImpl";

    @NonNull
    private AudioRecord mAudioRecord;

    @Nullable
    private AudioManager$AudioRecordingCallback mAudioRecordingCallback;

    @Nullable
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;

    @Nullable
    private Executor mCallbackExecutor;
    private final AudioSettings mSettings;
    private long mTotalFramesRead;
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicReference<Boolean> mNotifiedSilenceState = new AtomicReference<>(null);
    private boolean mShouldFallbackToSystemTime = false;

    @RequiresApi(29)
    public class AudioRecordingApi29Callback extends AudioManager$AudioRecordingCallback {
        public AudioRecordingApi29Callback() {
        }

        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Iterator<AudioRecordingConfiguration> it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfigurationL = Ue.b.l(it.next());
                if (Api24Impl.getClientAudioSessionId(audioRecordingConfigurationL) == AudioStreamImpl.this.mAudioRecord.getAudioSessionId()) {
                    AudioStreamImpl.this.notifySilenced(Api29Impl.isClientSilenced(audioRecordingConfigurationL));
                    return;
                }
            }
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(@NonNull AudioSettings audioSettings, @Nullable Context context) throws AudioStream.AudioStreamException, IllegalArgumentException {
        if (!isSettingsSupported(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
        }
        this.mSettings = audioSettings;
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        int minBufferSize = getMinBufferSize(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
        Preconditions.checkState(minBufferSize > 0);
        int i = minBufferSize * 2;
        this.mBufferSize = i;
        AudioRecord audioRecordCreateAudioRecord = createAudioRecord(i, audioSettings, context);
        this.mAudioRecord = audioRecordCreateAudioRecord;
        checkAudioRecordInitialStateOrReleaseAndThrow(audioRecordCreateAudioRecord);
    }

    private static void checkAudioRecordInitialStateOrReleaseAndThrow(@NonNull AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    private static AudioRecord createAudioRecord(int i, @NonNull AudioSettings audioSettings, @Nullable Context context) {
        int i4 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(audioSettings.getSampleRate()).setChannelMask(AudioUtils.channelCountToChannelMask(audioSettings.getChannelCount())).setEncoding(audioSettings.getAudioFormat()).build();
        AudioRecord.Builder builderCreateAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
        if (i4 >= 31 && context != null) {
            Api31Impl.setContext(builderCreateAudioRecordBuilder, context);
        }
        Api23Impl.setAudioSource(builderCreateAudioRecordBuilder, audioSettings.getAudioSource());
        Api23Impl.setAudioFormat(builderCreateAudioRecordBuilder, audioFormatBuild);
        Api23Impl.setBufferSizeInBytes(builderCreateAudioRecordBuilder, i);
        return Api23Impl.build(builderCreateAudioRecordBuilder);
    }

    private long generatePresentationTimeNs() {
        long jComputeInterpolatedTimeNs;
        if (Build.VERSION.SDK_INT < 24 || this.mShouldFallbackToSystemTime) {
            jComputeInterpolatedTimeNs = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
                jComputeInterpolatedTimeNs = AudioUtils.computeInterpolatedTimeNs(this.mSettings.getSampleRate(), this.mTotalFramesRead, audioTimestamp);
                if (Math.abs(jComputeInterpolatedTimeNs - System.nanoTime()) > DIFF_LIMIT_FROM_SYSTEM_TIME_NS) {
                    this.mShouldFallbackToSystemTime = true;
                }
            } else {
                Logger.w(TAG, "Unable to get audio timestamp");
            }
            jComputeInterpolatedTimeNs = -1;
        }
        return jComputeInterpolatedTimeNs == -1 ? System.nanoTime() : jComputeInterpolatedTimeNs;
    }

    private static int getMinBufferSize(int i, int i4, int i6) {
        return AudioRecord.getMinBufferSize(i, AudioUtils.channelCountToChannelConfig(i4), i6);
    }

    private static boolean hasAudioTimestampQuirk() {
        return DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean isSettingsSupported(int i, int i4, int i6) {
        return i > 0 && i4 > 0 && getMinBufferSize(i, i4, i6) > 0;
    }

    public void notifySilenced(boolean z4) {
        Executor executor = this.mCallbackExecutor;
        AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        if (executor == null || audioStreamCallback == null || Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z4)), Boolean.valueOf(z4))) {
            return;
        }
        executor.execute(new RunnableC0350e1(audioStreamCallback, z4, 2));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        long jGeneratePresentationTimeNs;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        int i = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (i > 0) {
            byteBuffer.limit(i);
            jGeneratePresentationTimeNs = generatePresentationTimeNs();
            this.mTotalFramesRead = AudioUtils.sizeToFrameCount(i, this.mBytesPerFrame) + this.mTotalFramesRead;
        } else {
            jGeneratePresentationTimeNs = 0;
        }
        return AudioStream.PacketInfo.of(i, jGeneratePresentationTimeNs);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback;
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioManager$AudioRecordingCallback = this.mAudioRecordingCallback) != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioManager$AudioRecordingCallback);
        }
        this.mAudioRecord.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z4 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = this.mAudioRecordingCallback;
            if (audioManager$AudioRecordingCallback != null) {
                Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioManager$AudioRecordingCallback);
            }
            if (audioStreamCallback == null) {
                return;
            }
            if (this.mAudioRecordingCallback == null) {
                this.mAudioRecordingCallback = new AudioRecordingApi29Callback();
            }
            Api29Impl.registerAudioRecordingCallback(this.mAudioRecord, executor, this.mAudioRecordingCallback);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        if (hasAudioTimestampQuirk()) {
            checkAudioRecordInitialStateOrReleaseAndThrow(this.mAudioRecord);
        }
        this.mAudioRecord.startRecording();
        boolean z4 = false;
        if (this.mAudioRecord.getRecordingState() != 3) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
        }
        this.mTotalFramesRead = 0L;
        this.mShouldFallbackToSystemTime = false;
        this.mNotifiedSilenceState.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.mAudioRecord);
            z4 = activeRecordingConfiguration != null && Api29Impl.isClientSilenced(activeRecordingConfiguration);
        }
        notifySilenced(z4);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public void stop() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mAudioRecord.stop();
            if (this.mAudioRecord.getRecordingState() != 1) {
                Logger.w(TAG, "Failed to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            if (hasAudioTimestampQuirk()) {
                this.mAudioRecord.release();
                this.mAudioRecord = createAudioRecord(this.mBufferSize, this.mSettings, null);
            }
        }
    }
}
