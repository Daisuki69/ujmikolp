package i5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17113b;
    public final /* synthetic */ l c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = lVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f17113b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.f(0, this);
    }
}
