package com.shield.android.f;

import com.shield.android.ShieldCallback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15348b;
    public final /* synthetic */ ShieldCallback c;

    public /* synthetic */ i(f fVar, ShieldCallback shieldCallback, int i) {
        this.f15347a = i;
        this.f15348b = fVar;
        this.c = shieldCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15347a) {
            case 0:
                this.f15348b.e(this.c);
                break;
            case 1:
                this.f15348b.m(this.c);
                break;
            case 2:
                this.f15348b.l(this.c);
                break;
            case 3:
                this.f15348b.i(this.c);
                break;
            case 4:
                this.f15348b.h(this.c);
                break;
            case 5:
                this.f15348b.g(this.c);
                break;
            case 6:
                this.f15348b.f(this.c);
                break;
            case 7:
                this.f15348b.k(this.c);
                break;
            case 8:
                this.f15348b.j(this.c);
                break;
            default:
                this.f15348b.d(this.c);
                break;
        }
    }
}
