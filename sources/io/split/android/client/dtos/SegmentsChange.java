package io.split.android.client.dtos;

import androidx.annotation.Nullable;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SegmentsChange {

    @InterfaceC1498b("cn")
    private Long mChangeNumber;

    @InterfaceC1498b("k")
    private Set<Segment> mSegments;

    public SegmentsChange(Set<Segment> set, Long l6) {
        this.mSegments = set;
        this.mChangeNumber = l6;
    }

    @Nullable
    public static SegmentsChange create(Set<String> set, long j) {
        if (set == null) {
            return null;
        }
        return create(set, Long.valueOf(j));
    }

    public static SegmentsChange createEmpty() {
        return new SegmentsChange(Collections.EMPTY_SET, null);
    }

    @Nullable
    public Long getChangeNumber() {
        return this.mChangeNumber;
    }

    public List<String> getNames() {
        HashSet hashSet = new HashSet(getSegments());
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Segment) it.next()).getName());
        }
        return arrayList;
    }

    public Set<Segment> getSegments() {
        Set<Segment> set = this.mSegments;
        return set == null ? Collections.EMPTY_SET : set;
    }

    public static SegmentsChange create(Set<String> set, @Nullable Long l6) {
        if (set == null) {
            return createEmpty();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            Segment segment = new Segment();
            segment.setName(str);
            hashSet.add(segment);
        }
        return new SegmentsChange(hashSet, l6);
    }
}
