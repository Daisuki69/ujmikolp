package com.clevertap.android.sdk.inapp;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNotificationMedia implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9513b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9514d;
    public final int e;

    public CTInAppNotificationMedia(int i, String str, String str2, String str3, String str4) {
        this.f9512a = str;
        this.f9513b = str2;
        this.c = str3;
        this.f9514d = str4;
        this.e = i;
    }

    public final boolean a() {
        return !C2576A.H(this.f9512a) && z.w(this.f9513b, 2, "audio", false);
    }

    public final boolean b() {
        return !C2576A.H(this.f9512a) && j.b(this.f9513b, "image/gif");
    }

    public final boolean c() {
        if (!C2576A.H(this.f9512a)) {
            String str = this.f9513b;
            if (z.w(str, 2, "image", false) && !str.equals("image/gif")) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return !C2576A.H(this.f9512a) && z.w(this.f9513b, 2, "video", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CTInAppNotificationMedia.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type com.clevertap.android.sdk.inapp.CTInAppNotificationMedia");
        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) obj;
        return this.e == cTInAppNotificationMedia.e && j.b(this.f9512a, cTInAppNotificationMedia.f9512a) && j.b(this.f9513b, cTInAppNotificationMedia.f9513b) && j.b(this.c, cTInAppNotificationMedia.c) && j.b(this.f9514d, cTInAppNotificationMedia.f9514d);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.e * 31, 31, this.f9512a), 31, this.f9513b), 31, this.c);
        String str = this.f9514d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f9512a);
        dest.writeString(this.f9513b);
        dest.writeString(this.c);
        dest.writeString(this.f9514d);
        dest.writeInt(this.e);
    }

    public CTInAppNotificationMedia(Parcel parcel) {
        String string = parcel.readString();
        this.f9512a = string == null ? "" : string;
        String string2 = parcel.readString();
        this.f9513b = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.c = string3 != null ? string3 : "";
        this.f9514d = parcel.readString();
        this.e = parcel.readInt();
    }
}
