package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.dynatrace.android.agent.Global;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1qSDK extends AFe1iSDK {
    public static long AFLogger$LogLevel = 0;

    @VisibleForTesting
    private static String AFVersionDeclaration = "https://%sdlsdk.%s/v1.0/android/";
    private final AFe1sSDK AppsFlyer2dXConversionCallback;
    private final CountDownLatch afErrorLogForExcManagerOnly;
    private final List<AFf1oSDK> getLevel;
    private final AFf1lSDK init;
    private final ExecutorService onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private boolean onConversionDataSuccess;
    private final AFb1rSDK onDeepLinkingNative;
    private final AFb1bSDK onInstallConversionDataLoadedNative;
    private final AFe1jSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1qSDK$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFf1oSDK.AFa1zSDK.values().length];
            values = iArr;
            try {
                iArr[AFf1oSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFf1oSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFb1qSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(null, AFVersionDeclaration, Boolean.FALSE, Boolean.TRUE, null, context);
        this.getLevel = new ArrayList();
        this.afErrorLogForExcManagerOnly = new CountDownLatch(1);
        this.onInstallConversionFailureNative = aFc1zSDK.afRDLog();
        this.onInstallConversionDataLoadedNative = aFc1zSDK.valueOf();
        this.AppsFlyer2dXConversionCallback = aFc1zSDK.afWarnLog();
        this.init = aFc1zSDK.AFLogger$LogLevel();
        this.onAppOpenAttributionNative = aFc1zSDK.AFInAppEventParameterName();
        this.onDeepLinkingNative = aFc1zSDK.getLevel();
    }

    private static boolean AFInAppEventParameterName(AFf1oSDK aFf1oSDK) {
        Long l6 = (Long) aFf1oSDK.valueOf.get("click_ts");
        return l6 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l6.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    public static /* synthetic */ void AFInAppEventType(AFb1qSDK aFb1qSDK) {
        ArrayList<AFf1oSDK> arrayList = new ArrayList();
        for (AFf1oSDK aFf1oSDK : aFb1qSDK.init.AFInAppEventParameterName()) {
            if (aFf1oSDK != null && aFf1oSDK.afRDLog != AFf1oSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFf1oSDK);
            }
        }
        aFb1qSDK.onResponseErrorNative = arrayList.size();
        for (final AFf1oSDK aFf1oSDK2 : arrayList) {
            int i = AnonymousClass1.values[aFf1oSDK2.afRDLog.ordinal()];
            if (i == 1) {
                StringBuilder sb2 = new StringBuilder("[DDL] ");
                sb2.append(aFf1oSDK2.valueOf.get("source"));
                sb2.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb2.toString());
                aFb1qSDK.AFKeystoreWrapper(aFf1oSDK2);
            } else if (i == 2) {
                aFf1oSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.AFb1qSDK.3
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb3 = new StringBuilder("[DDL] ");
                        sb3.append(aFf1oSDK2.valueOf.get("source"));
                        sb3.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb3.toString());
                        AFb1qSDK.this.AFKeystoreWrapper((AFf1oSDK) observable);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFKeystoreWrapper(AFf1oSDK aFf1oSDK) {
        if (AFInAppEventParameterName(aFf1oSDK)) {
            this.getLevel.add(aFf1oSDK);
            this.afErrorLogForExcManagerOnly.countDown();
            AFLogger.afDebugLog("[DDL] Added non-organic ".concat(aFf1oSDK.getClass().getSimpleName()));
        } else {
            int i = this.onAttributionFailureNative + 1;
            this.onAttributionFailureNative = i;
            if (i == this.onResponseErrorNative) {
                this.afErrorLogForExcManagerOnly.countDown();
            }
        }
    }

    private boolean AFLogger$LogLevel() {
        List list = (List) this.AFInAppEventParameterName.get("referrers");
        return (list != null ? list.size() : 0) < this.onResponseErrorNative && !this.AFInAppEventParameterName.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLevel() {
        String[] strArr;
        this.onResponseNative++;
        StringBuilder sb2 = new StringBuilder("[DDL] Preparing request ");
        sb2.append(this.onResponseNative);
        AFLogger.afDebugLog(sb2.toString());
        if (this.onResponseNative == 1) {
            AFb1wSDK aFb1wSDKAFKeystoreWrapper = AFb1wSDK.AFKeystoreWrapper();
            this.AFInAppEventParameterName.put("is_first", Boolean.valueOf(this.onInstallConversionDataLoadedNative.AFInAppEventType.AFKeystoreWrapper("appsFlyerCount", 0) == 0));
            Map<String, Object> map = this.AFInAppEventParameterName;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Locale.getDefault().getLanguage());
            sb3.append(Global.HYPHEN);
            sb3.append(Locale.getDefault().getCountry());
            map.put("lang", sb3.toString());
            this.AFInAppEventParameterName.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventParameterName.put(SessionDescription.ATTR_TYPE, Build.MODEL);
            this.AFInAppEventParameterName.put("request_id", AFb1zSDK.AFInAppEventParameterName(new WeakReference(this.onInstallConversionDataLoadedNative.values.AFKeystoreWrapper)));
            AFa1fSDK aFa1fSDK = aFb1wSDKAFKeystoreWrapper.afInfoLog;
            if (aFa1fSDK != null && (strArr = aFa1fSDK.values) != null) {
                this.AFInAppEventParameterName.put("sharing_filter", strArr);
            }
            Map<String, Object> mapValueOf = valueOf(AFa1eSDK.AFKeystoreWrapper(this.onInstallConversionDataLoadedNative.values.AFKeystoreWrapper, new HashMap()));
            Map<String, Object> mapValueOf2 = valueOf(AFa1eSDK.AFInAppEventParameterName(this.onInstallConversionDataLoadedNative.values.AFKeystoreWrapper));
            if (mapValueOf != null) {
                this.AFInAppEventParameterName.put("gaid", mapValueOf);
            }
            if (mapValueOf2 != null) {
                this.AFInAppEventParameterName.put("oaid", mapValueOf2);
            }
        }
        Map<String, Object> map2 = this.AFInAppEventParameterName;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long jCurrentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        this.AFInAppEventParameterName.put("request_count", Integer.valueOf(this.onResponseNative));
        ArrayList arrayList = new ArrayList();
        Iterator<AFf1oSDK> it = this.getLevel.iterator();
        while (it.hasNext()) {
            Map<String, String> mapValues = values(it.next());
            if (mapValues != null) {
                arrayList.add(mapValues);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventParameterName.put("referrers", arrayList);
        }
        AFInAppEventParameterName(init());
    }

    @VisibleForTesting
    private String init() {
        String str = this.AppsFlyer2dXConversionCallback.AFInAppEventParameterName;
        String packageName = this.onInstallConversionDataLoadedNative.values.AFKeystoreWrapper.getPackageName();
        String strValues = this.onInstallConversionDataLoadedNative.values();
        String strConcat = (strValues == null || strValues.trim().isEmpty()) ? "" : Global.HYPHEN.concat(strValues);
        Uri.Builder builderBuildUpon = Uri.parse(String.format(AFVersionDeclaration, AppsFlyerLib.getInstance().getHostPrefix(), AFb1wSDK.AFKeystoreWrapper().getHostName())).buildUpon();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(strConcat);
        Uri.Builder builderAppendPath = builderBuildUpon.appendPath(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.AFInAppEventParameterName.get("timestamp"));
        sb3.append(str);
        return builderAppendPath.appendQueryParameter("af_sig", AFb1ySDK.AFInAppEventType(sb3.toString(), str)).appendQueryParameter("sdk_version", AFb1wSDK.AFInAppEventParameterName).build().toString();
    }

    private static Map<String, String> values(AFf1oSDK aFf1oSDK) {
        if (aFf1oSDK.afRDLog != AFf1oSDK.AFa1zSDK.FINISHED) {
            return null;
        }
        HashMap map = new HashMap();
        String str = (String) aFf1oSDK.valueOf.get("referrer");
        if (str == null) {
            return null;
        }
        map.put("source", (String) aFf1oSDK.valueOf.get("source"));
        map.put("value", str);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.deeplink.DeepLinkResult afErrorLog() {
        /*
            r5 = this;
            java.lang.String r0 = "[DDL] start"
            com.appsflyer.AFLogger.afDebugLog(r0)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.appsflyer.internal.AFb1qSDK$4 r1 = new com.appsflyer.internal.AFb1qSDK$4
            r1.<init>()
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = r5.onAppOpenAttributionNative
            r1.execute(r0)
            r1 = 0
            long r2 = com.appsflyer.internal.AFb1qSDK.AFLogger$LogLevel     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.deeplink.DeepLinkResult r0 = (com.appsflyer.deeplink.DeepLinkResult) r0     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.internal.AFe1jSDK r2 = r5.onInstallConversionFailureNative     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            long r3 = com.appsflyer.internal.AFb1qSDK.AFLogger$LogLevel     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            r2.values(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            com.appsflyer.internal.AFb1pSDK.AFKeystoreWrapper(r0)     // Catch: java.util.concurrent.TimeoutException -> L2a java.lang.InterruptedException -> L2c java.util.concurrent.ExecutionException -> L2e
            return r0
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r0 = move-exception
            goto L69
        L2e:
            r0 = move-exception
            goto L69
        L30:
            java.lang.String r2 = "[DDL] Timeout"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Timeout, didn't manage to find deferred deep link after "
            r0.<init>(r2)
            int r2 = r5.onResponseNative
            r0.append(r2)
            java.lang.String r2 = " attempt(s) within "
            r0.append(r2)
            long r2 = com.appsflyer.internal.AFb1qSDK.AFLogger$LogLevel
            r0.append(r2)
            java.lang.String r2 = " milliseconds"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            com.appsflyer.deeplink.DeepLinkResult r0 = new com.appsflyer.deeplink.DeepLinkResult
            com.appsflyer.deeplink.DeepLinkResult$Error r2 = com.appsflyer.deeplink.DeepLinkResult.Error.TIMEOUT
            r0.<init>(r1, r2)
            com.appsflyer.internal.AFe1jSDK r1 = r5.onInstallConversionFailureNative
            long r2 = com.appsflyer.internal.AFb1qSDK.AFLogger$LogLevel
            r1.values(r0, r2)
            com.appsflyer.internal.AFb1pSDK.AFKeystoreWrapper(r0)
            goto L8c
        L69:
            java.lang.String r2 = "[DDL] Error occurred"
            r3 = 1
            com.appsflyer.AFLogger.afErrorLog(r2, r0, r3)
            com.appsflyer.deeplink.DeepLinkResult r2 = new com.appsflyer.deeplink.DeepLinkResult
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L7c
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            goto L7e
        L7c:
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.UNEXPECTED
        L7e:
            r2.<init>(r1, r0)
            com.appsflyer.internal.AFe1jSDK r0 = r5.onInstallConversionFailureNative
            long r3 = com.appsflyer.internal.AFb1qSDK.AFLogger$LogLevel
            r0.values(r2, r3)
            com.appsflyer.internal.AFb1pSDK.AFKeystoreWrapper(r2)
            r0 = r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1qSDK.afErrorLog():com.appsflyer.deeplink.DeepLinkResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult AFInAppEventParameterName(com.appsflyer.internal.AFb1qSDK r12, android.content.Context r13) throws org.json.JSONException, java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1qSDK.AFInAppEventParameterName(com.appsflyer.internal.AFb1qSDK, android.content.Context):com.appsflyer.deeplink.DeepLinkResult");
    }

    @Nullable
    private Map<String, Object> valueOf(final AFc1oSDK.AFa1vSDK aFa1vSDK) {
        if (aFa1vSDK == null || aFa1vSDK.AFInAppEventParameterName == null) {
            return null;
        }
        Boolean bool = aFa1vSDK.AFInAppEventType;
        if (bool == null || !bool.booleanValue()) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.AFb1qSDK.2
                {
                    put(SessionDescription.ATTR_TYPE, "unhashed");
                    put("value", aFa1vSDK.AFInAppEventParameterName);
                }
            };
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFd1uSDK AFKeystoreWrapper() {
        return AFd1uSDK.DLSDK;
    }
}
