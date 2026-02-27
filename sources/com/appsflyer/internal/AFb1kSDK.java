package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFb1kSDK<T> {
    public final AFc1zSDK AFInAppEventParameterName;
    private final String[] AFInAppEventType;
    public final Context AFKeystoreWrapper;
    public final String valueOf;
    public final FutureTask<T> values = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1kSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1kSDK.this.AFInAppEventType()) {
                return (T) AFb1kSDK.this.valueOf();
            }
            return null;
        }
    });

    public AFb1kSDK(Context context, AFc1zSDK aFc1zSDK, String str, String... strArr) {
        this.AFKeystoreWrapper = context;
        this.valueOf = str;
        this.AFInAppEventType = strArr;
        this.AFInAppEventParameterName = aFc1zSDK;
    }

    public final boolean AFInAppEventType() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.AFKeystoreWrapper.getPackageManager().resolveContentProvider(this.valueOf, 128);
            if (providerInfoResolveContentProvider != null) {
                if (Arrays.asList(this.AFInAppEventType).contains(AFa1cSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return false;
        }
    }

    @Nullable
    public T AFKeystoreWrapper() {
        try {
            return this.values.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    public abstract T valueOf();
}
