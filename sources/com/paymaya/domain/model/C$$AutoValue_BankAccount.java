package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.BankAccount;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankAccount, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_BankAccount extends BankAccount {
    private final String mAccountName;
    private final String mFirstName;
    private final String mLastName;
    private final String mMiddleName;
    private final String mRecipientMobileNumber;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_BankAccount$Builder */
    public static class Builder extends BankAccount.Builder {
        private String mAccountName;
        private String mFirstName;
        private String mLastName;
        private String mMiddleName;
        private String mRecipientMobileNumber;

        public /* synthetic */ Builder(BankAccount bankAccount, int i) {
            this(bankAccount);
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount build() {
            return new AutoValue_BankAccount(this.mFirstName, this.mMiddleName, this.mLastName, this.mAccountName, this.mRecipientMobileNumber);
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount.Builder mAccountName(String str) {
            this.mAccountName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount.Builder mFirstName(String str) {
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount.Builder mLastName(String str) {
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount.Builder mMiddleName(String str) {
            this.mMiddleName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.BankAccount.Builder
        public BankAccount.Builder mRecipientMobileNumber(String str) {
            this.mRecipientMobileNumber = str;
            return this;
        }

        public Builder() {
        }

        private Builder(BankAccount bankAccount) {
            this.mFirstName = bankAccount.mFirstName();
            this.mMiddleName = bankAccount.mMiddleName();
            this.mLastName = bankAccount.mLastName();
            this.mAccountName = bankAccount.mAccountName();
            this.mRecipientMobileNumber = bankAccount.mRecipientMobileNumber();
        }
    }

    public C$$AutoValue_BankAccount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.mFirstName = str;
        this.mMiddleName = str2;
        this.mLastName = str3;
        this.mAccountName = str4;
        this.mRecipientMobileNumber = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BankAccount) {
            BankAccount bankAccount = (BankAccount) obj;
            String str = this.mFirstName;
            if (str != null ? str.equals(bankAccount.mFirstName()) : bankAccount.mFirstName() == null) {
                String str2 = this.mMiddleName;
                if (str2 != null ? str2.equals(bankAccount.mMiddleName()) : bankAccount.mMiddleName() == null) {
                    String str3 = this.mLastName;
                    if (str3 != null ? str3.equals(bankAccount.mLastName()) : bankAccount.mLastName() == null) {
                        String str4 = this.mAccountName;
                        if (str4 != null ? str4.equals(bankAccount.mAccountName()) : bankAccount.mAccountName() == null) {
                            String str5 = this.mRecipientMobileNumber;
                            if (str5 != null ? str5.equals(bankAccount.mRecipientMobileNumber()) : bankAccount.mRecipientMobileNumber() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mFirstName;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mMiddleName;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mLastName;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mAccountName;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mRecipientMobileNumber;
        return iHashCode4 ^ (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.BankAccount
    @Nullable
    @InterfaceC1498b("account_name")
    public String mAccountName() {
        return this.mAccountName;
    }

    @Override // com.paymaya.domain.model.BankAccount
    @Nullable
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.BankAccount
    @Nullable
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.BankAccount
    @Nullable
    @InterfaceC1498b("middle_name")
    public String mMiddleName() {
        return this.mMiddleName;
    }

    @Override // com.paymaya.domain.model.BankAccount
    @Nullable
    @InterfaceC1498b("mobile_number")
    public String mRecipientMobileNumber() {
        return this.mRecipientMobileNumber;
    }

    @Override // com.paymaya.domain.model.BankAccount
    public BankAccount.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BankAccount{mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mMiddleName=");
        sb2.append(this.mMiddleName);
        sb2.append(", mLastName=");
        sb2.append(this.mLastName);
        sb2.append(", mAccountName=");
        sb2.append(this.mAccountName);
        sb2.append(", mRecipientMobileNumber=");
        return s.p(sb2, this.mRecipientMobileNumber, "}");
    }
}
