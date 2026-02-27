package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1ySDK implements AFb1gSDK {
    private final SharedPreferences values;

    public AFc1ySDK(SharedPreferences sharedPreferences) {
        this.values = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final String AFInAppEventParameterName(String str, String str2) {
        try {
            return svM7M6.getString(this.values, str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventType(String str, String str2) {
        androidx.media3.datasource.cache.c.u(this.values, str, str2);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean AFKeystoreWrapper(String str) {
        try {
            return this.values.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void valueOf(String str, boolean z4) {
        androidx.camera.core.impl.a.A(this.values, str, z4);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void values(String str, long j) {
        this.values.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final long AFInAppEventParameterName(String str, long j) {
        try {
            return this.values.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final int AFKeystoreWrapper(String str, int i) {
        try {
            return this.values.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventParameterName(String str, int i) {
        this.values.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFInAppEventType(String str) {
        this.values.edit().remove(str).apply();
    }
}
