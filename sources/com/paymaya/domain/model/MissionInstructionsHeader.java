package com.paymaya.domain.model;

import com.paymaya.domain.model.AutoValue_MissionInstructionsHeader;
import com.paymaya.domain.model.MissionListItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionInstructionsHeader implements MissionListItem {

    public static abstract class Builder {
        public abstract MissionInstructionsHeader build();

        public abstract Builder mViewType(MissionListItem.VIEW_TYPE view_type);
    }

    public static Builder sBuilder() {
        return new AutoValue_MissionInstructionsHeader.Builder().mViewType(MissionListItem.VIEW_TYPE.VIEW_TYPE_INSTRUCTIONS_HEADER);
    }

    @Override // com.paymaya.domain.model.MissionListItem
    public MissionListItem.VIEW_TYPE getViewType() {
        return mViewType();
    }

    public abstract MissionListItem.VIEW_TYPE mViewType();
}
