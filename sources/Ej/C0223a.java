package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0223a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fj.w f1432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1433b;
    public final /* synthetic */ C0233k c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223a(C0233k c0233k, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0233k;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1433b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
