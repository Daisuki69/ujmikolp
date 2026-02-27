package i5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17109b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f17109b = lVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f17108a = obj;
        this.c |= Integer.MIN_VALUE;
        return l.a(this.f17109b, this);
    }
}
