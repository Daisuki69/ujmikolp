package Bj;

import bj.C1037h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: Bj.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0155n extends p0 {
    public final /* synthetic */ int e;
    public final C0151l f;

    public /* synthetic */ C0155n(C0151l c0151l, int i) {
        this.e = i;
        this.f = c0151l;
    }

    @Override // Bj.p0
    public final boolean i() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // Bj.p0
    public final void j(Throwable th2) {
        C0151l c0151l = this.f;
        switch (this.e) {
            case 0:
                Throwable thP = c0151l.p(h());
                if (c0151l.w()) {
                    Gj.e eVar = (Gj.e) c0151l.f629d;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Gj.e.h;
                        Object obj = atomicReferenceFieldUpdater.get(eVar);
                        Gj.t tVar = Gj.a.c;
                        if (kotlin.jvm.internal.j.b(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, thP)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                                }
                            }
                        }
                    }
                }
                c0151l.a(thP);
                if (!c0151l.w()) {
                    c0151l.n();
                }
                break;
            default:
                C1037h.a aVar = C1037h.f9166b;
                c0151l.resumeWith(Unit.f18162a);
                break;
        }
    }
}
