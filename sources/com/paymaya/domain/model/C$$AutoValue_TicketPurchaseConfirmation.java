package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import g3.InterfaceC1498b;
import java.util.Map;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseConfirmation, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TicketPurchaseConfirmation extends TicketPurchaseConfirmation {
    private final TicketPurchaseAmount mAmount;
    private final String mId;
    private final TicketPurchaseIssuer mIssuer;
    private final Map<String, String> mMeta;
    private final Operator mOperator;
    private final Route mRoute;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseConfirmation$Builder */
    public static class Builder extends TicketPurchaseConfirmation.Builder {
        private TicketPurchaseAmount mAmount;
        private String mId;
        private TicketPurchaseIssuer mIssuer;
        private Map<String, String> mMeta;
        private Operator mOperator;
        private Route mRoute;

        public /* synthetic */ Builder(TicketPurchaseConfirmation ticketPurchaseConfirmation, int i) {
            this(ticketPurchaseConfirmation);
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation build() {
            String strI = this.mId == null ? " mId" : "";
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
                return new AutoValue_TicketPurchaseConfirmation(this.mId, this.mIssuer, this.mOperator, this.mRoute, this.mAmount, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mAmount(TicketPurchaseAmount ticketPurchaseAmount) {
            if (ticketPurchaseAmount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = ticketPurchaseAmount;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mIssuer(TicketPurchaseIssuer ticketPurchaseIssuer) {
            if (ticketPurchaseIssuer == null) {
                throw new NullPointerException("Null mIssuer");
            }
            this.mIssuer = ticketPurchaseIssuer;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mMeta(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null mMeta");
            }
            this.mMeta = map;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mOperator(Operator operator) {
            if (operator == null) {
                throw new NullPointerException("Null mOperator");
            }
            this.mOperator = operator;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseConfirmation.Builder
        public TicketPurchaseConfirmation.Builder mRoute(Route route) {
            if (route == null) {
                throw new NullPointerException("Null mRoute");
            }
            this.mRoute = route;
            return this;
        }

        public Builder() {
        }

        private Builder(TicketPurchaseConfirmation ticketPurchaseConfirmation) {
            this.mId = ticketPurchaseConfirmation.mId();
            this.mIssuer = ticketPurchaseConfirmation.mIssuer();
            this.mOperator = ticketPurchaseConfirmation.mOperator();
            this.mRoute = ticketPurchaseConfirmation.mRoute();
            this.mAmount = ticketPurchaseConfirmation.mAmount();
            this.mMeta = ticketPurchaseConfirmation.mMeta();
        }
    }

    public C$$AutoValue_TicketPurchaseConfirmation(String str, TicketPurchaseIssuer ticketPurchaseIssuer, Operator operator, Route route, TicketPurchaseAmount ticketPurchaseAmount, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
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
        if (obj instanceof TicketPurchaseConfirmation) {
            TicketPurchaseConfirmation ticketPurchaseConfirmation = (TicketPurchaseConfirmation) obj;
            if (this.mId.equals(ticketPurchaseConfirmation.mId()) && this.mIssuer.equals(ticketPurchaseConfirmation.mIssuer()) && this.mOperator.equals(ticketPurchaseConfirmation.mOperator()) && this.mRoute.equals(ticketPurchaseConfirmation.mRoute()) && this.mAmount.equals(ticketPurchaseConfirmation.mAmount()) && this.mMeta.equals(ticketPurchaseConfirmation.mMeta())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mIssuer.hashCode()) * 1000003) ^ this.mOperator.hashCode()) * 1000003) ^ this.mRoute.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003) ^ this.mMeta.hashCode();
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b("total_amount")
    public TicketPurchaseAmount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b("issuer")
    public TicketPurchaseIssuer mIssuer() {
        return this.mIssuer;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b("meta")
    public Map<String, String> mMeta() {
        return this.mMeta;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b("operator")
    public Operator mOperator() {
        return this.mOperator;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    @InterfaceC1498b("route")
    public Route mRoute() {
        return this.mRoute;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseConfirmation
    public TicketPurchaseConfirmation.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "TicketPurchaseConfirmation{mId=" + this.mId + ", mIssuer=" + this.mIssuer + ", mOperator=" + this.mOperator + ", mRoute=" + this.mRoute + ", mAmount=" + this.mAmount + ", mMeta=" + this.mMeta + "}";
    }
}
