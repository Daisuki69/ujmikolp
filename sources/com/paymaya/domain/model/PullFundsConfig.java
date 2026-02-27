package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_PullFundsConfig;
import com.paymaya.domain.model.C$AutoValue_PullFundsConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PullFundsConfig {

    public static abstract class Builder {
        public abstract PullFundsConfig build();

        public abstract Builder mBPIPullFundsPartner(PullFundsPartner pullFundsPartner);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_PullFundsConfig.Builder().mBPIPullFundsPartner(PullFundsPartner.sBuilder().build());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_PullFundsConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("bpi")
    public abstract PullFundsPartner mBPIPullFundsPartner();

    public abstract Builder toBuilder();
}
