package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.MoneyInTopUpCode;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MoneyInTopUpCode, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MoneyInTopUpCode extends MoneyInTopUpCode {
    private final Amount mAmount;
    private final String mCode;
    private final String mExpiryDate;
    private final Amount mFee;
    private final Amount mOriginalAmount;
    private final Amount mTotalAmount;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MoneyInTopUpCode$Builder */
    public static class Builder extends MoneyInTopUpCode.Builder {
        private Amount mAmount;
        private String mCode;
        private String mExpiryDate;
        private Amount mFee;
        private Amount mOriginalAmount;
        private Amount mTotalAmount;

        public /* synthetic */ Builder(MoneyInTopUpCode moneyInTopUpCode, int i) {
            this(moneyInTopUpCode);
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode build() {
            String strI = this.mExpiryDate == null ? " mExpiryDate" : "";
            if (this.mCode == null) {
                strI = s.i(strI, " mCode");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MoneyInTopUpCode(this.mExpiryDate, this.mCode, this.mAmount, this.mFee, this.mTotalAmount, this.mOriginalAmount);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCode");
            }
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mExpiryDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mExpiryDate");
            }
            this.mExpiryDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mFee(Amount amount) {
            this.mFee = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mOriginalAmount(Amount amount) {
            this.mOriginalAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInTopUpCode.Builder
        public MoneyInTopUpCode.Builder mTotalAmount(Amount amount) {
            this.mTotalAmount = amount;
            return this;
        }

        public Builder() {
        }

        private Builder(MoneyInTopUpCode moneyInTopUpCode) {
            this.mExpiryDate = moneyInTopUpCode.mExpiryDate();
            this.mCode = moneyInTopUpCode.mCode();
            this.mAmount = moneyInTopUpCode.mAmount();
            this.mFee = moneyInTopUpCode.mFee();
            this.mTotalAmount = moneyInTopUpCode.mTotalAmount();
            this.mOriginalAmount = moneyInTopUpCode.mOriginalAmount();
        }
    }

    public C$$AutoValue_MoneyInTopUpCode(String str, String str2, Amount amount, @Nullable Amount amount2, @Nullable Amount amount3, @Nullable Amount amount4) {
        if (str == null) {
            throw new NullPointerException("Null mExpiryDate");
        }
        this.mExpiryDate = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCode");
        }
        this.mCode = str2;
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        this.mFee = amount2;
        this.mTotalAmount = amount3;
        this.mOriginalAmount = amount4;
    }

    public boolean equals(Object obj) {
        Amount amount;
        Amount amount2;
        Amount amount3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MoneyInTopUpCode) {
            MoneyInTopUpCode moneyInTopUpCode = (MoneyInTopUpCode) obj;
            if (this.mExpiryDate.equals(moneyInTopUpCode.mExpiryDate()) && this.mCode.equals(moneyInTopUpCode.mCode()) && this.mAmount.equals(moneyInTopUpCode.mAmount()) && ((amount = this.mFee) != null ? amount.equals(moneyInTopUpCode.mFee()) : moneyInTopUpCode.mFee() == null) && ((amount2 = this.mTotalAmount) != null ? amount2.equals(moneyInTopUpCode.mTotalAmount()) : moneyInTopUpCode.mTotalAmount() == null) && ((amount3 = this.mOriginalAmount) != null ? amount3.equals(moneyInTopUpCode.mOriginalAmount()) : moneyInTopUpCode.mOriginalAmount() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mExpiryDate.hashCode() ^ 1000003) * 1000003) ^ this.mCode.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        Amount amount = this.mFee;
        int iHashCode2 = (iHashCode ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        Amount amount2 = this.mTotalAmount;
        int iHashCode3 = (iHashCode2 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        Amount amount3 = this.mOriginalAmount;
        return iHashCode3 ^ (amount3 != null ? amount3.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @InterfaceC1498b("expiry_date")
    public String mExpiryDate() {
        return this.mExpiryDate;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @Nullable
    @InterfaceC1498b("fee")
    public Amount mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @Nullable
    @InterfaceC1498b("original_amount")
    public Amount mOriginalAmount() {
        return this.mOriginalAmount;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    @Nullable
    @InterfaceC1498b("total_amount")
    public Amount mTotalAmount() {
        return this.mTotalAmount;
    }

    @Override // com.paymaya.domain.model.MoneyInTopUpCode
    public MoneyInTopUpCode.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "MoneyInTopUpCode{mExpiryDate=" + this.mExpiryDate + ", mCode=" + this.mCode + ", mAmount=" + this.mAmount + ", mFee=" + this.mFee + ", mTotalAmount=" + this.mTotalAmount + ", mOriginalAmount=" + this.mOriginalAmount + "}";
    }
}
