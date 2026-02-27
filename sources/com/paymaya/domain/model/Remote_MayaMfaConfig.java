package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaMfaConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaMfaConfig<T extends MayaMfaConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaMfaConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mFaceAuthFormAndroid() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "face_auth_form_android");
    }

    public String mFrameworkV1Android() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "framework_v1_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "framework_v1_android"), this.mTarget.mFrameworkV1Android());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "face_auth_form_android"), this.mTarget.mFaceAuthFormAndroid());
    }

    public void updateConfig() {
        MayaMfaConfig.Builder builder = this.mTarget.toBuilder();
        builder.mFrameworkV1Android(Boolean.valueOf(this.mRemoteConfig.c(mFrameworkV1Android())));
        builder.mFaceAuthFormAndroid(Boolean.valueOf(this.mRemoteConfig.c(mFaceAuthFormAndroid())));
        this.mTarget = (T) builder.build();
    }
}
