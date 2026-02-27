package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VerifyLoans;
import com.paymaya.domain.model.C$AutoValue_VerifyLoans;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VerifyLoans implements Parcelable {

    public static abstract class Builder {
        public abstract VerifyLoans build();

        public abstract Builder mId(String str);

        public abstract Builder mInterestRate(String str);

        public abstract Builder mLoanTerm(Term term);

        public abstract Builder mNetDisbursementAmount(Amount amount);

        public abstract Builder mPrincipal(Amount amount);

        public abstract Builder mProcessingFee(Amount amount);

        public abstract Builder mProduct(String str);

        public abstract Builder mRepaymentAmount(Amount amount);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VerifyLoans.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VerifyLoans.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("interest_rate")
    public abstract String mInterestRate();

    @InterfaceC1498b("loan_term")
    public abstract Term mLoanTerm();

    @InterfaceC1498b("net_disbursement_amount")
    public abstract Amount mNetDisbursementAmount();

    @InterfaceC1498b("principal")
    public abstract Amount mPrincipal();

    @InterfaceC1498b("processing_fee")
    public abstract Amount mProcessingFee();

    @InterfaceC1498b("product_key")
    public abstract String mProduct();

    @InterfaceC1498b("repayment_amount")
    public abstract Amount mRepaymentAmount();

    @InterfaceC1498b("status")
    public abstract String mStatus();
}
