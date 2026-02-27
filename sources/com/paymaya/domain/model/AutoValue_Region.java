package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Region;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Region extends C$AutoValue_Region {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Region)";
        }

        @Override // com.google.gson.y
        public Region read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Region.Builder builderSBuilder = Region.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "locale":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mRegionLocale((String) yVarH.read(aVar));
                            break;
                        case "regionId":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mRegionId((String) yVarH2.read(aVar));
                            break;
                        case "name":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mRegionName((String) yVarH3.read(aVar));
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, Region region) throws IOException {
            if (region == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("regionId");
            if (region.mRegionId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, region.mRegionId());
            }
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (region.mRegionName() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, region.mRegionName());
            }
            bVar.m("locale");
            if (region.mRegionLocale() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, region.mRegionLocale());
            }
            bVar.k();
        }
    }

    public AutoValue_Region(final String str, final String str2, final String str3) {
        new Region(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_Region
            private final String mRegionId;
            private final String mRegionLocale;
            private final String mRegionName;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Region$Builder */
            public static class Builder extends Region.Builder {
                private String mRegionId;
                private String mRegionLocale;
                private String mRegionName;

                @Override // com.paymaya.domain.model.Region.Builder
                public Region build() {
                    String strI = this.mRegionId == null ? " mRegionId" : "";
                    if (this.mRegionName == null) {
                        strI = s.i(strI, " mRegionName");
                    }
                    if (this.mRegionLocale == null) {
                        strI = s.i(strI, " mRegionLocale");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_Region(this.mRegionId, this.mRegionName, this.mRegionLocale);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.Region.Builder
                public Region.Builder mRegionId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mRegionId");
                    }
                    this.mRegionId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Region.Builder
                public Region.Builder mRegionLocale(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mRegionLocale");
                    }
                    this.mRegionLocale = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Region.Builder
                public Region.Builder mRegionName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mRegionName");
                    }
                    this.mRegionName = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mRegionId");
                }
                this.mRegionId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mRegionName");
                }
                this.mRegionName = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mRegionLocale");
                }
                this.mRegionLocale = str3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Region) {
                    Region region = (Region) obj;
                    if (this.mRegionId.equals(region.mRegionId()) && this.mRegionName.equals(region.mRegionName()) && this.mRegionLocale.equals(region.mRegionLocale())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((this.mRegionId.hashCode() ^ 1000003) * 1000003) ^ this.mRegionName.hashCode()) * 1000003) ^ this.mRegionLocale.hashCode();
            }

            @Override // com.paymaya.domain.model.Region
            @InterfaceC1498b("regionId")
            public String mRegionId() {
                return this.mRegionId;
            }

            @Override // com.paymaya.domain.model.Region
            @InterfaceC1498b("locale")
            public String mRegionLocale() {
                return this.mRegionLocale;
            }

            @Override // com.paymaya.domain.model.Region
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mRegionName() {
                return this.mRegionName;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Region{mRegionId=");
                sb2.append(this.mRegionId);
                sb2.append(", mRegionName=");
                sb2.append(this.mRegionName);
                sb2.append(", mRegionLocale=");
                return s.p(sb2, this.mRegionLocale, "}");
            }
        };
    }
}
