package com.paymaya.domain.model;

import com.paymaya.domain.model.ShopListItem;

/* JADX INFO: loaded from: classes4.dex */
public class ShopHeader implements ShopListItem {
    @Override // com.paymaya.domain.model.ShopListItem
    public ShopListItem.VIEW_TYPE getViewType() {
        return ShopListItem.VIEW_TYPE.VIEW_TYPE_HEADER;
    }
}
