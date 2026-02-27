package yi;

import ki.C1781b;

/* JADX INFO: renamed from: yi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2533a implements ki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1781b f21282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ff.f f21283b;
    public ki.i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21284d;

    public C2533a(C1781b c1781b, Ff.f fVar) {
        this.f21282a = c1781b;
        this.f21283b = fVar;
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        this.f21283b.b();
        this.f21282a.k(this.f21284d);
        this.f21284d = null;
    }

    @Override // ki.e
    public final void b(Ff.f fVar) {
        this.f21284d = null;
    }

    public final void c() {
        if (this.c == null || this.f21284d != null) {
            return;
        }
        long jA = this.f21283b.a();
        Ri.a.d(String.format("Retrying reconnection in %d seconds", Long.valueOf(jA)));
        this.f21284d = this.f21282a.i(this.c, jA, this);
    }
}
