package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.MoneyInCode;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MoneyInCode, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MoneyInCode extends MoneyInCode {
    private final BigDecimal mAmount;
    private final String mCode;
    private final String mExpiryDate;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MoneyInCode$Builder */
    public static class Builder extends MoneyInCode.Builder {
        private BigDecimal mAmount;
        private String mCode;
        private String mExpiryDate;

        public /* synthetic */ Builder(MoneyInCode moneyInCode, int i) {
            this(moneyInCode);
        }

        @Override // com.paymaya.domain.model.MoneyInCode.Builder
        public MoneyInCode build() {
            String strI = this.mExpiryDate == null ? " mExpiryDate" : "";
            if (this.mCode == null) {
                strI = s.i(strI, " mCode");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MoneyInCode(this.mExpiryDate, this.mCode, this.mAmount);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MoneyInCode.Builder
        public MoneyInCode.Builder mAmount(BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = bigDecimal;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInCode.Builder
        public MoneyInCode.Builder mCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCode");
            }
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MoneyInCode.Builder
        public MoneyInCode.Builder mExpiryDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mExpiryDate");
            }
            this.mExpiryDate = str;
            return this;
        }

        public Builder() {
        }

        private Builder(MoneyInCode moneyInCode) {
            this.mExpiryDate = moneyInCode.mExpiryDate();
            this.mCode = moneyInCode.mCode();
            this.mAmount = moneyInCode.mAmount();
        }
    }

    public C$$AutoValue_MoneyInCode(String str, String str2, BigDecimal bigDecimal) {
        if (str == null) {
            throw new NullPointerException("Null mExpiryDate");
        }
        this.mExpiryDate = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCode");
        }
        this.mCode = str2;
        if (bigDecimal == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = bigDecimal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MoneyInCode) {
            MoneyInCode moneyInCode = (MoneyInCode) obj;
            if (this.mExpiryDate.equals(moneyInCode.mExpiryDate()) && this.mCode.equals(moneyInCode.mCode()) && this.mAmount.equals(moneyInCode.mAmount())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mExpiryDate.hashCode() ^ 1000003) * 1000003) ^ this.mCode.hashCode()) * 1000003) ^ this.mAmount.hashCode();
    }

    @Override // com.paymaya.domain.model.MoneyInCode
    @InterfaceC1498b("amount")
    public BigDecimal mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.MoneyInCode
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.MoneyInCode
    @InterfaceC1498b("expiry_date")
    public String mExpiryDate() {
        return this.mExpiryDate;
    }

    @Override // com.paymaya.domain.model.MoneyInCode
    public MoneyInCode.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "MoneyInCode{mExpiryDate=" + this.mExpiryDate + ", mCode=" + this.mCode + ", mAmount=" + this.mAmount + "}";
    }
}
