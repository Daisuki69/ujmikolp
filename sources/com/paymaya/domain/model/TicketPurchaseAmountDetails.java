package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_TicketPurchaseAmountDetails;
import com.paymaya.domain.model.C$AutoValue_TicketPurchaseAmountDetails;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TicketPurchaseAmountDetails implements Parcelable {

    public static abstract class Builder {
        public abstract TicketPurchaseAmountDetails build();

        public abstract Builder mFee(String str);

        public abstract Builder mSubtotal(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TicketPurchaseAmountDetails.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TicketPurchaseAmountDetails.GsonTypeAdapter(jVar);
    }

    public String getFeeFormattedValue() {
        return C.v(mFee());
    }

    public String getSubtotalFormattedValue() {
        return C.v(mSubtotal());
    }

    @Nullable
    @InterfaceC1498b("fee")
    public abstract String mFee();

    @Nullable
    @InterfaceC1498b("subtotal")
    public abstract String mSubtotal();

    public abstract Builder toBuilder();
}
