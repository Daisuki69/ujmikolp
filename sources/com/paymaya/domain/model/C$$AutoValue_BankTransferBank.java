package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.BankTransferBank;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankTransferBank, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BankTransferBank extends BankTransferBank {
    private final BankAccount mBankAccount;
    private final String mBankCode;
    private final String mBankName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankTransferBank$Builder */
    public static class Builder extends BankTransferBank.Builder {
        private BankAccount mBankAccount;
        private String mBankCode;
        private String mBankName;

        public /* synthetic */ Builder(BankTransferBank bankTransferBank, int i) {
            this(bankTransferBank);
        }

        @Override // com.paymaya.domain.model.BankTransferBank.Builder
        public BankTransferBank build() {
            String strI = this.mBankCode == null ? " mBankCode" : "";
            if (this.mBankAccount == null) {
                strI = s.i(strI, " mBankAccount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_BankTransferBank(this.mBankCode, this.mBankName, this.mBankAccount);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.BankTransferBank.Builder
        public BankTransferBank.Builder mBankAccount(BankAccount bankAccount) {
            if (bankAccount == null) {
                throw new NullPointerException("Null mBankAccount");
            }
            this.mBankAccount = bankAccount;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransferBank.Builder
        public BankTransferBank.Builder mBankCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null mBankCode");
            }
            this.mBankCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankTransferBank.Builder
        public BankTransferBank.Builder mBankName(String str) {
            this.mBankName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BankTransferBank bankTransferBank) {
            this.mBankCode = bankTransferBank.mBankCode();
            this.mBankName = bankTransferBank.mBankName();
            this.mBankAccount = bankTransferBank.mBankAccount();
        }
    }

    public C$$AutoValue_BankTransferBank(String str, @Nullable String str2, BankAccount bankAccount) {
        if (str == null) {
            throw new NullPointerException("Null mBankCode");
        }
        this.mBankCode = str;
        this.mBankName = str2;
        if (bankAccount == null) {
            throw new NullPointerException("Null mBankAccount");
        }
        this.mBankAccount = bankAccount;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof BankTransferBank) {
            BankTransferBank bankTransferBank = (BankTransferBank) obj;
            if (this.mBankCode.equals(bankTransferBank.mBankCode()) && ((str = this.mBankName) != null ? str.equals(bankTransferBank.mBankName()) : bankTransferBank.mBankName() == null) && this.mBankAccount.equals(bankTransferBank.mBankAccount())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mBankCode.hashCode() ^ 1000003) * 1000003;
        String str = this.mBankName;
        return ((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mBankAccount.hashCode();
    }

    @Override // com.paymaya.domain.model.BankTransferBank
    @InterfaceC1498b("account")
    public BankAccount mBankAccount() {
        return this.mBankAccount;
    }

    @Override // com.paymaya.domain.model.BankTransferBank
    @InterfaceC1498b("code")
    public String mBankCode() {
        return this.mBankCode;
    }

    @Override // com.paymaya.domain.model.BankTransferBank
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mBankName() {
        return this.mBankName;
    }

    @Override // com.paymaya.domain.model.BankTransferBank
    public BankTransferBank.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "BankTransferBank{mBankCode=" + this.mBankCode + ", mBankName=" + this.mBankName + ", mBankAccount=" + this.mBankAccount + "}";
    }
}
