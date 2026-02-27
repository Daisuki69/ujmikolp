package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.TransferSender;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferSender, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TransferSender extends TransferSender {
    private final String mType;
    private final String mValue;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferSender$Builder */
    public static class Builder extends TransferSender.Builder {
        private String mType;
        private String mValue;

        @Override // com.paymaya.domain.model.TransferSender.Builder
        public TransferSender build() {
            String strI = this.mType == null ? " mType" : "";
            if (this.mValue == null) {
                strI = s.i(strI, " mValue");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TransferSender(this.mType, this.mValue);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TransferSender.Builder
        public TransferSender.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferSender.Builder
        public TransferSender.Builder mValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null mValue");
            }
            this.mValue = str;
            return this;
        }
    }

    public C$$AutoValue_TransferSender(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str;
        if (str2 == null) {
            throw new NullPointerException("Null mValue");
        }
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransferSender) {
            TransferSender transferSender = (TransferSender) obj;
            if (this.mType.equals(transferSender.mType()) && this.mValue.equals(transferSender.mValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mValue.hashCode();
    }

    @Override // com.paymaya.domain.model.TransferSender
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.TransferSender
    @InterfaceC1498b("value")
    public String mValue() {
        return this.mValue;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransferSender{mType=");
        sb2.append(this.mType);
        sb2.append(", mValue=");
        return s.p(sb2, this.mValue, "}");
    }
}
