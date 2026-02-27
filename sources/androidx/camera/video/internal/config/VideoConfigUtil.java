package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Preconditions;
import androidx.media3.common.MimeTypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class VideoConfigUtil {
    private static final Timebase DEFAULT_TIME_BASE;
    private static final Map<String, Map<Integer, VideoEncoderDataSpace>> MIME_TO_DATA_SPACE_MAP;
    private static final String TAG = "VideoConfigUtil";

    static {
        HashMap map = new HashMap();
        MIME_TO_DATA_SPACE_MAP = map;
        DEFAULT_TIME_BASE = Timebase.UPTIME;
        HashMap map2 = new HashMap();
        VideoEncoderDataSpace videoEncoderDataSpace = VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        map2.put(1, videoEncoderDataSpace);
        VideoEncoderDataSpace videoEncoderDataSpace2 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG;
        map2.put(2, videoEncoderDataSpace2);
        VideoEncoderDataSpace videoEncoderDataSpace3 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ;
        map2.put(4096, videoEncoderDataSpace3);
        map2.put(8192, videoEncoderDataSpace3);
        HashMap map3 = new HashMap();
        map3.put(1, videoEncoderDataSpace);
        map3.put(2, videoEncoderDataSpace2);
        map3.put(4096, videoEncoderDataSpace3);
        map3.put(8192, videoEncoderDataSpace3);
        HashMap map4 = new HashMap();
        map4.put(1, videoEncoderDataSpace);
        map4.put(4, videoEncoderDataSpace2);
        map4.put(4096, videoEncoderDataSpace3);
        map4.put(16384, videoEncoderDataSpace3);
        map4.put(2, videoEncoderDataSpace);
        map4.put(8, videoEncoderDataSpace2);
        map4.put(8192, videoEncoderDataSpace3);
        map4.put(32768, videoEncoderDataSpace3);
        HashMap map5 = new HashMap();
        map5.put(256, videoEncoderDataSpace2);
        map5.put(512, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709);
        map.put(MimeTypes.VIDEO_H265, map2);
        map.put(MimeTypes.VIDEO_AV1, map3);
        map.put(MimeTypes.VIDEO_VP9, map4);
        map.put(MimeTypes.VIDEO_DOLBY_VISION, map5);
    }

    private VideoConfigUtil() {
    }

    @NonNull
    private static String getDynamicRangeDefaultMime(@NonNull DynamicRange dynamicRange) {
        int encoding = dynamicRange.getEncoding();
        if (encoding == 1) {
            return "video/avc";
        }
        if (encoding == 3 || encoding == 4 || encoding == 5) {
            return MimeTypes.VIDEO_H265;
        }
        if (encoding == 6) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
    }

    @NonNull
    public static VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(@NonNull String str, int i) {
        VideoEncoderDataSpace videoEncoderDataSpace;
        Map<Integer, VideoEncoderDataSpace> map = MIME_TO_DATA_SPACE_MAP.get(str);
        if (map != null && (videoEncoderDataSpace = map.get(Integer.valueOf(i))) != null) {
            return videoEncoderDataSpace;
        }
        Logger.w(TAG, String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
    }

    @NonNull
    public static VideoEncoderConfig resolveVideoEncoderConfig(@NonNull VideoMimeInfo videoMimeInfo, @NonNull Timebase timebase, @NonNull VideoSpec videoSpec, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile = videoMimeInfo.getCompatibleVideoProfile();
        return (VideoEncoderConfig) (compatibleVideoProfile != null ? new VideoEncoderConfigVideoProfileResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, compatibleVideoProfile, dynamicRange, range) : new VideoEncoderConfigDefaultResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, dynamicRange, range)).get();
    }

    @NonNull
    public static VideoMimeInfo resolveVideoMimeInfo(@NonNull MediaSpec mediaSpec, @NonNull DynamicRange dynamicRange, @Nullable VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy next;
        Preconditions.checkState(dynamicRange.isFullySpecified(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + "]");
        String strOutputFormatToVideoMime = MediaSpec.outputFormatToVideoMime(mediaSpec.getOutputFormat());
        if (videoValidatedEncoderProfilesProxy != null) {
            Set<Integer> setDynamicRangeToVideoProfileHdrFormats = DynamicRangeUtil.dynamicRangeToVideoProfileHdrFormats(dynamicRange);
            Set<Integer> setDynamicRangeToVideoProfileBitDepth = DynamicRangeUtil.dynamicRangeToVideoProfileBitDepth(dynamicRange);
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = videoValidatedEncoderProfilesProxy.getVideoProfiles().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (setDynamicRangeToVideoProfileHdrFormats.contains(Integer.valueOf(next.getHdrFormat())) && setDynamicRangeToVideoProfileBitDepth.contains(Integer.valueOf(next.getBitDepth()))) {
                    String mediaType = next.getMediaType();
                    if (Objects.equals(strOutputFormatToVideoMime, mediaType)) {
                        Logger.d(TAG, "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + "]");
                    } else if (mediaSpec.getOutputFormat() == -1) {
                        Logger.d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
                    }
                    strOutputFormatToVideoMime = mediaType;
                    break;
                }
            }
            next = null;
        } else {
            next = null;
        }
        if (next == null) {
            if (mediaSpec.getOutputFormat() == -1) {
                strOutputFormatToVideoMime = getDynamicRangeDefaultMime(dynamicRange);
            }
            if (videoValidatedEncoderProfilesProxy == null) {
                Logger.d(TAG, "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
            } else {
                Logger.d(TAG, "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
            }
        }
        VideoMimeInfo.Builder builder = VideoMimeInfo.builder(strOutputFormatToVideoMime);
        if (next != null) {
            builder.setCompatibleVideoProfile(next);
        }
        return builder.build();
    }

    public static int scaleAndClampBitrate(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, @NonNull Range<Integer> range) {
        Rational rational = new Rational(i4, i6);
        Rational rational2 = new Rational(i10, i11);
        int iDoubleValue = (int) (new Rational(i14, i15).doubleValue() * new Rational(i12, i13).doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i));
        String strConcat = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(iDoubleValue)) : "";
        if (!VideoSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            iDoubleValue = iIntValue;
        }
        Logger.d(TAG, strConcat);
        return iDoubleValue;
    }

    @NonNull
    public static VideoEncoderConfig toVideoEncoderConfig(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        return VideoEncoderConfig.builder().setMimeType(videoProfileProxy.getMediaType()).setProfile(videoProfileProxy.getProfile()).setResolution(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())).setFrameRate(videoProfileProxy.getFrameRate()).setBitrate(videoProfileProxy.getBitrate()).setInputTimebase(DEFAULT_TIME_BASE).build();
    }
}
