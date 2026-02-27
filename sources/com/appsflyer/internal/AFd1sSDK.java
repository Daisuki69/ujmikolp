package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1sSDK extends AFd1nSDK<String> {
    private final AFb1gSDK AFLogger$LogLevel;
    private final AFb1bSDK afRDLog;

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback afWarnLog;

    @NonNull
    private final Map<String, Object> getLevel;

    public AFd1sSDK(@NonNull AFd1uSDK aFd1uSDK, @NonNull AFd1uSDK[] aFd1uSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str, Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1uSDK, aFd1uSDKArr, aFc1zSDK, str);
        AFb1bSDK aFb1bSDKValueOf = aFc1zSDK.valueOf();
        this.afRDLog = aFb1bSDKValueOf;
        AFb1gSDK aFb1gSDKAfDebugLog = aFc1zSDK.afDebugLog();
        this.AFLogger$LogLevel = aFb1gSDKAfDebugLog;
        HashMap map2 = new HashMap(new HashMap(map));
        map2.put("app_id", aFb1bSDKValueOf.values.AFKeystoreWrapper.getPackageName());
        String strValueOf = AFb1bSDK.valueOf();
        if (strValueOf != null) {
            map2.put("cuid", strValueOf);
        }
        Context context = aFb1bSDKValueOf.values.AFKeystoreWrapper;
        map2.put("app_version_name", AFa1cSDK.AFInAppEventType(context, context.getPackageName()));
        HashMap map3 = new HashMap();
        AFc1oSDK.AFa1vSDK aFa1vSDKAFKeystoreWrapper = AFa1eSDK.AFKeystoreWrapper(aFb1bSDKValueOf.values.AFKeystoreWrapper, new HashMap());
        String str2 = aFa1vSDKAFKeystoreWrapper != null ? aFa1vSDKAFKeystoreWrapper.AFInAppEventParameterName : null;
        if (!AFb1nSDK.values(str2)) {
            map3.put("advertising_id", str2);
        }
        AFc1oSDK.AFa1vSDK aFa1vSDKValueOf = AFa1eSDK.valueOf(aFb1bSDKValueOf.values.AFKeystoreWrapper.getContentResolver());
        String str3 = aFa1vSDKValueOf != null ? aFa1vSDKValueOf.AFInAppEventParameterName : null;
        if (!AFb1nSDK.values(str3)) {
            map3.put("oaid", str3);
        }
        AFc1oSDK.AFa1vSDK aFa1vSDKValueOf2 = AFa1eSDK.valueOf(aFb1bSDKValueOf.values.AFKeystoreWrapper.getContentResolver());
        String str4 = aFa1vSDKValueOf2 != null ? aFa1vSDKValueOf2.AFInAppEventParameterName : null;
        if (!AFb1nSDK.values(str4)) {
            map3.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String strValues = ((AFd1nSDK) this).AFLogger.values(aFb1gSDKAfDebugLog);
            if (!AFb1nSDK.values(strValues)) {
                map3.put("imei", strValues);
            }
        }
        map3.put("appsflyer_id", AFb1zSDK.AFInAppEventParameterName(new WeakReference(aFb1bSDKValueOf.values.AFKeystoreWrapper)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        map3.put("os_version", sb2.toString());
        map3.put("sdk_version", AFb1wSDK.AFInAppEventParameterName);
        map2.put("device_data", map3);
        this.getLevel = map2;
        this.afWarnLog = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFInAppEventType();
        Throwable thAfRDLog = afRDLog();
        if (thAfRDLog != null && (purchaseValidationCallback2 = this.afWarnLog) != null) {
            purchaseValidationCallback2.onFailure(thAfRDLog);
        }
        ResponseNetwork<String> responseNetwork = ((AFd1nSDK) this).afErrorLog;
        if (responseNetwork == null || (purchaseValidationCallback = this.afWarnLog) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return null;
    }

    @NonNull
    public final Map<String, Object> getLevel() {
        return this.getLevel;
    }
}
