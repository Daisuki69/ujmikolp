package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0247z extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1490b;
    public final /* synthetic */ r c;
    public C0244w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247z(r rVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = rVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1489a = obj;
        this.f1490b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
