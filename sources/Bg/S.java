package Bg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f496b;
    public final /* synthetic */ T c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t5, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = t5;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f496b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
