package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.AccountName;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_AccountName, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_AccountName extends AccountName {
    private final String mFirstName;
    private final String mLastName;
    private final String mMiddleName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_AccountName$Builder */
    public static class Builder extends AccountName.Builder {
        private String mFirstName;
        private String mLastName;
        private String mMiddleName;

        @Override // com.paymaya.domain.model.AccountName.Builder
        public AccountName build() {
            String strI = this.mFirstName == null ? " mFirstName" : "";
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_AccountName(this.mFirstName, this.mMiddleName, this.mLastName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.AccountName.Builder
        public AccountName.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.AccountName.Builder
        public AccountName.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.AccountName.Builder
        public AccountName.Builder mMiddleName(String str) {
            this.mMiddleName = str;
            return this;
        }
    }

    public C$$AutoValue_AccountName(String str, @Nullable String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null mFirstName");
        }
        this.mFirstName = str;
        this.mMiddleName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mLastName");
        }
        this.mLastName = str3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountName) {
            AccountName accountName = (AccountName) obj;
            if (this.mFirstName.equals(accountName.mFirstName()) && ((str = this.mMiddleName) != null ? str.equals(accountName.mMiddleName()) : accountName.mMiddleName() == null) && this.mLastName.equals(accountName.mLastName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mFirstName.hashCode() ^ 1000003) * 1000003;
        String str = this.mMiddleName;
        return ((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mLastName.hashCode();
    }

    @Override // com.paymaya.domain.model.AccountName
    @InterfaceC1498b("firstName")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.AccountName
    @InterfaceC1498b("last")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.AccountName
    @Nullable
    @InterfaceC1498b("middle")
    public String mMiddleName() {
        return this.mMiddleName;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccountName{mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mMiddleName=");
        sb2.append(this.mMiddleName);
        sb2.append(", mLastName=");
        return s.p(sb2, this.mLastName, "}");
    }
}
