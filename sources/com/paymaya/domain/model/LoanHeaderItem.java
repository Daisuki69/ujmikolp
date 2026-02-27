package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_LoanHeaderItem;
import com.paymaya.domain.model.LoanItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoanHeaderItem implements LoanItem {
    public static final int TYPE_ACTIVE_LOANS = 0;
    public static final int TYPE_AVAILABLE_LOANS = 1;
    public static final int TYPE_HISTORY_LOANS = 2;

    public static abstract class Builder {
        public abstract LoanHeaderItem build();

        public abstract Builder mHeaderType(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_LoanHeaderItem.Builder();
    }

    @Override // com.paymaya.domain.model.LoanItem
    public LoanItem.VIEW_TYPE getViewType() {
        return LoanItem.VIEW_TYPE.VIEW_TYPE_LOAN_HEADER;
    }

    public abstract int mHeaderType();
}
