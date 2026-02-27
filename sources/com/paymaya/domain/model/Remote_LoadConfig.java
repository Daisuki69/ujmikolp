package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.LoadConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_LoadConfig<T extends LoadConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_LoadConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mFavorites() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "favorites");
    }

    public String mRecommender() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "recommender");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "favorites"), this.mTarget.mFavorites());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "recommender"), this.mTarget.mRecommender());
    }

    public void updateConfig() {
        LoadConfig.Builder builder = this.mTarget.toBuilder();
        builder.mFavorites(Boolean.valueOf(this.mRemoteConfig.c(mFavorites())));
        builder.mRecommender(Boolean.valueOf(this.mRemoteConfig.c(mRecommender())));
        this.mTarget = (T) builder.build();
    }
}
