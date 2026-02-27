package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaComplianceConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaComplianceConfig extends C$AutoValue_MayaComplianceConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaComplianceConfig)";
        }

        @Override // com.google.gson.y
        public MayaComplianceConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaComplianceConfig.Builder builderSBuilder = MayaComplianceConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("dosri_android")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mDosri((Boolean) yVarH.read(aVar));
                    } else if (strE.equals("fatca_android")) {
                        y yVarH2 = this.boolean__adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH2;
                        }
                        builderSBuilder.mFatca((Boolean) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, MayaComplianceConfig mayaComplianceConfig) throws IOException {
            if (mayaComplianceConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("fatca_android");
            if (mayaComplianceConfig.mFatca() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaComplianceConfig.mFatca());
            }
            bVar.m("dosri_android");
            if (mayaComplianceConfig.mDosri() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaComplianceConfig.mDosri());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaComplianceConfig(Boolean bool, Boolean bool2) {
        new MayaComplianceConfig(bool, bool2) { // from class: com.paymaya.domain.model.$AutoValue_MayaComplianceConfig
            private final Boolean mDosri;
            private final Boolean mFatca;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaComplianceConfig$Builder */
            public static class Builder extends MayaComplianceConfig.Builder {
                private Boolean mDosri;
                private Boolean mFatca;

                public /* synthetic */ Builder(MayaComplianceConfig mayaComplianceConfig, int i) {
                    this(mayaComplianceConfig);
                }

                @Override // com.paymaya.domain.model.MayaComplianceConfig.Builder
                public MayaComplianceConfig build() {
                    return new AutoValue_MayaComplianceConfig(this.mFatca, this.mDosri);
                }

                @Override // com.paymaya.domain.model.MayaComplianceConfig.Builder
                public MayaComplianceConfig.Builder mDosri(Boolean bool) {
                    this.mDosri = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaComplianceConfig.Builder
                public MayaComplianceConfig.Builder mFatca(Boolean bool) {
                    this.mFatca = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaComplianceConfig mayaComplianceConfig) {
                    this.mFatca = mayaComplianceConfig.mFatca();
                    this.mDosri = mayaComplianceConfig.mDosri();
                }
            }

            {
                this.mFatca = bool;
                this.mDosri = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaComplianceConfig) {
                    MayaComplianceConfig mayaComplianceConfig = (MayaComplianceConfig) obj;
                    Boolean bool3 = this.mFatca;
                    if (bool3 != null ? bool3.equals(mayaComplianceConfig.mFatca()) : mayaComplianceConfig.mFatca() == null) {
                        Boolean bool4 = this.mDosri;
                        if (bool4 != null ? bool4.equals(mayaComplianceConfig.mDosri()) : mayaComplianceConfig.mDosri() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool3 = this.mFatca;
                int iHashCode = ((bool3 == null ? 0 : bool3.hashCode()) ^ 1000003) * 1000003;
                Boolean bool4 = this.mDosri;
                return iHashCode ^ (bool4 != null ? bool4.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.MayaComplianceConfig
            @InterfaceC1498b("dosri_android")
            public Boolean mDosri() {
                return this.mDosri;
            }

            @Override // com.paymaya.domain.model.MayaComplianceConfig
            @InterfaceC1498b("fatca_android")
            public Boolean mFatca() {
                return this.mFatca;
            }

            @Override // com.paymaya.domain.model.MayaComplianceConfig
            public MayaComplianceConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaComplianceConfig{mFatca=");
                sb2.append(this.mFatca);
                sb2.append(", mDosri=");
                return AbstractC1213b.N(sb2, this.mDosri, "}");
            }
        };
    }
}
