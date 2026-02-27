package ph;

import java.util.Collection;
import xh.AbstractC2477a;

/* JADX INFO: renamed from: ph.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2045B extends AbstractC2477a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19124b;
    public final lh.l c;

    public /* synthetic */ C2045B(lh.l lVar, int i) {
        this.f19124b = i;
        this.c = lVar;
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19124b) {
            case 0:
                ((C2147z) this.c).onComplete();
                break;
            default:
                ((e3) this.c).onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19124b) {
            case 0:
                ((C2147z) this.c).onError(th2);
                break;
            default:
                e3 e3Var = (e3) this.c;
                e3Var.m.dispose();
                e3Var.f19452l.dispose();
                e3Var.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19124b) {
            case 0:
                C2147z c2147z = (C2147z) this.c;
                c2147z.getClass();
                try {
                    Object objCall = c2147z.j.call();
                    jh.e.b(objCall, "The buffer supplied is null");
                    Collection collection = (Collection) objCall;
                    synchronized (c2147z) {
                        try {
                            Object obj2 = c2147z.f19699l;
                            if (obj2 != null) {
                                c2147z.f19699l = collection;
                                c2147z.D(obj2, c2147z);
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    of.p.F(th2);
                    c2147z.dispose();
                    c2147z.f18320d.onError(th2);
                    return;
                }
            default:
                e3 e3Var = (e3) this.c;
                e3Var.getClass();
                e3Var.e.offer(new f3(null, obj));
                if (e3Var.B()) {
                    e3Var.F();
                    return;
                }
                return;
        }
    }
}
