package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.FreelancerHubConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_FreelancerHubConfig<T extends FreelancerHubConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_FreelancerHubConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "enabled_non_production_only");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "enabled_non_production_only"), this.mTarget.mEnabled());
    }

    public void updateConfig() {
        FreelancerHubConfig.Builder builder = this.mTarget.toBuilder();
        builder.mEnabled(Boolean.valueOf(this.mRemoteConfig.c(mEnabled())));
        this.mTarget = (T) builder.build();
    }
}
