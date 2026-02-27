package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0227e extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0228f f1444b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227e(C0228f c0228f, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.f1444b = c0228f;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1443a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f1444b.emit(null, this);
    }
}
