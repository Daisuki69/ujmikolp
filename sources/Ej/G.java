package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0244w f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1399b;
    public int c;
    public final /* synthetic */ C0244w e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0244w c0244w, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.e = c0244w;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1399b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
