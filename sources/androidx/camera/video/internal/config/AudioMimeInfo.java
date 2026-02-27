package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AutoValue_AudioMimeInfo;
import androidx.camera.video.internal.config.MimeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class AudioMimeInfo extends MimeInfo {

    public static abstract class Builder extends MimeInfo.Builder<Builder> {
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        @NonNull
        public abstract AudioMimeInfo build();

        @NonNull
        public abstract Builder setCompatibleAudioProfile(@Nullable EncoderProfilesProxy.AudioProfileProxy audioProfileProxy);
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new AutoValue_AudioMimeInfo.Builder().setMimeType(str).setProfile(-1);
    }

    @Nullable
    public abstract EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile();
}
