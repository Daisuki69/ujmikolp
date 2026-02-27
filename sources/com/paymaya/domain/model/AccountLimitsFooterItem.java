package com.paymaya.domain.model;

import com.paymaya.domain.model.AccountLimitsItem;
import com.paymaya.domain.model.AutoValue_AccountLimitsFooterItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountLimitsFooterItem implements AccountLimitsItem {
    public static final int TYPE_DAILY = 0;
    public static final int TYPE_MONTHLY = 1;

    public static abstract class Builder {
        public abstract AccountLimitsFooterItem build();

        public abstract Builder mHeaderType(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_AccountLimitsFooterItem.Builder();
    }

    @Override // com.paymaya.domain.model.AccountLimitsItem
    public AccountLimitsItem.VIEW_TYPE getViewType() {
        return AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_FOOTER;
    }

    public abstract int mHeaderType();
}
