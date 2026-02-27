package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: renamed from: Ej.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0246y extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0228f f1487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1488b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0228f e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246y(C0228f c0228f, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = c0228f;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
