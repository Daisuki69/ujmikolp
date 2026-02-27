package b3;

import ij.AbstractC1609c;

/* JADX INFO: renamed from: b3.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0877Q extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0878S f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8404b;
    public final /* synthetic */ C0878S c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877Q(C0878S c0878s, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = c0878s;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f8404b = obj;
        this.e |= Integer.MIN_VALUE;
        return C0878S.a(this.c, this);
    }
}
