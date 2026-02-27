package Fj;

import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements InterfaceC1526a, InterfaceC1610d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1526a f1636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f1637b;

    public A(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext) {
        this.f1636a = interfaceC1526a;
        this.f1637b = coroutineContext;
    }

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = this.f1636a;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return this.f1637b;
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        this.f1636a.resumeWith(obj);
    }
}
