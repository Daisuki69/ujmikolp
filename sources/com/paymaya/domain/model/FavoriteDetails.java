package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FavoriteDetails;
import com.paymaya.domain.model.C$AutoValue_FavoriteDetails;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FavoriteDetails implements Parcelable {

    public static abstract class Builder {
        public abstract FavoriteDetails build();

        public abstract Builder mAlias(String str);

        public abstract Builder mContentPreview(FavoriteContentPreview favoriteContentPreview);

        public abstract Builder mFavoriteReminder(@Nullable FavoriteReminder favoriteReminder);

        public abstract Builder mId(String str);

        public abstract Builder mTemplateJson(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FavoriteDetails.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FavoriteDetails.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("alias")
    public abstract String mAlias();

    @Nullable
    @InterfaceC1498b("content_preview")
    public abstract FavoriteContentPreview mContentPreview();

    @Nullable
    @InterfaceC1498b(NotificationCompat.CATEGORY_REMINDER)
    public abstract FavoriteReminder mFavoriteReminder();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("template")
    public abstract String mTemplateJson();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
