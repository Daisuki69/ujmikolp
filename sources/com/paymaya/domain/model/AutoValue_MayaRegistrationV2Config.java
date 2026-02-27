package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaRegistrationV2Config;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaRegistrationV2Config extends C$AutoValue_MayaRegistrationV2Config {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaRegistrationV2Config)";
        }

        @Override // com.google.gson.y
        public MayaRegistrationV2Config read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaRegistrationV2Config.Builder builderSBuilder = MayaRegistrationV2Config.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("show_data_privacy_on_app_launch_android")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mShowDataPrivacyOnAppLaunch((Boolean) yVarH.read(aVar));
                    } else if (strE.equals("shortened_reg_android")) {
                        y yVarH2 = this.boolean__adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH2;
                        }
                        builderSBuilder.mShortenedReg((Boolean) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, MayaRegistrationV2Config mayaRegistrationV2Config) throws IOException {
            if (mayaRegistrationV2Config == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("show_data_privacy_on_app_launch_android");
            if (mayaRegistrationV2Config.mShowDataPrivacyOnAppLaunch() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaRegistrationV2Config.mShowDataPrivacyOnAppLaunch());
            }
            bVar.m("shortened_reg_android");
            if (mayaRegistrationV2Config.mShortenedReg() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaRegistrationV2Config.mShortenedReg());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaRegistrationV2Config(Boolean bool, Boolean bool2) {
        new MayaRegistrationV2Config(bool, bool2) { // from class: com.paymaya.domain.model.$AutoValue_MayaRegistrationV2Config
            private final Boolean mShortenedReg;
            private final Boolean mShowDataPrivacyOnAppLaunch;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaRegistrationV2Config$Builder */
            public static class Builder extends MayaRegistrationV2Config.Builder {
                private Boolean mShortenedReg;
                private Boolean mShowDataPrivacyOnAppLaunch;

                public /* synthetic */ Builder(MayaRegistrationV2Config mayaRegistrationV2Config, int i) {
                    this(mayaRegistrationV2Config);
                }

                @Override // com.paymaya.domain.model.MayaRegistrationV2Config.Builder
                public MayaRegistrationV2Config build() {
                    return new AutoValue_MayaRegistrationV2Config(this.mShowDataPrivacyOnAppLaunch, this.mShortenedReg);
                }

                @Override // com.paymaya.domain.model.MayaRegistrationV2Config.Builder
                public MayaRegistrationV2Config.Builder mShortenedReg(Boolean bool) {
                    this.mShortenedReg = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaRegistrationV2Config.Builder
                public MayaRegistrationV2Config.Builder mShowDataPrivacyOnAppLaunch(Boolean bool) {
                    this.mShowDataPrivacyOnAppLaunch = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaRegistrationV2Config mayaRegistrationV2Config) {
                    this.mShowDataPrivacyOnAppLaunch = mayaRegistrationV2Config.mShowDataPrivacyOnAppLaunch();
                    this.mShortenedReg = mayaRegistrationV2Config.mShortenedReg();
                }
            }

            {
                this.mShowDataPrivacyOnAppLaunch = bool;
                this.mShortenedReg = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaRegistrationV2Config) {
                    MayaRegistrationV2Config mayaRegistrationV2Config = (MayaRegistrationV2Config) obj;
                    Boolean bool3 = this.mShowDataPrivacyOnAppLaunch;
                    if (bool3 != null ? bool3.equals(mayaRegistrationV2Config.mShowDataPrivacyOnAppLaunch()) : mayaRegistrationV2Config.mShowDataPrivacyOnAppLaunch() == null) {
                        Boolean bool4 = this.mShortenedReg;
                        if (bool4 != null ? bool4.equals(mayaRegistrationV2Config.mShortenedReg()) : mayaRegistrationV2Config.mShortenedReg() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool3 = this.mShowDataPrivacyOnAppLaunch;
                int iHashCode = ((bool3 == null ? 0 : bool3.hashCode()) ^ 1000003) * 1000003;
                Boolean bool4 = this.mShortenedReg;
                return iHashCode ^ (bool4 != null ? bool4.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.MayaRegistrationV2Config
            @InterfaceC1498b("shortened_reg_android")
            public Boolean mShortenedReg() {
                return this.mShortenedReg;
            }

            @Override // com.paymaya.domain.model.MayaRegistrationV2Config
            @InterfaceC1498b("show_data_privacy_on_app_launch_android")
            public Boolean mShowDataPrivacyOnAppLaunch() {
                return this.mShowDataPrivacyOnAppLaunch;
            }

            @Override // com.paymaya.domain.model.MayaRegistrationV2Config
            public MayaRegistrationV2Config.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaRegistrationV2Config{mShowDataPrivacyOnAppLaunch=");
                sb2.append(this.mShowDataPrivacyOnAppLaunch);
                sb2.append(", mShortenedReg=");
                return AbstractC1213b.N(sb2, this.mShortenedReg, "}");
            }
        };
    }
}
