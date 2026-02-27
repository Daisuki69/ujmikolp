package Bj;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends p0 {
    public final u0 e;
    public final s0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0158p f632g;
    public final Object h;

    public r0(u0 u0Var, s0 s0Var, C0158p c0158p, Object obj) {
        this.e = u0Var;
        this.f = s0Var;
        this.f632g = c0158p;
        this.h = obj;
    }

    @Override // Bj.p0
    public final boolean i() {
        return false;
    }

    @Override // Bj.p0
    public final void j(Throwable th2) {
        C0158p c0158p = this.f632g;
        u0 u0Var = this.e;
        u0Var.getClass();
        C0158p c0158pW = u0.W(c0158p);
        s0 s0Var = this.f;
        Object obj = this.h;
        if (c0158pW == null || !u0Var.g0(s0Var, c0158pW, obj)) {
            s0Var.f635a.c(new Gj.g(2), 2);
            C0158p c0158pW2 = u0.W(c0158p);
            if (c0158pW2 == null || !u0Var.g0(s0Var, c0158pW2, obj)) {
                u0Var.v(u0Var.I(s0Var, obj));
            }
        }
    }
}
