package bf;

import A7.g;
import M8.A0;
import pg.r;
import pg.t;

/* JADX INFO: renamed from: bf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0949b extends A0 {
    public final g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f8646d;

    public C0949b(r rVar, t tVar) {
        super(12);
        this.f8646d = rVar;
        this.c = new g(tVar);
    }

    @Override // M8.A0
    public final Object l(String str) {
        return this.f8646d.a(str);
    }

    @Override // M8.A0
    public final String n() {
        return this.f8646d.f19112a;
    }

    @Override // M8.A0
    public final InterfaceC0950c q() {
        return this.c;
    }

    @Override // M8.A0
    public final boolean s() {
        return this.f8646d.b("transactionId");
    }
}
