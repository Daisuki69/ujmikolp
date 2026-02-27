package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1zSDK extends AFe1dSDK {
    public AFf1zSDK(@NonNull Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFa1tSDK AFInAppEventParameterName(String str) {
        return super.AFInAppEventParameterName(values(str));
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFd1uSDK AFKeystoreWrapper() {
        return AFd1uSDK.PURCHASE_VALIDATE;
    }
}
