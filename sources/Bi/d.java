package Bi;

import P5.N;
import bi.h;
import bi.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import pg.C2038a;
import si.C2259a;
import si.C2260b;
import si.C2262d;
import xi.C2483b;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi.f f574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1781b f575b;
    public final C2038a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f576d;
    public final C2483b e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f577g;
    public String h;
    public final AtomicBoolean i;

    public d(yi.f fVar, C1781b c1781b, h hVar, C2038a c2038a) {
        i iVar = i.f9155a;
        this.f577g = new AtomicBoolean(true);
        this.i = new AtomicBoolean(false);
        Objects.requireNonNull(c1781b);
        this.f575b = c1781b;
        this.f574a = fVar;
        this.c = c2038a;
        this.f576d = 1800;
        this.e = new C2483b(hVar, iVar);
        this.f = new c(this, 0);
    }

    @Override // Bi.b
    public final void b() {
        if (this.f577g.get()) {
            yi.f fVar = this.f574a;
            fVar.f();
            fVar.d(this.c.g(false, null, null), this.f);
            fVar.e();
        }
    }

    @Override // Bi.b
    public final void c() {
        N n7 = (N) this.c.f19100b;
        this.f575b.l(new C2259a((Li.b) n7.f5026b, (Li.b) n7.h, (C2260b) n7.f5028g), this.e);
    }

    @Override // Bi.b
    public final void d() {
        N n7 = (N) this.c.f19100b;
        this.f575b.l(new C2259a((Li.b) n7.f5026b, (Li.b) n7.h, (C2260b) n7.f5028g), null);
    }

    @Override // Bi.b
    public final void destroy() {
        this.f574a.f();
    }

    @Override // Bi.b
    public final void e() {
        this.f575b.k(this.h);
    }

    @Override // Bi.b
    public final void g() {
        if (this.f577g.get()) {
            String str = this.h;
            C1781b c1781b = this.f575b;
            if (str != null) {
                c1781b.k(str);
            }
            C2262d c2262dG = this.c.g(false, null, null);
            long j = this.f576d;
            this.h = c1781b.h(c2262dG, j, j, this.f);
        }
    }
}
