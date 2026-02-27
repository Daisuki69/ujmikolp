package Dj;

import hj.EnumC1578a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1171b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f1171b = eVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1170a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.f1171b.D(null, 0, 0L, this);
        return objD == EnumC1578a.f17050a ? objD : new l(objD);
    }
}
