package Kh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Ah.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nh.e f2769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2770b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2771d;

    public x(long j, long j6, long j7, Nh.e eVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = j6;
        this.f2771d = j7;
        this.f2769a = eVar;
        this.f2770b = j;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        w wVar = new w(jVar, this.f2770b);
        jVar.a(wVar);
        Dh.a.d(wVar, this.f2769a.d(wVar, this.c, this.f2771d, TimeUnit.SECONDS));
    }
}
