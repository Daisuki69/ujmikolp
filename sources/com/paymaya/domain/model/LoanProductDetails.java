package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_LoanProductDetails;
import com.paymaya.domain.model.C$AutoValue_LoanProductDetails;
import g3.InterfaceC1498b;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoanProductDetails implements Parcelable {

    public static abstract class Builder {
        public abstract LoanProductDetails build();

        public abstract Builder mAmortizationFrequency(String str);

        public abstract Builder mDescription(String str);

        public abstract Builder mInterestRate(String str);

        public abstract Builder mLoanProviderLogo(ImageUrl imageUrl);

        public abstract Builder mLoanTerm(Term term);

        public abstract Builder mMaxLoanAmount(Amount amount);

        public abstract Builder mMinLoanAmount(Amount amount);

        public abstract Builder mName(String str);

        public abstract Builder mNetDisbursementAmount(Amount amount);

        public abstract Builder mOrganization(String str);

        public abstract Builder mPrincipal(Amount amount);

        public abstract Builder mProcessingFee(Amount amount);

        public abstract Builder mProductKey(String str);

        public abstract Builder mRepaymentAmount(Amount amount);

        public abstract Builder mTermsAndConditions(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_LoanProductDetails.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_LoanProductDetails.GsonTypeAdapter(jVar);
    }

    public String getInterestPercentage() {
        Float fValueOf = Float.valueOf(Float.parseFloat(mInterestRate()));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(2);
        return percentInstance.format(fValueOf);
    }

    @InterfaceC1498b("amortization_frequency")
    public abstract String mAmortizationFrequency();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b("interest_rate")
    public abstract String mInterestRate();

    @InterfaceC1498b("loan_provider_logo")
    public abstract ImageUrl mLoanProviderLogo();

    @InterfaceC1498b("loan_term")
    public abstract Term mLoanTerm();

    @InterfaceC1498b("max_loan_amount")
    public abstract Amount mMaxLoanAmount();

    @InterfaceC1498b("min_loan_amount")
    public abstract Amount mMinLoanAmount();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("net_disbursement_amount")
    public abstract Amount mNetDisbursementAmount();

    @InterfaceC1498b("organization")
    public abstract String mOrganization();

    @InterfaceC1498b("principal")
    public abstract Amount mPrincipal();

    @InterfaceC1498b("processing_fee")
    public abstract Amount mProcessingFee();

    @InterfaceC1498b("product_key")
    public abstract String mProductKey();

    @InterfaceC1498b("repayment_amount")
    public abstract Amount mRepaymentAmount();

    @InterfaceC1498b("terms_and_conditions")
    public abstract String mTermsAndConditions();
}
