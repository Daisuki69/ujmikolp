package com.clevertap.android.sdk.displayunits.model;

import A1.a;
import D.S;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9464b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9465d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9466g;
    public String h;
    public String i;
    public String j;

    public CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.i = str;
        this.j = str2;
        this.f = str3;
        this.f9466g = str4;
        this.f9465d = str5;
        this.e = str6;
        this.f9464b = str7;
        this.h = str8;
        this.f9463a = str9;
        this.c = str10;
    }

    public static CleverTapDisplayUnitContent a(JSONObject jSONObject) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            String string8 = "";
            if (jSONObject2 != null) {
                string2 = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                string = jSONObject2.has("color") ? jSONObject2.getString("color") : "";
            } else {
                string = "";
                string2 = string;
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                string4 = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                string3 = jSONObject3.has("color") ? jSONObject3.getString("color") : "";
            } else {
                string3 = "";
                string4 = string3;
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            String string9 = (jSONObject4 == null || !jSONObject4.has(ImagesContract.URL)) ? "" : jSONObject4.getString(ImagesContract.URL);
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                string7 = jSONObject5.has(ImagesContract.URL) ? jSONObject5.getString(ImagesContract.URL) : "";
                string6 = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                string5 = jSONObject5.has("poster") ? jSONObject5.getString("poster") : "";
            } else {
                string5 = "";
                string6 = string5;
                string7 = string6;
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                JSONObject jSONObject7 = jSONObject6.has(ImagesContract.URL) ? jSONObject6.getJSONObject(ImagesContract.URL) : null;
                if (jSONObject7 != null) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null && jSONObject8.has("text")) {
                        string8 = jSONObject8.getString("text");
                    }
                }
            }
            return new CleverTapDisplayUnitContent(string2, string, string4, string3, string9, string7, string6, string5, string8, null);
        } catch (Exception e) {
            S.c("DisplayUnit : ", "Unable to init CleverTapDisplayUnitContent with JSON - " + e.getLocalizedMessage());
            return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", "Error Creating DisplayUnit Content from JSON : " + e.getLocalizedMessage());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ title:");
        sb2.append(this.i);
        sb2.append(", titleColor:");
        sb2.append(this.j);
        sb2.append(" message:");
        sb2.append(this.f);
        sb2.append(", messageColor:");
        sb2.append(this.f9466g);
        sb2.append(", media:");
        sb2.append(this.e);
        sb2.append(", contentType:");
        sb2.append(this.f9464b);
        sb2.append(", posterUrl:");
        sb2.append(this.h);
        sb2.append(", actionUrl:");
        sb2.append(this.f9463a);
        sb2.append(", icon:");
        sb2.append(this.f9465d);
        sb2.append(", error:");
        return s.p(sb2, this.c, " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f);
        parcel.writeString(this.f9466g);
        parcel.writeString(this.f9465d);
        parcel.writeString(this.e);
        parcel.writeString(this.f9464b);
        parcel.writeString(this.h);
        parcel.writeString(this.f9463a);
        parcel.writeString(this.c);
    }
}
