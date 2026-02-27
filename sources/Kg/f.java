package Kg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2668b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f2668b = hVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f2667a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f2668b.a(null, this);
    }
}
