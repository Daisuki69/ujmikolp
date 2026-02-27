package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileAddress implements Parcelable {
    public static final Parcelable.Creator<ProfileAddress> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("city")
    private final String city;

    @InterfaceC1497a
    @InterfaceC1498b("country")
    private final String country;

    @InterfaceC1497a
    @InterfaceC1498b("line1")
    private final String line1;

    @InterfaceC1497a
    @InterfaceC1498b("line2")
    private final String line2;

    @InterfaceC1497a
    @InterfaceC1498b("locality")
    private final String locality;

    @InterfaceC1497a
    @InterfaceC1498b("province")
    private final String province;

    @InterfaceC1497a
    @InterfaceC1498b("zipCode")
    private final String zipCode;

    public static final class Creator implements Parcelable.Creator<ProfileAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileAddress createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileAddress[] newArray(int i) {
            return new ProfileAddress[i];
        }
    }

    public ProfileAddress() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ProfileAddress copy$default(ProfileAddress profileAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileAddress.city;
        }
        if ((i & 2) != 0) {
            str2 = profileAddress.country;
        }
        if ((i & 4) != 0) {
            str3 = profileAddress.line1;
        }
        if ((i & 8) != 0) {
            str4 = profileAddress.line2;
        }
        if ((i & 16) != 0) {
            str5 = profileAddress.locality;
        }
        if ((i & 32) != 0) {
            str6 = profileAddress.province;
        }
        if ((i & 64) != 0) {
            str7 = profileAddress.zipCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return profileAddress.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.locality;
    }

    public final String component6() {
        return this.province;
    }

    public final String component7() {
        return this.zipCode;
    }

    public final ProfileAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new ProfileAddress(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAddress)) {
            return false;
        }
        ProfileAddress profileAddress = (ProfileAddress) obj;
        return j.b(this.city, profileAddress.city) && j.b(this.country, profileAddress.country) && j.b(this.line1, profileAddress.line1) && j.b(this.line2, profileAddress.line2) && j.b(this.locality, profileAddress.locality) && j.b(this.province, profileAddress.province) && j.b(this.zipCode, profileAddress.zipCode);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.province;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zipCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.city;
        String str2 = this.country;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.locality;
        String str6 = this.province;
        String str7 = this.zipCode;
        StringBuilder sbX = s.x("ProfileAddress(city=", str, ", country=", str2, ", line1=");
        c.A(sbX, str3, ", line2=", str4, ", locality=");
        c.A(sbX, str5, ", province=", str6, ", zipCode=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.city);
        dest.writeString(this.country);
        dest.writeString(this.line1);
        dest.writeString(this.line2);
        dest.writeString(this.locality);
        dest.writeString(this.province);
        dest.writeString(this.zipCode);
    }

    public ProfileAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.locality = str5;
        this.province = str6;
        this.zipCode = str7;
    }

    public /* synthetic */ ProfileAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
