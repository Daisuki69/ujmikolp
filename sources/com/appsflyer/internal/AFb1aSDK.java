package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.RejectedExecutionHandlerC0746d;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1aSDK implements AFc1zSDK {
    private ExecutorService AFInAppEventParameterName;
    private ScheduledExecutorService AFKeystoreWrapper;
    private CreateOneLinkHttpTask AFLogger;
    private AFa1mSDK AFLogger$LogLevel;
    private AFf1lSDK AFVersionDeclaration;
    private AFb1cSDK AppsFlyer2dXConversionCallback;
    private AFb1tSDK afDebugLog;
    private AFb1bSDK afErrorLog;
    private AFd1vSDK afErrorLogForExcManagerOnly;
    private AFe1jSDK afInfoLog;
    private PurchaseHandler afRDLog;
    private AFe1sSDK afWarnLog;
    private AFb1rSDK getLevel;
    private AFd1ySDK onAppOpenAttributionNative;
    private AFc1tSDK onInstallConversionFailureNative;
    private ExecutorService values;
    private final int valueOf = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFc1xSDK AFInAppEventType = new AFc1xSDK();

    public static class AFa1wSDK implements ThreadFactory {
        private static final AtomicInteger AFKeystoreWrapper = new AtomicInteger();
        private final AtomicInteger AFInAppEventType = new AtomicInteger();

        public AFa1wSDK() {
            AFKeystoreWrapper.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFKeystoreWrapper.get();
            int iIncrementAndGet = this.AFInAppEventType.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i);
            sb2.append(Global.HYPHEN);
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    /* JADX INFO: renamed from: onAppOpenAttributionNative, reason: merged with bridge method [inline-methods] */
    public synchronized AFc1tSDK onInstallConversionDataLoadedNative() {
        try {
            if (this.onInstallConversionFailureNative == null) {
                this.onInstallConversionFailureNative = new AFc1tSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onInstallConversionFailureNative;
    }

    private synchronized CreateOneLinkHttpTask onInstallConversionFailureNative() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new CreateOneLinkHttpTask(new AFc1lSDK(this.valueOf), AFInAppEventParameterName());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized ExecutorService AFInAppEventParameterName() {
        try {
            if (this.values == null) {
                this.values = Executors.newCachedThreadPool();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @NonNull
    public final synchronized ExecutorService AFInAppEventType() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventParameterName;
    }

    @NonNull
    public final synchronized ScheduledExecutorService AFKeystoreWrapper() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = Executors.newScheduledThreadPool(2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFd1vSDK AFLogger() {
        try {
            if (this.afErrorLogForExcManagerOnly == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFb1aSDK.4
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1wSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0746d(1));
                this.afErrorLogForExcManagerOnly = new AFd1vSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFf1lSDK AFLogger$LogLevel() {
        try {
            if (this.AFVersionDeclaration == null) {
                this.AFVersionDeclaration = new AFf1lSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFc1xSDK AFVersionDeclaration() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFd1ySDK AppsFlyer2dXConversionCallback() {
        try {
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFd1ySDK(valueOf(), afDebugLog());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFb1gSDK afDebugLog() {
        Context context = this.AFInAppEventType.AFKeystoreWrapper;
        if (context != null) {
            return new AFc1ySDK(AFb1wSDK.valueOf(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized PurchaseHandler afErrorLog() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFa1mSDK afErrorLogForExcManagerOnly() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFa1mSDK(AFVersionDeclaration());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1tSDK afInfoLog() {
        try {
            if (this.afDebugLog == null) {
                AFe1vSDK aFe1vSDK = new AFe1vSDK(afDebugLog());
                this.afDebugLog = new AFb1tSDK(new AFe1wSDK(), valueOf(), afWarnLog(), aFe1vSDK, new AFc1pSDK(onInstallConversionFailureNative(), valueOf(), AppsFlyerProperties.getInstance(), AppsFlyer2dXConversionCallback()), new AFe1pSDK(valueOf(), aFe1vSDK), AFLogger());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFe1jSDK afRDLog() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFe1jSDK(afDebugLog());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFe1sSDK afWarnLog() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFe1sSDK(AFVersionDeclaration(), new AFe1tSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFb1rSDK getLevel() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFb1uSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFb1cSDK init() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new AFa1zSDK();
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1bSDK valueOf() {
        try {
            if (this.afErrorLog == null) {
                AFc1xSDK aFc1xSDKAFVersionDeclaration = AFVersionDeclaration();
                Context context = this.AFInAppEventType.AFKeystoreWrapper;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afErrorLog = new AFb1bSDK(aFc1xSDKAFVersionDeclaration, new AFc1ySDK(AFb1wSDK.valueOf(context)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFc1pSDK values() {
        return new AFc1pSDK(onInstallConversionFailureNative(), valueOf(), AppsFlyerProperties.getInstance(), AppsFlyer2dXConversionCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }
}
