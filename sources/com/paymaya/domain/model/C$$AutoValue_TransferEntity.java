package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.TransferEntity;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferEntity, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TransferEntity extends TransferEntity {
    private final String mFirstName;
    private final String mLastName;
    private final String mMobileNumber;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferEntity$Builder */
    public static class Builder extends TransferEntity.Builder {
        private String mFirstName;
        private String mLastName;
        private String mMobileNumber;

        public /* synthetic */ Builder(TransferEntity transferEntity, int i) {
            this(transferEntity);
        }

        @Override // com.paymaya.domain.model.TransferEntity.Builder
        public TransferEntity build() {
            String strI = this.mFirstName == null ? " mFirstName" : "";
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (this.mMobileNumber == null) {
                strI = s.i(strI, " mMobileNumber");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TransferEntity(this.mFirstName, this.mLastName, this.mMobileNumber);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TransferEntity.Builder
        public TransferEntity.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferEntity.Builder
        public TransferEntity.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferEntity.Builder
        public TransferEntity.Builder mMobileNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMobileNumber");
            }
            this.mMobileNumber = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TransferEntity transferEntity) {
            this.mFirstName = transferEntity.mFirstName();
            this.mLastName = transferEntity.mLastName();
            this.mMobileNumber = transferEntity.mMobileNumber();
        }
    }

    public C$$AutoValue_TransferEntity(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null mFirstName");
        }
        this.mFirstName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mLastName");
        }
        this.mLastName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mMobileNumber");
        }
        this.mMobileNumber = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransferEntity) {
            TransferEntity transferEntity = (TransferEntity) obj;
            if (this.mFirstName.equals(transferEntity.mFirstName()) && this.mLastName.equals(transferEntity.mLastName()) && this.mMobileNumber.equals(transferEntity.mMobileNumber())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mFirstName.hashCode() ^ 1000003) * 1000003) ^ this.mLastName.hashCode()) * 1000003) ^ this.mMobileNumber.hashCode();
    }

    @Override // com.paymaya.domain.model.TransferEntity
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.TransferEntity
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.TransferEntity
    @InterfaceC1498b("msisdn")
    public String mMobileNumber() {
        return this.mMobileNumber;
    }

    @Override // com.paymaya.domain.model.TransferEntity
    public TransferEntity.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransferEntity{mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mLastName=");
        sb2.append(this.mLastName);
        sb2.append(", mMobileNumber=");
        return s.p(sb2, this.mMobileNumber, "}");
    }
}
