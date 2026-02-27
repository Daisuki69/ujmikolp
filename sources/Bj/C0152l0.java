package Bj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Bj.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0152l0 extends p0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C0152l0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final Function1 e;

    public C0152l0(Function1 function1) {
        this.e = function1;
    }

    @Override // Bj.p0
    public final boolean i() {
        return true;
    }

    @Override // Bj.p0
    public final void j(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th2);
        }
    }
}
