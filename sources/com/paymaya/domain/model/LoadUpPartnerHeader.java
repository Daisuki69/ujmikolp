package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_LoadUpPartnerHeader;
import com.paymaya.domain.model.LoadUpPartnerItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadUpPartnerHeader implements LoadUpPartnerItem {
    public static final int TYPE_LOAD_UP_PARTNER_HEADER = 0;
    public static final int TYPE_RECOMMENDED_METHOD_HEADER = 1;

    public static abstract class Builder {
        public abstract LoadUpPartnerHeader build();

        public abstract Builder mHeaderType(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_LoadUpPartnerHeader.Builder();
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerItem
    public LoadUpPartnerItem.VIEW_TYPE getViewType() {
        return LoadUpPartnerItem.VIEW_TYPE.VIEW_TYPE_HEADER;
    }

    public abstract int mHeaderType();
}
