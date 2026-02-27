package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.WhitelistedLoan;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_WhitelistedLoan, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_WhitelistedLoan extends WhitelistedLoan {
    private final String mExpiry;
    private final String mInterestRate;
    private final ImageUrl mLoanProviderLogo;
    private final Term mLoanTerm;
    private final Amount mPrincipal;
    private final String mProductKey;
    private final Term mValidityTerm;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_WhitelistedLoan$Builder */
    public static class Builder extends WhitelistedLoan.Builder {
        private String mExpiry;
        private String mInterestRate;
        private ImageUrl mLoanProviderLogo;
        private Term mLoanTerm;
        private Amount mPrincipal;
        private String mProductKey;
        private Term mValidityTerm;

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan build() {
            String strI = this.mProductKey == null ? " mProductKey" : "";
            if (this.mExpiry == null) {
                strI = s.i(strI, " mExpiry");
            }
            if (this.mValidityTerm == null) {
                strI = s.i(strI, " mValidityTerm");
            }
            if (this.mPrincipal == null) {
                strI = s.i(strI, " mPrincipal");
            }
            if (this.mLoanTerm == null) {
                strI = s.i(strI, " mLoanTerm");
            }
            if (this.mInterestRate == null) {
                strI = s.i(strI, " mInterestRate");
            }
            if (this.mLoanProviderLogo == null) {
                strI = s.i(strI, " mLoanProviderLogo");
            }
            if (strI.isEmpty()) {
                return new AutoValue_WhitelistedLoan(this.mProductKey, this.mExpiry, this.mValidityTerm, this.mPrincipal, this.mLoanTerm, this.mInterestRate, this.mLoanProviderLogo);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mExpiry(String str) {
            if (str == null) {
                throw new NullPointerException("Null mExpiry");
            }
            this.mExpiry = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mInterestRate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mInterestRate");
            }
            this.mInterestRate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mLoanProviderLogo(ImageUrl imageUrl) {
            if (imageUrl == null) {
                throw new NullPointerException("Null mLoanProviderLogo");
            }
            this.mLoanProviderLogo = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mLoanTerm(Term term) {
            if (term == null) {
                throw new NullPointerException("Null mLoanTerm");
            }
            this.mLoanTerm = term;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mPrincipal(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mPrincipal");
            }
            this.mPrincipal = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mProductKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null mProductKey");
            }
            this.mProductKey = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WhitelistedLoan.Builder
        public WhitelistedLoan.Builder mValidityTerm(Term term) {
            if (term == null) {
                throw new NullPointerException("Null mValidityTerm");
            }
            this.mValidityTerm = term;
            return this;
        }
    }

    public C$$AutoValue_WhitelistedLoan(String str, String str2, Term term, Amount amount, Term term2, String str3, ImageUrl imageUrl) {
        if (str == null) {
            throw new NullPointerException("Null mProductKey");
        }
        this.mProductKey = str;
        if (str2 == null) {
            throw new NullPointerException("Null mExpiry");
        }
        this.mExpiry = str2;
        if (term == null) {
            throw new NullPointerException("Null mValidityTerm");
        }
        this.mValidityTerm = term;
        if (amount == null) {
            throw new NullPointerException("Null mPrincipal");
        }
        this.mPrincipal = amount;
        if (term2 == null) {
            throw new NullPointerException("Null mLoanTerm");
        }
        this.mLoanTerm = term2;
        if (str3 == null) {
            throw new NullPointerException("Null mInterestRate");
        }
        this.mInterestRate = str3;
        if (imageUrl == null) {
            throw new NullPointerException("Null mLoanProviderLogo");
        }
        this.mLoanProviderLogo = imageUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WhitelistedLoan) {
            WhitelistedLoan whitelistedLoan = (WhitelistedLoan) obj;
            if (this.mProductKey.equals(whitelistedLoan.mProductKey()) && this.mExpiry.equals(whitelistedLoan.mExpiry()) && this.mValidityTerm.equals(whitelistedLoan.mValidityTerm()) && this.mPrincipal.equals(whitelistedLoan.mPrincipal()) && this.mLoanTerm.equals(whitelistedLoan.mLoanTerm()) && this.mInterestRate.equals(whitelistedLoan.mInterestRate()) && this.mLoanProviderLogo.equals(whitelistedLoan.mLoanProviderLogo())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.mProductKey.hashCode() ^ 1000003) * 1000003) ^ this.mExpiry.hashCode()) * 1000003) ^ this.mValidityTerm.hashCode()) * 1000003) ^ this.mPrincipal.hashCode()) * 1000003) ^ this.mLoanTerm.hashCode()) * 1000003) ^ this.mInterestRate.hashCode()) * 1000003) ^ this.mLoanProviderLogo.hashCode();
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("expiry")
    public String mExpiry() {
        return this.mExpiry;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("interest_rate")
    public String mInterestRate() {
        return this.mInterestRate;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("loan_provider_logo")
    public ImageUrl mLoanProviderLogo() {
        return this.mLoanProviderLogo;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("loan_term")
    public Term mLoanTerm() {
        return this.mLoanTerm;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("principal")
    public Amount mPrincipal() {
        return this.mPrincipal;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("product_key")
    public String mProductKey() {
        return this.mProductKey;
    }

    @Override // com.paymaya.domain.model.WhitelistedLoan
    @InterfaceC1498b("validity")
    public Term mValidityTerm() {
        return this.mValidityTerm;
    }

    public String toString() {
        return "WhitelistedLoan{mProductKey=" + this.mProductKey + ", mExpiry=" + this.mExpiry + ", mValidityTerm=" + this.mValidityTerm + ", mPrincipal=" + this.mPrincipal + ", mLoanTerm=" + this.mLoanTerm + ", mInterestRate=" + this.mInterestRate + ", mLoanProviderLogo=" + this.mLoanProviderLogo + "}";
    }
}
