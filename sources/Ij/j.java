package Ij;

import Bj.H;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {
    public final Runnable c;

    public j(Runnable runnable, long j, boolean z4) {
        super(j, z4);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(H.o(runnable));
        sb2.append(", ");
        sb2.append(this.f2367a);
        sb2.append(", ");
        return androidx.camera.core.impl.a.n(sb2, this.f2368b ? "Blocking" : "Non-blocking", ']');
    }
}
