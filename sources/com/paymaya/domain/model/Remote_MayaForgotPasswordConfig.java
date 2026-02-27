package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaForgotPasswordConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaForgotPasswordConfig<T extends MayaForgotPasswordConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaForgotPasswordConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mFrameworkV2Android() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "framework_v2_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "framework_v2_android"), this.mTarget.mFrameworkV2Android());
    }

    public void updateConfig() {
        MayaForgotPasswordConfig.Builder builder = this.mTarget.toBuilder();
        builder.mFrameworkV2Android(Boolean.valueOf(this.mRemoteConfig.c(mFrameworkV2Android())));
        this.mTarget = (T) builder.build();
    }
}
