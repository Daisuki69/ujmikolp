package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0245x extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1485b;
    public final /* synthetic */ r c;
    public r e;
    public InterfaceC0231i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f1486g;
    public long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245x(r rVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = rVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1484a = obj;
        this.f1485b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
