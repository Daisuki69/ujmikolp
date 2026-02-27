package Mi;

import Q6.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f3411b;
    public final f c;

    public c(a aVar, n nVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f3410a = concurrentHashMap;
        this.f3411b = nVar;
        this.c = new f(aVar, concurrentHashMap, new AtomicLong(-1L));
    }

    @Override // Mi.d
    public final long a() {
        return this.c.c.get();
    }

    @Override // Mi.d
    public final synchronized boolean c(HashSet hashSet, HashSet hashSet2, long j, ExecutorService executorService) {
        return this.c.c(hashSet, hashSet2, j, null);
    }

    @Override // Fi.a
    public final void clear() {
        this.c.clear();
    }

    @Override // Fi.a
    public final synchronized void m() {
        this.c.m();
    }

    public final boolean n(Set set) {
        if (set == null) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!this.f3410a.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
