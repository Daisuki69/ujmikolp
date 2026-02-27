package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.QRMerchant;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_QRMerchant, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_QRMerchant extends QRMerchant {
    private final Amount mAmount;
    private final String mMerchantId;
    private final String mName;
    private final String mPaymentId;
    private final String mQrPayload;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_QRMerchant$Builder */
    public static class Builder extends QRMerchant.Builder {
        private Amount mAmount;
        private String mMerchantId;
        private String mName;
        private String mPaymentId;
        private String mQrPayload;
        private String mType;

        public /* synthetic */ Builder(QRMerchant qRMerchant, int i) {
            this(qRMerchant);
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant build() {
            return new AutoValue_QRMerchant(this.mMerchantId, this.mName, this.mType, this.mAmount, this.mPaymentId, this.mQrPayload);
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mAmount(Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mMerchantId(String str) {
            this.mMerchantId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mName(String str) {
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mPaymentId(String str) {
            this.mPaymentId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mQrPayload(String str) {
            this.mQrPayload = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRMerchant.Builder
        public QRMerchant.Builder mType(String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(QRMerchant qRMerchant) {
            this.mMerchantId = qRMerchant.mMerchantId();
            this.mName = qRMerchant.mName();
            this.mType = qRMerchant.mType();
            this.mAmount = qRMerchant.mAmount();
            this.mPaymentId = qRMerchant.mPaymentId();
            this.mQrPayload = qRMerchant.mQrPayload();
        }
    }

    public C$$AutoValue_QRMerchant(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Amount amount, @Nullable String str4, @Nullable String str5) {
        this.mMerchantId = str;
        this.mName = str2;
        this.mType = str3;
        this.mAmount = amount;
        this.mPaymentId = str4;
        this.mQrPayload = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QRMerchant) {
            QRMerchant qRMerchant = (QRMerchant) obj;
            String str = this.mMerchantId;
            if (str != null ? str.equals(qRMerchant.mMerchantId()) : qRMerchant.mMerchantId() == null) {
                String str2 = this.mName;
                if (str2 != null ? str2.equals(qRMerchant.mName()) : qRMerchant.mName() == null) {
                    String str3 = this.mType;
                    if (str3 != null ? str3.equals(qRMerchant.mType()) : qRMerchant.mType() == null) {
                        Amount amount = this.mAmount;
                        if (amount != null ? amount.equals(qRMerchant.mAmount()) : qRMerchant.mAmount() == null) {
                            String str4 = this.mPaymentId;
                            if (str4 != null ? str4.equals(qRMerchant.mPaymentId()) : qRMerchant.mPaymentId() == null) {
                                String str5 = this.mQrPayload;
                                if (str5 != null ? str5.equals(qRMerchant.mQrPayload()) : qRMerchant.mQrPayload() == null) {
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
        String str = this.mMerchantId;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mName;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mType;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode4 = (iHashCode3 ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        String str4 = this.mPaymentId;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mQrPayload;
        return iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public String mMerchantId() {
        return this.mMerchantId;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public String mPaymentId() {
        return this.mPaymentId;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public String mQrPayload() {
        return this.mQrPayload;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    @Nullable
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.QRMerchant
    public QRMerchant.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QRMerchant{mMerchantId=");
        sb2.append(this.mMerchantId);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mPaymentId=");
        sb2.append(this.mPaymentId);
        sb2.append(", mQrPayload=");
        return s.p(sb2, this.mQrPayload, "}");
    }
}
