package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BillerV3Transaction implements Parcelable {
    public static final Parcelable.Creator<BillerV3Transaction> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount_breakdown")
    private final AmountBreakdown amountBreakdown;

    @InterfaceC1497a
    @InterfaceC1498b("bill_payment_id")
    private final String billPaymentId;

    @InterfaceC1497a
    @InterfaceC1498b("biller")
    private final BillerDetails biller;

    @InterfaceC1497a
    @InterfaceC1498b("created_date")
    private final String createdDate;

    @InterfaceC1497a
    @InterfaceC1498b("payment")
    private final BillerTransactionPayment payment;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("total_amount")
    private final Amount totalAmount;

    public static final class AmountBreakdown implements Parcelable {
        public static final Parcelable.Creator<AmountBreakdown> CREATOR = new Creator();

        @InterfaceC1497a
        @InterfaceC1498b(TtmlNode.RUBY_BASE)
        private final Amount base;

        @InterfaceC1497a
        @InterfaceC1498b("fee")
        private final Amount fee;

        public static final class Creator implements Parcelable.Creator<AmountBreakdown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmountBreakdown createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                return new AmountBreakdown((Amount) parcel.readParcelable(AmountBreakdown.class.getClassLoader()), (Amount) parcel.readParcelable(AmountBreakdown.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmountBreakdown[] newArray(int i) {
                return new AmountBreakdown[i];
            }
        }

        public AmountBreakdown(Amount base, Amount fee) {
            j.g(base, "base");
            j.g(fee, "fee");
            this.base = base;
            this.fee = fee;
        }

        public static /* synthetic */ AmountBreakdown copy$default(AmountBreakdown amountBreakdown, Amount amount, Amount amount2, int i, Object obj) {
            if ((i & 1) != 0) {
                amount = amountBreakdown.base;
            }
            if ((i & 2) != 0) {
                amount2 = amountBreakdown.fee;
            }
            return amountBreakdown.copy(amount, amount2);
        }

        public final Amount component1() {
            return this.base;
        }

        public final Amount component2() {
            return this.fee;
        }

        public final AmountBreakdown copy(Amount base, Amount fee) {
            j.g(base, "base");
            j.g(fee, "fee");
            return new AmountBreakdown(base, fee);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountBreakdown)) {
                return false;
            }
            AmountBreakdown amountBreakdown = (AmountBreakdown) obj;
            return j.b(this.base, amountBreakdown.base) && j.b(this.fee, amountBreakdown.fee);
        }

        public final Amount getBase() {
            return this.base;
        }

        public final Amount getFee() {
            return this.fee;
        }

        public int hashCode() {
            return this.fee.hashCode() + (this.base.hashCode() * 31);
        }

        public String toString() {
            return "AmountBreakdown(base=" + this.base + ", fee=" + this.fee + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeParcelable(this.base, i);
            dest.writeParcelable(this.fee, i);
        }
    }

    public static final class Creator implements Parcelable.Creator<BillerV3Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerV3Transaction createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BillerV3Transaction(parcel.readString(), (BillerDetails) parcel.readParcelable(BillerV3Transaction.class.getClassLoader()), (Amount) parcel.readParcelable(BillerV3Transaction.class.getClassLoader()), AmountBreakdown.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BillerTransactionPayment.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerV3Transaction[] newArray(int i) {
            return new BillerV3Transaction[i];
        }
    }

    public BillerV3Transaction(String str, BillerDetails biller, Amount totalAmount, AmountBreakdown amountBreakdown, String str2, BillerTransactionPayment billerTransactionPayment, String str3) {
        j.g(biller, "biller");
        j.g(totalAmount, "totalAmount");
        j.g(amountBreakdown, "amountBreakdown");
        this.billPaymentId = str;
        this.biller = biller;
        this.totalAmount = totalAmount;
        this.amountBreakdown = amountBreakdown;
        this.status = str2;
        this.payment = billerTransactionPayment;
        this.createdDate = str3;
    }

    public static /* synthetic */ BillerV3Transaction copy$default(BillerV3Transaction billerV3Transaction, String str, BillerDetails billerDetails, Amount amount, AmountBreakdown amountBreakdown, String str2, BillerTransactionPayment billerTransactionPayment, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billerV3Transaction.billPaymentId;
        }
        if ((i & 2) != 0) {
            billerDetails = billerV3Transaction.biller;
        }
        if ((i & 4) != 0) {
            amount = billerV3Transaction.totalAmount;
        }
        if ((i & 8) != 0) {
            amountBreakdown = billerV3Transaction.amountBreakdown;
        }
        if ((i & 16) != 0) {
            str2 = billerV3Transaction.status;
        }
        if ((i & 32) != 0) {
            billerTransactionPayment = billerV3Transaction.payment;
        }
        if ((i & 64) != 0) {
            str3 = billerV3Transaction.createdDate;
        }
        BillerTransactionPayment billerTransactionPayment2 = billerTransactionPayment;
        String str4 = str3;
        String str5 = str2;
        Amount amount2 = amount;
        return billerV3Transaction.copy(str, billerDetails, amount2, amountBreakdown, str5, billerTransactionPayment2, str4);
    }

    public final String component1() {
        return this.billPaymentId;
    }

    public final BillerDetails component2() {
        return this.biller;
    }

    public final Amount component3() {
        return this.totalAmount;
    }

    public final AmountBreakdown component4() {
        return this.amountBreakdown;
    }

    public final String component5() {
        return this.status;
    }

    public final BillerTransactionPayment component6() {
        return this.payment;
    }

    public final String component7() {
        return this.createdDate;
    }

    public final BillerTransaction convertToBillerTransaction() {
        BillerTransaction billerTransactionBuild = BillerTransaction.sBuilder().mBillPaymentId(this.billPaymentId).mBiller(this.biller).mAmount(this.amountBreakdown.getBase()).mFee(this.amountBreakdown.getFee()).mTotalAmount(this.totalAmount).mStatus(this.status).mBillerTransactionPayment(this.payment).mTotalAmount(this.totalAmount).mCreatedDate(this.createdDate).build();
        j.f(billerTransactionBuild, "build(...)");
        return billerTransactionBuild;
    }

    public final BillerV3Transaction copy(String str, BillerDetails biller, Amount totalAmount, AmountBreakdown amountBreakdown, String str2, BillerTransactionPayment billerTransactionPayment, String str3) {
        j.g(biller, "biller");
        j.g(totalAmount, "totalAmount");
        j.g(amountBreakdown, "amountBreakdown");
        return new BillerV3Transaction(str, biller, totalAmount, amountBreakdown, str2, billerTransactionPayment, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillerV3Transaction)) {
            return false;
        }
        BillerV3Transaction billerV3Transaction = (BillerV3Transaction) obj;
        return j.b(this.billPaymentId, billerV3Transaction.billPaymentId) && j.b(this.biller, billerV3Transaction.biller) && j.b(this.totalAmount, billerV3Transaction.totalAmount) && j.b(this.amountBreakdown, billerV3Transaction.amountBreakdown) && j.b(this.status, billerV3Transaction.status) && j.b(this.payment, billerV3Transaction.payment) && j.b(this.createdDate, billerV3Transaction.createdDate);
    }

    public final AmountBreakdown getAmountBreakdown() {
        return this.amountBreakdown;
    }

    public final String getBillPaymentId() {
        return this.billPaymentId;
    }

    public final BillerDetails getBiller() {
        return this.biller;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final BillerTransactionPayment getPayment() {
        return this.payment;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.billPaymentId;
        int iHashCode = (this.amountBreakdown.hashCode() + ((this.totalAmount.hashCode() + ((this.biller.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillerTransactionPayment billerTransactionPayment = this.payment;
        int iHashCode3 = (iHashCode2 + (billerTransactionPayment == null ? 0 : billerTransactionPayment.hashCode())) * 31;
        String str3 = this.createdDate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.billPaymentId;
        BillerDetails billerDetails = this.biller;
        Amount amount = this.totalAmount;
        AmountBreakdown amountBreakdown = this.amountBreakdown;
        String str2 = this.status;
        BillerTransactionPayment billerTransactionPayment = this.payment;
        String str3 = this.createdDate;
        StringBuilder sb2 = new StringBuilder("BillerV3Transaction(billPaymentId=");
        sb2.append(str);
        sb2.append(", biller=");
        sb2.append(billerDetails);
        sb2.append(", totalAmount=");
        sb2.append(amount);
        sb2.append(", amountBreakdown=");
        sb2.append(amountBreakdown);
        sb2.append(", status=");
        sb2.append(str2);
        sb2.append(", payment=");
        sb2.append(billerTransactionPayment);
        sb2.append(", createdDate=");
        return s.p(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.billPaymentId);
        dest.writeParcelable(this.biller, i);
        dest.writeParcelable(this.totalAmount, i);
        this.amountBreakdown.writeToParcel(dest, i);
        dest.writeString(this.status);
        BillerTransactionPayment billerTransactionPayment = this.payment;
        if (billerTransactionPayment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billerTransactionPayment.writeToParcel(dest, i);
        }
        dest.writeString(this.createdDate);
    }

    public /* synthetic */ BillerV3Transaction(String str, BillerDetails billerDetails, Amount amount, AmountBreakdown amountBreakdown, String str2, BillerTransactionPayment billerTransactionPayment, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, billerDetails, amount, amountBreakdown, str2, (i & 32) != 0 ? null : billerTransactionPayment, (i & 64) != 0 ? null : str3);
    }
}
