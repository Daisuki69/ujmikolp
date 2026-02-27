package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.LoanInstance;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoanInstance, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_LoanInstance extends LoanInstance {
    private final String mBillerSlug;
    private final String mDescription;
    private final String mId;
    private final String mInterestRate;
    private final String mLoanId;
    private final ImageUrl mLoanProviderLogo;
    private final Term mLoanTerm;
    private final String mName;
    private final Amount mNetDisbursementAmount;
    private final String mPaymentDueDate;
    private final Amount mPrincipal;
    private final Amount mProcessingFee;
    private final String mProductKey;
    private final Term mRemainingDays;
    private final Amount mRepaymentAmount;
    private final String mStatus;
    private final String mSubmissionDate;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoanInstance$Builder */
    public static class Builder extends LoanInstance.Builder {
        private String mBillerSlug;
        private String mDescription;
        private String mId;
        private String mInterestRate;
        private String mLoanId;
        private ImageUrl mLoanProviderLogo;
        private Term mLoanTerm;
        private String mName;
        private Amount mNetDisbursementAmount;
        private String mPaymentDueDate;
        private Amount mPrincipal;
        private Amount mProcessingFee;
        private String mProductKey;
        private Term mRemainingDays;
        private Amount mRepaymentAmount;
        private String mStatus;
        private String mSubmissionDate;

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mProductKey == null) {
                strI = s.i(strI, " mProductKey");
            }
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (this.mDescription == null) {
                strI = s.i(strI, " mDescription");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
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
            if (this.mProcessingFee == null) {
                strI = s.i(strI, " mProcessingFee");
            }
            if (this.mRepaymentAmount == null) {
                strI = s.i(strI, " mRepaymentAmount");
            }
            if (this.mSubmissionDate == null) {
                strI = s.i(strI, " mSubmissionDate");
            }
            if (this.mLoanProviderLogo == null) {
                strI = s.i(strI, " mLoanProviderLogo");
            }
            if (this.mBillerSlug == null) {
                strI = s.i(strI, " mBillerSlug");
            }
            if (strI.isEmpty()) {
                return new AutoValue_LoanInstance(this.mId, this.mProductKey, this.mName, this.mDescription, this.mStatus, this.mPrincipal, this.mNetDisbursementAmount, this.mLoanTerm, this.mInterestRate, this.mProcessingFee, this.mRepaymentAmount, this.mSubmissionDate, this.mLoanId, this.mPaymentDueDate, this.mRemainingDays, this.mLoanProviderLogo, this.mBillerSlug);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mBillerSlug(String str) {
            if (str == null) {
                throw new NullPointerException("Null mBillerSlug");
            }
            this.mBillerSlug = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mDescription(String str) {
            if (str == null) {
                throw new NullPointerException("Null mDescription");
            }
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mInterestRate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mInterestRate");
            }
            this.mInterestRate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mLoanId(String str) {
            this.mLoanId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mLoanProviderLogo(ImageUrl imageUrl) {
            if (imageUrl == null) {
                throw new NullPointerException("Null mLoanProviderLogo");
            }
            this.mLoanProviderLogo = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mLoanTerm(Term term) {
            if (term == null) {
                throw new NullPointerException("Null mLoanTerm");
            }
            this.mLoanTerm = term;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mNetDisbursementAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mNetDisbursementAmount");
            }
            this.mNetDisbursementAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mPaymentDueDate(String str) {
            this.mPaymentDueDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mPrincipal(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mPrincipal");
            }
            this.mPrincipal = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mProcessingFee(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mProcessingFee");
            }
            this.mProcessingFee = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mProductKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductKey");
            }
            this.mProductKey = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mRemainingDays(Term term) {
            this.mRemainingDays = term;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mRepaymentAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mRepaymentAmount");
            }
            this.mRepaymentAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanInstance.Builder
        public LoanInstance.Builder mSubmissionDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSubmissionDate");
            }
            this.mSubmissionDate = str;
            return this;
        }
    }

    public C$$AutoValue_LoanInstance(String str, String str2, String str3, String str4, String str5, Amount amount, Amount amount2, Term term, String str6, Amount amount3, Amount amount4, String str7, @Nullable String str8, @Nullable String str9, @Nullable Term term2, ImageUrl imageUrl, String str10) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mProductKey");
        }
        this.mProductKey = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mDescription");
        }
        this.mDescription = str4;
        if (str5 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str5;
        if (amount == null) {
            throw new NullPointerException("Null mPrincipal");
        }
        this.mPrincipal = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mNetDisbursementAmount");
        }
        this.mNetDisbursementAmount = amount2;
        if (term == null) {
            throw new NullPointerException("Null mLoanTerm");
        }
        this.mLoanTerm = term;
        if (str6 == null) {
            throw new NullPointerException("Null mInterestRate");
        }
        this.mInterestRate = str6;
        if (amount3 == null) {
            throw new NullPointerException("Null mProcessingFee");
        }
        this.mProcessingFee = amount3;
        if (amount4 == null) {
            throw new NullPointerException("Null mRepaymentAmount");
        }
        this.mRepaymentAmount = amount4;
        if (str7 == null) {
            throw new NullPointerException("Null mSubmissionDate");
        }
        this.mSubmissionDate = str7;
        this.mLoanId = str8;
        this.mPaymentDueDate = str9;
        this.mRemainingDays = term2;
        if (imageUrl == null) {
            throw new NullPointerException("Null mLoanProviderLogo");
        }
        this.mLoanProviderLogo = imageUrl;
        if (str10 == null) {
            throw new NullPointerException("Null mBillerSlug");
        }
        this.mBillerSlug = str10;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Term term;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoanInstance) {
            LoanInstance loanInstance = (LoanInstance) obj;
            if (this.mId.equals(loanInstance.mId()) && this.mProductKey.equals(loanInstance.mProductKey()) && this.mName.equals(loanInstance.mName()) && this.mDescription.equals(loanInstance.mDescription()) && this.mStatus.equals(loanInstance.mStatus()) && this.mPrincipal.equals(loanInstance.mPrincipal()) && this.mNetDisbursementAmount.equals(loanInstance.mNetDisbursementAmount()) && this.mLoanTerm.equals(loanInstance.mLoanTerm()) && this.mInterestRate.equals(loanInstance.mInterestRate()) && this.mProcessingFee.equals(loanInstance.mProcessingFee()) && this.mRepaymentAmount.equals(loanInstance.mRepaymentAmount()) && this.mSubmissionDate.equals(loanInstance.mSubmissionDate()) && ((str = this.mLoanId) != null ? str.equals(loanInstance.mLoanId()) : loanInstance.mLoanId() == null) && ((str2 = this.mPaymentDueDate) != null ? str2.equals(loanInstance.mPaymentDueDate()) : loanInstance.mPaymentDueDate() == null) && ((term = this.mRemainingDays) != null ? term.equals(loanInstance.mRemainingDays()) : loanInstance.mRemainingDays() == null) && this.mLoanProviderLogo.equals(loanInstance.mLoanProviderLogo()) && this.mBillerSlug.equals(loanInstance.mBillerSlug())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mProductKey.hashCode()) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ this.mPrincipal.hashCode()) * 1000003) ^ this.mNetDisbursementAmount.hashCode()) * 1000003) ^ this.mLoanTerm.hashCode()) * 1000003) ^ this.mInterestRate.hashCode()) * 1000003) ^ this.mProcessingFee.hashCode()) * 1000003) ^ this.mRepaymentAmount.hashCode()) * 1000003) ^ this.mSubmissionDate.hashCode()) * 1000003;
        String str = this.mLoanId;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mPaymentDueDate;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Term term = this.mRemainingDays;
        return ((((iHashCode3 ^ (term != null ? term.hashCode() : 0)) * 1000003) ^ this.mLoanProviderLogo.hashCode()) * 1000003) ^ this.mBillerSlug.hashCode();
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("biller_slug")
    public String mBillerSlug() {
        return this.mBillerSlug;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("interest_rate")
    public String mInterestRate() {
        return this.mInterestRate;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @Nullable
    @InterfaceC1498b("loan_id")
    public String mLoanId() {
        return this.mLoanId;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("loan_provider_logo")
    public ImageUrl mLoanProviderLogo() {
        return this.mLoanProviderLogo;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("loan_term")
    public Term mLoanTerm() {
        return this.mLoanTerm;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("net_disbursement_amount")
    public Amount mNetDisbursementAmount() {
        return this.mNetDisbursementAmount;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @Nullable
    @InterfaceC1498b("payment_due_date")
    public String mPaymentDueDate() {
        return this.mPaymentDueDate;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("principal")
    public Amount mPrincipal() {
        return this.mPrincipal;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("processing_fee")
    public Amount mProcessingFee() {
        return this.mProcessingFee;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("product_key")
    public String mProductKey() {
        return this.mProductKey;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @Nullable
    @InterfaceC1498b("remaining_days")
    public Term mRemainingDays() {
        return this.mRemainingDays;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("repayment_amount")
    public Amount mRepaymentAmount() {
        return this.mRepaymentAmount;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.LoanInstance
    @InterfaceC1498b("submission_date")
    public String mSubmissionDate() {
        return this.mSubmissionDate;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoanInstance{mId=");
        sb2.append(this.mId);
        sb2.append(", mProductKey=");
        sb2.append(this.mProductKey);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mPrincipal=");
        sb2.append(this.mPrincipal);
        sb2.append(", mNetDisbursementAmount=");
        sb2.append(this.mNetDisbursementAmount);
        sb2.append(", mLoanTerm=");
        sb2.append(this.mLoanTerm);
        sb2.append(", mInterestRate=");
        sb2.append(this.mInterestRate);
        sb2.append(", mProcessingFee=");
        sb2.append(this.mProcessingFee);
        sb2.append(", mRepaymentAmount=");
        sb2.append(this.mRepaymentAmount);
        sb2.append(", mSubmissionDate=");
        sb2.append(this.mSubmissionDate);
        sb2.append(", mLoanId=");
        sb2.append(this.mLoanId);
        sb2.append(", mPaymentDueDate=");
        sb2.append(this.mPaymentDueDate);
        sb2.append(", mRemainingDays=");
        sb2.append(this.mRemainingDays);
        sb2.append(", mLoanProviderLogo=");
        sb2.append(this.mLoanProviderLogo);
        sb2.append(", mBillerSlug=");
        return s.p(sb2, this.mBillerSlug, "}");
    }
}
