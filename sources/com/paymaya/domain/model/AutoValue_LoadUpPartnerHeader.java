package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.LoadUpPartnerHeader;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LoadUpPartnerHeader extends LoadUpPartnerHeader {
    private final int mHeaderType;

    public static final class Builder extends LoadUpPartnerHeader.Builder {
        private Integer mHeaderType;

        @Override // com.paymaya.domain.model.LoadUpPartnerHeader.Builder
        public LoadUpPartnerHeader build() {
            String str = this.mHeaderType == null ? " mHeaderType" : "";
            if (str.isEmpty()) {
                return new AutoValue_LoadUpPartnerHeader(this.mHeaderType.intValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.LoadUpPartnerHeader.Builder
        public LoadUpPartnerHeader.Builder mHeaderType(int i) {
            this.mHeaderType = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ AutoValue_LoadUpPartnerHeader(int i, int i4) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LoadUpPartnerHeader) && this.mHeaderType == ((LoadUpPartnerHeader) obj).mHeaderType();
    }

    public int hashCode() {
        return 1000003 ^ this.mHeaderType;
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerHeader
    public int mHeaderType() {
        return this.mHeaderType;
    }

    public String toString() {
        return s.o(new StringBuilder("LoadUpPartnerHeader{mHeaderType="), "}", this.mHeaderType);
    }

    private AutoValue_LoadUpPartnerHeader(int i) {
        this.mHeaderType = i;
    }
}
