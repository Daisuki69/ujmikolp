package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.paymaya.domain.model.QRRecipient;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_QRRecipient, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_QRRecipient extends QRRecipient {
    private final String mAmount;
    private final String mMessage;
    private final String mType;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_QRRecipient$Builder */
    public static class Builder extends QRRecipient.Builder {
        private String mAmount;
        private String mMessage;
        private String mType;
        private String mValue;

        @Override // com.paymaya.domain.model.QRRecipient.Builder
        public QRRecipient build() {
            String strI = this.mValue == null ? " mValue" : "";
            if (this.mType == null) {
                strI = s.i(strI, " mType");
            }
            if (strI.isEmpty()) {
                return new AutoValue_QRRecipient(this.mValue, this.mType, this.mAmount, this.mMessage);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.QRRecipient.Builder
        public QRRecipient.Builder mAmount(@Nullable String str) {
            this.mAmount = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRRecipient.Builder
        public QRRecipient.Builder mMessage(@Nullable String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRRecipient.Builder
        public QRRecipient.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.QRRecipient.Builder
        public QRRecipient.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }
    }

    public C$$AutoValue_QRRecipient(String str, String str2, @Nullable String str3, @Nullable String str4) {
        if (str == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str;
        if (str2 == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str2;
        this.mAmount = str3;
        this.mMessage = str4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof QRRecipient) {
            QRRecipient qRRecipient = (QRRecipient) obj;
            if (this.mValue.equals(qRRecipient.mValue()) && this.mType.equals(qRRecipient.mType()) && ((str = this.mAmount) != null ? str.equals(qRRecipient.mAmount()) : qRRecipient.mAmount() == null) && ((str2 = this.mMessage) != null ? str2.equals(qRRecipient.mMessage()) : qRRecipient.mMessage() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mValue.hashCode() ^ 1000003) * 1000003) ^ this.mType.hashCode()) * 1000003;
        String str = this.mAmount;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mMessage;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.QRRecipient
    @Nullable
    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    public String mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.QRRecipient
    @Nullable
    @InterfaceC1498b("m")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.QRRecipient
    @InterfaceC1498b("t")
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.QRRecipient
    @InterfaceC1498b("v")
    public String mValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QRRecipient{mValue=");
        sb2.append(this.mValue);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mMessage=");
        return s.p(sb2, this.mMessage, "}");
    }
}
