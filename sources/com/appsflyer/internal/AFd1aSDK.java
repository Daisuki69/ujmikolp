package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1aSDK extends AFd1nSDK<String> {
    private final Map<String, Object> afRDLog;

    public AFd1aSDK(@NonNull Map<String, Object> map, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1uSDK.MONITORSDK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, String.valueOf(map.hashCode()));
        this.afRDLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFd1nSDK) this).afInfoLog.values(this.afRDLog);
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
}
