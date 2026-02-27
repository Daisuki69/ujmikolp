package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ProfileBadgesConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ProfileBadgesConfig extends C$AutoValue_ProfileBadgesConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y list__string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ProfileBadgesConfig)";
        }

        @Override // com.google.gson.y
        public ProfileBadgesConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ProfileBadgesConfig.Builder builderSBuilder = ProfileBadgesConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("verified_seller")) {
                        y yVarG = this.list__string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG;
                        }
                        builderSBuilder.verifiedSellerLevelList((List) yVarG.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, ProfileBadgesConfig profileBadgesConfig) throws IOException {
            if (profileBadgesConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("verified_seller");
            if (profileBadgesConfig.verifiedSellerLevelList() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__string_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = yVarG;
                }
                yVarG.write(bVar, profileBadgesConfig.verifiedSellerLevelList());
            }
            bVar.k();
        }
    }

    public AutoValue_ProfileBadgesConfig(List<String> list) {
        new ProfileBadgesConfig(list) { // from class: com.paymaya.domain.model.$AutoValue_ProfileBadgesConfig
            private final List<String> verifiedSellerLevelList;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ProfileBadgesConfig$Builder */
            public static class Builder extends ProfileBadgesConfig.Builder {
                private List<String> verifiedSellerLevelList;

                public /* synthetic */ Builder(ProfileBadgesConfig profileBadgesConfig, int i) {
                    this(profileBadgesConfig);
                }

                @Override // com.paymaya.domain.model.ProfileBadgesConfig.Builder
                public ProfileBadgesConfig build() {
                    String str = this.verifiedSellerLevelList == null ? " verifiedSellerLevelList" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_ProfileBadgesConfig(this.verifiedSellerLevelList);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.ProfileBadgesConfig.Builder
                public ProfileBadgesConfig.Builder verifiedSellerLevelList(List<String> list) {
                    if (list == null) {
                        throw new NullPointerException("Null verifiedSellerLevelList");
                    }
                    this.verifiedSellerLevelList = list;
                    return this;
                }

                public Builder() {
                }

                private Builder(ProfileBadgesConfig profileBadgesConfig) {
                    this.verifiedSellerLevelList = profileBadgesConfig.verifiedSellerLevelList();
                }
            }

            {
                if (list == null) {
                    throw new NullPointerException("Null verifiedSellerLevelList");
                }
                this.verifiedSellerLevelList = list;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ProfileBadgesConfig) {
                    return this.verifiedSellerLevelList.equals(((ProfileBadgesConfig) obj).verifiedSellerLevelList());
                }
                return false;
            }

            public int hashCode() {
                return this.verifiedSellerLevelList.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.ProfileBadgesConfig
            public ProfileBadgesConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.r(new StringBuilder("ProfileBadgesConfig{verifiedSellerLevelList="), this.verifiedSellerLevelList, "}");
            }

            @Override // com.paymaya.domain.model.ProfileBadgesConfig
            @InterfaceC1498b("verified_seller")
            public List<String> verifiedSellerLevelList() {
                return this.verifiedSellerLevelList;
            }
        };
    }
}
