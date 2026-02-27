package Dj;

import hj.EnumC1578a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1169b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f1169b = eVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1168a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = e.C(this.f1169b, this);
        return objC == EnumC1578a.f17050a ? objC : new l(objC);
    }
}
