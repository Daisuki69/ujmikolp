package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ShopPurchaseHistoryPushNotification;
import com.paymaya.domain.model.C$AutoValue_ShopPurchaseHistoryPushNotification;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopPurchaseHistoryPushNotification implements PushNotification {

    public static abstract class Builder {
        public abstract ShopPurchaseHistoryPushNotification build();

        public abstract Builder mOrderId(String str);

        public abstract Builder mPaymentId(String str);

        public abstract Builder mProductId(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ShopPurchaseHistoryPushNotification.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ShopPurchaseHistoryPushNotification.GsonTypeAdapter(jVar);
    }

    public abstract String mOrderId();

    public abstract String mPaymentId();

    public abstract String mProductId();

    public abstract String mStatus();

    public abstract String mType();

    public abstract Builder toBuilder();
}
