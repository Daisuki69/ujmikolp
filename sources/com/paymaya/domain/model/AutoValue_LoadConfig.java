package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.LoadConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoadConfig extends C$AutoValue_LoadConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(LoadConfig)";
        }

        @Override // com.google.gson.y
        public LoadConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            LoadConfig.Builder builderSBuilder = LoadConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("favorites")) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mFavorites((Boolean) yVarH.read(aVar));
                    } else if (strE.equals("recommender")) {
                        y yVarH2 = this.boolean__adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH2;
                        }
                        builderSBuilder.mRecommender((Boolean) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, LoadConfig loadConfig) throws IOException {
            if (loadConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("favorites");
            if (loadConfig.mFavorites() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, loadConfig.mFavorites());
            }
            bVar.m("recommender");
            if (loadConfig.mRecommender() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, loadConfig.mRecommender());
            }
            bVar.k();
        }
    }

    public AutoValue_LoadConfig(Boolean bool, Boolean bool2) {
        new LoadConfig(bool, bool2) { // from class: com.paymaya.domain.model.$AutoValue_LoadConfig
            private final Boolean mFavorites;
            private final Boolean mRecommender;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_LoadConfig$Builder */
            public static class Builder extends LoadConfig.Builder {
                private Boolean mFavorites;
                private Boolean mRecommender;

                public /* synthetic */ Builder(LoadConfig loadConfig, int i) {
                    this(loadConfig);
                }

                @Override // com.paymaya.domain.model.LoadConfig.Builder
                public LoadConfig build() {
                    return new AutoValue_LoadConfig(this.mFavorites, this.mRecommender);
                }

                @Override // com.paymaya.domain.model.LoadConfig.Builder
                public LoadConfig.Builder mFavorites(Boolean bool) {
                    this.mFavorites = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.LoadConfig.Builder
                public LoadConfig.Builder mRecommender(Boolean bool) {
                    this.mRecommender = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(LoadConfig loadConfig) {
                    this.mFavorites = loadConfig.mFavorites();
                    this.mRecommender = loadConfig.mRecommender();
                }
            }

            {
                this.mFavorites = bool;
                this.mRecommender = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof LoadConfig) {
                    LoadConfig loadConfig = (LoadConfig) obj;
                    Boolean bool3 = this.mFavorites;
                    if (bool3 != null ? bool3.equals(loadConfig.mFavorites()) : loadConfig.mFavorites() == null) {
                        Boolean bool4 = this.mRecommender;
                        if (bool4 != null ? bool4.equals(loadConfig.mRecommender()) : loadConfig.mRecommender() == null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool3 = this.mFavorites;
                int iHashCode = ((bool3 == null ? 0 : bool3.hashCode()) ^ 1000003) * 1000003;
                Boolean bool4 = this.mRecommender;
                return iHashCode ^ (bool4 != null ? bool4.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.LoadConfig
            @InterfaceC1498b("favorites")
            public Boolean mFavorites() {
                return this.mFavorites;
            }

            @Override // com.paymaya.domain.model.LoadConfig
            @InterfaceC1498b("recommender")
            public Boolean mRecommender() {
                return this.mRecommender;
            }

            @Override // com.paymaya.domain.model.LoadConfig
            public LoadConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("LoadConfig{mFavorites=");
                sb2.append(this.mFavorites);
                sb2.append(", mRecommender=");
                return AbstractC1213b.N(sb2, this.mRecommender, "}");
            }
        };
    }
}
