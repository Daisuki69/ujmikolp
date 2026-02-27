package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.BankTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankTransfer, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BankTransfer extends BankTransfer {
    private final Amount mAmount;
    private final AccountBalance mBalance;
    private final BankTransferBank mBankTransferBank;
    private final BankTransferRecipient mBankTransferRecipient;
    private final Amount mFees;
    private final String mId;
    private final String mMessage;
    private final String mPurpose;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankTransfer$Builder */
    public static class Builder extends BankTransfer.Builder {
        private Amount mAmount;
        private AccountBalance mBalance;
        private BankTransferBank mBankTransferBank;
        private BankTransferRecipient mBankTransferRecipient;
        private Amount mFees;
        private String mId;
        private String mMessage;
        private String mPurpose;
        private String mStatus;

        public /* synthetic */ Builder(BankTransfer bankTransfer, int i) {
            this(bankTransfer);
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer build() {
            return new AutoValue_BankTransfer(this.mBankTransferRecipient, this.mAmount, this.mMessage, this.mPurpose, this.mBankTransferBank, this.mId, this.mStatus, this.mFees, this.mBalance);
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mAmount(Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mBalance(AccountBalance accountBalance) {
            this.mBalance = accountBalance;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mBankTransferBank(BankTransferBank bankTransferBank) {
            this.mBankTransferBank = bankTransferBank;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mBankTransferRecipient(BankTransferRecipient bankTransferRecipient) {
            this.mBankTransferRecipient = bankTransferRecipient;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mFees(Amount amount) {
            this.mFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mMessage(String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mPurpose(String str) {
            this.mPurpose = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransfer.Builder
        public BankTransfer.Builder mStatus(String str) {
            this.mStatus = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BankTransfer bankTransfer) {
            this.mBankTransferRecipient = bankTransfer.mBankTransferRecipient();
            this.mAmount = bankTransfer.mAmount();
            this.mMessage = bankTransfer.mMessage();
            this.mPurpose = bankTransfer.mPurpose();
            this.mBankTransferBank = bankTransfer.mBankTransferBank();
            this.mId = bankTransfer.mId();
            this.mStatus = bankTransfer.mStatus();
            this.mFees = bankTransfer.mFees();
            this.mBalance = bankTransfer.mBalance();
        }
    }

    public C$$AutoValue_BankTransfer(@Nullable BankTransferRecipient bankTransferRecipient, @Nullable Amount amount, @Nullable String str, @Nullable String str2, @Nullable BankTransferBank bankTransferBank, @Nullable String str3, @Nullable String str4, @Nullable Amount amount2, @Nullable AccountBalance accountBalance) {
        this.mBankTransferRecipient = bankTransferRecipient;
        this.mAmount = amount;
        this.mMessage = str;
        this.mPurpose = str2;
        this.mBankTransferBank = bankTransferBank;
        this.mId = str3;
        this.mStatus = str4;
        this.mFees = amount2;
        this.mBalance = accountBalance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BankTransfer) {
            BankTransfer bankTransfer = (BankTransfer) obj;
            BankTransferRecipient bankTransferRecipient = this.mBankTransferRecipient;
            if (bankTransferRecipient != null ? bankTransferRecipient.equals(bankTransfer.mBankTransferRecipient()) : bankTransfer.mBankTransferRecipient() == null) {
                Amount amount = this.mAmount;
                if (amount != null ? amount.equals(bankTransfer.mAmount()) : bankTransfer.mAmount() == null) {
                    String str = this.mMessage;
                    if (str != null ? str.equals(bankTransfer.mMessage()) : bankTransfer.mMessage() == null) {
                        String str2 = this.mPurpose;
                        if (str2 != null ? str2.equals(bankTransfer.mPurpose()) : bankTransfer.mPurpose() == null) {
                            BankTransferBank bankTransferBank = this.mBankTransferBank;
                            if (bankTransferBank != null ? bankTransferBank.equals(bankTransfer.mBankTransferBank()) : bankTransfer.mBankTransferBank() == null) {
                                String str3 = this.mId;
                                if (str3 != null ? str3.equals(bankTransfer.mId()) : bankTransfer.mId() == null) {
                                    String str4 = this.mStatus;
                                    if (str4 != null ? str4.equals(bankTransfer.mStatus()) : bankTransfer.mStatus() == null) {
                                        Amount amount2 = this.mFees;
                                        if (amount2 != null ? amount2.equals(bankTransfer.mFees()) : bankTransfer.mFees() == null) {
                                            AccountBalance accountBalance = this.mBalance;
                                            if (accountBalance != null ? accountBalance.equals(bankTransfer.mBalance()) : bankTransfer.mBalance() == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        BankTransferRecipient bankTransferRecipient = this.mBankTransferRecipient;
        int iHashCode = ((bankTransferRecipient == null ? 0 : bankTransferRecipient.hashCode()) ^ 1000003) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode2 = (iHashCode ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        String str = this.mMessage;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mPurpose;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        BankTransferBank bankTransferBank = this.mBankTransferBank;
        int iHashCode5 = (iHashCode4 ^ (bankTransferBank == null ? 0 : bankTransferBank.hashCode())) * 1000003;
        String str3 = this.mId;
        int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mStatus;
        int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Amount amount2 = this.mFees;
        int iHashCode8 = (iHashCode7 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        AccountBalance accountBalance = this.mBalance;
        return iHashCode8 ^ (accountBalance != null ? accountBalance.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("balance")
    public AccountBalance mBalance() {
        return this.mBalance;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("bank")
    public BankTransferBank mBankTransferBank() {
        return this.mBankTransferBank;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("recipient")
    public BankTransferRecipient mBankTransferRecipient() {
        return this.mBankTransferRecipient;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("fees")
    public Amount mFees() {
        return this.mFees;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("message")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("purpose")
    public String mPurpose() {
        return this.mPurpose;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.BankTransfer
    public BankTransfer.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "BankTransfer{mBankTransferRecipient=" + this.mBankTransferRecipient + ", mAmount=" + this.mAmount + ", mMessage=" + this.mMessage + ", mPurpose=" + this.mPurpose + ", mBankTransferBank=" + this.mBankTransferBank + ", mId=" + this.mId + ", mStatus=" + this.mStatus + ", mFees=" + this.mFees + ", mBalance=" + this.mBalance + "}";
    }
}
