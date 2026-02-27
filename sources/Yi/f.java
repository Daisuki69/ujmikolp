package yi;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ki.AbstractC1780a;
import ki.InterfaceC1782c;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1780a f21297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.split.android.client.service.sseclient.a f21298b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f21299d = new AtomicInteger(0);
    public Long e;
    public InterfaceC1782c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ki.e f21300g;
    public volatile String h;

    public f(AbstractC1780a abstractC1780a, io.split.android.client.service.sseclient.a aVar, int i) {
        Objects.requireNonNull(abstractC1780a);
        this.f21297a = abstractC1780a;
        this.f21298b = aVar;
        this.c = i;
    }

    public final synchronized void a(InterfaceC1782c interfaceC1782c) {
        d(interfaceC1782c, null);
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        ki.e eVar;
        this.h = null;
        if (fVar.c == 2) {
            if (fVar.f() == null || Boolean.FALSE.equals(fVar.f())) {
                if (this.c == -1 || this.f21299d.get() < this.c) {
                    synchronized (this) {
                        if (this.f == null) {
                            return;
                        }
                        long jA = this.f21298b.a();
                        Ri.a.d(String.format("Retrying %s task in %d seconds", this.f.getClass().getSimpleName(), Long.valueOf(jA)));
                        this.f21299d.incrementAndGet();
                        this.h = this.f21297a.i(this.f, jA, this);
                        return;
                    }
                }
                return;
            }
            if (Boolean.TRUE.equals(fVar.f()) && (eVar = this.f21300g) != null) {
                eVar.b(fVar);
            }
        }
        this.f21298b.b();
        ki.e eVar2 = this.f21300g;
        if (eVar2 != null) {
            int i = fVar.c;
            if (i == 1) {
                eVar2.b(Ff.f.k(fVar.f1581b));
            } else if (i == 2) {
                eVar2.b(Ff.f.d(fVar.f1581b));
            }
        }
    }

    public final synchronized void c(InterfaceC1782c interfaceC1782c, Long l6, ki.e eVar) {
        Objects.requireNonNull(interfaceC1782c);
        this.f = interfaceC1782c;
        this.f21300g = eVar;
        this.e = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(l6.longValue()));
        this.f21299d.set(0);
    }

    public final synchronized void d(InterfaceC1782c interfaceC1782c, ki.e eVar) {
        c(interfaceC1782c, 0L, eVar);
    }

    public final synchronized void e() {
        if (this.f != null && this.h == null) {
            this.f21298b.b();
            this.f21299d.incrementAndGet();
            this.h = this.f21297a.i(this.f, this.e.longValue(), this);
        }
    }

    public final synchronized void f() {
        if (this.f == null) {
            return;
        }
        this.f21297a.k(this.h);
        this.h = null;
    }
}
