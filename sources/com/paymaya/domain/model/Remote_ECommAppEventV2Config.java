package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ECommAppEventV2Config;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ECommAppEventV2Config<T extends ECommAppEventV2Config> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ECommAppEventV2Config(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mBillsPay() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay");
    }

    public String mQR() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "qr");
    }

    public String mShop() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "qr"), this.mTarget.mQR());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop"), this.mTarget.mShop());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay"), this.mTarget.mBillsPay());
    }

    public void updateConfig() {
        ECommAppEventV2Config.Builder builder = this.mTarget.toBuilder();
        builder.mQR(Boolean.valueOf(this.mRemoteConfig.c(mQR())));
        builder.mShop(Boolean.valueOf(this.mRemoteConfig.c(mShop())));
        builder.mBillsPay(Boolean.valueOf(this.mRemoteConfig.c(mBillsPay())));
        this.mTarget = (T) builder.build();
    }
}
