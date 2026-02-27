package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FavoriteContentPreview;
import com.paymaya.domain.model.C$AutoValue_FavoriteContentPreview;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FavoriteContentPreview implements Parcelable {

    public static abstract class Builder {
        public abstract FavoriteContentPreview build();

        public abstract Builder mMedia(@Nullable ImageUrlUnfiltered imageUrlUnfiltered);

        public abstract Builder mMeta(@Nullable String str);

        public abstract Builder mPhotoUri(@Nullable String str);

        public abstract Builder mText1(@Nullable String str);

        public abstract Builder mText2(@Nullable String str);

        public abstract Builder mText3(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FavoriteContentPreview.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FavoriteContentPreview.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("media")
    public abstract ImageUrlUnfiltered mMedia();

    @Nullable
    @InterfaceC1498b("meta")
    public abstract String mMeta();

    @Nullable
    public abstract String mPhotoUri();

    @Nullable
    @InterfaceC1498b("text1")
    public abstract String mText1();

    @Nullable
    @InterfaceC1498b("text2")
    public abstract String mText2();

    @Nullable
    @InterfaceC1498b("text3")
    public abstract String mText3();

    public abstract Builder toBuilder();
}
