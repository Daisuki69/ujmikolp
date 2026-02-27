package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_InboxHeader;
import com.paymaya.domain.model.InboxItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InboxHeader implements InboxItem {
    public static final int TYPE_EARLIER = 1;
    public static final int TYPE_RECENT = 0;

    public static abstract class Builder {
        public abstract InboxHeader build();

        public abstract Builder mHeaderType(int i);
    }

    public static Builder sBuilder() {
        return new AutoValue_InboxHeader.Builder();
    }

    @Override // com.paymaya.domain.model.InboxItem
    public InboxItem.VIEW_TYPE getViewType() {
        return InboxItem.VIEW_TYPE.VIEW_TYPE_HEADER;
    }

    public abstract int mHeaderType();
}
