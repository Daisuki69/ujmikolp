package Kh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Kh.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0304i extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2734b;
    public final Nh.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0304i(Ah.h hVar, long j, Nh.e eVar) {
        super(hVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2734b = j;
        this.c = eVar;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        Rh.a aVar = new Rh.a(jVar);
        Ah.n nVarA = this.c.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2715a.g(new C0303h(aVar, this.f2734b, nVarA));
    }
}
