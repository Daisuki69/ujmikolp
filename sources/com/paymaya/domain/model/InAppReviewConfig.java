package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_InAppReviewConfig;
import com.paymaya.domain.model.C$AutoValue_InAppReviewConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InAppReviewConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract InAppReviewConfig build();

        public abstract Builder mBillsPay(Boolean bool);

        public abstract Builder mDefault(Boolean bool);

        public abstract Builder mPurchaseHistory(Boolean bool);

        public abstract Builder mQrPayment(Boolean bool);

        public abstract Builder mSendMoney(Boolean bool);

        public abstract Builder mShopPurchase(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_InAppReviewConfig.Builder builder = new C$AutoValue_InAppReviewConfig.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mDefault(bool).mSendMoney(bool).mBillsPay(bool).mQrPayment(bool).mShopPurchase(bool).mPurchaseHistory(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_InAppReviewConfig.GsonTypeAdapter(jVar);
        }

        private Companion() {
        }
    }

    public static final Builder sBuilder() {
        return Companion.sBuilder();
    }

    public static final y typeAdapter(j jVar) {
        return Companion.typeAdapter(jVar);
    }

    @InterfaceC1498b("bills_pay")
    public abstract Boolean mBillsPay();

    @InterfaceC1498b("default")
    public abstract Boolean mDefault();

    @InterfaceC1498b("purchase_history")
    public abstract Boolean mPurchaseHistory();

    @InterfaceC1498b("qr_payment")
    public abstract Boolean mQrPayment();

    @InterfaceC1498b("send_money")
    public abstract Boolean mSendMoney();

    @InterfaceC1498b("shop_purchase")
    public abstract Boolean mShopPurchase();

    public abstract Builder toBuilder();
}
