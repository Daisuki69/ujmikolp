package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.PullFundsPartner;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_PullFundsPartner<T extends PullFundsPartner> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_PullFundsPartner(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mCurrency() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "currency");
    }

    public String mIsEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED);
    }

    public String mLimitMax() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "limit_max");
    }

    public String mLimitMin() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "limit_min");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED), Boolean.valueOf(this.mTarget.mIsEnabled()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "currency"), this.mTarget.mCurrency());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "limit_min"), Integer.valueOf(this.mTarget.mLimitMin()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "limit_max"), Integer.valueOf(this.mTarget.mLimitMax()));
    }

    public void updateConfig() {
        PullFundsPartner.Builder builder = this.mTarget.toBuilder();
        builder.mIsEnabled(this.mRemoteConfig.c(mIsEnabled()));
        builder.mCurrency(this.mRemoteConfig.g(mCurrency()));
        builder.mLimitMin((int) this.mRemoteConfig.d(mLimitMin()));
        builder.mLimitMax((int) this.mRemoteConfig.d(mLimitMax()));
        this.mTarget = (T) builder.build();
    }
}
