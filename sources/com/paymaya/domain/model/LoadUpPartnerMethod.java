package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_LoadUpPartnerMethod;
import com.paymaya.domain.model.LoadUpPartnerItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadUpPartnerMethod implements LoadUpPartnerItem {
    public static final int TYPE_PADALA = 2;
    public static final int TYPE_VIA_BANK = 0;
    public static final int TYPE_VIA_CARD = 1;

    public static abstract class Builder {
        public abstract LoadUpPartnerMethod build();

        public abstract Builder mLoadUpPartnerId(String str);

        public abstract Builder mLoadUpPartnerName(String str);

        public abstract Builder mMethodType(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_LoadUpPartnerMethod.Builder().mLoadUpPartnerName("").mLoadUpPartnerId("");
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerItem
    public LoadUpPartnerItem.VIEW_TYPE getViewType() {
        return LoadUpPartnerItem.VIEW_TYPE.VIEW_TYPE_METHOD;
    }

    public abstract String mLoadUpPartnerId();

    public abstract String mLoadUpPartnerName();

    public abstract int mMethodType();
}
