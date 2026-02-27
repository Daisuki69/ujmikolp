package b3;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y f8446b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = e0Var;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return e0.a(this.e, null, null, this);
    }
}
