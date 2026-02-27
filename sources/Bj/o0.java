package Bj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class o0 extends u0 implements InterfaceC0160s {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(InterfaceC0156n0 interfaceC0156n0) {
        super(true);
        boolean z4 = true;
        P(interfaceC0156n0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f644b;
        InterfaceC0157o interfaceC0157o = (InterfaceC0157o) atomicReferenceFieldUpdater.get(this);
        C0158p c0158p = interfaceC0157o instanceof C0158p ? (C0158p) interfaceC0157o : null;
        if (c0158p == null) {
            z4 = false;
            break;
        }
        u0 u0VarH = c0158p.h();
        while (!u0VarH.K()) {
            InterfaceC0157o interfaceC0157o2 = (InterfaceC0157o) atomicReferenceFieldUpdater.get(u0VarH);
            C0158p c0158p2 = interfaceC0157o2 instanceof C0158p ? (C0158p) interfaceC0157o2 : null;
            if (c0158p2 == null) {
                z4 = false;
                break;
            }
            u0VarH = c0158p2.h();
        }
        this.c = z4;
    }

    @Override // Bj.u0
    public final boolean K() {
        return this.c;
    }

    @Override // Bj.u0
    public final boolean L() {
        return true;
    }

    public final boolean h0() {
        return T(Unit.f18162a);
    }
}
