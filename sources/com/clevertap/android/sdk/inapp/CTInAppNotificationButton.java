package com.clevertap.android.sdk.inapp;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNotificationButton implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationButton> CREATOR = new a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9510b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9511d;
    public final String e;
    public final CTInAppAction f;

    public CTInAppNotificationButton(JSONObject jSONObject) {
        this.f9509a = jSONObject.optString("text");
        this.e = jSONObject.optString("color", "#0000FF");
        this.f9510b = jSONObject.optString("bg", "#FFFFFF");
        this.c = jSONObject.optString("border", "#FFFFFF");
        this.f9511d = jSONObject.optString("radius");
        N.a aVar = CTInAppAction.CREATOR;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("actions");
        aVar.getClass();
        this.f = N.a.a(jSONObjectOptJSONObject);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CTInAppNotificationButton.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.CTInAppNotificationButton");
        CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) obj;
        return j.b(this.f9510b, cTInAppNotificationButton.f9510b) && j.b(this.c, cTInAppNotificationButton.c) && j.b(this.f9511d, cTInAppNotificationButton.f9511d) && j.b(this.f9509a, cTInAppNotificationButton.f9509a) && j.b(this.e, cTInAppNotificationButton.e) && j.b(this.f, cTInAppNotificationButton.f);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.f9510b.hashCode() * 31, 31, this.c), 31, this.f9511d), 31, this.f9509a), 31, this.e);
        CTInAppAction cTInAppAction = this.f;
        return iC + (cTInAppAction != null ? cTInAppAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f9509a);
        dest.writeString(this.e);
        dest.writeString(this.f9510b);
        dest.writeString(this.c);
        dest.writeString(this.f9511d);
        dest.writeParcelable(this.f, i);
    }

    public CTInAppNotificationButton(Parcel parcel) {
        String string = parcel.readString();
        this.f9509a = string == null ? "" : string;
        String string2 = parcel.readString();
        this.e = string2 == null ? "#0000FF" : string2;
        String string3 = parcel.readString();
        this.f9510b = string3 == null ? "#FFFFFF" : string3;
        String string4 = parcel.readString();
        this.c = string4 != null ? string4 : "#FFFFFF";
        String string5 = parcel.readString();
        this.f9511d = string5 != null ? string5 : "";
        this.f = (CTInAppAction) parcel.readParcelable(CTInAppAction.class.getClassLoader());
    }
}
