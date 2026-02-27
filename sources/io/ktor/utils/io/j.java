package io.ktor.utils.io;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f17531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17532b;
    public final /* synthetic */ k c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = kVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f17532b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.g(this);
    }
}
