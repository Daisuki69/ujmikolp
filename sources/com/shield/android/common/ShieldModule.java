package com.shield.android.common;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public interface ShieldModule {
    public static final ParameterKeys ParameterKeys = ParameterKeys.$$INSTANCE;

    public interface Callback {
        void onDataReceived(HashMap<String, Object> map);
    }

    public static final class DefaultImpls {
        @Deprecated
        public static void getContext(ShieldModule shieldModule, WeakReference<Activity> activityReference, Callback callback) {
            j.g(activityReference, "activityReference");
            j.g(callback, "callback");
            a.a(shieldModule, activityReference, callback);
        }

        @Deprecated
        public static void setModuleParams(ShieldModule shieldModule, HashMap<String, String> paramsMap) {
            j.g(paramsMap, "paramsMap");
            a.b(shieldModule, paramsMap);
        }

        @Deprecated
        public static void startTracking(ShieldModule shieldModule, boolean z4) {
            a.d(shieldModule, z4);
        }

        @Deprecated
        public static void stopTracking(ShieldModule shieldModule) {
            a.e(shieldModule);
        }

        @Deprecated
        public static void startTracking(ShieldModule shieldModule, Application application) {
            j.g(application, "application");
            a.c(shieldModule, application);
        }
    }

    public static final class ParameterKeys {
        static final /* synthetic */ ParameterKeys $$INSTANCE = new ParameterKeys();
        private static final String locationCollectionURL = "locationCollectionURL";
        private static final String locationTrackingTimeout = "locationTrackingTimeout";
        private static final String locationCollectionInterval = "locationCollectionInterval";
        private static final String sessionId = "sessionId";
        private static final String siteId = "siteId";
        private static final String secretKey = "secretKey";

        private ParameterKeys() {
        }

        public final String getLocationCollectionInterval() {
            return locationCollectionInterval;
        }

        public final String getLocationCollectionURL() {
            return locationCollectionURL;
        }

        public final String getLocationTrackingTimeout() {
            return locationTrackingTimeout;
        }

        public final String getSecretKey() {
            return secretKey;
        }

        public final String getSessionId() {
            return sessionId;
        }

        public final String getSiteId() {
            return siteId;
        }
    }

    void getContext(WeakReference<Activity> weakReference, Callback callback);

    String getModuleName();

    String getUrl();

    void setModuleParams(HashMap<String, String> map);

    void startTracking(Application application);

    void startTracking(boolean z4);

    void stopTracking();
}
