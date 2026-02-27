package Mi;

import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gi.d f3420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ji.a f3421b;
    public final RuleBasedSegmentDao c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3422d;
    public final Set e;
    public final long f;

    public h(Gi.d dVar, RuleBasedSegmentDao ruleBasedSegmentDao, Ji.a aVar, Set set, Set set2, long j) {
        Objects.requireNonNull(dVar);
        this.f3420a = dVar;
        Objects.requireNonNull(ruleBasedSegmentDao);
        this.c = ruleBasedSegmentDao;
        Objects.requireNonNull(aVar);
        this.f3421b = aVar;
        this.f3422d = set;
        this.e = set2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Gi.d dVar;
        RuleBasedSegmentDao ruleBasedSegmentDao = this.c;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.e.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                dVar = this.f3420a;
                if (!zHasNext) {
                    break;
                }
                String strA = dVar.a(((RuleBasedSegment) it.next()).getName());
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (RuleBasedSegment ruleBasedSegment : this.f3422d) {
                if (ruleBasedSegment != null) {
                    try {
                        String strA2 = dVar.a(ruleBasedSegment.getName());
                        String strA3 = dVar.a(io.split.android.client.utils.b.f17635a.k(ruleBasedSegment));
                        if (strA2 != null && strA3 != null) {
                            arrayList2.add(new RuleBasedSegmentEntity(strA2, strA3, System.currentTimeMillis()));
                        }
                    } catch (Exception e) {
                        Ri.a.g("Error parsing RBS with name " + ruleBasedSegment.getName() + ": " + e.getLocalizedMessage());
                    }
                }
            }
            ruleBasedSegmentDao.delete(arrayList);
            ruleBasedSegmentDao.insert(arrayList2);
            Ji.a aVar = this.f3421b;
            long j = this.f;
            A7.f fVar = (A7.f) aVar;
            fVar.getClass();
            ((GeneralInfoDao) fVar.f210b).update(new GeneralInfoEntity("rbsChangeNumber", j));
        } catch (Exception e7) {
            AbstractC1414e.o(e7, new StringBuilder(numX49.tnTj78("bd2P")));
            throw e7;
        }
    }
}
