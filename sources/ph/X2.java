package ph;

import hh.InterfaceC1573f;
import ih.EnumC1605c;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class X2 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f19382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19383b;
    public final InterfaceC1573f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19384d;

    public X2(Callable callable, hh.n nVar, InterfaceC1573f interfaceC1573f, boolean z4) {
        this.f19382a = callable;
        this.f19383b = nVar;
        this.c = interfaceC1573f;
        this.f19384d = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        InterfaceC1573f interfaceC1573f = this.c;
        try {
            Object objCall = this.f19382a.call();
            try {
                Object objApply = this.f19383b.apply(objCall);
                jh.e.b(objApply, "The sourceSupplier returned a null ObservableSource");
                ((ch.p) objApply).subscribe(new W2(rVar, objCall, interfaceC1573f, this.f19384d));
            } catch (Throwable th2) {
                of.p.F(th2);
                try {
                    interfaceC1573f.accept(objCall);
                    EnumC1605c.c(th2, rVar);
                } catch (Throwable th3) {
                    of.p.F(th3);
                    EnumC1605c.c(new CompositeException(th2, th3), rVar);
                }
            }
        } catch (Throwable th4) {
            of.p.F(th4);
            EnumC1605c.c(th4, rVar);
        }
    }
}
