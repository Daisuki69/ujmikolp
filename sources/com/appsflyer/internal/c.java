package com.appsflyer.internal;

import com.appsflyer.internal.AFb1wSDK;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9432b;

    public /* synthetic */ c(Object obj, int i) {
        this.f9431a = i;
        this.f9432b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9431a) {
            case 0:
                AFc1tSDK.AFInAppEventType((AFc1tSDK) this.f9432b);
                break;
            case 1:
                AFc1tSDK.AFKeystoreWrapper((AFc1tSDK) this.f9432b);
                break;
            case 2:
                AFc1tSDK.valueOf((AFc1tSDK) this.f9432b);
                break;
            default:
                ((AFb1wSDK.AnonymousClass2) this.f9432b).AFInAppEventType();
                break;
        }
    }
}
