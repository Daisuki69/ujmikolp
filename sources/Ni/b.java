package Ni;

import Bi.c;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.h;
import yi.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f4499b;
    public final C1781b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4500d;
    public final AtomicBoolean e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4501g;

    public b(C1781b c1781b, h hVar) {
        f fVar = new f(c1781b, new Zj.b(1L), 3);
        this.e = new AtomicBoolean(true);
        this.f4501g = null;
        this.c = c1781b;
        this.f4498a = hVar;
        this.f4499b = fVar;
        this.f4500d = 3600L;
        this.f = new c(this, 1);
    }

    @Override // Ni.a
    public final void b() {
        String str = this.f4501g;
        C1781b c1781b = this.c;
        if (str != null) {
            c1781b.k(str);
        }
        this.f4501g = c1781b.h(this.f4498a.h.w(), 5L, this.f4500d, this.f);
    }

    @Override // Ni.a
    public final void c() {
        if (this.e.get()) {
            Ci.b bVar = this.f4498a.h;
            Ci.a aVar = new Ci.a((U8.c) bVar.f785b, (Q3.b) bVar.f786d, (Qi.c) bVar.f);
            f fVar = this.f4499b;
            fVar.d(aVar, this.f);
            fVar.e();
        }
    }

    @Override // Ni.a
    public final void destroy() {
        this.f4499b.f();
        String str = this.f4501g;
        if (str != null) {
            this.c.k(str);
            this.f4501g = null;
        }
    }

    @Override // Ni.a
    public final void flush() {
        if (this.e.get()) {
            this.c.l(this.f4498a.h.w(), this.f);
        }
    }
}
