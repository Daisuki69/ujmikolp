package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ShopHome;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ShopHome<T extends ShopHome> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ShopHome(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mSections() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "sections");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "sections"), this.mTarget.mSections());
    }

    public void updateConfig() {
        ShopHome.Builder builder = this.mTarget.toBuilder();
        builder.mSections(this.mRemoteConfig.g(mSections()));
        this.mTarget = (T) builder.build();
    }
}
