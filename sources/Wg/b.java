package wg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20785b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f20785b = cVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f20784a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f20785b.b(null, this);
    }
}
