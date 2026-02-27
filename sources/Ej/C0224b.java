package Ej;

import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0224b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dj.r f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1437b;
    public final /* synthetic */ C0225c c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224b(C0225c c0225c, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = c0225c;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1437b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
