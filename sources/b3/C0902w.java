package b3;

import ij.AbstractC1609c;

/* JADX INFO: renamed from: b3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0902w extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8500b;
    public final /* synthetic */ C0896q c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902w(C0896q c0896q, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = c0896q;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f8500b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
