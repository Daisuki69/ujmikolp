package ch;

import fh.InterfaceC1486b;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f9370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f9371b;
    public Thread c;

    public s(Runnable runnable, u uVar) {
        this.f9370a = runnable;
        this.f9371b = uVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            u uVar = this.f9371b;
            if (uVar instanceof sh.l) {
                sh.l lVar = (sh.l) uVar;
                if (lVar.f20101b) {
                    return;
                }
                lVar.f20101b = true;
                lVar.f20100a.shutdown();
                return;
            }
        }
        this.f9371b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.f9370a.run();
        } finally {
            dispose();
            this.c = null;
        }
    }
}
