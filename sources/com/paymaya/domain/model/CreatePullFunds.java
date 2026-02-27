package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_CreatePullFunds;
import com.paymaya.domain.model.C$AutoValue_CreatePullFunds;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CreatePullFunds implements Parcelable {

    public static abstract class Builder {
        public abstract CreatePullFunds build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mCard(PullFundsCard pullFundsCard);

        public abstract Builder mFees(Amount amount);

        public abstract Builder mPurchaseId(String str);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_CreatePullFunds.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_CreatePullFunds.GsonTypeAdapter(jVar);
    }

    public String getCardLastFourDigits() {
        return mCard() != null ? mCard().mLastFour() : "";
    }

    public String getCardScheme() {
        return mCard() != null ? mCard().mScheme() : "";
    }

    public String getCardSchemeName() {
        return mCard() != null ? mCard().getCardSchemeName() : "";
    }

    public String getDeductedAmount() {
        return mAmount().mCurrency() + Global.BLANK + C.u(Double.valueOf(Double.valueOf(mFees().mValue()).doubleValue() + Double.valueOf(mAmount().mValue()).doubleValue()));
    }

    public String getFormattedAmount() {
        return mAmount().getFormattedValue();
    }

    public String getFormattedFee() {
        return mFees().getFormattedValue();
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

    @InterfaceC1498b("purchase_id")
    public abstract String mPurchaseId();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    public abstract Builder toBuilder();
}
