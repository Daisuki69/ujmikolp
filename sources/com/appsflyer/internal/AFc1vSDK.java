package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.webkit.ProxyConfig;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public class AFc1vSDK implements AFc1oSDK, AFc1sSDK, AFd1xSDK {

    @VisibleForTesting
    private static String AFInAppEventParameterName;

    @VisibleForTesting
    private static String valueOf;

    @NonNull
    private final String AFInAppEventType;

    @NonNull
    private final String AFKeystoreWrapper;

    @NonNull
    private final Map<String, String> AFLogger;
    private int AFLogger$LogLevel;
    private boolean afDebugLog;
    private final boolean afErrorLog;
    private boolean afInfoLog;
    private boolean afRDLog;

    @Nullable
    private final byte[] values;

    public AFc1vSDK() {
    }

    public static void AFInAppEventType(String str) {
        if (valueOf == null) {
            AFKeystoreWrapper(AFb1wSDK.AFKeystoreWrapper().valueOf().afWarnLog().AFInAppEventParameterName);
        }
        String str2 = valueOf;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventParameterName));
        }
    }

    public static void AFKeystoreWrapper(String str) {
        valueOf = str;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb2.append(str.charAt(i));
            } else {
                sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        }
        AFInAppEventParameterName = sb2.toString();
    }

    @NonNull
    public String AFLogger() {
        return this.AFInAppEventType;
    }

    public boolean AFLogger$LogLevel() {
        return this.afDebugLog;
    }

    public int afDebugLog() {
        return this.AFLogger$LogLevel;
    }

    public boolean afErrorLog() {
        return this.afRDLog;
    }

    @NonNull
    public Map<String, String> afInfoLog() {
        return this.AFLogger;
    }

    public boolean afRDLog() {
        return this.afErrorLog;
    }

    public boolean afWarnLog() {
        return this.afInfoLog;
    }

    public AFc1vSDK getLevel() {
        this.afDebugLog = false;
        return this;
    }

    @Nullable
    public byte[] valueOf() {
        return this.values;
    }

    public AFc1vSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z4) {
        this.afRDLog = true;
        this.afInfoLog = false;
        this.afDebugLog = true;
        this.AFLogger$LogLevel = -1;
        this.AFKeystoreWrapper = str;
        this.values = bArr;
        this.AFInAppEventType = str2;
        this.AFLogger = map;
        this.afErrorLog = z4;
    }

    @NonNull
    public String AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    public AFc1vSDK AFKeystoreWrapper(int i) {
        this.AFLogger$LogLevel = i;
        return this;
    }

    public AFc1vSDK AFKeystoreWrapper(boolean z4) {
        this.afInfoLog = z4;
        return this;
    }

    public AFc1vSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
