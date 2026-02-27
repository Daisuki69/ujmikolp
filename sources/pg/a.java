package Pg;

import Ej.InterfaceC0231i;
import Fj.l;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5166b;
    public InterfaceC0231i c;
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = lVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f5165a = obj;
        this.f5166b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
