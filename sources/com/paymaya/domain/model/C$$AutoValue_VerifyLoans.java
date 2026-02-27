package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.VerifyLoans;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VerifyLoans, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VerifyLoans extends VerifyLoans {
    private final String mId;
    private final String mInterestRate;
    private final Term mLoanTerm;
    private final Amount mNetDisbursementAmount;
    private final Amount mPrincipal;
    private final Amount mProcessingFee;
    private final String mProduct;
    private final Amount mRepaymentAmount;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VerifyLoans$Builder */
    public static class Builder extends VerifyLoans.Builder {
        private String mId;
        private String mInterestRate;
        private Term mLoanTerm;
        private Amount mNetDisbursementAmount;
        private Amount mPrincipal;
        private Amount mProcessingFee;
        private String mProduct;
        private Amount mRepaymentAmount;
        private String mStatus;

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (this.mProduct == null) {
                strI = s.i(strI, " mProduct");
            }
            if (this.mProcessingFee == null) {
                strI = s.i(strI, " mProcessingFee");
            }
            if (this.mPrincipal == null) {
                strI = s.i(strI, " mPrincipal");
            }
            if (this.mNetDisbursementAmount == null) {
                strI = s.i(strI, " mNetDisbursementAmount");
            }
            if (this.mLoanTerm == null) {
                strI = s.i(strI, " mLoanTerm");
            }
            if (this.mInterestRate == null) {
                strI = s.i(strI, " mInterestRate");
            }
            if (this.mRepaymentAmount == null) {
                strI = s.i(strI, " mRepaymentAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_VerifyLoans(this.mId, this.mStatus, this.mProduct, this.mProcessingFee, this.mPrincipal, this.mNetDisbursementAmount, this.mLoanTerm, this.mInterestRate, this.mRepaymentAmount);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mInterestRate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mInterestRate");
            }
            this.mInterestRate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mLoanTerm(Term term) {
            if (term == null) {
                throw new NullPointerException("Null mLoanTerm");
            }
            this.mLoanTerm = term;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mNetDisbursementAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mNetDisbursementAmount");
            }
            this.mNetDisbursementAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mPrincipal(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mPrincipal");
            }
            this.mPrincipal = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mProcessingFee(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mProcessingFee");
            }
            this.mProcessingFee = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mProduct(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProduct");
            }
            this.mProduct = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mRepaymentAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mRepaymentAmount");
            }
            this.mRepaymentAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.VerifyLoans.Builder
        public VerifyLoans.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }
    }

    public C$$AutoValue_VerifyLoans(String str, String str2, String str3, Amount amount, Amount amount2, Amount amount3, Term term, String str4, Amount amount4) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mProduct");
        }
        this.mProduct = str3;
        if (amount == null) {
            throw new NullPointerException("Null mProcessingFee");
        }
        this.mProcessingFee = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mPrincipal");
        }
        this.mPrincipal = amount2;
        if (amount3 == null) {
            throw new NullPointerException("Null mNetDisbursementAmount");
        }
        this.mNetDisbursementAmount = amount3;
        if (term == null) {
            throw new NullPointerException("Null mLoanTerm");
        }
        this.mLoanTerm = term;
        if (str4 == null) {
            throw new NullPointerException("Null mInterestRate");
        }
        this.mInterestRate = str4;
        if (amount4 == null) {
            throw new NullPointerException("Null mRepaymentAmount");
        }
        this.mRepaymentAmount = amount4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VerifyLoans) {
            VerifyLoans verifyLoans = (VerifyLoans) obj;
            if (this.mId.equals(verifyLoans.mId()) && this.mStatus.equals(verifyLoans.mStatus()) && this.mProduct.equals(verifyLoans.mProduct()) && this.mProcessingFee.equals(verifyLoans.mProcessingFee()) && this.mPrincipal.equals(verifyLoans.mPrincipal()) && this.mNetDisbursementAmount.equals(verifyLoans.mNetDisbursementAmount()) && this.mLoanTerm.equals(verifyLoans.mLoanTerm()) && this.mInterestRate.equals(verifyLoans.mInterestRate()) && this.mRepaymentAmount.equals(verifyLoans.mRepaymentAmount())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ this.mProduct.hashCode()) * 1000003) ^ this.mProcessingFee.hashCode()) * 1000003) ^ this.mPrincipal.hashCode()) * 1000003) ^ this.mNetDisbursementAmount.hashCode()) * 1000003) ^ this.mLoanTerm.hashCode()) * 1000003) ^ this.mInterestRate.hashCode()) * 1000003) ^ this.mRepaymentAmount.hashCode();
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("interest_rate")
    public String mInterestRate() {
        return this.mInterestRate;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("loan_term")
    public Term mLoanTerm() {
        return this.mLoanTerm;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("net_disbursement_amount")
    public Amount mNetDisbursementAmount() {
        return this.mNetDisbursementAmount;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("principal")
    public Amount mPrincipal() {
        return this.mPrincipal;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("processing_fee")
    public Amount mProcessingFee() {
        return this.mProcessingFee;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("product_key")
    public String mProduct() {
        return this.mProduct;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("repayment_amount")
    public Amount mRepaymentAmount() {
        return this.mRepaymentAmount;
    }

    @Override // com.paymaya.domain.model.VerifyLoans
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    public String toString() {
        return "VerifyLoans{mId=" + this.mId + ", mStatus=" + this.mStatus + ", mProduct=" + this.mProduct + ", mProcessingFee=" + this.mProcessingFee + ", mPrincipal=" + this.mPrincipal + ", mNetDisbursementAmount=" + this.mNetDisbursementAmount + ", mLoanTerm=" + this.mLoanTerm + ", mInterestRate=" + this.mInterestRate + ", mRepaymentAmount=" + this.mRepaymentAmount + "}";
    }
}
