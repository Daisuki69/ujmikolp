package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_MerchantPayment;
import com.paymaya.domain.model.C$AutoValue_MerchantPayment;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MerchantPayment implements Parcelable {

    public static abstract class Builder {
        public abstract MerchantPayment build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mAvailableBalance(Amount amount);

        public abstract Builder mCurrentBalance(Amount amount);

        public abstract Builder mMerchant(String str);

        public abstract Builder mMerchantName(String str);

        public abstract Builder mPaymentFees(Amount amount);

        public abstract Builder mPaymentToken(String str);

        public abstract Builder mRedirectUrl(String str);

        public abstract Builder mRequestReferenceNo(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MerchantPayment.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MerchantPayment.GsonTypeAdapter(jVar);
    }

    public String getAmountFormattedValue() {
        return mAmount().getCurrencyFormattedValue();
    }

    public String getAvailableBalanceFormattedValue() {
        return mAvailableBalance().getCurrencyFormattedValue();
    }

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    public abstract Amount mAvailableBalance();

    @Nullable
    public abstract Amount mCurrentBalance();

    @Nullable
    @InterfaceC1498b("value")
    public abstract String mMerchant();

    @Nullable
    @InterfaceC1498b("mername")
    public abstract String mMerchantName();

    @InterfaceC1498b("fees")
    public abstract Amount mPaymentFees();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mPaymentToken();

    @Nullable
    @InterfaceC1498b("redirect_url")
    public abstract String mRedirectUrl();

    @Nullable
    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    public String normalizeRedirectUrl() {
        return C.m0(mRedirectUrl());
    }

    public abstract Builder toBuilder();
}
