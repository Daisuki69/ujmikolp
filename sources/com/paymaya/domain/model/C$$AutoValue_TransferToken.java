package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.TransferToken;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferToken, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TransferToken extends TransferToken {
    private final String mId;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferToken$Builder */
    public static class Builder extends TransferToken.Builder {
        private String mId;
        private String mStatus;

        @Override // com.paymaya.domain.model.TransferToken.Builder
        public TransferToken build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TransferToken(this.mId, this.mStatus);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TransferToken.Builder
        public TransferToken.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferToken.Builder
        public TransferToken.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }
    }

    public C$$AutoValue_TransferToken(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransferToken) {
            TransferToken transferToken = (TransferToken) obj;
            if (this.mId.equals(transferToken.mId()) && this.mStatus.equals(transferToken.mStatus())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mStatus.hashCode();
    }

    @Override // com.paymaya.domain.model.TransferToken
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.TransferToken
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransferToken{mId=");
        sb2.append(this.mId);
        sb2.append(", mStatus=");
        return s.p(sb2, this.mStatus, "}");
    }
}
