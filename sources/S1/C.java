package S1;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends i implements Runnable {
    public final Runnable h;

    public C(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // S1.p
    public final String i() {
        return "task=[" + this.h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th2) {
            k(th2);
            throw th2;
        }
    }
}
