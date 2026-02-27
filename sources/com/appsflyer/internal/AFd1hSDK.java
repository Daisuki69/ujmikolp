package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1xSDK;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public class AFd1hSDK extends AFd1nSDK<String> {
    private static final AFd1uSDK[] getLevel = {AFd1uSDK.DLSDK, AFd1uSDK.ONELINK, AFd1uSDK.MONITORSDK, AFd1uSDK.REGISTER};

    @NonNull
    private final AFb1bSDK AFLogger$LogLevel;
    private final AFd1ySDK AFVersionDeclaration;
    protected final AFb1gSDK afErrorLogForExcManagerOnly;
    public final AFa1tSDK afRDLog;
    private final AFb1tSDK afWarnLog;

    public AFd1hSDK(@NonNull AFa1tSDK aFa1tSDK, @NonNull AFc1zSDK aFc1zSDK) {
        this(aFa1tSDK, aFc1zSDK, null);
    }

    @NonNull
    private static Map<String, Object> AFKeystoreWrapper(AFa1tSDK aFa1tSDK) {
        Map<String, Object> map = (Map) aFa1tSDK.values().get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFa1tSDK.values().put("meta", map2);
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    @Override // com.appsflyer.internal.AFd1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFc1iSDK<java.lang.String> AFInAppEventParameterName(java.lang.String r17) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1hSDK.AFInAppEventParameterName(java.lang.String):com.appsflyer.internal.AFc1iSDK");
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public boolean afErrorLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return this.afRDLog.AFInAppEventType;
    }

    @CallSuper
    public void valueOf(AFa1tSDK aFa1tSDK) throws JSONException {
        if (aFa1tSDK.afInfoLog()) {
            aFa1tSDK.AFKeystoreWrapper(new AFa1xSDK.AFa1wSDK(aFa1tSDK.values(), ((AFd1nSDK) this).AFLogger.valueOf.AFKeystoreWrapper));
        }
        if (aFa1tSDK.afRDLog()) {
            aFa1tSDK.AFKeystoreWrapper((Map<String, ?>) ((AFd1nSDK) this).AFLogger.AFKeystoreWrapper());
        }
        Set<AFd1uSDK> set = this.AFInAppEventParameterName;
        boolean z4 = set.contains(AFd1uSDK.LAUNCH) || set.contains(AFd1uSDK.CONVERSION);
        if (AFLogger() && z4) {
            aFa1tSDK.AFKeystoreWrapper(this.afErrorLogForExcManagerOnly.AFKeystoreWrapper("appsFlyerCount", 0));
        }
        try {
            if (aFa1tSDK.values().containsKey("appsflyerKey") && aFa1tSDK.afInfoLog()) {
                new AFb1ySDK();
                aFa1tSDK.AFKeystoreWrapper("af_v", AFb1ySDK.AFInAppEventParameterName(aFa1tSDK.values()));
                new AFb1ySDK();
                aFa1tSDK.AFKeystoreWrapper("af_v2", AFb1ySDK.valueOf(aFa1tSDK.values()));
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th2)), th2);
        }
        if (aFa1tSDK.AFLogger()) {
            Map<String, Object> mapAFKeystoreWrapper = AFKeystoreWrapper(aFa1tSDK);
            AFd1ySDK aFd1ySDK = this.AFVersionDeclaration;
            AFc1aSDK aFc1aSDK = new AFc1aSDK(aFd1ySDK.values(), aFd1ySDK.AFInAppEventParameterName(), AFd1ySDK.valueOf() ? AFd1zSDK.DEFAULT : AFd1zSDK.API);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aFc1aSDK.values);
            AFd1zSDK aFd1zSDK = aFc1aSDK.AFInAppEventParameterName;
            if (aFd1zSDK != AFd1zSDK.DEFAULT) {
                jSONObject.put(Constants.METHOD, aFd1zSDK.AFInAppEventType);
            }
            String str = aFc1aSDK.AFKeystoreWrapper;
            if (str != null && !C2576A.H(str)) {
                jSONObject.put("prefix", aFc1aSDK.AFKeystoreWrapper);
            }
            mapAFKeystoreWrapper.put("host", jSONObject);
        }
        if (this.AFLogger$LogLevel.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
            AFKeystoreWrapper(aFa1tSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1hSDK(@NonNull AFa1tSDK aFa1tSDK, @NonNull AFc1zSDK aFc1zSDK, String str) {
        super(aFa1tSDK.AFKeystoreWrapper(), new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, str);
        this.afRDLog = aFa1tSDK;
        this.AFVersionDeclaration = aFc1zSDK.AppsFlyer2dXConversionCallback();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.afDebugLog();
        this.afWarnLog = aFc1zSDK.afInfoLog();
        this.AFLogger$LogLevel = aFc1zSDK.valueOf();
        for (AFd1uSDK aFd1uSDK : getLevel) {
            if (this.AFKeystoreWrapper == aFd1uSDK) {
                return;
            }
        }
        int i = this.afRDLog.afRDLog;
        AFd1uSDK aFd1uSDK2 = this.AFKeystoreWrapper;
        if (i > 0) {
            this.AFInAppEventType.add(AFd1uSDK.CONVERSION);
            return;
        }
        AFd1uSDK aFd1uSDK3 = AFd1uSDK.CONVERSION;
        if (aFd1uSDK2 != aFd1uSDK3) {
            this.AFInAppEventParameterName.add(aFd1uSDK3);
        }
    }
}
