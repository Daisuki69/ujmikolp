package io.ktor.utils.io;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f17526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f17527b;
    public int c;
    public /* synthetic */ Object e;
    public final /* synthetic */ k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f = kVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f17528g |= Integer.MIN_VALUE;
        return this.f.h(0, this);
    }
}
