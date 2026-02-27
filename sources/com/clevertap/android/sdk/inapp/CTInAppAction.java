package com.clevertap.android.sdk.inapp;

import M2.b;
import N.a;
import N.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppAction implements Parcelable {
    public static final a CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f9471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9472b;
    public HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CustomTemplateInAppData f9473d;
    public boolean e;

    public CTInAppAction(Parcel parcel) {
        f fVarV;
        String string;
        if (parcel == null || (string = parcel.readString()) == null) {
            fVarV = null;
        } else {
            f.f3462b.getClass();
            fVarV = b.V(string);
        }
        this.f9471a = fVarV;
        this.f9472b = parcel != null ? parcel.readString() : null;
        HashMap hashMap = parcel != null ? parcel.readHashMap(null) : null;
        this.c = hashMap == null ? null : hashMap;
        this.f9473d = parcel != null ? (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader()) : null;
        boolean z4 = false;
        if (parcel != null && parcel.readByte() == 0) {
            z4 = true;
        }
        this.e = !z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CTInAppAction.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.CTInAppAction");
        CTInAppAction cTInAppAction = (CTInAppAction) obj;
        return this.e == cTInAppAction.e && this.f9471a == cTInAppAction.f9471a && j.b(this.f9472b, cTInAppAction.f9472b) && j.b(this.c, cTInAppAction.c) && j.b(this.f9473d, cTInAppAction.f9473d);
    }

    public final int hashCode() {
        int i = (this.e ? 1231 : 1237) * 31;
        f fVar = this.f9471a;
        int iHashCode = (i + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f9472b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        HashMap map = this.c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        CustomTemplateInAppData customTemplateInAppData = this.f9473d;
        return iHashCode3 + (customTemplateInAppData != null ? customTemplateInAppData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        f fVar = this.f9471a;
        dest.writeString(fVar != null ? fVar.f3464a : null);
        dest.writeString(this.f9472b);
        dest.writeMap(this.c);
        dest.writeParcelable(this.f9473d, i);
        dest.writeByte(this.e ? (byte) 1 : (byte) 0);
    }
}
