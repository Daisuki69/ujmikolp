package com.clevertap.android.sdk.inapp.customtemplates;

import O.b;
import O.g;
import O.i;
import O.k;
import S1.s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTemplateInAppData implements Parcelable {
    public static final g CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9516b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9517d;
    public JSONObject e;

    public CustomTemplateInAppData(Parcel parcel) {
        JSONObject jSONObject = null;
        this.f9515a = parcel != null ? parcel.readString() : null;
        boolean z4 = false;
        if (parcel != null && parcel.readByte() == 0) {
            z4 = true;
        }
        this.f9516b = !z4;
        this.c = parcel != null ? parcel.readString() : null;
        this.f9517d = parcel != null ? parcel.readString() : null;
        if (parcel != null) {
            try {
                String string = parcel.readString();
                if (string != null) {
                    jSONObject = new JSONObject(string);
                }
            } catch (JSONException unused) {
            }
        }
        this.e = jSONObject;
    }

    public final void a(k templatesManager, ArrayList arrayList) {
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        j.g(templatesManager, "templatesManager");
        String str = this.f9515a;
        if (str == null || (bVar = (b) templatesManager.f4524b.get(str)) == null || (jSONObject = this.e) == null) {
            return;
        }
        for (i iVar : bVar.f4510d) {
            int iOrdinal = iVar.f4518b.ordinal();
            String str2 = iVar.f4517a;
            if (iOrdinal == 3) {
                String strK = s.k(jSONObject, str2);
                if (strK != null) {
                    arrayList.add(strK);
                }
            } else if (iOrdinal == 4 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                CREATOR.getClass();
                CustomTemplateInAppData customTemplateInAppDataA = g.a(jSONObjectOptJSONObject);
                if (customTemplateInAppDataA != null) {
                    customTemplateInAppDataA.a(templatesManager, arrayList);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CustomTemplateInAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData");
        CustomTemplateInAppData customTemplateInAppData = (CustomTemplateInAppData) obj;
        if (!j.b(this.f9515a, customTemplateInAppData.f9515a) || this.f9516b != customTemplateInAppData.f9516b || !j.b(this.c, customTemplateInAppData.c) || !j.b(this.f9517d, customTemplateInAppData.f9517d)) {
            return false;
        }
        JSONObject jSONObject = this.e;
        String string = jSONObject != null ? jSONObject.toString() : null;
        JSONObject jSONObject2 = customTemplateInAppData.e;
        return j.b(string, jSONObject2 != null ? jSONObject2.toString() : null);
    }

    public final int hashCode() {
        String string;
        String str = this.f9515a;
        int iHashCode = 0;
        int iHashCode2 = (((str != null ? str.hashCode() : 0) * 31) + (this.f9516b ? 1231 : 1237)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9517d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.e;
        if (jSONObject != null && (string = jSONObject.toString()) != null) {
            iHashCode = string.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f9515a);
        dest.writeByte(this.f9516b ? (byte) 1 : (byte) 0);
        dest.writeString(this.c);
        dest.writeString(this.f9517d);
        JSONObject jSONObject = this.e;
        dest.writeString(jSONObject != null ? jSONObject.toString() : null);
    }
}
