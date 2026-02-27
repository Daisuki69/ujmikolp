package ph;

import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: ph.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131v extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f19656b;
    public final ch.p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh.n f19657d;
    public volatile boolean h;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f19659k;
    public final rh.c i = new rh.c(ch.l.bufferSize());
    public final C1485a e = new C1485a(0);
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedHashMap f19660l = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qh.c f19658g = new Qh.c();

    public C2131v(ch.r rVar, ch.p pVar, hh.n nVar, Callable callable) {
        this.f19655a = rVar;
        this.f19656b = callable;
        this.c = pVar;
        this.f19657d = nVar;
    }

    public final void a(C2135w c2135w, long j) {
        boolean z4;
        this.e.c(c2135w);
        if (this.e.h() == 0) {
            EnumC1604b.a(this.f);
            z4 = true;
        } else {
            z4 = false;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f19660l;
                if (linkedHashMap == null) {
                    return;
                }
                this.i.offer(linkedHashMap.remove(Long.valueOf(j)));
                if (z4) {
                    this.h = true;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = this.f19655a;
        rh.c cVar = this.i;
        int iAddAndGet = 1;
        while (!this.j) {
            boolean z4 = this.h;
            if (z4 && this.f19658g.get() != null) {
                cVar.clear();
                Qh.c cVar2 = this.f19658g;
                cVar2.getClass();
                rVar.onError(AbstractC2353d.b(cVar2));
                return;
            }
            Collection collection = (Collection) cVar.poll();
            boolean z5 = collection == null;
            if (z4 && z5) {
                rVar.onComplete();
                return;
            } else if (z5) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                rVar.onNext(collection);
            }
        }
        cVar.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (EnumC1604b.a(this.f)) {
            this.j = true;
            this.e.dispose();
            synchronized (this) {
                this.f19660l = null;
            }
            if (getAndIncrement() != 0) {
                this.i.clear();
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.e.dispose();
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f19660l;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    this.i.offer((Collection) it.next());
                }
                this.f19660l = null;
                this.h = true;
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Qh.c cVar = this.f19658g;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
            return;
        }
        this.e.dispose();
        synchronized (this) {
            this.f19660l = null;
        }
        this.h = true;
        b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f19660l;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this.f, interfaceC1486b)) {
            C2127u c2127u = new C2127u(this);
            this.e.a(c2127u);
            this.c.subscribe(c2127u);
        }
    }
}
