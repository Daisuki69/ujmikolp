package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_VoucherReminder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VoucherReminder {

    public static abstract class Builder {
        public abstract VoucherReminder build();

        public abstract Builder mHasReminder(boolean z4);

        public abstract Builder mVoucherId(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_VoucherReminder.Builder().mVoucherId(0).mHasReminder(false);
    }

    public abstract boolean mHasReminder();

    public abstract int mVoucherId();

    public abstract Builder toBuilder();
}
