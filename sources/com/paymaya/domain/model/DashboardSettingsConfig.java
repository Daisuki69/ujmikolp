package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.AutoValue_DashboardSettingsConfig;
import com.paymaya.domain.model.C$AutoValue_DashboardSettingsConfig;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DashboardSettingsConfig {

    public static abstract class Builder {
        public abstract DashboardSettingsConfig build();

        public abstract Builder mTabs(List<DashboardSettingsTab> list);

        public abstract Builder mWalletTiles(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_DashboardSettingsConfig.Builder().mWalletTiles(AbstractC1233w.f11244s).mTabs(new ArrayList());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_DashboardSettingsConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("tabs")
    public abstract List<DashboardSettingsTab> mTabs();

    @InterfaceC1498b("wallet_tiles")
    public abstract List<String> mWalletTiles();

    public abstract Builder toBuilder();
}
