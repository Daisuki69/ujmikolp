package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.LoanProductDetails;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoanProductDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_LoanProductDetails extends LoanProductDetails {
    private final String mAmortizationFrequency;
    private final String mDescription;
    private final String mInterestRate;
    private final ImageUrl mLoanProviderLogo;
    private final Term mLoanTerm;
    private final Amount mMaxLoanAmount;
    private final Amount mMinLoanAmount;
    private final String mName;
    private final Amount mNetDisbursementAmount;
    private final String mOrganization;
    private final Amount mPrincipal;
    private final Amount mProcessingFee;
    private final String mProductKey;
    private final Amount mRepaymentAmount;
    private final String mTermsAndConditions;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_LoanProductDetails$Builder */
    public static class Builder extends LoanProductDetails.Builder {
        private String mAmortizationFrequency;
        private String mDescription;
        private String mInterestRate;
        private ImageUrl mLoanProviderLogo;
        private Term mLoanTerm;
        private Amount mMaxLoanAmount;
        private Amount mMinLoanAmount;
        private String mName;
        private Amount mNetDisbursementAmount;
        private String mOrganization;
        private Amount mPrincipal;
        private Amount mProcessingFee;
        private String mProductKey;
        private Amount mRepaymentAmount;
        private String mTermsAndConditions;

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails build() {
            String strI = this.mProductKey == null ? " mProductKey" : "";
            if (this.mPrincipal == null) {
                strI = s.i(strI, " mPrincipal");
            }
            if (this.mInterestRate == null) {
                strI = s.i(strI, " mInterestRate");
            }
            if (this.mLoanTerm == null) {
                strI = s.i(strI, " mLoanTerm");
            }
            if (this.mNetDisbursementAmount == null) {
                strI = s.i(strI, " mNetDisbursementAmount");
            }
            if (this.mProcessingFee == null) {
                strI = s.i(strI, " mProcessingFee");
            }
            if (this.mRepaymentAmount == null) {
                strI = s.i(strI, " mRepaymentAmount");
            }
            if (this.mOrganization == null) {
                strI = s.i(strI, " mOrganization");
            }
            if (this.mLoanProviderLogo == null) {
                strI = s.i(strI, " mLoanProviderLogo");
            }
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (this.mDescription == null) {
                strI = s.i(strI, " mDescription");
            }
            if (this.mMinLoanAmount == null) {
                strI = s.i(strI, " mMinLoanAmount");
            }
            if (this.mMaxLoanAmount == null) {
                strI = s.i(strI, " mMaxLoanAmount");
            }
            if (this.mAmortizationFrequency == null) {
                strI = s.i(strI, " mAmortizationFrequency");
            }
            if (this.mTermsAndConditions == null) {
                strI = s.i(strI, " mTermsAndConditions");
            }
            if (strI.isEmpty()) {
                return new AutoValue_LoanProductDetails(this.mProductKey, this.mPrincipal, this.mInterestRate, this.mLoanTerm, this.mNetDisbursementAmount, this.mProcessingFee, this.mRepaymentAmount, this.mOrganization, this.mLoanProviderLogo, this.mName, this.mDescription, this.mMinLoanAmount, this.mMaxLoanAmount, this.mAmortizationFrequency, this.mTermsAndConditions);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mAmortizationFrequency(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAmortizationFrequency");
            }
            this.mAmortizationFrequency = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mDescription(String str) {
            if (str == null) {
                throw new NullPointerException("Null mDescription");
            }
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mInterestRate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mInterestRate");
            }
            this.mInterestRate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mLoanProviderLogo(ImageUrl imageUrl) {
            if (imageUrl == null) {
                throw new NullPointerException("Null mLoanProviderLogo");
            }
            this.mLoanProviderLogo = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mLoanTerm(Term term) {
            if (term == null) {
                throw new NullPointerException("Null mLoanTerm");
            }
            this.mLoanTerm = term;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mMaxLoanAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mMaxLoanAmount");
            }
            this.mMaxLoanAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mMinLoanAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mMinLoanAmount");
            }
            this.mMinLoanAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mNetDisbursementAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mNetDisbursementAmount");
            }
            this.mNetDisbursementAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mOrganization(String str) {
            if (str == null) {
                throw new NullPointerException("Null mOrganization");
            }
            this.mOrganization = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mPrincipal(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mPrincipal");
            }
            this.mPrincipal = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mProcessingFee(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mProcessingFee");
            }
            this.mProcessingFee = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mProductKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductKey");
            }
            this.mProductKey = str;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mRepaymentAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mRepaymentAmount");
            }
            this.mRepaymentAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.LoanProductDetails.Builder
        public LoanProductDetails.Builder mTermsAndConditions(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTermsAndConditions");
            }
            this.mTermsAndConditions = str;
            return this;
        }
    }

    public C$$AutoValue_LoanProductDetails(String str, Amount amount, String str2, Term term, Amount amount2, Amount amount3, Amount amount4, String str3, ImageUrl imageUrl, String str4, String str5, Amount amount5, Amount amount6, String str6, String str7) {
        if (str == null) {
            throw new NullPointerException("Null mProductKey");
        }
        this.mProductKey = str;
        if (amount == null) {
            throw new NullPointerException("Null mPrincipal");
        }
        this.mPrincipal = amount;
        if (str2 == null) {
            throw new NullPointerException("Null mInterestRate");
        }
        this.mInterestRate = str2;
        if (term == null) {
            throw new NullPointerException("Null mLoanTerm");
        }
        this.mLoanTerm = term;
        if (amount2 == null) {
            throw new NullPointerException("Null mNetDisbursementAmount");
        }
        this.mNetDisbursementAmount = amount2;
        if (amount3 == null) {
            throw new NullPointerException("Null mProcessingFee");
        }
        this.mProcessingFee = amount3;
        if (amount4 == null) {
            throw new NullPointerException("Null mRepaymentAmount");
        }
        this.mRepaymentAmount = amount4;
        if (str3 == null) {
            throw new NullPointerException("Null mOrganization");
        }
        this.mOrganization = str3;
        if (imageUrl == null) {
            throw new NullPointerException("Null mLoanProviderLogo");
        }
        this.mLoanProviderLogo = imageUrl;
        if (str4 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str4;
        if (str5 == null) {
            throw new NullPointerException("Null mDescription");
        }
        this.mDescription = str5;
        if (amount5 == null) {
            throw new NullPointerException("Null mMinLoanAmount");
        }
        this.mMinLoanAmount = amount5;
        if (amount6 == null) {
            throw new NullPointerException("Null mMaxLoanAmount");
        }
        this.mMaxLoanAmount = amount6;
        if (str6 == null) {
            throw new NullPointerException("Null mAmortizationFrequency");
        }
        this.mAmortizationFrequency = str6;
        if (str7 == null) {
            throw new NullPointerException("Null mTermsAndConditions");
        }
        this.mTermsAndConditions = str7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoanProductDetails) {
            LoanProductDetails loanProductDetails = (LoanProductDetails) obj;
            if (this.mProductKey.equals(loanProductDetails.mProductKey()) && this.mPrincipal.equals(loanProductDetails.mPrincipal()) && this.mInterestRate.equals(loanProductDetails.mInterestRate()) && this.mLoanTerm.equals(loanProductDetails.mLoanTerm()) && this.mNetDisbursementAmount.equals(loanProductDetails.mNetDisbursementAmount()) && this.mProcessingFee.equals(loanProductDetails.mProcessingFee()) && this.mRepaymentAmount.equals(loanProductDetails.mRepaymentAmount()) && this.mOrganization.equals(loanProductDetails.mOrganization()) && this.mLoanProviderLogo.equals(loanProductDetails.mLoanProviderLogo()) && this.mName.equals(loanProductDetails.mName()) && this.mDescription.equals(loanProductDetails.mDescription()) && this.mMinLoanAmount.equals(loanProductDetails.mMinLoanAmount()) && this.mMaxLoanAmount.equals(loanProductDetails.mMaxLoanAmount()) && this.mAmortizationFrequency.equals(loanProductDetails.mAmortizationFrequency()) && this.mTermsAndConditions.equals(loanProductDetails.mTermsAndConditions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((this.mProductKey.hashCode() ^ 1000003) * 1000003) ^ this.mPrincipal.hashCode()) * 1000003) ^ this.mInterestRate.hashCode()) * 1000003) ^ this.mLoanTerm.hashCode()) * 1000003) ^ this.mNetDisbursementAmount.hashCode()) * 1000003) ^ this.mProcessingFee.hashCode()) * 1000003) ^ this.mRepaymentAmount.hashCode()) * 1000003) ^ this.mOrganization.hashCode()) * 1000003) ^ this.mLoanProviderLogo.hashCode()) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mMinLoanAmount.hashCode()) * 1000003) ^ this.mMaxLoanAmount.hashCode()) * 1000003) ^ this.mAmortizationFrequency.hashCode()) * 1000003) ^ this.mTermsAndConditions.hashCode();
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("amortization_frequency")
    public String mAmortizationFrequency() {
        return this.mAmortizationFrequency;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("interest_rate")
    public String mInterestRate() {
        return this.mInterestRate;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("loan_provider_logo")
    public ImageUrl mLoanProviderLogo() {
        return this.mLoanProviderLogo;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("loan_term")
    public Term mLoanTerm() {
        return this.mLoanTerm;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("max_loan_amount")
    public Amount mMaxLoanAmount() {
        return this.mMaxLoanAmount;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("min_loan_amount")
    public Amount mMinLoanAmount() {
        return this.mMinLoanAmount;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("net_disbursement_amount")
    public Amount mNetDisbursementAmount() {
        return this.mNetDisbursementAmount;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("organization")
    public String mOrganization() {
        return this.mOrganization;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("principal")
    public Amount mPrincipal() {
        return this.mPrincipal;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("processing_fee")
    public Amount mProcessingFee() {
        return this.mProcessingFee;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("product_key")
    public String mProductKey() {
        return this.mProductKey;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("repayment_amount")
    public Amount mRepaymentAmount() {
        return this.mRepaymentAmount;
    }

    @Override // com.paymaya.domain.model.LoanProductDetails
    @InterfaceC1498b("terms_and_conditions")
    public String mTermsAndConditions() {
        return this.mTermsAndConditions;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoanProductDetails{mProductKey=");
        sb2.append(this.mProductKey);
        sb2.append(", mPrincipal=");
        sb2.append(this.mPrincipal);
        sb2.append(", mInterestRate=");
        sb2.append(this.mInterestRate);
        sb2.append(", mLoanTerm=");
        sb2.append(this.mLoanTerm);
        sb2.append(", mNetDisbursementAmount=");
        sb2.append(this.mNetDisbursementAmount);
        sb2.append(", mProcessingFee=");
        sb2.append(this.mProcessingFee);
        sb2.append(", mRepaymentAmount=");
        sb2.append(this.mRepaymentAmount);
        sb2.append(", mOrganization=");
        sb2.append(this.mOrganization);
        sb2.append(", mLoanProviderLogo=");
        sb2.append(this.mLoanProviderLogo);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mMinLoanAmount=");
        sb2.append(this.mMinLoanAmount);
        sb2.append(", mMaxLoanAmount=");
        sb2.append(this.mMaxLoanAmount);
        sb2.append(", mAmortizationFrequency=");
        sb2.append(this.mAmortizationFrequency);
        sb2.append(", mTermsAndConditions=");
        return s.p(sb2, this.mTermsAndConditions, "}");
    }
}
