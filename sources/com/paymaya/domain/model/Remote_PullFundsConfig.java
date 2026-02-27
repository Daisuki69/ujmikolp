package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.PullFundsConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_PullFundsConfig<T extends PullFundsConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_PullFundsConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public Remote_PullFundsPartner mBPIPullFundsPartner() {
        return new Remote_PullFundsPartner(this.mTarget.mBPIPullFundsPartner(), s.p(new StringBuilder(), this.mAbsolutePath, "bpi_"));
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        mBPIPullFundsPartner().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        PullFundsConfig.Builder builder = this.mTarget.toBuilder();
        Remote_PullFundsPartner remote_PullFundsPartnerMBPIPullFundsPartner = mBPIPullFundsPartner();
        remote_PullFundsPartnerMBPIPullFundsPartner.updateConfig();
        builder.mBPIPullFundsPartner(remote_PullFundsPartnerMBPIPullFundsPartner.mTarget);
        this.mTarget = (T) builder.build();
    }
}
