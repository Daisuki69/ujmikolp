package ph;

import ih.EnumC1605c;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ph.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2081i0 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f19499b;

    public /* synthetic */ C2081i0(Callable callable, int i) {
        this.f19498a = i;
        this.f19499b = callable;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19498a) {
            case 0:
                try {
                    Object objCall = this.f19499b.call();
                    jh.e.b(objCall, "null ObservableSource supplied");
                    ((ch.p) objCall).subscribe(rVar);
                } catch (Throwable th2) {
                    of.p.F(th2);
                    EnumC1605c.c(th2, rVar);
                    return;
                }
                break;
            default:
                try {
                    Object objCall2 = this.f19499b.call();
                    jh.e.b(objCall2, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) objCall2;
                } catch (Throwable th3) {
                    th = th3;
                    of.p.F(th);
                }
                EnumC1605c.c(th, rVar);
                break;
        }
    }
}
