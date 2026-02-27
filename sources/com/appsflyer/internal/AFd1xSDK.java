package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public interface AFd1xSDK {
    @WorkerThread
    void AFInAppEventType(@NonNull AFd1wSDK<?> aFd1wSDK);

    @WorkerThread
    void AFInAppEventType(@NonNull AFd1wSDK<?> aFd1wSDK, @NonNull AFd1tSDK aFd1tSDK);

    @WorkerThread
    void valueOf(@NonNull AFd1wSDK<?> aFd1wSDK);
}
