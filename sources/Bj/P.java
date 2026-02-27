package Bj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends Gj.q {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(P.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // Gj.q, Bj.u0
    public final void v(Object obj) {
        x(obj);
    }

    @Override // Gj.q, Bj.u0
    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                Gj.a.g(hj.h.b(this.f2028d), AbstractC0163v.a(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
