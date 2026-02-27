package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.EkycAccountTypeHeaderAdapterItem;

/* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EkycAccountTypeHeaderAdapterItem, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$AutoValue_EkycAccountTypeHeaderAdapterItem extends EkycAccountTypeHeaderAdapterItem {
    private final int mHeaderType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EkycAccountTypeHeaderAdapterItem$Builder */
    public static class Builder extends EkycAccountTypeHeaderAdapterItem.Builder {
        private Integer mHeaderType;

        @Override // com.paymaya.domain.model.EkycAccountTypeHeaderAdapterItem.Builder
        public EkycAccountTypeHeaderAdapterItem build() {
            String str = this.mHeaderType == null ? " mHeaderType" : "";
            if (str.isEmpty()) {
                return new AutoValue_EkycAccountTypeHeaderAdapterItem(this.mHeaderType.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.EkycAccountTypeHeaderAdapterItem.Builder
        public EkycAccountTypeHeaderAdapterItem.Builder mHeaderType(int i) {
            this.mHeaderType = Integer.valueOf(i);
            return this;
        }
    }

    public C$AutoValue_EkycAccountTypeHeaderAdapterItem(int i) {
        this.mHeaderType = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EkycAccountTypeHeaderAdapterItem) && this.mHeaderType == ((EkycAccountTypeHeaderAdapterItem) obj).mHeaderType();
    }

    public int hashCode() {
        return 1000003 ^ this.mHeaderType;
    }

    @Override // com.paymaya.domain.model.EkycAccountTypeHeaderAdapterItem
    public int mHeaderType() {
        return this.mHeaderType;
    }

    public String toString() {
        return s.o(new StringBuilder("EkycAccountTypeHeaderAdapterItem{mHeaderType="), "}", this.mHeaderType);
    }
}
