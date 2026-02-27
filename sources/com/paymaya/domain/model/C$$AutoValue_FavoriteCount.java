package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.FavoriteCount;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteCount, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FavoriteCount extends FavoriteCount {
    private final int mLimit;
    private final int mUsed;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteCount$Builder */
    public static class Builder extends FavoriteCount.Builder {
        private Integer mLimit;
        private Integer mUsed;

        public /* synthetic */ Builder(FavoriteCount favoriteCount, int i) {
            this(favoriteCount);
        }

        @Override // com.paymaya.domain.model.FavoriteCount.Builder
        public FavoriteCount build() {
            String strI = this.mLimit == null ? " mLimit" : "";
            if (this.mUsed == null) {
                strI = s.i(strI, " mUsed");
            }
            if (strI.isEmpty()) {
                return new AutoValue_FavoriteCount(this.mLimit.intValue(), this.mUsed.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.FavoriteCount.Builder
        public FavoriteCount.Builder mLimit(int i) {
            this.mLimit = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteCount.Builder
        public FavoriteCount.Builder mUsed(int i) {
            this.mUsed = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(FavoriteCount favoriteCount) {
            this.mLimit = Integer.valueOf(favoriteCount.mLimit());
            this.mUsed = Integer.valueOf(favoriteCount.mUsed());
        }
    }

    public C$$AutoValue_FavoriteCount(int i, int i4) {
        this.mLimit = i;
        this.mUsed = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FavoriteCount) {
            FavoriteCount favoriteCount = (FavoriteCount) obj;
            if (this.mLimit == favoriteCount.mLimit() && this.mUsed == favoriteCount.mUsed()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mLimit ^ 1000003) * 1000003) ^ this.mUsed;
    }

    @Override // com.paymaya.domain.model.FavoriteCount
    @InterfaceC1498b("limit")
    public int mLimit() {
        return this.mLimit;
    }

    @Override // com.paymaya.domain.model.FavoriteCount
    @InterfaceC1498b("total")
    public int mUsed() {
        return this.mUsed;
    }

    @Override // com.paymaya.domain.model.FavoriteCount
    public FavoriteCount.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteCount{mLimit=");
        sb2.append(this.mLimit);
        sb2.append(", mUsed=");
        return s.o(sb2, "}", this.mUsed);
    }
}
