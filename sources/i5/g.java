package i5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17104b;
    public s5.d c;
    public /* synthetic */ Object e;
    public final /* synthetic */ l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f = lVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f17105g |= Integer.MIN_VALUE;
        return this.f.e(0, this);
    }
}
