package com.paymaya.domain.model;

import com.paymaya.domain.model.AccountLimitsItem;

/* JADX INFO: loaded from: classes4.dex */
public class AccountLimitsLoadingItem implements AccountLimitsItem {
    @Override // com.paymaya.domain.model.AccountLimitsItem
    public AccountLimitsItem.VIEW_TYPE getViewType() {
        return AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_LOADING;
    }
}
