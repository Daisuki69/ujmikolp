package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHMerchantPaymentTransaction implements Parcelable {
    public static final Parcelable.Creator<QRPHMerchantPaymentTransaction> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("balance")
    private final AccountBalance accountBalance;

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private Amount amount;

    @InterfaceC1497a
    @InterfaceC1498b("auth_challenge_id")
    private final String authChallengeId;

    @InterfaceC1497a
    @InterfaceC1498b("merchant")
    private final QRPHMerchantDetails merchantDetails;

    @InterfaceC1497a
    @InterfaceC1498b("payment_token")
    private final PaymentToken paymentToken;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<QRPHMerchantPaymentTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantPaymentTransaction createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new QRPHMerchantPaymentTransaction(PaymentToken.CREATOR.createFromParcel(parcel), (Amount) parcel.readParcelable(QRPHMerchantPaymentTransaction.class.getClassLoader()), QRPHMerchantDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (AccountBalance) parcel.readParcelable(QRPHMerchantPaymentTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantPaymentTransaction[] newArray(int i) {
            return new QRPHMerchantPaymentTransaction[i];
        }
    }

    public QRPHMerchantPaymentTransaction(PaymentToken paymentToken, Amount amount, QRPHMerchantDetails merchantDetails, String str, String str2, AccountBalance accountBalance) {
        j.g(paymentToken, "paymentToken");
        j.g(amount, "amount");
        j.g(merchantDetails, "merchantDetails");
        this.paymentToken = paymentToken;
        this.amount = amount;
        this.merchantDetails = merchantDetails;
        this.status = str;
        this.authChallengeId = str2;
        this.accountBalance = accountBalance;
    }

    public static /* synthetic */ QRPHMerchantPaymentTransaction copy$default(QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction, PaymentToken paymentToken, Amount amount, QRPHMerchantDetails qRPHMerchantDetails, String str, String str2, AccountBalance accountBalance, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentToken = qRPHMerchantPaymentTransaction.paymentToken;
        }
        if ((i & 2) != 0) {
            amount = qRPHMerchantPaymentTransaction.amount;
        }
        if ((i & 4) != 0) {
            qRPHMerchantDetails = qRPHMerchantPaymentTransaction.merchantDetails;
        }
        if ((i & 8) != 0) {
            str = qRPHMerchantPaymentTransaction.status;
        }
        if ((i & 16) != 0) {
            str2 = qRPHMerchantPaymentTransaction.authChallengeId;
        }
        if ((i & 32) != 0) {
            accountBalance = qRPHMerchantPaymentTransaction.accountBalance;
        }
        String str3 = str2;
        AccountBalance accountBalance2 = accountBalance;
        return qRPHMerchantPaymentTransaction.copy(paymentToken, amount, qRPHMerchantDetails, str, str3, accountBalance2);
    }

    public final PaymentToken component1() {
        return this.paymentToken;
    }

    public final Amount component2() {
        return this.amount;
    }

    public final QRPHMerchantDetails component3() {
        return this.merchantDetails;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.authChallengeId;
    }

    public final AccountBalance component6() {
        return this.accountBalance;
    }

    public final QRPHMerchantPaymentTransaction copy(PaymentToken paymentToken, Amount amount, QRPHMerchantDetails merchantDetails, String str, String str2, AccountBalance accountBalance) {
        j.g(paymentToken, "paymentToken");
        j.g(amount, "amount");
        j.g(merchantDetails, "merchantDetails");
        return new QRPHMerchantPaymentTransaction(paymentToken, amount, merchantDetails, str, str2, accountBalance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHMerchantPaymentTransaction)) {
            return false;
        }
        QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = (QRPHMerchantPaymentTransaction) obj;
        return j.b(this.paymentToken, qRPHMerchantPaymentTransaction.paymentToken) && j.b(this.amount, qRPHMerchantPaymentTransaction.amount) && j.b(this.merchantDetails, qRPHMerchantPaymentTransaction.merchantDetails) && j.b(this.status, qRPHMerchantPaymentTransaction.status) && j.b(this.authChallengeId, qRPHMerchantPaymentTransaction.authChallengeId) && j.b(this.accountBalance, qRPHMerchantPaymentTransaction.accountBalance);
    }

    public final AccountBalance getAccountBalance() {
        return this.accountBalance;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getAuthChallengeId() {
        return this.authChallengeId;
    }

    public final QRPHMerchantDetails getMerchantDetails() {
        return this.merchantDetails;
    }

    public final PaymentToken getPaymentToken() {
        return this.paymentToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.merchantDetails.hashCode() + ((this.amount.hashCode() + (this.paymentToken.hashCode() * 31)) * 31)) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authChallengeId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountBalance accountBalance = this.accountBalance;
        return iHashCode3 + (accountBalance != null ? accountBalance.hashCode() : 0);
    }

    public final void setAmount(Amount amount) {
        j.g(amount, "<set-?>");
        this.amount = amount;
    }

    public String toString() {
        return "QRPHMerchantPaymentTransaction(paymentToken=" + this.paymentToken + ", amount=" + this.amount + ", merchantDetails=" + this.merchantDetails + ", status=" + this.status + ", authChallengeId=" + this.authChallengeId + ", accountBalance=" + this.accountBalance + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.paymentToken.writeToParcel(dest, i);
        dest.writeParcelable(this.amount, i);
        this.merchantDetails.writeToParcel(dest, i);
        dest.writeString(this.status);
        dest.writeString(this.authChallengeId);
        dest.writeParcelable(this.accountBalance, i);
    }
}
