package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.BirthPlace;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BirthPlace, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BirthPlace extends BirthPlace {
    private final String mCity;
    private final String mCountryCode;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BirthPlace$Builder */
    public static class Builder extends BirthPlace.Builder {
        private String mCity;
        private String mCountryCode;

        @Override // com.paymaya.domain.model.BirthPlace.Builder
        public BirthPlace build() {
            String strI = this.mCity == null ? " mCity" : "";
            if (this.mCountryCode == null) {
                strI = s.i(strI, " mCountryCode");
            }
            if (strI.isEmpty()) {
                return new AutoValue_BirthPlace(this.mCity, this.mCountryCode);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.BirthPlace.Builder
        public BirthPlace.Builder mCity(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCity");
            }
            this.mCity = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BirthPlace.Builder
        public BirthPlace.Builder mCountryCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCountryCode");
            }
            this.mCountryCode = str;
            return this;
        }
    }

    public C$$AutoValue_BirthPlace(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mCity");
        }
        this.mCity = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCountryCode");
        }
        this.mCountryCode = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BirthPlace) {
            BirthPlace birthPlace = (BirthPlace) obj;
            if (this.mCity.equals(birthPlace.mCity()) && this.mCountryCode.equals(birthPlace.mCountryCode())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mCity.hashCode() ^ 1000003) * 1000003) ^ this.mCountryCode.hashCode();
    }

    @Override // com.paymaya.domain.model.BirthPlace
    @InterfaceC1498b("city")
    public String mCity() {
        return this.mCity;
    }

    @Override // com.paymaya.domain.model.BirthPlace
    @InterfaceC1498b("country")
    public String mCountryCode() {
        return this.mCountryCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BirthPlace{mCity=");
        sb2.append(this.mCity);
        sb2.append(", mCountryCode=");
        return s.p(sb2, this.mCountryCode, "}");
    }
}
