package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MFAConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MFAConfig<T extends MFAConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MFAConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public Remote_EnabledConfig mInstapayEnabledConfig() {
        return new Remote_EnabledConfig(this.mTarget.mInstapayEnabledConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "instapay_"));
    }

    public Remote_EnabledConfig mSendMoneyEnabledConfig() {
        return new Remote_EnabledConfig(this.mTarget.mSendMoneyEnabledConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "send_money_"));
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        mInstapayEnabledConfig().setDefaultRemoteConfig(map);
        mSendMoneyEnabledConfig().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        MFAConfig.Builder builder = this.mTarget.toBuilder();
        Remote_EnabledConfig remote_EnabledConfigMInstapayEnabledConfig = mInstapayEnabledConfig();
        remote_EnabledConfigMInstapayEnabledConfig.updateConfig();
        builder.mInstapayEnabledConfig(remote_EnabledConfigMInstapayEnabledConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMSendMoneyEnabledConfig = mSendMoneyEnabledConfig();
        remote_EnabledConfigMSendMoneyEnabledConfig.updateConfig();
        builder.mSendMoneyEnabledConfig(remote_EnabledConfigMSendMoneyEnabledConfig.mTarget);
        this.mTarget = (T) builder.build();
    }
}
