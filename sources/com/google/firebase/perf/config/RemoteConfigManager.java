package com.google.firebase.perf.config;

import B2.b;
import C2.f;
import K2.w;
import K2.x;
import M2.a;
import W2.d;
import W2.e;
import W2.g;
import X2.j;
import X2.o;
import X2.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import c2.EnumC1067j;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, g> allRcConfigMap;
    private final w cache;
    private final Executor executor;

    @Nullable
    private e firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private b firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final a logger = a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(w.b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private g getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        g gVar = this.allRcConfigMap.get(str);
        q qVar = (q) gVar;
        if (qVar.f6524b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", qVar.d(), str);
        return gVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        e eVar = this.firebaseRemoteConfig;
        j jVar = eVar.f;
        o oVar = jVar.h;
        jVar.a(oVar.f6518a.getLong("minimum_fetch_interval_in_seconds", j.j)).onSuccessTask(EnumC1067j.f9268a, new f(21)).onSuccessTask(eVar.f6217b, new d(eVar)).addOnSuccessListener(this.executor, new x(this)).addOnFailureListener(this.executor, new x(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public T2.d getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new T2.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new T2.d(Boolean.valueOf(((q) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new T2.d();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public T2.d getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new T2.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new T2.d(Double.valueOf(((q) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new T2.d();
    }

    public T2.d getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new T2.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new T2.d(Long.valueOf(((q) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new T2.d();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> T getRemoteConfigValueOrDefault(String str, T t5) {
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t5 instanceof Boolean) {
                    return (T) Boolean.valueOf(((q) remoteConfigValue).a());
                }
                if (t5 instanceof Double) {
                    return (T) Double.valueOf(((q) remoteConfigValue).b());
                }
                if (!(t5 instanceof Long) && !(t5 instanceof Integer)) {
                    if (t5 instanceof String) {
                        return (T) ((q) remoteConfigValue).d();
                    }
                    T t10 = (T) ((q) remoteConfigValue).d();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t5);
                        return t10;
                    } catch (IllegalArgumentException unused) {
                        t5 = t10;
                        q qVar = (q) remoteConfigValue;
                        if (!qVar.d().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                        }
                        return t5;
                    }
                }
                return (T) Long.valueOf(((q) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t5;
    }

    public T2.d getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new T2.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new T2.d(((q) remoteConfigValue).d()) : new T2.d();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b bVar;
        W2.j jVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (jVar = (W2.j) bVar.get()) != null) {
            this.firebaseRemoteConfig = jVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        e eVar = this.firebaseRemoteConfig;
        return eVar == null || eVar.e().f865a == 1 || this.firebaseRemoteConfig.e().f865a == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, g> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        K2.d dVarE = K2.d.E();
        ConcurrentHashMap<String, g> concurrentHashMap = this.allRcConfigMap;
        dVarE.getClass();
        g gVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (gVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((q) gVar).a());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(w wVar, Executor executor, e eVar, long j) {
        ConcurrentHashMap<String, g> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = wVar;
        this.executor = executor;
        this.firebaseRemoteConfig = eVar;
        if (eVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(eVar.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
