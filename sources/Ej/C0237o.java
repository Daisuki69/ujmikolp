package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0237o extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1466b;
    public final /* synthetic */ C0238p c;
    public Object e;
    public InterfaceC0231i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237o(C0238p c0238p, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0238p;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1465a = obj;
        this.f1466b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
