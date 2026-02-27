package e3;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f16588b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f16588b = sVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f16587a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f16588b.c(null, this);
    }
}
