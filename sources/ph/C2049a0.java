package ph;

import kh.InterfaceC1774a;

/* JADX INFO: renamed from: ph.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2049a0 extends ch.w implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19405a;

    public C2049a0(ch.l lVar) {
        this.f19405a = lVar;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new Z(this.f19405a, 0);
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        this.f19405a.subscribe(new Y(xVar, 2));
    }
}
