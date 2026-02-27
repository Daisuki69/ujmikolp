package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.TransferRecipient;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferRecipient, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TransferRecipient extends TransferRecipient {
    private final String mRecipientName;
    private final String mType;
    private final String mUnformattedValue;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferRecipient$Builder */
    public static class Builder extends TransferRecipient.Builder {
        private String mRecipientName;
        private String mType;
        private String mUnformattedValue;
        private String mValue;

        public /* synthetic */ Builder(TransferRecipient transferRecipient, int i) {
            this(transferRecipient);
        }

        @Override // com.paymaya.domain.model.TransferRecipient.Builder
        public TransferRecipient build() {
            String strI = this.mType == null ? " mType" : "";
            if (this.mValue == null) {
                strI = s.i(strI, " mValue");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TransferRecipient(this.mType, this.mValue, this.mUnformattedValue, this.mRecipientName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TransferRecipient.Builder
        public TransferRecipient.Builder mRecipientName(String str) {
            this.mRecipientName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferRecipient.Builder
        public TransferRecipient.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferRecipient.Builder
        public TransferRecipient.Builder mUnformattedValue(String str) {
            this.mUnformattedValue = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferRecipient.Builder
        public TransferRecipient.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TransferRecipient transferRecipient) {
            this.mType = transferRecipient.mType();
            this.mValue = transferRecipient.mValue();
            this.mUnformattedValue = transferRecipient.mUnformattedValue();
            this.mRecipientName = transferRecipient.mRecipientName();
        }
    }

    public C$$AutoValue_TransferRecipient(String str, String str2, @Nullable String str3, @Nullable String str4) {
        if (str == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str2;
        this.mUnformattedValue = str3;
        this.mRecipientName = str4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransferRecipient) {
            TransferRecipient transferRecipient = (TransferRecipient) obj;
            if (this.mType.equals(transferRecipient.mType()) && this.mValue.equals(transferRecipient.mValue()) && ((str = this.mUnformattedValue) != null ? str.equals(transferRecipient.mUnformattedValue()) : transferRecipient.mUnformattedValue() == null) && ((str2 = this.mRecipientName) != null ? str2.equals(transferRecipient.mRecipientName()) : transferRecipient.mRecipientName() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mValue.hashCode()) * 1000003;
        String str = this.mUnformattedValue;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mRecipientName;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.TransferRecipient
    @Nullable
    public String mRecipientName() {
        return this.mRecipientName;
    }

    @Override // com.paymaya.domain.model.TransferRecipient
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.TransferRecipient
    @Nullable
    public String mUnformattedValue() {
        return this.mUnformattedValue;
    }

    @Override // com.paymaya.domain.model.TransferRecipient
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    @Override // com.paymaya.domain.model.TransferRecipient
    public TransferRecipient.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransferRecipient{mType=");
        sb2.append(this.mType);
        sb2.append(", mValue=");
        sb2.append(this.mValue);
        sb2.append(", mUnformattedValue=");
        sb2.append(this.mUnformattedValue);
        sb2.append(", mRecipientName=");
        return s.p(sb2, this.mRecipientName, "}");
    }
}
