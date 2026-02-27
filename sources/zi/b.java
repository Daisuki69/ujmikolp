package zi;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ki.C1781b;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hi.b f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1781b f21448b;
    public final AtomicInteger c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f21449d;
    public final int e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21450g;
    public final HashSet h;

    public b(int i, Hi.b bVar, int i4, long j, C1781b c1781b) {
        if (i == 0) {
            throw null;
        }
        this.f21450g = i;
        Objects.requireNonNull(bVar);
        this.f21447a = bVar;
        this.f21448b = c1781b;
        this.c = new AtomicInteger(0);
        this.f21449d = new AtomicLong(0L);
        this.e = i4;
        this.f = j;
        this.h = new HashSet();
    }

    public final void a(ki.e eVar) {
        this.h.add(new WeakReference(eVar));
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        if (AbstractC2217b.b(this.f21450g, fVar.f1581b) && AbstractC2217b.b(fVar.c, 2)) {
            AtomicInteger atomicInteger = this.c;
            Map map = (Map) fVar.f1582d;
            Object obj = map.get("NON_SENT_RECORDS");
            atomicInteger.addAndGet((obj != null ? Integer.valueOf(Integer.parseInt(obj.toString())) : null).intValue());
            AtomicLong atomicLong = this.f21449d;
            Object obj2 = map.get("NON_SENT_BYTES");
            atomicLong.addAndGet((obj2 != null ? Long.valueOf(Long.parseLong(obj2.toString())) : null).longValue());
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ki.e eVar = (ki.e) ((WeakReference) it.next()).get();
            if (eVar != null) {
                eVar.b(fVar);
            }
        }
    }

    public final boolean c(Hi.a aVar) {
        this.f21448b.l(new Bi.a(this, aVar), null);
        AtomicInteger atomicInteger = this.c;
        int iAddAndGet = atomicInteger.addAndGet(1);
        AtomicLong atomicLong = this.f21449d;
        long jAddAndGet = atomicLong.addAndGet(aVar.getSizeInBytes());
        if (iAddAndGet <= this.e && jAddAndGet < this.f) {
            return false;
        }
        atomicInteger.set(0);
        atomicLong.set(0L);
        return true;
    }
}
