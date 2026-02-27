package e3;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f16578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16579b;
    public final /* synthetic */ m c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = mVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f16579b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
