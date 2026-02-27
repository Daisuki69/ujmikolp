package Ah;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f318b;
    public volatile boolean c;

    public l(Runnable runnable, n nVar) {
        this.f317a = runnable;
        this.f318b = nVar;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.c = true;
        this.f318b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.f317a.run();
        } catch (Throwable th2) {
            dispose();
            E1.c.k(th2);
            throw th2;
        }
    }
}
