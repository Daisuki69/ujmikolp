package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.domain.model.PadalaCreateTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PadalaCreateTransfer, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PadalaCreateTransfer extends PadalaCreateTransfer {
    private final Amount mAmount;
    private final TransferEntity mBeneficiary;
    private final TransferEntity mSender;
    private final TransferTarget mTarget;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PadalaCreateTransfer$Builder */
    public static class Builder extends PadalaCreateTransfer.Builder {
        private Amount mAmount;
        private TransferEntity mBeneficiary;
        private TransferEntity mSender;
        private TransferTarget mTarget;

        public /* synthetic */ Builder(PadalaCreateTransfer padalaCreateTransfer, int i) {
            this(padalaCreateTransfer);
        }

        @Override // com.paymaya.domain.model.PadalaCreateTransfer.Builder
        public PadalaCreateTransfer build() {
            String strI = this.mTarget == null ? " mTarget" : "";
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PadalaCreateTransfer(this.mTarget, this.mAmount, this.mSender, this.mBeneficiary);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PadalaCreateTransfer.Builder
        public PadalaCreateTransfer.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaCreateTransfer.Builder
        public PadalaCreateTransfer.Builder mBeneficiary(@Nullable TransferEntity transferEntity) {
            this.mBeneficiary = transferEntity;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaCreateTransfer.Builder
        public PadalaCreateTransfer.Builder mSender(@Nullable TransferEntity transferEntity) {
            this.mSender = transferEntity;
            return this;
        }

        @Override // com.paymaya.domain.model.PadalaCreateTransfer.Builder
        public PadalaCreateTransfer.Builder mTarget(TransferTarget transferTarget) {
            if (transferTarget == null) {
                throw new NullPointerException("Null mTarget");
            }
            this.mTarget = transferTarget;
            return this;
        }

        public Builder() {
        }

        private Builder(PadalaCreateTransfer padalaCreateTransfer) {
            this.mTarget = padalaCreateTransfer.mTarget();
            this.mAmount = padalaCreateTransfer.mAmount();
            this.mSender = padalaCreateTransfer.mSender();
            this.mBeneficiary = padalaCreateTransfer.mBeneficiary();
        }
    }

    public C$$AutoValue_PadalaCreateTransfer(TransferTarget transferTarget, Amount amount, @Nullable TransferEntity transferEntity, @Nullable TransferEntity transferEntity2) {
        if (transferTarget == null) {
            throw new NullPointerException("Null mTarget");
        }
        this.mTarget = transferTarget;
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        this.mSender = transferEntity;
        this.mBeneficiary = transferEntity2;
    }

    public boolean equals(Object obj) {
        TransferEntity transferEntity;
        TransferEntity transferEntity2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PadalaCreateTransfer) {
            PadalaCreateTransfer padalaCreateTransfer = (PadalaCreateTransfer) obj;
            if (this.mTarget.equals(padalaCreateTransfer.mTarget()) && this.mAmount.equals(padalaCreateTransfer.mAmount()) && ((transferEntity = this.mSender) != null ? transferEntity.equals(padalaCreateTransfer.mSender()) : padalaCreateTransfer.mSender() == null) && ((transferEntity2 = this.mBeneficiary) != null ? transferEntity2.equals(padalaCreateTransfer.mBeneficiary()) : padalaCreateTransfer.mBeneficiary() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mTarget.hashCode() ^ 1000003) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        TransferEntity transferEntity = this.mSender;
        int iHashCode2 = (iHashCode ^ (transferEntity == null ? 0 : transferEntity.hashCode())) * 1000003;
        TransferEntity transferEntity2 = this.mBeneficiary;
        return iHashCode2 ^ (transferEntity2 != null ? transferEntity2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.PadalaCreateTransfer
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.PadalaCreateTransfer
    @Nullable
    @InterfaceC1498b("beneficiary")
    public TransferEntity mBeneficiary() {
        return this.mBeneficiary;
    }

    @Override // com.paymaya.domain.model.PadalaCreateTransfer
    @Nullable
    @InterfaceC1498b("sender")
    public TransferEntity mSender() {
        return this.mSender;
    }

    @Override // com.paymaya.domain.model.PadalaCreateTransfer
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public TransferTarget mTarget() {
        return this.mTarget;
    }

    @Override // com.paymaya.domain.model.PadalaCreateTransfer
    public PadalaCreateTransfer.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "PadalaCreateTransfer{mTarget=" + this.mTarget + ", mAmount=" + this.mAmount + ", mSender=" + this.mSender + ", mBeneficiary=" + this.mBeneficiary + "}";
    }
}
