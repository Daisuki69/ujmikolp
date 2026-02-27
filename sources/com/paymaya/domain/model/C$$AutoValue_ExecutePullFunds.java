package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.ExecutePullFunds;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ExecutePullFunds, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ExecutePullFunds extends ExecutePullFunds {
    private final Amount mAmount;
    private final PullFundsCard mCard;
    private final Amount mFees;
    private final boolean mIsPaid;
    private final String mPaymentId;
    private final String mPurchaseId;
    private final RedirectUrls mRedirectUrls;
    private final String mRequestReferenceNo;
    private final String mStatus;
    private final String mVerificationUrl;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ExecutePullFunds$Builder */
    public static class Builder extends ExecutePullFunds.Builder {
        private Amount mAmount;
        private PullFundsCard mCard;
        private Amount mFees;
        private Boolean mIsPaid;
        private String mPaymentId;
        private String mPurchaseId;
        private RedirectUrls mRedirectUrls;
        private String mRequestReferenceNo;
        private String mStatus;
        private String mVerificationUrl;

        public /* synthetic */ Builder(ExecutePullFunds executePullFunds, int i) {
            this(executePullFunds);
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds build() {
            String strI = this.mAmount == null ? " mAmount" : "";
            if (this.mFees == null) {
                strI = s.i(strI, " mFees");
            }
            if (this.mPurchaseId == null) {
                strI = s.i(strI, " mPurchaseId");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (this.mIsPaid == null) {
                strI = s.i(strI, " mIsPaid");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ExecutePullFunds(this.mAmount, this.mFees, this.mCard, this.mPurchaseId, this.mPaymentId, this.mRequestReferenceNo, this.mStatus, this.mIsPaid.booleanValue(), this.mVerificationUrl, this.mRedirectUrls);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mCard(PullFundsCard pullFundsCard) {
            this.mCard = pullFundsCard;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mFees(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mFees");
            }
            this.mFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mIsPaid(boolean z4) {
            this.mIsPaid = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mPaymentId(String str) {
            this.mPaymentId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mPurchaseId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mPurchaseId");
            }
            this.mPurchaseId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mRedirectUrls(RedirectUrls redirectUrls) {
            this.mRedirectUrls = redirectUrls;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mRequestReferenceNo(String str) {
            this.mRequestReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ExecutePullFunds.Builder
        public ExecutePullFunds.Builder mVerificationUrl(String str) {
            this.mVerificationUrl = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ExecutePullFunds executePullFunds) {
            this.mAmount = executePullFunds.mAmount();
            this.mFees = executePullFunds.mFees();
            this.mCard = executePullFunds.mCard();
            this.mPurchaseId = executePullFunds.mPurchaseId();
            this.mPaymentId = executePullFunds.mPaymentId();
            this.mRequestReferenceNo = executePullFunds.mRequestReferenceNo();
            this.mStatus = executePullFunds.mStatus();
            this.mIsPaid = Boolean.valueOf(executePullFunds.mIsPaid());
            this.mVerificationUrl = executePullFunds.mVerificationUrl();
            this.mRedirectUrls = executePullFunds.mRedirectUrls();
        }
    }

    public C$$AutoValue_ExecutePullFunds(Amount amount, Amount amount2, @Nullable PullFundsCard pullFundsCard, String str, @Nullable String str2, @Nullable String str3, String str4, boolean z4, @Nullable String str5, @Nullable RedirectUrls redirectUrls) {
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mFees");
        }
        this.mFees = amount2;
        this.mCard = pullFundsCard;
        if (str == null) {
            throw new NullPointerException("Null mPurchaseId");
        }
        this.mPurchaseId = str;
        this.mPaymentId = str2;
        this.mRequestReferenceNo = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str4;
        this.mIsPaid = z4;
        this.mVerificationUrl = str5;
        this.mRedirectUrls = redirectUrls;
    }

    public boolean equals(Object obj) {
        PullFundsCard pullFundsCard;
        String str;
        String str2;
        String str3;
        RedirectUrls redirectUrls;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExecutePullFunds) {
            ExecutePullFunds executePullFunds = (ExecutePullFunds) obj;
            if (this.mAmount.equals(executePullFunds.mAmount()) && this.mFees.equals(executePullFunds.mFees()) && ((pullFundsCard = this.mCard) != null ? pullFundsCard.equals(executePullFunds.mCard()) : executePullFunds.mCard() == null) && this.mPurchaseId.equals(executePullFunds.mPurchaseId()) && ((str = this.mPaymentId) != null ? str.equals(executePullFunds.mPaymentId()) : executePullFunds.mPaymentId() == null) && ((str2 = this.mRequestReferenceNo) != null ? str2.equals(executePullFunds.mRequestReferenceNo()) : executePullFunds.mRequestReferenceNo() == null) && this.mStatus.equals(executePullFunds.mStatus()) && this.mIsPaid == executePullFunds.mIsPaid() && ((str3 = this.mVerificationUrl) != null ? str3.equals(executePullFunds.mVerificationUrl()) : executePullFunds.mVerificationUrl() == null) && ((redirectUrls = this.mRedirectUrls) != null ? redirectUrls.equals(executePullFunds.mRedirectUrls()) : executePullFunds.mRedirectUrls() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mAmount.hashCode() ^ 1000003) * 1000003) ^ this.mFees.hashCode()) * 1000003;
        PullFundsCard pullFundsCard = this.mCard;
        int iHashCode2 = (((iHashCode ^ (pullFundsCard == null ? 0 : pullFundsCard.hashCode())) * 1000003) ^ this.mPurchaseId.hashCode()) * 1000003;
        String str = this.mPaymentId;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mRequestReferenceNo;
        int iHashCode4 = (((((iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ (this.mIsPaid ? 1231 : 1237)) * 1000003;
        String str3 = this.mVerificationUrl;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        RedirectUrls redirectUrls = this.mRedirectUrls;
        return iHashCode5 ^ (redirectUrls != null ? redirectUrls.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @Nullable
    @InterfaceC1498b("card")
    public PullFundsCard mCard() {
        return this.mCard;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @InterfaceC1498b("fees")
    public Amount mFees() {
        return this.mFees;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @InterfaceC1498b("is_paid")
    public boolean mIsPaid() {
        return this.mIsPaid;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @Nullable
    @InterfaceC1498b("payment_id")
    public String mPaymentId() {
        return this.mPaymentId;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @InterfaceC1498b("purchase_id")
    public String mPurchaseId() {
        return this.mPurchaseId;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @Nullable
    @InterfaceC1498b("redirect_url")
    public RedirectUrls mRedirectUrls() {
        return this.mRedirectUrls;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @Nullable
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    @Nullable
    @InterfaceC1498b("verification_url")
    public String mVerificationUrl() {
        return this.mVerificationUrl;
    }

    @Override // com.paymaya.domain.model.ExecutePullFunds
    public ExecutePullFunds.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "ExecutePullFunds{mAmount=" + this.mAmount + ", mFees=" + this.mFees + ", mCard=" + this.mCard + ", mPurchaseId=" + this.mPurchaseId + ", mPaymentId=" + this.mPaymentId + ", mRequestReferenceNo=" + this.mRequestReferenceNo + ", mStatus=" + this.mStatus + ", mIsPaid=" + this.mIsPaid + ", mVerificationUrl=" + this.mVerificationUrl + ", mRedirectUrls=" + this.mRedirectUrls + "}";
    }
}
