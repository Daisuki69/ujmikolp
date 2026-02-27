package Mi;

import S1.v;
import com.google.firebase.messaging.r;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3416b;
    public final AtomicLong c;

    public f(a aVar, ConcurrentHashMap concurrentHashMap, AtomicLong atomicLong) {
        Objects.requireNonNull(aVar);
        this.f3416b = aVar;
        this.f3415a = concurrentHashMap;
        this.c = atomicLong;
    }

    @Override // Mi.d
    public final long a() {
        return this.c.get();
    }

    @Override // Mi.d
    public final boolean c(HashSet hashSet, HashSet hashSet2, long j, ExecutorService executorService) {
        boolean z4;
        ConcurrentHashMap concurrentHashMap = this.f3415a;
        if (hashSet.isEmpty()) {
            z4 = false;
        } else {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                RuleBasedSegment ruleBasedSegment = (RuleBasedSegment) it.next();
                concurrentHashMap.put(ruleBasedSegment.getName(), ruleBasedSegment);
            }
            z4 = true;
        }
        boolean z5 = z4;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                concurrentHashMap.remove(((RuleBasedSegment) it2.next()).getName());
            }
        }
        this.c.set(j);
        if ((hashSet.size() > 50 || hashSet2.size() > 50) && executorService != null) {
            executorService.submit(new e(this, new HashSet(hashSet), new HashSet(hashSet2), j));
            return z5;
        }
        r rVar = (r) this.f3416b;
        ((SplitRoomDatabase) rVar.c).runInTransaction(new h((Gi.d) rVar.e, (RuleBasedSegmentDao) rVar.f9803b, (Ji.a) rVar.f9804d, hashSet, hashSet2, j));
        return z5;
    }

    @Override // Fi.a
    public final void clear() {
        this.f3415a.clear();
        this.c.set(-1L);
        r rVar = (r) this.f3416b;
        ((SplitRoomDatabase) rVar.c).runInTransaction(new v((RuleBasedSegmentDao) rVar.f9803b, (Ji.a) rVar.f9804d));
    }

    @Override // Fi.a
    public final void m() {
        r rVar = (r) this.f3416b;
        b bVar = (b) ((SplitRoomDatabase) rVar.c).runInTransaction(new g((RuleBasedSegmentDao) rVar.f9803b, (Gi.d) rVar.e, (Ji.a) rVar.f9804d));
        HashMap map = bVar.f3408a;
        this.c.set(bVar.f3409b);
        this.f3415a.putAll(map);
    }
}
