package com.shield.android;

import com.shield.android.Shield;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15457b;

    public /* synthetic */ m(Object obj, int i) {
        this.f15456a = i;
        this.f15457b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15456a) {
            case 0:
                ((f) this.f15457b).V();
                break;
            case 1:
                ((f) this.f15457b).U();
                break;
            case 2:
                ((f) this.f15457b).X();
                break;
            case 3:
                ((f) this.f15457b).W();
                break;
            default:
                ((Shield.Builder) this.f15457b).q();
                break;
        }
    }
}
