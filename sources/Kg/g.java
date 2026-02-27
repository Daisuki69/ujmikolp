package Kg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xg.b f2670b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = hVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
