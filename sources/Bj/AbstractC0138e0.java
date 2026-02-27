package Bj;

import cj.C1124j;

/* JADX INFO: renamed from: Bj.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0138e0 extends A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f616d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f618b;
    public C1124j c;

    public final void B(Q q9) {
        C1124j c1124j = this.c;
        if (c1124j == null) {
            c1124j = new C1124j();
            this.c = c1124j;
        }
        c1124j.addLast(q9);
    }

    public abstract Thread C();

    public final void D(boolean z4) {
        this.f617a = (z4 ? 4294967296L : 1L) + this.f617a;
        if (z4) {
            return;
        }
        this.f618b = true;
    }

    public abstract long E();

    public final boolean F() {
        C1124j c1124j = this.c;
        if (c1124j == null) {
            return false;
        }
        Q q9 = (Q) (c1124j.isEmpty() ? null : c1124j.removeFirst());
        if (q9 == null) {
            return false;
        }
        q9.run();
        return true;
    }

    public void G(long j, AbstractRunnableC0132b0 abstractRunnableC0132b0) {
        I.h.L(j, abstractRunnableC0132b0);
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        Gj.a.a(i);
        return str != null ? new Gj.n(this, str) : this;
    }

    public abstract void shutdown();

    public final void t(boolean z4) {
        long j = this.f617a - (z4 ? 4294967296L : 1L);
        this.f617a = j;
        if (j <= 0 && this.f618b) {
            shutdown();
        }
    }
}
