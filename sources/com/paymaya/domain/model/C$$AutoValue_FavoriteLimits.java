package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.FavoriteLimits;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteLimits, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FavoriteLimits extends FavoriteLimits {
    private final FavoriteCount mBankFavoriteCount;
    private final FavoriteCount mPayBillsFavoriteCount;
    private final FavoriteCount mSendMoneyFavoriteCount;
    private final FavoriteCount mShopFavoriteCount;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteLimits$Builder */
    public static class Builder extends FavoriteLimits.Builder {
        private FavoriteCount mBankFavoriteCount;
        private FavoriteCount mPayBillsFavoriteCount;
        private FavoriteCount mSendMoneyFavoriteCount;
        private FavoriteCount mShopFavoriteCount;

        public /* synthetic */ Builder(FavoriteLimits favoriteLimits, int i) {
            this(favoriteLimits);
        }

        @Override // com.paymaya.domain.model.FavoriteLimits.Builder
        public FavoriteLimits build() {
            return new AutoValue_FavoriteLimits(this.mBankFavoriteCount, this.mShopFavoriteCount, this.mPayBillsFavoriteCount, this.mSendMoneyFavoriteCount);
        }

        @Override // com.paymaya.domain.model.FavoriteLimits.Builder
        public FavoriteLimits.Builder mBankFavoriteCount(FavoriteCount favoriteCount) {
            this.mBankFavoriteCount = favoriteCount;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteLimits.Builder
        public FavoriteLimits.Builder mPayBillsFavoriteCount(FavoriteCount favoriteCount) {
            this.mPayBillsFavoriteCount = favoriteCount;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteLimits.Builder
        public FavoriteLimits.Builder mSendMoneyFavoriteCount(FavoriteCount favoriteCount) {
            this.mSendMoneyFavoriteCount = favoriteCount;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteLimits.Builder
        public FavoriteLimits.Builder mShopFavoriteCount(FavoriteCount favoriteCount) {
            this.mShopFavoriteCount = favoriteCount;
            return this;
        }

        public Builder() {
        }

        private Builder(FavoriteLimits favoriteLimits) {
            this.mBankFavoriteCount = favoriteLimits.mBankFavoriteCount();
            this.mShopFavoriteCount = favoriteLimits.mShopFavoriteCount();
            this.mPayBillsFavoriteCount = favoriteLimits.mPayBillsFavoriteCount();
            this.mSendMoneyFavoriteCount = favoriteLimits.mSendMoneyFavoriteCount();
        }
    }

    public C$$AutoValue_FavoriteLimits(@Nullable FavoriteCount favoriteCount, @Nullable FavoriteCount favoriteCount2, @Nullable FavoriteCount favoriteCount3, @Nullable FavoriteCount favoriteCount4) {
        this.mBankFavoriteCount = favoriteCount;
        this.mShopFavoriteCount = favoriteCount2;
        this.mPayBillsFavoriteCount = favoriteCount3;
        this.mSendMoneyFavoriteCount = favoriteCount4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FavoriteLimits) {
            FavoriteLimits favoriteLimits = (FavoriteLimits) obj;
            FavoriteCount favoriteCount = this.mBankFavoriteCount;
            if (favoriteCount != null ? favoriteCount.equals(favoriteLimits.mBankFavoriteCount()) : favoriteLimits.mBankFavoriteCount() == null) {
                FavoriteCount favoriteCount2 = this.mShopFavoriteCount;
                if (favoriteCount2 != null ? favoriteCount2.equals(favoriteLimits.mShopFavoriteCount()) : favoriteLimits.mShopFavoriteCount() == null) {
                    FavoriteCount favoriteCount3 = this.mPayBillsFavoriteCount;
                    if (favoriteCount3 != null ? favoriteCount3.equals(favoriteLimits.mPayBillsFavoriteCount()) : favoriteLimits.mPayBillsFavoriteCount() == null) {
                        FavoriteCount favoriteCount4 = this.mSendMoneyFavoriteCount;
                        if (favoriteCount4 != null ? favoriteCount4.equals(favoriteLimits.mSendMoneyFavoriteCount()) : favoriteLimits.mSendMoneyFavoriteCount() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        FavoriteCount favoriteCount = this.mBankFavoriteCount;
        int iHashCode = ((favoriteCount == null ? 0 : favoriteCount.hashCode()) ^ 1000003) * 1000003;
        FavoriteCount favoriteCount2 = this.mShopFavoriteCount;
        int iHashCode2 = (iHashCode ^ (favoriteCount2 == null ? 0 : favoriteCount2.hashCode())) * 1000003;
        FavoriteCount favoriteCount3 = this.mPayBillsFavoriteCount;
        int iHashCode3 = (iHashCode2 ^ (favoriteCount3 == null ? 0 : favoriteCount3.hashCode())) * 1000003;
        FavoriteCount favoriteCount4 = this.mSendMoneyFavoriteCount;
        return iHashCode3 ^ (favoriteCount4 != null ? favoriteCount4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.FavoriteLimits
    @Nullable
    @InterfaceC1498b("bank")
    public FavoriteCount mBankFavoriteCount() {
        return this.mBankFavoriteCount;
    }

    @Override // com.paymaya.domain.model.FavoriteLimits
    @Nullable
    @InterfaceC1498b("billspay")
    public FavoriteCount mPayBillsFavoriteCount() {
        return this.mPayBillsFavoriteCount;
    }

    @Override // com.paymaya.domain.model.FavoriteLimits
    @Nullable
    @InterfaceC1498b("moneysend")
    public FavoriteCount mSendMoneyFavoriteCount() {
        return this.mSendMoneyFavoriteCount;
    }

    @Override // com.paymaya.domain.model.FavoriteLimits
    @Nullable
    @InterfaceC1498b("shop")
    public FavoriteCount mShopFavoriteCount() {
        return this.mShopFavoriteCount;
    }

    @Override // com.paymaya.domain.model.FavoriteLimits
    public FavoriteLimits.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "FavoriteLimits{mBankFavoriteCount=" + this.mBankFavoriteCount + ", mShopFavoriteCount=" + this.mShopFavoriteCount + ", mPayBillsFavoriteCount=" + this.mPayBillsFavoriteCount + ", mSendMoneyFavoriteCount=" + this.mSendMoneyFavoriteCount + "}";
    }
}
