package com.shield.android;

import com.shield.android.Shield;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15459b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f15460d;
    public final /* synthetic */ Shield.DeviceResultStateListener e;

    public /* synthetic */ n(Shield.DeviceResultStateListener deviceResultStateListener, f fVar, String str, HashMap map) {
        this.f15458a = 0;
        this.f15459b = fVar;
        this.f15460d = map;
        this.c = str;
        this.e = deviceResultStateListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15458a) {
            case 0:
                this.f15459b.a(this.f15460d, this.c, this.e);
                break;
            case 1:
                this.f15459b.c(this.c, this.f15460d, this.e);
                break;
            default:
                this.f15459b.b(this.c, this.f15460d, this.e);
                break;
        }
    }

    public /* synthetic */ n(f fVar, String str, HashMap map, Shield.DeviceResultStateListener deviceResultStateListener, int i) {
        this.f15458a = i;
        this.f15459b = fVar;
        this.c = str;
        this.f15460d = map;
        this.e = deviceResultStateListener;
    }
}
