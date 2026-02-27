package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FavoriteLimits;
import com.paymaya.domain.model.C$AutoValue_FavoriteLimits;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FavoriteLimits implements Parcelable {

    public static abstract class Builder {
        public abstract FavoriteLimits build();

        public abstract Builder mBankFavoriteCount(FavoriteCount favoriteCount);

        public abstract Builder mPayBillsFavoriteCount(FavoriteCount favoriteCount);

        public abstract Builder mSendMoneyFavoriteCount(FavoriteCount favoriteCount);

        public abstract Builder mShopFavoriteCount(FavoriteCount favoriteCount);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FavoriteLimits.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FavoriteLimits.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("bank")
    public abstract FavoriteCount mBankFavoriteCount();

    @Nullable
    @InterfaceC1498b("billspay")
    public abstract FavoriteCount mPayBillsFavoriteCount();

    @Nullable
    @InterfaceC1498b("moneysend")
    public abstract FavoriteCount mSendMoneyFavoriteCount();

    @Nullable
    @InterfaceC1498b("shop")
    public abstract FavoriteCount mShopFavoriteCount();

    public abstract Builder toBuilder();
}
