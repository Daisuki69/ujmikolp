package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.FavoriteListItem;

/* JADX INFO: loaded from: classes4.dex */
public class FavoriteTypeLabel implements FavoriteListItem {
    private String mLabel;
    private String mType;

    public FavoriteTypeLabel(String str, String str2) {
        this.mType = str;
        this.mLabel = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FavoriteTypeLabel favoriteTypeLabel = (FavoriteTypeLabel) obj;
        if (this.mType.equals(favoriteTypeLabel.mType)) {
            return this.mLabel.equals(favoriteTypeLabel.mLabel);
        }
        return false;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public String getType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.FavoriteListItem
    public FavoriteListItem.VIEW_TYPE getViewType() {
        return FavoriteListItem.VIEW_TYPE.VIEW_TYPE_LABEL;
    }

    public int hashCode() {
        return this.mLabel.hashCode() + (this.mType.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteTypeLabel{mType='");
        sb2.append(this.mType);
        sb2.append("', mLabel='");
        return s.p(sb2, this.mLabel, "'}");
    }
}
