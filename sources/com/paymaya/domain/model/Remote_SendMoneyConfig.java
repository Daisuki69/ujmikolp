package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.SendMoneyConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_SendMoneyConfig<T extends SendMoneyConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_SendMoneyConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mIsSmartMoneyEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "smart_money");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "smart_money"), Boolean.valueOf(this.mTarget.mIsSmartMoneyEnabled()));
    }

    public void updateConfig() {
        SendMoneyConfig.Builder builder = this.mTarget.toBuilder();
        builder.mIsSmartMoneyEnabled(this.mRemoteConfig.c(mIsSmartMoneyEnabled()));
        this.mTarget = (T) builder.build();
    }
}
