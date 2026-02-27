package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAddress {

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
    @InterfaceC1498b("state")
    private final String state;

    @InterfaceC1497a
    @InterfaceC1498b("zipCode")
    private final String zipCode;

    public KycAddress() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ KycAddress copy$default(KycAddress kycAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycAddress.country;
        }
        if ((i & 2) != 0) {
            str2 = kycAddress.city;
        }
        if ((i & 4) != 0) {
            str3 = kycAddress.state;
        }
        if ((i & 8) != 0) {
            str4 = kycAddress.locality;
        }
        if ((i & 16) != 0) {
            str5 = kycAddress.line1;
        }
        if ((i & 32) != 0) {
            str6 = kycAddress.line2;
        }
        if ((i & 64) != 0) {
            str7 = kycAddress.zipCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return kycAddress.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.country;
    }

    public final String component2() {
        return this.city;
    }

    public final String component3() {
        return this.state;
    }

    public final String component4() {
        return this.locality;
    }

    public final String component5() {
        return this.line1;
    }

    public final String component6() {
        return this.line2;
    }

    public final String component7() {
        return this.zipCode;
    }

    public final KycAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new KycAddress(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAddress)) {
            return false;
        }
        KycAddress kycAddress = (KycAddress) obj;
        return j.b(this.country, kycAddress.country) && j.b(this.city, kycAddress.city) && j.b(this.state, kycAddress.state) && j.b(this.locality, kycAddress.locality) && j.b(this.line1, kycAddress.line1) && j.b(this.line2, kycAddress.line2) && j.b(this.zipCode, kycAddress.zipCode);
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

    public final String getState() {
        return this.state;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locality;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.line1;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.line2;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zipCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.country;
        String str2 = this.city;
        String str3 = this.state;
        String str4 = this.locality;
        String str5 = this.line1;
        String str6 = this.line2;
        String str7 = this.zipCode;
        StringBuilder sbX = s.x("KycAddress(country=", str, ", city=", str2, ", state=");
        c.A(sbX, str3, ", locality=", str4, ", line1=");
        c.A(sbX, str5, ", line2=", str6, ", zipCode=");
        return s.p(sbX, str7, ")");
    }

    public KycAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.country = str;
        this.city = str2;
        this.state = str3;
        this.locality = str4;
        this.line1 = str5;
        this.line2 = str6;
        this.zipCode = str7;
    }

    public /* synthetic */ KycAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
