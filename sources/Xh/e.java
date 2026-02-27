package Xh;

import bi.AbstractC1029g;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1029g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Qi.c f6636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6637b;

    public e(Qi.c cVar, long j) {
        this.f6636a = cVar;
        this.f6637b = j;
    }

    @Override // bi.AbstractC1029g
    public final void a() {
        this.f6636a.e(System.currentTimeMillis() - this.f6637b);
    }
}
