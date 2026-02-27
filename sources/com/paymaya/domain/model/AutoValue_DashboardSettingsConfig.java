package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.DashboardSettingsConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_DashboardSettingsConfig extends C$AutoValue_DashboardSettingsConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y list__dashboardSettingsTab_adapter;
        private volatile y list__string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(DashboardSettingsConfig)";
        }

        @Override // com.google.gson.y
        public DashboardSettingsConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            DashboardSettingsConfig.Builder builderSBuilder = DashboardSettingsConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("tabs")) {
                        y yVarG = this.list__dashboardSettingsTab_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, DashboardSettingsTab.class));
                            this.list__dashboardSettingsTab_adapter = yVarG;
                        }
                        builderSBuilder.mTabs((List) yVarG.read(aVar));
                    } else if (strE.equals("wallet_tiles")) {
                        y yVarG2 = this.list__string_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG2;
                        }
                        builderSBuilder.mWalletTiles((List) yVarG2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, DashboardSettingsConfig dashboardSettingsConfig) throws IOException {
            if (dashboardSettingsConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("wallet_tiles");
            if (dashboardSettingsConfig.mWalletTiles() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__string_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = yVarG;
                }
                yVarG.write(bVar, dashboardSettingsConfig.mWalletTiles());
            }
            bVar.m("tabs");
            if (dashboardSettingsConfig.mTabs() == null) {
                bVar.r();
            } else {
                y yVarG2 = this.list__dashboardSettingsTab_adapter;
                if (yVarG2 == null) {
                    yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, DashboardSettingsTab.class));
                    this.list__dashboardSettingsTab_adapter = yVarG2;
                }
                yVarG2.write(bVar, dashboardSettingsConfig.mTabs());
            }
            bVar.k();
        }
    }

    public AutoValue_DashboardSettingsConfig(final List<String> list, final List<DashboardSettingsTab> list2) {
        new DashboardSettingsConfig(list, list2) { // from class: com.paymaya.domain.model.$AutoValue_DashboardSettingsConfig
            private final List<DashboardSettingsTab> mTabs;
            private final List<String> mWalletTiles;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_DashboardSettingsConfig$Builder */
            public static class Builder extends DashboardSettingsConfig.Builder {
                private List<DashboardSettingsTab> mTabs;
                private List<String> mWalletTiles;

                public /* synthetic */ Builder(DashboardSettingsConfig dashboardSettingsConfig, int i) {
                    this(dashboardSettingsConfig);
                }

                @Override // com.paymaya.domain.model.DashboardSettingsConfig.Builder
                public DashboardSettingsConfig build() {
                    String strI = this.mWalletTiles == null ? " mWalletTiles" : "";
                    if (this.mTabs == null) {
                        strI = s.i(strI, " mTabs");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_DashboardSettingsConfig(this.mWalletTiles, this.mTabs);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.DashboardSettingsConfig.Builder
                public DashboardSettingsConfig.Builder mTabs(List<DashboardSettingsTab> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mTabs");
                    }
                    this.mTabs = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.DashboardSettingsConfig.Builder
                public DashboardSettingsConfig.Builder mWalletTiles(List<String> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mWalletTiles");
                    }
                    this.mWalletTiles = list;
                    return this;
                }

                public Builder() {
                }

                private Builder(DashboardSettingsConfig dashboardSettingsConfig) {
                    this.mWalletTiles = dashboardSettingsConfig.mWalletTiles();
                    this.mTabs = dashboardSettingsConfig.mTabs();
                }
            }

            {
                if (list == null) {
                    throw new NullPointerException("Null mWalletTiles");
                }
                this.mWalletTiles = list;
                if (list2 == null) {
                    throw new NullPointerException("Null mTabs");
                }
                this.mTabs = list2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DashboardSettingsConfig) {
                    DashboardSettingsConfig dashboardSettingsConfig = (DashboardSettingsConfig) obj;
                    if (this.mWalletTiles.equals(dashboardSettingsConfig.mWalletTiles()) && this.mTabs.equals(dashboardSettingsConfig.mTabs())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mWalletTiles.hashCode() ^ 1000003) * 1000003) ^ this.mTabs.hashCode();
            }

            @Override // com.paymaya.domain.model.DashboardSettingsConfig
            @InterfaceC1498b("tabs")
            public List<DashboardSettingsTab> mTabs() {
                return this.mTabs;
            }

            @Override // com.paymaya.domain.model.DashboardSettingsConfig
            @InterfaceC1498b("wallet_tiles")
            public List<String> mWalletTiles() {
                return this.mWalletTiles;
            }

            @Override // com.paymaya.domain.model.DashboardSettingsConfig
            public DashboardSettingsConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("DashboardSettingsConfig{mWalletTiles=");
                sb2.append(this.mWalletTiles);
                sb2.append(", mTabs=");
                return s.r(sb2, this.mTabs, "}");
            }
        };
    }
}
