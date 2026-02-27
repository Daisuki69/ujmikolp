package Xh;

import bi.AbstractC1029g;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1029g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Qi.c f6638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6639b;
    public final /* synthetic */ Ni.a c;

    public f(Qi.c cVar, long j, Ni.a aVar) {
        this.f6638a = cVar;
        this.f6639b = j;
        this.c = aVar;
    }

    @Override // bi.AbstractC1029g
    public final void a() {
        this.f6638a.A(System.currentTimeMillis() - this.f6639b);
        this.c.c();
    }
}
