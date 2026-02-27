package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1410b;
    public final /* synthetic */ C0244w c;
    public Object e;
    public InterfaceC0231i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0244w c0244w, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0244w;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1409a = obj;
        this.f1410b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
