package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.QRBankTransferRecipient;

/* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_QRBankTransferRecipient, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$AutoValue_QRBankTransferRecipient extends QRBankTransferRecipient {
    private final String mAccountName;
    private final String mAccountNumber;
    private final Double mAmount;
    private final String mBankBic;
    private final String mBankName;
    private final QRPHAdditionalData mQRPHAdditionalData;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_QRBankTransferRecipient$Builder */
    public static class Builder extends QRBankTransferRecipient.Builder {
        private String mAccountName;
        private String mAccountNumber;
        private Double mAmount;
        private String mBankBic;
        private String mBankName;
        private QRPHAdditionalData mQRPHAdditionalData;

        public /* synthetic */ Builder(QRBankTransferRecipient qRBankTransferRecipient, int i) {
            this(qRBankTransferRecipient);
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient build() {
            String str = this.mAccountNumber == null ? " mAccountNumber" : "";
            if (str.isEmpty()) {
                return new AutoValue_QRBankTransferRecipient(this.mBankName, this.mAccountNumber, this.mAccountName, this.mAmount, this.mBankBic, this.mQRPHAdditionalData);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mAccountName(String str) {
            this.mAccountName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mAccountNumber(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAccountNumber");
            }
            this.mAccountNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mAmount(Double d10) {
            this.mAmount = d10;
            return this;
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mBankBic(String str) {
            this.mBankBic = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mBankName(String str) {
            this.mBankName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRBankTransferRecipient.Builder
        public QRBankTransferRecipient.Builder mQRPHAdditionalData(QRPHAdditionalData qRPHAdditionalData) {
            this.mQRPHAdditionalData = qRPHAdditionalData;
            return this;
        }

        public Builder() {
        }

        private Builder(QRBankTransferRecipient qRBankTransferRecipient) {
            this.mBankName = qRBankTransferRecipient.mBankName();
            this.mAccountNumber = qRBankTransferRecipient.mAccountNumber();
            this.mAccountName = qRBankTransferRecipient.mAccountName();
            this.mAmount = qRBankTransferRecipient.mAmount();
            this.mBankBic = qRBankTransferRecipient.mBankBic();
            this.mQRPHAdditionalData = qRBankTransferRecipient.mQRPHAdditionalData();
        }
    }

    public C$AutoValue_QRBankTransferRecipient(@Nullable String str, String str2, @Nullable String str3, @Nullable Double d10, @Nullable String str4, @Nullable QRPHAdditionalData qRPHAdditionalData) {
        this.mBankName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mAccountNumber");
        }
        this.mAccountNumber = str2;
        this.mAccountName = str3;
        this.mAmount = d10;
        this.mBankBic = str4;
        this.mQRPHAdditionalData = qRPHAdditionalData;
    }

    public boolean equals(Object obj) {
        String str;
        Double d10;
        String str2;
        QRPHAdditionalData qRPHAdditionalData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof QRBankTransferRecipient) {
            QRBankTransferRecipient qRBankTransferRecipient = (QRBankTransferRecipient) obj;
            String str3 = this.mBankName;
            if (str3 != null ? str3.equals(qRBankTransferRecipient.mBankName()) : qRBankTransferRecipient.mBankName() == null) {
                if (this.mAccountNumber.equals(qRBankTransferRecipient.mAccountNumber()) && ((str = this.mAccountName) != null ? str.equals(qRBankTransferRecipient.mAccountName()) : qRBankTransferRecipient.mAccountName() == null) && ((d10 = this.mAmount) != null ? d10.equals(qRBankTransferRecipient.mAmount()) : qRBankTransferRecipient.mAmount() == null) && ((str2 = this.mBankBic) != null ? str2.equals(qRBankTransferRecipient.mBankBic()) : qRBankTransferRecipient.mBankBic() == null) && ((qRPHAdditionalData = this.mQRPHAdditionalData) != null ? qRPHAdditionalData.equals(qRBankTransferRecipient.mQRPHAdditionalData()) : qRBankTransferRecipient.mQRPHAdditionalData() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mBankName;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mAccountNumber.hashCode()) * 1000003;
        String str2 = this.mAccountName;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Double d10 = this.mAmount;
        int iHashCode3 = (iHashCode2 ^ (d10 == null ? 0 : d10.hashCode())) * 1000003;
        String str3 = this.mBankBic;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        QRPHAdditionalData qRPHAdditionalData = this.mQRPHAdditionalData;
        return iHashCode4 ^ (qRPHAdditionalData != null ? qRPHAdditionalData.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    @Nullable
    public String mAccountName() {
        return this.mAccountName;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    public String mAccountNumber() {
        return this.mAccountNumber;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    @Nullable
    public Double mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    @Nullable
    public String mBankBic() {
        return this.mBankBic;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    @Nullable
    public String mBankName() {
        return this.mBankName;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    @Nullable
    public QRPHAdditionalData mQRPHAdditionalData() {
        return this.mQRPHAdditionalData;
    }

    @Override // com.paymaya.domain.model.QRBankTransferRecipient
    public QRBankTransferRecipient.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "QRBankTransferRecipient{mBankName=" + this.mBankName + ", mAccountNumber=" + this.mAccountNumber + ", mAccountName=" + this.mAccountName + ", mAmount=" + this.mAmount + ", mBankBic=" + this.mBankBic + ", mQRPHAdditionalData=" + this.mQRPHAdditionalData + "}";
    }
}
