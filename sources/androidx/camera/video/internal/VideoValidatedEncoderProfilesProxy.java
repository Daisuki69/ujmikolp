package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    @NonNull
    public static VideoValidatedEncoderProfilesProxy create(int i, int i4, @NonNull List<EncoderProfilesProxy.AudioProfileProxy> list, @NonNull List<EncoderProfilesProxy.VideoProfileProxy> list2) {
        Preconditions.checkArgument(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new AutoValue_VideoValidatedEncoderProfilesProxy(i, i4, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    @NonNull
    public static VideoValidatedEncoderProfilesProxy from(@NonNull EncoderProfilesProxy encoderProfilesProxy) {
        return create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), encoderProfilesProxy.getVideoProfiles());
    }

    @Nullable
    public abstract EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile();

    @NonNull
    public abstract EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile();
}
