package Fg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1595b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.e = dVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
