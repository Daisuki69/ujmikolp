package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.EnabledConfig;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_EnabledConfig<T extends EnabledConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_EnabledConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mIsEnabled() {
        return s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED);
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, Constants.ENABLED), Boolean.valueOf(this.mTarget.mIsEnabled()));
    }

    public void updateConfig() {
        EnabledConfig.Builder builder = this.mTarget.toBuilder();
        builder.mIsEnabled(this.mRemoteConfig.c(mIsEnabled()));
        this.mTarget = (T) builder.build();
    }
}
