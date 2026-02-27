package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_SendMoneyConfig;
import com.paymaya.domain.model.C$AutoValue_SendMoneyConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SendMoneyConfig {

    public static abstract class Builder {
        public abstract SendMoneyConfig build();

        public abstract Builder mIsSmartMoneyEnabled(boolean z4);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_SendMoneyConfig.Builder().mIsSmartMoneyEnabled(false);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_SendMoneyConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("smart_money")
    public abstract boolean mIsSmartMoneyEnabled();

    public abstract Builder toBuilder();
}
