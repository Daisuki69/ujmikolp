package Ej;

import Bj.InterfaceC0156n0;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f1416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0231i f1417b;
    public X c;
    public InterfaceC0156n0 e;
    public /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V f1418g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v7, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.f1418g = v7;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        V.j(this.f1418g, null, this);
        return EnumC1578a.f17050a;
    }
}
