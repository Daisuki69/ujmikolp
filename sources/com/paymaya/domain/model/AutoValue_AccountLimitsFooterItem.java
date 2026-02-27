package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.AccountLimitsFooterItem;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountLimitsFooterItem extends AccountLimitsFooterItem {
    private final int mHeaderType;

    public static final class Builder extends AccountLimitsFooterItem.Builder {
        private Integer mHeaderType;

        @Override // com.paymaya.domain.model.AccountLimitsFooterItem.Builder
        public AccountLimitsFooterItem build() {
            String str = this.mHeaderType == null ? " mHeaderType" : "";
            if (str.isEmpty()) {
                return new AutoValue_AccountLimitsFooterItem(this.mHeaderType.intValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.AccountLimitsFooterItem.Builder
        public AccountLimitsFooterItem.Builder mHeaderType(int i) {
            this.mHeaderType = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ AutoValue_AccountLimitsFooterItem(int i, int i4) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AccountLimitsFooterItem) && this.mHeaderType == ((AccountLimitsFooterItem) obj).mHeaderType();
    }

    public int hashCode() {
        return 1000003 ^ this.mHeaderType;
    }

    @Override // com.paymaya.domain.model.AccountLimitsFooterItem
    public int mHeaderType() {
        return this.mHeaderType;
    }

    public String toString() {
        return s.o(new StringBuilder("AccountLimitsFooterItem{mHeaderType="), "}", this.mHeaderType);
    }

    private AutoValue_AccountLimitsFooterItem(int i) {
        this.mHeaderType = i;
    }
}
