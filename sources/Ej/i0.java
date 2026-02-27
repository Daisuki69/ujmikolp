package Ej;

import Fj.AbstractC0248a;
import Fj.AbstractC0249b;
import Fj.AbstractC0250c;
import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends AbstractC0250c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f1452a = new AtomicReference(null);

    @Override // Fj.AbstractC0250c
    public final boolean a(AbstractC0248a abstractC0248a) {
        AtomicReference atomicReference = this.f1452a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(W.f1423b);
        return true;
    }

    @Override // Fj.AbstractC0250c
    public final InterfaceC1526a[] b(AbstractC0248a abstractC0248a) {
        this.f1452a.set(null);
        return AbstractC0249b.f1643a;
    }
}
