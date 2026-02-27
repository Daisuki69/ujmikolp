package Bj;

/* JADX INFO: renamed from: Bj.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0130a0 extends AbstractRunnableC0132b0 {
    public final G0 c;

    public C0130a0(long j, G0 g02) {
        super(j);
        this.c = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // Bj.AbstractRunnableC0132b0
    public final String toString() {
        return super.toString() + this.c;
    }
}
