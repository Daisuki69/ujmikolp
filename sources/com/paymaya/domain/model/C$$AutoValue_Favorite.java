package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.Favorite;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Favorite, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Favorite extends Favorite {
    private final String mAlias;
    private final FavoriteContentPreview mContentPreview;
    private final FavoriteReminder mFavoriteReminder;
    private final String mId;
    private final Boolean mIsMaintenance;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Favorite$Builder */
    public static class Builder extends Favorite.Builder {
        private String mAlias;
        private FavoriteContentPreview mContentPreview;
        private FavoriteReminder mFavoriteReminder;
        private String mId;
        private Boolean mIsMaintenance;
        private String mType;

        public /* synthetic */ Builder(Favorite favorite, int i) {
            this(favorite);
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mAlias == null) {
                strI = s.i(strI, " mAlias");
            }
            if (this.mType == null) {
                strI = s.i(strI, " mType");
            }
            if (this.mContentPreview == null) {
                strI = s.i(strI, " mContentPreview");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Favorite(this.mId, this.mAlias, this.mType, this.mContentPreview, this.mFavoriteReminder, this.mIsMaintenance);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mAlias(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAlias");
            }
            this.mAlias = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mContentPreview(FavoriteContentPreview favoriteContentPreview) {
            if (favoriteContentPreview == null) {
                throw new NullPointerException("Null mContentPreview");
            }
            this.mContentPreview = favoriteContentPreview;
            return this;
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mFavoriteReminder(@Nullable FavoriteReminder favoriteReminder) {
            this.mFavoriteReminder = favoriteReminder;
            return this;
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mIsMaintenance(Boolean bool) {
            this.mIsMaintenance = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.Favorite.Builder
        public Favorite.Builder mType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mType");
            }
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Favorite favorite) {
            this.mId = favorite.mId();
            this.mAlias = favorite.mAlias();
            this.mType = favorite.mType();
            this.mContentPreview = favorite.mContentPreview();
            this.mFavoriteReminder = favorite.mFavoriteReminder();
            this.mIsMaintenance = favorite.mIsMaintenance();
        }
    }

    public C$$AutoValue_Favorite(String str, String str2, String str3, FavoriteContentPreview favoriteContentPreview, @Nullable FavoriteReminder favoriteReminder, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mAlias");
        }
        this.mAlias = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mType");
        }
        this.mType = str3;
        if (favoriteContentPreview == null) {
            throw new NullPointerException("Null mContentPreview");
        }
        this.mContentPreview = favoriteContentPreview;
        this.mFavoriteReminder = favoriteReminder;
        this.mIsMaintenance = bool;
    }

    public boolean equals(Object obj) {
        FavoriteReminder favoriteReminder;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Favorite) {
            Favorite favorite = (Favorite) obj;
            if (this.mId.equals(favorite.mId()) && this.mAlias.equals(favorite.mAlias()) && this.mType.equals(favorite.mType()) && this.mContentPreview.equals(favorite.mContentPreview()) && ((favoriteReminder = this.mFavoriteReminder) != null ? favoriteReminder.equals(favorite.mFavoriteReminder()) : favorite.mFavoriteReminder() == null) && ((bool = this.mIsMaintenance) != null ? bool.equals(favorite.mIsMaintenance()) : favorite.mIsMaintenance() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mAlias.hashCode()) * 1000003) ^ this.mType.hashCode()) * 1000003) ^ this.mContentPreview.hashCode()) * 1000003;
        FavoriteReminder favoriteReminder = this.mFavoriteReminder;
        int iHashCode2 = (iHashCode ^ (favoriteReminder == null ? 0 : favoriteReminder.hashCode())) * 1000003;
        Boolean bool = this.mIsMaintenance;
        return iHashCode2 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Favorite
    @InterfaceC1498b("alias")
    public String mAlias() {
        return this.mAlias;
    }

    @Override // com.paymaya.domain.model.Favorite
    @InterfaceC1498b("content_preview")
    public FavoriteContentPreview mContentPreview() {
        return this.mContentPreview;
    }

    @Override // com.paymaya.domain.model.Favorite
    @Nullable
    @InterfaceC1498b(NotificationCompat.CATEGORY_REMINDER)
    public FavoriteReminder mFavoriteReminder() {
        return this.mFavoriteReminder;
    }

    @Override // com.paymaya.domain.model.Favorite
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Favorite
    @Nullable
    @InterfaceC1498b("is_maintenance")
    public Boolean mIsMaintenance() {
        return this.mIsMaintenance;
    }

    @Override // com.paymaya.domain.model.Favorite
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.Favorite
    public Favorite.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Favorite{mId=");
        sb2.append(this.mId);
        sb2.append(", mAlias=");
        sb2.append(this.mAlias);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mContentPreview=");
        sb2.append(this.mContentPreview);
        sb2.append(", mFavoriteReminder=");
        sb2.append(this.mFavoriteReminder);
        sb2.append(", mIsMaintenance=");
        return AbstractC1213b.N(sb2, this.mIsMaintenance, "}");
    }
}
