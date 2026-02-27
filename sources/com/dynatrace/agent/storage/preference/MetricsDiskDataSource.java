package com.dynatrace.agent.storage.preference;

import Ej.InterfaceC0231i;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import bj.AbstractC1039j;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import qj.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsDiskDataSource {
    private final DataStore<Preferences> dataStore;

    public static final class Keys {
        public static final int INVALID = -1;
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Integer> DEVICE_SCREEN_WIDTH = PreferencesKeys.intKey("mt_deviceScreenWidth");
        private static final Preferences.Key<Integer> DEVICE_SCREEN_HEIGHT = PreferencesKeys.intKey("mt_deviceScreenHeight");
        private static final Preferences.Key<Integer> DEVICE_ORIENTATION = PreferencesKeys.intKey("mt_deviceOrientation");
        private static final Preferences.Key<Integer> DEVICE_BATTERY_LEVEL = PreferencesKeys.intKey("mt_deviceBatteryLevel");
        private static final Preferences.Key<String> DEVICE_MANUFACTURER = PreferencesKeys.stringKey("mt_deviceManufacturer");
        private static final Preferences.Key<String> DEVICE_MODEL_IDENTIFIER = PreferencesKeys.stringKey("mt_deviceModelIdentifier");
        private static final Preferences.Key<Boolean> DEVICE_IS_ROOTED = PreferencesKeys.booleanKey("mt_deviceIsRooted");
        private static final Preferences.Key<Double> LOCATION_LATITUDE = PreferencesKeys.doubleKey("mt_locationLatitude");
        private static final Preferences.Key<Double> LOCATION_LONGITUDE = PreferencesKeys.doubleKey("mt_locationLongitude");
        private static final Preferences.Key<String> OS_NAME = PreferencesKeys.stringKey("mt_osName");
        private static final Preferences.Key<String> OS_VERSION = PreferencesKeys.stringKey("mt_osVersion");
        private static final Preferences.Key<String> BUNDLE = PreferencesKeys.stringKey("mt_bundle");
        private static final Preferences.Key<Long> APP_VERSION_CODE = PreferencesKeys.longKey("mt_versionCode");
        private static final Preferences.Key<String> APP_VERSION_NAME = PreferencesKeys.stringKey("mt_versionName");
        private static final Preferences.Key<String> INSTANCE_ID = PreferencesKeys.stringKey("mt_instanceId");
        private static final Preferences.Key<String> SESSION_ID = PreferencesKeys.stringKey("mt_sessionId");
        private static final Preferences.Key<Boolean> SESSION_ACTIVE = PreferencesKeys.booleanKey("mt_sessionActive");
        private static final Preferences.Key<Boolean> CRASH_REPORTING = PreferencesKeys.booleanKey("mt_crashReporting");
        private static final Preferences.Key<String> NETWORK_TYPE = PreferencesKeys.stringKey("mt_networkType");

        private Keys() {
        }

        public final Preferences.Key<Long> getAPP_VERSION_CODE() {
            return APP_VERSION_CODE;
        }

        public final Preferences.Key<String> getAPP_VERSION_NAME() {
            return APP_VERSION_NAME;
        }

        public final Preferences.Key<String> getBUNDLE() {
            return BUNDLE;
        }

        public final Preferences.Key<Boolean> getCRASH_REPORTING() {
            return CRASH_REPORTING;
        }

        public final Preferences.Key<Integer> getDEVICE_BATTERY_LEVEL() {
            return DEVICE_BATTERY_LEVEL;
        }

        public final Preferences.Key<Boolean> getDEVICE_IS_ROOTED() {
            return DEVICE_IS_ROOTED;
        }

        public final Preferences.Key<String> getDEVICE_MANUFACTURER() {
            return DEVICE_MANUFACTURER;
        }

        public final Preferences.Key<String> getDEVICE_MODEL_IDENTIFIER() {
            return DEVICE_MODEL_IDENTIFIER;
        }

        public final Preferences.Key<Integer> getDEVICE_ORIENTATION() {
            return DEVICE_ORIENTATION;
        }

        public final Preferences.Key<Integer> getDEVICE_SCREEN_HEIGHT() {
            return DEVICE_SCREEN_HEIGHT;
        }

        public final Preferences.Key<Integer> getDEVICE_SCREEN_WIDTH() {
            return DEVICE_SCREEN_WIDTH;
        }

        public final Preferences.Key<String> getINSTANCE_ID() {
            return INSTANCE_ID;
        }

        public final Preferences.Key<Double> getLOCATION_LATITUDE() {
            return LOCATION_LATITUDE;
        }

        public final Preferences.Key<Double> getLOCATION_LONGITUDE() {
            return LOCATION_LONGITUDE;
        }

        public final Preferences.Key<String> getNETWORK_TYPE() {
            return NETWORK_TYPE;
        }

        public final Preferences.Key<String> getOS_NAME() {
            return OS_NAME;
        }

        public final Preferences.Key<String> getOS_VERSION() {
            return OS_VERSION;
        }

        public final Preferences.Key<Boolean> getSESSION_ACTIVE() {
            return SESSION_ACTIVE;
        }

        public final Preferences.Key<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {143}, m = "clearPreferences")
    public static final class AnonymousClass1 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MetricsDiskDataSource.this.clearPreferences(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            Keys keys = Keys.INSTANCE;
            mutablePreferences.remove(keys.getDEVICE_SCREEN_WIDTH());
            mutablePreferences.remove(keys.getDEVICE_SCREEN_HEIGHT());
            mutablePreferences.remove(keys.getDEVICE_ORIENTATION());
            mutablePreferences.remove(keys.getDEVICE_BATTERY_LEVEL());
            mutablePreferences.remove(keys.getDEVICE_MANUFACTURER());
            mutablePreferences.remove(keys.getDEVICE_MODEL_IDENTIFIER());
            mutablePreferences.remove(keys.getDEVICE_IS_ROOTED());
            mutablePreferences.remove(keys.getLOCATION_LATITUDE());
            mutablePreferences.remove(keys.getLOCATION_LONGITUDE());
            mutablePreferences.remove(keys.getOS_NAME());
            mutablePreferences.remove(keys.getOS_VERSION());
            mutablePreferences.remove(keys.getBUNDLE());
            mutablePreferences.remove(keys.getAPP_VERSION_CODE());
            mutablePreferences.remove(keys.getAPP_VERSION_NAME());
            mutablePreferences.remove(keys.getINSTANCE_ID());
            mutablePreferences.remove(keys.getSESSION_ID());
            mutablePreferences.remove(keys.getSESSION_ACTIVE());
            mutablePreferences.remove(keys.getCRASH_REPORTING());
            mutablePreferences.remove(keys.getNETWORK_TYPE());
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {76}, m = "getMetrics")
    public static final class C11561 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11561(InterfaceC1526a<? super C11561> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MetricsDiskDataSource.this.getMetrics(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C11572 extends AbstractC1616j implements n {
        /* synthetic */ Object L$0;
        int label;

        public C11572(InterfaceC1526a<? super C11572> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            C11572 c11572 = new C11572(interfaceC1526a);
            c11572.L$0 = th2;
            return c11572.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: preferences could not be retrieved", (Throwable) this.L$0);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends AbstractC1616j implements n {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(InterfaceC1526a<? super AnonymousClass4> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(interfaceC1526a);
            anonymousClass4.L$0 = th2;
            return anonymousClass4.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: Metrics could not be retrieved", (Throwable) this.L$0);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {101}, m = "setMetrics")
    public static final class C11581 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11581(InterfaceC1526a<? super C11581> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MetricsDiskDataSource.this.setMetrics(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C11592 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ MetricsData $metrics;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MetricsDiskDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11592(MetricsData metricsData, MetricsDiskDataSource metricsDiskDataSource, InterfaceC1526a<? super C11592> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$metrics = metricsData;
            this.this$0 = metricsDiskDataSource;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11592 c11592 = new C11592(this.$metrics, this.this$0, interfaceC1526a);
            c11592.L$0 = obj;
            return c11592;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11592) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            MetricsData metricsData = this.$metrics;
            MetricsDiskDataSource metricsDiskDataSource = this.this$0;
            Keys keys = Keys.INSTANCE;
            mutablePreferences.set(keys.getDEVICE_SCREEN_WIDTH(), new Integer(metricsData.getDeviceScreenWidth()));
            mutablePreferences.set(keys.getDEVICE_SCREEN_HEIGHT(), new Integer(metricsData.getDeviceScreenHeight()));
            mutablePreferences.set(keys.getDEVICE_ORIENTATION(), new Integer(metricsData.getDeviceOrientation()));
            mutablePreferences.set(keys.getDEVICE_BATTERY_LEVEL(), new Integer(metricsData.getDeviceBatteryLevel()));
            mutablePreferences.set(keys.getDEVICE_IS_ROOTED(), Boolean.valueOf(metricsData.getDeviceIsRooted()));
            mutablePreferences.set(keys.getOS_NAME(), metricsData.getOsName());
            mutablePreferences.set(keys.getINSTANCE_ID(), metricsData.getInstanceId());
            mutablePreferences.set(keys.getSESSION_ID(), metricsData.getSessionId());
            mutablePreferences.set(keys.getSESSION_ACTIVE(), Boolean.valueOf(metricsData.getSessionActive()));
            mutablePreferences.set(keys.getCRASH_REPORTING(), Boolean.valueOf(metricsData.getCrashReportingOptIn()));
            mutablePreferences.set(keys.getNETWORK_TYPE(), metricsData.getNetworkType());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getDEVICE_MANUFACTURER(), metricsData.getDeviceManufacturer());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getDEVICE_MODEL_IDENTIFIER(), metricsData.getDeviceModelIdentifier());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getLOCATION_LATITUDE(), metricsData.getLocationLatitude());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getLOCATION_LONGITUDE(), metricsData.getLocationLongitude());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getOS_VERSION(), metricsData.getOsVersion());
            metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getBUNDLE(), metricsData.getBundle());
            AppVersion appVersion = metricsData.getAppVersion();
            if (appVersion != null) {
                mutablePreferences.set(keys.getAPP_VERSION_CODE(), new Long(appVersion.getVersionCode()));
                metricsDiskDataSource.setOrRemove(mutablePreferences, keys.getAPP_VERSION_NAME(), appVersion.getVersionName());
            } else {
                mutablePreferences.remove(keys.getAPP_VERSION_CODE());
                mutablePreferences.remove(keys.getAPP_VERSION_NAME());
            }
            return Unit.f18162a;
        }
    }

    public MetricsDiskDataSource(DataStore<Preferences> dataStore) {
        j.g(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppVersion createAppVersion(Long l6, String str) {
        if (l6 == null || l6.longValue() < 1) {
            return null;
        }
        return new AppVersion(l6.longValue(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void setOrRemove(MutablePreferences mutablePreferences, Preferences.Key<T> key, T t5) {
        if (t5 != null) {
            mutablePreferences.set(key, t5);
        } else {
            mutablePreferences.remove(key);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearPreferences(gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1 r0 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1 r0 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Exception -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            bj.AbstractC1039j.b(r7)
            java.lang.String r7 = "metrics preferences are cleared"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r7 = r6.dataStore     // Catch: java.lang.Exception -> L29
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2 r2 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2     // Catch: java.lang.Exception -> L29
            r5 = 0
            r2.<init>(r5)     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = androidx.datastore.preferences.core.PreferencesKt.edit(r7, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r7 != r1) goto L51
            return r1
        L4c:
            java.lang.String r0 = "metrics preferences can't be cleared"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r7)
        L51:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.clearPreferences(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMetrics(gj.InterfaceC1526a<? super com.dynatrace.agent.storage.preference.MetricsData> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11561
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1 r0 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1 r0 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Exception -> L28
            goto L5d
        L28:
            r7 = move-exception
            goto L60
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            bj.AbstractC1039j.b(r7)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r7 = r6.dataStore     // Catch: java.lang.Exception -> L28
            Ej.h r7 = r7.getData()     // Catch: java.lang.Exception -> L28
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2 r2 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2     // Catch: java.lang.Exception -> L28
            r2.<init>(r4)     // Catch: java.lang.Exception -> L28
            Ej.t r5 = new Ej.t     // Catch: java.lang.Exception -> L28
            r5.<init>(r7, r2)     // Catch: java.lang.Exception -> L28
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1 r7 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1     // Catch: java.lang.Exception -> L28
            r7.<init>()     // Catch: java.lang.Exception -> L28
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4 r2 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4     // Catch: java.lang.Exception -> L28
            r2.<init>(r4)     // Catch: java.lang.Exception -> L28
            Ej.t r5 = new Ej.t     // Catch: java.lang.Exception -> L28
            r5.<init>(r7, r2)     // Catch: java.lang.Exception -> L28
            r0.label = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = Ej.W.j(r5, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L5d
            return r1
        L5d:
            com.dynatrace.agent.storage.preference.MetricsData r7 = (com.dynatrace.agent.storage.preference.MetricsData) r7     // Catch: java.lang.Exception -> L28
            return r7
        L60:
            java.lang.String r0 = "dtxStorage"
            java.lang.String r1 = "there is no metrics available"
            com.dynatrace.android.agent.util.Utility.devLog(r0, r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.getMetrics(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setMetrics(com.dynatrace.agent.storage.preference.MetricsData r7, gj.InterfaceC1526a<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11581
            if (r0 == 0) goto L13
            r0 = r8
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1 r0 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1 r0 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Exception -> L29
            goto L5d
        L29:
            r7 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            bj.AbstractC1039j.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "metrics are updated: "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r8)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r8 = r6.dataStore     // Catch: java.lang.Exception -> L29
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2 r2 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2     // Catch: java.lang.Exception -> L29
            r5 = 0
            r2.<init>(r7, r6, r5)     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.lang.Exception -> L29
            if (r7 != r1) goto L5d
            return r1
        L58:
            java.lang.String r8 = "metrics preferences can't be stored"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r8, r7)
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.setMetrics(com.dynatrace.agent.storage.preference.MetricsData, gj.a):java.lang.Object");
    }
}
