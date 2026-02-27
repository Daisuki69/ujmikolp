package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class DynamicRangeConversions {
    private static final Map<DynamicRange, List<Long>> DR_TO_PROFILE_MAP;
    private static final Map<Long, DynamicRange> PROFILE_TO_DR_MAP;

    static {
        HashMap map = new HashMap();
        PROFILE_TO_DR_MAP = map;
        HashMap map2 = new HashMap();
        DR_TO_PROFILE_MAP = map2;
        DynamicRange dynamicRange = DynamicRange.SDR;
        map.put(1L, dynamicRange);
        map2.put(dynamicRange, Collections.singletonList(1L));
        map.put(2L, DynamicRange.HLG_10_BIT);
        map2.put((DynamicRange) map.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange2 = DynamicRange.HDR10_10_BIT;
        map.put(4L, dynamicRange2);
        map2.put(dynamicRange2, Collections.singletonList(4L));
        DynamicRange dynamicRange3 = DynamicRange.HDR10_PLUS_10_BIT;
        map.put(8L, dynamicRange3);
        map2.put(dynamicRange3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            PROFILE_TO_DR_MAP.put(it.next(), DynamicRange.DOLBY_VISION_10_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_10_BIT, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            PROFILE_TO_DR_MAP.put(it2.next(), DynamicRange.DOLBY_VISION_8_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_8_BIT, listAsList2);
    }

    private DynamicRangeConversions() {
    }

    @Nullable
    public static Long dynamicRangeToFirstSupportedProfile(@NonNull DynamicRange dynamicRange, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l6 : list) {
            if (supportedProfiles.contains(l6)) {
                return l6;
            }
        }
        return null;
    }

    @Nullable
    public static DynamicRange profileToDynamicRange(long j) {
        return PROFILE_TO_DR_MAP.get(Long.valueOf(j));
    }
}
