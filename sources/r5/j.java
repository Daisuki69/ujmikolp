package r5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19863b;
    public s5.m c;
    public /* synthetic */ Object e;
    public final /* synthetic */ m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f = mVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f19864g |= Integer.MIN_VALUE;
        return this.f.e(0, this);
    }
}
