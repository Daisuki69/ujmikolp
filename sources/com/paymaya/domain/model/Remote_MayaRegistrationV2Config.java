package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaRegistrationV2Config;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaRegistrationV2Config<T extends MayaRegistrationV2Config> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaRegistrationV2Config(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mShortenedReg() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_reg_android");
    }

    public String mShowDataPrivacyOnAppLaunch() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "show_data_privacy_on_app_launch_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "show_data_privacy_on_app_launch_android"), this.mTarget.mShowDataPrivacyOnAppLaunch());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_reg_android"), this.mTarget.mShortenedReg());
    }

    public void updateConfig() {
        MayaRegistrationV2Config.Builder builder = this.mTarget.toBuilder();
        builder.mShowDataPrivacyOnAppLaunch(Boolean.valueOf(this.mRemoteConfig.c(mShowDataPrivacyOnAppLaunch())));
        builder.mShortenedReg(Boolean.valueOf(this.mRemoteConfig.c(mShortenedReg())));
        this.mTarget = (T) builder.build();
    }
}
