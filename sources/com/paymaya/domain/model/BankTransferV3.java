package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.BankAccount;
import com.paymaya.domain.model.BankTransferBank;
import com.paymaya.domain.model.BankTransferRecipient;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public final class BankTransferV3 implements Parcelable {
    public static final Parcelable.Creator<BankTransferV3> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private final Amount amount;

    @InterfaceC1497a
    @InterfaceC1498b("balance")
    private final AccountBalance balance;

    @InterfaceC1497a
    @InterfaceC1498b("fees")
    private final Amount fees;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("purpose")
    private final String purpose;

    @InterfaceC1497a
    @InterfaceC1498b("additional_data")
    private final QRPHAdditionalData qrphAdditionalData;

    @InterfaceC1497a
    @InterfaceC1498b("recipient")
    private final BankTransferV3Recipient recipient;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<BankTransferV3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BankTransferV3(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(BankTransferV3.class.getClassLoader()), (Amount) parcel.readParcelable(BankTransferV3.class.getClassLoader()), parcel.readInt() == 0 ? null : BankTransferV3Recipient.CREATOR.createFromParcel(parcel), parcel.readString(), (AccountBalance) parcel.readParcelable(BankTransferV3.class.getClassLoader()), parcel.readInt() == 0 ? null : QRPHAdditionalData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3[] newArray(int i) {
            return new BankTransferV3[i];
        }
    }

    public BankTransferV3() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ BankTransferV3 copy$default(BankTransferV3 bankTransferV3, String str, String str2, Amount amount, Amount amount2, BankTransferV3Recipient bankTransferV3Recipient, String str3, AccountBalance accountBalance, QRPHAdditionalData qRPHAdditionalData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankTransferV3.id;
        }
        if ((i & 2) != 0) {
            str2 = bankTransferV3.status;
        }
        if ((i & 4) != 0) {
            amount = bankTransferV3.amount;
        }
        if ((i & 8) != 0) {
            amount2 = bankTransferV3.fees;
        }
        if ((i & 16) != 0) {
            bankTransferV3Recipient = bankTransferV3.recipient;
        }
        if ((i & 32) != 0) {
            str3 = bankTransferV3.purpose;
        }
        if ((i & 64) != 0) {
            accountBalance = bankTransferV3.balance;
        }
        if ((i & 128) != 0) {
            qRPHAdditionalData = bankTransferV3.qrphAdditionalData;
        }
        AccountBalance accountBalance2 = accountBalance;
        QRPHAdditionalData qRPHAdditionalData2 = qRPHAdditionalData;
        BankTransferV3Recipient bankTransferV3Recipient2 = bankTransferV3Recipient;
        String str4 = str3;
        return bankTransferV3.copy(str, str2, amount, amount2, bankTransferV3Recipient2, str4, accountBalance2, qRPHAdditionalData2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.status;
    }

    public final Amount component3() {
        return this.amount;
    }

    public final Amount component4() {
        return this.fees;
    }

    public final BankTransferV3Recipient component5() {
        return this.recipient;
    }

    public final String component6() {
        return this.purpose;
    }

    public final AccountBalance component7() {
        return this.balance;
    }

    public final QRPHAdditionalData component8() {
        return this.qrphAdditionalData;
    }

    public final BankTransferV3 copy(String str, String str2, Amount amount, Amount amount2, BankTransferV3Recipient bankTransferV3Recipient, String str3, AccountBalance accountBalance, QRPHAdditionalData qRPHAdditionalData) {
        return new BankTransferV3(str, str2, amount, amount2, bankTransferV3Recipient, str3, accountBalance, qRPHAdditionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankTransferV3)) {
            return false;
        }
        BankTransferV3 bankTransferV3 = (BankTransferV3) obj;
        return j.b(this.id, bankTransferV3.id) && j.b(this.status, bankTransferV3.status) && j.b(this.amount, bankTransferV3.amount) && j.b(this.fees, bankTransferV3.fees) && j.b(this.recipient, bankTransferV3.recipient) && j.b(this.purpose, bankTransferV3.purpose) && j.b(this.balance, bankTransferV3.balance) && j.b(this.qrphAdditionalData, bankTransferV3.qrphAdditionalData);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final AccountBalance getBalance() {
        return this.balance;
    }

    public final Amount getFees() {
        return this.fees;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastFourDigitAccount() {
        String account;
        BankTransferV3Recipient bankTransferV3Recipient = this.recipient;
        if (bankTransferV3Recipient == null || (account = bankTransferV3Recipient.getAccount()) == null) {
            return null;
        }
        return C2578C.f0(4, account);
    }

    public final String getParsedReferenceId() {
        String str = this.id;
        if (str != null) {
            return C2578C.f0(12, str);
        }
        return null;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final QRPHAdditionalData getQrphAdditionalData() {
        return this.qrphAdditionalData;
    }

    public final BankTransferV3Recipient getRecipient() {
        return this.recipient;
    }

    public final String getStatus() {
        return this.status;
    }

    public final BankTransfer getToFavoriteTemplate() {
        BankAccount.Builder builderSBuilder = BankAccount.sBuilder();
        BankTransferV3Recipient bankTransferV3Recipient = this.recipient;
        BankAccount bankAccountBuild = builderSBuilder.mAccountName(bankTransferV3Recipient != null ? bankTransferV3Recipient.getAccountName() : null).build();
        BankTransferRecipient.Builder builderSBuilder2 = BankTransferRecipient.sBuilder();
        BankTransferV3Recipient bankTransferV3Recipient2 = this.recipient;
        BankTransferRecipient.Builder builderMType = builderSBuilder2.mType(bankTransferV3Recipient2 != null ? bankTransferV3Recipient2.getType() : null);
        BankTransferV3Recipient bankTransferV3Recipient3 = this.recipient;
        BankTransferRecipient bankTransferRecipientBuild = builderMType.mValue(bankTransferV3Recipient3 != null ? bankTransferV3Recipient3.getAccount() : null).build();
        BankTransferBank.Builder builderSBuilder3 = BankTransferBank.sBuilder();
        BankTransferV3Recipient bankTransferV3Recipient4 = this.recipient;
        BankTransferBank.Builder builderMBankCode = builderSBuilder3.mBankCode(bankTransferV3Recipient4 != null ? bankTransferV3Recipient4.getBankCode() : null);
        BankTransferV3Recipient bankTransferV3Recipient5 = this.recipient;
        BankTransfer bankTransferBuild = BankTransfer.sBuilder().mBankTransferRecipient(bankTransferRecipientBuild).mAmount(this.amount).mPurpose(this.purpose).mBankTransferBank(builderMBankCode.mBankName(bankTransferV3Recipient5 != null ? bankTransferV3Recipient5.getBankName() : null).mBankAccount(bankAccountBuild).build()).build();
        j.f(bankTransferBuild, "build(...)");
        return bankTransferBuild;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode3 = (iHashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.fees;
        int iHashCode4 = (iHashCode3 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        BankTransferV3Recipient bankTransferV3Recipient = this.recipient;
        int iHashCode5 = (iHashCode4 + (bankTransferV3Recipient == null ? 0 : bankTransferV3Recipient.hashCode())) * 31;
        String str3 = this.purpose;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AccountBalance accountBalance = this.balance;
        int iHashCode7 = (iHashCode6 + (accountBalance == null ? 0 : accountBalance.hashCode())) * 31;
        QRPHAdditionalData qRPHAdditionalData = this.qrphAdditionalData;
        return iHashCode7 + (qRPHAdditionalData != null ? qRPHAdditionalData.hashCode() : 0);
    }

    public final void prefillRecipientMissingValues(BankTransferV3Recipient bankTransferV3Recipient) {
        BankTransferV3Recipient bankTransferV3Recipient2 = this.recipient;
        if (bankTransferV3Recipient2 != null) {
            bankTransferV3Recipient2.setType(bankTransferV3Recipient != null ? bankTransferV3Recipient.getType() : null);
        }
        BankTransferV3Recipient bankTransferV3Recipient3 = this.recipient;
        if (bankTransferV3Recipient3 != null) {
            bankTransferV3Recipient3.setBankName(bankTransferV3Recipient != null ? bankTransferV3Recipient.getBankName() : null);
        }
        BankTransferV3Recipient bankTransferV3Recipient4 = this.recipient;
        if (bankTransferV3Recipient4 != null) {
            bankTransferV3Recipient4.setBankCode(bankTransferV3Recipient != null ? bankTransferV3Recipient.getBankCode() : null);
        }
    }

    public String toString() {
        String str = this.id;
        String str2 = this.status;
        Amount amount = this.amount;
        Amount amount2 = this.fees;
        BankTransferV3Recipient bankTransferV3Recipient = this.recipient;
        String str3 = this.purpose;
        AccountBalance accountBalance = this.balance;
        QRPHAdditionalData qRPHAdditionalData = this.qrphAdditionalData;
        StringBuilder sbX = s.x("BankTransferV3(id=", str, ", status=", str2, ", amount=");
        sbX.append(amount);
        sbX.append(", fees=");
        sbX.append(amount2);
        sbX.append(", recipient=");
        sbX.append(bankTransferV3Recipient);
        sbX.append(", purpose=");
        sbX.append(str3);
        sbX.append(", balance=");
        sbX.append(accountBalance);
        sbX.append(", qrphAdditionalData=");
        sbX.append(qRPHAdditionalData);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.status);
        dest.writeParcelable(this.amount, i);
        dest.writeParcelable(this.fees, i);
        BankTransferV3Recipient bankTransferV3Recipient = this.recipient;
        if (bankTransferV3Recipient == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bankTransferV3Recipient.writeToParcel(dest, i);
        }
        dest.writeString(this.purpose);
        dest.writeParcelable(this.balance, i);
        QRPHAdditionalData qRPHAdditionalData = this.qrphAdditionalData;
        if (qRPHAdditionalData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qRPHAdditionalData.writeToParcel(dest, i);
        }
    }

    public BankTransferV3(String str, String str2, Amount amount, Amount amount2, BankTransferV3Recipient bankTransferV3Recipient, String str3, AccountBalance accountBalance, QRPHAdditionalData qRPHAdditionalData) {
        this.id = str;
        this.status = str2;
        this.amount = amount;
        this.fees = amount2;
        this.recipient = bankTransferV3Recipient;
        this.purpose = str3;
        this.balance = accountBalance;
        this.qrphAdditionalData = qRPHAdditionalData;
    }

    public /* synthetic */ BankTransferV3(String str, String str2, Amount amount, Amount amount2, BankTransferV3Recipient bankTransferV3Recipient, String str3, AccountBalance accountBalance, QRPHAdditionalData qRPHAdditionalData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : amount, (i & 8) != 0 ? null : amount2, (i & 16) != 0 ? null : bankTransferV3Recipient, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : accountBalance, (i & 128) != 0 ? null : qRPHAdditionalData);
    }
}
