package Vg;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f6103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6104b;
    public final /* synthetic */ b c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = bVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f6104b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
