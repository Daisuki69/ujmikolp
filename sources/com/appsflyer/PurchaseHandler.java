package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFd1vSDK AFInAppEventType;

    @NonNull
    private final AFb1bSDK valueOf;

    @NonNull
    public final AFc1zSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1zSDK aFc1zSDK) {
        this.values = aFc1zSDK;
        this.valueOf = aFc1zSDK.valueOf();
        this.AFInAppEventType = aFc1zSDK.AFLogger();
    }

    public final boolean AFInAppEventParameterName(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean zAFInAppEventParameterName = AFb1ySDK.AFInAppEventParameterName(map, strArr, this.valueOf);
        if (!zAFInAppEventParameterName && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zAFInAppEventParameterName;
    }
}
