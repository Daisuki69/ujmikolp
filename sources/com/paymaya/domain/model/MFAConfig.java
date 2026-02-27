package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MFAConfig;
import com.paymaya.domain.model.C$AutoValue_MFAConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MFAConfig {

    public static abstract class Builder {
        public abstract MFAConfig build();

        public abstract Builder mInstapayEnabledConfig(EnabledConfig enabledConfig);

        public abstract Builder mSendMoneyEnabledConfig(EnabledConfig enabledConfig);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_MFAConfig.Builder().mInstapayEnabledConfig(EnabledConfig.sBuilder().build()).mSendMoneyEnabledConfig(EnabledConfig.sBuilder().build());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_MFAConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("instapay")
    public abstract EnabledConfig mInstapayEnabledConfig();

    @InterfaceC1498b("send_money")
    public abstract EnabledConfig mSendMoneyEnabledConfig();

    public abstract Builder toBuilder();
}
