package Fg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1593b;
    public final /* synthetic */ d c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = dVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1593b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
