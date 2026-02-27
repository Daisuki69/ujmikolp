package n0;

import D.B;
import D.H;
import D.S;
import D.T;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import o0.C1954a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String string = bundle.getString("wzrk_adunit");
        S.l("Received Display Unit via push payload: " + string);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("adUnit_notifs", jSONArray);
        jSONArray.put(new JSONObject(string));
        return jSONObject;
    }

    public static JSONObject b(H h, B b8, boolean z4, boolean z5) throws JSONException {
        Boolean boolValueOf;
        BluetoothAdapter defaultAdapter;
        ConnectivityManager connectivityManager;
        boolean z8;
        JSONObject jSONObject = new JSONObject();
        b8.getClass();
        jSONObject.put("Build", h.e().f829b + "");
        jSONObject.put("Version", h.e().m);
        jSONObject.put("OS Version", h.e().f832k);
        jSONObject.put("SDK Version", h.e().f833l);
        if (h.i() != null) {
            jSONObject.put(z5 ? "mt_GoogleAdID" : "GoogleAdID", h.i());
            synchronized (h.f842a) {
                z8 = h.i;
            }
            jSONObject.put("GoogleAdIDLimit", z8);
        }
        try {
            jSONObject.put(ExifInterface.TAG_MAKE, h.e().f831g);
            jSONObject.put(ExifInterface.TAG_MODEL, h.e().h);
            jSONObject.put("Carrier", h.e().c);
            jSONObject.put("useIP", z4);
            jSONObject.put("OS", h.e().j);
            jSONObject.put("wdt", h.e().f834n);
            jSONObject.put("hgt", h.e().f);
            jSONObject.put("dpi", h.e().e);
            jSONObject.put("dt", H.h(h.e));
            Boolean boolValueOf2 = null;
            jSONObject.put("locale", TextUtils.isEmpty(null) ? h.e().f837q : null);
            if (Build.VERSION.SDK_INT >= 28) {
                jSONObject.put("abckt", h.e().f835o);
            }
            T.b(h.e).getClass();
            S.l("ManifestInfo: getProxyDomain called, returning proxyDomain:" + T.f870v);
            String str = T.f870v;
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("proxyDomain", str);
            }
            T.b(h.e).getClass();
            S.l("ManifestInfo: getSpikeyProxyDomain called, returning spikeyProxyDomain:" + T.f871w);
            String str2 = T.f871w;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("spikyProxyDomain", str2);
            }
            boolean z9 = true;
            if (T.b(h.e).e) {
                jSONObject.put("sslpin", true);
            }
            if (!TextUtils.isEmpty(T.b(h.e).h)) {
                jSONObject.put("fcmsid", true);
            }
            String str3 = h.e().f830d;
            if (str3 != null && !str3.equals("")) {
                jSONObject.put("cc", str3);
            }
            if (z4) {
                Context context = h.e;
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                    boolValueOf = null;
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
                        z9 = false;
                    }
                    boolValueOf = Boolean.valueOf(z9);
                }
                if (boolValueOf != null) {
                    jSONObject.put("wifi", boolValueOf);
                }
                Context context2 = h.e;
                try {
                    if (context2.getPackageManager().checkPermission("android.permission.BLUETOOTH", context2.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                        boolValueOf2 = Boolean.valueOf(defaultAdapter.isEnabled());
                    }
                } catch (Throwable unused) {
                }
                if (boolValueOf2 != null) {
                    jSONObject.put("BluetoothEnabled", boolValueOf2);
                }
                String str4 = h.e().f828a;
                if (str4 != null) {
                    jSONObject.put("BluetoothVersion", str4);
                }
                String str5 = h.e().i;
                if (str5 != null) {
                    jSONObject.put("Radio", str5);
                }
            }
            jSONObject.put("LIAMC", h.e().f836p);
            for (Map.Entry entry : b8.f807o.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    public static JSONObject c(C1954a c1954a) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", c1954a.f18751a);
            jSONObject.put("d", c1954a.f18752b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONArray d(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            S.l("RTL IDs -" + str);
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject e(String str, S s9, String str2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th2) {
                String str3 = "Error reading guid cache: " + th2.toString();
                s9.getClass();
                S.s(str2, str3);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return jSONObject != null ? jSONObject : new JSONObject();
    }
}
