package Ah;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f316b;
    public Thread c;

    public k(Runnable runnable, n nVar) {
        this.f315a = runnable;
        this.f316b = nVar;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            n nVar = this.f316b;
            if (nVar instanceof Nh.l) {
                Nh.l lVar = (Nh.l) nVar;
                if (lVar.f4473b) {
                    return;
                }
                lVar.f4473b = true;
                lVar.f4472a.shutdown();
                return;
            }
        }
        this.f316b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.f315a.run();
        } finally {
        }
    }
}
