package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.BillsPayAccountNumberConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_BillsPayAccountNumberConfig<T extends BillsPayAccountNumberConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_BillsPayAccountNumberConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mIsShareEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "share_account_number");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "share_account_number"), Boolean.valueOf(this.mTarget.mIsShareEnabled()));
    }

    public void updateConfig() {
        BillsPayAccountNumberConfig.Builder builder = this.mTarget.toBuilder();
        builder.mIsShareEnabled(this.mRemoteConfig.c(mIsShareEnabled()));
        this.mTarget = (T) builder.build();
    }
}
