package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Bank;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Bank, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Bank extends Bank {
    private final String mBankCode;
    private final String mBankIC;
    private final String mBankName;
    private final String mFee;
    private final Boolean mIsActive;
    private final Boolean mIsMaintenance;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Bank$Builder */
    public static class Builder extends Bank.Builder {
        private String mBankCode;
        private String mBankIC;
        private String mBankName;
        private String mFee;
        private Boolean mIsActive;
        private Boolean mIsMaintenance;

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank build() {
            return new AutoValue_Bank(this.mBankCode, this.mBankName, this.mIsActive, this.mIsMaintenance, this.mFee, this.mBankIC);
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mBankCode(String str) {
            this.mBankCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mBankIC(String str) {
            this.mBankIC = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mBankName(String str) {
            this.mBankName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mFee(String str) {
            this.mFee = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mIsActive(Boolean bool) {
            this.mIsActive = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.Bank.Builder
        public Bank.Builder mIsMaintenance(Boolean bool) {
            this.mIsMaintenance = bool;
            return this;
        }
    }

    public C$$AutoValue_Bank(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable String str4) {
        this.mBankCode = str;
        this.mBankName = str2;
        this.mIsActive = bool;
        this.mIsMaintenance = bool2;
        this.mFee = str3;
        this.mBankIC = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bank) {
            Bank bank = (Bank) obj;
            String str = this.mBankCode;
            if (str != null ? str.equals(bank.mBankCode()) : bank.mBankCode() == null) {
                String str2 = this.mBankName;
                if (str2 != null ? str2.equals(bank.mBankName()) : bank.mBankName() == null) {
                    Boolean bool = this.mIsActive;
                    if (bool != null ? bool.equals(bank.mIsActive()) : bank.mIsActive() == null) {
                        Boolean bool2 = this.mIsMaintenance;
                        if (bool2 != null ? bool2.equals(bank.mIsMaintenance()) : bank.mIsMaintenance() == null) {
                            String str3 = this.mFee;
                            if (str3 != null ? str3.equals(bank.mFee()) : bank.mFee() == null) {
                                String str4 = this.mBankIC;
                                if (str4 != null ? str4.equals(bank.mBankIC()) : bank.mBankIC() == null) {
                                    return true;
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
        String str = this.mBankCode;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mBankName;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.mIsActive;
        int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.mIsMaintenance;
        int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        String str3 = this.mFee;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mBankIC;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("bank_code")
    public String mBankCode() {
        return this.mBankCode;
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("bank_ic")
    public String mBankIC() {
        return this.mBankIC;
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("bank_name")
    public String mBankName() {
        return this.mBankName;
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("fee")
    public String mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("is_active")
    public Boolean mIsActive() {
        return this.mIsActive;
    }

    @Override // com.paymaya.domain.model.Bank
    @Nullable
    @InterfaceC1498b("is_maintenance")
    public Boolean mIsMaintenance() {
        return this.mIsMaintenance;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Bank{mBankCode=");
        sb2.append(this.mBankCode);
        sb2.append(", mBankName=");
        sb2.append(this.mBankName);
        sb2.append(", mIsActive=");
        sb2.append(this.mIsActive);
        sb2.append(", mIsMaintenance=");
        sb2.append(this.mIsMaintenance);
        sb2.append(", mFee=");
        sb2.append(this.mFee);
        sb2.append(", mBankIC=");
        return s.p(sb2, this.mBankIC, "}");
    }
}
