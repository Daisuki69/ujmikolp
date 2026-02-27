package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.IdentificationType;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_IdentificationType extends C$AutoValue_IdentificationType {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(IdentificationType)";
        }

        @Override // com.google.gson.y
        public IdentificationType read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            IdentificationType.Builder builderSBuilder = IdentificationType.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mName((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, IdentificationType identificationType) throws IOException {
            if (identificationType == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (identificationType.mName() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, identificationType.mName());
            }
            bVar.k();
        }
    }

    public AutoValue_IdentificationType(final String str) {
        new IdentificationType(str) { // from class: com.paymaya.domain.model.$AutoValue_IdentificationType
            private final String mName;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_IdentificationType$Builder */
            public static class Builder extends IdentificationType.Builder {
                private String mName;

                @Override // com.paymaya.domain.model.IdentificationType.Builder
                public IdentificationType build() {
                    String str = this.mName == null ? " mName" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_IdentificationType(this.mName);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.IdentificationType.Builder
                public IdentificationType.Builder mName(String str) {
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
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof IdentificationType) {
                    return this.mName.equals(((IdentificationType) obj).mName());
                }
                return false;
            }

            public int hashCode() {
                return this.mName.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.IdentificationType
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            public String toString() {
                return s.p(new StringBuilder("IdentificationType{mName="), this.mName, "}");
            }
        };
    }
}
