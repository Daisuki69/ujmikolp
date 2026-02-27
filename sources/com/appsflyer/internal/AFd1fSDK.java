package com.appsflyer.internal;

import We.s;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.appsflyer.AFLogger;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1fSDK extends AFd1wSDK<Map<String, Object>> {
    private static final int afInfoLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Context AFLogger;
    private final Uri afDebugLog;
    private Map<String, Object> afErrorLog;
    private final Map<String, Object> afRDLog;
    private final List<String> afWarnLog;

    public AFd1fSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1uSDK.RESOLVE_ESP, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, "ResolveEsp");
        this.AFLogger = context;
        this.afRDLog = map;
        this.afDebugLog = uri;
        this.afWarnLog = list;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    @NonNull
    public final AFd1tSDK values() throws Exception {
        if (!values(this.afDebugLog.toString())) {
            AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(this.AFLogger, this.afRDLog, this.afDebugLog);
            return AFd1tSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.afDebugLog.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> mapValues = values(Uri.parse(string));
            String str2 = (String) mapValues.get("res");
            Integer num2 = (Integer) mapValues.get("status");
            String str3 = (String) mapValues.get(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            if (str2 == null || !values(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.afRDLog) {
            this.afRDLog.put("af_deeplink_r", map);
            this.afRDLog.put("af_deeplink", this.afDebugLog.toString());
        }
        AFb1wSDK.AFKeystoreWrapper().AFInAppEventType(this.AFLogger, this.afRDLog, string != null ? Uri.parse(string) : this.afDebugLog);
        this.afErrorLog = map;
        return AFd1tSDK.SUCCESS;
    }

    private static Map<String, Object> values(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
            Callback.openConnection(uRLConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = afInfoLog;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.10.1");
            int responseCode = Callback.getResponseCode(httpURLConnection);
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", Callback.getHeaderField(httpURLConnection, RtspHeaders.LOCATION));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th2) {
            map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return map;
        }
    }

    private boolean values(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbW = s.w("Validate if link ", str, " belongs to ESP domains: ");
        sbW.append(this.afWarnLog);
        AFLogger.afRDLog(sbW.toString());
        try {
            return this.afWarnLog.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
