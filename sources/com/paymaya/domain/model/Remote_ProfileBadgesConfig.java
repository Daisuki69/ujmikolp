package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ProfileBadgesConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ProfileBadgesConfig<T extends ProfileBadgesConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ProfileBadgesConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "verified_seller"), this.mTarget.verifiedSellerLevelList().toString().substring(1, this.mTarget.verifiedSellerLevelList().toString().length() - 1));
    }

    public void updateConfig() {
        ProfileBadgesConfig.Builder builder = this.mTarget.toBuilder();
        builder.verifiedSellerLevelList(Arrays.asList(this.mRemoteConfig.g(verifiedSellerLevelList()).split("\\s*,\\s*")));
        this.mTarget = (T) builder.build();
    }

    public String verifiedSellerLevelList() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "verified_seller");
    }
}
