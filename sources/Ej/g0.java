package Ej;

import Bj.InterfaceC0156n0;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f1449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0231i f1450b;
    public i0 c;
    public InterfaceC0156n0 e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1451g;
    public final /* synthetic */ h0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.h = h0Var;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1451g = obj;
        this.i |= Integer.MIN_VALUE;
        this.h.collect(null, this);
        return EnumC1578a.f17050a;
    }
}
