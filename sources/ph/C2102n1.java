package ph;

import ch.AbstractC1109h;

/* JADX INFO: renamed from: ph.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102n1 extends AbstractC1109h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19567b;

    public /* synthetic */ C2102n1(ch.l lVar, int i) {
        this.f19566a = i;
        this.f19567b = lVar;
    }

    @Override // ch.AbstractC1109h
    public final void c(ch.i iVar) {
        switch (this.f19566a) {
            case 0:
                this.f19567b.subscribe(new C2098m1(iVar, 0));
                break;
            default:
                this.f19567b.subscribe(new C2101n0(iVar));
                break;
        }
    }
}
