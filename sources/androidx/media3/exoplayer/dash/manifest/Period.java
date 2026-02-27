package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class Period {
    public final List<AdaptationSet> adaptationSets;

    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    @Nullable
    public final String id;
    public final long startMs;

    public Period(@Nullable String str, long j, List<AdaptationSet> list) {
        this(str, j, list, Collections.EMPTY_LIST, null);
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.adaptationSets.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.adaptationSets.get(i4).type == i) {
                return i4;
            }
        }
        return -1;
    }

    public Period(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j, list, list2, null);
    }

    public Period(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        this.id = str;
        this.startMs = j;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
