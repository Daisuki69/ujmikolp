package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class MappingTrackSelector extends TrackSelector {

    @Nullable
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup, int[] iArr, boolean z4) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i = 0;
        boolean z5 = true;
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i4];
            int iMax = 0;
            for (int i6 = 0; i6 < trackGroup.length; i6++) {
                iMax = Math.max(iMax, K.k(rendererCapabilities.supportsFormat(trackGroup.getFormat(i6))));
            }
            boolean z8 = iArr[i4] == 0;
            if (iMax > i || (iMax == i && z4 && !z5 && z8)) {
                length = i4;
                z5 = z8;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i = 0; i < trackGroup.length; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rendererCapabilitiesArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Nullable
    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void onSelectionActivated(@Nullable Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i4 = trackGroupArray.length;
            trackGroupArr[i] = new TrackGroup[i4];
            iArr2[i] = new int[i4][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i6 = 0; i6 < trackGroupArray.length; i6++) {
            TrackGroup trackGroup = trackGroupArray.get(i6);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, trackGroup.type == 5);
            int[] formatSupport = iFindRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[iFindRenderer], trackGroup);
            int i10 = iArr[iFindRenderer];
            trackGroupArr[iFindRenderer][i10] = trackGroup;
            iArr2[iFindRenderer][i10] = formatSupport;
            iArr[iFindRenderer] = i10 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i11 = 0; i11 < rendererCapabilitiesArr.length; i11++) {
            int i12 = iArr[i11];
            trackGroupArrayArr[i11] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i11], i12));
            iArr2[i11] = (int[][]) Util.nullSafeArrayCopy(iArr2[i11], i12);
            strArr[i11] = rendererCapabilitiesArr[i11].getName();
            iArr3[i11] = rendererCapabilitiesArr[i11].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (ExoTrackSelection[]) pairSelectTracks.second, TrackSelectionUtil.buildTracks(mappedTrackInfo, (TrackSelection[]) pairSelectTracks.second), mappedTrackInfo);
    }

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        @VisibleForTesting
        public MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i, int i4, boolean z4) {
            int i6 = this.rendererTrackGroups[i].get(i4).length;
            int[] iArr = new int[i6];
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                int trackSupport = getTrackSupport(i, i4, i11);
                if (trackSupport == 4 || (z4 && trackSupport == 3)) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            return getAdaptiveSupport(i, i4, Arrays.copyOf(iArr, i10));
        }

        public int getCapabilities(int i, int i4, int i6) {
            return this.rendererFormatSupports[i][i4][i6];
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i) {
            return this.rendererNames[i];
        }

        public int getRendererSupport(int i) {
            int iMax = 0;
            for (int[] iArr : this.rendererFormatSupports[i]) {
                for (int i4 : iArr) {
                    int iK = K.k(i4);
                    int i6 = 1;
                    if (iK != 0 && iK != 1 && iK != 2) {
                        if (iK != 3) {
                            if (iK == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i6 = 2;
                    }
                    iMax = Math.max(iMax, i6);
                }
            }
            return iMax;
        }

        public int getRendererType(int i) {
            return this.rendererTrackTypes[i];
        }

        public TrackGroupArray getTrackGroups(int i) {
            return this.rendererTrackGroups[i];
        }

        public int getTrackSupport(int i, int i4, int i6) {
            return K.k(getCapabilities(i, i4, i6));
        }

        public int getTypeSupport(int i) {
            int iMax = 0;
            for (int i4 = 0; i4 < this.rendererCount; i4++) {
                if (this.rendererTrackTypes[i4] == i) {
                    iMax = Math.max(iMax, getRendererSupport(i4));
                }
            }
            return iMax;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i, int i4, int[] iArr) {
            int i6 = 0;
            int iMin = 16;
            String str = null;
            boolean z4 = false;
            int i10 = 0;
            while (i6 < iArr.length) {
                String str2 = this.rendererTrackGroups[i].get(i4).getFormat(iArr[i6]).sampleMimeType;
                int i11 = i10 + 1;
                if (i10 == 0) {
                    str = str2;
                } else {
                    z4 |= !Util.areEqual(str, str2);
                }
                iMin = Math.min(iMin, K.h(this.rendererFormatSupports[i][i4][i6]));
                i6++;
                i10 = i11;
            }
            return z4 ? Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i]) : iMin;
        }
    }
}
