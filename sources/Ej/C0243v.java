package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0243v extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0244w f1480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1481b;
    public final /* synthetic */ C0244w c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243v(C0244w c0244w, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0244w;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1481b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
