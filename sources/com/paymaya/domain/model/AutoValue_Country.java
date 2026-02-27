package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Country;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Country extends C$AutoValue_Country {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Country)";
        }

        @Override // com.google.gson.y
        public Country read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Country.Builder builderSBuilder = Country.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("code")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mCode((String) yVarH.read(aVar));
                    } else if (strE.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mName((String) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, Country country) throws IOException {
            if (country == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (country.mName() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, country.mName());
            }
            bVar.m("code");
            if (country.mCode() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, country.mCode());
            }
            bVar.k();
        }
    }

    public AutoValue_Country(String str, String str2) {
        new Country(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_Country
            private final String mCode;
            private final String mName;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Country$Builder */
            public static class Builder extends Country.Builder {
                private String mCode;
                private String mName;

                @Override // com.paymaya.domain.model.Country.Builder
                public Country build() {
                    String strI = this.mName == null ? " mName" : "";
                    if (this.mCode == null) {
                        strI = s.i(strI, " mCode");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_Country(this.mName, this.mCode);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.Country.Builder
                public Country.Builder mCode(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCode");
                    }
                    this.mCode = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Country.Builder
                public Country.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mCode");
                }
                this.mCode = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Country) {
                    Country country = (Country) obj;
                    if (this.mName.equals(country.mName()) && this.mCode.equals(country.mCode())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mName.hashCode() ^ 1000003) * 1000003) ^ this.mCode.hashCode();
            }

            @Override // com.paymaya.domain.model.Country
            @InterfaceC1498b("code")
            public String mCode() {
                return this.mCode;
            }

            @Override // com.paymaya.domain.model.Country
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Country{mName=");
                sb2.append(this.mName);
                sb2.append(", mCode=");
                return s.p(sb2, this.mCode, "}");
            }
        };
    }
}
