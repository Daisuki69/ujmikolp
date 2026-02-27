package com.clevertap.android.sdk.inapp;

import A1.a;
import D.S;
import Kh.I;
import N.b;
import N.c;
import O.g;
import S1.s;
import a.AbstractC0617a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import bg.AbstractC0983W;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNotification implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotification> CREATOR = new a(7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9474B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f9475K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9476P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f9477Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f9479S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f9480T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f9481U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f9482V;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public char f9485Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f9486Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9489b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f9490b0;
    public c c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f9491c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9492d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f9493d0;
    public JSONObject e;
    public JSONObject f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9494g;
    public int h;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f9496l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CustomTemplateInAppData f9503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f9504u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public JSONObject f9507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f9508y;
    public ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f9505v = "#FFFFFF";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public double f9478R = -1.0d;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ArrayList f9483W = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f9484X = "#000000";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f9488a0 = "#000000";

    public CTInAppNotification(JSONObject jSONObject, boolean z4) {
        this.f9490b0 = z4;
        this.f = jSONObject;
        try {
            String strK = s.k(jSONObject, SessionDescription.ATTR_TYPE);
            this.f9504u = strK;
            if (strK != null && !strK.equals("custom-html")) {
                a(jSONObject);
                return;
            }
            d(jSONObject);
        } catch (JSONException e) {
            this.f9475K = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    public static boolean c(Bundle bundle, String str, C1790e c1790e) {
        return bundle.containsKey(str) && c1790e.d(bundle.get(str));
    }

    public final void a(JSONObject jSONObject) {
        CTInAppNotificationMedia cTInAppNotificationMediaH;
        CTInAppNotificationMedia cTInAppNotificationMediaH2;
        try {
            this.f9487a = jSONObject.optString("ti", "");
            this.f9489b = jSONObject.optString("wzrk_id", "");
            this.f9504u = jSONObject.getString(SessionDescription.ATTR_TYPE);
            this.f9500q = jSONObject.optBoolean("isLocalInApp", false);
            this.f9501r = jSONObject.optBoolean("fallbackToNotificationSettings", false);
            int i = -1;
            this.f9492d = jSONObject.optInt("efc", -1) == 1 || jSONObject.optInt("excludeGlobalFCaps", -1) == 1;
            this.f9499p = jSONObject.optInt("tlc", -1);
            this.f9498o = jSONObject.optInt("tdc", -1);
            this.h = jSONObject.optInt("mdc", -1);
            I i4 = c.f3442b;
            String str = this.f9504u;
            i4.getClass();
            this.c = I.g(str);
            this.f9481U = jSONObject.optBoolean("tablet", false);
            this.f9505v = jSONObject.optString("bg", this.f9505v);
            this.f9495k = !jSONObject.has("hasPortrait") || jSONObject.getBoolean("hasPortrait");
            this.j = jSONObject.optBoolean("hasLandscape", false);
            this.f9497n = jSONObject.optLong("wzrk_ttl", (System.currentTimeMillis() + 172800000) / ((long) 1000));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("title");
            if (jSONObjectOptJSONObject != null) {
                this.f9496l = jSONObjectOptJSONObject.optString("text", "");
                this.f9488a0 = jSONObjectOptJSONObject.optString("color", this.f9488a0);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("message");
            if (jSONObjectOptJSONObject2 != null) {
                this.m = jSONObjectOptJSONObject2.optString("text", "");
                this.f9484X = jSONObjectOptJSONObject2.optString("color", this.f9484X);
            }
            this.f9479S = jSONObject.optBoolean("close", false);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("media");
            ArrayList arrayList = this.f9483W;
            if (jSONObjectOptJSONObject3 != null && (cTInAppNotificationMediaH2 = AbstractC0983W.h(jSONObjectOptJSONObject3, 1)) != null) {
                arrayList.add(cTInAppNotificationMediaH2);
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("mediaLandscape");
            if (jSONObjectOptJSONObject4 != null && (cTInAppNotificationMediaH = AbstractC0983W.h(jSONObjectOptJSONObject4, 2)) != null) {
                arrayList.add(cTInAppNotificationMediaH);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("buttons");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i6 = 0; i6 < length; i6++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i6);
                    if (jSONObjectOptJSONObject5 != null) {
                        this.i.add(new CTInAppNotificationButton(jSONObjectOptJSONObject5));
                        this.f9506w++;
                    }
                }
            }
            this.f9502s = jSONObject.optBoolean("rfp", false);
            CustomTemplateInAppData.CREATOR.getClass();
            this.f9503t = g.a(jSONObject);
            c cVar = this.c;
            if (cVar != null) {
                i = b.f3441a[cVar.ordinal()];
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    Iterator it = arrayList.iterator();
                    j.f(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        j.f(next, "next(...)");
                        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) next;
                        if (cTInAppNotificationMedia.b() || cTInAppNotificationMedia.a() || cTInAppNotificationMedia.d()) {
                            cTInAppNotificationMedia.f9512a = "";
                            S.b("Unable to download to media. Wrong media type for template");
                        }
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    if (arrayList.isEmpty()) {
                        this.f9475K = "No media type for template";
                    } else {
                        Iterator it2 = arrayList.iterator();
                        j.f(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            j.f(next2, "next(...)");
                            CTInAppNotificationMedia cTInAppNotificationMedia2 = (CTInAppNotificationMedia) next2;
                            if (cTInAppNotificationMedia2.b() || cTInAppNotificationMedia2.a() || cTInAppNotificationMedia2.d() || !cTInAppNotificationMedia2.c()) {
                                this.f9475K = "Wrong media type for template";
                                break;
                            }
                        }
                    }
                    break;
            }
        } catch (JSONException e) {
            this.f9475K = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    public final CTInAppNotificationMedia b(int i) {
        Iterator it = this.f9483W.iterator();
        j.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            j.f(next, "next(...)");
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) next;
            if (i == cTInAppNotificationMedia.e) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    public final void d(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        Bundle bundleX = AbstractC0617a.x(jSONObject);
        try {
            Bundle bundle = bundleX.getBundle("w");
            Bundle bundle2 = bundleX.getBundle("d");
            if (bundle == null || bundle2 == null) {
                str = "Invalid JSON";
            } else {
                if (c(bundle, "xdp", z.a(Integer.class))) {
                    str2 = "Invalid JSON";
                } else {
                    str2 = "Invalid JSON";
                    try {
                        if (c(bundle, "xp", z.a(Integer.class))) {
                        }
                        str = str2;
                    } catch (Throwable th2) {
                        th = th2;
                        str = str2;
                        S.o("Failed to parse in-app notification!", th);
                    }
                }
                if (c(bundle, "ydp", z.a(Integer.class))) {
                    str3 = "ydp";
                } else {
                    str3 = "ydp";
                    if (!c(bundle, "yp", z.a(Integer.class))) {
                    }
                    str = str2;
                }
                Class cls = Boolean.TYPE;
                if (c(bundle, "dk", z.a(cls)) && c(bundle, "sc", z.a(cls)) && c(bundle2, "html", z.a(String.class)) && c(bundle, "pos", z.a(String.class))) {
                    String string = bundle.getString("pos");
                    j.d(string);
                    char cCharAt = string.charAt(0);
                    if (cCharAt == 't' || cCharAt == 'r' || cCharAt == 'b' || cCharAt == 'l' || cCharAt == 'c') {
                        try {
                            this.f9487a = jSONObject.optString("ti", "");
                            this.f9489b = jSONObject.optString("wzrk_id", "");
                            boolean z4 = true;
                            if (jSONObject.optInt("efc", -1) != 1 && jSONObject.optInt("excludeGlobalFCaps", -1) != 1) {
                                z4 = false;
                            }
                            this.f9492d = z4;
                            this.f9499p = jSONObject.optInt("tlc", -1);
                            this.f9498o = jSONObject.optInt("tdc", -1);
                            this.f9482V = jSONObject.optBoolean("isJsEnabled", false);
                            this.f9497n = jSONObject.optLong("wzrk_ttl", (System.currentTimeMillis() + 172800000) / ((long) 1000));
                            this.f9502s = jSONObject.optBoolean("rfp", false);
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("d");
                            if (jSONObjectOptJSONObject != null) {
                                this.f9480T = jSONObjectOptJSONObject.getString("html");
                                this.f9508y = jSONObjectOptJSONObject.optString(ImagesContract.URL, "");
                                this.f9507x = jSONObjectOptJSONObject.optJSONObject("kv") != null ? jSONObjectOptJSONObject.getJSONObject("kv") : new JSONObject();
                                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("w");
                                if (jSONObjectOptJSONObject2 != null) {
                                    this.f9474B = jSONObjectOptJSONObject2.getBoolean("dk");
                                    this.f9486Z = jSONObjectOptJSONObject2.getBoolean("sc");
                                    this.f9485Y = jSONObjectOptJSONObject2.getString("pos").charAt(0);
                                    this.f9491c0 = jSONObjectOptJSONObject2.optInt("xdp", 0);
                                    this.f9493d0 = jSONObjectOptJSONObject2.optInt("xp", 0);
                                    this.f9476P = jSONObjectOptJSONObject2.optInt(str3, 0);
                                    this.f9477Q = jSONObjectOptJSONObject2.optInt("yp", 0);
                                    this.h = jSONObjectOptJSONObject2.optInt("mdc", -1);
                                    double dOptDouble = jSONObjectOptJSONObject2.optDouble("aspectRatio", -1.0d);
                                    this.f9478R = dOptDouble;
                                    if (dOptDouble <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                                        this.f9478R = -1.0d;
                                    }
                                }
                                if (this.f9480T != null) {
                                    char c = this.f9485Y;
                                    if (c == 't') {
                                        if (this.f9478R != -1.0d || (this.f9493d0 == 100 && this.f9477Q <= 30)) {
                                            this.c = c.f;
                                            return;
                                        }
                                        return;
                                    }
                                    if (c == 'b') {
                                        if (this.f9478R != -1.0d || (this.f9493d0 == 100 && this.f9477Q <= 30)) {
                                            this.c = c.f3444g;
                                            return;
                                        }
                                        return;
                                    }
                                    if (c == 'c') {
                                        int i = this.f9493d0;
                                        if (i == 90 && this.f9477Q == 85) {
                                            this.c = c.e;
                                            return;
                                        }
                                        if (i == 100 && this.f9477Q == 100) {
                                            this.c = c.f3443d;
                                            return;
                                        } else {
                                            if (i == 90 && this.f9477Q == 50) {
                                                this.c = c.h;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            this.f9475K = str2;
                            return;
                        }
                    }
                }
                str = str2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = "Invalid JSON";
        }
        this.f9475K = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(CustomTemplateInAppData customTemplateInAppData) {
        this.f9503t = customTemplateInAppData;
        JSONObject json = this.f;
        j.g(json, "json");
        json.put("templateName", customTemplateInAppData.f9515a);
        json.put("isAction", customTemplateInAppData.f9516b);
        json.put("templateId", customTemplateInAppData.c);
        json.put("templateDescription", customTemplateInAppData.f9517d);
        json.put("vars", customTemplateInAppData.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f9487a);
        dest.writeString(this.f9489b);
        dest.writeValue(this.c);
        dest.writeString(this.f9480T);
        dest.writeByte(this.f9492d ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f9486Z ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f9474B ? (byte) 1 : (byte) 0);
        dest.writeInt(this.h);
        dest.writeInt(this.f9499p);
        dest.writeInt(this.f9498o);
        dest.writeInt(this.f9485Y);
        dest.writeInt(this.f9476P);
        dest.writeInt(this.f9477Q);
        dest.writeInt(this.f9491c0);
        dest.writeInt(this.f9493d0);
        dest.writeString(this.f.toString());
        dest.writeString(this.f9475K);
        if (this.f9507x == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(this.f9507x));
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(jSONObject));
        }
        dest.writeString(this.f9504u);
        dest.writeString(this.f9496l);
        dest.writeString(this.f9488a0);
        dest.writeString(this.f9505v);
        dest.writeString(this.m);
        dest.writeString(this.f9484X);
        dest.writeTypedList(this.i);
        dest.writeTypedList(this.f9483W);
        dest.writeByte(this.f9479S ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f9506w);
        dest.writeByte(this.f9481U ? (byte) 1 : (byte) 0);
        dest.writeString(this.f9508y);
        dest.writeByte(this.f9482V ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f9495k ? (byte) 1 : (byte) 0);
        dest.writeByte(this.j ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f9500q ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f9501r ? (byte) 1 : (byte) 0);
        dest.writeString(this.f9494g);
        dest.writeLong(this.f9497n);
        dest.writeParcelable(this.f9503t, i);
        dest.writeDouble(this.f9478R);
        dest.writeByte(this.f9502s ? (byte) 1 : (byte) 0);
    }
}
