package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaForgotPasswordConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaForgotPasswordConfig extends C$AutoValue_MayaForgotPasswordConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaForgotPasswordConfig)";
        }

        @Override // com.google.gson.y
        public MayaForgotPasswordConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaForgotPasswordConfig.Builder builderSBuilder = MayaForgotPasswordConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("framework_v2_android")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mFrameworkV2Android((Boolean) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, MayaForgotPasswordConfig mayaForgotPasswordConfig) throws IOException {
            if (mayaForgotPasswordConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("framework_v2_android");
            if (mayaForgotPasswordConfig.mFrameworkV2Android() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaForgotPasswordConfig.mFrameworkV2Android());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaForgotPasswordConfig(Boolean bool) {
        new MayaForgotPasswordConfig(bool) { // from class: com.paymaya.domain.model.$AutoValue_MayaForgotPasswordConfig
            private final Boolean mFrameworkV2Android;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaForgotPasswordConfig$Builder */
            public static class Builder extends MayaForgotPasswordConfig.Builder {
                private Boolean mFrameworkV2Android;

                public /* synthetic */ Builder(MayaForgotPasswordConfig mayaForgotPasswordConfig, int i) {
                    this(mayaForgotPasswordConfig);
                }

                @Override // com.paymaya.domain.model.MayaForgotPasswordConfig.Builder
                public MayaForgotPasswordConfig build() {
                    return new AutoValue_MayaForgotPasswordConfig(this.mFrameworkV2Android);
                }

                @Override // com.paymaya.domain.model.MayaForgotPasswordConfig.Builder
                public MayaForgotPasswordConfig.Builder mFrameworkV2Android(Boolean bool) {
                    this.mFrameworkV2Android = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaForgotPasswordConfig mayaForgotPasswordConfig) {
                    this.mFrameworkV2Android = mayaForgotPasswordConfig.mFrameworkV2Android();
                }
            }

            {
                this.mFrameworkV2Android = bool;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MayaForgotPasswordConfig)) {
                    return false;
                }
                Boolean bool2 = this.mFrameworkV2Android;
                Boolean boolMFrameworkV2Android = ((MayaForgotPasswordConfig) obj).mFrameworkV2Android();
                return bool2 == null ? boolMFrameworkV2Android == null : bool2.equals(boolMFrameworkV2Android);
            }

            public int hashCode() {
                Boolean bool2 = this.mFrameworkV2Android;
                return (bool2 == null ? 0 : bool2.hashCode()) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.MayaForgotPasswordConfig
            @InterfaceC1498b("framework_v2_android")
            public Boolean mFrameworkV2Android() {
                return this.mFrameworkV2Android;
            }

            @Override // com.paymaya.domain.model.MayaForgotPasswordConfig
            public MayaForgotPasswordConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return AbstractC1213b.N(new StringBuilder("MayaForgotPasswordConfig{mFrameworkV2Android="), this.mFrameworkV2Android, "}");
            }
        };
    }
}
