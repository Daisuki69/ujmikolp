package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1oSDK extends AFd1sSDK {
    public AFd1oSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1uSDK.ARS_VALIDATE, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.AFInAppEventType.add(AFd1uSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFd1nSDK) this).afInfoLog.AFKeystoreWrapper(getLevel(), str);
    }
}
