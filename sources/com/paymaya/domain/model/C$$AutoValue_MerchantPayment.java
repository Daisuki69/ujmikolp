package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.MerchantPayment;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MerchantPayment, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MerchantPayment extends MerchantPayment {
    private final Amount mAmount;
    private final Amount mAvailableBalance;
    private final Amount mCurrentBalance;
    private final String mMerchant;
    private final String mMerchantName;
    private final Amount mPaymentFees;
    private final String mPaymentToken;
    private final String mRedirectUrl;
    private final String mRequestReferenceNo;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MerchantPayment$Builder */
    public static class Builder extends MerchantPayment.Builder {
        private Amount mAmount;
        private Amount mAvailableBalance;
        private Amount mCurrentBalance;
        private String mMerchant;
        private String mMerchantName;
        private Amount mPaymentFees;
        private String mPaymentToken;
        private String mRedirectUrl;
        private String mRequestReferenceNo;

        public /* synthetic */ Builder(MerchantPayment merchantPayment, int i) {
            this(merchantPayment);
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment build() {
            String strI = this.mPaymentToken == null ? " mPaymentToken" : "";
            if (this.mPaymentFees == null) {
                strI = s.i(strI, " mPaymentFees");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MerchantPayment(this.mPaymentToken, this.mMerchant, this.mMerchantName, this.mAmount, this.mPaymentFees, this.mRequestReferenceNo, this.mRedirectUrl, this.mCurrentBalance, this.mAvailableBalance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mAmount(Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mAvailableBalance(Amount amount) {
            this.mAvailableBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mCurrentBalance(Amount amount) {
            this.mCurrentBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mMerchant(String str) {
            this.mMerchant = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mMerchantName(String str) {
            this.mMerchantName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mPaymentFees(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mPaymentFees");
            }
            this.mPaymentFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mPaymentToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null mPaymentToken");
            }
            this.mPaymentToken = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mRedirectUrl(String str) {
            this.mRedirectUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MerchantPayment.Builder
        public MerchantPayment.Builder mRequestReferenceNo(String str) {
            this.mRequestReferenceNo = str;
            return this;
        }

        public Builder() {
        }

        private Builder(MerchantPayment merchantPayment) {
            this.mPaymentToken = merchantPayment.mPaymentToken();
            this.mMerchant = merchantPayment.mMerchant();
            this.mMerchantName = merchantPayment.mMerchantName();
            this.mAmount = merchantPayment.mAmount();
            this.mPaymentFees = merchantPayment.mPaymentFees();
            this.mRequestReferenceNo = merchantPayment.mRequestReferenceNo();
            this.mRedirectUrl = merchantPayment.mRedirectUrl();
            this.mCurrentBalance = merchantPayment.mCurrentBalance();
            this.mAvailableBalance = merchantPayment.mAvailableBalance();
        }
    }

    public C$$AutoValue_MerchantPayment(String str, @Nullable String str2, @Nullable String str3, @Nullable Amount amount, Amount amount2, @Nullable String str4, @Nullable String str5, @Nullable Amount amount3, @Nullable Amount amount4) {
        if (str == null) {
            throw new NullPointerException("Null mPaymentToken");
        }
        this.mPaymentToken = str;
        this.mMerchant = str2;
        this.mMerchantName = str3;
        this.mAmount = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mPaymentFees");
        }
        this.mPaymentFees = amount2;
        this.mRequestReferenceNo = str4;
        this.mRedirectUrl = str5;
        this.mCurrentBalance = amount3;
        this.mAvailableBalance = amount4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Amount amount;
        String str3;
        String str4;
        Amount amount2;
        Amount amount3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MerchantPayment) {
            MerchantPayment merchantPayment = (MerchantPayment) obj;
            if (this.mPaymentToken.equals(merchantPayment.mPaymentToken()) && ((str = this.mMerchant) != null ? str.equals(merchantPayment.mMerchant()) : merchantPayment.mMerchant() == null) && ((str2 = this.mMerchantName) != null ? str2.equals(merchantPayment.mMerchantName()) : merchantPayment.mMerchantName() == null) && ((amount = this.mAmount) != null ? amount.equals(merchantPayment.mAmount()) : merchantPayment.mAmount() == null) && this.mPaymentFees.equals(merchantPayment.mPaymentFees()) && ((str3 = this.mRequestReferenceNo) != null ? str3.equals(merchantPayment.mRequestReferenceNo()) : merchantPayment.mRequestReferenceNo() == null) && ((str4 = this.mRedirectUrl) != null ? str4.equals(merchantPayment.mRedirectUrl()) : merchantPayment.mRedirectUrl() == null) && ((amount2 = this.mCurrentBalance) != null ? amount2.equals(merchantPayment.mCurrentBalance()) : merchantPayment.mCurrentBalance() == null) && ((amount3 = this.mAvailableBalance) != null ? amount3.equals(merchantPayment.mAvailableBalance()) : merchantPayment.mAvailableBalance() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mPaymentToken.hashCode() ^ 1000003) * 1000003;
        String str = this.mMerchant;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mMerchantName;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode4 = (((iHashCode3 ^ (amount == null ? 0 : amount.hashCode())) * 1000003) ^ this.mPaymentFees.hashCode()) * 1000003;
        String str3 = this.mRequestReferenceNo;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mRedirectUrl;
        int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Amount amount2 = this.mCurrentBalance;
        int iHashCode7 = (iHashCode6 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        Amount amount3 = this.mAvailableBalance;
        return iHashCode7 ^ (amount3 != null ? amount3.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    public Amount mAvailableBalance() {
        return this.mAvailableBalance;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    public Amount mCurrentBalance() {
        return this.mCurrentBalance;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    @InterfaceC1498b("value")
    public String mMerchant() {
        return this.mMerchant;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    @InterfaceC1498b("mername")
    public String mMerchantName() {
        return this.mMerchantName;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @InterfaceC1498b("fees")
    public Amount mPaymentFees() {
        return this.mPaymentFees;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mPaymentToken() {
        return this.mPaymentToken;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    @InterfaceC1498b("redirect_url")
    public String mRedirectUrl() {
        return this.mRedirectUrl;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    @Nullable
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.MerchantPayment
    public MerchantPayment.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "MerchantPayment{mPaymentToken=" + this.mPaymentToken + ", mMerchant=" + this.mMerchant + ", mMerchantName=" + this.mMerchantName + ", mAmount=" + this.mAmount + ", mPaymentFees=" + this.mPaymentFees + ", mRequestReferenceNo=" + this.mRequestReferenceNo + ", mRedirectUrl=" + this.mRedirectUrl + ", mCurrentBalance=" + this.mCurrentBalance + ", mAvailableBalance=" + this.mAvailableBalance + "}";
    }
}
