package com.clevertap.android.sdk.inbox;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.AbstractC1414e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = new a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9567b;
    public Boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f9568d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONArray f9569g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f9570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f9571l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f9572n;

    public static String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("bg") ? jSONObject.getString("bg") : "";
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    public static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("color") ? jSONObject.getString("color") : "";
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    public static String c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("text") ? jSONObject.getString("text") : "";
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to get Link Text with JSON - "));
            return null;
        }
    }

    public static String d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(SessionDescription.ATTR_TYPE) ? jSONObject.getString(SessionDescription.ATTR_TYPE) : "";
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to get Link Type with JSON - "));
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.h;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.f9571l;
    }

    public final void h(JSONObject jSONObject) {
        String str;
        String string;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            if (jSONObject2 != null) {
                if (jSONObject2.has("text")) {
                    str = "links";
                    string = jSONObject2.getString("text");
                } else {
                    str = "links";
                    string = "";
                }
                this.m = string;
                this.f9572n = jSONObject2.has("color") ? jSONObject2.getString("color") : "";
            } else {
                str = "links";
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                this.j = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                this.f9570k = jSONObject3.has("color") ? jSONObject3.getString("color") : "";
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            if (jSONObject4 != null) {
                this.e = jSONObject4.has(ImagesContract.URL) ? jSONObject4.getString(ImagesContract.URL) : "";
                this.f = jSONObject4.optString("alt_text", "");
            }
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                this.h = jSONObject5.has(ImagesContract.URL) ? jSONObject5.getString(ImagesContract.URL) : "";
                this.i = jSONObject5.optString("alt_text", "");
                this.f9567b = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                this.f9571l = jSONObject5.has("poster") ? jSONObject5.getString("poster") : "";
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                boolean z4 = false;
                this.f9568d = Boolean.valueOf(jSONObject6.has("hasUrl") && jSONObject6.getBoolean("hasUrl"));
                if (jSONObject6.has("hasLinks") && jSONObject6.getBoolean("hasLinks")) {
                    z4 = true;
                }
                this.c = Boolean.valueOf(z4);
                JSONObject jSONObject7 = jSONObject6.has(ImagesContract.URL) ? jSONObject6.getJSONObject(ImagesContract.URL) : null;
                if (jSONObject7 != null && this.f9568d.booleanValue()) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null) {
                        this.f9566a = jSONObject8.has("text") ? jSONObject8.getString("text") : "";
                    }
                }
                if (jSONObject7 == null || !this.c.booleanValue()) {
                    return;
                }
                String str2 = str;
                this.f9569g = jSONObject6.has(str2) ? jSONObject6.getJSONArray(str2) : null;
            }
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to init CTInboxMessageContent with JSON - "));
        }
    }

    public final boolean i() {
        String str = this.f9567b;
        return (str == null || this.h == null || !str.startsWith("audio")) ? false : true;
    }

    public final boolean j() {
        String str = this.f9567b;
        return (str == null || this.h == null || !str.equals("image/gif")) ? false : true;
    }

    public final boolean k() {
        String str = this.f9567b;
        return (str == null || this.h == null || !str.startsWith("image") || str.equals("image/gif")) ? false : true;
    }

    public final boolean l() {
        String str = this.f9567b;
        return (str == null || this.h == null || !str.startsWith("video")) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.f9572n);
        parcel.writeString(this.j);
        parcel.writeString(this.f9570k);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByte(this.f9568d.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f9566a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        if (this.f9569g == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f9569g.toString());
        }
        parcel.writeString(this.f9567b);
        parcel.writeString(this.f9571l);
    }
}
