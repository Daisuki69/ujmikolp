package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.Scopes;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class AudioEncoderConfig implements EncoderConfig {

    public static abstract class Builder {
        @NonNull
        public abstract AudioEncoderConfig autoBuild();

        @NonNull
        public AudioEncoderConfig build() {
            AudioEncoderConfig audioEncoderConfigAutoBuild = autoBuild();
            if (Objects.equals(audioEncoderConfigAutoBuild.getMimeType(), MimeTypes.AUDIO_AAC) && audioEncoderConfigAutoBuild.getProfile() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return audioEncoderConfigAutoBuild;
        }

        @NonNull
        public abstract Builder setBitrate(int i);

        @NonNull
        public abstract Builder setChannelCount(int i);

        @NonNull
        public abstract Builder setInputTimebase(@NonNull Timebase timebase);

        @NonNull
        public abstract Builder setMimeType(@NonNull String str);

        @NonNull
        public abstract Builder setProfile(int i);

        @NonNull
        public abstract Builder setSampleRate(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(-1);
    }

    public abstract int getBitrate();

    public abstract int getChannelCount();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract int getSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public MediaFormat toMediaFormat() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getSampleRate(), getChannelCount());
        mediaFormatCreateAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != -1) {
            if (getMimeType().equals(MimeTypes.AUDIO_AAC)) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", getProfile());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, getProfile());
        }
        return mediaFormatCreateAudioFormat;
    }
}
