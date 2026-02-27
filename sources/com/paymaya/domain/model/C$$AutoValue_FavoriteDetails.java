package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.FavoriteDetails;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteDetails, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FavoriteDetails extends FavoriteDetails {
    private final String mAlias;
    private final FavoriteContentPreview mContentPreview;
    private final FavoriteReminder mFavoriteReminder;
    private final String mId;
    private final String mTemplateJson;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteDetails$Builder */
    public static class Builder extends FavoriteDetails.Builder {
        private String mAlias;
        private FavoriteContentPreview mContentPreview;
        private FavoriteReminder mFavoriteReminder;
        private String mId;
        private String mTemplateJson;
        private String mType;

        public /* synthetic */ Builder(FavoriteDetails favoriteDetails, int i) {
            this(favoriteDetails);
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails build() {
            return new AutoValue_FavoriteDetails(this.mId, this.mAlias, this.mType, this.mTemplateJson, this.mContentPreview, this.mFavoriteReminder);
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mAlias(String str) {
            this.mAlias = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mContentPreview(FavoriteContentPreview favoriteContentPreview) {
            this.mContentPreview = favoriteContentPreview;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mFavoriteReminder(@Nullable FavoriteReminder favoriteReminder) {
            this.mFavoriteReminder = favoriteReminder;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mTemplateJson(String str) {
            this.mTemplateJson = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteDetails.Builder
        public FavoriteDetails.Builder mType(String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(FavoriteDetails favoriteDetails) {
            this.mId = favoriteDetails.mId();
            this.mAlias = favoriteDetails.mAlias();
            this.mType = favoriteDetails.mType();
            this.mTemplateJson = favoriteDetails.mTemplateJson();
            this.mContentPreview = favoriteDetails.mContentPreview();
            this.mFavoriteReminder = favoriteDetails.mFavoriteReminder();
        }
    }

    public C$$AutoValue_FavoriteDetails(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable FavoriteContentPreview favoriteContentPreview, @Nullable FavoriteReminder favoriteReminder) {
        this.mId = str;
        this.mAlias = str2;
        this.mType = str3;
        this.mTemplateJson = str4;
        this.mContentPreview = favoriteContentPreview;
        this.mFavoriteReminder = favoriteReminder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FavoriteDetails) {
            FavoriteDetails favoriteDetails = (FavoriteDetails) obj;
            String str = this.mId;
            if (str != null ? str.equals(favoriteDetails.mId()) : favoriteDetails.mId() == null) {
                String str2 = this.mAlias;
                if (str2 != null ? str2.equals(favoriteDetails.mAlias()) : favoriteDetails.mAlias() == null) {
                    String str3 = this.mType;
                    if (str3 != null ? str3.equals(favoriteDetails.mType()) : favoriteDetails.mType() == null) {
                        String str4 = this.mTemplateJson;
                        if (str4 != null ? str4.equals(favoriteDetails.mTemplateJson()) : favoriteDetails.mTemplateJson() == null) {
                            FavoriteContentPreview favoriteContentPreview = this.mContentPreview;
                            if (favoriteContentPreview != null ? favoriteContentPreview.equals(favoriteDetails.mContentPreview()) : favoriteDetails.mContentPreview() == null) {
                                FavoriteReminder favoriteReminder = this.mFavoriteReminder;
                                if (favoriteReminder != null ? favoriteReminder.equals(favoriteDetails.mFavoriteReminder()) : favoriteDetails.mFavoriteReminder() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mId;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mAlias;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mType;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mTemplateJson;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        FavoriteContentPreview favoriteContentPreview = this.mContentPreview;
        int iHashCode5 = (iHashCode4 ^ (favoriteContentPreview == null ? 0 : favoriteContentPreview.hashCode())) * 1000003;
        FavoriteReminder favoriteReminder = this.mFavoriteReminder;
        return iHashCode5 ^ (favoriteReminder != null ? favoriteReminder.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b("alias")
    public String mAlias() {
        return this.mAlias;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b("content_preview")
    public FavoriteContentPreview mContentPreview() {
        return this.mContentPreview;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b(NotificationCompat.CATEGORY_REMINDER)
    public FavoriteReminder mFavoriteReminder() {
        return this.mFavoriteReminder;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b("template")
    public String mTemplateJson() {
        return this.mTemplateJson;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.FavoriteDetails
    public FavoriteDetails.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "FavoriteDetails{mId=" + this.mId + ", mAlias=" + this.mAlias + ", mType=" + this.mType + ", mTemplateJson=" + this.mTemplateJson + ", mContentPreview=" + this.mContentPreview + ", mFavoriteReminder=" + this.mFavoriteReminder + "}";
    }
}
