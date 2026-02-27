package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_TicketPurchaseAmount;
import com.paymaya.domain.model.C$AutoValue_TicketPurchaseAmount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TicketPurchaseAmount implements Parcelable {

    public static abstract class Builder {
        public abstract TicketPurchaseAmount build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mDetails(TicketPurchaseAmountDetails ticketPurchaseAmountDetails);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TicketPurchaseAmount.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TicketPurchaseAmount.GsonTypeAdapter(jVar);
    }

    public String getConvenienceFeeFormattedValue() {
        if (mDetails() == null) {
            return null;
        }
        return C.v(mDetails().mFee());
    }

    public String getCurrencyFormattedConvenienceFee() {
        if (C.e(mDetails()) || C.e(mDetails().mSubtotal())) {
            return "";
        }
        return mCurrency() + Global.BLANK + C.v(mDetails().mFee());
    }

    public String getCurrencyFormattedFare() {
        if (C.e(mDetails()) || C.e(mDetails().mSubtotal())) {
            return "";
        }
        return mCurrency() + Global.BLANK + C.v(mDetails().mSubtotal());
    }

    public String getCurrencyFormattedValue() {
        return mCurrency() + Global.BLANK + C.v(mValue());
    }

    public String getFareFormattedValue() {
        if (mDetails() == null) {
            return null;
        }
        return C.v(mDetails().mSubtotal());
    }

    public String getFormattedValue() {
        return C.v(mValue());
    }

    public Double getValueAsDouble() {
        return Double.valueOf(Double.parseDouble(mValue()));
    }

    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @Nullable
    @InterfaceC1498b("details")
    public abstract TicketPurchaseAmountDetails mDetails();

    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
