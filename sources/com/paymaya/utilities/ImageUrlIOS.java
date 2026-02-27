package com.paymaya.utilities;

import A1.a;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageUrlIOS extends ImageUrlModel {
    public static final Parcelable.Creator<ImageUrlIOS> CREATOR = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("retina")
    private final String f14956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("3x")
    private final String f14957b;

    public ImageUrlIOS(String str, String str2) {
        this.f14956a = str;
        this.f14957b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrlIOS)) {
            return false;
        }
        ImageUrlIOS imageUrlIOS = (ImageUrlIOS) obj;
        return j.b(this.f14956a, imageUrlIOS.f14956a) && j.b(this.f14957b, imageUrlIOS.f14957b);
    }

    public final int hashCode() {
        String str = this.f14956a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14957b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s.l("ImageUrlIOS(retina=", this.f14956a, ", threeX=", this.f14957b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f14956a);
        dest.writeString(this.f14957b);
    }

    public ImageUrlIOS() {
        this(null, null);
    }
}
