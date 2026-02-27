package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.InAppReviewConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_InAppReviewConfig<T extends InAppReviewConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_InAppReviewConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mBillsPay() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay");
    }

    public String mDefault() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "default");
    }

    public String mPurchaseHistory() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "purchase_history");
    }

    public String mQrPayment() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "qr_payment");
    }

    public String mSendMoney() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "send_money");
    }

    public String mShopPurchase() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop_purchase");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "default"), this.mTarget.mDefault());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "send_money"), this.mTarget.mSendMoney());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay"), this.mTarget.mBillsPay());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "qr_payment"), this.mTarget.mQrPayment());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop_purchase"), this.mTarget.mShopPurchase());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "purchase_history"), this.mTarget.mPurchaseHistory());
    }

    public void updateConfig() {
        InAppReviewConfig.Builder builder = this.mTarget.toBuilder();
        builder.mDefault(Boolean.valueOf(this.mRemoteConfig.c(mDefault())));
        builder.mSendMoney(Boolean.valueOf(this.mRemoteConfig.c(mSendMoney())));
        builder.mBillsPay(Boolean.valueOf(this.mRemoteConfig.c(mBillsPay())));
        builder.mQrPayment(Boolean.valueOf(this.mRemoteConfig.c(mQrPayment())));
        builder.mShopPurchase(Boolean.valueOf(this.mRemoteConfig.c(mShopPurchase())));
        builder.mPurchaseHistory(Boolean.valueOf(this.mRemoteConfig.c(mPurchaseHistory())));
        this.mTarget = (T) builder.build();
    }
}
