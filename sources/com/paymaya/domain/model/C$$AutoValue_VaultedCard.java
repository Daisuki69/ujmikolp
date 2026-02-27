package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.VaultedCard;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VaultedCard, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VaultedCard extends VaultedCard {
    private final String mCardScheme;
    private final String mCardTokenId;
    private final String mLastFourDigits;
    private final String mState;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VaultedCard$Builder */
    public static class Builder extends VaultedCard.Builder {
        private String mCardScheme;
        private String mCardTokenId;
        private String mLastFourDigits;
        private String mState;

        @Override // com.paymaya.domain.model.VaultedCard.Builder
        public VaultedCard build() {
            String strI = this.mState == null ? " mState" : "";
            if (this.mLastFourDigits == null) {
                strI = s.i(strI, " mLastFourDigits");
            }
            if (this.mCardScheme == null) {
                strI = s.i(strI, " mCardScheme");
            }
            if (this.mCardTokenId == null) {
                strI = s.i(strI, " mCardTokenId");
            }
            if (strI.isEmpty()) {
                return new AutoValue_VaultedCard(this.mState, this.mLastFourDigits, this.mCardScheme, this.mCardTokenId);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.VaultedCard.Builder
        public VaultedCard.Builder mCardScheme(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCardScheme");
            }
            this.mCardScheme = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VaultedCard.Builder
        public VaultedCard.Builder mCardTokenId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCardTokenId");
            }
            this.mCardTokenId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VaultedCard.Builder
        public VaultedCard.Builder mLastFourDigits(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastFourDigits");
            }
            this.mLastFourDigits = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VaultedCard.Builder
        public VaultedCard.Builder mState(String str) {
            if (str == null) {
                throw new NullPointerException("Null mState");
            }
            this.mState = str;
            return this;
        }
    }

    public C$$AutoValue_VaultedCard(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null mState");
        }
        this.mState = str;
        if (str2 == null) {
            throw new NullPointerException("Null mLastFourDigits");
        }
        this.mLastFourDigits = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mCardScheme");
        }
        this.mCardScheme = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mCardTokenId");
        }
        this.mCardTokenId = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VaultedCard) {
            VaultedCard vaultedCard = (VaultedCard) obj;
            if (this.mState.equals(vaultedCard.mState()) && this.mLastFourDigits.equals(vaultedCard.mLastFourDigits()) && this.mCardScheme.equals(vaultedCard.mCardScheme()) && this.mCardTokenId.equals(vaultedCard.mCardTokenId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.mState.hashCode() ^ 1000003) * 1000003) ^ this.mLastFourDigits.hashCode()) * 1000003) ^ this.mCardScheme.hashCode()) * 1000003) ^ this.mCardTokenId.hashCode();
    }

    @Override // com.paymaya.domain.model.VaultedCard
    @InterfaceC1498b("scheme")
    public String mCardScheme() {
        return this.mCardScheme;
    }

    @Override // com.paymaya.domain.model.VaultedCard
    @InterfaceC1498b("card_token_id")
    public String mCardTokenId() {
        return this.mCardTokenId;
    }

    @Override // com.paymaya.domain.model.VaultedCard
    @InterfaceC1498b("last_four")
    public String mLastFourDigits() {
        return this.mLastFourDigits;
    }

    @Override // com.paymaya.domain.model.VaultedCard
    @InterfaceC1498b("state")
    public String mState() {
        return this.mState;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VaultedCard{mState=");
        sb2.append(this.mState);
        sb2.append(", mLastFourDigits=");
        sb2.append(this.mLastFourDigits);
        sb2.append(", mCardScheme=");
        sb2.append(this.mCardScheme);
        sb2.append(", mCardTokenId=");
        return s.p(sb2, this.mCardTokenId, "}");
    }
}
