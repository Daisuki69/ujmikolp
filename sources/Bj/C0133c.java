package Bj;

import bj.C1037h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Bj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0133c extends p0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0133c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final C0151l e;
    public W f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0137e f611g;

    public C0133c(C0137e c0137e, C0151l c0151l) {
        this.f611g = c0137e;
        this.e = c0151l;
    }

    @Override // Bj.p0
    public final boolean i() {
        return false;
    }

    @Override // Bj.p0
    public final void j(Throwable th2) {
        C0151l c0151l = this.e;
        if (th2 != null) {
            c0151l.getClass();
            Gj.t tVarE = c0151l.E(new C0162u(th2, false), null);
            if (tVarE != null) {
                c0151l.u(tVarE);
                C0135d c0135d = (C0135d) h.get(this);
                if (c0135d != null) {
                    c0135d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0137e.f614b;
        C0137e c0137e = this.f611g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0137e) == 0) {
            K[] kArr = c0137e.f615a;
            ArrayList arrayList = new ArrayList(kArr.length);
            for (K k8 : kArr) {
                arrayList.add(k8.c());
            }
            C1037h.a aVar = C1037h.f9166b;
            c0151l.resumeWith(arrayList);
        }
    }
}
