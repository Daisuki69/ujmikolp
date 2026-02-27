package ph;

import xh.AbstractC2477a;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends AbstractC2477a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f19441b;
    public final Wh.f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19442d;

    public d3(e3 e3Var, Wh.f fVar) {
        this.f19441b = e3Var;
        this.c = fVar;
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19442d) {
            return;
        }
        this.f19442d = true;
        e3 e3Var = this.f19441b;
        e3Var.f19452l.c(this);
        e3Var.e.offer(new f3(this.c, null));
        if (e3Var.B()) {
            e3Var.F();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19442d) {
            S1.s.r(th2);
            return;
        }
        this.f19442d = true;
        e3 e3Var = this.f19441b;
        e3Var.m.dispose();
        e3Var.f19452l.dispose();
        e3Var.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        dispose();
        onComplete();
    }
}
