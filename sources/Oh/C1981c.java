package oh;

import ch.AbstractC1103b;
import ch.InterfaceC1104c;
import hh.n;
import o1.AbstractC1955a;

/* JADX INFO: renamed from: oh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1981c extends AbstractC1103b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f18857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18858b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18859d;

    public C1981c(ch.l lVar, n nVar, int i, int i4) {
        this.f18857a = lVar;
        this.f18858b = nVar;
        this.c = i;
        this.f18859d = i4;
    }

    @Override // ch.AbstractC1103b
    public final void c(InterfaceC1104c interfaceC1104c) {
        ch.l lVar = this.f18857a;
        n nVar = this.f18858b;
        if (AbstractC1955a.B(lVar, nVar, interfaceC1104c)) {
            return;
        }
        lVar.subscribe(new C1980b(interfaceC1104c, nVar, this.c, this.f18859d));
    }
}
