package Fj;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f1656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1657b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = lVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
