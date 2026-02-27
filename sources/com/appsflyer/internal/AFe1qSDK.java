package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1qSDK extends AFa1tSDK {
    @SuppressLint({"VisibleForTests"})
    public AFe1qSDK(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFe1rSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(context.getPackageName());
        super("Register", sb2.toString(), Boolean.FALSE, context);
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFd1uSDK AFKeystoreWrapper() {
        return AFd1uSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afInfoLog() {
        return false;
    }
}
