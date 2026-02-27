package Bj;

import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends C0151l {
    public final u0 i;

    public q0(InterfaceC1526a interfaceC1526a, u0 u0Var) {
        super(1, interfaceC1526a);
        this.i = u0Var;
    }

    @Override // Bj.C0151l
    public final Throwable p(u0 u0Var) {
        Throwable thC;
        u0 u0Var2 = this.i;
        u0Var2.getClass();
        Object obj = u0.f643a.get(u0Var2);
        return (!(obj instanceof s0) || (thC = ((s0) obj).c()) == null) ? obj instanceof C0162u ? ((C0162u) obj).f642a : u0Var.g() : thC;
    }

    @Override // Bj.C0151l
    public final String y() {
        return "AwaitContinuation";
    }
}
