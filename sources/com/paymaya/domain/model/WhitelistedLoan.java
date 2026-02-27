package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_WhitelistedLoan;
import com.paymaya.domain.model.C$AutoValue_WhitelistedLoan;
import com.paymaya.domain.model.LoanItem;
import g3.InterfaceC1498b;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WhitelistedLoan implements Parcelable, LoanItem {

    public static abstract class Builder {
        public abstract WhitelistedLoan build();

        public abstract Builder mExpiry(String str);

        public abstract Builder mInterestRate(String str);

        public abstract Builder mLoanProviderLogo(ImageUrl imageUrl);

        public abstract Builder mLoanTerm(Term term);

        public abstract Builder mPrincipal(Amount amount);

        public abstract Builder mProductKey(String str);

        public abstract Builder mValidityTerm(Term term);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_WhitelistedLoan.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_WhitelistedLoan.GsonTypeAdapter(jVar);
    }

    public String getInterestPercentage() {
        Float fValueOf = Float.valueOf(Float.parseFloat(mInterestRate()));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(2);
        return percentInstance.format(fValueOf);
    }

    @Override // com.paymaya.domain.model.LoanItem
    public LoanItem.VIEW_TYPE getViewType() {
        return LoanItem.VIEW_TYPE.VIEW_TYPE_WHITELISTED_LOAN;
    }

    @InterfaceC1498b("expiry")
    public abstract String mExpiry();

    @InterfaceC1498b("interest_rate")
    public abstract String mInterestRate();

    @InterfaceC1498b("loan_provider_logo")
    public abstract ImageUrl mLoanProviderLogo();

    @InterfaceC1498b("loan_term")
    public abstract Term mLoanTerm();

    @InterfaceC1498b("principal")
    public abstract Amount mPrincipal();

    @InterfaceC1498b("product_key")
    public abstract String mProductKey();

    @InterfaceC1498b("validity")
    public abstract Term mValidityTerm();
}
