package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaRegistrationConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaRegistrationConfig extends C$AutoValue_MayaRegistrationConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaRegistrationConfig)";
        }

        @Override // com.google.gson.y
        public MayaRegistrationConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaRegistrationConfig.Builder builderSBuilder = MayaRegistrationConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "consent_check_all":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mConsentCheckAll((Boolean) yVarH.read(aVar));
                            break;
                        case "auto_provision_android":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.mAutoProvision((Boolean) yVarH2.read(aVar));
                            break;
                        case "require_middle_name_android":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mRequireMiddleName((Boolean) yVarH3.read(aVar));
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
        public void write(b bVar, MayaRegistrationConfig mayaRegistrationConfig) throws IOException {
            if (mayaRegistrationConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("consent_check_all");
            if (mayaRegistrationConfig.mConsentCheckAll() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaRegistrationConfig.mConsentCheckAll());
            }
            bVar.m("require_middle_name_android");
            if (mayaRegistrationConfig.mRequireMiddleName() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaRegistrationConfig.mRequireMiddleName());
            }
            bVar.m("auto_provision_android");
            if (mayaRegistrationConfig.mAutoProvision() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, mayaRegistrationConfig.mAutoProvision());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaRegistrationConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        new MayaRegistrationConfig(bool, bool2, bool3) { // from class: com.paymaya.domain.model.$AutoValue_MayaRegistrationConfig
            private final Boolean mAutoProvision;
            private final Boolean mConsentCheckAll;
            private final Boolean mRequireMiddleName;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaRegistrationConfig$Builder */
            public static class Builder extends MayaRegistrationConfig.Builder {
                private Boolean mAutoProvision;
                private Boolean mConsentCheckAll;
                private Boolean mRequireMiddleName;

                public /* synthetic */ Builder(MayaRegistrationConfig mayaRegistrationConfig, int i) {
                    this(mayaRegistrationConfig);
                }

                @Override // com.paymaya.domain.model.MayaRegistrationConfig.Builder
                public MayaRegistrationConfig build() {
                    return new AutoValue_MayaRegistrationConfig(this.mConsentCheckAll, this.mRequireMiddleName, this.mAutoProvision);
                }

                @Override // com.paymaya.domain.model.MayaRegistrationConfig.Builder
                public MayaRegistrationConfig.Builder mAutoProvision(Boolean bool) {
                    this.mAutoProvision = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaRegistrationConfig.Builder
                public MayaRegistrationConfig.Builder mConsentCheckAll(Boolean bool) {
                    this.mConsentCheckAll = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaRegistrationConfig.Builder
                public MayaRegistrationConfig.Builder mRequireMiddleName(Boolean bool) {
                    this.mRequireMiddleName = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaRegistrationConfig mayaRegistrationConfig) {
                    this.mConsentCheckAll = mayaRegistrationConfig.mConsentCheckAll();
                    this.mRequireMiddleName = mayaRegistrationConfig.mRequireMiddleName();
                    this.mAutoProvision = mayaRegistrationConfig.mAutoProvision();
                }
            }

            {
                this.mConsentCheckAll = bool;
                this.mRequireMiddleName = bool2;
                this.mAutoProvision = bool3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaRegistrationConfig) {
                    MayaRegistrationConfig mayaRegistrationConfig = (MayaRegistrationConfig) obj;
                    Boolean bool4 = this.mConsentCheckAll;
                    if (bool4 != null ? bool4.equals(mayaRegistrationConfig.mConsentCheckAll()) : mayaRegistrationConfig.mConsentCheckAll() == null) {
                        Boolean bool5 = this.mRequireMiddleName;
                        if (bool5 != null ? bool5.equals(mayaRegistrationConfig.mRequireMiddleName()) : mayaRegistrationConfig.mRequireMiddleName() == null) {
                            Boolean bool6 = this.mAutoProvision;
                            if (bool6 != null ? bool6.equals(mayaRegistrationConfig.mAutoProvision()) : mayaRegistrationConfig.mAutoProvision() == null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool4 = this.mConsentCheckAll;
                int iHashCode = ((bool4 == null ? 0 : bool4.hashCode()) ^ 1000003) * 1000003;
                Boolean bool5 = this.mRequireMiddleName;
                int iHashCode2 = (iHashCode ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.mAutoProvision;
                return iHashCode2 ^ (bool6 != null ? bool6.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.MayaRegistrationConfig
            @InterfaceC1498b("auto_provision_android")
            public Boolean mAutoProvision() {
                return this.mAutoProvision;
            }

            @Override // com.paymaya.domain.model.MayaRegistrationConfig
            @InterfaceC1498b("consent_check_all")
            public Boolean mConsentCheckAll() {
                return this.mConsentCheckAll;
            }

            @Override // com.paymaya.domain.model.MayaRegistrationConfig
            @InterfaceC1498b("require_middle_name_android")
            public Boolean mRequireMiddleName() {
                return this.mRequireMiddleName;
            }

            @Override // com.paymaya.domain.model.MayaRegistrationConfig
            public MayaRegistrationConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaRegistrationConfig{mConsentCheckAll=");
                sb2.append(this.mConsentCheckAll);
                sb2.append(", mRequireMiddleName=");
                sb2.append(this.mRequireMiddleName);
                sb2.append(", mAutoProvision=");
                return AbstractC1213b.N(sb2, this.mAutoProvision, "}");
            }
        };
    }
}
