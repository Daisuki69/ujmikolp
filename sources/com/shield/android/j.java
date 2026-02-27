package com.shield.android;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15432b;

    public /* synthetic */ j(e eVar, int i) {
        this.f15431a = i;
        this.f15432b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15431a) {
            case 0:
                this.f15432b.H();
                break;
            case 1:
                this.f15432b.K();
                break;
            case 2:
                this.f15432b.x();
                break;
            case 3:
                this.f15432b.J();
                break;
            default:
                this.f15432b.F();
                break;
        }
    }
}
