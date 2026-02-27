package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1aSDK extends AFa1tSDK {

    @Nullable
    public final AFd1uSDK afErrorLogForExcManagerOnly;

    @Deprecated
    public AFe1aSDK() {
        this.afErrorLogForExcManagerOnly = null;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFd1uSDK AFKeystoreWrapper() {
        AFd1uSDK aFd1uSDK = this.afErrorLogForExcManagerOnly;
        return aFd1uSDK != null ? aFd1uSDK : AFd1uSDK.CACHED_EVENT;
    }

    public AFe1aSDK(String str, byte[] bArr, String str2, @Nullable AFd1uSDK aFd1uSDK) {
        super(null, str, Boolean.FALSE, null);
        this.afDebugLog = str2;
        values(bArr);
        this.afErrorLogForExcManagerOnly = aFd1uSDK;
    }
}
