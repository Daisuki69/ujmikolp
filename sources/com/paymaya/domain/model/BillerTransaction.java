package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.C$$AutoValue_BillerTransaction;
import com.paymaya.domain.model.C$AutoValue_BillerTransaction;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerTransaction implements Parcelable {

    public static abstract class Builder {
        public abstract BillerTransaction build();

        public abstract Builder mAccountBalance(@Nullable AccountBalance accountBalance);

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mBillPaymentId(@Nullable String str);

        public abstract Builder mBiller(BillerDetails billerDetails);

        public abstract Builder mBillerTransactionPayment(@Nullable BillerTransactionPayment billerTransactionPayment);

        public abstract Builder mCreatedDate(@Nullable String str);

        public abstract Builder mFee(@Nullable Amount amount);

        public abstract Builder mStatus(@Nullable String str);

        public abstract Builder mTotalAmount(@Nullable Amount amount);

        public abstract Builder mUserMin(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillerTransaction.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerTransaction.GsonTypeAdapter(jVar);
    }

    public String getAccountBalanceFormattedValue() {
        return mAccountBalance().mAvailableBalance().getCurrencyFormattedValue();
    }

    public String getAmountFormattedValue() {
        return mAmount().getCurrencyFormattedValue();
    }

    public String getBillerAccountNumber() {
        return mBiller().mAccountNumber();
    }

    public List<BillerDynamicField> getBillerDynamicFields() {
        return mBiller().mDynamicFields();
    }

    public String getBillerName() {
        return mBiller().mName();
    }

    public String getBillerSlug() {
        return mBiller().mSlug();
    }

    public String getBillerTransactionPaymentId() {
        return mBillerTransactionPayment() != null ? mBillerTransactionPayment().getPaymentId() : "";
    }

    public String getFormattedCreatedDate() {
        if (mCreatedDate() == null) {
            return "";
        }
        return AbstractC1234x.f11256p.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(mCreatedDate()));
    }

    public String getFormattedPaymentId() {
        if (mBillPaymentId() == null) {
            return null;
        }
        return mBillPaymentId().split(Global.HYPHEN)[r0.length - 1];
    }

    public ImageUrl getIconUrl() {
        return mBiller().mIconUrl().mAndroidImageUrl();
    }

    @Nullable
    @InterfaceC1498b("balance")
    public abstract AccountBalance mAccountBalance();

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("bill_payment_id")
    public abstract String mBillPaymentId();

    @InterfaceC1498b("biller")
    public abstract BillerDetails mBiller();

    @Nullable
    @InterfaceC1498b("payment")
    public abstract BillerTransactionPayment mBillerTransactionPayment();

    @Nullable
    @InterfaceC1498b("created_date")
    public abstract String mCreatedDate();

    @Nullable
    @InterfaceC1498b("fee")
    public abstract Amount mFee();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("totalAmount")
    public abstract Amount mTotalAmount();

    @Nullable
    public abstract String mUserMin();

    public abstract Builder toBuilder();
}
