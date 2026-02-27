package sh;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f20080b = Thread.currentThread();
        try {
            this.f20079a.run();
            this.f20080b = null;
        } catch (Throwable th2) {
            this.f20080b = null;
            lazySet(a.c);
            S1.s.r(th2);
        }
    }
}
