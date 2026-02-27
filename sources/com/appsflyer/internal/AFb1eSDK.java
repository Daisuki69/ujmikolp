package com.appsflyer.internal;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1eSDK {

    @Nullable
    public static Application AFInAppEventParameterName;
    public long AFInAppEventType;

    @NonNull
    public String AFKeystoreWrapper;

    @Nullable
    public String AFLogger;
    public int afDebugLog;

    @Nullable
    public Throwable afErrorLog;

    @Nullable
    public AFf1ySDK afRDLog;

    @Nullable
    public String valueOf;
    public long values;

    public AFb1eSDK() {
    }

    public AFb1eSDK(String str, String str2, long j, long j6, int i, AFf1ySDK aFf1ySDK, String str3, Throwable th2) {
        this.valueOf = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = j;
        this.values = j6;
        this.afDebugLog = i;
        this.afRDLog = aFf1ySDK;
        this.AFLogger = str3;
        this.afErrorLog = th2;
    }
}
