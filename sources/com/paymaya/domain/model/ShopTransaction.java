package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_ShopTransaction;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopTransaction {

    public static abstract class Builder {
        public abstract ShopTransaction build();

        public abstract Builder mProductId(String str);

        public abstract Builder mProductType(String str);

        public abstract Builder mPurchaseDate(long j);

        public abstract Builder mUserNumber(String str);
    }

    public static Builder sBuilder() {
        return new AutoValue_ShopTransaction.Builder().mPurchaseDate(0L);
    }

    public abstract String mProductId();

    public abstract String mProductType();

    public abstract long mPurchaseDate();

    public abstract String mUserNumber();

    public abstract Builder toBuilder();
}
