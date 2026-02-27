package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.content.pm.PackageInfoCompat;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9864b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9865d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9866g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j6) {
        this.f9863a = context;
        this.f9864b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.f9865d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f = j;
        this.f9866g = j6;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Callback.getInputStream((URLConnection) httpURLConnection), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.getOutputStream(httpURLConnection));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l6, Map map2) throws FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f9864b);
        Context context = this.f9863a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l6 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l6));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() throws FirebaseRemoteConfigException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f9865d + "/namespaces/" + this.e + ":fetch").openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            return (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[LOOP:0: B:13:0x009a->B:15:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_LEAVE, TryCatch #8 {all -> 0x018e, blocks: (B:17:0x00be, B:19:0x00db, B:69:0x0194, B:70:0x019d, B:71:0x019e, B:72:0x01a5), top: B:96:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194 A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_ENTER, TryCatch #8 {all -> 0x018e, blocks: (B:17:0x00be, B:19:0x00db, B:69:0x0194, B:70:0x019d, B:71:0x019e, B:72:0x01a5), top: B:96:0x00be }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X2.i fetch(java.net.HttpURLConnection r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.Long r17, java.util.Date r18, java.util.Map<java.lang.String, java.lang.String> r19) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):X2.i");
    }
}
