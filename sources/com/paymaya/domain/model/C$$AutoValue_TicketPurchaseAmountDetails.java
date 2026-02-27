package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.TicketPurchaseAmountDetails;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseAmountDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TicketPurchaseAmountDetails extends TicketPurchaseAmountDetails {
    private final String mFee;
    private final String mSubtotal;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseAmountDetails$Builder */
    public static class Builder extends TicketPurchaseAmountDetails.Builder {
        private String mFee;
        private String mSubtotal;

        public /* synthetic */ Builder(TicketPurchaseAmountDetails ticketPurchaseAmountDetails, int i) {
            this(ticketPurchaseAmountDetails);
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails.Builder
        public TicketPurchaseAmountDetails build() {
            return new AutoValue_TicketPurchaseAmountDetails(this.mFee, this.mSubtotal);
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails.Builder
        public TicketPurchaseAmountDetails.Builder mFee(String str) {
            this.mFee = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails.Builder
        public TicketPurchaseAmountDetails.Builder mSubtotal(String str) {
            this.mSubtotal = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TicketPurchaseAmountDetails ticketPurchaseAmountDetails) {
            this.mFee = ticketPurchaseAmountDetails.mFee();
            this.mSubtotal = ticketPurchaseAmountDetails.mSubtotal();
        }
    }

    public C$$AutoValue_TicketPurchaseAmountDetails(@Nullable String str, @Nullable String str2) {
        this.mFee = str;
        this.mSubtotal = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TicketPurchaseAmountDetails) {
            TicketPurchaseAmountDetails ticketPurchaseAmountDetails = (TicketPurchaseAmountDetails) obj;
            String str = this.mFee;
            if (str != null ? str.equals(ticketPurchaseAmountDetails.mFee()) : ticketPurchaseAmountDetails.mFee() == null) {
                String str2 = this.mSubtotal;
                if (str2 != null ? str2.equals(ticketPurchaseAmountDetails.mSubtotal()) : ticketPurchaseAmountDetails.mSubtotal() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mFee;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mSubtotal;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails
    @Nullable
    @InterfaceC1498b("fee")
    public String mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails
    @Nullable
    @InterfaceC1498b("subtotal")
    public String mSubtotal() {
        return this.mSubtotal;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseAmountDetails
    public TicketPurchaseAmountDetails.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TicketPurchaseAmountDetails{mFee=");
        sb2.append(this.mFee);
        sb2.append(", mSubtotal=");
        return s.p(sb2, this.mSubtotal, "}");
    }
}
