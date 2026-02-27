package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.PayId;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PayId, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PayId extends PayId {
    private final BigDecimal mAmount;
    private final String mExpiryDate;
    private final String mFee;
    private final String mMerchantRef;
    private final String mOriginalAmount;
    private final String mSevenConnectId;
    private final String mTotalAmount;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PayId$Builder */
    public static class Builder extends PayId.Builder {
        private BigDecimal mAmount;
        private String mExpiryDate;
        private String mFee;
        private String mMerchantRef;
        private String mOriginalAmount;
        private String mSevenConnectId;
        private String mTotalAmount;

        public /* synthetic */ Builder(PayId payId, int i) {
            this(payId);
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId build() {
            String strI = this.mExpiryDate == null ? " mExpiryDate" : "";
            if (this.mSevenConnectId == null) {
                strI = s.i(strI, " mSevenConnectId");
            }
            if (this.mMerchantRef == null) {
                strI = s.i(strI, " mMerchantRef");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PayId(this.mExpiryDate, this.mSevenConnectId, this.mMerchantRef, this.mAmount, this.mTotalAmount, this.mFee, this.mOriginalAmount);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mAmount(BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = bigDecimal;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mExpiryDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mExpiryDate");
            }
            this.mExpiryDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mFee(String str) {
            this.mFee = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mMerchantRef(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMerchantRef");
            }
            this.mMerchantRef = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mOriginalAmount(String str) {
            this.mOriginalAmount = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mSevenConnectId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSevenConnectId");
            }
            this.mSevenConnectId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayId.Builder
        public PayId.Builder mTotalAmount(String str) {
            this.mTotalAmount = str;
            return this;
        }

        public Builder() {
        }

        private Builder(PayId payId) {
            this.mExpiryDate = payId.mExpiryDate();
            this.mSevenConnectId = payId.mSevenConnectId();
            this.mMerchantRef = payId.mMerchantRef();
            this.mAmount = payId.mAmount();
            this.mTotalAmount = payId.mTotalAmount();
            this.mFee = payId.mFee();
            this.mOriginalAmount = payId.mOriginalAmount();
        }
    }

    public C$$AutoValue_PayId(String str, String str2, String str3, BigDecimal bigDecimal, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        if (str == null) {
            throw new NullPointerException("Null mExpiryDate");
        }
        this.mExpiryDate = str;
        if (str2 == null) {
            throw new NullPointerException("Null mSevenConnectId");
        }
        this.mSevenConnectId = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mMerchantRef");
        }
        this.mMerchantRef = str3;
        if (bigDecimal == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = bigDecimal;
        this.mTotalAmount = str4;
        this.mFee = str5;
        this.mOriginalAmount = str6;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PayId) {
            PayId payId = (PayId) obj;
            if (this.mExpiryDate.equals(payId.mExpiryDate()) && this.mSevenConnectId.equals(payId.mSevenConnectId()) && this.mMerchantRef.equals(payId.mMerchantRef()) && this.mAmount.equals(payId.mAmount()) && ((str = this.mTotalAmount) != null ? str.equals(payId.mTotalAmount()) : payId.mTotalAmount() == null) && ((str2 = this.mFee) != null ? str2.equals(payId.mFee()) : payId.mFee() == null) && ((str3 = this.mOriginalAmount) != null ? str3.equals(payId.mOriginalAmount()) : payId.mOriginalAmount() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.mExpiryDate.hashCode() ^ 1000003) * 1000003) ^ this.mSevenConnectId.hashCode()) * 1000003) ^ this.mMerchantRef.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        String str = this.mTotalAmount;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mFee;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mOriginalAmount;
        return iHashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.PayId
    @InterfaceC1498b("amount")
    public BigDecimal mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.PayId
    @InterfaceC1498b("expiry_date")
    public String mExpiryDate() {
        return this.mExpiryDate;
    }

    @Override // com.paymaya.domain.model.PayId
    @Nullable
    @InterfaceC1498b("fee")
    public String mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.PayId
    @InterfaceC1498b("merchant_ref")
    public String mMerchantRef() {
        return this.mMerchantRef;
    }

    @Override // com.paymaya.domain.model.PayId
    @Nullable
    @InterfaceC1498b("original_amount")
    public String mOriginalAmount() {
        return this.mOriginalAmount;
    }

    @Override // com.paymaya.domain.model.PayId
    @InterfaceC1498b("seven_connect_id")
    public String mSevenConnectId() {
        return this.mSevenConnectId;
    }

    @Override // com.paymaya.domain.model.PayId
    @Nullable
    @InterfaceC1498b("total_amount")
    public String mTotalAmount() {
        return this.mTotalAmount;
    }

    @Override // com.paymaya.domain.model.PayId
    public PayId.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PayId{mExpiryDate=");
        sb2.append(this.mExpiryDate);
        sb2.append(", mSevenConnectId=");
        sb2.append(this.mSevenConnectId);
        sb2.append(", mMerchantRef=");
        sb2.append(this.mMerchantRef);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mTotalAmount=");
        sb2.append(this.mTotalAmount);
        sb2.append(", mFee=");
        sb2.append(this.mFee);
        sb2.append(", mOriginalAmount=");
        return s.p(sb2, this.mOriginalAmount, "}");
    }
}
