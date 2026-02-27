package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.BillerTransaction;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerTransaction, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BillerTransaction extends BillerTransaction {
    private final AccountBalance mAccountBalance;
    private final Amount mAmount;
    private final String mBillPaymentId;
    private final BillerDetails mBiller;
    private final BillerTransactionPayment mBillerTransactionPayment;
    private final String mCreatedDate;
    private final Amount mFee;
    private final String mStatus;
    private final Amount mTotalAmount;
    private final String mUserMin;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BillerTransaction$Builder */
    public static class Builder extends BillerTransaction.Builder {
        private AccountBalance mAccountBalance;
        private Amount mAmount;
        private String mBillPaymentId;
        private BillerDetails mBiller;
        private BillerTransactionPayment mBillerTransactionPayment;
        private String mCreatedDate;
        private Amount mFee;
        private String mStatus;
        private Amount mTotalAmount;
        private String mUserMin;

        public /* synthetic */ Builder(BillerTransaction billerTransaction, int i) {
            this(billerTransaction);
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction build() {
            String strI = this.mBiller == null ? " mBiller" : "";
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_BillerTransaction(this.mBillPaymentId, this.mBiller, this.mAmount, this.mFee, this.mTotalAmount, this.mStatus, this.mAccountBalance, this.mBillerTransactionPayment, this.mCreatedDate, this.mUserMin);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mAccountBalance(@Nullable AccountBalance accountBalance) {
            this.mAccountBalance = accountBalance;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mBillPaymentId(@Nullable String str) {
            this.mBillPaymentId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mBiller(BillerDetails billerDetails) {
            if (billerDetails == null) {
                throw new NullPointerException("Null mBiller");
            }
            this.mBiller = billerDetails;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mBillerTransactionPayment(@Nullable BillerTransactionPayment billerTransactionPayment) {
            this.mBillerTransactionPayment = billerTransactionPayment;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mCreatedDate(@Nullable String str) {
            this.mCreatedDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mFee(@Nullable Amount amount) {
            this.mFee = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mStatus(@Nullable String str) {
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mTotalAmount(@Nullable Amount amount) {
            this.mTotalAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.BillerTransaction.Builder
        public BillerTransaction.Builder mUserMin(@Nullable String str) {
            this.mUserMin = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BillerTransaction billerTransaction) {
            this.mBillPaymentId = billerTransaction.mBillPaymentId();
            this.mBiller = billerTransaction.mBiller();
            this.mAmount = billerTransaction.mAmount();
            this.mFee = billerTransaction.mFee();
            this.mTotalAmount = billerTransaction.mTotalAmount();
            this.mStatus = billerTransaction.mStatus();
            this.mAccountBalance = billerTransaction.mAccountBalance();
            this.mBillerTransactionPayment = billerTransaction.mBillerTransactionPayment();
            this.mCreatedDate = billerTransaction.mCreatedDate();
            this.mUserMin = billerTransaction.mUserMin();
        }
    }

    public C$$AutoValue_BillerTransaction(@Nullable String str, BillerDetails billerDetails, Amount amount, @Nullable Amount amount2, @Nullable Amount amount3, @Nullable String str2, @Nullable AccountBalance accountBalance, @Nullable BillerTransactionPayment billerTransactionPayment, @Nullable String str3, @Nullable String str4) {
        this.mBillPaymentId = str;
        if (billerDetails == null) {
            throw new NullPointerException("Null mBiller");
        }
        this.mBiller = billerDetails;
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        this.mFee = amount2;
        this.mTotalAmount = amount3;
        this.mStatus = str2;
        this.mAccountBalance = accountBalance;
        this.mBillerTransactionPayment = billerTransactionPayment;
        this.mCreatedDate = str3;
        this.mUserMin = str4;
    }

    public boolean equals(Object obj) {
        Amount amount;
        Amount amount2;
        String str;
        AccountBalance accountBalance;
        BillerTransactionPayment billerTransactionPayment;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BillerTransaction) {
            BillerTransaction billerTransaction = (BillerTransaction) obj;
            String str4 = this.mBillPaymentId;
            if (str4 != null ? str4.equals(billerTransaction.mBillPaymentId()) : billerTransaction.mBillPaymentId() == null) {
                if (this.mBiller.equals(billerTransaction.mBiller()) && this.mAmount.equals(billerTransaction.mAmount()) && ((amount = this.mFee) != null ? amount.equals(billerTransaction.mFee()) : billerTransaction.mFee() == null) && ((amount2 = this.mTotalAmount) != null ? amount2.equals(billerTransaction.mTotalAmount()) : billerTransaction.mTotalAmount() == null) && ((str = this.mStatus) != null ? str.equals(billerTransaction.mStatus()) : billerTransaction.mStatus() == null) && ((accountBalance = this.mAccountBalance) != null ? accountBalance.equals(billerTransaction.mAccountBalance()) : billerTransaction.mAccountBalance() == null) && ((billerTransactionPayment = this.mBillerTransactionPayment) != null ? billerTransactionPayment.equals(billerTransaction.mBillerTransactionPayment()) : billerTransaction.mBillerTransactionPayment() == null) && ((str2 = this.mCreatedDate) != null ? str2.equals(billerTransaction.mCreatedDate()) : billerTransaction.mCreatedDate() == null) && ((str3 = this.mUserMin) != null ? str3.equals(billerTransaction.mUserMin()) : billerTransaction.mUserMin() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mBillPaymentId;
        int iHashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mBiller.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        Amount amount = this.mFee;
        int iHashCode2 = (iHashCode ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        Amount amount2 = this.mTotalAmount;
        int iHashCode3 = (iHashCode2 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        String str2 = this.mStatus;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        AccountBalance accountBalance = this.mAccountBalance;
        int iHashCode5 = (iHashCode4 ^ (accountBalance == null ? 0 : accountBalance.hashCode())) * 1000003;
        BillerTransactionPayment billerTransactionPayment = this.mBillerTransactionPayment;
        int iHashCode6 = (iHashCode5 ^ (billerTransactionPayment == null ? 0 : billerTransactionPayment.hashCode())) * 1000003;
        String str3 = this.mCreatedDate;
        int iHashCode7 = (iHashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mUserMin;
        return iHashCode7 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("balance")
    public AccountBalance mAccountBalance() {
        return this.mAccountBalance;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("bill_payment_id")
    public String mBillPaymentId() {
        return this.mBillPaymentId;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @InterfaceC1498b("biller")
    public BillerDetails mBiller() {
        return this.mBiller;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("payment")
    public BillerTransactionPayment mBillerTransactionPayment() {
        return this.mBillerTransactionPayment;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("created_date")
    public String mCreatedDate() {
        return this.mCreatedDate;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("fee")
    public Amount mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    @InterfaceC1498b("totalAmount")
    public Amount mTotalAmount() {
        return this.mTotalAmount;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    @Nullable
    public String mUserMin() {
        return this.mUserMin;
    }

    @Override // com.paymaya.domain.model.BillerTransaction
    public BillerTransaction.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillerTransaction{mBillPaymentId=");
        sb2.append(this.mBillPaymentId);
        sb2.append(", mBiller=");
        sb2.append(this.mBiller);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mFee=");
        sb2.append(this.mFee);
        sb2.append(", mTotalAmount=");
        sb2.append(this.mTotalAmount);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mAccountBalance=");
        sb2.append(this.mAccountBalance);
        sb2.append(", mBillerTransactionPayment=");
        sb2.append(this.mBillerTransactionPayment);
        sb2.append(", mCreatedDate=");
        sb2.append(this.mCreatedDate);
        sb2.append(", mUserMin=");
        return s.p(sb2, this.mUserMin, "}");
    }
}
