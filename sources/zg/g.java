package Zg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f6952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6953b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = iVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(0, this);
    }
}
