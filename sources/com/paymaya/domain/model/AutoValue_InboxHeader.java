package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.InboxHeader;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InboxHeader extends InboxHeader {
    private final int mHeaderType;

    public static final class Builder extends InboxHeader.Builder {
        private Integer mHeaderType;

        @Override // com.paymaya.domain.model.InboxHeader.Builder
        public InboxHeader build() {
            String str = this.mHeaderType == null ? " mHeaderType" : "";
            if (str.isEmpty()) {
                return new AutoValue_InboxHeader(this.mHeaderType.intValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.InboxHeader.Builder
        public InboxHeader.Builder mHeaderType(int i) {
            this.mHeaderType = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ AutoValue_InboxHeader(int i, int i4) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InboxHeader) && this.mHeaderType == ((InboxHeader) obj).mHeaderType();
    }

    public int hashCode() {
        return 1000003 ^ this.mHeaderType;
    }

    @Override // com.paymaya.domain.model.InboxHeader
    public int mHeaderType() {
        return this.mHeaderType;
    }

    public String toString() {
        return s.o(new StringBuilder("InboxHeader{mHeaderType="), "}", this.mHeaderType);
    }

    private AutoValue_InboxHeader(int i) {
        this.mHeaderType = i;
    }
}
