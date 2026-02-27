package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.PurchasedTicket;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PurchasedTicket, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PurchasedTicket extends PurchasedTicket {
    private final TicketPurchaseAmount mAmount;
    private final String mData;
    private final String mDateIssued;
    private final String mId;
    private final TicketPurchaseIssuer mIssuer;
    private final Map<String, String> mMeta;
    private final String mNumber;
    private final Operator mOperator;
    private final String mRequestReferenceNo;
    private final Route mRoute;
    private final int mValidity;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PurchasedTicket$Builder */
    public static class Builder extends PurchasedTicket.Builder {
        private TicketPurchaseAmount mAmount;
        private String mData;
        private String mDateIssued;
        private String mId;
        private TicketPurchaseIssuer mIssuer;
        private Map<String, String> mMeta;
        private String mNumber;
        private Operator mOperator;
        private String mRequestReferenceNo;
        private Route mRoute;
        private Integer mValidity;

        public /* synthetic */ Builder(PurchasedTicket purchasedTicket, int i) {
            this(purchasedTicket);
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mRequestReferenceNo == null) {
                strI = s.i(strI, " mRequestReferenceNo");
            }
            if (this.mNumber == null) {
                strI = s.i(strI, " mNumber");
            }
            if (this.mDateIssued == null) {
                strI = s.i(strI, " mDateIssued");
            }
            if (this.mValidity == null) {
                strI = s.i(strI, " mValidity");
            }
            if (this.mData == null) {
                strI = s.i(strI, " mData");
            }
            if (this.mIssuer == null) {
                strI = s.i(strI, " mIssuer");
            }
            if (this.mOperator == null) {
                strI = s.i(strI, " mOperator");
            }
            if (this.mRoute == null) {
                strI = s.i(strI, " mRoute");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (this.mMeta == null) {
                strI = s.i(strI, " mMeta");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PurchasedTicket(this.mId, this.mRequestReferenceNo, this.mNumber, this.mDateIssued, this.mValidity.intValue(), this.mData, this.mIssuer, this.mOperator, this.mRoute, this.mAmount, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mAmount(TicketPurchaseAmount ticketPurchaseAmount) {
            if (ticketPurchaseAmount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = ticketPurchaseAmount;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mData(String str) {
            if (str == null) {
                throw new NullPointerException("Null mData");
            }
            this.mData = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mDateIssued(String str) {
            if (str == null) {
                throw new NullPointerException("Null mDateIssued");
            }
            this.mDateIssued = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mIssuer(TicketPurchaseIssuer ticketPurchaseIssuer) {
            if (ticketPurchaseIssuer == null) {
                throw new NullPointerException("Null mIssuer");
            }
            this.mIssuer = ticketPurchaseIssuer;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mMeta(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null mMeta");
            }
            this.mMeta = map;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mNumber");
            }
            this.mNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mOperator(Operator operator) {
            if (operator == null) {
                throw new NullPointerException("Null mOperator");
            }
            this.mOperator = operator;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mRequestReferenceNo(String str) {
            if (str == null) {
                throw new NullPointerException("Null mRequestReferenceNo");
            }
            this.mRequestReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mRoute(Route route) {
            if (route == null) {
                throw new NullPointerException("Null mRoute");
            }
            this.mRoute = route;
            return this;
        }

        @Override // com.paymaya.domain.model.PurchasedTicket.Builder
        public PurchasedTicket.Builder mValidity(int i) {
            this.mValidity = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(PurchasedTicket purchasedTicket) {
            this.mId = purchasedTicket.mId();
            this.mRequestReferenceNo = purchasedTicket.mRequestReferenceNo();
            this.mNumber = purchasedTicket.mNumber();
            this.mDateIssued = purchasedTicket.mDateIssued();
            this.mValidity = Integer.valueOf(purchasedTicket.mValidity());
            this.mData = purchasedTicket.mData();
            this.mIssuer = purchasedTicket.mIssuer();
            this.mOperator = purchasedTicket.mOperator();
            this.mRoute = purchasedTicket.mRoute();
            this.mAmount = purchasedTicket.mAmount();
            this.mMeta = purchasedTicket.mMeta();
        }
    }

    public C$$AutoValue_PurchasedTicket(String str, String str2, String str3, String str4, int i, String str5, TicketPurchaseIssuer ticketPurchaseIssuer, Operator operator, Route route, TicketPurchaseAmount ticketPurchaseAmount, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mRequestReferenceNo");
        }
        this.mRequestReferenceNo = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mNumber");
        }
        this.mNumber = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mDateIssued");
        }
        this.mDateIssued = str4;
        this.mValidity = i;
        if (str5 == null) {
            throw new NullPointerException("Null mData");
        }
        this.mData = str5;
        if (ticketPurchaseIssuer == null) {
            throw new NullPointerException("Null mIssuer");
        }
        this.mIssuer = ticketPurchaseIssuer;
        if (operator == null) {
            throw new NullPointerException("Null mOperator");
        }
        this.mOperator = operator;
        if (route == null) {
            throw new NullPointerException("Null mRoute");
        }
        this.mRoute = route;
        if (ticketPurchaseAmount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = ticketPurchaseAmount;
        if (map == null) {
            throw new NullPointerException("Null mMeta");
        }
        this.mMeta = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PurchasedTicket) {
            PurchasedTicket purchasedTicket = (PurchasedTicket) obj;
            if (this.mId.equals(purchasedTicket.mId()) && this.mRequestReferenceNo.equals(purchasedTicket.mRequestReferenceNo()) && this.mNumber.equals(purchasedTicket.mNumber()) && this.mDateIssued.equals(purchasedTicket.mDateIssued()) && this.mValidity == purchasedTicket.mValidity() && this.mData.equals(purchasedTicket.mData()) && this.mIssuer.equals(purchasedTicket.mIssuer()) && this.mOperator.equals(purchasedTicket.mOperator()) && this.mRoute.equals(purchasedTicket.mRoute()) && this.mAmount.equals(purchasedTicket.mAmount()) && this.mMeta.equals(purchasedTicket.mMeta())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mRequestReferenceNo.hashCode()) * 1000003) ^ this.mNumber.hashCode()) * 1000003) ^ this.mDateIssued.hashCode()) * 1000003) ^ this.mValidity) * 1000003) ^ this.mData.hashCode()) * 1000003) ^ this.mIssuer.hashCode()) * 1000003) ^ this.mOperator.hashCode()) * 1000003) ^ this.mRoute.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003) ^ this.mMeta.hashCode();
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("total_amount")
    public TicketPurchaseAmount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("data")
    public String mData() {
        return this.mData;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("date_issued")
    public String mDateIssued() {
        return this.mDateIssued;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("issuer")
    public TicketPurchaseIssuer mIssuer() {
        return this.mIssuer;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("meta")
    public Map<String, String> mMeta() {
        return this.mMeta;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("number")
    public String mNumber() {
        return this.mNumber;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("operator")
    public Operator mOperator() {
        return this.mOperator;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("route")
    public Route mRoute() {
        return this.mRoute;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    @InterfaceC1498b("validity")
    public int mValidity() {
        return this.mValidity;
    }

    @Override // com.paymaya.domain.model.PurchasedTicket
    public PurchasedTicket.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "PurchasedTicket{mId=" + this.mId + ", mRequestReferenceNo=" + this.mRequestReferenceNo + ", mNumber=" + this.mNumber + ", mDateIssued=" + this.mDateIssued + ", mValidity=" + this.mValidity + ", mData=" + this.mData + ", mIssuer=" + this.mIssuer + ", mOperator=" + this.mOperator + ", mRoute=" + this.mRoute + ", mAmount=" + this.mAmount + ", mMeta=" + this.mMeta + "}";
    }
}
