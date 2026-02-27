package Fj;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1664b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.f1664b = pVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1663a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f1664b.emit(null, this);
    }
}
