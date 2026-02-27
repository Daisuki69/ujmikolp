package Nh;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f4451b = Thread.currentThread();
        try {
            this.f4450a.run();
            this.f4451b = null;
        } catch (Throwable th2) {
            this.f4451b = null;
            dispose();
            E1.c.k(th2);
            throw th2;
        }
    }
}
