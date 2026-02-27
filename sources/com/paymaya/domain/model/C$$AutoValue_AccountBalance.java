package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.AccountBalance;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_AccountBalance, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_AccountBalance extends AccountBalance {
    private final Amount mAvailableBalance;
    private final Amount mCurrentBalance;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_AccountBalance$Builder */
    public static class Builder extends AccountBalance.Builder {
        private Amount mAvailableBalance;
        private Amount mCurrentBalance;

        @Override // com.paymaya.domain.model.AccountBalance.Builder
        public AccountBalance build() {
            String strI = this.mCurrentBalance == null ? " mCurrentBalance" : "";
            if (this.mAvailableBalance == null) {
                strI = s.i(strI, " mAvailableBalance");
            }
            if (strI.isEmpty()) {
                return new AutoValue_AccountBalance(this.mCurrentBalance, this.mAvailableBalance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.AccountBalance.Builder
        public AccountBalance.Builder mAvailableBalance(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAvailableBalance");
            }
            this.mAvailableBalance = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.AccountBalance.Builder
        public AccountBalance.Builder mCurrentBalance(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mCurrentBalance");
            }
            this.mCurrentBalance = amount;
            return this;
        }
    }

    public C$$AutoValue_AccountBalance(Amount amount, Amount amount2) {
        if (amount == null) {
            throw new NullPointerException("Null mCurrentBalance");
        }
        this.mCurrentBalance = amount;
        if (amount2 == null) {
            throw new NullPointerException("Null mAvailableBalance");
        }
        this.mAvailableBalance = amount2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountBalance) {
            AccountBalance accountBalance = (AccountBalance) obj;
            if (this.mCurrentBalance.equals(accountBalance.mCurrentBalance()) && this.mAvailableBalance.equals(accountBalance.mAvailableBalance())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mCurrentBalance.hashCode() ^ 1000003) * 1000003) ^ this.mAvailableBalance.hashCode();
    }

    @Override // com.paymaya.domain.model.AccountBalance
    @InterfaceC1498b("available_balance")
    public Amount mAvailableBalance() {
        return this.mAvailableBalance;
    }

    @Override // com.paymaya.domain.model.AccountBalance
    @InterfaceC1498b("current_balance")
    public Amount mCurrentBalance() {
        return this.mCurrentBalance;
    }

    public String toString() {
        return "AccountBalance{mCurrentBalance=" + this.mCurrentBalance + ", mAvailableBalance=" + this.mAvailableBalance + "}";
    }
}
