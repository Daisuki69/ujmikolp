package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1oSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1cSDK extends AFd1hSDK {

    @NonNull
    private final AFe1jSDK AFLogger$LogLevel;
    public Map<String, Object> AFVersionDeclaration;

    @NonNull
    private final AFf1lSDK afWarnLog;

    @NonNull
    private final AFb1gSDK getLevel;

    @NonNull
    private final AppsFlyerProperties onAppOpenAttributionNative;

    @NonNull
    private final AFb1tSDK onInstallConversionFailureNative;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1cSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFf1oSDK.AFa1zSDK.values().length];
            AFInAppEventType = iArr;
            try {
                iArr[AFf1oSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventType[AFf1oSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1cSDK(@NonNull AFa1tSDK aFa1tSDK, @NonNull AFc1zSDK aFc1zSDK) {
        super(aFa1tSDK, aFc1zSDK);
        this.afWarnLog = aFc1zSDK.AFLogger$LogLevel();
        this.getLevel = aFc1zSDK.afDebugLog();
        this.AFLogger$LogLevel = aFc1zSDK.afRDLog();
        this.onInstallConversionFailureNative = aFc1zSDK.afInfoLog();
        this.onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
        this.AFInAppEventType.add(AFd1uSDK.RESOLVE_ESP);
        this.AFInAppEventType.add(AFd1uSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1jSDK aFe1jSDK = this.AFLogger$LogLevel;
        int i = ((AFd1hSDK) this).afRDLog.afRDLog;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFe1jSDK.afRDLog;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFe1jSDK.AFKeystoreWrapper.put("net", Long.valueOf(jCurrentTimeMillis - j));
            aFe1jSDK.AFInAppEventParameterName.AFInAppEventType("first_launch", new JSONObject(aFe1jSDK.AFKeystoreWrapper).toString());
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void valueOf(AFa1tSDK aFa1tSDK) throws JSONException {
        super.valueOf(aFa1tSDK);
        int i = aFa1tSDK.afRDLog;
        this.AFLogger$LogLevel.AFInAppEventParameterName(i);
        Map map = (Map) aFa1tSDK.values().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1tSDK.values().put("meta", map);
        }
        AFb1eSDK aFb1eSDKAFInAppEventType = this.onInstallConversionFailureNative.AFInAppEventType();
        if (aFb1eSDKAFInAppEventType != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFb1eSDKAFInAppEventType.AFKeystoreWrapper);
            String str = aFb1eSDKAFInAppEventType.valueOf;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j = aFb1eSDKAFInAppEventType.AFInAppEventType;
            if (j > 0) {
                map2.put("latency", Long.valueOf(j));
            }
            long j6 = aFb1eSDKAFInAppEventType.values;
            if (j6 > 0) {
                map2.put("delay", Long.valueOf(j6));
            }
            int i4 = aFb1eSDKAFInAppEventType.afDebugLog;
            if (i4 > 0) {
                map2.put("res_code", Integer.valueOf(i4));
            }
            if (aFb1eSDKAFInAppEventType.afErrorLog != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFb1eSDKAFInAppEventType.afErrorLog.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFb1eSDKAFInAppEventType.afErrorLog.getMessage());
                map2.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, sb2.toString());
            }
            AFf1ySDK aFf1ySDK = aFb1eSDKAFInAppEventType.afRDLog;
            if (aFf1ySDK != null) {
                map2.put("sig", aFf1ySDK.toString());
            }
            String str2 = aFb1eSDKAFInAppEventType.AFLogger;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        if (i == 1) {
            if (this.onAppOpenAttributionNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1tSDK.values().put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFLogger$LogLevel.valueOf);
            this.AFLogger$LogLevel.AFInAppEventParameterName.AFInAppEventType("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFLogger$LogLevel.AFKeystoreWrapper);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
        } else if (i == 2) {
            HashMap map5 = new HashMap(this.AFLogger$LogLevel.AFKeystoreWrapper);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFLogger$LogLevel.AFInAppEventParameterName.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1tSDK.values().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFf1oSDK aFf1oSDK : this.afWarnLog.AFInAppEventParameterName()) {
                boolean z4 = aFf1oSDK instanceof AFf1qSDK;
                int i6 = AnonymousClass2.AFInAppEventType[aFf1oSDK.afRDLog.ordinal()];
                if (i6 == 1) {
                    if (z4) {
                        aFa1tSDK.AFKeystoreWrapper("rfr", ((AFf1qSDK) aFf1oSDK).AFInAppEventType);
                        this.getLevel.valueOf(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFf1oSDK.valueOf);
                } else if (i6 == 2 && i == 2 && !z4) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFf1oSDK.AFKeystoreWrapper);
                    map6.put("response", "TIMEOUT");
                    map6.put(SessionDescription.ATTR_TYPE, aFf1oSDK.AFLogger);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1tSDK.AFKeystoreWrapper("referrers", arrayList);
            }
            Object obj = this.AFVersionDeclaration;
            if (obj != null) {
                aFa1tSDK.AFKeystoreWrapper("fb_ddl", obj);
            }
        }
    }
}
