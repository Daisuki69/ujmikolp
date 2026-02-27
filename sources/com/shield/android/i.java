package com.shield.android;

import com.shield.android.Shield;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements com.shield.android.d.h, com.shield.android.d.a, com.shield.android.d.f, Shield.DeviceResultStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15406b;

    public /* synthetic */ i(e eVar, int i) {
        this.f15405a = i;
        this.f15406b = eVar;
    }

    @Override // com.shield.android.Shield.DeviceResultStateListener
    public void isReady() {
        this.f15406b.G();
    }

    @Override // com.shield.android.d.a
    public void onCallStateChanged(int i) {
        this.f15406b.a(i);
    }

    @Override // com.shield.android.d.f
    public void onPingCompletion() {
        this.f15406b.I();
    }

    @Override // com.shield.android.d.h
    public void shouldSendSignature() {
        switch (this.f15405a) {
            case 0:
                this.f15406b.C();
                break;
            case 1:
                this.f15406b.B();
                break;
            case 2:
                this.f15406b.L();
                break;
            case 3:
                this.f15406b.A();
                break;
            case 4:
                this.f15406b.z();
                break;
            case 5:
                this.f15406b.y();
                break;
            case 6:
            case 7:
            case 8:
            default:
                this.f15406b.D();
                break;
            case 9:
                this.f15406b.E();
                break;
        }
    }
}
