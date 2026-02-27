package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import bj.C1030a;
import cj.C1110A;
import cj.C1112C;
import cj.C1129o;
import cj.P;
import cj.t;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import nj.l;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class AFa1eSDK implements AFc1sSDK {
    static String valueOf;

    @Nullable
    static Boolean values;
    private final AFc1xSDK AFInAppEventParameterName;

    public AFa1eSDK() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFc1oSDK.AFa1vSDK AFInAppEventParameterName(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.AFa1eSDK.valueOf
            r2 = 1
            if (r1 == 0) goto Lb
            r3 = r2
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = 0
            if (r3 == 0) goto L11
        Lf:
            r5 = r4
            goto L53
        L11:
            java.lang.Boolean r1 = com.appsflyer.internal.AFa1eSDK.values
            if (r1 == 0) goto L1b
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
        L1b:
            java.lang.Boolean r1 = com.appsflyer.internal.AFa1eSDK.values
            if (r1 != 0) goto L51
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L51
        L27:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L46
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L46
            boolean r5 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L46
            r1.setLogging(r5)     // Catch: java.lang.Throwable -> L46
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L51
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r5 = r5.getLat()     // Catch: java.lang.Throwable -> L43
            r1 = r0
            goto L53
        L43:
            r5 = move-exception
            r1 = r0
            goto L48
        L46:
            r5 = move-exception
            r1 = r4
        L48:
            java.lang.String r0 = "No OAID library"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto Lf
        L51:
            r5 = r4
            r1 = r5
        L53:
            if (r1 == 0) goto L61
            com.appsflyer.internal.AFc1oSDK$AFa1vSDK r0 = new com.appsflyer.internal.AFc1oSDK$AFa1vSDK
            r0.<init>(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.AFKeystoreWrapper = r5
            return r0
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1eSDK.AFInAppEventParameterName(android.content.Context):com.appsflyer.internal.AFc1oSDK$AFa1vSDK");
    }

    private File AFInAppEventType() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static AFc1oSDK.AFa1vSDK AFKeystoreWrapper(Context context, Map<String, Object> map) {
        int iIsGooglePlayServicesAvailable;
        boolean z4;
        Throwable th2;
        Boolean bool;
        Boolean boolValueOf;
        AdvertisingIdClient.Info advertisingIdInfo;
        String str = null;
        if (!valueOf()) {
            return null;
        }
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder sb2 = new StringBuilder();
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th3);
            iIsGooglePlayServicesAvailable = -1;
        }
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Throwable th4) {
            z4 = false;
            th2 = th4;
            bool = null;
        }
        if (advertisingIdInfo == null) {
            sb2.append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        }
        String string = advertisingIdInfo.getId();
        try {
            boolValueOf = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
            if (string != null) {
                try {
                    if (string.length() == 0) {
                        sb2.append("emptyOrNull |");
                    }
                    z4 = true;
                } catch (Throwable th5) {
                    bool = boolValueOf;
                    str = string;
                    th2 = th5;
                    z4 = true;
                    AFLogger.afErrorLog(th2.getMessage(), th2);
                    sb2.append(th2.getClass().getSimpleName());
                    sb2.append(" |");
                    AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                    if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                        try {
                            AFa1fSDK.AFa1xSDK aFa1xSDKAFInAppEventParameterName = AFa1fSDK.AFInAppEventParameterName(context);
                            String str2 = aFa1xSDKAFInAppEventParameterName.AFInAppEventType;
                            boolValueOf = Boolean.valueOf(aFa1xSDKAFInAppEventParameterName.values());
                            if (str2 == null || str2.length() == 0) {
                                sb2.append("emptyOrNull (bypass) |");
                            }
                            string = str2;
                        } catch (Throwable th6) {
                            AFLogger.afErrorLog(th6.getMessage(), th6, true, false, false);
                            sb2.append(th6.getClass().getSimpleName());
                            sb2.append(" |");
                            string = AppsFlyerProperties.getInstance().getString("advertiserId");
                            Boolean boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                            if (th6.getLocalizedMessage() != null) {
                                AFLogger.afInfoLog(th6.getLocalizedMessage());
                            } else {
                                AFLogger.afInfoLog(th6.toString());
                            }
                            boolValueOf = boolValueOf2;
                        }
                    } else {
                        string = str;
                        boolValueOf = bool;
                    }
                }
            } else {
                sb2.append("emptyOrNull |");
                z4 = true;
            }
        } catch (Throwable th7) {
            bool = null;
            str = string;
            th2 = th7;
            z4 = false;
        }
        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
            string = AppsFlyerProperties.getInstance().getString("advertiserId");
            boolValueOf = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
            sb2.append("context = android.app.ReceiverRestrictedContext |");
        }
        if (sb2.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iIsGooglePlayServicesAvailable);
            sb3.append(": ");
            sb3.append((Object) sb2);
            map.put("gaidError", sb3.toString());
        }
        if (string != null && boolValueOf != null) {
            map.put("advertiserId", string);
            map.put("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
            AppsFlyerProperties.getInstance().set("advertiserId", string);
            AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf.booleanValue()));
            map.put("isGaidWithGps", String.valueOf(z4));
        }
        return new AFc1oSDK.AFa1vSDK(string, boolValueOf);
    }

    private File afInfoLog() {
        File fileAFInAppEventType = AFInAppEventType();
        if (fileAFInAppEventType == null) {
            return null;
        }
        File file = new File(fileAFInAppEventType, "6.10.1");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static AFc1oSDK.AFa1vSDK valueOf(ContentResolver contentResolver) {
        String string;
        if (!valueOf() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFc1oSDK.AFa1vSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
            string = "";
        }
        return new AFc1oSDK.AFa1vSDK(string, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final String values(Throwable th2, String str) {
        String str2;
        AFc1wSDK aFc1wSDKAFKeystoreWrapper;
        j.g(th2, "");
        j.g(str, "");
        synchronized (this) {
            try {
                File fileAfInfoLog = afInfoLog();
                str2 = null;
                if (fileAfInfoLog != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(th2.getClass().getName());
                        sb2.append(": ");
                        sb2.append(str);
                        String string = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(th2);
                        sb3.append('\n');
                        sb3.append(C1110A.F(AFc1qSDK.valueOf(th2), Global.NEWLINE, null, null, AFc1qSDK.AnonymousClass5.AFInAppEventType, 30));
                        AFc1wSDK aFc1wSDK = new AFc1wSDK(string, AFc1oSDK.AFa1vSDK.AFInAppEventParameterName(sb3.toString()), C1030a.b(th2), 0, 8, null);
                        String str3 = aFc1wSDK.AFKeystoreWrapper;
                        File file = new File(fileAfInfoLog, str3);
                        if (file.exists() && (aFc1wSDKAFKeystoreWrapper = AFc1wSDK.AFa1vSDK.AFKeystoreWrapper(nj.j.b(file))) != null) {
                            aFc1wSDKAFKeystoreWrapper.AFInAppEventType++;
                            aFc1wSDK = aFc1wSDKAFKeystoreWrapper;
                        }
                        StringBuilder sb4 = new StringBuilder("label=");
                        sb4.append(AFc1oSDK.AFa1vSDK.AFKeystoreWrapper(aFc1wSDK.valueOf));
                        sb4.append("\nhashName=");
                        sb4.append(AFc1oSDK.AFa1vSDK.AFKeystoreWrapper(aFc1wSDK.AFKeystoreWrapper));
                        sb4.append("\nstackTrace=");
                        sb4.append(AFc1oSDK.AFa1vSDK.AFKeystoreWrapper(aFc1wSDK.AFInAppEventParameterName));
                        sb4.append("\nc=");
                        sb4.append(aFc1wSDK.AFInAppEventType);
                        nj.j.c(file, sb4.toString());
                        str2 = str3;
                    } catch (Exception e) {
                        StringBuilder sb5 = new StringBuilder("Could not cache exception\n");
                        StringBuilder sb6 = new StringBuilder(Global.BLANK);
                        sb6.append(e.getMessage());
                        String string2 = sb6.toString();
                        j.g(string2, "");
                        sb5.append("[Exception Manager]: ".concat(string2));
                        AFLogger.afRDLog(sb5.toString());
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str2;
    }

    public AFa1eSDK(AFc1xSDK aFc1xSDK) {
        j.g(aFc1xSDK, "");
        this.AFInAppEventParameterName = aFc1xSDK;
    }

    private static boolean valueOf() {
        Boolean bool = values;
        return bool == null || bool.booleanValue();
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final List<AFc1wSDK> AFInAppEventParameterName() {
        List<AFc1wSDK> list;
        synchronized (this) {
            try {
                File fileAfInfoLog = afInfoLog();
                list = null;
                if (fileAfInfoLog != null) {
                    try {
                        File[] fileArrListFiles = fileAfInfoLog.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                AFc1wSDK.AFa1vSDK aFa1vSDK = AFc1wSDK.AFa1vSDK;
                                j.f(file, "");
                                AFc1wSDK aFc1wSDKAFKeystoreWrapper = AFc1wSDK.AFa1vSDK.AFKeystoreWrapper(nj.j.b(file));
                                if (aFc1wSDKAFKeystoreWrapper != null) {
                                    arrayList.add(aFc1wSDKAFKeystoreWrapper);
                                }
                            }
                            list = arrayList;
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Could not get stored exceptions\n ");
                        sb2.append(th2.getMessage());
                        String string = sb2.toString();
                        j.g(string, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(string));
                    }
                }
                if (list == null) {
                    list = C1112C.f9377a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final boolean AFInAppEventParameterName(String... strArr) {
        boolean zF;
        j.g(strArr, "");
        synchronized (this) {
            try {
                File fileAFInAppEventType = AFInAppEventType();
                zF = true;
                if (fileAFInAppEventType != null) {
                    if (strArr.length == 0) {
                        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions"));
                        zF = l.f(fileAFInAppEventType);
                    } else {
                        StringBuilder sb2 = new StringBuilder("delete all exceptions except for: ");
                        sb2.append(C1129o.w(strArr, ", ", null, 62));
                        String string = sb2.toString();
                        j.g(string, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(string));
                        File[] fileArrListFiles = fileAFInAppEventType.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!C1129o.p(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
                            for (File file2 : arrayList) {
                                j.f(file2, "");
                                arrayList2.add(Boolean.valueOf(l.f(file2)));
                            }
                            Set setZ = C1110A.Z(arrayList2);
                            if (setZ.isEmpty()) {
                                setZ = P.b(Boolean.TRUE);
                            }
                            if (setZ.size() != 1 || !((Boolean) C1110A.z(setZ)).booleanValue()) {
                                zF = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zF;
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final boolean values() {
        return AFInAppEventParameterName(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final int AFKeystoreWrapper() {
        Iterator<T> it = AFInAppEventParameterName().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1wSDK) it.next()).AFInAppEventType;
        }
        return i;
    }
}
