package ch;

import fh.InterfaceC1486b;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f9372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f9373b;
    public volatile boolean c;

    public t(Runnable runnable, u uVar) {
        this.f9372a = runnable;
        this.f9373b = uVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c = true;
        this.f9373b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.f9372a.run();
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f9373b.dispose();
            throw AbstractC2353d.d(th2);
        }
    }
}
