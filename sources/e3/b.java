package e3;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Kj.a f16560b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = eVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
