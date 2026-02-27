package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_ExecutePullFunds;
import com.paymaya.domain.model.C$AutoValue_ExecutePullFunds;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExecutePullFunds implements Parcelable {

    public static abstract class Builder {
        public abstract ExecutePullFunds build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mCard(PullFundsCard pullFundsCard);

        public abstract Builder mFees(Amount amount);

        public abstract Builder mIsPaid(boolean z4);

        public abstract Builder mPaymentId(String str);

        public abstract Builder mPurchaseId(String str);

        public abstract Builder mRedirectUrls(RedirectUrls redirectUrls);

        public abstract Builder mRequestReferenceNo(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mVerificationUrl(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ExecutePullFunds.Builder().mIsPaid(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ExecutePullFunds.GsonTypeAdapter(jVar);
    }

    public String getAmountCurrencyFormattedValue() {
        return mAmount().getCurrencyFormattedValue();
    }

    public String getAmountFormattedValue() {
        return mAmount().getFormattedValue();
    }

    public String getCardLastFour() {
        return mCard() != null ? mCard().mLastFour() : "";
    }

    public String getCardName() {
        return mCard() != null ? mCard().getCardName() : "";
    }

    public String getCardScheme() {
        return mCard() != null ? mCard().mScheme() : "";
    }

    public String getCardSchemeName() {
        return mCard() != null ? mCard().getCardSchemeName() : "";
    }

    public String getFeesCurrencyFormattedValue() {
        return mFees().getCurrencyFormattedValue();
    }

    public String getFeesFormattedValue() {
        return mFees().getFormattedValue();
    }

    public String getMaskedCardLastFour() {
        if (mCard() == null) {
            return "";
        }
        return "**** **** " + mCard().mLastFour();
    }

    public String getParsedReferenceId() {
        return mPurchaseId().length() < 12 ? mPurchaseId() : mPurchaseId().substring(mPurchaseId().length() - 12);
    }

    public String getParsedRequestReferenceNo() {
        return mRequestReferenceNo().length() < 12 ? mRequestReferenceNo() : mRequestReferenceNo().substring(mRequestReferenceNo().length() - 12);
    }

    public String getTotalAmount() {
        return C.u(Double.valueOf(Double.valueOf(mFees().mValue()).doubleValue() + Double.valueOf(mAmount().mValue()).doubleValue()));
    }

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("card")
    public abstract PullFundsCard mCard();

    @InterfaceC1498b("fees")
    public abstract Amount mFees();

    @InterfaceC1498b("is_paid")
    public abstract boolean mIsPaid();

    @Nullable
    @InterfaceC1498b("payment_id")
    public abstract String mPaymentId();

    @InterfaceC1498b("purchase_id")
    public abstract String mPurchaseId();

    @Nullable
    @InterfaceC1498b("redirect_url")
    public abstract RedirectUrls mRedirectUrls();

    @Nullable
    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("verification_url")
    public abstract String mVerificationUrl();

    public abstract Builder toBuilder();
}
