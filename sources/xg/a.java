package xg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f20987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Wg.a f20988b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = bVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
