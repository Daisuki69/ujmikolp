package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0239q extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1470b;
    public final /* synthetic */ r c;
    public r e;
    public InterfaceC0231i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Fj.w f1471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239q(r rVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = rVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1469a = obj;
        this.f1470b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
