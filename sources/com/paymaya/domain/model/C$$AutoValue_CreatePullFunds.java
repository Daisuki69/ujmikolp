package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.CreatePullFunds;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_CreatePullFunds, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_CreatePullFunds extends CreatePullFunds {
    private final Amount mAmount;
    private final PullFundsCard mCard;
    private final Amount mFees;
    private final String mPurchaseId;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_CreatePullFunds$Builder */
    public static class Builder extends CreatePullFunds.Builder {
        private Amount mAmount;
        private PullFundsCard mCard;
        private Amount mFees;
        private String mPurchaseId;
        private String mStatus;

        public /* synthetic */ Builder(CreatePullFunds createPullFunds, int i) {
            this(createPullFunds);
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds build() {
            String strI = this.mAmount == null ? " mAmount" : "";
            if (this.mFees == null) {
                strI = s.i(strI, " mFees");
            }
            if (this.mPurchaseId == null) {
                strI = s.i(strI, " mPurchaseId");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (strI.isEmpty()) {
                return new AutoValue_CreatePullFunds(this.mAmount, this.mFees, this.mCard, this.mPurchaseId, this.mStatus);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds.Builder mCard(PullFundsCard pullFundsCard) {
            this.mCard = pullFundsCard;
            return this;
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds.Builder mFees(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mFees");
            }
            this.mFees = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds.Builder mPurchaseId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mPurchaseId");
            }
            this.mPurchaseId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.CreatePullFunds.Builder
        public CreatePullFunds.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        public Builder() {
        }

        private Builder(CreatePullFunds createPullFunds) {
            this.mAmount = createPullFunds.mAmount();
            this.mFees = createPullFunds.mFees();
            this.mCard = createPullFunds.mCard();
            this.mPurchaseId = createPullFunds.mPurchaseId();
            this.mStatus = createPullFunds.mStatus();
        }
    }

    public C$$AutoValue_CreatePullFunds(Amount amount, Amount amount2, @Nullable PullFundsCard pullFundsCard, String str, String str2) {
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mFees");
        }
        this.mFees = amount2;
        this.mCard = pullFundsCard;
        if (str == null) {
            throw new NullPointerException("Null mPurchaseId");
        }
        this.mPurchaseId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str2;
    }

    public boolean equals(Object obj) {
        PullFundsCard pullFundsCard;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreatePullFunds) {
            CreatePullFunds createPullFunds = (CreatePullFunds) obj;
            if (this.mAmount.equals(createPullFunds.mAmount()) && this.mFees.equals(createPullFunds.mFees()) && ((pullFundsCard = this.mCard) != null ? pullFundsCard.equals(createPullFunds.mCard()) : createPullFunds.mCard() == null) && this.mPurchaseId.equals(createPullFunds.mPurchaseId()) && this.mStatus.equals(createPullFunds.mStatus())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mAmount.hashCode() ^ 1000003) * 1000003) ^ this.mFees.hashCode()) * 1000003;
        PullFundsCard pullFundsCard = this.mCard;
        return ((((iHashCode ^ (pullFundsCard == null ? 0 : pullFundsCard.hashCode())) * 1000003) ^ this.mPurchaseId.hashCode()) * 1000003) ^ this.mStatus.hashCode();
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    @Nullable
    @InterfaceC1498b("card")
    public PullFundsCard mCard() {
        return this.mCard;
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    @InterfaceC1498b("fees")
    public Amount mFees() {
        return this.mFees;
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    @InterfaceC1498b("purchase_id")
    public String mPurchaseId() {
        return this.mPurchaseId;
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.CreatePullFunds
    public CreatePullFunds.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreatePullFunds{mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mFees=");
        sb2.append(this.mFees);
        sb2.append(", mCard=");
        sb2.append(this.mCard);
        sb2.append(", mPurchaseId=");
        sb2.append(this.mPurchaseId);
        sb2.append(", mStatus=");
        return s.p(sb2, this.mStatus, "}");
    }
}
