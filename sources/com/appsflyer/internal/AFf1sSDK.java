package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFf1oSDK;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFf1sSDK extends AFf1oSDK {
    public AFf1sSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public final void AFInAppEventParameterName(Context context, AFb1kSDK<Map<String, Object>> aFb1kSDK) {
        if (AFb1wSDK.AFKeystoreWrapper().AFKeystoreWrapper(AFb1wSDK.valueOf(context), false) > 0 || !aFb1kSDK.AFInAppEventType()) {
            return;
        }
        aFb1kSDK.AFInAppEventParameterName.AFInAppEventParameterName().execute(aFb1kSDK.values);
        this.afDebugLog = System.currentTimeMillis();
        this.afRDLog = AFf1oSDK.AFa1zSDK.STARTED;
        addObserver(new AFf1oSDK.AnonymousClass2());
    }
}
