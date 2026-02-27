package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaComplianceConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaComplianceConfig<T extends MayaComplianceConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaComplianceConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mDosri() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "dosri_android");
    }

    public String mFatca() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "fatca_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "fatca_android"), this.mTarget.mFatca());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "dosri_android"), this.mTarget.mDosri());
    }

    public void updateConfig() {
        MayaComplianceConfig.Builder builder = this.mTarget.toBuilder();
        builder.mFatca(Boolean.valueOf(this.mRemoteConfig.c(mFatca())));
        builder.mDosri(Boolean.valueOf(this.mRemoteConfig.c(mDosri())));
        this.mTarget = (T) builder.build();
    }
}
