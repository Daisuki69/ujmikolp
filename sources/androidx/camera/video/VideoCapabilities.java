package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface VideoCapabilities {

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final VideoCapabilities EMPTY = new VideoCapabilities() { // from class: androidx.camera.video.VideoCapabilities.1
        @Override // androidx.camera.video.VideoCapabilities
        public final /* synthetic */ VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
            return AbstractC0748r.a(this, size, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        public final /* synthetic */ Quality findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
            return AbstractC0748r.b(this, size, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        public final /* synthetic */ VideoValidatedEncoderProfilesProxy getProfiles(Quality quality, DynamicRange dynamicRange) {
            return AbstractC0748r.c(this, quality, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        @NonNull
        public Set<DynamicRange> getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        @NonNull
        public List<Quality> getSupportedQualities(@NonNull DynamicRange dynamicRange) {
            return new ArrayList();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public boolean isQualitySupported(@NonNull Quality quality, @NonNull DynamicRange dynamicRange) {
            return false;
        }

        @Override // androidx.camera.video.VideoCapabilities
        public boolean isStabilizationSupported() {
            return false;
        }
    };

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(@NonNull Size size, @NonNull DynamicRange dynamicRange);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    Quality findNearestHigherSupportedQualityFor(@NonNull Size size, @NonNull DynamicRange dynamicRange);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    VideoValidatedEncoderProfilesProxy getProfiles(@NonNull Quality quality, @NonNull DynamicRange dynamicRange);

    @NonNull
    Set<DynamicRange> getSupportedDynamicRanges();

    @NonNull
    List<Quality> getSupportedQualities(@NonNull DynamicRange dynamicRange);

    boolean isQualitySupported(@NonNull Quality quality, @NonNull DynamicRange dynamicRange);

    boolean isStabilizationSupported();
}
