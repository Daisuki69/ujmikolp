package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3 f19504b;

    public i3(long j, j3 j3Var) {
        this.f19503a = j;
        this.f19504b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j3 j3Var = this.f19504b;
        if (j3Var.f) {
            j3Var.f19522t = true;
        } else {
            j3Var.e.offer(this);
        }
        if (j3Var.B()) {
            j3Var.F();
        }
    }
}
