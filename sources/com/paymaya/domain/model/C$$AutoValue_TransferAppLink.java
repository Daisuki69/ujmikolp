package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.paymaya.domain.model.TransferAppLink;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferAppLink, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TransferAppLink extends TransferAppLink {
    private final String mAccountType;
    private final String mAmount;
    private final String mCurrency;
    private final String mMessage;
    private final String mRecipient;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TransferAppLink$Builder */
    public static class Builder extends TransferAppLink.Builder {
        private String mAccountType;
        private String mAmount;
        private String mCurrency;
        private String mMessage;
        private String mRecipient;

        public /* synthetic */ Builder(TransferAppLink transferAppLink, int i) {
            this(transferAppLink);
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink build() {
            String strI = this.mRecipient == null ? " mRecipient" : "";
            if (this.mAccountType == null) {
                strI = s.i(strI, " mAccountType");
            }
            if (this.mCurrency == null) {
                strI = s.i(strI, " mCurrency");
            }
            if (this.mAmount == null) {
                strI = s.i(strI, " mAmount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_TransferAppLink(this.mRecipient, this.mAccountType, this.mCurrency, this.mAmount, this.mMessage);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink.Builder mAccountType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAccountType");
            }
            this.mAccountType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink.Builder mAmount(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAmount");
            }
            this.mAmount = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink.Builder mCurrency(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCurrency");
            }
            this.mCurrency = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink.Builder mMessage(@Nullable String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TransferAppLink.Builder
        public TransferAppLink.Builder mRecipient(String str) {
            if (str == null) {
                throw new NullPointerException("Null mRecipient");
            }
            this.mRecipient = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TransferAppLink transferAppLink) {
            this.mRecipient = transferAppLink.mRecipient();
            this.mAccountType = transferAppLink.mAccountType();
            this.mCurrency = transferAppLink.mCurrency();
            this.mAmount = transferAppLink.mAmount();
            this.mMessage = transferAppLink.mMessage();
        }
    }

    public C$$AutoValue_TransferAppLink(String str, String str2, String str3, String str4, @Nullable String str5) {
        if (str == null) {
            throw new NullPointerException("Null mRecipient");
        }
        this.mRecipient = str;
        if (str2 == null) {
            throw new NullPointerException("Null mAccountType");
        }
        this.mAccountType = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mCurrency");
        }
        this.mCurrency = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mAmount");
        }
        this.mAmount = str4;
        this.mMessage = str5;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransferAppLink) {
            TransferAppLink transferAppLink = (TransferAppLink) obj;
            if (this.mRecipient.equals(transferAppLink.mRecipient()) && this.mAccountType.equals(transferAppLink.mAccountType()) && this.mCurrency.equals(transferAppLink.mCurrency()) && this.mAmount.equals(transferAppLink.mAmount()) && ((str = this.mMessage) != null ? str.equals(transferAppLink.mMessage()) : transferAppLink.mMessage() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.mRecipient.hashCode() ^ 1000003) * 1000003) ^ this.mAccountType.hashCode()) * 1000003) ^ this.mCurrency.hashCode()) * 1000003) ^ this.mAmount.hashCode()) * 1000003;
        String str = this.mMessage;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    @InterfaceC1498b("t")
    public String mAccountType() {
        return this.mAccountType;
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    public String mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    @InterfaceC1498b("c")
    public String mCurrency() {
        return this.mCurrency;
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    @Nullable
    @InterfaceC1498b("m")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    @InterfaceC1498b("r")
    public String mRecipient() {
        return this.mRecipient;
    }

    @Override // com.paymaya.domain.model.TransferAppLink
    public TransferAppLink.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransferAppLink{mRecipient=");
        sb2.append(this.mRecipient);
        sb2.append(", mAccountType=");
        sb2.append(this.mAccountType);
        sb2.append(", mCurrency=");
        sb2.append(this.mCurrency);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mMessage=");
        return s.p(sb2, this.mMessage, "}");
    }
}
