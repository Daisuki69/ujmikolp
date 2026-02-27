package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.VoucherReminder;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VoucherReminder extends VoucherReminder {
    private final boolean mHasReminder;
    private final int mVoucherId;

    public static final class Builder extends VoucherReminder.Builder {
        private Boolean mHasReminder;
        private Integer mVoucherId;

        public /* synthetic */ Builder(VoucherReminder voucherReminder, int i) {
            this(voucherReminder);
        }

        @Override // com.paymaya.domain.model.VoucherReminder.Builder
        public VoucherReminder build() {
            String strConcat = this.mVoucherId == null ? " mVoucherId" : "";
            if (this.mHasReminder == null) {
                strConcat = strConcat.concat(" mHasReminder");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_VoucherReminder(this.mVoucherId.intValue(), this.mHasReminder.booleanValue(), 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.paymaya.domain.model.VoucherReminder.Builder
        public VoucherReminder.Builder mHasReminder(boolean z4) {
            this.mHasReminder = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherReminder.Builder
        public VoucherReminder.Builder mVoucherId(int i) {
            this.mVoucherId = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(VoucherReminder voucherReminder) {
            this.mVoucherId = Integer.valueOf(voucherReminder.mVoucherId());
            this.mHasReminder = Boolean.valueOf(voucherReminder.mHasReminder());
        }
    }

    public /* synthetic */ AutoValue_VoucherReminder(int i, boolean z4, int i4) {
        this(i, z4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoucherReminder) {
            VoucherReminder voucherReminder = (VoucherReminder) obj;
            if (this.mVoucherId == voucherReminder.mVoucherId() && this.mHasReminder == voucherReminder.mHasReminder()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mVoucherId ^ 1000003) * 1000003) ^ (this.mHasReminder ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.VoucherReminder
    public boolean mHasReminder() {
        return this.mHasReminder;
    }

    @Override // com.paymaya.domain.model.VoucherReminder
    public int mVoucherId() {
        return this.mVoucherId;
    }

    @Override // com.paymaya.domain.model.VoucherReminder
    public VoucherReminder.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VoucherReminder{mVoucherId=");
        sb2.append(this.mVoucherId);
        sb2.append(", mHasReminder=");
        return s.s(sb2, this.mHasReminder, "}");
    }

    private AutoValue_VoucherReminder(int i, boolean z4) {
        this.mVoucherId = i;
        this.mHasReminder = z4;
    }
}
