package io.ktor.utils.io;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f17529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f17530b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = kVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
