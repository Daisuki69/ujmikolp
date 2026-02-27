package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Address;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Address, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Address extends Address {
    private final String mCity;
    private final String mCountryCode;
    private final String mLine1;
    private final String mLine2;
    private final String mLocality;
    private final String mState;
    private final String mZipCode;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Address$Builder */
    public static class Builder extends Address.Builder {
        private String mCity;
        private String mCountryCode;
        private String mLine1;
        private String mLine2;
        private String mLocality;
        private String mState;
        private String mZipCode;

        public /* synthetic */ Builder(Address address, int i) {
            this(address);
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address build() {
            return new AutoValue_Address(this.mLine1, this.mLine2, this.mLocality, this.mCity, this.mState, this.mZipCode, this.mCountryCode);
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mCity(@Nullable String str) {
            this.mCity = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mCountryCode(@Nullable String str) {
            this.mCountryCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mLine1(@Nullable String str) {
            this.mLine1 = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mLine2(@Nullable String str) {
            this.mLine2 = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mLocality(@Nullable String str) {
            this.mLocality = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mState(@Nullable String str) {
            this.mState = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Address.Builder
        public Address.Builder mZipCode(@Nullable String str) {
            this.mZipCode = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Address address) {
            this.mLine1 = address.mLine1();
            this.mLine2 = address.mLine2();
            this.mLocality = address.mLocality();
            this.mCity = address.mCity();
            this.mState = address.mState();
            this.mZipCode = address.mZipCode();
            this.mCountryCode = address.mCountryCode();
        }
    }

    public C$$AutoValue_Address(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.mLine1 = str;
        this.mLine2 = str2;
        this.mLocality = str3;
        this.mCity = str4;
        this.mState = str5;
        this.mZipCode = str6;
        this.mCountryCode = str7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Address) {
            Address address = (Address) obj;
            String str = this.mLine1;
            if (str != null ? str.equals(address.mLine1()) : address.mLine1() == null) {
                String str2 = this.mLine2;
                if (str2 != null ? str2.equals(address.mLine2()) : address.mLine2() == null) {
                    String str3 = this.mLocality;
                    if (str3 != null ? str3.equals(address.mLocality()) : address.mLocality() == null) {
                        String str4 = this.mCity;
                        if (str4 != null ? str4.equals(address.mCity()) : address.mCity() == null) {
                            String str5 = this.mState;
                            if (str5 != null ? str5.equals(address.mState()) : address.mState() == null) {
                                String str6 = this.mZipCode;
                                if (str6 != null ? str6.equals(address.mZipCode()) : address.mZipCode() == null) {
                                    String str7 = this.mCountryCode;
                                    if (str7 != null ? str7.equals(address.mCountryCode()) : address.mCountryCode() == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mLine1;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mLine2;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mLocality;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mCity;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mState;
        int iHashCode5 = (iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.mZipCode;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.mCountryCode;
        return iHashCode6 ^ (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("city")
    public String mCity() {
        return this.mCity;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("country")
    public String mCountryCode() {
        return this.mCountryCode;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("line1")
    public String mLine1() {
        return this.mLine1;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("line2")
    public String mLine2() {
        return this.mLine2;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("locality")
    public String mLocality() {
        return this.mLocality;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("state")
    public String mState() {
        return this.mState;
    }

    @Override // com.paymaya.domain.model.Address
    @Nullable
    @InterfaceC1498b("zip_code")
    public String mZipCode() {
        return this.mZipCode;
    }

    @Override // com.paymaya.domain.model.Address
    public Address.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address{mLine1=");
        sb2.append(this.mLine1);
        sb2.append(", mLine2=");
        sb2.append(this.mLine2);
        sb2.append(", mLocality=");
        sb2.append(this.mLocality);
        sb2.append(", mCity=");
        sb2.append(this.mCity);
        sb2.append(", mState=");
        sb2.append(this.mState);
        sb2.append(", mZipCode=");
        sb2.append(this.mZipCode);
        sb2.append(", mCountryCode=");
        return s.p(sb2, this.mCountryCode, "}");
    }
}
