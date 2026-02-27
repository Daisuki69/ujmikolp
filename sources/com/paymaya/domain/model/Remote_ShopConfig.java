package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ShopConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ShopConfig<T extends ShopConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ShopConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mDefaultCategory() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "default_category");
    }

    public String mDefaultProductTypes() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "default_product_types");
    }

    public Remote_ShopHome mHome() {
        return new Remote_ShopHome(this.mTarget.mHome(), s.p(new StringBuilder(), this.mAbsolutePath, "home_"));
    }

    public String mTreatsNetworks() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "treats_networks");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "default_category"), this.mTarget.mDefaultCategory());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "default_product_types"), this.mTarget.mDefaultProductTypes().toString().substring(1, this.mTarget.mDefaultProductTypes().toString().length() - 1));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "treats_networks"), this.mTarget.mTreatsNetworks().toString().substring(1, this.mTarget.mTreatsNetworks().toString().length() - 1));
        mHome().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        ShopConfig.Builder builder = this.mTarget.toBuilder();
        builder.mDefaultCategory(this.mRemoteConfig.g(mDefaultCategory()));
        builder.mDefaultProductTypes(Arrays.asList(this.mRemoteConfig.g(mDefaultProductTypes()).split("\\s*,\\s*")));
        builder.mTreatsNetworks(Arrays.asList(this.mRemoteConfig.g(mTreatsNetworks()).split("\\s*,\\s*")));
        Remote_ShopHome remote_ShopHomeMHome = mHome();
        remote_ShopHomeMHome.updateConfig();
        builder.mHome(remote_ShopHomeMHome.mTarget);
        this.mTarget = (T) builder.build();
    }
}
