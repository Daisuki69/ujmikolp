package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.ShopTransaction;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ShopTransaction extends ShopTransaction {
    private final String mProductId;
    private final String mProductType;
    private final long mPurchaseDate;
    private final String mUserNumber;

    public static final class Builder extends ShopTransaction.Builder {
        private String mProductId;
        private String mProductType;
        private Long mPurchaseDate;
        private String mUserNumber;

        public /* synthetic */ Builder(ShopTransaction shopTransaction, int i) {
            this(shopTransaction);
        }

        @Override // com.paymaya.domain.model.ShopTransaction.Builder
        public ShopTransaction build() {
            String strI = this.mUserNumber == null ? " mUserNumber" : "";
            if (this.mProductId == null) {
                strI = strI.concat(" mProductId");
            }
            if (this.mProductType == null) {
                strI = s.i(strI, " mProductType");
            }
            if (this.mPurchaseDate == null) {
                strI = s.i(strI, " mPurchaseDate");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ShopTransaction(this.mUserNumber, this.mProductId, this.mProductType, this.mPurchaseDate.longValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ShopTransaction.Builder
        public ShopTransaction.Builder mProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductId");
            }
            this.mProductId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopTransaction.Builder
        public ShopTransaction.Builder mProductType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductType");
            }
            this.mProductType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopTransaction.Builder
        public ShopTransaction.Builder mPurchaseDate(long j) {
            this.mPurchaseDate = Long.valueOf(j);
            return this;
        }

        @Override // com.paymaya.domain.model.ShopTransaction.Builder
        public ShopTransaction.Builder mUserNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mUserNumber");
            }
            this.mUserNumber = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ShopTransaction shopTransaction) {
            this.mUserNumber = shopTransaction.mUserNumber();
            this.mProductId = shopTransaction.mProductId();
            this.mProductType = shopTransaction.mProductType();
            this.mPurchaseDate = Long.valueOf(shopTransaction.mPurchaseDate());
        }
    }

    public /* synthetic */ AutoValue_ShopTransaction(String str, String str2, String str3, long j, int i) {
        this(str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShopTransaction) {
            ShopTransaction shopTransaction = (ShopTransaction) obj;
            if (this.mUserNumber.equals(shopTransaction.mUserNumber()) && this.mProductId.equals(shopTransaction.mProductId()) && this.mProductType.equals(shopTransaction.mProductType()) && this.mPurchaseDate == shopTransaction.mPurchaseDate()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mUserNumber.hashCode() ^ 1000003) * 1000003) ^ this.mProductId.hashCode()) * 1000003) ^ this.mProductType.hashCode()) * 1000003;
        long j = this.mPurchaseDate;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // com.paymaya.domain.model.ShopTransaction
    public String mProductId() {
        return this.mProductId;
    }

    @Override // com.paymaya.domain.model.ShopTransaction
    public String mProductType() {
        return this.mProductType;
    }

    @Override // com.paymaya.domain.model.ShopTransaction
    public long mPurchaseDate() {
        return this.mPurchaseDate;
    }

    @Override // com.paymaya.domain.model.ShopTransaction
    public String mUserNumber() {
        return this.mUserNumber;
    }

    @Override // com.paymaya.domain.model.ShopTransaction
    public ShopTransaction.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShopTransaction{mUserNumber=");
        sb2.append(this.mUserNumber);
        sb2.append(", mProductId=");
        sb2.append(this.mProductId);
        sb2.append(", mProductType=");
        sb2.append(this.mProductType);
        sb2.append(", mPurchaseDate=");
        return s.h(this.mPurchaseDate, "}", sb2);
    }

    private AutoValue_ShopTransaction(String str, String str2, String str3, long j) {
        this.mUserNumber = str;
        this.mProductId = str2;
        this.mProductType = str3;
        this.mPurchaseDate = j;
    }
}
