package com.paymaya.utilities;

import A1.a;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageUrl extends ImageUrlModel {
    public static final Parcelable.Creator<ImageUrl> CREATOR = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("mdpi")
    private final String f14953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("hdpi")
    private final String f14954b;

    @InterfaceC1497a
    @InterfaceC1498b("xhdpi")
    private final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("xxhdpi")
    private final String f14955d;

    @InterfaceC1497a
    @InterfaceC1498b("xxxhdpi")
    private final String e;

    public ImageUrl(String str, String str2, String str3, String str4, String str5) {
        this.f14953a = str;
        this.f14954b = str2;
        this.c = str3;
        this.f14955d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.f14954b;
    }

    public final String b() {
        return this.f14953a;
    }

    public final String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrl)) {
            return false;
        }
        ImageUrl imageUrl = (ImageUrl) obj;
        return j.b(this.f14953a, imageUrl.f14953a) && j.b(this.f14954b, imageUrl.f14954b) && j.b(this.c, imageUrl.c) && j.b(this.f14955d, imageUrl.f14955d) && j.b(this.e, imageUrl.e);
    }

    public final int hashCode() {
        String str = this.f14953a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14954b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14955d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f14953a;
        String str2 = this.f14954b;
        String str3 = this.c;
        String str4 = this.f14955d;
        String str5 = this.e;
        StringBuilder sbX = s.x("ImageUrl(mdpi=", str, ", hdpi=", str2, ", xhdpi=");
        c.A(sbX, str3, ", xxhdpi=", str4, ", xxxhdpi=");
        return s.p(sbX, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f14953a);
        dest.writeString(this.f14954b);
        dest.writeString(this.c);
        dest.writeString(this.f14955d);
        dest.writeString(this.e);
    }

    public ImageUrl() {
        this(null, null, null, null, null);
    }
}
