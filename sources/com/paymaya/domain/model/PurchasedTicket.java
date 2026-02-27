package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PurchasedTicket;
import com.paymaya.domain.model.C$AutoValue_PurchasedTicket;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PurchasedTicket implements Parcelable {

    public static abstract class Builder {
        public abstract PurchasedTicket build();

        public abstract Builder mAmount(TicketPurchaseAmount ticketPurchaseAmount);

        public abstract Builder mData(String str);

        public abstract Builder mDateIssued(String str);

        public abstract Builder mId(String str);

        public abstract Builder mIssuer(TicketPurchaseIssuer ticketPurchaseIssuer);

        public abstract Builder mMeta(Map<String, String> map);

        public abstract Builder mNumber(String str);

        public abstract Builder mOperator(Operator operator);

        public abstract Builder mRequestReferenceNo(String str);

        public abstract Builder mRoute(Route route);

        public abstract Builder mValidity(int i);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PurchasedTicket.Builder().mValidity(0);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PurchasedTicket.GsonTypeAdapter(jVar);
    }

    public String getDestinationName() {
        return mRoute().mDestination().mName();
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

    @InterfaceC1498b("total_amount")
    public abstract TicketPurchaseAmount mAmount();

    @InterfaceC1498b("data")
    public abstract String mData();

    @InterfaceC1498b("date_issued")
    public abstract String mDateIssued();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("issuer")
    public abstract TicketPurchaseIssuer mIssuer();

    @InterfaceC1498b("meta")
    public abstract Map<String, String> mMeta();

    @InterfaceC1498b("number")
    public abstract String mNumber();

    @InterfaceC1498b("operator")
    public abstract Operator mOperator();

    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @InterfaceC1498b("route")
    public abstract Route mRoute();

    @InterfaceC1498b("validity")
    public abstract int mValidity();

    public abstract Builder toBuilder();
}
