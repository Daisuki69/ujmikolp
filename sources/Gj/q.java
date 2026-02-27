package Gj;

import Bj.AbstractC0129a;
import Bj.AbstractC0163v;
import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public class q extends AbstractC0129a implements InterfaceC1610d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1526a f2028d;

    public q(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f2028d = interfaceC1526a;
    }

    @Override // Bj.u0
    public final boolean S() {
        return true;
    }

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = this.f2028d;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // Bj.u0
    public void v(Object obj) {
        a.g(hj.h.b(this.f2028d), AbstractC0163v.a(obj));
    }

    @Override // Bj.u0
    public void x(Object obj) {
        this.f2028d.resumeWith(AbstractC0163v.a(obj));
    }
}
