package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ProfileBadgesConfig;
import com.paymaya.domain.model.C$AutoValue_ProfileBadgesConfig;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProfileBadgesConfig {

    public static abstract class Builder {
        public abstract ProfileBadgesConfig build();

        public abstract Builder verifiedSellerLevelList(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ProfileBadgesConfig.Builder().verifiedSellerLevelList(new ArrayList());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ProfileBadgesConfig.GsonTypeAdapter(jVar);
    }

    public abstract Builder toBuilder();

    @InterfaceC1498b("verified_seller")
    public abstract List<String> verifiedSellerLevelList();
}
