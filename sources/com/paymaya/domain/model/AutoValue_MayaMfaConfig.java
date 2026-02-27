package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaMfaConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaMfaConfig extends C$AutoValue_MayaMfaConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaMfaConfig)";
        }

        @Override // com.google.gson.y
        public MayaMfaConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaMfaConfig.Builder builderSBuilder = MayaMfaConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("face_auth_form_android")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mFaceAuthFormAndroid((Boolean) yVarH.read(aVar));
                    } else if (strE.equals("framework_v1_android")) {
                        y yVarH2 = this.boolean__adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH2;
                        }
                        builderSBuilder.mFrameworkV1Android((Boolean) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, MayaMfaConfig mayaMfaConfig) throws IOException {
            if (mayaMfaConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("framework_v1_android");
            if (mayaMfaConfig.mFrameworkV1Android() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaMfaConfig.mFrameworkV1Android());
            }
            bVar.m("face_auth_form_android");
            if (mayaMfaConfig.mFaceAuthFormAndroid() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaMfaConfig.mFaceAuthFormAndroid());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaMfaConfig(Boolean bool, Boolean bool2) {
        new MayaMfaConfig(bool, bool2) { // from class: com.paymaya.domain.model.$AutoValue_MayaMfaConfig
            private final Boolean mFaceAuthFormAndroid;
            private final Boolean mFrameworkV1Android;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaMfaConfig$Builder */
            public static class Builder extends MayaMfaConfig.Builder {
                private Boolean mFaceAuthFormAndroid;
                private Boolean mFrameworkV1Android;

                public /* synthetic */ Builder(MayaMfaConfig mayaMfaConfig, int i) {
                    this(mayaMfaConfig);
                }

                @Override // com.paymaya.domain.model.MayaMfaConfig.Builder
                public MayaMfaConfig build() {
                    return new AutoValue_MayaMfaConfig(this.mFrameworkV1Android, this.mFaceAuthFormAndroid);
                }

                @Override // com.paymaya.domain.model.MayaMfaConfig.Builder
                public MayaMfaConfig.Builder mFaceAuthFormAndroid(Boolean bool) {
                    this.mFaceAuthFormAndroid = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaMfaConfig.Builder
                public MayaMfaConfig.Builder mFrameworkV1Android(Boolean bool) {
                    this.mFrameworkV1Android = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaMfaConfig mayaMfaConfig) {
                    this.mFrameworkV1Android = mayaMfaConfig.mFrameworkV1Android();
                    this.mFaceAuthFormAndroid = mayaMfaConfig.mFaceAuthFormAndroid();
                }
            }

            {
                this.mFrameworkV1Android = bool;
                this.mFaceAuthFormAndroid = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaMfaConfig) {
                    MayaMfaConfig mayaMfaConfig = (MayaMfaConfig) obj;
                    Boolean bool3 = this.mFrameworkV1Android;
                    if (bool3 != null ? bool3.equals(mayaMfaConfig.mFrameworkV1Android()) : mayaMfaConfig.mFrameworkV1Android() == null) {
                        Boolean bool4 = this.mFaceAuthFormAndroid;
                        if (bool4 != null ? bool4.equals(mayaMfaConfig.mFaceAuthFormAndroid()) : mayaMfaConfig.mFaceAuthFormAndroid() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool3 = this.mFrameworkV1Android;
                int iHashCode = ((bool3 == null ? 0 : bool3.hashCode()) ^ 1000003) * 1000003;
                Boolean bool4 = this.mFaceAuthFormAndroid;
                return iHashCode ^ (bool4 != null ? bool4.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.MayaMfaConfig
            @InterfaceC1498b("face_auth_form_android")
            public Boolean mFaceAuthFormAndroid() {
                return this.mFaceAuthFormAndroid;
            }

            @Override // com.paymaya.domain.model.MayaMfaConfig
            @InterfaceC1498b("framework_v1_android")
            public Boolean mFrameworkV1Android() {
                return this.mFrameworkV1Android;
            }

            @Override // com.paymaya.domain.model.MayaMfaConfig
            public MayaMfaConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaMfaConfig{mFrameworkV1Android=");
                sb2.append(this.mFrameworkV1Android);
                sb2.append(", mFaceAuthFormAndroid=");
                return AbstractC1213b.N(sb2, this.mFaceAuthFormAndroid, "}");
            }
        };
    }
}
