package Qg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5369b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f5369b = fVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f5368a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f5369b.b(null, null, null, this);
    }
}
