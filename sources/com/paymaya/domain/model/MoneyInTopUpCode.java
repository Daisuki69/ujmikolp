package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MoneyInTopUpCode;
import com.paymaya.domain.model.C$AutoValue_MoneyInTopUpCode;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MoneyInTopUpCode implements Parcelable {

    public static abstract class Builder {
        public abstract MoneyInTopUpCode build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mCode(String str);

        public abstract Builder mExpiryDate(String str);

        public abstract Builder mFee(Amount amount);

        public abstract Builder mOriginalAmount(Amount amount);

        public abstract Builder mTotalAmount(Amount amount);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MoneyInTopUpCode.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MoneyInTopUpCode.GsonTypeAdapter(jVar);
    }

    public String getCurrencyFormattedAmount() {
        return mAmount().getCurrencyFormattedValue();
    }

    public String getCurrencyFormattedTotalAmount() {
        return mTotalAmount().getCurrencyFormattedValue();
    }

    public String getFormattedAmount() {
        return mAmount().getFormattedValue();
    }

    public String getFormattedFee() {
        return mFee().getCurrencyFormattedValue();
    }

    public String getFormattedTotalAmount() {
        return mTotalAmount().getFormattedValue();
    }

    public Double getFormattedTotalAmountAsDouble() {
        return Double.valueOf(Double.parseDouble(mTotalAmount().mValue()));
    }

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @InterfaceC1498b("code")
    public abstract String mCode();

    @InterfaceC1498b("expiry_date")
    public abstract String mExpiryDate();

    @Nullable
    @InterfaceC1498b("fee")
    public abstract Amount mFee();

    @Nullable
    @InterfaceC1498b("original_amount")
    public abstract Amount mOriginalAmount();

    @Nullable
    @InterfaceC1498b("total_amount")
    public abstract Amount mTotalAmount();

    public abstract Builder toBuilder();
}
