package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Favorite;
import com.paymaya.domain.model.C$AutoValue_Favorite;
import com.paymaya.domain.model.FavoriteListItem;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Favorite implements Parcelable, FavoriteListItem {

    public static abstract class Builder {
        public abstract Favorite build();

        public abstract Builder mAlias(String str);

        public abstract Builder mContentPreview(FavoriteContentPreview favoriteContentPreview);

        public abstract Builder mFavoriteReminder(@Nullable FavoriteReminder favoriteReminder);

        public abstract Builder mId(String str);

        public abstract Builder mIsMaintenance(Boolean bool);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Favorite.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Favorite.GsonTypeAdapter(jVar);
    }

    public String getContentPreviewMeta() {
        return mContentPreview().mMeta();
    }

    @Nullable
    public String getContentPreviewPhotoUri() {
        return mContentPreview().mPhotoUri();
    }

    public String getContentPreviewText1() {
        return mContentPreview().mText1();
    }

    public String getContentPreviewText2() {
        return mContentPreview().mText2();
    }

    public String getContentPreviewText3() {
        return mContentPreview().mText3();
    }

    @Override // com.paymaya.domain.model.FavoriteListItem
    public FavoriteListItem.VIEW_TYPE getViewType() {
        return FavoriteListItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    public boolean isAliasEqualToText1() {
        return mAlias().equals(getContentPreviewText1());
    }

    @InterfaceC1498b("alias")
    public abstract String mAlias();

    @InterfaceC1498b("content_preview")
    public abstract FavoriteContentPreview mContentPreview();

    @Nullable
    @InterfaceC1498b(NotificationCompat.CATEGORY_REMINDER)
    public abstract FavoriteReminder mFavoriteReminder();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("is_maintenance")
    public abstract Boolean mIsMaintenance();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
