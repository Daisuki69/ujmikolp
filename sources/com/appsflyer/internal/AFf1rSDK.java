package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ProviderInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 19)
public final class AFf1rSDK extends AFf1oSDK {
    private final AFc1zSDK AFInAppEventType;
    final ProviderInfo values;

    public AFf1rSDK(ProviderInfo providerInfo, Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFInAppEventType = aFc1zSDK;
        this.values = providerInfo;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void valueOf(final Context context) {
        this.AFInAppEventType.AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1rSDK.3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 356
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1rSDK.AnonymousClass3.run():void");
            }
        });
    }
}
