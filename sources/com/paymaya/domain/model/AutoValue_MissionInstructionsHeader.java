package com.paymaya.domain.model;

import com.paymaya.domain.model.MissionInstructionsHeader;
import com.paymaya.domain.model.MissionListItem;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MissionInstructionsHeader extends MissionInstructionsHeader {
    private final MissionListItem.VIEW_TYPE mViewType;

    public static final class Builder extends MissionInstructionsHeader.Builder {
        private MissionListItem.VIEW_TYPE mViewType;

        @Override // com.paymaya.domain.model.MissionInstructionsHeader.Builder
        public MissionInstructionsHeader build() {
            String str = this.mViewType == null ? " mViewType" : "";
            if (str.isEmpty()) {
                return new AutoValue_MissionInstructionsHeader(this.mViewType, 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.MissionInstructionsHeader.Builder
        public MissionInstructionsHeader.Builder mViewType(MissionListItem.VIEW_TYPE view_type) {
            if (view_type == null) {
                throw new NullPointerException("Null mViewType");
            }
            this.mViewType = view_type;
            return this;
        }
    }

    public /* synthetic */ AutoValue_MissionInstructionsHeader(MissionListItem.VIEW_TYPE view_type, int i) {
        this(view_type);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionInstructionsHeader) {
            return this.mViewType.equals(((MissionInstructionsHeader) obj).mViewType());
        }
        return false;
    }

    public int hashCode() {
        return this.mViewType.hashCode() ^ 1000003;
    }

    @Override // com.paymaya.domain.model.MissionInstructionsHeader
    public MissionListItem.VIEW_TYPE mViewType() {
        return this.mViewType;
    }

    public String toString() {
        return "MissionInstructionsHeader{mViewType=" + this.mViewType + "}";
    }

    private AutoValue_MissionInstructionsHeader(MissionListItem.VIEW_TYPE view_type) {
        this.mViewType = view_type;
    }
}
