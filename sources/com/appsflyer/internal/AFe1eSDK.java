package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1eSDK extends AFa1tSDK {
    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFd1uSDK AFKeystoreWrapper() {
        return this.afRDLog == 1 ? AFd1uSDK.CONVERSION : AFd1uSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean AFLogger() {
        return true;
    }
}
