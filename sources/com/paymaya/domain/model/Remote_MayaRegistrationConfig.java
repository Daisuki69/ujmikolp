package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaRegistrationConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaRegistrationConfig<T extends MayaRegistrationConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaRegistrationConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mAutoProvision() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "auto_provision_android");
    }

    public String mConsentCheckAll() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "consent_check_all");
    }

    public String mRequireMiddleName() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "require_middle_name_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "consent_check_all"), this.mTarget.mConsentCheckAll());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "require_middle_name_android"), this.mTarget.mRequireMiddleName());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "auto_provision_android"), this.mTarget.mAutoProvision());
    }

    public void updateConfig() {
        MayaRegistrationConfig.Builder builder = this.mTarget.toBuilder();
        builder.mConsentCheckAll(Boolean.valueOf(this.mRemoteConfig.c(mConsentCheckAll())));
        builder.mRequireMiddleName(Boolean.valueOf(this.mRemoteConfig.c(mRequireMiddleName())));
        builder.mAutoProvision(Boolean.valueOf(this.mRemoteConfig.c(mAutoProvision())));
        this.mTarget = (T) builder.build();
    }
}
