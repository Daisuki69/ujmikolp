package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.Meta;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Meta, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Meta extends Meta {
    private final int mCurrentPage;
    private final int mTotalPage;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Meta$Builder */
    public static class Builder extends Meta.Builder {
        private Integer mCurrentPage;
        private Integer mTotalPage;

        @Override // com.paymaya.domain.model.Meta.Builder
        public Meta build() {
            String strI = this.mCurrentPage == null ? " mCurrentPage" : "";
            if (this.mTotalPage == null) {
                strI = s.i(strI, " mTotalPage");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Meta(this.mCurrentPage.intValue(), this.mTotalPage.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Meta.Builder
        public Meta.Builder mCurrentPage(int i) {
            this.mCurrentPage = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.Meta.Builder
        public Meta.Builder mTotalPage(int i) {
            this.mTotalPage = Integer.valueOf(i);
            return this;
        }
    }

    public C$$AutoValue_Meta(int i, int i4) {
        this.mCurrentPage = i;
        this.mTotalPage = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Meta) {
            Meta meta = (Meta) obj;
            if (this.mCurrentPage == meta.mCurrentPage() && this.mTotalPage == meta.mTotalPage()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mCurrentPage ^ 1000003) * 1000003) ^ this.mTotalPage;
    }

    @Override // com.paymaya.domain.model.Meta
    @InterfaceC1498b(alternate = {"currentPage"}, value = "current_page")
    public int mCurrentPage() {
        return this.mCurrentPage;
    }

    @Override // com.paymaya.domain.model.Meta
    @InterfaceC1498b(alternate = {"totalPage"}, value = "total_page")
    public int mTotalPage() {
        return this.mTotalPage;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Meta{mCurrentPage=");
        sb2.append(this.mCurrentPage);
        sb2.append(", mTotalPage=");
        return s.o(sb2, "}", this.mTotalPage);
    }
}
