package Kh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2709b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nh.e f2710d;

    public Q(Ah.h hVar, long j, TimeUnit timeUnit, Nh.e eVar) {
        super(hVar);
        this.f2709b = j;
        this.c = timeUnit;
        this.f2710d = eVar;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        N n7 = new N(jVar, this.f2709b, this.c, this.f2710d.a());
        jVar.a(n7);
        io.reactivex.rxjava3.disposables.b bVarC = n7.f2706d.c(new P(0, 0L, n7), n7.f2705b, n7.c);
        Dh.d dVar = n7.e;
        dVar.getClass();
        Dh.a.c(dVar, bVarC);
        this.f2715a.g(n7);
    }
}
