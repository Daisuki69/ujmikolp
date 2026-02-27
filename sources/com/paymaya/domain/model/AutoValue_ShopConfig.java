package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ShopConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopConfig extends C$AutoValue_ShopConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y list__string_adapter;
        private volatile y shopHome_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ShopConfig)";
        }

        @Override // com.google.gson.y
        public ShopConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ShopConfig.Builder builderSBuilder = ShopConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "default_product_types":
                            y yVarG = this.list__string_adapter;
                            if (yVarG == null) {
                                yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = yVarG;
                            }
                            builderSBuilder.mDefaultProductTypes((List) yVarG.read(aVar));
                            break;
                        case "treats_networks":
                            y yVarG2 = this.list__string_adapter;
                            if (yVarG2 == null) {
                                yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = yVarG2;
                            }
                            builderSBuilder.mTreatsNetworks((List) yVarG2.read(aVar));
                            break;
                        case "default_category":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mDefaultCategory((String) yVarH.read(aVar));
                            break;
                        case "home":
                            y yVarH2 = this.shopHome_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(ShopHome.class);
                                this.shopHome_adapter = yVarH2;
                            }
                            builderSBuilder.mHome((ShopHome) yVarH2.read(aVar));
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
        public void write(b bVar, ShopConfig shopConfig) throws IOException {
            if (shopConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("default_category");
            if (shopConfig.mDefaultCategory() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, shopConfig.mDefaultCategory());
            }
            bVar.m("default_product_types");
            if (shopConfig.mDefaultProductTypes() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__string_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = yVarG;
                }
                yVarG.write(bVar, shopConfig.mDefaultProductTypes());
            }
            bVar.m("treats_networks");
            if (shopConfig.mTreatsNetworks() == null) {
                bVar.r();
            } else {
                y yVarG2 = this.list__string_adapter;
                if (yVarG2 == null) {
                    yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = yVarG2;
                }
                yVarG2.write(bVar, shopConfig.mTreatsNetworks());
            }
            bVar.m("home");
            if (shopConfig.mHome() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.shopHome_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(ShopHome.class);
                    this.shopHome_adapter = yVarH2;
                }
                yVarH2.write(bVar, shopConfig.mHome());
            }
            bVar.k();
        }
    }

    public AutoValue_ShopConfig(String str, List<String> list, List<String> list2, ShopHome shopHome) {
        new ShopConfig(str, list, list2, shopHome) { // from class: com.paymaya.domain.model.$AutoValue_ShopConfig
            private final String mDefaultCategory;
            private final List<String> mDefaultProductTypes;
            private final ShopHome mHome;
            private final List<String> mTreatsNetworks;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ShopConfig$Builder */
            public static class Builder extends ShopConfig.Builder {
                private String mDefaultCategory;
                private List<String> mDefaultProductTypes;
                private ShopHome mHome;
                private List<String> mTreatsNetworks;

                public /* synthetic */ Builder(ShopConfig shopConfig, int i) {
                    this(shopConfig);
                }

                @Override // com.paymaya.domain.model.ShopConfig.Builder
                public ShopConfig build() {
                    String strI = this.mDefaultCategory == null ? " mDefaultCategory" : "";
                    if (this.mDefaultProductTypes == null) {
                        strI = s.i(strI, " mDefaultProductTypes");
                    }
                    if (this.mTreatsNetworks == null) {
                        strI = s.i(strI, " mTreatsNetworks");
                    }
                    if (this.mHome == null) {
                        strI = s.i(strI, " mHome");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_ShopConfig(this.mDefaultCategory, this.mDefaultProductTypes, this.mTreatsNetworks, this.mHome);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.ShopConfig.Builder
                public ShopConfig.Builder mDefaultCategory(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mDefaultCategory");
                    }
                    this.mDefaultCategory = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopConfig.Builder
                public ShopConfig.Builder mDefaultProductTypes(List<String> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mDefaultProductTypes");
                    }
                    this.mDefaultProductTypes = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopConfig.Builder
                public ShopConfig.Builder mHome(ShopHome shopHome) {
                    if (shopHome == null) {
                        throw new NullPointerException("Null mHome");
                    }
                    this.mHome = shopHome;
                    return this;
                }

                @Override // com.paymaya.domain.model.ShopConfig.Builder
                public ShopConfig.Builder mTreatsNetworks(List<String> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mTreatsNetworks");
                    }
                    this.mTreatsNetworks = list;
                    return this;
                }

                public Builder() {
                }

                private Builder(ShopConfig shopConfig) {
                    this.mDefaultCategory = shopConfig.mDefaultCategory();
                    this.mDefaultProductTypes = shopConfig.mDefaultProductTypes();
                    this.mTreatsNetworks = shopConfig.mTreatsNetworks();
                    this.mHome = shopConfig.mHome();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mDefaultCategory");
                }
                this.mDefaultCategory = str;
                if (list == null) {
                    throw new NullPointerException("Null mDefaultProductTypes");
                }
                this.mDefaultProductTypes = list;
                if (list2 == null) {
                    throw new NullPointerException("Null mTreatsNetworks");
                }
                this.mTreatsNetworks = list2;
                if (shopHome == null) {
                    throw new NullPointerException("Null mHome");
                }
                this.mHome = shopHome;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ShopConfig) {
                    ShopConfig shopConfig = (ShopConfig) obj;
                    if (this.mDefaultCategory.equals(shopConfig.mDefaultCategory()) && this.mDefaultProductTypes.equals(shopConfig.mDefaultProductTypes()) && this.mTreatsNetworks.equals(shopConfig.mTreatsNetworks()) && this.mHome.equals(shopConfig.mHome())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((this.mDefaultCategory.hashCode() ^ 1000003) * 1000003) ^ this.mDefaultProductTypes.hashCode()) * 1000003) ^ this.mTreatsNetworks.hashCode()) * 1000003) ^ this.mHome.hashCode();
            }

            @Override // com.paymaya.domain.model.ShopConfig
            @InterfaceC1498b("default_category")
            public String mDefaultCategory() {
                return this.mDefaultCategory;
            }

            @Override // com.paymaya.domain.model.ShopConfig
            @InterfaceC1498b("default_product_types")
            public List<String> mDefaultProductTypes() {
                return this.mDefaultProductTypes;
            }

            @Override // com.paymaya.domain.model.ShopConfig
            @InterfaceC1498b("home")
            public ShopHome mHome() {
                return this.mHome;
            }

            @Override // com.paymaya.domain.model.ShopConfig
            @InterfaceC1498b("treats_networks")
            public List<String> mTreatsNetworks() {
                return this.mTreatsNetworks;
            }

            @Override // com.paymaya.domain.model.ShopConfig
            public ShopConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "ShopConfig{mDefaultCategory=" + this.mDefaultCategory + ", mDefaultProductTypes=" + this.mDefaultProductTypes + ", mTreatsNetworks=" + this.mTreatsNetworks + ", mHome=" + this.mHome + "}";
            }
        };
    }
}
