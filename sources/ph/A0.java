package ph;

import kh.InterfaceC1774a;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends ch.w implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19120b;
    public final Object c;

    public A0(ch.l lVar, long j, Object obj) {
        this.f19119a = lVar;
        this.f19120b = j;
        this.c = obj;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        return new C2136w0(this.f19119a, this.f19120b, this.c, true);
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        this.f19119a.subscribe(new C2148z0(xVar, this.f19120b, this.c));
    }
}
