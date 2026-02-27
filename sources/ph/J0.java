package ph;

import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import kh.InterfaceC1774a;

/* JADX INFO: loaded from: classes4.dex */
public final class J0 extends AbstractC1103b implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19231b;
    public final boolean c;

    public J0(ch.l lVar, hh.n nVar, boolean z4) {
        this.f19230a = lVar;
        this.f19231b = nVar;
        this.c = z4;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new H0(this.f19230a, this.f19231b, this.c, 0);
    }

    @Override // ch.AbstractC1103b
    public final void c(InterfaceC1104c interfaceC1104c) {
        this.f19230a.subscribe(new I0(interfaceC1104c, this.f19231b, this.c));
    }
}
