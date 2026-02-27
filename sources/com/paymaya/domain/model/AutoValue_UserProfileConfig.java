package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.UserProfileConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UserProfileConfig extends C$AutoValue_UserProfileConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(UserProfileConfig)";
        }

        @Override // com.google.gson.y
        public UserProfileConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            UserProfileConfig.Builder builderSBuilder = UserProfileConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("update_v1_android")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mIsUserProfileUpdateEnabled((Boolean) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, UserProfileConfig userProfileConfig) throws IOException {
            if (userProfileConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("update_v1_android");
            if (userProfileConfig.mIsUserProfileUpdateEnabled() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, userProfileConfig.mIsUserProfileUpdateEnabled());
            }
            bVar.k();
        }
    }

    public AutoValue_UserProfileConfig(Boolean bool) {
        new UserProfileConfig(bool) { // from class: com.paymaya.domain.model.$AutoValue_UserProfileConfig
            private final Boolean mIsUserProfileUpdateEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UserProfileConfig$Builder */
            public static class Builder extends UserProfileConfig.Builder {
                private Boolean mIsUserProfileUpdateEnabled;

                public /* synthetic */ Builder(UserProfileConfig userProfileConfig, int i) {
                    this(userProfileConfig);
                }

                @Override // com.paymaya.domain.model.UserProfileConfig.Builder
                public UserProfileConfig build() {
                    return new AutoValue_UserProfileConfig(this.mIsUserProfileUpdateEnabled);
                }

                @Override // com.paymaya.domain.model.UserProfileConfig.Builder
                public UserProfileConfig.Builder mIsUserProfileUpdateEnabled(Boolean bool) {
                    this.mIsUserProfileUpdateEnabled = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(UserProfileConfig userProfileConfig) {
                    this.mIsUserProfileUpdateEnabled = userProfileConfig.mIsUserProfileUpdateEnabled();
                }
            }

            {
                this.mIsUserProfileUpdateEnabled = bool;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UserProfileConfig)) {
                    return false;
                }
                Boolean bool2 = this.mIsUserProfileUpdateEnabled;
                Boolean boolMIsUserProfileUpdateEnabled = ((UserProfileConfig) obj).mIsUserProfileUpdateEnabled();
                return bool2 == null ? boolMIsUserProfileUpdateEnabled == null : bool2.equals(boolMIsUserProfileUpdateEnabled);
            }

            public int hashCode() {
                Boolean bool2 = this.mIsUserProfileUpdateEnabled;
                return (bool2 == null ? 0 : bool2.hashCode()) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.UserProfileConfig
            @InterfaceC1498b("update_v1_android")
            public Boolean mIsUserProfileUpdateEnabled() {
                return this.mIsUserProfileUpdateEnabled;
            }

            @Override // com.paymaya.domain.model.UserProfileConfig
            public UserProfileConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return AbstractC1213b.N(new StringBuilder("UserProfileConfig{mIsUserProfileUpdateEnabled="), this.mIsUserProfileUpdateEnabled, "}");
            }
        };
    }
}
