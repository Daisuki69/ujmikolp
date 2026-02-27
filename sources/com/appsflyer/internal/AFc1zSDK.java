package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1zSDK {
    @NonNull
    ExecutorService AFInAppEventParameterName();

    @NonNull
    AFd1vSDK AFLogger();

    @NonNull
    AFf1lSDK AFLogger$LogLevel();

    @NonNull
    AFc1xSDK AFVersionDeclaration();

    @NonNull
    AFd1ySDK AppsFlyer2dXConversionCallback();

    @NonNull
    AFb1gSDK afDebugLog();

    @NonNull
    PurchaseHandler afErrorLog();

    @NonNull
    AFa1mSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFb1tSDK afInfoLog();

    @NonNull
    AFe1jSDK afRDLog();

    @NonNull
    AFe1sSDK afWarnLog();

    @NonNull
    AFb1rSDK getLevel();

    @NonNull
    AFb1cSDK init();

    @NonNull
    AFc1uSDK onInstallConversionDataLoadedNative();

    @NonNull
    AFb1bSDK valueOf();

    @NonNull
    AFc1pSDK values();
}
