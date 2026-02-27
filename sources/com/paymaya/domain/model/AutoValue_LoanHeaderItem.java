package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.LoanHeaderItem;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoanHeaderItem extends LoanHeaderItem {
    private final int mHeaderType;

    public static final class Builder extends LoanHeaderItem.Builder {
        private Integer mHeaderType;

        @Override // com.paymaya.domain.model.LoanHeaderItem.Builder
        public LoanHeaderItem build() {
            String str = this.mHeaderType == null ? " mHeaderType" : "";
            if (str.isEmpty()) {
                return new AutoValue_LoanHeaderItem(this.mHeaderType.intValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.LoanHeaderItem.Builder
        public LoanHeaderItem.Builder mHeaderType(int i) {
            this.mHeaderType = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ AutoValue_LoanHeaderItem(int i, int i4) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LoanHeaderItem) && this.mHeaderType == ((LoanHeaderItem) obj).mHeaderType();
    }

    public int hashCode() {
        return 1000003 ^ this.mHeaderType;
    }

    @Override // com.paymaya.domain.model.LoanHeaderItem
    public int mHeaderType() {
        return this.mHeaderType;
    }

    public String toString() {
        return s.o(new StringBuilder("LoanHeaderItem{mHeaderType="), "}", this.mHeaderType);
    }

    private AutoValue_LoanHeaderItem(int i) {
        this.mHeaderType = i;
    }
}
