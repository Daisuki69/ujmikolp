package com.appsflyer.internal;

import We.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1kSDK;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1vSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.GoogleApiAvailability;
import dOYHB6.yFtIp6.ht2aO8;
import dOYHB6.yFtIp6.svM7M6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1wSDK extends AppsFlyerLib {
    public static final String AFInAppEventParameterName;
    public static volatile AppsFlyerConversionListener AFInAppEventType = null;
    public static final String AFKeystoreWrapper;

    @VisibleForTesting
    private static String AFLogger$LogLevel = null;

    @VisibleForTesting
    private static AFb1wSDK AFVersionDeclaration = null;
    private static int AppsFlyerLib = 1;

    @VisibleForTesting
    private static String afDebugLog;

    @VisibleForTesting
    private static String afErrorLog;

    @VisibleForTesting
    private static String afErrorLogForExcManagerOnly;
    private static final String afRDLog;
    private static String afWarnLog;
    private static char getInstance;

    @VisibleForTesting
    private static String getLevel;
    private static int onPause;
    private static char onResponseError;
    private static char onValidateInApp;
    private static char stop;
    static final String valueOf;
    static AppsFlyerInAppPurchaseValidatorListener values;
    String AFLogger;
    private AFb1dSDK AppsFlyerConversionListener;
    public AFa1fSDK afInfoLog;
    private Application onAppOpenAttribution;
    private boolean onAttributionFailureNative;
    private String onConversionDataFail;
    private Map<Long, String> onConversionDataSuccess;
    private SharedPreferences onDeepLinking;
    private String onInstallConversionDataLoadedNative;
    private Map<String, Object> onResponse;
    private boolean onResponseNative;

    @NonNull
    private final AFb1aSDK onValidateInAppFailure;
    private long AppsFlyer2dXConversionCallback = -1;
    private long init = -1;
    private long onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(5);
    private boolean onInstallConversionFailureNative = false;
    private final AFb1vSDK onResponseErrorNative = new AFb1vSDK();
    private boolean onDeepLinkingNative = false;
    private boolean onAttributionFailure = false;
    private final Executor AppsFlyerInAppPurchaseValidatorListener = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1wSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AFInAppEventType() {
            try {
                AFe1fSDK aFe1fSDK = new AFe1fSDK();
                Application applicationValueOf = AFb1wSDK.valueOf(AFb1wSDK.this);
                if (applicationValueOf != null) {
                    aFe1fSDK.AFKeystoreWrapper = (Application) applicationValueOf.getApplicationContext();
                }
                AFb1wSDK aFb1wSDK = AFb1wSDK.this;
                if (AFb1wSDK.AFInAppEventType(aFb1wSDK, aFe1fSDK, AFb1wSDK.valueOf(AFb1wSDK.valueOf(aFb1wSDK)))) {
                    AFb1wSDK.valueOf(AFb1wSDK.this, aFe1fSDK);
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1wSDK.AFInAppEventType(AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this).AFKeystoreWrapper(), new c(this, 3), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1wSDK$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1vSDK implements Runnable {
        private final AFa1tSDK values;

        public /* synthetic */ AFa1vSDK(AFb1wSDK aFb1wSDK, AFa1tSDK aFa1tSDK, byte b8) {
            this(aFa1tSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1wSDK.valueOf(AFb1wSDK.this, this.values);
        }

        private AFa1vSDK(AFa1tSDK aFa1tSDK) {
            this.values = aFa1tSDK;
        }
    }

    public class AFa1ySDK implements AFd1xSDK {
        private AFa1ySDK() {
        }

        private static boolean AFInAppEventParameterName() {
            return AFb1wSDK.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFd1xSDK
        public final void AFInAppEventType(AFd1wSDK<?> aFd1wSDK) {
        }

        @Override // com.appsflyer.internal.AFd1xSDK
        public final void valueOf(AFd1wSDK<?> aFd1wSDK) {
            if (aFd1wSDK instanceof AFd1cSDK) {
                AFb1wSDK.this.valueOf().afRDLog().AFInAppEventParameterName(((AFd1hSDK) aFd1wSDK).afRDLog.afRDLog);
            }
        }

        public /* synthetic */ AFa1ySDK(AFb1wSDK aFb1wSDK, byte b8) {
            this();
        }

        @Override // com.appsflyer.internal.AFd1xSDK
        public final void AFInAppEventType(AFd1wSDK<?> aFd1wSDK, AFd1tSDK aFd1tSDK) {
            JSONObject jSONObjectAFInAppEventParameterName;
            AFb1sSDK aFb1sSDKAFInAppEventType;
            if (!(aFd1wSDK instanceof AFd1hSDK)) {
                if (!(aFd1wSDK instanceof AFe1lSDK) || aFd1tSDK == AFd1tSDK.SUCCESS) {
                    return;
                }
                AFe1mSDK aFe1mSDK = new AFe1mSDK(AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this));
                AFd1vSDK aFd1vSDKAFLogger = AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this).AFLogger();
                aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFe1mSDK));
                return;
            }
            AFd1hSDK aFd1hSDK = (AFd1hSDK) aFd1wSDK;
            boolean z4 = aFd1wSDK instanceof AFd1cSDK;
            if (z4 && AFInAppEventParameterName()) {
                AFd1cSDK aFd1cSDK = (AFd1cSDK) aFd1wSDK;
                if (aFd1cSDK.values == AFd1tSDK.SUCCESS || aFd1cSDK.valueOf == 1) {
                    Context context = AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this).AFInAppEventType.AFKeystoreWrapper;
                    if (context == null) {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                    AFe1lSDK aFe1lSDK = new AFe1lSDK(aFd1cSDK, new AFc1ySDK(AFb1wSDK.valueOf(context)));
                    AFd1vSDK aFd1vSDKAFLogger2 = AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this).AFLogger();
                    aFd1vSDKAFLogger2.values.execute(aFd1vSDKAFLogger2.new AnonymousClass2(aFe1lSDK));
                }
            }
            if (aFd1tSDK == AFd1tSDK.SUCCESS) {
                AFb1wSDK aFb1wSDK = AFb1wSDK.this;
                aFb1wSDK.AFInAppEventParameterName(AFb1wSDK.valueOf(aFb1wSDK)).AFInAppEventType("sentSuccessfully", "true");
                if (!(aFd1wSDK instanceof AFd1bSDK) && (aFb1sSDKAFInAppEventType = new AFe1rSDK(AFb1wSDK.valueOf(AFb1wSDK.this)).AFInAppEventType()) != null && aFb1sSDKAFInAppEventType.AFKeystoreWrapper()) {
                    String str = aFb1sSDKAFInAppEventType.valueOf;
                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFe1rSDK.AFInAppEventParameterName(str);
                }
                ResponseNetwork responseNetwork = ((AFd1nSDK) aFd1hSDK).afErrorLog;
                if (responseNetwork != null && (jSONObjectAFInAppEventParameterName = AFb1oSDK.AFInAppEventParameterName((String) responseNetwork.getBody())) != null) {
                    AFb1wSDK.valueOf(AFb1wSDK.this, jSONObjectAFInAppEventParameterName.optBoolean("send_background", false));
                }
                if (z4) {
                    AFb1wSDK.AFKeystoreWrapper(AFb1wSDK.this, System.currentTimeMillis());
                }
            }
        }
    }

    public class AFa1zSDK implements Runnable {
        private final AFa1tSDK AFKeystoreWrapper;

        public /* synthetic */ AFa1zSDK(AFb1wSDK aFb1wSDK, AFa1tSDK aFa1tSDK, byte b8) {
            this(aFa1tSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1wSDK aFd1hSDK;
            if (this.AFKeystoreWrapper.AFInAppEventParameterName()) {
                AFd1cSDK aFd1cSDK = new AFd1cSDK(this.AFKeystoreWrapper, AFb1wSDK.this.valueOf());
                aFd1cSDK.AFVersionDeclaration = AFb1wSDK.values(AFb1wSDK.this);
                aFd1hSDK = aFd1cSDK;
            } else {
                aFd1hSDK = new AFd1hSDK(this.AFKeystoreWrapper, AFb1wSDK.this.valueOf());
            }
            AFd1vSDK aFd1vSDKAFLogger = AFb1wSDK.this.valueOf().AFLogger();
            aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1hSDK));
        }

        private AFa1zSDK(AFa1tSDK aFa1tSDK) {
            this.AFKeystoreWrapper = aFa1tSDK;
        }
    }

    static {
        values();
        valueOf = "230";
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\ufff8ꗛ", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strSubstring = "6.10.1".substring(0, "6.10.1".lastIndexOf(((String) objArr[0]).intern()));
        AFInAppEventParameterName = strSubstring;
        afErrorLog = "https://%sstats.%s/stats";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append("/androidevent?buildnumber=6.10.1&app_id=");
        AFKeystoreWrapper = sb2.toString();
        afDebugLog = "https://%sadrevenue.%s/api/v2/generic/v6.10.1/android?app_id=";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strSubstring);
        sb3.append("/androidevent?app_id=");
        String string = sb3.toString();
        afRDLog = string;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(string);
        afWarnLog = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(string);
        getLevel = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(string);
        afErrorLogForExcManagerOnly = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(string);
        AFLogger$LogLevel = sb7.toString();
        values = null;
        AFInAppEventType = null;
        AFVersionDeclaration = new AFb1wSDK();
        onPause = (AppsFlyerLib + 119) % 128;
    }

    @VisibleForTesting
    public AFb1wSDK() {
        AFVersionDeclaration.init();
        AFb1aSDK aFb1aSDK = new AFb1aSDK();
        this.onValidateInAppFailure = aFb1aSDK;
        AFd1vSDK aFd1vSDKAFLogger = aFb1aSDK.AFLogger();
        aFd1vSDKAFLogger.AFKeystoreWrapper.add(new AFa1ySDK(this, (byte) 0));
    }

    public static /* synthetic */ AFb1aSDK AFInAppEventParameterName(AFb1wSDK aFb1wSDK) {
        int i = AppsFlyerLib;
        onPause = (i + 43) % 128;
        AFb1aSDK aFb1aSDK = aFb1wSDK.onValidateInAppFailure;
        int i4 = i + 41;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return aFb1aSDK;
    }

    public static /* synthetic */ void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, TimeUnit timeUnit) {
        int i = onPause + 29;
        AppsFlyerLib = i % 128;
        AFInAppEventParameterName(scheduledExecutorService, runnable, i % 2 == 0 ? 1L : 0L, timeUnit);
    }

    public static /* synthetic */ long AFKeystoreWrapper(AFb1wSDK aFb1wSDK, long j) {
        int i = (onPause + 17) % 128;
        AppsFlyerLib = i;
        aFb1wSDK.init = j;
        onPause = (i + 21) % 128;
        return j;
    }

    private void AFLogger(Context context) {
        this.onResponse = new HashMap();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final AFa1uSDK.AFa1ySDK aFa1ySDK = new AFa1uSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFb1wSDK.5
            @Override // com.appsflyer.internal.AFa1uSDK.AFa1ySDK
            public final void AFInAppEventParameterName(String str) {
                AFb1wSDK.values(AFb1wSDK.this).put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
            }

            @Override // com.appsflyer.internal.AFa1uSDK.AFa1ySDK
            public final void AFInAppEventType(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFb1wSDK.values(AFb1wSDK.this).put("link", str);
                    if (str2 != null) {
                        AFb1wSDK.values(AFb1wSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        map2.put("promo_code", str3);
                        map.put("deeplink_context", map2);
                        AFb1wSDK.values(AFb1wSDK.this).put("extras", map);
                    }
                } else {
                    AFb1wSDK.values(AFb1wSDK.this).put("link", "");
                }
                AFb1wSDK.values(AFb1wSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1uSDK.3
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    String string;
                    String string2;
                    String string3;
                    Bundle bundle;
                    if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                        if (aFa1ySDK2 != null) {
                            aFa1ySDK2.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                        if (bundle2 != null) {
                            string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                            string3 = bundle2.getString("target_url");
                            Bundle bundle3 = bundle2.getBundle("extras");
                            string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                        } else {
                            string = null;
                            string2 = null;
                            string3 = null;
                        }
                        AFa1ySDK aFa1ySDK3 = aFa1ySDK;
                        if (aFa1ySDK3 != null) {
                            aFa1ySDK3.AFInAppEventType(string2, string3, string);
                        }
                    } else {
                        AFa1ySDK aFa1ySDK4 = aFa1ySDK;
                        if (aFa1ySDK4 != null) {
                            aFa1ySDK4.AFInAppEventType(null, null, null);
                        }
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", TypedValues.Custom.S_STRING, context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                method.invoke(null, context, string, objNewProxyInstance);
                return;
            }
            int i = onPause + 37;
            AppsFlyerLib = i % 128;
            if (i % 2 == 0) {
                aFa1ySDK.AFInAppEventParameterName("Facebook app id not defined in resources");
                throw null;
            }
            aFa1ySDK.AFInAppEventParameterName("Facebook app id not defined in resources");
            int i4 = onPause + 19;
            AppsFlyerLib = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
            aFa1ySDK.AFInAppEventParameterName(e.toString());
        } catch (IllegalAccessException e7) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e7);
            aFa1ySDK.AFInAppEventParameterName(e7.toString());
        } catch (NoSuchMethodException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e10);
            aFa1ySDK.AFInAppEventParameterName(e10.toString());
        } catch (InvocationTargetException e11) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e11);
            aFa1ySDK.AFInAppEventParameterName(e11.toString());
        }
    }

    private String AFLogger$LogLevel(Context context) {
        File fileAfInfoLog = afInfoLog(AFKeystoreWrapper("ro.appsflyer.preinstall.path"));
        if (valueOf(fileAfInfoLog)) {
            fileAfInfoLog = afInfoLog(AFInAppEventParameterName(context, "AF_PRE_INSTALL_PATH"));
            onPause = (AppsFlyerLib + 125) % 128;
        }
        if (valueOf(fileAfInfoLog)) {
            onPause = (AppsFlyerLib + 9) % 128;
            fileAfInfoLog = afInfoLog("/data/local/tmp/pre_install.appsflyer");
        }
        if (valueOf(fileAfInfoLog)) {
            fileAfInfoLog = afInfoLog("/etc/pre_install.appsflyer");
        }
        if (!valueOf(fileAfInfoLog)) {
            return valueOf(fileAfInfoLog, context.getPackageName());
        }
        AppsFlyerLib = (onPause + 43) % 128;
        return null;
    }

    private long AFVersionDeclaration(Context context) {
        AppsFlyerLib = (onPause + 1) % 128;
        long j = valueOf(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFInAppEventParameterName(context).values("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (j <= 0) {
            return -1L;
        }
        long j6 = jCurrentTimeMillis - j;
        int i = onPause + 21;
        int i4 = i % 128;
        AppsFlyerLib = i4;
        long j7 = i % 2 == 0 ? 1000 | j6 : j6 / 1000;
        onPause = (i4 + 109) % 128;
        return j7;
    }

    private static void afDebugLog(Context context) {
        int i;
        if (AFa1cSDK.AFInAppEventType()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < i || AFKeystoreWrapper(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i4);
            sb2.append("; no KeyStore usage");
            AFLogger.afRDLog(sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(i4);
        sb3.append("; use KeyStore");
        AFLogger.afRDLog(sb3.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (aFKeystoreWrapper.AFInAppEventType()) {
            String strAFInAppEventParameterName = aFKeystoreWrapper.AFInAppEventParameterName();
            synchronized (aFKeystoreWrapper.valueOf) {
                aFKeystoreWrapper.values++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(strAFInAppEventParameterName)));
                try {
                    synchronized (aFKeystoreWrapper.valueOf) {
                        aFKeystoreWrapper.AFInAppEventType.deleteEntry(strAFInAppEventParameterName);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb4 = new StringBuilder("Exception ");
                    sb4.append(e.getMessage());
                    sb4.append(" occurred");
                    AFLogger.afErrorLog(sb4.toString(), e);
                }
            }
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
        } else {
            aFKeystoreWrapper.AFKeystoreWrapper = AFb1zSDK.AFInAppEventParameterName(new WeakReference(context));
            aFKeystoreWrapper.values = 0;
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
        }
        AFInAppEventType("KSAppsFlyerId", aFKeystoreWrapper.AFKeystoreWrapper());
        AFInAppEventType("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.valueOf()));
    }

    @VisibleForTesting
    private boolean afErrorLog() {
        boolean zAFKeystoreWrapper;
        int i = onPause + 25;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            zAFKeystoreWrapper = valueOf().valueOf().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
            int i4 = 36 / 0;
        } else {
            zAFKeystoreWrapper = valueOf().valueOf().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
        }
        AppsFlyerLib = (onPause + 107) % 128;
        return zAFKeystoreWrapper;
    }

    private String afErrorLogForExcManagerOnly(Context context) {
        AppsFlyerLib = (onPause + 111) % 128;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string == null) {
            return AFInAppEventParameterName(context, "AF_STORE");
        }
        int i = AppsFlyerLib;
        int i4 = i + 73;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        onPause = (i + 71) % 128;
        return string;
    }

    private static void afInfoLog(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) == 0) {
                    AFLogger.AFKeystoreWrapper("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    return;
                }
                onPause = (AppsFlyerLib + 17) % 128;
                AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                int i = AppsFlyerLib + 73;
                onPause = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    private boolean afRDLog() {
        AppsFlyerLib = (onPause + 123) % 128;
        if (this.AppsFlyer2dXConversionCallback > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.AppsFlyer2dXConversionCallback;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String strValueOf = valueOf(simpleDateFormat, this.AppsFlyer2dXConversionCallback);
            String strValueOf2 = valueOf(simpleDateFormat, this.init);
            if (jCurrentTimeMillis < this.onAppOpenAttributionNative) {
                AppsFlyerLib = (onPause + 7) % 128;
                if (!isStopped()) {
                    long j = this.onAppOpenAttributionNative;
                    StringBuilder sbX = s.x("Last Launch attempt: ", strValueOf, ";\nLast successful Launch event: ", strValueOf2, ";\nThis launch is blocked: ");
                    sbX.append(jCurrentTimeMillis);
                    sbX.append(" ms < ");
                    sbX.append(j);
                    sbX.append(" ms");
                    AFLogger.afInfoLog(sbX.toString());
                    AppsFlyerLib = (onPause + 109) % 128;
                    return true;
                }
            }
            if (!isStopped()) {
                StringBuilder sbX2 = s.x("Last Launch attempt: ", strValueOf, ";\nLast successful Launch event: ", strValueOf2, ";\nSending launch (+");
                sbX2.append(jCurrentTimeMillis);
                sbX2.append(" ms)");
                AFLogger.afInfoLog(sbX2.toString());
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        AppsFlyerLib = (onPause + 25) % 128;
        return false;
    }

    private String afWarnLog(Context context) {
        String string;
        onPause = (AppsFlyerLib + 31) % 128;
        SharedPreferences sharedPreferencesValueOf = valueOf(context);
        String strValueOf = valueOf("preInstallName");
        if (strValueOf != null) {
            onPause = (AppsFlyerLib + 115) % 128;
            return strValueOf;
        }
        if (sharedPreferencesValueOf.contains("preInstallName")) {
            int i = AppsFlyerLib + 87;
            onPause = i % 128;
            if (i % 2 != 0) {
                svM7M6.getString(sharedPreferencesValueOf, "preInstallName", null);
                throw null;
            }
            string = svM7M6.getString(sharedPreferencesValueOf, "preInstallName", null);
        } else {
            if (afErrorLog(context) && (strValueOf = AFLogger$LogLevel(context)) == null) {
                strValueOf = AFInAppEventParameterName(context, "AF_PRE_INSTALL_NAME");
                AppsFlyerLib = (onPause + 37) % 128;
            }
            if (strValueOf != null) {
                AFInAppEventParameterName(context).AFInAppEventType("preInstallName", strValueOf);
            }
            string = strValueOf;
        }
        if (string != null) {
            AFInAppEventType("preInstallName", string);
        }
        return string;
    }

    private String getLevel(Context context) {
        onPause = (AppsFlyerLib + 19) % 128;
        SharedPreferences sharedPreferencesValueOf = valueOf(context);
        if (!sharedPreferencesValueOf.contains("INSTALL_STORE")) {
            String strAfErrorLogForExcManagerOnly = afErrorLog(context) ? afErrorLogForExcManagerOnly(context) : null;
            AFInAppEventParameterName(context).AFInAppEventType("INSTALL_STORE", strAfErrorLogForExcManagerOnly);
            return strAfErrorLogForExcManagerOnly;
        }
        int i = onPause + 47;
        AppsFlyerLib = i % 128;
        if (i % 2 != 0) {
            return svM7M6.getString(sharedPreferencesValueOf, "INSTALL_STORE", null);
        }
        String string = svM7M6.getString(sharedPreferencesValueOf, "INSTALL_STORE", null);
        int i4 = 88 / 0;
        return string;
    }

    private static boolean onAppOpenAttributionNative(Context context) {
        if (context != null) {
            onPause = (AppsFlyerLib + 93) % 128;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                Network[] allNetworks = connectivityManager.getAllNetworks();
                AppsFlyerLib = (onPause + 85) % 128;
                for (Network network : allNetworks) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                AFLogger.afErrorLog("Failed collecting ivc data", e);
            }
        }
        return false;
    }

    private static float onInstallConversionDataLoadedNative(Context context) {
        float f;
        int intExtra;
        int intExtra2;
        try {
            Intent intentRegisterReceiver = ht2aO8.registerReceiver(context.getApplicationContext(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            f = 1.0f;
        }
        if (intExtra == -1 || intExtra2 == -1) {
            return 50.0f;
        }
        f = (intExtra / intExtra2) * 100.0f;
        onPause = (AppsFlyerLib + 107) % 128;
        onPause = (AppsFlyerLib + 101) % 128;
        return f;
    }

    public static /* synthetic */ Application valueOf(AFb1wSDK aFb1wSDK) {
        int i = AppsFlyerLib + 15;
        onPause = i % 128;
        int i4 = i % 2;
        Application application = aFb1wSDK.onAppOpenAttribution;
        if (i4 == 0) {
            return application;
        }
        throw null;
    }

    public static void values() {
        onValidateInApp = (char) 33969;
        getInstance = (char) 34764;
        onResponseError = (char) 62172;
        stop = (char) 22361;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = onPause + 79;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFa1sSDK.AFInAppEventParameterName().AFLogger.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFa1sSDK.AFInAppEventParameterName().AFLogger;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        onPause = (AppsFlyerLib + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z4) {
        onPause = (AppsFlyerLib + 7) % 128;
        valueOf().getLevel().AFKeystoreWrapper("anonymizeUser", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z4);
        int i = AppsFlyerLib + 101;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = AppsFlyerLib + 125;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFa1sSDK aFa1sSDKAFInAppEventParameterName = AFa1sSDK.AFInAppEventParameterName();
            aFa1sSDKAFInAppEventParameterName.valueOf = str;
            aFa1sSDKAFInAppEventParameterName.afInfoLog = map;
            throw null;
        }
        AFa1sSDK aFa1sSDKAFInAppEventParameterName2 = AFa1sSDK.AFInAppEventParameterName();
        aFa1sSDKAFInAppEventParameterName2.valueOf = str;
        aFa1sSDKAFInAppEventParameterName2.afInfoLog = map;
        int i4 = onPause + 9;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z4) {
        int i = (onPause + 37) % 128;
        AppsFlyerLib = i;
        this.onAttributionFailure = z4;
        int i4 = i + 57;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        onPause = (AppsFlyerLib + 1) % 128;
        valueOf().getLevel().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        if (context == null) {
            return null;
        }
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (context != null) {
                aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        String strAFInAppEventParameterName = AFb1zSDK.AFInAppEventParameterName(new WeakReference(this.onValidateInAppFailure.valueOf().values.AFKeystoreWrapper));
        int i = onPause + 5;
        AppsFlyerLib = i % 128;
        if (i % 2 != 0) {
            return strAFInAppEventParameterName;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String strValues = new AFa1aSDK(context, valueOf()).values();
            int i = onPause + 69;
            AppsFlyerLib = i % 128;
            if (i % 2 != 0) {
                return strValues;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th2);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AppsFlyerLib = (onPause + 89) % 128;
        String strValues = valueOf().AppsFlyer2dXConversionCallback().values();
        AppsFlyerLib = (onPause + 27) % 128;
        return strValues;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        onPause = (AppsFlyerLib + 49) % 128;
        String strAFInAppEventParameterName = valueOf().AppsFlyer2dXConversionCallback().AFInAppEventParameterName();
        int i = AppsFlyerLib + 115;
        onPause = i % 128;
        if (i % 2 == 0) {
            return strAFInAppEventParameterName;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            onPause = (AppsFlyerLib + 3) % 128;
            return string;
        }
        String strAFInAppEventParameterName = AFInAppEventParameterName(context, "AF_STORE");
        if (strAFInAppEventParameterName == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            onPause = (AppsFlyerLib + 121) % 128;
            return null;
        }
        int i = onPause + 49;
        AppsFlyerLib = i % 128;
        if (i % 2 != 0) {
            return strAFInAppEventParameterName;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFc1zSDK aFc1zSDKValueOf;
        int i = AppsFlyerLib + 117;
        onPause = i % 128;
        if (i % 2 != 0) {
            aFc1zSDKValueOf = valueOf();
            aFc1zSDKValueOf.getLevel().AFKeystoreWrapper("getSdkVersion", new String[1]);
        } else {
            aFc1zSDKValueOf = valueOf();
            aFc1zSDKValueOf.getLevel().AFKeystoreWrapper("getSdkVersion", new String[0]);
        }
        aFc1zSDKValueOf.valueOf();
        return AFb1bSDK.AFKeystoreWrapper();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.onResponseNative) {
            return this;
        }
        this.onResponseNative = true;
        this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName = str;
        AFc1vSDK.AFKeystoreWrapper(str);
        if (context != null) {
            AppsFlyerLib = (onPause + 103) % 128;
            this.onAppOpenAttribution = (Application) context.getApplicationContext();
            AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
            int i = (AppsFlyerLib + 119) % 128;
            onPause = i;
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            AppsFlyerLib = (i + 3) % 128;
            aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
            valueOf().afRDLog().AFInAppEventType = System.currentTimeMillis();
            valueOf().onInstallConversionDataLoadedNative().AFKeystoreWrapper();
            valueOf().afInfoLog().AFKeystoreWrapper(new AFe1zSDK() { // from class: com.appsflyer.internal.b
                @Override // com.appsflyer.internal.AFe1zSDK
                public final void onRemoteConfigUpdateFinished(AFe1ySDK aFe1ySDK) {
                    this.f9430a.AFInAppEventType(aFe1ySDK);
                }
            });
            AFf1lSDK aFf1lSDKAFLogger$LogLevel = valueOf().AFLogger$LogLevel();
            final AFf1qSDK aFf1qSDK = new AFf1qSDK(new AnonymousClass2());
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1wSDK.3
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences sharedPreferencesValueOf = AFb1wSDK.valueOf(AFb1wSDK.valueOf(AFb1wSDK.this));
                    int iAFKeystoreWrapper = AFb1wSDK.this.AFKeystoreWrapper(sharedPreferencesValueOf, false);
                    boolean z4 = sharedPreferencesValueOf.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    boolean z5 = aFf1qSDK.afRDLog == AFf1oSDK.AFa1zSDK.NOT_STARTED;
                    if (iAFKeystoreWrapper == 1) {
                        if (z5 || z4) {
                            AFb1wSDK aFb1wSDK = AFb1wSDK.this;
                            AFe1fSDK aFe1fSDK = new AFe1fSDK();
                            Application applicationValueOf = AFb1wSDK.valueOf(AFb1wSDK.this);
                            if (applicationValueOf != null) {
                                aFe1fSDK.AFKeystoreWrapper = (Application) applicationValueOf.getApplicationContext();
                            }
                            AFb1wSDK.valueOf(aFb1wSDK, aFe1fSDK);
                        }
                    }
                }
            };
            aFf1lSDKAFLogger$LogLevel.AFKeystoreWrapper(aFf1qSDK);
            aFf1lSDKAFLogger$LogLevel.AFKeystoreWrapper(new AFf1mSDK(runnable));
            aFf1lSDKAFLogger$LogLevel.AFKeystoreWrapper(new AFf1uSDK(runnable, valueOf()));
            aFf1lSDKAFLogger$LogLevel.AFKeystoreWrapper(new AFf1nSDK(runnable, valueOf()));
            int i4 = 0;
            if (!afErrorLog()) {
                Application application = this.onAppOpenAttribution;
                AFc1zSDK aFc1zSDKValueOf = valueOf();
                List<ResolveInfo> listQueryIntentContentProviders = application.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        int i6 = AppsFlyerLib + 13;
                        onPause = i6 % 128;
                        if (i6 % 2 != 0) {
                            ProviderInfo providerInfo = it.next().providerInfo;
                            throw null;
                        }
                        ProviderInfo providerInfo2 = it.next().providerInfo;
                        if (providerInfo2 != null) {
                            arrayList.add(new AFf1rSDK(providerInfo2, runnable, aFc1zSDKValueOf));
                        } else {
                            AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFf1lSDKAFLogger$LogLevel.valueOf.addAll(arrayList);
                        StringBuilder sb2 = new StringBuilder("[Preinstall]: Detected ");
                        sb2.append(arrayList.size());
                        sb2.append(" valid preinstall provider(s)");
                        AFLogger.afDebugLog(sb2.toString());
                    }
                }
            }
            AFf1oSDK[] aFf1oSDKArrAFInAppEventParameterName = aFf1lSDKAFLogger$LogLevel.AFInAppEventParameterName();
            int length = aFf1oSDKArrAFInAppEventParameterName.length;
            while (i4 < length) {
                aFf1oSDKArrAFInAppEventParameterName[i4].valueOf(this.onAppOpenAttribution);
                i4++;
                onPause = (AppsFlyerLib + 39) % 128;
            }
            this.onValidateInAppFailure.afWarnLog().values();
            AFb1eSDK.AFInAppEventParameterName = this.onAppOpenAttribution;
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1rSDK level = valueOf().getLevel();
        if (appsFlyerConversionListener == null) {
            onPause = (AppsFlyerLib + 33) % 128;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        level.AFKeystoreWrapper("init", str, str2);
        AFLogger.valueOf("Initializing AppsFlyer SDK: (v6.10.1." + valueOf + ")");
        AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        AppsFlyerLib = (onPause + 77) % 128;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                AppsFlyerLib = (onPause + 5) % 128;
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        onPause = (AppsFlyerLib + 71) % 128;
        boolean zAFInAppEventParameterName = this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName();
        onPause = (AppsFlyerLib + 119) % 128;
        return zAFInAppEventParameterName;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = onPause + 81;
        AppsFlyerLib = i % 128;
        int i4 = i % 2;
        logEvent(context, str, map, null);
        if (i4 == 0) {
            throw null;
        }
        onPause = (AppsFlyerLib + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        valueOf().getLevel().AFKeystoreWrapper("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d11));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        valueOf(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i = AppsFlyerLib + 5;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        onPause = (AppsFlyerLib + 1) % 128;
        valueOf().getLevel().AFKeystoreWrapper("logSession", new String[0]);
        valueOf().getLevel().values();
        AFInAppEventParameterName(context, AFe1hSDK.logSession);
        valueOf(context, null, null);
        int i = onPause + 39;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        AFb1xSDK.AFa1ySDK aFa1ySDK = AFb1xSDK.values;
        if (aFa1ySDK != null) {
            aFa1ySDK.AFInAppEventType(context);
            onPause = (AppsFlyerLib + 71) % 128;
        }
        onPause = (AppsFlyerLib + 67) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.appsflyer.AppsFlyerLib
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performOnAppAttribution(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.net.URI r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\""
            if (r0 != 0) goto L15
            r0 = 14
            int r0 = r0 / 0
            if (r4 == 0) goto L67
            goto L17
        L15:
            if (r4 == 0) goto L67
        L17:
            java.lang.String r0 = r4.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            goto L67
        L22:
            if (r3 != 0) goto L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Context is \""
            r4.<init>(r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            com.appsflyer.internal.AFb1pSDK.AFInAppEventType(r3, r4)
            int r3 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r3 = r3 + 13
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L4a
            r3 = 36
            int r3 = r3 / 0
        L4a:
            return
        L4b:
            com.appsflyer.internal.AFa1sSDK.AFInAppEventParameterName()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            com.appsflyer.internal.AFa1sSDK.valueOf(r3, r0, r4)
            int r3 = com.appsflyer.internal.AFb1wSDK.onPause
            int r3 = r3 + 21
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r3
            return
        L67:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Link is \""
            r3.<init>(r0)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            com.appsflyer.internal.AFb1pSDK.AFInAppEventType(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.performOnAppAttribution(android.content.Context, java.net.URI):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        if (intent == null) {
            onPause = (AppsFlyerLib + 87) % 128;
            AFb1pSDK.AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            onPause = (AppsFlyerLib + 113) % 128;
            return;
        }
        if (context == null) {
            int i = onPause + 61;
            AppsFlyerLib = i % 128;
            if (i % 2 != 0) {
                AFb1pSDK.AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFb1pSDK.AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        Context applicationContext = context.getApplicationContext();
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (applicationContext != null) {
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            int i4 = onPause + 21;
            AppsFlyerLib = i4 % 128;
            if (i4 % 2 == 0) {
                aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
                throw null;
            }
            aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
        }
        this.onValidateInAppFailure.AFInAppEventParameterName().execute(new androidx.work.impl.b(2, this, applicationContext, intent));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        onPause = (AppsFlyerLib + 95) % 128;
        valueOf().getLevel().AFKeystoreWrapper("registerConversionListener", new String[0]);
        AFKeystoreWrapper(appsFlyerConversionListener);
        int i = AppsFlyerLib + 65;
        onPause = i % 128;
        if (i % 2 != 0) {
            int i4 = 85 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        com.appsflyer.internal.AFb1wSDK.values = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = (com.appsflyer.internal.AFb1wSDK.onPause + 31) % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerValidatorListener(android.content.Context r4, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r5) {
        /*
            r3 = this;
            int r4 = com.appsflyer.internal.AFb1wSDK.onPause
            int r4 = r4 + 77
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r0
            int r4 = r4 % 2
            java.lang.String r0 = "registerValidatorListener called"
            r1 = 0
            java.lang.String r2 = "registerValidatorListener"
            if (r4 != 0) goto L24
            com.appsflyer.internal.AFc1zSDK r4 = r3.valueOf()
            com.appsflyer.internal.AFb1rSDK r4 = r4.getLevel()
            java.lang.String[] r1 = new java.lang.String[r1]
            r4.AFKeystoreWrapper(r2, r1)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L44
            goto L36
        L24:
            com.appsflyer.internal.AFc1zSDK r4 = r3.valueOf()
            com.appsflyer.internal.AFb1rSDK r4 = r4.getLevel()
            java.lang.String[] r1 = new java.lang.String[r1]
            r4.AFKeystoreWrapper(r2, r1)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L44
        L36:
            java.lang.String r4 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r4)
            int r4 = com.appsflyer.internal.AFb1wSDK.onPause
            int r4 = r4 + 31
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r4
            return
        L44:
            com.appsflyer.internal.AFb1wSDK.values = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i = AppsFlyerLib;
            onPause = (i + 109) % 128;
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (context != null) {
                int i4 = i + 119;
                onPause = i4 % 128;
                if (i4 % 2 != 0) {
                    aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
                    int i6 = 97 / 0;
                } else {
                    aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
                }
            }
        }
        AFe1gSDK aFe1gSDK = new AFe1gSDK();
        if (context != null) {
            onPause = (AppsFlyerLib + 61) % 128;
            aFe1gSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        int iValueOf = valueOf(valueOf(context));
        aFe1gSDK.values().put("ad_network", map);
        aFe1gSDK.values().put("adrevenue_counter", Integer.valueOf(iValueOf));
        Activity activity = null;
        if (context instanceof Activity) {
            int i10 = AppsFlyerLib + 59;
            onPause = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            activity = (Activity) context;
        }
        AFKeystoreWrapper(aFe1gSDK, activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            int i = AppsFlyerLib;
            onPause = (i + 77) % 128;
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (applicationContext != null) {
                int i4 = i + 59;
                onPause = i4 % 128;
                if (i4 % 2 != 0) {
                    aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
                    int i6 = 73 / 0;
                } else {
                    aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
                }
            }
        }
        PurchaseHandler purchaseHandlerAfErrorLog = valueOf().afErrorLog();
        if (purchaseHandlerAfErrorLog.AFInAppEventParameterName(map, purchaseValidationCallback, "purchases")) {
            AFd1lSDK aFd1lSDK = new AFd1lSDK(map, purchaseValidationCallback, purchaseHandlerAfErrorLog.values);
            AFd1vSDK aFd1vSDK = purchaseHandlerAfErrorLog.AFInAppEventType;
            aFd1vSDK.values.execute(aFd1vSDK.new AnonymousClass2(aFd1lSDK));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i = onPause + 113;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            context.getApplicationContext();
            throw null;
        }
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (applicationContext != null) {
                int i4 = onPause + 91;
                AppsFlyerLib = i4 % 128;
                if (i4 % 2 == 0) {
                    aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
                    throw null;
                }
                aFc1xSDK.AFKeystoreWrapper = applicationContext.getApplicationContext();
            }
        }
        PurchaseHandler purchaseHandlerAfErrorLog = valueOf().afErrorLog();
        if (purchaseHandlerAfErrorLog.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFd1oSDK aFd1oSDK = new AFd1oSDK(map, purchaseValidationCallback, purchaseHandlerAfErrorLog.values);
            AFd1vSDK aFd1vSDK = purchaseHandlerAfErrorLog.AFInAppEventType;
            aFd1vSDK.values.execute(aFd1vSDK.new AnonymousClass2(aFd1oSDK));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(@androidx.annotation.NonNull android.app.Activity r19) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = AppsFlyerLib + 43;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (map != null) {
            valueOf().getLevel().AFKeystoreWrapper("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AppsFlyerLib = (onPause + 75) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = onPause + 51;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFb1rSDK level = valueOf().getLevel();
            String[] strArr = new String[0];
            strArr[0] = str;
            level.AFKeystoreWrapper("setAndroidIdData", strArr);
        } else {
            valueOf().getLevel().AFKeystoreWrapper("setAndroidIdData", str);
        }
        this.AFLogger = str;
        AppsFlyerLib = (onPause + 119) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = onPause + 119;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFb1rSDK level = valueOf().getLevel();
            String[] strArr = new String[1];
            strArr[1] = str;
            level.AFKeystoreWrapper("setAppId", strArr);
        } else {
            valueOf().getLevel().AFKeystoreWrapper("setAppId", str);
        }
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        int i4 = AppsFlyerLib + 105;
        onPause = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            if (r0 != 0) goto L30
            com.appsflyer.internal.AFc1zSDK r0 = r6.valueOf()
            com.appsflyer.internal.AFb1rSDK r0 = r0.getLevel()
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            r5[r4] = r7
            r0.AFKeystoreWrapper(r3, r5)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5a
            goto L4c
        L30:
            com.appsflyer.internal.AFc1zSDK r0 = r6.valueOf()
            com.appsflyer.internal.AFb1rSDK r0 = r0.getLevel()
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r0.AFKeystoreWrapper(r3, r4)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L5a
        L4c:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L7d
        L5a:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkDomain"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkVersion"
            r0.remove(r2)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "onelinkScheme"
            r0.remove(r2)
            int r0 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r0 = r0 + 33
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r0
        L7d:
            AFInAppEventType(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z4) {
        onPause = (AppsFlyerLib + 71) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z4));
        AppsFlyerLib = (onPause + 87) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z4) {
        AppsFlyerLib = (onPause + 17) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z4));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z4));
        AppsFlyerLib = (onPause + 35) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z4) {
        int i = onPause + 97;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFb1rSDK level = valueOf().getLevel();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z4);
            level.AFKeystoreWrapper("setCollectOaid", strArr);
        } else {
            valueOf().getLevel().AFKeystoreWrapper("setCollectOaid", String.valueOf(z4));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z4));
        onPause = (AppsFlyerLib + 97) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        onPause = (AppsFlyerLib + 99) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i = AppsFlyerLib + 89;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        onPause = (AppsFlyerLib + 77) % 128;
        if (context != null) {
            if (!AFInAppEventParameterName()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                onPause = (AppsFlyerLib + 17) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            AFInAppEventParameterName(context, AFe1hSDK.setCustomerIdAndLogSession);
            String str2 = this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName;
            if (referrer == null) {
                referrer = "";
            }
            String str3 = referrer;
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            values(context, null, null, str3, null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AppsFlyerLib = (onPause + 5) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        onPause = (AppsFlyerLib + 73) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z4) {
        AFLogger.LogLevel logLevel;
        AppsFlyerLib = (onPause + 103) % 128;
        if (!z4) {
            logLevel = AFLogger.LogLevel.NONE;
        } else {
            logLevel = AFLogger.LogLevel.DEBUG;
            AppsFlyerLib = (onPause + 17) % 128;
        }
        setLogLevel(logLevel);
        AppsFlyerLib = (onPause + 35) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z4) {
        onPause = (AppsFlyerLib + 77) % 128;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z4)));
        boolean z5 = true;
        if (z4) {
            AppsFlyerLib = (onPause + 99) % 128;
            z5 = false;
        }
        AFa1eSDK.values = Boolean.valueOf(z5);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z4) {
        int i = AppsFlyerLib + 49;
        onPause = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z4)));
            values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z4);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z4)));
            values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z4);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AppsFlyerLib = (onPause + 79) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i = onPause + 85;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        String strTrim;
        if (AFb1nSDK.AFKeystoreWrapper(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = onPause;
        int i4 = i + 41;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            strTrim = str.trim();
        } else {
            AppsFlyerLib = (i + 97) % 128;
            strTrim = "";
        }
        AFd1ySDK.values(new AFc1bSDK(strTrim, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = AppsFlyerLib + 103;
        onPause = i % 128;
        if (i % 2 != 0) {
            AFb1rSDK level = valueOf().getLevel();
            String[] strArr = new String[0];
            strArr[0] = str;
            level.AFKeystoreWrapper("setImeiData", strArr);
        } else {
            valueOf().getLevel().AFKeystoreWrapper("setImeiData", str);
        }
        valueOf().afWarnLog().AFKeystoreWrapper = str;
        int i4 = onPause + 71;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z4) {
        AppsFlyerLib = (onPause + 115) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setIsUpdate", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z4);
        AppsFlyerLib = (onPause + 123) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z4;
        AppsFlyerLib = (onPause + 85) % 128;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AppsFlyerLib = (onPause + 59) % 128;
            z4 = true;
        } else {
            z4 = false;
        }
        this.onValidateInAppFailure.getLevel().AFKeystoreWrapper("log", String.valueOf(z4));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i4 = AppsFlyerLib + 115;
        onPause = i4 % 128;
        if (i4 % 2 == 0) {
            this.onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(i);
        } else {
            this.onAppOpenAttributionNative = TimeUnit.SECONDS.toMillis(i);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        onPause = (AppsFlyerLib + 93) % 128;
        valueOf().getLevel().AFKeystoreWrapper("setOaidData", str);
        AFa1eSDK.valueOf = str;
        onPause = (AppsFlyerLib + 17) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        onPause = (AppsFlyerLib + 123) % 128;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        AFa1sSDK.AFKeystoreWrapper = strArr;
        AppsFlyerLib = (onPause + 47) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.AFKeystoreWrapper("Cannot set setOutOfStore with null");
            return;
        }
        AppsFlyerLib = (onPause + 13) % 128;
        String lowerCase = str.toLowerCase();
        AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        onPause = (AppsFlyerLib + 111) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        if (this.AppsFlyerConversionListener == null) {
            this.AppsFlyerConversionListener = new AFb1dSDK();
        }
        AFb1dSDK aFb1dSDK = this.AppsFlyerConversionListener;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map == null || map.isEmpty()) {
            AFLogger.afWarnLog(aFb1dSDK.values.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
            int i = AppsFlyerLib + 107;
            onPause = i % 128;
            if (i % 2 != 0) {
                int i4 = 17 / 0;
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        AFLogger.afDebugLog(sb2.toString());
        int length = new JSONObject(map).toString().length();
        if (length > 1000) {
            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
            HashMap map2 = new HashMap();
            map2.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
            aFb1dSDK.AFKeystoreWrapper.put(str, map2);
            return;
        }
        aFb1dSDK.values.put(str, map);
        aFb1dSDK.AFKeystoreWrapper.remove(str);
        int i6 = AppsFlyerLib + 67;
        onPause = i6 % 128;
        if (i6 % 2 != 0) {
            int i10 = 92 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        onPause = (AppsFlyerLib + 33) % 128;
        this.onConversionDataFail = AFb1ySDK.AFInAppEventParameterName(str);
        onPause = (AppsFlyerLib + 47) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPreinstallAttribution(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "setPreinstallAttribution API called"
            com.appsflyer.AFLogger.afDebugLog(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "pid"
            r3 = 2
            if (r6 == 0) goto L1f
            r0.put(r2, r6)     // Catch: org.json.JSONException -> L1d
            int r6 = com.appsflyer.internal.AFb1wSDK.onPause
            int r6 = r6 + 71
            int r6 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r6
            goto L1f
        L1d:
            r6 = move-exception
            goto L46
        L1f:
            if (r7 == 0) goto L36
            int r6 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r6 = r6 + 35
            int r4 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r4
            int r6 = r6 % r3
            java.lang.String r4 = "c"
            if (r6 != 0) goto L32
            r0.put(r4, r7)     // Catch: org.json.JSONException -> L1d
            goto L36
        L32:
            r0.put(r4, r7)     // Catch: org.json.JSONException -> L1d
            throw r1
        L36:
            if (r8 == 0) goto L4d
            int r6 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r6 = r6 + 109
            int r6 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r6
            java.lang.String r6 = "af_siteid"
            r0.put(r6, r8)     // Catch: org.json.JSONException -> L1d
            goto L4d
        L46:
            java.lang.String r7 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r7, r6)
        L4d:
            boolean r6 = r0.has(r2)
            if (r6 == 0) goto L70
            int r6 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r6 = r6 + 73
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r7
            int r6 = r6 % r3
            java.lang.String r7 = "preInstallName"
            if (r6 != 0) goto L68
            java.lang.String r6 = r0.toString()
            AFInAppEventType(r7, r6)
            return
        L68:
            java.lang.String r6 = r0.toString()
            AFInAppEventType(r7, r6)
            throw r1
        L70:
            java.lang.String r6 = "Cannot set preinstall attribution data without a media source"
            com.appsflyer.AFLogger.afWarnLog(r6)
            int r6 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r6 = r6 + 125
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r7
            int r6 = r6 % r3
            if (r6 == 0) goto L82
            int r3 = r3 / 0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.setPreinstallAttribution(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AppsFlyerLib = (onPause + 117) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        List<String> list = AFa1sSDK.values;
        list.clear();
        list.addAll(Arrays.asList(strArr));
        AppsFlyerLib = (onPause + 69) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i = onPause + 107;
        AppsFlyerLib = i % 128;
        int i4 = i % 2;
        setSharingFilterForPartners(strArr);
        if (i4 == 0) {
            throw null;
        }
        AppsFlyerLib = (onPause + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = AppsFlyerLib + 117;
        onPause = i % 128;
        if (i % 2 == 0) {
            setSharingFilterForPartners(TtmlNode.COMBINE_ALL);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = TtmlNode.COMBINE_ALL;
        setSharingFilterForPartners(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afInfoLog = new AFa1fSDK(strArr);
        int i = onPause + 69;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = onPause + 87;
        AppsFlyerLib = i % 128;
        if (i % 2 != 0) {
            valueOf().getLevel().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            valueOf().getLevel().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i4 = 81 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i = AppsFlyerLib + 81;
        onPause = i % 128;
        int i4 = i % 2;
        start(context, null);
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z4, Context context) {
        AFc1xSDK aFc1xSDK;
        int i = (onPause + 7) % 128;
        AppsFlyerLib = i;
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i4 = i + 15;
            onPause = i4 % 128;
            if (i4 % 2 != 0) {
                aFc1xSDK = aFb1aSDK.AFInAppEventType;
                int i6 = 47 / 0;
            } else {
                aFc1xSDK = aFb1aSDK.AFInAppEventType;
            }
            aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
        }
        this.onValidateInAppFailure.afWarnLog().values = z4;
        try {
            File file = new File(this.onValidateInAppFailure.afErrorLogForExcManagerOnly().AFInAppEventType.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
                        sb2.append(file2.getName());
                        AFLogger.afInfoLog(sb2.toString());
                        StringBuilder sb3 = new StringBuilder("CACHE: Deleting ");
                        sb3.append(file2.getName());
                        sb3.append(" from cache");
                        AFLogger.afInfoLog(sb3.toString());
                        file2.delete();
                    }
                }
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
        if (z4) {
            AFInAppEventParameterName(context).valueOf("is_stop_tracking_used", true);
            AppsFlyerLib = (onPause + 33) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        onPause = (AppsFlyerLib + 85) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i = onPause + 119;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AppsFlyerLib = (onPause + 103) % 128;
        valueOf().getLevel().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        AFInAppEventType = null;
        int i = AppsFlyerLib + 13;
        onPause = i % 128;
        if (i % 2 != 0) {
            int i4 = 39 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFe1rSDK aFe1rSDK = new AFe1rSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
        AFb1sSDK aFb1sSDKAFInAppEventType = aFe1rSDK.AFInAppEventType();
        if (aFb1sSDKAFInAppEventType == null || !str.equals(aFb1sSDKAFInAppEventType.valueOf)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z4 = aFb1sSDKAFInAppEventType == null || jCurrentTimeMillis - aFb1sSDKAFInAppEventType.AFInAppEventType > TimeUnit.SECONDS.toMillis(2L);
            AFb1sSDK aFb1sSDK = new AFb1sSDK(str, jCurrentTimeMillis, !z4);
            aFe1rSDK.AFKeystoreWrapper.AFInAppEventType("afUninstallToken", aFb1sSDK.valueOf);
            aFe1rSDK.AFKeystoreWrapper.values("afUninstallToken_received_time", aFb1sSDK.AFInAppEventType);
            aFe1rSDK.AFKeystoreWrapper.valueOf("afUninstallToken_queued", aFb1sSDK.AFKeystoreWrapper());
            if (z4) {
                AFe1rSDK.AFInAppEventParameterName(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        valueOf().getLevel().AFKeystoreWrapper("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!isStopped()) {
            StringBuilder sbX = s.x("Validate in app called with parameters: ", str3, Global.BLANK, str4, Global.BLANK);
            sbX.append(str5);
            AFLogger.afInfoLog(sbX.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            new Thread(new AFa1dSDK(context.getApplicationContext(), this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName, str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = values;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z4) {
        String strConcat;
        boolean z5;
        int i = onPause + 57;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z4));
            z5 = false;
        } else {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z4));
            z5 = true;
        }
        AFLogger.afInfoLog(strConcat, z5);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z4);
        AppsFlyerLib = (onPause + 21) % 128;
    }

    private static void AFInAppEventParameterName(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                AppsFlyerLib = (onPause + 101) % 128;
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext() && str == null) {
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i4 = 0;
                    while (i4 < jSONArray2.length()) {
                        onPause = (AppsFlyerLib + 7) % 128;
                        if (jSONArray2.getLong(i4) != ((Long) arrayList.get(0)).longValue()) {
                            onPause = (AppsFlyerLib + 3) % 128;
                            if (jSONArray2.getLong(i4) != ((Long) arrayList.get(1)).longValue()) {
                                int i6 = onPause + 71;
                                AppsFlyerLib = i6 % 128;
                                if (i6 % 2 == 0) {
                                    if (jSONArray2.getLong(i4) == ((Long) arrayList.get(arrayList.size())).longValue()) {
                                        break;
                                    }
                                    i4++;
                                    str = next;
                                } else {
                                    if (jSONArray2.getLong(i4) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                        break;
                                    }
                                    i4++;
                                    str = next;
                                }
                            }
                        }
                    }
                } catch (JSONException e7) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e7);
                }
            }
            break loop2;
        }
        if (str != null) {
            onPause = (AppsFlyerLib + 71) % 128;
            jSONObject.remove(str);
        }
    }

    public static /* synthetic */ boolean AFInAppEventType(AFb1wSDK aFb1wSDK, AFa1tSDK aFa1tSDK, SharedPreferences sharedPreferences) {
        int i = onPause + 101;
        AppsFlyerLib = i % 128;
        int i4 = i % 2;
        boolean zValueOf = aFb1wSDK.valueOf(aFa1tSDK, sharedPreferences);
        if (i4 == 0) {
            int i6 = 31 / 0;
        }
        return zValueOf;
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFb1wSDK aFb1wSDK) {
        int i = AppsFlyerLib + 31;
        onPause = i % 128;
        int i4 = i % 2;
        aFb1wSDK.afInfoLog();
        if (i4 != 0) {
            throw null;
        }
    }

    private static boolean afErrorLog(Context context) {
        if (!valueOf(context).contains("appsFlyerCount")) {
            onPause = (AppsFlyerLib + 115) % 128;
            return true;
        }
        onPause = (AppsFlyerLib + 27) % 128;
        return false;
    }

    public static /* synthetic */ void valueOf(AFb1wSDK aFb1wSDK, AFa1tSDK aFa1tSDK) {
        AppsFlyerLib = (onPause + 17) % 128;
        aFb1wSDK.AFKeystoreWrapper(aFa1tSDK);
        AppsFlyerLib = (onPause + 11) % 128;
    }

    public static /* synthetic */ Map values(AFb1wSDK aFb1wSDK) {
        int i = onPause;
        AppsFlyerLib = (i + 111) % 128;
        Map<String, Object> map = aFb1wSDK.onResponse;
        int i4 = i + 17;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFe1cSDK aFe1cSDK = new AFe1cSDK();
        if (context != null) {
            aFe1cSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        aFe1cSDK.afErrorLog = str;
        aFe1cSDK.AFInAppEventType = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFKeystoreWrapper("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1cSDK.AFKeystoreWrapper(mapSingletonMap);
        }
        aFe1cSDK.values = map2;
        AFb1rSDK level = valueOf().getLevel();
        Map map5 = aFe1cSDK.values;
        if (map5 == null) {
            map5 = new HashMap();
        }
        level.AFKeystoreWrapper("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFInAppEventParameterName(context, AFe1hSDK.logEvent);
        }
        AFKeystoreWrapper(aFe1cSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        onPause = (AppsFlyerLib + 55) % 128;
        start(context, str, null);
        int i = onPause + 77;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            int i4 = 35 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        onPause = (AppsFlyerLib + 51) % 128;
        AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName = deepLinkListener;
        AFb1qSDK.AFLogger$LogLevel = j;
        int i = AppsFlyerLib + 21;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static AFb1wSDK AFKeystoreWrapper() {
        int i = AppsFlyerLib + 19;
        onPause = i % 128;
        if (i % 2 == 0) {
            return AFVersionDeclaration;
        }
        throw null;
    }

    public static /* synthetic */ boolean valueOf(AFb1wSDK aFb1wSDK, boolean z4) {
        int i = onPause;
        AppsFlyerLib = (i + 9) % 128;
        aFb1wSDK.onDeepLinkingNative = z4;
        int i4 = i + 121;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return z4;
    }

    public final void AFInAppEventType(@NonNull Context context) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i = (AppsFlyerLib + 95) % 128;
            onPause = i;
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (context != null) {
                int i4 = i + 11;
                AppsFlyerLib = i4 % 128;
                int i6 = i4 % 2;
                aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
                if (i6 == 0) {
                    throw null;
                }
            }
        }
        AppsFlyerLib = (onPause + 29) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        onPause = (AppsFlyerLib + 83) % 128;
        if (AFb1xSDK.values != null) {
            return;
        }
        if (!this.onResponseNative) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    int i = onPause + 61;
                    AppsFlyerLib = i % 128;
                    if (i % 2 != 0) {
                        appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1fSDK.AFInAppEventType);
                        return;
                    } else {
                        appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1fSDK.AFInAppEventType);
                        int i4 = 21 / 0;
                        return;
                    }
                }
                return;
            }
        }
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i6 = AppsFlyerLib + 55;
            onPause = i6 % 128;
            if (i6 % 2 == 0) {
                aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
            } else {
                AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
                throw null;
            }
        }
        final AFe1jSDK aFe1jSDKAfRDLog = valueOf().afRDLog();
        aFe1jSDKAfRDLog.AFInAppEventParameterName(AFa1mSDK.AFInAppEventType(context));
        this.onAppOpenAttribution = (Application) context.getApplicationContext();
        valueOf().getLevel().AFKeystoreWrapper(TtmlNode.START, str);
        String str2 = valueOf;
        AFLogger.afInfoLog("Starting AppsFlyer: (v6.10.1." + str2 + ")");
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        AFLogger.afInfoLog(sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.onAppOpenAttribution.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName = str;
            AFc1vSDK.AFKeystoreWrapper(str);
        } else if (TextUtils.isEmpty(this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName)) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1fSDK.AFInAppEventType);
                return;
            }
            return;
        }
        valueOf().afInfoLog().AFKeystoreWrapper(null);
        afInfoLog();
        afInfoLog(this.onAppOpenAttribution.getBaseContext());
        if (this.onAttributionFailure) {
            AFLogger(this.onAppOpenAttribution.getApplicationContext());
        }
        AFb1xSDK.AFInAppEventType(context, new AFb1xSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFb1wSDK.1
            @Override // com.appsflyer.internal.AFb1xSDK.AFa1ySDK
            public final void AFInAppEventType(Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFe1jSDK aFe1jSDK = aFe1jSDKAfRDLog;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = aFe1jSDK.afInfoLog;
                if (j != 0) {
                    long j6 = jCurrentTimeMillis - j;
                    if (j6 > 0 && j6 < 1000) {
                        j6 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j6);
                    aFe1jSDK.AFVersionDeclaration = seconds;
                    aFe1jSDK.AFInAppEventParameterName.values("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1wSDK.this.values(new WeakReference<>(context2));
                AFb1wSDK.this.valueOf().onInstallConversionDataLoadedNative().AFInAppEventType();
                AFb1rSDK level = AFb1wSDK.this.valueOf().getLevel();
                if (level.afInfoLog()) {
                    level.AFInAppEventType();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        level.AFInAppEventParameterName(context2.getPackageName(), context2.getPackageManager(), AFb1wSDK.AFInAppEventParameterName(AFb1wSDK.this));
                    }
                    level.AFInAppEventParameterName();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1bSDK.values(context2).AFKeystoreWrapper();
            }

            @Override // com.appsflyer.internal.AFb1xSDK.AFa1ySDK
            public final void valueOf(Activity activity) {
                aFe1jSDKAfRDLog.AFInAppEventParameterName();
                AFb1wSDK.this.valueOf().afInfoLog().AFKeystoreWrapper(null);
                AFb1wSDK.AFKeystoreWrapper(AFb1wSDK.this);
                int iAFKeystoreWrapper = AFb1wSDK.this.AFKeystoreWrapper(AFb1wSDK.valueOf(activity), false);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFKeystoreWrapper < 2) {
                    AFa1bSDK aFa1bSDKValues = AFa1bSDK.values(activity);
                    aFa1bSDKValues.AFKeystoreWrapper.post(aFa1bSDKValues.afRDLog);
                    aFa1bSDKValues.AFKeystoreWrapper.post(aFa1bSDKValues.AFInAppEventParameterName);
                }
                AFe1eSDK aFe1eSDK = new AFe1eSDK();
                AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName(aFe1eSDK.values(), activity.getIntent(), activity.getApplication());
                AFb1wSDK aFb1wSDK = AFb1wSDK.this;
                aFe1eSDK.AFKeystoreWrapper = (Application) activity.getApplicationContext();
                aFe1eSDK.AFInAppEventType = appsFlyerRequestListener;
                aFb1wSDK.AFKeystoreWrapper(aFe1eSDK, activity);
            }
        }, this.onValidateInAppFailure.AFInAppEventType());
    }

    public final void values(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            AppsFlyerLib = (onPause + 41) % 128;
            AFInAppEventType(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            onPause = (AppsFlyerLib + 65) % 128;
            AFInAppEventParameterName(context).AFInAppEventType("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.valueOf = stringExtra;
            if (AppsFlyerProperties.getInstance().valueOf()) {
                int i = onPause + 83;
                AppsFlyerLib = i % 128;
                if (i % 2 != 0) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFe1hSDK.onReceive);
                    AFKeystoreWrapper(context, stringExtra);
                } else {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFe1hSDK.onReceive);
                    AFKeystoreWrapper(context, stringExtra);
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Context context, Intent intent) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
        }
        AFa1sSDK.AFInAppEventParameterName();
        Context context2 = this.onValidateInAppFailure.AFInAppEventType.AFKeystoreWrapper;
        if (context2 != null) {
            AFc1ySDK aFc1ySDK = new AFc1ySDK(valueOf(context2));
            Uri uriValueOf = AFa1sSDK.valueOf(intent);
            boolean z4 = (uriValueOf == null || uriValueOf.toString().isEmpty()) ? false : true;
            if (aFc1ySDK.AFKeystoreWrapper("ddl_sent") && !z4) {
                AFb1pSDK.AFInAppEventType("No direct deep link", null);
                return;
            } else {
                AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName(new HashMap(), intent, context);
                return;
            }
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final AFc1zSDK valueOf() {
        int i = onPause + 43;
        int i4 = i % 128;
        AppsFlyerLib = i4;
        if (i % 2 == 0) {
            throw null;
        }
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        onPause = (i4 + 125) % 128;
        return aFb1aSDK;
    }

    private static String valueOf(String str) {
        onPause = (AppsFlyerLib + 87) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        AppsFlyerLib = (onPause + 19) % 128;
        return string;
    }

    private void valueOf(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1cSDK aFe1cSDK = new AFe1cSDK();
        if (context != null) {
            AppsFlyerLib = (onPause + 71) % 128;
            aFe1cSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        aFe1cSDK.afErrorLog = str;
        aFe1cSDK.values = map;
        if (context instanceof Activity) {
            AppsFlyerLib = (onPause + 75) % 128;
            activity = (Activity) context;
        } else {
            onPause = (AppsFlyerLib + 37) % 128;
            activity = null;
        }
        AFKeystoreWrapper(aFe1cSDK, activity);
        int i = AppsFlyerLib + 31;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        valueOf().getLevel().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        for (int i = 0; i < length; i++) {
            int i4 = onPause + 91;
            AppsFlyerLib = i4 % 128;
            if (i4 % 2 != 0) {
                String str2 = strArr[i];
                if (AnonymousClass6.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(AFb1ySDK.AFInAppEventParameterName(str2));
                    AppsFlyerLib = (onPause + 27) % 128;
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    onPause = (AppsFlyerLib + 31) % 128;
                    str = "plain_el_arr";
                }
            } else {
                String str3 = strArr[i];
                int i6 = AnonymousClass6.AFInAppEventParameterName[emailsCryptType.ordinal()];
                throw null;
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i10 = AppsFlyerLib + 51;
        onPause = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static void AFInAppEventType(String str, String str2) {
        int i = onPause + 11;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
        AppsFlyerProperties.getInstance().set(str, str2);
        onPause = (AppsFlyerLib + 101) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(AFe1ySDK aFe1ySDK) {
        int i = onPause + 1;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFe1ySDK aFe1ySDK2 = AFe1ySDK.SUCCESS;
            throw null;
        }
        if (aFe1ySDK == AFe1ySDK.SUCCESS) {
            valueOf().onInstallConversionDataLoadedNative().values();
            onPause = (AppsFlyerLib + 81) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r2.trim().length() > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File afInfoLog(java.lang.String r2) {
        /*
            if (r2 == 0) goto L39
            int r0 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1d
            java.lang.String r0 = r2.trim()     // Catch: java.lang.Throwable -> L31
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L31
            r1 = 48
            int r1 = r1 / 0
            if (r0 <= 0) goto L39
            goto L27
        L1d:
            java.lang.String r0 = r2.trim()     // Catch: java.lang.Throwable -> L31
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L31
            if (r0 <= 0) goto L39
        L27:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L31
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r2)
        L39:
            int r2 = com.appsflyer.internal.AFb1wSDK.onPause
            int r2 = r2 + 119
            int r2 = r2 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r2
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.afInfoLog(java.lang.String):java.io.File");
    }

    public static String AFInAppEventType() {
        int i = AppsFlyerLib + 21;
        onPause = i % 128;
        if (i % 2 == 0) {
            return valueOf(AppsFlyerProperties.APP_USER_ID);
        }
        int i4 = 66 / 0;
        return valueOf(AppsFlyerProperties.APP_USER_ID);
    }

    private static void AFInAppEventType(Map<String, Object> map) {
        onPause = (AppsFlyerLib + 35) % 128;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if (string != null) {
            map.put("onelink_id", string);
            onPause = (AppsFlyerLib + 83) % 128;
        }
        if (string2 != null) {
            int i = AppsFlyerLib + 121;
            onPause = i % 128;
            int i4 = i % 2;
            map.put("onelink_ver", string2);
            if (i4 != 0) {
                int i6 = 65 / 0;
            }
        }
    }

    @NonNull
    private AFf1oSDK[] afWarnLog() {
        AppsFlyerLib = (onPause + 27) % 128;
        AFf1oSDK[] aFf1oSDKArrAFInAppEventParameterName = valueOf().AFLogger$LogLevel().AFInAppEventParameterName();
        AppsFlyerLib = (onPause + 87) % 128;
        return aFf1oSDKArrAFInAppEventParameterName;
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        int i = onPause + 113;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    private void afInfoLog() {
        AppsFlyerLib = (onPause + 81) % 128;
        if (AFd1mSDK.afErrorLog()) {
            int i = onPause + 119;
            AppsFlyerLib = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        AFc1zSDK aFc1zSDKValueOf = valueOf();
        AFd1vSDK aFd1vSDKAFLogger = aFc1zSDKValueOf.AFLogger();
        aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(new AFd1mSDK(aFc1zSDKValueOf)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r6 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r6 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = (r7 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean valueOf(com.appsflyer.internal.AFa1tSDK r6, android.content.SharedPreferences r7) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r5.AFKeystoreWrapper(r7, r0)
            r2 = 1
            if (r1 != r2) goto L21
            int r3 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r3 = r3 + 101
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L1b
            boolean r6 = r6 instanceof com.appsflyer.internal.AFe1fSDK
            r3 = 4
            int r3 = r3 / r0
            if (r6 != 0) goto L21
            goto L1f
        L1b:
            boolean r6 = r6 instanceof com.appsflyer.internal.AFe1fSDK
            if (r6 != 0) goto L21
        L1f:
            r6 = r2
            goto L22
        L21:
            r6 = r0
        L22:
            java.lang.String r3 = "newGPReferrerSent"
            boolean r7 = r7.getBoolean(r3, r0)
            if (r7 != 0) goto L2e
            if (r1 != r2) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r0
        L2f:
            r7 = r7 ^ r2
            if (r7 == r2) goto L33
            goto L47
        L33:
            int r7 = com.appsflyer.internal.AFb1wSDK.onPause
            int r1 = r7 + 33
            int r3 = r1 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L45
            r1 = 42
            int r1 = r1 / r0
            if (r6 == 0) goto L50
            goto L47
        L45:
            if (r6 == 0) goto L50
        L47:
            int r6 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r6 = r6 + 43
            int r6 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r6
            return r2
        L50:
            int r7 = r7 + 19
            int r7 = r7 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.valueOf(com.appsflyer.internal.AFa1tSDK, android.content.SharedPreferences):boolean");
    }

    private static String AFInAppEventType(Activity activity) {
        String string = null;
        if (activity != null) {
            int i = onPause + 101;
            AppsFlyerLib = i % 128;
            if (i % 2 != 0) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null && (string = extras.getString("af")) != null) {
                            onPause = (AppsFlyerLib + 77) % 128;
                            AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(string)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                        }
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                    }
                }
            } else {
                activity.getIntent();
                throw null;
            }
        }
        AppsFlyerLib = (onPause + 97) % 128;
        return string;
    }

    private static boolean AFKeystoreWrapper(String str, boolean z4) {
        AppsFlyerLib = (onPause + 41) % 128;
        boolean z5 = AppsFlyerProperties.getInstance().getBoolean(str, z4);
        int i = AppsFlyerLib + 73;
        onPause = i % 128;
        if (i % 2 == 0) {
            return z5;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r0
  0x001c: PHI (r0v4 android.app.Application) = (r0v3 android.app.Application), (r0v12 android.app.Application) binds: [B:9:0x001a, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[PHI: r0
  0x0016: PHI (r0v11 android.app.Application) = 
  (r0v3 android.app.Application)
  (r0v4 android.app.Application)
  (r0v4 android.app.Application)
  (r0v12 android.app.Application)
 binds: [B:9:0x001a, B:13:0x002a, B:15:0x0030, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFKeystoreWrapper(@androidx.annotation.NonNull com.appsflyer.internal.AFa1tSDK r5, @androidx.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            java.lang.String r2 = ""
            if (r0 != 0) goto L18
            android.app.Application r0 = r5.AFKeystoreWrapper
            r3 = 5
            int r3 = r3 / 0
            if (r6 == 0) goto L16
            goto L1c
        L16:
            r6 = r2
            goto L3c
        L18:
            android.app.Application r0 = r5.AFKeystoreWrapper
            if (r6 == 0) goto L16
        L1c:
            int r1 = r1 + 111
            int r3 = r1 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L37
            android.content.Intent r1 = r6.getIntent()
            if (r1 == 0) goto L16
            android.net.Uri r6 = com.appsflyer.internal.AFb1iSDK.AFKeystoreWrapper(r6)
            if (r6 == 0) goto L16
            java.lang.String r6 = r6.toString()
            goto L3c
        L37:
            r6.getIntent()
            r5 = 0
            throw r5
        L3c:
            com.appsflyer.internal.AFb1aSDK r1 = r4.onValidateInAppFailure
            com.appsflyer.internal.AFe1sSDK r1 = r1.afWarnLog()
            java.lang.String r1 = r1.AFInAppEventParameterName
            if (r1 != 0) goto L57
            java.lang.String r6 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r6)
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.AFInAppEventType
            if (r5 == 0) goto L56
            int r6 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.AFb1fSDK.AFInAppEventType
            r5.onError(r6, r0)
        L56:
            return
        L57:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r1.getReferrer(r0)
            if (r0 != 0) goto L6a
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 11
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r0
            goto L6b
        L6a:
            r2 = r0
        L6b:
            r5.AFLogger = r2
            r5.valueOf = r6
            r4.AFInAppEventParameterName(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1tSDK, android.app.Activity):void");
    }

    private void valueOf(Context context, boolean z4, Map<String, Object> map, int i) {
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", AFKeystoreWrapper("ro.product.cpu.abi"));
        map2.put("cpu_abi2", AFKeystoreWrapper("ro.product.cpu.abi2"));
        map2.put("arch", AFKeystoreWrapper("os.arch"));
        map2.put("build_display_id", AFKeystoreWrapper("ro.build.display.id"));
        if (z4) {
            AppsFlyerLib = (onPause + 21) % 128;
            valueOf(context, map2);
            if (i <= 2) {
                onPause = (AppsFlyerLib + 81) % 128;
                map2.putAll(AFa1bSDK.values(context).AFInAppEventType());
                onPause = (AppsFlyerLib + 39) % 128;
            }
        }
        map2.put("dim", AFc1qSDK.AFKeystoreWrapper(context));
        map.put("deviceData", map2);
        int i4 = onPause + 85;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void values(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        onPause = (AppsFlyerLib + 31) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String string = svM7M6.getString(valueOf(context), "extraReferrers", null);
                if (string == null) {
                    jSONObject = new JSONObject();
                    jSONArray2 = new JSONArray();
                } else {
                    JSONObject jSONObject2 = new JSONObject(string);
                    if (jSONObject2.has(str)) {
                        jSONArray = new JSONArray((String) jSONObject2.get(str));
                    } else {
                        jSONArray = new JSONArray();
                    }
                    jSONArray2 = jSONArray;
                    jSONObject = jSONObject2;
                }
                if (jSONArray2.length() < 5) {
                    int i = AppsFlyerLib + 41;
                    onPause = i % 128;
                    if (i % 2 != 0) {
                        jSONArray2.put(jCurrentTimeMillis);
                        throw null;
                    }
                    jSONArray2.put(jCurrentTimeMillis);
                }
                if (jSONObject.length() >= 4) {
                    int i4 = AppsFlyerLib + 23;
                    onPause = i4 % 128;
                    if (i4 % 2 != 0) {
                        AFInAppEventParameterName(jSONObject);
                        int i6 = 26 / 0;
                    } else {
                        AFInAppEventParameterName(jSONObject);
                    }
                }
                jSONObject.put(str, jSONArray2.toString());
                AFInAppEventParameterName(context).AFInAppEventType("extraReferrers", jSONObject.toString());
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
                sb2.append(str);
                sb2.append(": ");
                AFLogger.afErrorLog(sb2.toString(), th2);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        }
    }

    private boolean afDebugLog() {
        int i = AppsFlyerLib + 59;
        onPause = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        Map<String, Object> map = this.onResponse;
        if (map == null || map.isEmpty()) {
            onPause = (AppsFlyerLib + 113) % 128;
            return false;
        }
        onPause = (AppsFlyerLib + 39) % 128;
        return true;
    }

    public final boolean AFInAppEventParameterName() {
        AppsFlyerLib = (onPause + 123) % 128;
        if (!AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || AFInAppEventType() != null) {
            AppsFlyerLib = (onPause + 101) % 128;
            return false;
        }
        int i = AppsFlyerLib + 121;
        onPause = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    private void AFInAppEventParameterName(Context context, AFe1hSDK aFe1hSDK) {
        int i = AppsFlyerLib;
        onPause = (i + 43) % 128;
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i4 = i + 103;
            onPause = i4 % 128;
            if (i4 % 2 == 0) {
                aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
                onPause = (AppsFlyerLib + 79) % 128;
            } else {
                AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
                throw null;
            }
        }
        AFe1jSDK aFe1jSDKAfRDLog = valueOf().afRDLog();
        AFe1kSDK aFe1kSDKAFInAppEventType = AFa1mSDK.AFInAppEventType(context);
        if (aFe1jSDKAfRDLog.AFInAppEventType()) {
            aFe1jSDKAfRDLog.AFKeystoreWrapper.put("api_name", aFe1hSDK.toString());
            aFe1jSDKAfRDLog.AFInAppEventParameterName(aFe1kSDKAFInAppEventType);
        }
        aFe1jSDKAfRDLog.AFInAppEventParameterName();
    }

    private static String AFLogger() {
        AppsFlyerLib = (onPause + 111) % 128;
        String strValueOf = valueOf(AppsFlyerProperties.APP_ID);
        onPause = (AppsFlyerLib + 7) % 128;
        return strValueOf;
    }

    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
            if (context != null) {
                onPause = (AppsFlyerLib + 79) % 128;
                aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        if (!map.containsKey("af_deeplink")) {
            String strAFInAppEventParameterName = AFInAppEventParameterName(uri.toString());
            AFa1sSDK aFa1sSDKAFInAppEventParameterName = AFa1sSDK.AFInAppEventParameterName();
            String str = aFa1sSDKAFInAppEventParameterName.valueOf;
            if (str != null && aFa1sSDKAFInAppEventParameterName.afInfoLog != null && strAFInAppEventParameterName.contains(str)) {
                AppsFlyerLib = (onPause + 97) % 128;
                Uri.Builder builderBuildUpon = Uri.parse(strAFInAppEventParameterName).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : aFa1sSDKAFInAppEventParameterName.afInfoLog.entrySet()) {
                    AppsFlyerLib = (onPause + 117) % 128;
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                strAFInAppEventParameterName = builderBuildUpon.build().toString();
                map.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", strAFInAppEventParameterName);
        }
        HashMap map2 = new HashMap();
        map2.put("link", uri.toString());
        AFd1eSDK aFd1eSDK = new AFd1eSDK(valueOf(), UUID.randomUUID(), uri);
        if (aFd1eSDK.afWarnLog()) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1cSDK.AFInAppEventParameterName(context, map2, uri);
        if (aFd1eSDK.AFVersionDeclaration()) {
            aFd1eSDK.afRDLog = valueOf(map2);
            AFd1vSDK aFd1vSDKAFLogger = this.onValidateInAppFailure.AFLogger();
            aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1eSDK));
            return;
        }
        AFb1pSDK.AFInAppEventParameterName(map2);
    }

    private void valueOf(Context context, Map<String, Object> map) {
        AppsFlyerLib = (onPause + 29) % 128;
        AFb1cSDK.AFa1vSDK aFa1vSDKValueOf = valueOf().init().valueOf(context);
        map.put("btl", Float.toString(aFa1vSDKValueOf.AFInAppEventParameterName));
        String str = aFa1vSDKValueOf.AFInAppEventType;
        if (str != null) {
            int i = onPause + 27;
            AppsFlyerLib = i % 128;
            int i4 = i % 2;
            map.put("btch", str);
            if (i4 == 0) {
                int i6 = 91 / 0;
            }
            AppsFlyerLib = (onPause + 79) % 128;
        }
    }

    private static void AFKeystoreWrapper(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = (onPause + 53) % 128;
        AppsFlyerLib = i;
        if (appsFlyerConversionListener == null) {
            onPause = (i + 51) % 128;
        } else {
            AFInAppEventType = appsFlyerConversionListener;
        }
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFe1bSDK aFe1bSDK = new AFe1bSDK();
        if (context != null) {
            AppsFlyerLib = (onPause + 57) % 128;
            aFe1bSDK.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        byte b8 = 0;
        AFa1tSDK aFa1tSDKAFKeystoreWrapper = aFe1bSDK.AFKeystoreWrapper(this.onValidateInAppFailure.valueOf().AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0));
        aFa1tSDKAFKeystoreWrapper.AFLogger = str;
        if (str != null) {
            int i = onPause + 113;
            AppsFlyerLib = i % 128;
            if (i % 2 == 0) {
                if (str.length() <= 2) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            if (valueOf(aFa1tSDKAFKeystoreWrapper, valueOf(context))) {
                AFInAppEventParameterName(this.onValidateInAppFailure.AFKeystoreWrapper(), new AFa1vSDK(this, aFa1tSDKAFKeystoreWrapper, b8), 5L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private int valueOf(SharedPreferences sharedPreferences) {
        int i = AppsFlyerLib + 27;
        onPause = i % 128;
        int iAFKeystoreWrapper = AFKeystoreWrapper(sharedPreferences, "appsFlyerAdRevenueCount", i % 2 == 0);
        onPause = (AppsFlyerLib + 21) % 128;
        return iAFKeystoreWrapper;
    }

    private void AFInAppEventParameterName(AFa1tSDK aFa1tSDK) {
        AppsFlyerLib = (onPause + 3) % 128;
        byte b8 = 0;
        boolean z4 = aFa1tSDK.afErrorLog == null;
        if (AFInAppEventParameterName()) {
            int i = onPause + 5;
            AppsFlyerLib = i % 128;
            if (i % 2 == 0) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            } else {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
        }
        if (z4) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                if (afRDLog()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = aFa1tSDK.AFInAppEventType;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, AFb1fSDK.valueOf);
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.AppsFlyer2dXConversionCallback = System.currentTimeMillis();
        }
        AFInAppEventParameterName(this.onValidateInAppFailure.AFKeystoreWrapper(), new AFa1vSDK(this, aFa1tSDK, b8), 0L, TimeUnit.MILLISECONDS);
    }

    private AFd1eSDK.AFa1zSDK valueOf(final Map<String, String> map) {
        AFd1eSDK.AFa1zSDK aFa1zSDK = new AFd1eSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1wSDK.4
            @Override // com.appsflyer.internal.AFd1eSDK.AFa1zSDK
            public final void AFInAppEventParameterName(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1pSDK.AFInAppEventParameterName((Map<String, String>) map);
            }

            @Override // com.appsflyer.internal.AFd1eSDK.AFa1zSDK
            public final void values(String str) {
                AFb1pSDK.AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }
        };
        AppsFlyerLib = (onPause + 25) % 128;
        return aFa1zSDK;
    }

    private static boolean afRDLog(Context context) {
        int i = AppsFlyerLib + 33;
        onPause = i % 128;
        if (i % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AppsFlyerLib = (onPause + 61) % 128;
                if (AFKeystoreWrapper(context)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String valueOf(File file, String str) {
        FileReader fileReader;
        Properties properties;
        try {
            try {
                try {
                    properties = new Properties();
                    fileReader = new FileReader(file);
                } catch (Throwable th2) {
                    AFLogger.afErrorLog(th2.getMessage(), th2);
                    return null;
                }
            } catch (FileNotFoundException unused) {
                fileReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
            }
            try {
                properties.load(fileReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                String property = properties.getProperty(str);
                try {
                    fileReader.close();
                    AppsFlyerLib = (onPause + 29) % 128;
                    return property;
                } catch (Throwable th4) {
                    AFLogger.afErrorLog(th4.getMessage(), th4);
                    return property;
                }
            } catch (FileNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
                sb2.append(file.getAbsolutePath());
                AFLogger.afDebugLog(sb2.toString());
                if (fileReader != null) {
                    fileReader.close();
                }
                return null;
            } catch (Throwable th5) {
                th = th5;
                AFLogger.afErrorLog(th.getMessage(), th);
                if (fileReader != null) {
                    fileReader.close();
                    onPause = (AppsFlyerLib + 43) % 128;
                }
                return null;
            }
        } catch (Throwable th6) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Throwable th7) {
                    AFLogger.afErrorLog(th7.getMessage(), th7);
                }
            }
            throw th6;
        }
    }

    private static void values(String str, boolean z4) {
        onPause = (AppsFlyerLib + 115) % 128;
        AppsFlyerProperties.getInstance().set(str, z4);
        AppsFlyerLib = (onPause + 123) % 128;
    }

    public final void values(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        SharedPreferences sharedPreferencesValueOf = valueOf(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferencesValueOf);
        long j = valueOf().afRDLog().AFVersionDeclaration;
        HashMap map = new HashMap();
        String str = this.onValidateInAppFailure.afWarnLog().AFInAppEventParameterName;
        if (str == null) {
            onPause = (AppsFlyerLib + 103) % 128;
            AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String strValueOf = valueOf("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i = AppsFlyerLib + 113;
            onPause = i % 128;
            if (i % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i4 = 51 / 0;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
        }
        AFc1oSDK.AFa1vSDK aFa1vSDKValueOf = AFa1eSDK.valueOf(weakReference.get().getContentResolver());
        if (aFa1vSDKValueOf != null) {
            map.put("amazon_aid", aFa1vSDKValueOf.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(aFa1vSDKValueOf.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            int i6 = onPause + 45;
            AppsFlyerLib = i6 % 128;
            if (i6 % 2 == 0) {
                map.put("advertiserId", string);
                int i10 = 22 / 0;
            } else {
                map.put("advertiserId", string);
            }
        }
        map.put("app_id", weakReference.get().getPackageName());
        map.put("devkey", str);
        map.put("uid", AFb1zSDK.AFInAppEventParameterName(weakReference));
        map.put("time_in_app", String.valueOf(j));
        map.put("statType", "user_closed_app");
        map.put("platform", EventMetricsAggregator.OS_NAME);
        map.put("launch_counter", Integer.toString(AFKeystoreWrapper(sharedPreferencesValueOf, false)));
        map.put(AppsFlyerProperties.CHANNEL, values(weakReference.get()));
        if (strValueOf == null) {
            strValueOf = "";
        }
        map.put("originalAppsflyerId", strValueOf);
        if (this.onDeepLinkingNative) {
            AFf1xSDK aFf1xSDK = new AFf1xSDK();
            ((AFe1iSDK) aFf1xSDK).afWarnLog = isStopped();
            AFd1hSDK aFd1hSDK = new AFd1hSDK((AFf1xSDK) aFf1xSDK.AFKeystoreWrapper(this.onValidateInAppFailure.valueOf().AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0)).AFKeystoreWrapper(map).AFInAppEventParameterName(String.format(afErrorLog, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName())), this.onValidateInAppFailure);
            AFd1vSDK aFd1vSDKAFLogger = this.onValidateInAppFailure.AFLogger();
            aFd1vSDKAFLogger.values.execute(aFd1vSDKAFLogger.new AnonymousClass2(aFd1hSDK));
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i = onPause + 97;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                return;
            }
        } else if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            return;
        }
        onPause = (AppsFlyerLib + 103) % 128;
        if (map.get("advertiserId") != null) {
            try {
                if (AFb1nSDK.values(this.AFLogger) && map.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (!AFb1nSDK.values(this.onValidateInAppFailure.afWarnLog().AFKeystoreWrapper) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        Map<String, Object> map2;
        int i = AppsFlyerLib + 65;
        onPause = i % 128;
        if (i % 2 != 0) {
            map.containsKey("meta");
            throw null;
        }
        if (map.containsKey("meta")) {
            map2 = (Map) map.get("meta");
        } else {
            HashMap map3 = new HashMap();
            map.put("meta", map3);
            AppsFlyerLib = (onPause + 121) % 128;
            map2 = map3;
        }
        int i4 = onPause + 81;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 != 0) {
            return map2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean valueOf(java.io.File r2) {
        /*
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L13
            r0 = 40
            int r0 = r0 / r1
            if (r2 == 0) goto L1d
            goto L15
        L13:
            if (r2 == 0) goto L1d
        L15:
            boolean r2 = r2.exists()
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            return r1
        L1d:
            int r2 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r2 = r2 + 109
            int r0 = r2 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L2b
            r2 = 1
            return r2
        L2b:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.valueOf(java.io.File):boolean");
    }

    public static synchronized SharedPreferences valueOf(Context context) {
        try {
            onPause = (AppsFlyerLib + 27) % 128;
            if (AFKeystoreWrapper().onDeepLinking == null) {
                AppsFlyerLib = (onPause + 119) % 128;
                AFKeystoreWrapper().onDeepLinking = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return AFKeystoreWrapper().onDeepLinking;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void AFInAppEventParameterName(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            java.lang.String r0 = "window"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L59
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 3
            r3 = 1
            java.lang.String r4 = ""
            if (r0 != 0) goto L30
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            r0 = 20
            int r0 = r0 / 0
            if (r5 == 0) goto L4a
            if (r5 == r3) goto L47
            if (r5 == r1) goto L44
            if (r5 == r2) goto L41
            goto L54
        L30:
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            if (r5 == 0) goto L4a
            if (r5 == r3) goto L47
            if (r5 == r1) goto L44
            if (r5 == r2) goto L41
            goto L54
        L41:
            java.lang.String r4 = "lr"
            goto L54
        L44:
            java.lang.String r4 = "pr"
            goto L54
        L47:
            java.lang.String r4 = "l"
            goto L54
        L4a:
            int r5 = com.appsflyer.internal.AFb1wSDK.onPause
            int r5 = r5 + 47
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r5
            java.lang.String r4 = "p"
        L54:
            java.lang.String r5 = "sc_o"
            r6.put(r5, r4)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFInAppEventParameterName(android.content.Context, java.util.Map):void");
    }

    private void AFInAppEventType(Context context, Map<String, Object> map) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        Context context2 = this.onValidateInAppFailure.AFInAppEventType.AFKeystoreWrapper;
        if (context2 != null) {
            AFc1ySDK aFc1ySDK = new AFc1ySDK(valueOf(context2));
            String strValues = this.onValidateInAppFailure.afWarnLog().values(aFc1ySDK);
            if (!AFb1nSDK.values(strValues)) {
                map.put("imei", strValues);
            }
            boolean z4 = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
            String str = null;
            String strAFInAppEventParameterName = aFc1ySDK.AFInAppEventParameterName("androidIdCached", (String) null);
            if (z4 && AFb1nSDK.values(this.AFLogger)) {
                if (afRDLog(context)) {
                    try {
                        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        if (string != null) {
                            str = string;
                        } else if (strAFInAppEventParameterName != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(strAFInAppEventParameterName));
                            str = strAFInAppEventParameterName;
                        }
                    } catch (Exception e) {
                        if (strAFInAppEventParameterName != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(strAFInAppEventParameterName));
                            str = strAFInAppEventParameterName;
                        }
                        AFLogger.afErrorLog(e.getMessage(), e);
                    }
                }
            } else {
                String str2 = this.AFLogger;
                if (str2 != null) {
                    str = str2;
                }
            }
            if (str != null) {
                aFc1ySDK.AFInAppEventType("androidIdCached", str);
                map.put("android_id", str);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
            AFc1oSDK.AFa1vSDK aFa1vSDKAFInAppEventParameterName = AFa1eSDK.AFInAppEventParameterName(context);
            if (aFa1vSDKAFInAppEventParameterName != null) {
                HashMap map2 = new HashMap();
                map2.put("isManual", aFa1vSDKAFInAppEventParameterName.AFKeystoreWrapper);
                map2.put("val", aFa1vSDKAFInAppEventParameterName.AFInAppEventParameterName);
                Boolean bool = aFa1vSDKAFInAppEventParameterName.AFInAppEventType;
                if (bool != null) {
                    map2.put("isLat", bool);
                }
                map.put("oaid", map2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static String AFInAppEventParameterName(@Nullable String str) {
        if (str == null) {
            int i = AppsFlyerLib + 101;
            onPause = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        onPause = (AppsFlyerLib + 63) % 128;
        String strValues = values(str);
        if (strValues.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (strValues.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(strValues.split("&")));
        } else {
            arrayList.add(strValues);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            onPause = (AppsFlyerLib + 35) % 128;
            String str2 = (String) it.next();
            if (!str2.contains("access_token")) {
                if (sb2.length() != 0) {
                    AppsFlyerLib = (onPause + 117) % 128;
                    sb2.append("&");
                } else if (!str2.startsWith(Global.QUESTION)) {
                    onPause = (AppsFlyerLib + 19) % 128;
                    sb2.append(Global.QUESTION);
                }
                sb2.append(str2);
            } else {
                it.remove();
            }
        }
        return str.replace(strValues, sb2.toString());
    }

    private static boolean AFKeystoreWrapper(@NonNull SharedPreferences sharedPreferences) {
        int i = onPause + 41;
        AppsFlyerLib = i % 128;
        int i4 = i % 2;
        String string = svM7M6.getString(sharedPreferences, "sentSuccessfully", null);
        if (i4 == 0) {
            Boolean.parseBoolean(string);
            throw null;
        }
        boolean z4 = Boolean.parseBoolean(string);
        onPause = (AppsFlyerLib + 117) % 128;
        return z4;
    }

    public static void AFKeystoreWrapper(Context context, Map<String, ? super String> map) {
        String str;
        boolean zAFKeystoreWrapper = AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1kSDK aFa1kSDK = AFa1kSDK.AFa1wSDK.AFInAppEventParameterName;
        AFa1kSDK.AFa1zSDK aFa1zSDKAFInAppEventType = AFa1kSDK.AFInAppEventType(context);
        map.put("network", aFa1zSDKAFInAppEventType.values);
        if (!zAFKeystoreWrapper && (str = aFa1zSDKAFInAppEventType.valueOf) != null) {
            map.put("operator", str);
        }
        if (!zAFKeystoreWrapper) {
            AppsFlyerLib = (onPause + 87) % 128;
            String str2 = aFa1zSDKAFInAppEventType.AFInAppEventParameterName;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
        AppsFlyerLib = (onPause + 3) % 128;
    }

    public static boolean AFKeystoreWrapper(Context context) {
        AppsFlyerLib = (onPause + 43) % 128;
        try {
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            return true;
        }
        onPause = (AppsFlyerLib + 105) % 128;
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static String AFKeystoreWrapper(String str) {
        Object objInvoke;
        int i = onPause + 11;
        AppsFlyerLib = i % 128;
        try {
            if (i % 2 == 0) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                new Class[0][0] = String.class;
                Method method = cls.getMethod("get", null);
                Object[] objArr = new Object[1];
                objArr[1] = str;
                objInvoke = method.invoke(null, objArr);
            } else {
                objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            }
            return (String) objInvoke;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void values(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.String r8, java.lang.String r9) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L5f
            if (r6 == 0) goto L26
            int r1 = r1 + 97
            int r1 = r1 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r1
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            goto L26
        L20:
            com.appsflyer.internal.AFe1cSDK r0 = new com.appsflyer.internal.AFe1cSDK
            r0.<init>()
            goto L2b
        L26:
            com.appsflyer.internal.AFe1eSDK r0 = new com.appsflyer.internal.AFe1eSDK
            r0.<init>()
        L2b:
            if (r5 == 0) goto L4b
            int r1 = com.appsflyer.internal.AFb1wSDK.onPause
            int r1 = r1 + 101
            int r3 = r1 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L42
            android.content.Context r5 = r5.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            r0.AFKeystoreWrapper = r5
            goto L4b
        L42:
            android.content.Context r5 = r5.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            r0.AFKeystoreWrapper = r5
            throw r2
        L4b:
            r0.afErrorLog = r6
            r0.values = r7
            r0.AFLogger = r8
            r0.valueOf = r9
            r4.AFInAppEventParameterName(r0)
            int r5 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r5 = r5 + 57
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r5
            return
        L5f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.values(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void");
    }

    private static void AFInAppEventParameterName(Context context, Map<String, Object> map, String str) {
        int i = onPause + 107;
        AppsFlyerLib = i % 128;
        try {
            if (i % 2 != 0) {
                SharedPreferences sharedPreferencesValueOf = valueOf(context);
                SharedPreferences.Editor editorEdit = sharedPreferencesValueOf.edit();
                String string = svM7M6.getString(sharedPreferencesValueOf, "prev_event_name", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", sharedPreferencesValueOf.getLong("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", string);
                    map.put("prev_event", jSONObject);
                    onPause = (AppsFlyerLib + 115) % 128;
                }
                editorEdit.putString("prev_event_name", str).putLong("prev_event_timestamp", System.currentTimeMillis()).apply();
                return;
            }
            SharedPreferences sharedPreferencesValueOf2 = valueOf(context);
            sharedPreferencesValueOf2.edit();
            svM7M6.getString(sharedPreferencesValueOf2, "prev_event_name", null);
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private static void AFInAppEventType(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                onPause = (AppsFlyerLib + 9) % 128;
                AFInAppEventType("preInstallName", str);
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i = AppsFlyerLib + 53;
            onPause = i % 128;
            if (i % 2 != 0) {
                int i4 = 63 / 0;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    public final int AFKeystoreWrapper(SharedPreferences sharedPreferences, boolean z4) {
        onPause = (AppsFlyerLib + 111) % 128;
        int iAFKeystoreWrapper = AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", z4);
        int i = onPause + 107;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            int i4 = 63 / 0;
        }
        return iAFKeystoreWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r0
  0x001c: PHI (r0v4 int) = (r0v3 int), (r0v7 int) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int AFKeystoreWrapper(android.content.SharedPreferences r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1wSDK.onPause
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L15
            int r0 = r4.getInt(r5, r2)
            if (r6 == 0) goto L38
            goto L1c
        L15:
            int r0 = r4.getInt(r5, r2)
            if (r6 == r1) goto L1c
            goto L38
        L1c:
            int r6 = com.appsflyer.internal.AFb1wSDK.onPause
            int r6 = r6 + 113
            int r6 = r6 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r6
            int r0 = r0 + r1
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.putInt(r5, r0)
            r4.apply()
            int r4 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r4 = r4 + 103
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r4
        L38:
            com.appsflyer.internal.AFc1zSDK r4 = r3.valueOf()
            com.appsflyer.internal.AFb1rSDK r4 = r4.getLevel()
            boolean r4 = r4.afInfoLog()
            if (r4 == 0) goto L5d
            int r4 = com.appsflyer.internal.AFb1wSDK.onPause
            int r4 = r4 + 3
            int r4 = r4 % 128
            com.appsflyer.internal.AFb1wSDK.AppsFlyerLib = r4
            com.appsflyer.internal.AFc1zSDK r4 = r3.valueOf()
            com.appsflyer.internal.AFb1rSDK r4 = r4.getLevel()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r4.AFKeystoreWrapper(r5)
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFKeystoreWrapper(android.content.SharedPreferences, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0431 A[Catch: all -> 0x00b7, TryCatch #9 {all -> 0x00b7, blocks: (B:14:0x00a5, B:16:0x00ab, B:22:0x00c0, B:24:0x00d0, B:25:0x00d8, B:27:0x00eb, B:31:0x0102, B:33:0x011e, B:36:0x0126, B:38:0x012e, B:39:0x0133, B:41:0x0139, B:43:0x0141, B:46:0x014c, B:48:0x01cc, B:50:0x01d2, B:52:0x01d8, B:53:0x01e5, B:55:0x01f2, B:57:0x01f8, B:58:0x0200, B:60:0x0206, B:61:0x020d, B:63:0x0225, B:64:0x022a, B:67:0x0232, B:68:0x0235, B:70:0x023c, B:71:0x023f, B:73:0x0249, B:75:0x024f, B:76:0x0252, B:78:0x0258, B:79:0x0261, B:84:0x0276, B:86:0x0281, B:89:0x028b, B:90:0x0290, B:92:0x0298, B:94:0x02ad, B:97:0x02bd, B:99:0x02c7, B:100:0x02d1, B:102:0x02d9, B:103:0x02de, B:105:0x02ec, B:109:0x02f8, B:111:0x02fe, B:113:0x0304, B:114:0x0307, B:116:0x0315, B:120:0x031f, B:121:0x0324, B:123:0x032a, B:124:0x0333, B:126:0x0339, B:127:0x0342, B:129:0x0348, B:132:0x0355, B:134:0x035b, B:140:0x0372, B:142:0x0378, B:143:0x037d, B:145:0x0386, B:150:0x03a2, B:151:0x03ac, B:153:0x03b2, B:154:0x03bb, B:156:0x03c4, B:158:0x03ca, B:159:0x03e0, B:160:0x03e5, B:162:0x03ed, B:163:0x03f2, B:175:0x0431, B:176:0x0436, B:177:0x0439, B:179:0x0444, B:183:0x0461, B:187:0x0475, B:191:0x0489, B:195:0x049d, B:196:0x04b4, B:211:0x0561, B:213:0x057e, B:215:0x0588, B:217:0x058c, B:219:0x0594, B:221:0x059b, B:222:0x05b4, B:239:0x0617, B:253:0x0647, B:260:0x0676, B:245:0x0629, B:210:0x055b, B:199:0x04ce, B:194:0x0498, B:190:0x0484, B:186:0x0470, B:182:0x044c, B:171:0x0420, B:173:0x0425, B:146:0x038d, B:148:0x0396, B:135:0x035f, B:137:0x0369, B:139:0x036f, B:108:0x02f3, B:83:0x026b, B:93:0x02a9, B:45:0x0147, B:30:0x00fd, B:23:0x00cb, B:165:0x0408), top: B:368:0x00a5, inners: #1, #4, #11, #12, #14, #16, #18, #21, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0444 A[Catch: all -> 0x00b7, Exception -> 0x044b, TRY_LEAVE, TryCatch #16 {Exception -> 0x044b, blocks: (B:177:0x0439, B:179:0x0444), top: B:380:0x0439, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ea A[Catch: all -> 0x04f4, TryCatch #7 {all -> 0x04f4, blocks: (B:200:0x04d3, B:202:0x04ea, B:205:0x04f8), top: B:364:0x04d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x057e A[Catch: all -> 0x00b7, TryCatch #9 {all -> 0x00b7, blocks: (B:14:0x00a5, B:16:0x00ab, B:22:0x00c0, B:24:0x00d0, B:25:0x00d8, B:27:0x00eb, B:31:0x0102, B:33:0x011e, B:36:0x0126, B:38:0x012e, B:39:0x0133, B:41:0x0139, B:43:0x0141, B:46:0x014c, B:48:0x01cc, B:50:0x01d2, B:52:0x01d8, B:53:0x01e5, B:55:0x01f2, B:57:0x01f8, B:58:0x0200, B:60:0x0206, B:61:0x020d, B:63:0x0225, B:64:0x022a, B:67:0x0232, B:68:0x0235, B:70:0x023c, B:71:0x023f, B:73:0x0249, B:75:0x024f, B:76:0x0252, B:78:0x0258, B:79:0x0261, B:84:0x0276, B:86:0x0281, B:89:0x028b, B:90:0x0290, B:92:0x0298, B:94:0x02ad, B:97:0x02bd, B:99:0x02c7, B:100:0x02d1, B:102:0x02d9, B:103:0x02de, B:105:0x02ec, B:109:0x02f8, B:111:0x02fe, B:113:0x0304, B:114:0x0307, B:116:0x0315, B:120:0x031f, B:121:0x0324, B:123:0x032a, B:124:0x0333, B:126:0x0339, B:127:0x0342, B:129:0x0348, B:132:0x0355, B:134:0x035b, B:140:0x0372, B:142:0x0378, B:143:0x037d, B:145:0x0386, B:150:0x03a2, B:151:0x03ac, B:153:0x03b2, B:154:0x03bb, B:156:0x03c4, B:158:0x03ca, B:159:0x03e0, B:160:0x03e5, B:162:0x03ed, B:163:0x03f2, B:175:0x0431, B:176:0x0436, B:177:0x0439, B:179:0x0444, B:183:0x0461, B:187:0x0475, B:191:0x0489, B:195:0x049d, B:196:0x04b4, B:211:0x0561, B:213:0x057e, B:215:0x0588, B:217:0x058c, B:219:0x0594, B:221:0x059b, B:222:0x05b4, B:239:0x0617, B:253:0x0647, B:260:0x0676, B:245:0x0629, B:210:0x055b, B:199:0x04ce, B:194:0x0498, B:190:0x0484, B:186:0x0470, B:182:0x044c, B:171:0x0420, B:173:0x0425, B:146:0x038d, B:148:0x0396, B:135:0x035f, B:137:0x0369, B:139:0x036f, B:108:0x02f3, B:83:0x026b, B:93:0x02a9, B:45:0x0147, B:30:0x00fd, B:23:0x00cb, B:165:0x0408), top: B:368:0x00a5, inners: #1, #4, #11, #12, #14, #16, #18, #21, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0588 A[Catch: all -> 0x00b7, TryCatch #9 {all -> 0x00b7, blocks: (B:14:0x00a5, B:16:0x00ab, B:22:0x00c0, B:24:0x00d0, B:25:0x00d8, B:27:0x00eb, B:31:0x0102, B:33:0x011e, B:36:0x0126, B:38:0x012e, B:39:0x0133, B:41:0x0139, B:43:0x0141, B:46:0x014c, B:48:0x01cc, B:50:0x01d2, B:52:0x01d8, B:53:0x01e5, B:55:0x01f2, B:57:0x01f8, B:58:0x0200, B:60:0x0206, B:61:0x020d, B:63:0x0225, B:64:0x022a, B:67:0x0232, B:68:0x0235, B:70:0x023c, B:71:0x023f, B:73:0x0249, B:75:0x024f, B:76:0x0252, B:78:0x0258, B:79:0x0261, B:84:0x0276, B:86:0x0281, B:89:0x028b, B:90:0x0290, B:92:0x0298, B:94:0x02ad, B:97:0x02bd, B:99:0x02c7, B:100:0x02d1, B:102:0x02d9, B:103:0x02de, B:105:0x02ec, B:109:0x02f8, B:111:0x02fe, B:113:0x0304, B:114:0x0307, B:116:0x0315, B:120:0x031f, B:121:0x0324, B:123:0x032a, B:124:0x0333, B:126:0x0339, B:127:0x0342, B:129:0x0348, B:132:0x0355, B:134:0x035b, B:140:0x0372, B:142:0x0378, B:143:0x037d, B:145:0x0386, B:150:0x03a2, B:151:0x03ac, B:153:0x03b2, B:154:0x03bb, B:156:0x03c4, B:158:0x03ca, B:159:0x03e0, B:160:0x03e5, B:162:0x03ed, B:163:0x03f2, B:175:0x0431, B:176:0x0436, B:177:0x0439, B:179:0x0444, B:183:0x0461, B:187:0x0475, B:191:0x0489, B:195:0x049d, B:196:0x04b4, B:211:0x0561, B:213:0x057e, B:215:0x0588, B:217:0x058c, B:219:0x0594, B:221:0x059b, B:222:0x05b4, B:239:0x0617, B:253:0x0647, B:260:0x0676, B:245:0x0629, B:210:0x055b, B:199:0x04ce, B:194:0x0498, B:190:0x0484, B:186:0x0470, B:182:0x044c, B:171:0x0420, B:173:0x0425, B:146:0x038d, B:148:0x0396, B:135:0x035f, B:137:0x0369, B:139:0x036f, B:108:0x02f3, B:83:0x026b, B:93:0x02a9, B:45:0x0147, B:30:0x00fd, B:23:0x00cb, B:165:0x0408), top: B:368:0x00a5, inners: #1, #4, #11, #12, #14, #16, #18, #21, #23, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x094e A[Catch: all -> 0x0915, TryCatch #22 {all -> 0x0915, blocks: (B:315:0x0923, B:317:0x0946, B:319:0x094e, B:323:0x0960, B:325:0x096a, B:327:0x0974, B:328:0x0986, B:305:0x0911), top: B:366:0x0911 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0974 A[Catch: all -> 0x0915, TryCatch #22 {all -> 0x0915, blocks: (B:315:0x0923, B:317:0x0946, B:319:0x094e, B:323:0x0960, B:325:0x096a, B:327:0x0974, B:328:0x0986, B:305:0x0911), top: B:366:0x0911 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a05 A[Catch: all -> 0x09c0, TryCatch #13 {all -> 0x09c0, blocks: (B:330:0x0997, B:334:0x09ab, B:337:0x09bb, B:340:0x09c3, B:342:0x0a05, B:343:0x0a15, B:345:0x0ab5, B:347:0x0ab9, B:348:0x0ac0), top: B:375:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0ab5 A[Catch: all -> 0x09c0, TryCatch #13 {all -> 0x09c0, blocks: (B:330:0x0997, B:334:0x09ab, B:337:0x09bb, B:340:0x09c3, B:342:0x0a05, B:343:0x0a15, B:345:0x0ab5, B:347:0x0ab9, B:348:0x0ac0), top: B:375:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.appsflyer.internal.AFb1wSDK] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.appsflyer.internal.AFb1wSDK] */
    /* JADX WARN: Type inference failed for: r3v32, types: [com.appsflyer.internal.AFb1hSDK] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.appsflyer.AppsFlyerProperties] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r6v32, types: [com.appsflyer.AppsFlyerProperties] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.appsflyer.internal.AFb1hSDK] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type update failed for variable: r2v13 ??, new type: java.util.Map<java.lang.String, java.lang.Object>
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27791. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
     */
    /* JADX WARN: Type update failed for variable: r2v22 ??, new type: java.util.Map<java.lang.String, java.lang.Object>
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27791. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:367)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType(com.appsflyer.internal.AFa1tSDK r34) {
        /*
            Method dump skipped, instruction units count: 2779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFInAppEventType(com.appsflyer.internal.AFa1tSDK):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFKeystoreWrapper(com.appsflyer.internal.AFa1tSDK r14) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1tSDK):void");
    }

    private static String values(String str) {
        onPause = (AppsFlyerLib + 59) % 128;
        int iIndexOf = str.indexOf(63);
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(iIndexOf);
        AppsFlyerLib = (onPause + 57) % 128;
        return strSubstring;
    }

    private int values(SharedPreferences sharedPreferences, boolean z4) {
        int i = onPause + 15;
        AppsFlyerLib = i % 128;
        if (i % 2 == 0) {
            AFKeystoreWrapper(sharedPreferences, "appsFlyerInAppEventCount", z4);
            throw null;
        }
        int iAFKeystoreWrapper = AFKeystoreWrapper(sharedPreferences, "appsFlyerInAppEventCount", z4);
        AppsFlyerLib = (onPause + 45) % 128;
        return iAFKeystoreWrapper;
    }

    private static void values(Map<String, Object> map, AFe1jSDK aFe1jSDK) {
        HashMap map2 = new HashMap(aFe1jSDK.values);
        aFe1jSDK.values.clear();
        aFe1jSDK.AFInAppEventParameterName.AFInAppEventType("gcd");
        if (map2.isEmpty()) {
            return;
        }
        int i = onPause + 45;
        AppsFlyerLib = i % 128;
        if (i % 2 != 0) {
            AFInAppEventParameterName(map).put("gcd", map2);
            onPause = (AppsFlyerLib + 121) % 128;
        } else {
            AFInAppEventParameterName(map).put("gcd", map2);
            throw null;
        }
    }

    public static String AFInAppEventParameterName(AFb1gSDK aFb1gSDK, String str) {
        int i = AppsFlyerLib + 15;
        onPause = i % 128;
        if (i % 2 == 0) {
            String strAFInAppEventParameterName = aFb1gSDK.AFInAppEventParameterName("CACHED_CHANNEL", (String) null);
            if (strAFInAppEventParameterName != null) {
                int i4 = AppsFlyerLib + 41;
                onPause = i4 % 128;
                if (i4 % 2 != 0) {
                    int i6 = 53 / 0;
                }
                return strAFInAppEventParameterName;
            }
            aFb1gSDK.AFInAppEventType("CACHED_CHANNEL", str);
            return str;
        }
        aFb1gSDK.AFInAppEventParameterName("CACHED_CHANNEL", (String) null);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFInAppEventParameterName(java.text.SimpleDateFormat r4, android.content.Context r5) {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = valueOf(r5)
            r1 = 0
            java.lang.String r2 = "appsFlyerFirstInstall"
            java.lang.String r0 = dOYHB6.yFtIp6.svM7M6.getString(r0, r2, r1)
            if (r0 != 0) goto L4c
            int r0 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L24
            boolean r0 = afErrorLog(r5)
            r1 = 14
            int r1 = r1 / 0
            if (r0 == 0) goto L42
            goto L2a
        L24:
            boolean r0 = afErrorLog(r5)
            if (r0 == 0) goto L42
        L2a:
            java.lang.String r0 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r4 = r4.format(r0)
            int r0 = com.appsflyer.internal.AFb1wSDK.AppsFlyerLib
            int r0 = r0 + 125
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1wSDK.onPause = r0
        L40:
            r0 = r4
            goto L45
        L42:
            java.lang.String r4 = ""
            goto L40
        L45:
            com.appsflyer.internal.AFb1gSDK r4 = r3.AFInAppEventParameterName(r5)
            r4.AFInAppEventType(r2, r0)
        L4c:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "AppsFlyer: first launch date: "
            java.lang.String r4 = r5.concat(r4)
            com.appsflyer.AFLogger.afInfoLog(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1wSDK.AFInAppEventParameterName(java.text.SimpleDateFormat, android.content.Context):java.lang.String");
    }

    @Nullable
    @Deprecated
    public final String values(Context context) {
        int i = (onPause + 53) % 128;
        AppsFlyerLib = i;
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            int i4 = i + 49;
            onPause = i4 % 128;
            if (i4 % 2 == 0) {
                AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
                if (context != null) {
                    aFc1xSDK.AFKeystoreWrapper = context.getApplicationContext();
                }
            } else {
                AFc1xSDK aFc1xSDK2 = aFb1aSDK.AFInAppEventType;
                throw null;
            }
        }
        return this.onValidateInAppFailure.valueOf().values();
    }

    public final AFb1gSDK AFInAppEventParameterName(Context context) {
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        if (context != null) {
            aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
        }
        Context context2 = this.onValidateInAppFailure.AFInAppEventType.AFKeystoreWrapper;
        if (context2 != null) {
            return new AFc1ySDK(valueOf(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static void AFInAppEventParameterName(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        onPause = (AppsFlyerLib + 47) % 128;
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
            int i = AppsFlyerLib + 11;
            onPause = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th2);
        }
    }

    @NonNull
    @Deprecated
    public static String AFInAppEventParameterName(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                InputStream errorStream = Callback.getErrorStream(httpURLConnection);
                if (errorStream == null) {
                    errorStream = Callback.getInputStream((URLConnection) httpURLConnection);
                }
                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    boolean z4 = false;
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            int i = (AppsFlyerLib + 27) % 128;
                            onPause = i;
                            if (z4) {
                                AppsFlyerLib = (i + 113) % 128;
                                obj = '\n';
                            } else {
                                obj = "";
                            }
                            sb2.append(obj);
                            sb2.append(line);
                            z4 = true;
                        } catch (Throwable th2) {
                            bufferedReader = bufferedReader2;
                            th = th2;
                            inputStreamReader = inputStreamReader2;
                            try {
                                StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                                sb3.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb3.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    int i4 = AppsFlyerLib + 59;
                                    onPause = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        inputStreamReader.close();
                                        throw null;
                                    }
                                    inputStreamReader.close();
                                }
                            } catch (Throwable th3) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th4) {
                                        AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th4);
                                        throw th3;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                throw th3;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader2.close();
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
                inputStreamReader = null;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th7);
        }
        String string = sb2.toString();
        try {
            new JSONObject(string);
            return string;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", string);
                return jSONObject.toString();
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", e7);
                return new JSONObject().toString();
            }
        }
    }

    @Nullable
    @VisibleForTesting
    private String AFInAppEventParameterName(Context context, String str) {
        int i = (AppsFlyerLib + 23) % 128;
        onPause = i;
        if (context == null) {
            return null;
        }
        AFb1aSDK aFb1aSDK = this.onValidateInAppFailure;
        int i4 = i + 117;
        AppsFlyerLib = i4 % 128;
        if (i4 % 2 != 0) {
            aFb1aSDK.AFInAppEventType.AFKeystoreWrapper = context.getApplicationContext();
            return valueOf().valueOf().AFInAppEventParameterName(str);
        }
        AFc1xSDK aFc1xSDK = aFb1aSDK.AFInAppEventType;
        throw null;
    }

    private static void AFInAppEventParameterName(String str, int i, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFf1aSDK.AFInAppEventType) {
            try {
                char[] cArr2 = new char[cArr.length];
                AFf1aSDK.valueOf = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i4 = AFf1aSDK.valueOf;
                    if (i4 < cArr.length) {
                        cArr3[0] = cArr[i4];
                        cArr3[1] = cArr[i4 + 1];
                        int i6 = 58224;
                        for (int i10 = 0; i10 < 16; i10++) {
                            char c = cArr3[1];
                            char c10 = cArr3[0];
                            char c11 = (char) (c - (((c10 + i6) ^ ((c10 << 4) + stop)) ^ ((c10 >>> 5) + getInstance)));
                            cArr3[1] = c11;
                            cArr3[0] = (char) (c10 - (((c11 >>> 5) + onResponseError) ^ ((c11 + i6) ^ ((c11 << 4) + onValidateInApp))));
                            i6 -= 40503;
                        }
                        int i11 = AFf1aSDK.valueOf;
                        cArr2[i11] = cArr3[0];
                        cArr2[i11 + 1] = cArr3[1];
                        AFf1aSDK.valueOf = i11 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }
}
