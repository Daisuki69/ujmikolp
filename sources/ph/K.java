package ph;

import hh.InterfaceC1569b;
import ih.EnumC1605c;
import java.util.concurrent.Callable;
import kh.InterfaceC1774a;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends ch.w implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f19240b;
    public final InterfaceC1569b c;

    public K(ch.l lVar, Callable callable, InterfaceC1569b interfaceC1569b) {
        this.f19239a = lVar;
        this.f19240b = callable;
        this.c = interfaceC1569b;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new C2044A(this.f19239a, this.f19240b, this.c, 2);
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        try {
            Object objCall = this.f19240b.call();
            jh.e.b(objCall, "The initialSupplier returned a null value");
            this.f19239a.subscribe(new J(xVar, objCall, this.c, 1));
        } catch (Throwable th2) {
            xVar.onSubscribe(EnumC1605c.f17149a);
            xVar.onError(th2);
        }
    }
}
