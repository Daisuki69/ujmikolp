package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1uSDK implements AFb1rSDK {
    private static int AFLogger$LogLevel = 1;
    private static char afErrorLog = 3;
    private static char[] afInfoLog = {4, 3, 1, 13822, 2, 13819, 13812, 13800, 13816};
    private static int getLevel;
    private final String values = "yyyy-MM-dd HH:mm:ssZ";
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFKeystoreWrapper = true;

    @NonNull
    private final Map<String, Object> AFInAppEventParameterName = new HashMap();
    private String AFLogger = "-1";
    private boolean afRDLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int valueOf = 0;
    private boolean afDebugLog = false;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFLogger() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel
            int r0 = r0 + 79
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L30
            boolean r0 = r4.afRDLog
            r2 = 0
            if (r0 == 0) goto L2f
            int r1 = r1 + 59
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel = r0
            int r1 = r1 % 2
            r0 = 1
            if (r1 != 0) goto L24
            boolean r1 = r4.AFKeystoreWrapper
            r3 = 81
            int r3 = r3 / r2
            if (r1 != 0) goto L2e
            goto L2a
        L24:
            boolean r1 = r4.AFKeystoreWrapper
            r1 = r1 ^ r0
            if (r1 == r0) goto L2a
            goto L2e
        L2a:
            boolean r1 = r4.afDebugLog
            if (r1 == 0) goto L2f
        L2e:
            return r0
        L2f:
            return r2
        L30:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.AFLogger():boolean");
    }

    private synchronized void afDebugLog() {
        this.AFInAppEventType = new ArrayList();
        this.valueOf = 0;
        AFLogger$LogLevel = (getLevel + 57) % 128;
    }

    @NonNull
    private synchronized Map<String, Object> afRDLog() {
        Map<String, Object> map;
        AFLogger$LogLevel = (getLevel + 65) % 128;
        this.AFInAppEventParameterName.put("data", this.AFInAppEventType);
        afDebugLog();
        map = this.AFInAppEventParameterName;
        int i = getLevel + 121;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        return map;
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    try {
                        AFLogger$LogLevel = (getLevel + 51) % 128;
                        this.AFInAppEventParameterName.put("app_id", str);
                    } finally {
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFInAppEventParameterName.put("app_version", str2);
        }
        if (str3 != null) {
            getLevel = (AFLogger$LogLevel + 83) % 128;
            if (str3.length() > 0) {
                getLevel = (AFLogger$LogLevel + 47) % 128;
                this.AFInAppEventParameterName.put(AppsFlyerProperties.CHANNEL, str3);
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.AFInAppEventParameterName.put("preInstall", str4);
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final synchronized void AFInAppEventParameterName() {
        getLevel = (AFLogger$LogLevel + 47) % 128;
        this.AFInAppEventParameterName.clear();
        this.AFInAppEventType.clear();
        this.valueOf = 0;
        int i = getLevel + 61;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            int i4 = 99 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final synchronized void AFInAppEventType() {
        AFKeystoreWrapper("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.afDebugLog = false;
        this.AFKeystoreWrapper = false;
        int i = AFLogger$LogLevel + 59;
        getLevel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final synchronized void AFKeystoreWrapper(String str) {
        int i = (AFLogger$LogLevel + 105) % 128;
        getLevel = i;
        this.AFLogger = str;
        int i4 = i + 37;
        AFLogger$LogLevel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final boolean afInfoLog() {
        int i = getLevel;
        int i4 = i + 17;
        AFLogger$LogLevel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z4 = this.afDebugLog;
        AFLogger$LogLevel = (i + 49) % 128;
        return z4;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final synchronized void valueOf() {
        this.afDebugLog = true;
        AFKeystoreWrapper("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        AFLogger$LogLevel = (getLevel + 79) % 128;
    }

    @VisibleForTesting
    private Map<String, Object> AFKeystoreWrapper(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        getLevel = (AFLogger$LogLevel + 125) % 128;
        values(str, packageManager, aFc1zSDK.afWarnLog());
        Map<String, Object> mapAfRDLog = afRDLog();
        getLevel = (AFLogger$LogLevel + 45) % 128;
        return mapAfRDLog;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:5:0x000d, B:11:0x002b, B:13:0x0031, B:17:0x003d, B:19:0x0043, B:21:0x004c, B:25:0x005e, B:26:0x0067, B:27:0x0070, B:8:0x001a), top: B:37:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void valueOf(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = com.appsflyer.internal.AFb1uSDK.getLevel     // Catch: java.lang.Throwable -> L39
            int r0 = r0 + 113
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel = r1     // Catch: java.lang.Throwable -> L39
            int r0 = r0 % 2
            if (r0 != 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L7b
            r3 = 7
            int r3 = r3 / 0
            if (r4 == 0) goto L3b
            goto L23
        L1a:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L3b
        L23:
            int r3 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 9
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r3     // Catch: java.lang.Throwable -> L39
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L7b
            if (r3 <= 0) goto L3b
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "devkey"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L7b
            goto L3b
        L39:
            r3 = move-exception
            goto L7d
        L3b:
            if (r5 == 0) goto L4a
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L7b
            if (r3 <= 0) goto L4a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "originalAppsFlyerId"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L7b
        L4a:
            if (r6 == 0) goto L71
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L7b
            if (r3 <= 0) goto L71
            int r3 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 17
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r4     // Catch: java.lang.Throwable -> L39
            int r3 = r3 % 2
            if (r3 != 0) goto L67
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L7b
            goto L71
        L67:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L7b
        L71:
            int r3 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 63
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r3     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            return
        L7b:
            monitor-exit(r2)
            return
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.valueOf(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        int i = AFLogger$LogLevel + 21;
        getLevel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        int i4 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i4 < stackTraceElementArr.length) {
            strArr[i4] = stackTraceElementArr[i4].toString();
            i4++;
            getLevel = (AFLogger$LogLevel + 105) % 128;
        }
        return strArr;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void AFInAppEventParameterName(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        try {
            AFd1aSDK aFd1aSDK = new AFd1aSDK(AFKeystoreWrapper(str, packageManager, aFc1zSDK), aFc1zSDK);
            AFd1vSDK aFd1vSDKAFLogger = aFc1zSDK.AFLogger();
            aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1aSDK));
            AFLogger$LogLevel = (getLevel + 39) % 128;
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void AFKeystoreWrapper(String str, String... strArr) {
        int i = AFLogger$LogLevel + 115;
        getLevel = i % 128;
        int i4 = i % 2;
        AFKeystoreWrapper("public_api_call", str, strArr);
        if (i4 != 0) {
            int i6 = 2 / 0;
        }
        getLevel = (AFLogger$LogLevel + 37) % 128;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String... strArr) {
        String string;
        getLevel = (AFLogger$LogLevel + 67) % 128;
        if (!AFLogger() || this.valueOf >= 98304) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strJoin = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jCurrentTimeMillis);
                sb2.append(Global.BLANK);
                sb2.append(Thread.currentThread().getId());
                sb2.append(" _/AppsFlyer_6.10.1 [");
                sb2.append(str);
                sb2.append("] ");
                sb2.append(str2);
                sb2.append(Global.BLANK);
                sb2.append(strJoin);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(jCurrentTimeMillis);
                sb3.append(Global.BLANK);
                sb3.append(Thread.currentThread().getId());
                sb3.append(Global.BLANK);
                sb3.append(str2);
                sb3.append("/AppsFlyer_6.10.1 ");
                sb3.append(strJoin);
                string = sb3.toString();
            }
            this.AFInAppEventType.add(string);
            this.valueOf += string.length() << 1;
            int i = AFLogger$LogLevel + 83;
            getLevel = i % 128;
            if (i % 2 != 0) {
                int i4 = 78 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFInAppEventParameterName;
            Object[] objArr = new Object[1];
            AFKeystoreWrapper((ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, "\u0006\b\u0003\b㘳", (byte) (52 - MotionEvent.axisFromString("")), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFInAppEventParameterName.put("model", Build.MODEL);
            this.AFInAppEventParameterName.put("platform", EventMetricsAggregator.OS_NAME);
            this.AFInAppEventParameterName.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    int i = AFLogger$LogLevel + 25;
                    getLevel = i % 128;
                    if (i % 2 == 0) {
                        if (str.length() > 0) {
                            AFLogger$LogLevel = (getLevel + 55) % 128;
                            this.AFInAppEventParameterName.put("advertiserId", str);
                        }
                    } else {
                        str.length();
                        throw null;
                    }
                } finally {
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventParameterName.put("imei", str2);
            }
            if (str3 != null) {
                AFLogger$LogLevel = (getLevel + 39) % 128;
                if (str3.length() > 0) {
                    this.AFInAppEventParameterName.put("android_id", str3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void values(String str, String str2) {
        int i = getLevel + 9;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            AFKeystoreWrapper("server_request", str, str2);
            return;
        }
        String[] strArr = new String[1];
        strArr[1] = str2;
        AFKeystoreWrapper("server_request", str, strArr);
    }

    private synchronized void values(String str, PackageManager packageManager, AFe1sSDK aFe1sSDK) {
        AFLogger$LogLevel = (getLevel + 21) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.AFInAppEventParameterName.clear();
        if (string != null) {
            try {
                this.AFInAppEventParameterName.putAll(AFa1mSDK.valueOf(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            AFb1wSDK aFb1wSDKAFKeystoreWrapper = AFb1wSDK.AFKeystoreWrapper();
            AFInAppEventParameterName(appsFlyerProperties.getString("advertiserId"), aFe1sSDK.AFKeystoreWrapper, aFb1wSDKAFKeystoreWrapper.AFLogger);
            StringBuilder sb2 = new StringBuilder("6.10.1.");
            sb2.append(AFb1wSDK.valueOf);
            valueOf(sb2.toString(), aFb1wSDKAFKeystoreWrapper.valueOf().afWarnLog().AFInAppEventParameterName, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i = packageManager.getPackageInfo(str, 0).versionCode;
                values(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFInAppEventParameterName).toString());
            AFLogger$LogLevel = (getLevel + 67) % 128;
        }
        this.AFInAppEventParameterName.put("launch_counter", this.AFLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[PHI: r0 r1
  0x0043: PHI (r0v10 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r0 r1
  0x002d: PHI (r0v4 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v11 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFb1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void valueOf(java.lang.Throwable r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1f
            java.lang.Throwable r0 = r5.getCause()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r2 = 56
            int r2 = r2 / 0
            if (r0 != 0) goto L43
            goto L2d
        L1f:
            java.lang.Throwable r0 = r5.getCause()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            if (r0 != 0) goto L43
        L2d:
            int r2 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L3e
            java.lang.String r2 = r5.getMessage()
            goto L47
        L3e:
            r5.getMessage()
            r5 = 0
            throw r5
        L43:
            java.lang.String r2 = r0.getMessage()
        L47:
            if (r0 != 0) goto L4e
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            goto L5a
        L4e:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r0 = com.appsflyer.internal.AFb1uSDK.AFLogger$LogLevel
            int r0 = r0 + 121
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1uSDK.getLevel = r0
        L5a:
            java.lang.String[] r5 = AFInAppEventType(r2, r5)
            java.lang.String r0 = "exception"
            r4.AFKeystoreWrapper(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.valueOf(java.lang.Throwable):void");
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final synchronized void AFKeystoreWrapper() {
        try {
            int i = getLevel + 119;
            AFLogger$LogLevel = i % 128;
            if (i % 2 == 0) {
                this.AFKeystoreWrapper = true;
            } else {
                this.AFKeystoreWrapper = false;
            }
            afDebugLog();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void AFKeystoreWrapper(int i, String str, byte b8, Object[] objArr) {
        int i4;
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1zSDK.AFLogger) {
            try {
                char[] cArr2 = afInfoLog;
                char c = afErrorLog;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i4 = i - 1;
                    cArr3[i4] = (char) (cArr[i4] - b8);
                } else {
                    i4 = i;
                }
                if (i4 > 1) {
                    AFg1zSDK.valueOf = 0;
                    while (true) {
                        int i6 = AFg1zSDK.valueOf;
                        if (i6 >= i4) {
                            break;
                        }
                        AFg1zSDK.values = cArr[i6];
                        AFg1zSDK.AFInAppEventType = cArr[AFg1zSDK.valueOf + 1];
                        if (AFg1zSDK.values == AFg1zSDK.AFInAppEventType) {
                            cArr3[AFg1zSDK.valueOf] = (char) (AFg1zSDK.values - b8);
                            cArr3[AFg1zSDK.valueOf + 1] = (char) (AFg1zSDK.AFInAppEventType - b8);
                        } else {
                            AFg1zSDK.AFInAppEventParameterName = AFg1zSDK.values / c;
                            AFg1zSDK.afRDLog = AFg1zSDK.values % c;
                            AFg1zSDK.AFKeystoreWrapper = AFg1zSDK.AFInAppEventType / c;
                            AFg1zSDK.afErrorLog = AFg1zSDK.AFInAppEventType % c;
                            if (AFg1zSDK.afRDLog == AFg1zSDK.afErrorLog) {
                                AFg1zSDK.AFInAppEventParameterName = ((AFg1zSDK.AFInAppEventParameterName + c) - 1) % c;
                                AFg1zSDK.AFKeystoreWrapper = ((AFg1zSDK.AFKeystoreWrapper + c) - 1) % c;
                                int i10 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i11 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i12 = AFg1zSDK.valueOf;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            } else if (AFg1zSDK.AFInAppEventParameterName == AFg1zSDK.AFKeystoreWrapper) {
                                AFg1zSDK.afRDLog = ((AFg1zSDK.afRDLog + c) - 1) % c;
                                AFg1zSDK.afErrorLog = ((AFg1zSDK.afErrorLog + c) - 1) % c;
                                int i13 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i14 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i15 = AFg1zSDK.valueOf;
                                cArr3[i15] = cArr2[i13];
                                cArr3[i15 + 1] = cArr2[i14];
                            } else {
                                int i16 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afErrorLog;
                                int i17 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afRDLog;
                                int i18 = AFg1zSDK.valueOf;
                                cArr3[i18] = cArr2[i16];
                                cArr3[i18 + 1] = cArr2[i17];
                            }
                        }
                        AFg1zSDK.valueOf += 2;
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    cArr3[i19] = (char) (cArr3[i19] ^ 13722);
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        AFLogger$LogLevel = (getLevel + 5) % 128;
        AFKeystoreWrapper((String) null, str, str2);
        AFLogger$LogLevel = (getLevel + 69) % 128;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void valueOf(String str, int i, String str2) {
        AFLogger$LogLevel = (getLevel + 65) % 128;
        AFKeystoreWrapper("server_response", str, String.valueOf(i), str2);
        getLevel = (AFLogger$LogLevel + 27) % 128;
    }

    @Override // com.appsflyer.internal.AFb1rSDK
    public final void values() {
        int i = AFLogger$LogLevel + 9;
        getLevel = i % 128;
        this.afRDLog = i % 2 != 0;
    }
}
