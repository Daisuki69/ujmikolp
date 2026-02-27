package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycBirthPlace {

    @InterfaceC1497a
    @InterfaceC1498b("city")
    private final String city;

    @InterfaceC1497a
    @InterfaceC1498b("country")
    private final String country;

    @InterfaceC1497a
    @InterfaceC1498b("state")
    private final String state;

    public KycBirthPlace() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycBirthPlace copy$default(KycBirthPlace kycBirthPlace, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycBirthPlace.city;
        }
        if ((i & 2) != 0) {
            str2 = kycBirthPlace.state;
        }
        if ((i & 4) != 0) {
            str3 = kycBirthPlace.country;
        }
        return kycBirthPlace.copy(str, str2, str3);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.country;
    }

    public final KycBirthPlace copy(String str, String str2, String str3) {
        return new KycBirthPlace(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycBirthPlace)) {
            return false;
        }
        KycBirthPlace kycBirthPlace = (KycBirthPlace) obj;
        return j.b(this.city, kycBirthPlace.city) && j.b(this.state, kycBirthPlace.state) && j.b(this.country, kycBirthPlace.country);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.city;
        String str2 = this.state;
        return s.p(s.x("KycBirthPlace(city=", str, ", state=", str2, ", country="), this.country, ")");
    }

    public KycBirthPlace(String str, String str2, String str3) {
        this.city = str;
        this.state = str2;
        this.country = str3;
    }

    public /* synthetic */ KycBirthPlace(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
