package oh;

import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import hh.n;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC1103b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f18874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18875b;
    public final boolean c;

    public h(ch.l lVar, n nVar, boolean z4) {
        this.f18874a = lVar;
        this.f18875b = nVar;
        this.c = z4;
    }

    @Override // ch.AbstractC1103b
    public final void c(InterfaceC1104c interfaceC1104c) {
        ch.l lVar = this.f18874a;
        n nVar = this.f18875b;
        if (AbstractC1955a.B(lVar, nVar, interfaceC1104c)) {
            return;
        }
        lVar.subscribe(new g(interfaceC1104c, nVar, this.c));
    }
}
