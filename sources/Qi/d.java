package qi;

import D.C0176i;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.InterfaceC1782c;
import ki.h;
import ki.i;
import oi.C1988f;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1781b f19797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19798b;
    public final C1988f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.split.android.client.storage.attributes.b f19799d;
    public final yi.f e;
    public final yi.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19800g;
    public String h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f19801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f19802l;
    public final AtomicBoolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ei.b f19803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Ei.b f19804o;

    public d(C1781b c1781b, h hVar, C1988f c1988f, io.split.android.client.storage.attributes.b bVar, yi.f fVar, yi.f fVar2, boolean z4) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f19802l = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        this.m = atomicBoolean2;
        this.f19797a = c1781b;
        this.f19798b = hVar;
        this.c = c1988f;
        this.f19799d = bVar;
        Objects.requireNonNull(fVar);
        this.e = fVar;
        Objects.requireNonNull(fVar2);
        this.f = fVar2;
        this.i = 1800;
        this.j = 900;
        this.f19801k = new AtomicBoolean(z4);
        this.f19803n = new Ei.b(atomicBoolean, 2);
        this.f19804o = new Ei.b(atomicBoolean2, 2);
    }

    @Override // qi.f
    public final void a() {
        AtomicBoolean atomicBoolean = this.f19801k;
        boolean z4 = atomicBoolean.get();
        h hVar = this.f19798b;
        C1781b c1781b = this.f19797a;
        if (z4) {
            c1781b.l(new Bi.a((Ki.b) hVar.f18141b.i, this.c.c()), null);
        }
        if (atomicBoolean.get()) {
            c1781b.l(new Bi.a((Ki.d) hVar.f18141b.m, this.f19799d.a()), null);
        }
        c1781b.k(this.f19800g);
        c1781b.k(this.h);
    }

    @Override // qi.f
    public final void b() {
        boolean z4 = this.m.get();
        h hVar = this.f19798b;
        C1781b c1781b = this.f19797a;
        if (z4) {
            String str = this.f19800g;
            if (str != null) {
                c1781b.k(str);
            }
            U8.c cVar = (U8.c) hVar.f18140a.f;
            C0176i c0176i = hVar.f18141b;
            this.f19800g = c1781b.h(new Ci.a(cVar, (Ki.b) c0176i.i, (Qi.c) c0176i.f919l), 0L, this.i, this.f19804o);
        }
        if (this.f19802l.get()) {
            String str2 = this.h;
            if (str2 != null) {
                c1781b.k(str2);
            }
            U8.c cVar2 = (U8.c) hVar.f18140a.f8336g;
            Ki.d dVar = (Ki.d) hVar.f18141b.m;
            hVar.c.getClass();
            this.h = c1781b.h(new Ci.a(cVar2, dVar, new ri.c(30000, 150L)), 0L, this.j, this.f19803n);
        }
    }

    @Override // qi.f
    public final void flush() {
        ArrayList arrayListC = this.c.c();
        h hVar = this.f19798b;
        Bi.a aVar = new Bi.a((Ki.b) hVar.f18141b.i, arrayListC);
        U8.c cVar = (U8.c) hVar.f18140a.f;
        C0176i c0176i = hVar.f18141b;
        i iVar = new i(new InterfaceC1782c[]{aVar, new Ci.a(cVar, (Ki.b) c0176i.i, (Qi.c) c0176i.f919l)});
        yi.f fVar = this.e;
        synchronized (fVar) {
            fVar.d(iVar, null);
        }
        fVar.e();
        Bi.a aVar2 = new Bi.a((Ki.d) hVar.f18141b.m, this.f19799d.a());
        U8.c cVar2 = (U8.c) hVar.f18140a.f8336g;
        Ki.d dVar = (Ki.d) hVar.f18141b.m;
        hVar.c.getClass();
        i iVar2 = new i(new InterfaceC1782c[]{aVar2, new Ci.a(cVar2, dVar, new ri.c(30000, 150L))});
        yi.f fVar2 = this.f;
        fVar2.a(iVar2);
        fVar2.e();
    }
}
