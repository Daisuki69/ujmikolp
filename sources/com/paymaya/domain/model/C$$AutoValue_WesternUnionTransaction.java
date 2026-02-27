package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.WesternUnionTransaction;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_WesternUnionTransaction, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_WesternUnionTransaction extends WesternUnionTransaction {
    private final Amount mAmount;
    private final Amount mBalance;
    private final String mMtcn;
    private final String mReferenceId;
    private final String mRrn;
    private final String mSender;
    private final String mTrn;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_WesternUnionTransaction$Builder */
    public static class Builder extends WesternUnionTransaction.Builder {
        private Amount mAmount;
        private Amount mBalance;
        private String mMtcn;
        private String mReferenceId;
        private String mRrn;
        private String mSender;
        private String mTrn;

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction build() {
            String strI = this.mRrn == null ? " mRrn" : "";
            if (this.mTrn == null) {
                strI = s.i(strI, " mTrn");
            }
            if (this.mMtcn == null) {
                strI = s.i(strI, " mMtcn");
            }
            if (this.mSender == null) {
                strI = s.i(strI, " mSender");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_WesternUnionTransaction(this.mRrn, this.mTrn, this.mMtcn, this.mSender, this.mAmount, this.mReferenceId, this.mBalance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mAmount(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mBalance(Amount amount) {
            this.mBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mMtcn(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMtcn");
            }
            this.mMtcn = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mReferenceId(String str) {
            this.mReferenceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mRrn(String str) {
            if (str == null) {
                throw new NullPointerException("Null mRrn");
            }
            this.mRrn = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mSender(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSender");
            }
            this.mSender = str;
            return this;
        }

        @Override // com.paymaya.domain.model.WesternUnionTransaction.Builder
        public WesternUnionTransaction.Builder mTrn(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTrn");
            }
            this.mTrn = str;
            return this;
        }
    }

    public C$$AutoValue_WesternUnionTransaction(String str, String str2, String str3, String str4, Amount amount, @Nullable String str5, @Nullable Amount amount2) {
        if (str == null) {
            throw new NullPointerException("Null mRrn");
        }
        this.mRrn = str;
        if (str2 == null) {
            throw new NullPointerException("Null mTrn");
        }
        this.mTrn = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mMtcn");
        }
        this.mMtcn = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mSender");
        }
        this.mSender = str4;
        if (amount == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = amount;
        this.mReferenceId = str5;
        this.mBalance = amount2;
    }

    public boolean equals(Object obj) {
        String str;
        Amount amount;
        if (obj == this) {
            return true;
        }
        if (obj instanceof WesternUnionTransaction) {
            WesternUnionTransaction westernUnionTransaction = (WesternUnionTransaction) obj;
            if (this.mRrn.equals(westernUnionTransaction.mRrn()) && this.mTrn.equals(westernUnionTransaction.mTrn()) && this.mMtcn.equals(westernUnionTransaction.mMtcn()) && this.mSender.equals(westernUnionTransaction.mSender()) && this.mAmount.equals(westernUnionTransaction.mAmount()) && ((str = this.mReferenceId) != null ? str.equals(westernUnionTransaction.mReferenceId()) : westernUnionTransaction.mReferenceId() == null) && ((amount = this.mBalance) != null ? amount.equals(westernUnionTransaction.mBalance()) : westernUnionTransaction.mBalance() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.mRrn.hashCode() ^ 1000003) * 1000003) ^ this.mTrn.hashCode()) * 1000003) ^ this.mMtcn.hashCode()) * 1000003) ^ this.mSender.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        String str = this.mReferenceId;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Amount amount = this.mBalance;
        return iHashCode2 ^ (amount != null ? amount.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @Nullable
    @InterfaceC1498b("balance")
    public Amount mBalance() {
        return this.mBalance;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @InterfaceC1498b("mtcn")
    public String mMtcn() {
        return this.mMtcn;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @Nullable
    @InterfaceC1498b("reference_id")
    public String mReferenceId() {
        return this.mReferenceId;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @InterfaceC1498b("rrn")
    public String mRrn() {
        return this.mRrn;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @InterfaceC1498b("sender")
    public String mSender() {
        return this.mSender;
    }

    @Override // com.paymaya.domain.model.WesternUnionTransaction
    @InterfaceC1498b("trn")
    public String mTrn() {
        return this.mTrn;
    }

    public String toString() {
        return "WesternUnionTransaction{mRrn=" + this.mRrn + ", mTrn=" + this.mTrn + ", mMtcn=" + this.mMtcn + ", mSender=" + this.mSender + ", mAmount=" + this.mAmount + ", mReferenceId=" + this.mReferenceId + ", mBalance=" + this.mBalance + "}";
    }
}
