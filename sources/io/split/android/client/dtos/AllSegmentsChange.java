package io.split.android.client.dtos;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import g3.InterfaceC1498b;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AllSegmentsChange {

    @InterfaceC1498b("ls")
    private SegmentsChange mMyLargeSegmentsChange;

    @InterfaceC1498b("ms")
    private SegmentsChange mMySegmentsChange;

    public AllSegmentsChange() {
    }

    @VisibleForTesting
    public static AllSegmentsChange create(SegmentsChange segmentsChange, SegmentsChange segmentsChange2) {
        AllSegmentsChange allSegmentsChange = new AllSegmentsChange();
        allSegmentsChange.mMySegmentsChange = segmentsChange;
        allSegmentsChange.mMyLargeSegmentsChange = segmentsChange2;
        return allSegmentsChange;
    }

    @Nullable
    public SegmentsChange getLargeSegmentsChange() {
        return this.mMyLargeSegmentsChange;
    }

    @Nullable
    public SegmentsChange getSegmentsChange() {
        return this.mMySegmentsChange;
    }

    @Deprecated
    public AllSegmentsChange(List<String> list) {
        HashSet hashSet = new HashSet();
        for (String str : list) {
            Segment segment = new Segment();
            segment.setName(str);
            hashSet.add(segment);
        }
        this.mMySegmentsChange = new SegmentsChange(hashSet, null);
    }
}
