package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CapabilitiesByQuality {
    private static final String TAG = "CapabilitiesByQuality";
    private final VideoValidatedEncoderProfilesProxy mHighestProfiles;
    private final VideoValidatedEncoderProfilesProxy mLowestProfiles;
    private final Map<Quality, VideoValidatedEncoderProfilesProxy> mSupportedProfilesMap = new LinkedHashMap();
    private final TreeMap<Size, Quality> mAreaSortedSizeToQualityMap = new TreeMap<>(new CompareSizesByArea());

    public CapabilitiesByQuality(@NonNull EncoderProfilesProvider encoderProfilesProvider) {
        for (Quality quality : Quality.getSortedQualities()) {
            EncoderProfilesProxy encoderProfiles = getEncoderProfiles(quality, encoderProfilesProvider);
            if (encoderProfiles != null) {
                Logger.d(TAG, "profiles = " + encoderProfiles);
                VideoValidatedEncoderProfilesProxy validatedProfiles = toValidatedProfiles(encoderProfiles);
                if (validatedProfiles == null) {
                    Logger.w(TAG, "EncoderProfiles of quality " + quality + " has no video validated profiles.");
                } else {
                    EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = validatedProfiles.getDefaultVideoProfile();
                    this.mAreaSortedSizeToQualityMap.put(new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight()), quality);
                    this.mSupportedProfilesMap.put(quality, validatedProfiles);
                }
            }
        }
        if (this.mSupportedProfilesMap.isEmpty()) {
            Logger.e(TAG, "No supported EncoderProfiles");
            this.mLowestProfiles = null;
            this.mHighestProfiles = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.mSupportedProfilesMap.values());
            this.mHighestProfiles = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.mLowestProfiles = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }
    }

    private static void checkQualityConstantsOrThrow(@NonNull Quality quality) {
        Preconditions.checkArgument(Quality.containsQuality(quality), "Unknown quality: " + quality);
    }

    @Nullable
    private EncoderProfilesProxy getEncoderProfiles(@NonNull Quality quality, @NonNull EncoderProfilesProvider encoderProfilesProvider) {
        Preconditions.checkState(quality instanceof Quality.ConstantQuality, "Currently only support ConstantQuality");
        return encoderProfilesProvider.getAll(((Quality.ConstantQuality) quality).getValue());
    }

    @Nullable
    private VideoValidatedEncoderProfilesProxy toValidatedProfiles(@NonNull EncoderProfilesProxy encoderProfilesProxy) {
        if (encoderProfilesProxy.getVideoProfiles().isEmpty()) {
            return null;
        }
        return VideoValidatedEncoderProfilesProxy.from(encoderProfilesProxy);
    }

    @Nullable
    public VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(@NonNull Size size) {
        Quality qualityFindNearestHigherSupportedQualityFor = findNearestHigherSupportedQualityFor(size);
        Logger.d(TAG, "Using supported quality of " + qualityFindNearestHigherSupportedQualityFor + " for size " + size);
        if (qualityFindNearestHigherSupportedQualityFor == Quality.NONE) {
            return null;
        }
        VideoValidatedEncoderProfilesProxy profiles = getProfiles(qualityFindNearestHigherSupportedQualityFor);
        if (profiles != null) {
            return profiles;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @NonNull
    public Quality findNearestHigherSupportedQualityFor(@NonNull Size size) {
        Quality quality = (Quality) SizeUtil.findNearestHigherFor(size, this.mAreaSortedSizeToQualityMap);
        return quality != null ? quality : Quality.NONE;
    }

    @Nullable
    public VideoValidatedEncoderProfilesProxy getProfiles(@NonNull Quality quality) {
        checkQualityConstantsOrThrow(quality);
        return quality == Quality.HIGHEST ? this.mHighestProfiles : quality == Quality.LOWEST ? this.mLowestProfiles : this.mSupportedProfilesMap.get(quality);
    }

    @NonNull
    public List<Quality> getSupportedQualities() {
        return new ArrayList(this.mSupportedProfilesMap.keySet());
    }

    public boolean isQualitySupported(@NonNull Quality quality) {
        checkQualityConstantsOrThrow(quality);
        return getProfiles(quality) != null;
    }
}
