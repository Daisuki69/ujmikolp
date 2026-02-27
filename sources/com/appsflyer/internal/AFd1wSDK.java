package com.appsflyer.internal;

import We.s;
import android.net.TrafficStats;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.dynatrace.android.agent.Global;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1wSDK<Result> implements Comparable<AFd1wSDK<?>>, Callable<AFd1tSDK> {
    private static final AtomicInteger afRDLog = new AtomicInteger();

    @NonNull
    public final Set<AFd1uSDK> AFInAppEventParameterName;

    @NonNull
    public final Set<AFd1uSDK> AFInAppEventType;

    @NonNull
    public final AFd1uSDK AFKeystoreWrapper;
    private final String AFLogger;
    private long afDebugLog;
    private final int afErrorLog;

    @Nullable
    private Throwable afInfoLog;
    private boolean afWarnLog;
    public volatile int valueOf;

    @Nullable
    public AFd1tSDK values;

    public AFd1wSDK(@NonNull AFd1uSDK aFd1uSDK, @NonNull AFd1uSDK[] aFd1uSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        this.AFInAppEventType = new HashSet();
        int iIncrementAndGet = afRDLog.incrementAndGet();
        this.afErrorLog = iIncrementAndGet;
        this.afWarnLog = false;
        this.valueOf = 0;
        this.AFKeystoreWrapper = aFd1uSDK;
        Collections.addAll(hashSet, aFd1uSDKArr);
        if (str != null) {
            this.AFLogger = str;
        } else {
            this.AFLogger = String.valueOf(iIncrementAndGet);
        }
    }

    @WorkerThread
    public abstract boolean AFInAppEventParameterName();

    @WorkerThread
    public void AFInAppEventType() {
    }

    @CallSuper
    @WorkerThread
    public void AFKeystoreWrapper() {
        this.afWarnLog = true;
    }

    public final boolean AFLogger() {
        return this.afWarnLog;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: afDebugLog, reason: merged with bridge method [inline-methods] */
    public final AFd1tSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.values = null;
        this.afInfoLog = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.valueOf++;
        try {
            AFd1tSDK aFd1tSDKValues = values();
            this.values = aFd1tSDKValues;
            return aFd1tSDKValues;
        } finally {
        }
    }

    @Nullable
    public final Throwable afRDLog() {
        return this.afInfoLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1wSDK aFd1wSDK = (AFd1wSDK) obj;
        if (this.AFKeystoreWrapper != aFd1wSDK.AFKeystoreWrapper) {
            return false;
        }
        return this.AFLogger.equals(aFd1wSDK.AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode() + (this.AFKeystoreWrapper.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(Global.HYPHEN);
        sb2.append(this.AFLogger);
        String string = sb2.toString();
        if (String.valueOf(this.afErrorLog).equals(this.AFLogger)) {
            return string;
        }
        StringBuilder sbV = s.v(string, Global.HYPHEN);
        sbV.append(this.afErrorLog);
        return sbV.toString();
    }

    public abstract long valueOf();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFd1wSDK<?> aFd1wSDK) {
        int i = this.AFKeystoreWrapper.AppsFlyer2dXConversionCallback - aFd1wSDK.AFKeystoreWrapper.AppsFlyer2dXConversionCallback;
        if (i != 0) {
            return i;
        }
        if (this.AFLogger.equals(aFd1wSDK.AFLogger)) {
            return 0;
        }
        return this.afErrorLog - aFd1wSDK.afErrorLog;
    }

    @NonNull
    @WorkerThread
    public abstract AFd1tSDK values() throws Exception;

    @WorkerThread
    public void AFInAppEventType(Throwable th2) {
    }
}
