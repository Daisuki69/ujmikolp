package com.clevertap.android.sdk;

import D.C0177j;
import D.InterfaceC0191y;
import D.S;
import D.T;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.Global;
import g0.e;
import g0.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new C0177j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9440b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9441d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9442g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9444l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public S f9448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String[] f9451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9452u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9453v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f9455x;

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.f16773a);
        this.f9442g = arrayList;
        this.f9451t = InterfaceC0191y.f961g;
        this.f9439a = cleverTapInstanceConfig.f9439a;
        this.c = cleverTapInstanceConfig.c;
        this.f9440b = cleverTapInstanceConfig.f9440b;
        this.f9441d = cleverTapInstanceConfig.f9441d;
        this.e = cleverTapInstanceConfig.e;
        this.f = cleverTapInstanceConfig.f;
        this.f9447p = cleverTapInstanceConfig.f9447p;
        this.h = cleverTapInstanceConfig.h;
        this.f9450s = cleverTapInstanceConfig.f9450s;
        this.f9444l = cleverTapInstanceConfig.f9444l;
        this.f9448q = cleverTapInstanceConfig.f9448q;
        this.f9453v = cleverTapInstanceConfig.f9453v;
        this.m = cleverTapInstanceConfig.m;
        this.f9443k = cleverTapInstanceConfig.f9443k;
        this.f9452u = cleverTapInstanceConfig.f9452u;
        this.i = cleverTapInstanceConfig.i;
        this.f9445n = cleverTapInstanceConfig.f9445n;
        this.f9446o = cleverTapInstanceConfig.f9446o;
        this.f9449r = cleverTapInstanceConfig.f9449r;
        this.j = cleverTapInstanceConfig.j;
        this.f9451t = cleverTapInstanceConfig.f9451t;
        this.f9454w = cleverTapInstanceConfig.f9454w;
        Iterator it = cleverTapInstanceConfig.f9442g.iterator();
        while (it.hasNext()) {
            a((h) it.next());
        }
        this.f9455x = cleverTapInstanceConfig.f9455x;
    }

    public final void a(h hVar) {
        ArrayList arrayList = this.f9442g;
        if (arrayList.contains(hVar)) {
            return;
        }
        arrayList.add(hVar);
    }

    public final String b(String str) {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(!TextUtils.isEmpty(str) ? Global.COLON.concat(str) : "");
        sb2.append(Global.COLON);
        return s.p(sb2, this.f9439a, "]");
    }

    public final S c() {
        if (this.f9448q == null) {
            this.f9448q = new S(this.f9444l);
        }
        return this.f9448q;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        for (h hVar : this.f9442g) {
            if (hVar != e.f16773a) {
                hVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ctProviderClassName", hVar.f16783a);
                    jSONObject.put("messagingSDKClassName", hVar.f16784b);
                    jSONObject.put("tokenPrefKey", hVar.c);
                    jSONObject.put(SessionDescription.ATTR_TYPE, hVar.f16785d);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(String str, String str2) {
        S s9 = this.f9448q;
        String strB = b(str);
        s9.getClass();
        S.s(strB, str2);
    }

    public final void f(String str, Throwable th2) {
        S s9 = this.f9448q;
        String strB = b("PushProvider");
        s9.getClass();
        S.t(strB, str, th2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9439a);
        parcel.writeString(this.c);
        parcel.writeString(this.f9440b);
        parcel.writeString(this.f9441d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9447p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9453v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9450s ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9444l);
        parcel.writeByte(this.f9443k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9452u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9445n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f9446o);
        parcel.writeString(this.f9449r);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9451t);
        parcel.writeInt(this.f9454w);
        parcel.writeString(this.f9455x);
        parcel.writeString(d().toString());
    }

    public CleverTapInstanceConfig(T t5, String str, String str2, String str3) {
        String[] strArrSplit;
        String[] strArrSplit2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.f16773a);
        this.f9442g = arrayList;
        this.f9451t = InterfaceC0191y.f961g;
        this.f9439a = str;
        this.c = str2;
        this.f9440b = str3;
        this.f9447p = true;
        this.h = false;
        this.f9450s = true;
        this.f9444l = 0;
        this.f9448q = new S(0);
        this.f9443k = false;
        this.f9453v = t5.f873a;
        this.m = t5.f874b;
        this.f9452u = t5.e;
        this.i = t5.f;
        this.f9446o = t5.h;
        this.f9449r = t5.i;
        this.f9445n = t5.f876g;
        this.j = t5.j;
        this.f9454w = t5.f879n;
        String[] strArr = t5.m;
        this.f9451t = strArr;
        e("ON_USER_LOGIN", "Setting Profile Keys from Manifest: " + Arrays.toString(strArr));
        try {
            String str4 = t5.f880o;
            if (str4 != null && (strArrSplit2 = str4.split(",")) != null && strArrSplit2.length == 4) {
                a(new h(strArrSplit2[0].trim(), strArrSplit2[1].trim(), strArrSplit2[2].trim(), strArrSplit2[3].trim()));
            }
            String str5 = t5.f881p;
            if (str5 != null && (strArrSplit = str5.split(",")) != null && strArrSplit.length == 4) {
                a(new h(strArrSplit[0].trim(), strArrSplit[1].trim(), strArrSplit[2].trim(), strArrSplit[3].trim()));
            }
        } catch (Exception unused) {
            S.l("There was some problem in loading push providers from manifest");
        }
        String str6 = t5.f882q;
        this.f9455x = str6 == null ? "0" : str6;
    }

    public CleverTapInstanceConfig(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.f16773a);
        this.f9442g = arrayList;
        this.f9451t = InterfaceC0191y.f961g;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("accountId")) {
                this.f9439a = jSONObject.getString("accountId");
            }
            if (jSONObject.has("accountToken")) {
                this.c = jSONObject.getString("accountToken");
            }
            if (jSONObject.has("proxyDomain")) {
                this.f9441d = jSONObject.getString("proxyDomain");
            }
            if (jSONObject.has("spikyProxyDomain")) {
                this.e = jSONObject.getString("spikyProxyDomain");
            }
            if (jSONObject.has("customHandshakeDomain")) {
                this.f = jSONObject.optString("customHandshakeDomain", null);
            }
            if (jSONObject.has("accountRegion")) {
                this.f9440b = jSONObject.getString("accountRegion");
            }
            if (jSONObject.has("analyticsOnly")) {
                this.h = jSONObject.getBoolean("analyticsOnly");
            }
            if (jSONObject.has("isDefaultInstance")) {
                this.f9447p = jSONObject.getBoolean("isDefaultInstance");
            }
            if (jSONObject.has("useGoogleAdId")) {
                this.f9453v = jSONObject.getBoolean("useGoogleAdId");
            }
            if (jSONObject.has("disableAppLaunchedEvent")) {
                this.m = jSONObject.getBoolean("disableAppLaunchedEvent");
            }
            if (jSONObject.has("personalization")) {
                this.f9450s = jSONObject.getBoolean("personalization");
            }
            if (jSONObject.has("debugLevel")) {
                this.f9444l = jSONObject.getInt("debugLevel");
            }
            this.f9448q = new S(this.f9444l);
            if (jSONObject.has("packageName")) {
                this.f9449r = jSONObject.getString("packageName");
            }
            if (jSONObject.has("createdPostAppLaunch")) {
                this.f9443k = jSONObject.getBoolean("createdPostAppLaunch");
            }
            if (jSONObject.has("sslPinning")) {
                this.f9452u = jSONObject.getBoolean("sslPinning");
            }
            if (jSONObject.has("backgroundSync")) {
                this.i = jSONObject.getBoolean("backgroundSync");
            }
            if (jSONObject.has("getEnableCustomCleverTapId")) {
                this.f9445n = jSONObject.getBoolean("getEnableCustomCleverTapId");
            }
            if (jSONObject.has("fcmSenderId")) {
                this.f9446o = jSONObject.getString("fcmSenderId");
            }
            if (jSONObject.has("beta")) {
                this.j = jSONObject.getBoolean("beta");
            }
            if (jSONObject.has("identityTypes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("identityTypes");
                Object[] objArr = new Object[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        objArr[i] = jSONArray.get(i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                this.f9451t = (String[]) objArr;
            }
            if (jSONObject.has("encryptionLevel")) {
                this.f9454w = jSONObject.getInt("encryptionLevel");
            }
            if (jSONObject.has("allowedPushTypes")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("allowedPushTypes");
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    h hVarA = h.a(jSONArray2.getJSONObject(i4));
                    if (hVarA != null) {
                        a(hVarA);
                    }
                }
            }
            this.f9455x = jSONObject.optString("encryptionInTransit", "0");
        } catch (Throwable th2) {
            S.o(s.j("Error constructing CleverTapInstanceConfig from JSON: ", str, ": "), th2.getCause());
            throw th2;
        }
    }

    public CleverTapInstanceConfig(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.f16773a);
        this.f9442g = arrayList;
        this.f9451t = InterfaceC0191y.f961g;
        this.f9439a = parcel.readString();
        this.c = parcel.readString();
        this.f9440b = parcel.readString();
        this.f9441d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.h = parcel.readByte() != 0;
        this.f9447p = parcel.readByte() != 0;
        this.f9453v = parcel.readByte() != 0;
        this.m = parcel.readByte() != 0;
        this.f9450s = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.f9444l = i;
        this.f9443k = parcel.readByte() != 0;
        this.f9452u = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.f9445n = parcel.readByte() != 0;
        this.f9446o = parcel.readString();
        this.f9449r = parcel.readString();
        this.f9448q = new S(i);
        this.j = parcel.readByte() != 0;
        this.f9451t = parcel.createStringArray();
        this.f9454w = parcel.readInt();
        this.f9455x = parcel.readString();
        try {
            JSONArray jSONArray = new JSONArray(parcel.readString());
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                h hVarA = h.a(jSONArray.getJSONObject(i4));
                if (hVarA != null) {
                    a(hVarA);
                }
            }
        } catch (JSONException unused) {
            S.l("Error in loading push providers from parcel, using firebase");
        }
    }
}
