package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.UserProfileConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_UserProfileConfig<T extends UserProfileConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_UserProfileConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mIsUserProfileUpdateEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "update_v1_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "update_v1_android"), this.mTarget.mIsUserProfileUpdateEnabled());
    }

    public void updateConfig() {
        UserProfileConfig.Builder builder = this.mTarget.toBuilder();
        builder.mIsUserProfileUpdateEnabled(Boolean.valueOf(this.mRemoteConfig.c(mIsUserProfileUpdateEnabled())));
        this.mTarget = (T) builder.build();
    }
}
