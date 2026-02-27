package Xh;

import bi.EnumC1028f;
import defpackage.AbstractC1414e;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Zh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f6644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f6645b;
    public final Yh.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bi.h f6646d;
    public final Si.c e;
    public final Si.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f6647g;
    public final b h;
    public boolean i = false;

    public h(n nVar, Ei.c cVar, Yh.a aVar, R4.i iVar, fi.c cVar2, d dVar, bi.h hVar, b bVar, b bVar2, Si.c cVar3) {
        Objects.requireNonNull(iVar);
        Objects.requireNonNull(cVar2);
        Objects.requireNonNull(nVar);
        this.f6644a = new WeakReference(nVar);
        Objects.requireNonNull(cVar);
        this.f6645b = new WeakReference(cVar);
        Objects.requireNonNull(aVar);
        this.c = aVar;
        Objects.requireNonNull(dVar);
        this.f6646d = hVar;
        Objects.requireNonNull(bVar);
        this.h = bVar;
        this.f = new Si.d();
        this.e = cVar3;
        this.f6647g = bVar2;
    }

    public final boolean a() {
        return this.f6646d.d(EnumC1028f.f9151a);
    }

    @Override // Zh.a
    public final boolean b(Map map) {
        try {
            return this.f6647g.b(map);
        } catch (Exception e) {
            AbstractC1414e.o(e, new StringBuilder("Error setting attributes: "));
            return false;
        }
    }

    @Override // Zh.a
    public final Map c() {
        try {
            return this.f6647g.c();
        } catch (Exception e) {
            AbstractC1414e.o(e, new StringBuilder("Error getting attributes: "));
            return Collections.EMPTY_MAP;
        }
    }

    public final void d(EnumC1028f enumC1028f, W5.a aVar) {
        boolean zEquals = enumC1028f.equals(EnumC1028f.f9152b);
        bi.h hVar = this.f6646d;
        if (zEquals || !hVar.d(enumC1028f)) {
            hVar.e(enumC1028f, aVar);
            return;
        }
        Ri.a.q("A listener was added for " + enumC1028f.toString() + " on the SDK, which has already fired and won’t be emitted again. The callback won’t be executed.");
    }
}
