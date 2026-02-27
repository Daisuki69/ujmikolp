package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.FreelancerHubConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FreelancerHubConfig extends C$AutoValue_FreelancerHubConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(FreelancerHubConfig)";
        }

        @Override // com.google.gson.y
        public FreelancerHubConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            FreelancerHubConfig.Builder builderSBuilder = FreelancerHubConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals(Constants.ENABLED)) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mEnabled((Boolean) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, FreelancerHubConfig freelancerHubConfig) throws IOException {
            if (freelancerHubConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(Constants.ENABLED);
            if (freelancerHubConfig.mEnabled() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, freelancerHubConfig.mEnabled());
            }
            bVar.k();
        }
    }

    public AutoValue_FreelancerHubConfig(Boolean bool) {
        new FreelancerHubConfig(bool) { // from class: com.paymaya.domain.model.$AutoValue_FreelancerHubConfig
            private final Boolean mEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FreelancerHubConfig$Builder */
            public static class Builder extends FreelancerHubConfig.Builder {
                private Boolean mEnabled;

                public /* synthetic */ Builder(FreelancerHubConfig freelancerHubConfig, int i) {
                    this(freelancerHubConfig);
                }

                @Override // com.paymaya.domain.model.FreelancerHubConfig.Builder
                public FreelancerHubConfig build() {
                    return new AutoValue_FreelancerHubConfig(this.mEnabled);
                }

                @Override // com.paymaya.domain.model.FreelancerHubConfig.Builder
                public FreelancerHubConfig.Builder mEnabled(Boolean bool) {
                    this.mEnabled = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(FreelancerHubConfig freelancerHubConfig) {
                    this.mEnabled = freelancerHubConfig.mEnabled();
                }
            }

            {
                this.mEnabled = bool;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FreelancerHubConfig)) {
                    return false;
                }
                Boolean bool2 = this.mEnabled;
                Boolean boolMEnabled = ((FreelancerHubConfig) obj).mEnabled();
                return bool2 == null ? boolMEnabled == null : bool2.equals(boolMEnabled);
            }

            public int hashCode() {
                Boolean bool2 = this.mEnabled;
                return (bool2 == null ? 0 : bool2.hashCode()) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.FreelancerHubConfig
            @InterfaceC1498b(Constants.ENABLED)
            public Boolean mEnabled() {
                return this.mEnabled;
            }

            @Override // com.paymaya.domain.model.FreelancerHubConfig
            public FreelancerHubConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return AbstractC1213b.N(new StringBuilder("FreelancerHubConfig{mEnabled="), this.mEnabled, "}");
            }
        };
    }
}
