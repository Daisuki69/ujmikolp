package com.paymaya.domain.store;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class T0 implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f11393b;

    public /* synthetic */ T0(U0 u0, int i) {
        this.f11392a = i;
        this.f11393b = u0;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f11392a) {
            case 0:
                this.f11393b.f11396a.X(false);
                break;
            default:
                this.f11393b.f11396a.X(true);
                break;
        }
    }
}
