package mh;

import ch.AbstractC1107f;
import ch.InterfaceC1108g;
import ch.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1107f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f18425b;

    public c(l lVar) {
        this.f18425b = lVar;
    }

    @Override // ch.AbstractC1107f
    public final void c(nk.b bVar) {
        this.f18425b.subscribe(new C1865b((InterfaceC1108g) bVar));
    }
}
