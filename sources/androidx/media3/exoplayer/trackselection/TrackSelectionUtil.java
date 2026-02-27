package androidx.media3.exoplayer.trackselection;

import O1.O;
import O1.P;
import O1.S;
import O1.t0;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        t0 t0VarP;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            TrackSelection trackSelection = trackSelectionArr[i];
            if (trackSelection != null) {
                t0VarP = S.p(trackSelection);
            } else {
                P p10 = S.f4555b;
                t0VarP = t0.e;
            }
            listArr[i] = t0VarP;
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (exoTrackSelection.isTrackExcluded(i4, jElapsedRealtime)) {
                i++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z4 = false;
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z4) {
                    exoTrackSelectionArr[i] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z4 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z4, @Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z4);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z4;
        O o8 = new O(4);
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            List<? extends TrackSelection> list = listArr[i];
            for (int i4 = 0; i4 < trackGroups.length; i4++) {
                TrackGroup trackGroup = trackGroups.get(i4);
                boolean z5 = mappedTrackInfo.getAdaptiveSupport(i, i4, false) != 0;
                int i6 = trackGroup.length;
                int[] iArr = new int[i6];
                boolean[] zArr = new boolean[i6];
                for (int i10 = 0; i10 < trackGroup.length; i10++) {
                    iArr[i10] = mappedTrackInfo.getTrackSupport(i, i4, i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i11);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i10) != -1) {
                            z4 = true;
                            break;
                        }
                        i11++;
                    }
                    zArr[i10] = z4;
                }
                o8.a(new Tracks.Group(trackGroup, z5, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i12 = 0; i12 < unmappedTrackGroups.length; i12++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i12);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            o8.a(new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(o8.g());
    }
}
