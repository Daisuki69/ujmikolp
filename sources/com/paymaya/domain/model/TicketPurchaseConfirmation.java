package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TicketPurchaseConfirmation;
import com.paymaya.domain.model.C$AutoValue_TicketPurchaseConfirmation;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TicketPurchaseConfirmation implements Parcelable {

    public static abstract class Builder {
        public abstract TicketPurchaseConfirmation build();

        public abstract Builder mAmount(TicketPurchaseAmount ticketPurchaseAmount);

        public abstract Builder mId(String str);

        public abstract Builder mIssuer(TicketPurchaseIssuer ticketPurchaseIssuer);

        public abstract Builder mMeta(Map<String, String> map);

        public abstract Builder mOperator(Operator operator);

        public abstract Builder mRoute(Route route);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TicketPurchaseConfirmation.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TicketPurchaseConfirmation.GsonTypeAdapter(jVar);
    }

    public String getConvenienceFeeAmount() {
        return mAmount().mDetails().getFeeFormattedValue();
    }

    public String getDestinationName() {
        return mRoute().mDestination().mName();
    }

    public String getFareAmount() {
        return mAmount().mDetails().getSubtotalFormattedValue();
    }

    public String getOperatorName() {
        return mOperator().mName();
    }

    public String getOriginName() {
        return mRoute().mOrigin().mName();
    }

    public String getRouteName() {
        return mRoute().mName();
    }

    public String getTotalAmount() {
        return mAmount().getFormattedValue();
    }

    @InterfaceC1498b("total_amount")
    public abstract TicketPurchaseAmount mAmount();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("issuer")
    public abstract TicketPurchaseIssuer mIssuer();

    @InterfaceC1498b("meta")
    public abstract Map<String, String> mMeta();

    @InterfaceC1498b("operator")
    public abstract Operator mOperator();

    @InterfaceC1498b("route")
    public abstract Route mRoute();

    public abstract Builder toBuilder();
}
