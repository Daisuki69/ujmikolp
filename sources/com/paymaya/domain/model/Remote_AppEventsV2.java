package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.AppEventsV2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_AppEventsV2<T extends AppEventsV2> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_AppEventsV2(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public Remote_EnabledConfig mBankTransferEnabled() {
        return new Remote_EnabledConfig(this.mTarget.mBankTransferEnabled(), s.p(new StringBuilder(), this.mAbsolutePath, "bank_transfer_"));
    }

    public Remote_EnabledConfig mCashInEnabled() {
        return new Remote_EnabledConfig(this.mTarget.mCashInEnabled(), s.p(new StringBuilder(), this.mAbsolutePath, "cash_in_"));
    }

    public Remote_EnabledConfig mSendMoneyEnabled() {
        return new Remote_EnabledConfig(this.mTarget.mSendMoneyEnabled(), s.p(new StringBuilder(), this.mAbsolutePath, "send_money_"));
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        mBankTransferEnabled().setDefaultRemoteConfig(map);
        mSendMoneyEnabled().setDefaultRemoteConfig(map);
        mCashInEnabled().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        AppEventsV2.Builder builder = this.mTarget.toBuilder();
        Remote_EnabledConfig remote_EnabledConfigMBankTransferEnabled = mBankTransferEnabled();
        remote_EnabledConfigMBankTransferEnabled.updateConfig();
        builder.mBankTransferEnabled(remote_EnabledConfigMBankTransferEnabled.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMSendMoneyEnabled = mSendMoneyEnabled();
        remote_EnabledConfigMSendMoneyEnabled.updateConfig();
        builder.mSendMoneyEnabled(remote_EnabledConfigMSendMoneyEnabled.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMCashInEnabled = mCashInEnabled();
        remote_EnabledConfigMCashInEnabled.updateConfig();
        builder.mCashInEnabled(remote_EnabledConfigMCashInEnabled.mTarget);
        this.mTarget = (T) builder.build();
    }
}
