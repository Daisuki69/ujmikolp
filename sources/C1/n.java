package c1;

import k2.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f9240b;

    public /* synthetic */ n(Runnable runnable, int i) {
        this.f9239a = i;
        this.f9240b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9239a) {
            case 0:
                try {
                    this.f9240b.run();
                } catch (Exception e) {
                    v0.g("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            default:
                this.f9240b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f9239a) {
            case 1:
                return this.f9240b.toString();
            default:
                return super.toString();
        }
    }
}
