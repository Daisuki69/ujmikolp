package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_ImageUrl;
import com.paymaya.domain.model.C$AutoValue_ImageUrl;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ImageUrl implements Parcelable {

    public static abstract class Builder {
        public abstract ImageUrl build();

        public abstract Builder mHdpi(@Nullable String str);

        public abstract Builder mMdpi(@Nullable String str);

        public abstract Builder mXhdpi(@Nullable String str);

        public abstract Builder mXxhdpi(@Nullable String str);

        public abstract Builder mXxxhdpi(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ImageUrl.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ImageUrl.GsonTypeAdapter(jVar);
    }

    public String imageUrl() {
        return C.O(this);
    }

    @Nullable
    @InterfaceC1498b("hdpi")
    public abstract String mHdpi();

    @Nullable
    @InterfaceC1498b("mdpi")
    public abstract String mMdpi();

    @Nullable
    @InterfaceC1498b("xhdpi")
    public abstract String mXhdpi();

    @Nullable
    @InterfaceC1498b("xxhdpi")
    public abstract String mXxhdpi();

    @Nullable
    @InterfaceC1498b("xxxhdpi")
    public abstract String mXxxhdpi();
}
