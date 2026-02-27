package Li;

import bg.AbstractC0983W;
import com.google.gson.JsonParseException;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.Segment;
import io.split.android.client.dtos.SegmentsChange;
import io.split.android.client.storage.db.SegmentEntity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3010b;
    public final Set c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f3011d;

    public e(String str, f fVar) {
        Objects.requireNonNull(fVar);
        this.f3010b = fVar;
        Objects.requireNonNull(str);
        this.f3009a = str;
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f3011d = new AtomicLong(-1L);
    }

    public static Set n(Set set) {
        if (set == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((Segment) it.next()).getName());
        }
        return hashSet;
    }

    @Override // Li.b
    public final long a() {
        return this.f3011d.get();
    }

    @Override // Fi.a
    public final void clear() {
        this.c.clear();
        this.f3011d.set(-1L);
        this.f3010b.a(this.f3009a, SegmentsChange.createEmpty());
    }

    @Override // Li.b
    public final Set getAll() {
        return this.c;
    }

    @Override // Li.b
    public final void j(SegmentsChange segmentsChange) {
        if (segmentsChange == null) {
            return;
        }
        Set set = this.c;
        set.clear();
        set.addAll(n(segmentsChange.getSegments()));
        AtomicLong atomicLong = this.f3011d;
        Long changeNumber = segmentsChange.getChangeNumber();
        atomicLong.set(changeNumber == null ? -1L : changeNumber.longValue());
        this.f3010b.a(this.f3009a, segmentsChange);
    }

    @Override // Fi.a
    public final void m() {
        SegmentsChange segmentsChangeCreateEmpty;
        String strR;
        f fVar = this.f3010b;
        Gi.d dVar = fVar.f3013b;
        SegmentEntity segmentEntity = (SegmentEntity) fVar.f3012a.getByUserKey(dVar.a(this.f3009a));
        if (segmentEntity == null || AbstractC0983W.q(segmentEntity.getSegmentList()) || (strR = dVar.r(segmentEntity.getSegmentList())) == null) {
            segmentsChangeCreateEmpty = SegmentsChange.createEmpty();
        } else {
            try {
                segmentsChangeCreateEmpty = (SegmentsChange) io.split.android.client.utils.b.f17635a.e(strR, SegmentsChange.class);
            } catch (JsonParseException | NullPointerException unused) {
                Ri.a.p(numX49.tnTj78("bjxP"));
                segmentsChangeCreateEmpty = SegmentsChange.create(new HashSet(Arrays.asList(strR.split(numX49.tnTj78("bjxb")))), (Long) null);
            }
        }
        this.c.addAll(n(segmentsChangeCreateEmpty.getSegments()));
        AtomicLong atomicLong = this.f3011d;
        Long changeNumber = segmentsChangeCreateEmpty.getChangeNumber();
        atomicLong.set(changeNumber == null ? -1L : changeNumber.longValue());
    }
}
