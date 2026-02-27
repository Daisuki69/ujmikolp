package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0240s extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1475b;
    public final /* synthetic */ C0241t c;
    public C0241t e;
    public InterfaceC0231i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240s(C0241t c0241t, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0241t;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1474a = obj;
        this.f1475b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
