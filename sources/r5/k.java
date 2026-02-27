package r5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19866b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = mVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return m.a(this.e, this);
    }
}
