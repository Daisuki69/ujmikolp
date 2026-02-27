package ph;

import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import kh.InterfaceC1774a;

/* JADX INFO: renamed from: ph.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2058c1 extends AbstractC1103b implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19426a;

    public C2058c1(ch.l lVar) {
        this.f19426a = lVar;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new Z(this.f19426a, 3);
    }

    @Override // ch.AbstractC1103b
    public final void c(InterfaceC1104c interfaceC1104c) {
        this.f19426a.subscribe(new C2105o0(interfaceC1104c, 4));
    }
}
