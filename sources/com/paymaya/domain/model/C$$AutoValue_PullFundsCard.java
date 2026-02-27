package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.PullFundsCard;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PullFundsCard, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PullFundsCard extends PullFundsCard {
    private final String mLastFour;
    private final String mScheme;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PullFundsCard$Builder */
    public static class Builder extends PullFundsCard.Builder {
        private String mLastFour;
        private String mScheme;

        public /* synthetic */ Builder(PullFundsCard pullFundsCard, int i) {
            this(pullFundsCard);
        }

        @Override // com.paymaya.domain.model.PullFundsCard.Builder
        public PullFundsCard build() {
            String strI = this.mLastFour == null ? " mLastFour" : "";
            if (this.mScheme == null) {
                strI = s.i(strI, " mScheme");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PullFundsCard(this.mLastFour, this.mScheme);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PullFundsCard.Builder
        public PullFundsCard.Builder mLastFour(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastFour");
            }
            this.mLastFour = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PullFundsCard.Builder
        public PullFundsCard.Builder mScheme(String str) {
            if (str == null) {
                throw new NullPointerException("Null mScheme");
            }
            this.mScheme = str;
            return this;
        }

        public Builder() {
        }

        private Builder(PullFundsCard pullFundsCard) {
            this.mLastFour = pullFundsCard.mLastFour();
            this.mScheme = pullFundsCard.mScheme();
        }
    }

    public C$$AutoValue_PullFundsCard(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mLastFour");
        }
        this.mLastFour = str;
        if (str2 == null) {
            throw new NullPointerException("Null mScheme");
        }
        this.mScheme = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PullFundsCard) {
            PullFundsCard pullFundsCard = (PullFundsCard) obj;
            if (this.mLastFour.equals(pullFundsCard.mLastFour()) && this.mScheme.equals(pullFundsCard.mScheme())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mLastFour.hashCode() ^ 1000003) * 1000003) ^ this.mScheme.hashCode();
    }

    @Override // com.paymaya.domain.model.PullFundsCard
    @InterfaceC1498b("last_four")
    public String mLastFour() {
        return this.mLastFour;
    }

    @Override // com.paymaya.domain.model.PullFundsCard
    @InterfaceC1498b("scheme")
    public String mScheme() {
        return this.mScheme;
    }

    @Override // com.paymaya.domain.model.PullFundsCard
    public PullFundsCard.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PullFundsCard{mLastFour=");
        sb2.append(this.mLastFour);
        sb2.append(", mScheme=");
        return s.p(sb2, this.mScheme, "}");
    }
}
