package ph;

import ch.AbstractC1109h;
import kh.InterfaceC1774a;

/* JADX INFO: renamed from: ph.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2144y0 extends AbstractC1109h implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19693b;

    public C2144y0(ch.l lVar, long j) {
        this.f19692a = lVar;
        this.f19693b = j;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new C2136w0(this.f19692a, this.f19693b, null, false);
    }

    @Override // ch.AbstractC1109h
    public final void c(ch.i iVar) {
        this.f19692a.subscribe(new C2140x0(iVar, this.f19693b));
    }
}
