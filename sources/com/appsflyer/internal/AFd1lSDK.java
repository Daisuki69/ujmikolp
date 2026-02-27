package com.appsflyer.internal;

import We.s;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1lSDK extends AFd1sSDK {
    private final AFb1bSDK afRDLog;

    public AFd1lSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1uSDK.PURCHASE_VALIDATE, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.afRDLog = aFc1zSDK.valueOf();
        this.AFInAppEventType.add(AFd1uSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.l("https://", AppsFlyerLib.getInstance().getHostPrefix(), "viap.", AFb1wSDK.AFKeystoreWrapper().getHostName(), "/api/v1/android/validate_purchase?app_id="));
        sb2.append(this.afRDLog.values.AFKeystoreWrapper.getPackageName());
        String string = sb2.toString();
        String string2 = new JSONObject(getLevel()).toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this);
        sb3.append(": preparing data: ");
        sb3.append(string2);
        AFc1vSDK.AFInAppEventType(sb3.toString());
        ((AFd1nSDK) this).afDebugLog.values(string, string2);
        return ((AFd1nSDK) this).afInfoLog.AFInAppEventType(getLevel(), str);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).afErrorLog;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }
}
