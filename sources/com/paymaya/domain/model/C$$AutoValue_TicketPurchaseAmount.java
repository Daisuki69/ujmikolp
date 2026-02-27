package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.TicketPurchaseAmount;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseAmount, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TicketPurchaseAmount extends TicketPurchaseAmount {
    private final String mCurrency;
    private final TicketPurchaseAmountDetails mDetails;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseAmount$Builder */
    public static class Builder extends TicketPurchaseAmount.Builder {
        private String mCurrency;
        private TicketPurchaseAmountDetails mDetails;
        private String mValue;

        public /* synthetic */ Builder(TicketPurchaseAmount ticketPurchaseAmount, int i) {
            this(ticketPurchaseAmount);
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmount.Builder
        public TicketPurchaseAmount build() {
            String strI = this.mValue == null ? " mValue" : "";
            if (this.mCurrency == null) {
                strI = s.i(strI, " mCurrency");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TicketPurchaseAmount(this.mValue, this.mCurrency, this.mDetails);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmount.Builder
        public TicketPurchaseAmount.Builder mCurrency(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCurrency");
            }
            this.mCurrency = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmount.Builder
        public TicketPurchaseAmount.Builder mDetails(TicketPurchaseAmountDetails ticketPurchaseAmountDetails) {
            this.mDetails = ticketPurchaseAmountDetails;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmount.Builder
        public TicketPurchaseAmount.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TicketPurchaseAmount ticketPurchaseAmount) {
            this.mValue = ticketPurchaseAmount.mValue();
            this.mCurrency = ticketPurchaseAmount.mCurrency();
            this.mDetails = ticketPurchaseAmount.mDetails();
        }
    }

    public C$$AutoValue_TicketPurchaseAmount(String str, String str2, @Nullable TicketPurchaseAmountDetails ticketPurchaseAmountDetails) {
        if (str == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCurrency");
        }
        this.mCurrency = str2;
        this.mDetails = ticketPurchaseAmountDetails;
    }

    public boolean equals(Object obj) {
        TicketPurchaseAmountDetails ticketPurchaseAmountDetails;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TicketPurchaseAmount) {
            TicketPurchaseAmount ticketPurchaseAmount = (TicketPurchaseAmount) obj;
            if (this.mValue.equals(ticketPurchaseAmount.mValue()) && this.mCurrency.equals(ticketPurchaseAmount.mCurrency()) && ((ticketPurchaseAmountDetails = this.mDetails) != null ? ticketPurchaseAmountDetails.equals(ticketPurchaseAmount.mDetails()) : ticketPurchaseAmount.mDetails() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mValue.hashCode() ^ 1000003) * 1000003) ^ this.mCurrency.hashCode()) * 1000003;
        TicketPurchaseAmountDetails ticketPurchaseAmountDetails = this.mDetails;
        return iHashCode ^ (ticketPurchaseAmountDetails == null ? 0 : ticketPurchaseAmountDetails.hashCode());
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmount
    @InterfaceC1498b("currency")
    public String mCurrency() {
        return this.mCurrency;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmount
    @Nullable
    @InterfaceC1498b("details")
    public TicketPurchaseAmountDetails mDetails() {
        return this.mDetails;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmount
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmount
    public TicketPurchaseAmount.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "TicketPurchaseAmount{mValue=" + this.mValue + ", mCurrency=" + this.mCurrency + ", mDetails=" + this.mDetails + "}";
    }
}
