package Li;

import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.SegmentsChange;
import io.split.android.client.storage.db.SegmentDao;
import io.split.android.client.storage.db.SegmentEntity;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SegmentDao f3012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi.d f3013b;
    public final SegmentEntity.Creator c;

    public f(Gi.d dVar, SegmentDao segmentDao, SegmentEntity.Creator creator) {
        this.f3012a = segmentDao;
        Objects.requireNonNull(dVar);
        this.f3013b = dVar;
        Objects.requireNonNull(creator);
        this.c = creator;
    }

    public final void a(String str, SegmentsChange segmentsChange) {
        if (segmentsChange == null || segmentsChange.getSegments() == null) {
            return;
        }
        Gi.d dVar = this.f3013b;
        String strA = dVar.a(str);
        String strA2 = dVar.a(io.split.android.client.utils.b.f17635a.k(segmentsChange));
        if (strA == null || strA2 == null) {
            Ri.a.g(numX49.tnTj78("bjx2"));
            return;
        }
        this.f3012a.update(this.c.createEntity(strA, strA2, System.currentTimeMillis() / 1000));
    }
}
