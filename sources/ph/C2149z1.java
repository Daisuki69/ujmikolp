package ph;

import hh.InterfaceC1573f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;
import wh.AbstractC2439a;

/* JADX INFO: renamed from: ph.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2149z1 extends AbstractC2439a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19705b;
    public final C2145y1 c;

    public C2149z1(C2145y1 c2145y1, ch.l lVar, AtomicReference atomicReference) {
        this.c = c2145y1;
        this.f19704a = lVar;
        this.f19705b = atomicReference;
    }

    @Override // wh.AbstractC2439a
    public final void d(InterfaceC1573f interfaceC1573f) {
        C2141x1 c2141x1;
        loop0: while (true) {
            AtomicReference atomicReference = this.f19705b;
            c2141x1 = (C2141x1) atomicReference.get();
            if (c2141x1 != null && !c2141x1.a()) {
                break;
            }
            C2141x1 c2141x12 = new C2141x1(atomicReference);
            while (!atomicReference.compareAndSet(c2141x1, c2141x12)) {
                if (atomicReference.get() != c2141x1) {
                    break;
                }
            }
            c2141x1 = c2141x12;
            break loop0;
        }
        AtomicBoolean atomicBoolean = c2141x1.c;
        boolean z4 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z4 = true;
        }
        try {
            interfaceC1573f.accept(c2141x1);
            if (z4) {
                this.f19704a.subscribe(c2141x1);
            }
        } catch (Throwable th2) {
            of.p.F(th2);
            throw AbstractC2353d.d(th2);
        }
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.c.subscribe(rVar);
    }
}
