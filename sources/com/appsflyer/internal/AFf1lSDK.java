package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1lSDK {
    public final List<AFf1oSDK> valueOf = new ArrayList();

    @NonNull
    public final synchronized AFf1oSDK[] AFInAppEventParameterName() {
        return (AFf1oSDK[]) this.valueOf.toArray(new AFf1oSDK[0]);
    }

    public final synchronized void AFKeystoreWrapper(AFf1oSDK aFf1oSDK) {
        this.valueOf.add(aFf1oSDK);
    }
}
