package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class PullFundsDetails {
    public static final Companion Companion = new Companion(null);
    public static final String PAYMENT_STATUS_FAILED = "PAYMENT_FAILED";

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private final Amount amount;

    @InterfaceC1497a
    @InterfaceC1498b("card")
    private final PullFundsCard card;

    @InterfaceC1497a
    @InterfaceC1498b("created_date")
    private final String createdDate;

    @InterfaceC1497a
    @InterfaceC1498b(MediaRouteProviderProtocol.SERVICE_DATA_ERROR)
    private final PayMayaError error;

    @InterfaceC1497a
    @InterfaceC1498b("fees")
    private final Amount fees;

    @InterfaceC1497a
    @InterfaceC1498b("payment_id")
    private final String paymentId;

    @InterfaceC1497a
    @InterfaceC1498b("purchase_id")
    private final String purchaseId;

    @InterfaceC1497a
    @InterfaceC1498b("remarks")
    private final String remarks;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("transfer_id")
    private final String transferId;

    @InterfaceC1497a
    @InterfaceC1498b("updated_date")
    private final String updatedDate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PullFundsDetails(String purchaseId, String paymentId, String transferId, String status, PullFundsCard card, Amount amount, Amount fees, String str, String createdDate, String updatedDate, PayMayaError payMayaError) {
        j.g(purchaseId, "purchaseId");
        j.g(paymentId, "paymentId");
        j.g(transferId, "transferId");
        j.g(status, "status");
        j.g(card, "card");
        j.g(amount, "amount");
        j.g(fees, "fees");
        j.g(createdDate, "createdDate");
        j.g(updatedDate, "updatedDate");
        this.purchaseId = purchaseId;
        this.paymentId = paymentId;
        this.transferId = transferId;
        this.status = status;
        this.card = card;
        this.amount = amount;
        this.fees = fees;
        this.remarks = str;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.error = payMayaError;
    }

    public static /* synthetic */ PullFundsDetails copy$default(PullFundsDetails pullFundsDetails, String str, String str2, String str3, String str4, PullFundsCard pullFundsCard, Amount amount, Amount amount2, String str5, String str6, String str7, PayMayaError payMayaError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pullFundsDetails.purchaseId;
        }
        if ((i & 2) != 0) {
            str2 = pullFundsDetails.paymentId;
        }
        if ((i & 4) != 0) {
            str3 = pullFundsDetails.transferId;
        }
        if ((i & 8) != 0) {
            str4 = pullFundsDetails.status;
        }
        if ((i & 16) != 0) {
            pullFundsCard = pullFundsDetails.card;
        }
        if ((i & 32) != 0) {
            amount = pullFundsDetails.amount;
        }
        if ((i & 64) != 0) {
            amount2 = pullFundsDetails.fees;
        }
        if ((i & 128) != 0) {
            str5 = pullFundsDetails.remarks;
        }
        if ((i & 256) != 0) {
            str6 = pullFundsDetails.createdDate;
        }
        if ((i & 512) != 0) {
            str7 = pullFundsDetails.updatedDate;
        }
        if ((i & 1024) != 0) {
            payMayaError = pullFundsDetails.error;
        }
        String str8 = str7;
        PayMayaError payMayaError2 = payMayaError;
        String str9 = str5;
        String str10 = str6;
        Amount amount3 = amount;
        Amount amount4 = amount2;
        PullFundsCard pullFundsCard2 = pullFundsCard;
        String str11 = str3;
        return pullFundsDetails.copy(str, str2, str11, str4, pullFundsCard2, amount3, amount4, str9, str10, str8, payMayaError2);
    }

    public final String component1() {
        return this.purchaseId;
    }

    public final String component10() {
        return this.updatedDate;
    }

    public final PayMayaError component11() {
        return this.error;
    }

    public final String component2() {
        return this.paymentId;
    }

    public final String component3() {
        return this.transferId;
    }

    public final String component4() {
        return this.status;
    }

    public final PullFundsCard component5() {
        return this.card;
    }

    public final Amount component6() {
        return this.amount;
    }

    public final Amount component7() {
        return this.fees;
    }

    public final String component8() {
        return this.remarks;
    }

    public final String component9() {
        return this.createdDate;
    }

    public final PullFundsDetails copy(String purchaseId, String paymentId, String transferId, String status, PullFundsCard card, Amount amount, Amount fees, String str, String createdDate, String updatedDate, PayMayaError payMayaError) {
        j.g(purchaseId, "purchaseId");
        j.g(paymentId, "paymentId");
        j.g(transferId, "transferId");
        j.g(status, "status");
        j.g(card, "card");
        j.g(amount, "amount");
        j.g(fees, "fees");
        j.g(createdDate, "createdDate");
        j.g(updatedDate, "updatedDate");
        return new PullFundsDetails(purchaseId, paymentId, transferId, status, card, amount, fees, str, createdDate, updatedDate, payMayaError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullFundsDetails)) {
            return false;
        }
        PullFundsDetails pullFundsDetails = (PullFundsDetails) obj;
        return j.b(this.purchaseId, pullFundsDetails.purchaseId) && j.b(this.paymentId, pullFundsDetails.paymentId) && j.b(this.transferId, pullFundsDetails.transferId) && j.b(this.status, pullFundsDetails.status) && j.b(this.card, pullFundsDetails.card) && j.b(this.amount, pullFundsDetails.amount) && j.b(this.fees, pullFundsDetails.fees) && j.b(this.remarks, pullFundsDetails.remarks) && j.b(this.createdDate, pullFundsDetails.createdDate) && j.b(this.updatedDate, pullFundsDetails.updatedDate) && j.b(this.error, pullFundsDetails.error);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getAmountFormattedValue() {
        return this.amount.getCurrencyFormattedValue();
    }

    public final PullFundsCard getCard() {
        return this.card;
    }

    public final String getCardName() {
        return this.card.getCardName();
    }

    public final String getCardScheme() {
        return this.card.mScheme();
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final PayMayaError getError() {
        return this.error;
    }

    public final String getErrorSpiel() {
        PayMayaError payMayaError = this.error;
        if (payMayaError != null) {
            return payMayaError.mSpiel();
        }
        return null;
    }

    public final Amount getFees() {
        return this.fees;
    }

    public final String getFeesFormattedValue() {
        return this.fees.getCurrencyFormattedValue();
    }

    public final String getParsePurchaseId() {
        if (this.purchaseId.length() < 12) {
            return this.purchaseId;
        }
        String str = this.purchaseId;
        String strSubstring = str.substring(str.length() - 12);
        j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        int iHashCode = (this.fees.hashCode() + ((this.amount.hashCode() + ((this.card.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.purchaseId.hashCode() * 31, 31, this.paymentId), 31, this.transferId), 31, this.status)) * 31)) * 31)) * 31;
        String str = this.remarks;
        int iC = AbstractC1414e.c(AbstractC1414e.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdDate), 31, this.updatedDate);
        PayMayaError payMayaError = this.error;
        return iC + (payMayaError != null ? payMayaError.hashCode() : 0);
    }

    public String toString() {
        String str = this.purchaseId;
        String str2 = this.paymentId;
        String str3 = this.transferId;
        String str4 = this.status;
        PullFundsCard pullFundsCard = this.card;
        Amount amount = this.amount;
        Amount amount2 = this.fees;
        String str5 = this.remarks;
        String str6 = this.createdDate;
        String str7 = this.updatedDate;
        PayMayaError payMayaError = this.error;
        StringBuilder sbX = s.x("PullFundsDetails(purchaseId=", str, ", paymentId=", str2, ", transferId=");
        c.A(sbX, str3, ", status=", str4, ", card=");
        sbX.append(pullFundsCard);
        sbX.append(", amount=");
        sbX.append(amount);
        sbX.append(", fees=");
        sbX.append(amount2);
        sbX.append(", remarks=");
        sbX.append(str5);
        sbX.append(", createdDate=");
        c.A(sbX, str6, ", updatedDate=", str7, ", error=");
        sbX.append(payMayaError);
        sbX.append(")");
        return sbX.toString();
    }
}
