package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.domain.model.PadalaTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PadalaTransfer, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PadalaTransfer extends PadalaTransfer {
    private final Amount mAmount;
    private final AccountBalance mBalance;
    private final Amount mCommission;
    private final Amount mFees;
    private final String mRequestReferenceNo;
    private final Amount mRevenue;
    private final TransferSender mSource;
    private final TransferTarget mTarget;
    private final TransferToken mTransferToken;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PadalaTransfer$Builder */
    public static class Builder extends PadalaTransfer.Builder {
        private Amount mAmount;
        private AccountBalance mBalance;
        private Amount mCommission;
        private Amount mFees;
        private String mRequestReferenceNo;
        private Amount mRevenue;
        private TransferSender mSource;
        private TransferTarget mTarget;
        private TransferToken mTransferToken;

        public /* synthetic */ Builder(PadalaTransfer padalaTransfer, int i) {
            this(padalaTransfer);
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer build() {
            String strI = this.mTransferToken == null ? " mTransferToken" : "";
            if (this.mFees == null) {
                strI = s.i(strI, " mFees");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PadalaTransfer(this.mTransferToken, this.mSource, this.mTarget, this.mAmount, this.mFees, this.mRevenue, this.mCommission, this.mRequestReferenceNo, this.mBalance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mAmount(@Nullable Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mBalance(@Nullable AccountBalance accountBalance) {
            this.mBalance = accountBalance;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mCommission(@Nullable Amount amount) {
            this.mCommission = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mFees(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mFees");
            }
            this.mFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mRequestReferenceNo(@Nullable String str) {
            this.mRequestReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mRevenue(@Nullable Amount amount) {
            this.mRevenue = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mSource(@Nullable TransferSender transferSender) {
            this.mSource = transferSender;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mTarget(@Nullable TransferTarget transferTarget) {
            this.mTarget = transferTarget;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaTransfer.Builder
        public PadalaTransfer.Builder mTransferToken(TransferToken transferToken) {
            if (transferToken == null) {
                throw new NullPointerException("Null mTransferToken");
            }
            this.mTransferToken = transferToken;
            return this;
        }

        public Builder() {
        }

        private Builder(PadalaTransfer padalaTransfer) {
            this.mTransferToken = padalaTransfer.mTransferToken();
            this.mSource = padalaTransfer.mSource();
            this.mTarget = padalaTransfer.mTarget();
            this.mAmount = padalaTransfer.mAmount();
            this.mFees = padalaTransfer.mFees();
            this.mRevenue = padalaTransfer.mRevenue();
            this.mCommission = padalaTransfer.mCommission();
            this.mRequestReferenceNo = padalaTransfer.mRequestReferenceNo();
            this.mBalance = padalaTransfer.mBalance();
        }
    }

    public C$$AutoValue_PadalaTransfer(TransferToken transferToken, @Nullable TransferSender transferSender, @Nullable TransferTarget transferTarget, @Nullable Amount amount, Amount amount2, @Nullable Amount amount3, @Nullable Amount amount4, @Nullable String str, @Nullable AccountBalance accountBalance) {
        if (transferToken == null) {
            throw new NullPointerException("Null mTransferToken");
        }
        this.mTransferToken = transferToken;
        this.mSource = transferSender;
        this.mTarget = transferTarget;
        this.mAmount = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mFees");
        }
        this.mFees = amount2;
        this.mRevenue = amount3;
        this.mCommission = amount4;
        this.mRequestReferenceNo = str;
        this.mBalance = accountBalance;
    }

    public boolean equals(Object obj) {
        TransferSender transferSender;
        TransferTarget transferTarget;
        Amount amount;
        Amount amount2;
        Amount amount3;
        String str;
        AccountBalance accountBalance;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PadalaTransfer) {
            PadalaTransfer padalaTransfer = (PadalaTransfer) obj;
            if (this.mTransferToken.equals(padalaTransfer.mTransferToken()) && ((transferSender = this.mSource) != null ? transferSender.equals(padalaTransfer.mSource()) : padalaTransfer.mSource() == null) && ((transferTarget = this.mTarget) != null ? transferTarget.equals(padalaTransfer.mTarget()) : padalaTransfer.mTarget() == null) && ((amount = this.mAmount) != null ? amount.equals(padalaTransfer.mAmount()) : padalaTransfer.mAmount() == null) && this.mFees.equals(padalaTransfer.mFees()) && ((amount2 = this.mRevenue) != null ? amount2.equals(padalaTransfer.mRevenue()) : padalaTransfer.mRevenue() == null) && ((amount3 = this.mCommission) != null ? amount3.equals(padalaTransfer.mCommission()) : padalaTransfer.mCommission() == null) && ((str = this.mRequestReferenceNo) != null ? str.equals(padalaTransfer.mRequestReferenceNo()) : padalaTransfer.mRequestReferenceNo() == null) && ((accountBalance = this.mBalance) != null ? accountBalance.equals(padalaTransfer.mBalance()) : padalaTransfer.mBalance() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mTransferToken.hashCode() ^ 1000003) * 1000003;
        TransferSender transferSender = this.mSource;
        int iHashCode2 = (iHashCode ^ (transferSender == null ? 0 : transferSender.hashCode())) * 1000003;
        TransferTarget transferTarget = this.mTarget;
        int iHashCode3 = (iHashCode2 ^ (transferTarget == null ? 0 : transferTarget.hashCode())) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode4 = (((iHashCode3 ^ (amount == null ? 0 : amount.hashCode())) * 1000003) ^ this.mFees.hashCode()) * 1000003;
        Amount amount2 = this.mRevenue;
        int iHashCode5 = (iHashCode4 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        Amount amount3 = this.mCommission;
        int iHashCode6 = (iHashCode5 ^ (amount3 == null ? 0 : amount3.hashCode())) * 1000003;
        String str = this.mRequestReferenceNo;
        int iHashCode7 = (iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AccountBalance accountBalance = this.mBalance;
        return iHashCode7 ^ (accountBalance != null ? accountBalance.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("balance")
    public AccountBalance mBalance() {
        return this.mBalance;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("commission")
    public Amount mCommission() {
        return this.mCommission;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @InterfaceC1498b("fees")
    public Amount mFees() {
        return this.mFees;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("revenue")
    public Amount mRevenue() {
        return this.mRevenue;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b("source")
    public TransferSender mSource() {
        return this.mSource;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @Nullable
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public TransferTarget mTarget() {
        return this.mTarget;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    @InterfaceC1498b("transfer_token")
    public TransferToken mTransferToken() {
        return this.mTransferToken;
    }

    @Override // com.paymaya.domain.model.PadalaTransfer
    public PadalaTransfer.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "PadalaTransfer{mTransferToken=" + this.mTransferToken + ", mSource=" + this.mSource + ", mTarget=" + this.mTarget + ", mAmount=" + this.mAmount + ", mFees=" + this.mFees + ", mRevenue=" + this.mRevenue + ", mCommission=" + this.mCommission + ", mRequestReferenceNo=" + this.mRequestReferenceNo + ", mBalance=" + this.mBalance + "}";
    }
}
