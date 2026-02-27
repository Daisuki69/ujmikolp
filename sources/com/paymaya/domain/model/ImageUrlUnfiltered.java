package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ImageUrlUnfiltered;
import com.paymaya.domain.model.C$AutoValue_ImageUrlUnfiltered;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ImageUrlUnfiltered implements Parcelable {

    public static abstract class Builder {
        public abstract ImageUrlUnfiltered build();

        public abstract Builder mAndroidImageUrl(ImageUrl imageUrl);

        public abstract Builder mIOSImageUrl(ImageUrlIOS imageUrlIOS);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ImageUrlUnfiltered.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ImageUrlUnfiltered.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("android")
    public abstract ImageUrl mAndroidImageUrl();

    @Nullable
    @InterfaceC1498b(DeviceInformation.PLATFORM_IOS)
    public abstract ImageUrlIOS mIOSImageUrl();

    public abstract Builder toBuilder();
}
