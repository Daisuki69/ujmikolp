package com.paymaya.domain.model;

import com.paymaya.domain.model.C$AutoValue_EkycAccountTypeHeaderAdapterItem;
import com.paymaya.domain.model.EkycAccountTypeAdapterItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EkycAccountTypeHeaderAdapterItem implements EkycAccountTypeAdapterItem {
    public static final int TYPE_PRIMARY = 0;
    public static final int TYPE_SECONDARY = 1;

    public static abstract class Builder {
        public abstract EkycAccountTypeHeaderAdapterItem build();

        public abstract Builder mHeaderType(int i);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_EkycAccountTypeHeaderAdapterItem.Builder();
    }

    @Override // com.paymaya.domain.model.EkycAccountTypeAdapterItem
    public EkycAccountTypeAdapterItem.VIEW_TYPE getViewType() {
        return EkycAccountTypeAdapterItem.VIEW_TYPE.VIEW_TYPE_HEADER;
    }

    public abstract int mHeaderType();
}
