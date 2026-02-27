package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Validation;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Validation extends C$AutoValue_Validation {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Validation)";
        }

        @Override // com.google.gson.y
        public Validation read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Validation.Builder builderSBuilder = Validation.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "pattern":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mPattern((String) yVarH.read(aVar));
                            break;
                        case "name":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mName((String) yVarH2.read(aVar));
                            break;
                        case "type":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mType((String) yVarH3.read(aVar));
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
        public void write(b bVar, Validation validation) throws IOException {
            if (validation == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (validation.mName() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, validation.mName());
            }
            bVar.m(SessionDescription.ATTR_TYPE);
            if (validation.mType() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, validation.mType());
            }
            bVar.m("pattern");
            if (validation.mPattern() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, validation.mPattern());
            }
            bVar.k();
        }
    }

    public AutoValue_Validation(final String str, final String str2, @Nullable final String str3) {
        new Validation(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_Validation
            private final String mName;
            private final String mPattern;
            private final String mType;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Validation$Builder */
            public static class Builder extends Validation.Builder {
                private String mName;
                private String mPattern;
                private String mType;

                @Override // com.paymaya.domain.model.Validation.Builder
                public Validation build() {
                    String strI = this.mName == null ? " mName" : "";
                    if (this.mType == null) {
                        strI = s.i(strI, " mType");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_Validation(this.mName, this.mType, this.mPattern);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.Validation.Builder
                public Validation.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Validation.Builder
                public Validation.Builder mPattern(@Nullable String str) {
                    this.mPattern = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Validation.Builder
                public Validation.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str2;
                this.mPattern = str3;
            }

            public boolean equals(Object obj) {
                String str4;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Validation) {
                    Validation validation = (Validation) obj;
                    if (this.mName.equals(validation.mName()) && this.mType.equals(validation.mType()) && ((str4 = this.mPattern) != null ? str4.equals(validation.mPattern()) : validation.mPattern() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (((this.mName.hashCode() ^ 1000003) * 1000003) ^ this.mType.hashCode()) * 1000003;
                String str4 = this.mPattern;
                return iHashCode ^ (str4 == null ? 0 : str4.hashCode());
            }

            @Override // com.paymaya.domain.model.Validation
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            @Override // com.paymaya.domain.model.Validation
            @Nullable
            @InterfaceC1498b("pattern")
            public String mPattern() {
                return this.mPattern;
            }

            @Override // com.paymaya.domain.model.Validation
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public String mType() {
                return this.mType;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Validation{mName=");
                sb2.append(this.mName);
                sb2.append(", mType=");
                sb2.append(this.mType);
                sb2.append(", mPattern=");
                return s.p(sb2, this.mPattern, "}");
            }
        };
    }
}
