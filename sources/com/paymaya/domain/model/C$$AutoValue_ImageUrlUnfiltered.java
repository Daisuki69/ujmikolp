package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrlUnfiltered, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ImageUrlUnfiltered extends ImageUrlUnfiltered {
    private final ImageUrl mAndroidImageUrl;
    private final ImageUrlIOS mIOSImageUrl;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrlUnfiltered$Builder */
    public static class Builder extends ImageUrlUnfiltered.Builder {
        private ImageUrl mAndroidImageUrl;
        private ImageUrlIOS mIOSImageUrl;

        public /* synthetic */ Builder(ImageUrlUnfiltered imageUrlUnfiltered, int i) {
            this(imageUrlUnfiltered);
        }

        @Override // com.paymaya.domain.model.ImageUrlUnfiltered.Builder
        public ImageUrlUnfiltered build() {
            return new AutoValue_ImageUrlUnfiltered(this.mAndroidImageUrl, this.mIOSImageUrl);
        }

        @Override // com.paymaya.domain.model.ImageUrlUnfiltered.Builder
        public ImageUrlUnfiltered.Builder mAndroidImageUrl(ImageUrl imageUrl) {
            this.mAndroidImageUrl = imageUrl;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrlUnfiltered.Builder
        public ImageUrlUnfiltered.Builder mIOSImageUrl(ImageUrlIOS imageUrlIOS) {
            this.mIOSImageUrl = imageUrlIOS;
            return this;
        }

        public Builder() {
        }

        private Builder(ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mAndroidImageUrl = imageUrlUnfiltered.mAndroidImageUrl();
            this.mIOSImageUrl = imageUrlUnfiltered.mIOSImageUrl();
        }
    }

    public C$$AutoValue_ImageUrlUnfiltered(@Nullable ImageUrl imageUrl, @Nullable ImageUrlIOS imageUrlIOS) {
        this.mAndroidImageUrl = imageUrl;
        this.mIOSImageUrl = imageUrlIOS;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageUrlUnfiltered) {
            ImageUrlUnfiltered imageUrlUnfiltered = (ImageUrlUnfiltered) obj;
            ImageUrl imageUrl = this.mAndroidImageUrl;
            if (imageUrl != null ? imageUrl.equals(imageUrlUnfiltered.mAndroidImageUrl()) : imageUrlUnfiltered.mAndroidImageUrl() == null) {
                ImageUrlIOS imageUrlIOS = this.mIOSImageUrl;
                if (imageUrlIOS != null ? imageUrlIOS.equals(imageUrlUnfiltered.mIOSImageUrl()) : imageUrlUnfiltered.mIOSImageUrl() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ImageUrl imageUrl = this.mAndroidImageUrl;
        int iHashCode = ((imageUrl == null ? 0 : imageUrl.hashCode()) ^ 1000003) * 1000003;
        ImageUrlIOS imageUrlIOS = this.mIOSImageUrl;
        return iHashCode ^ (imageUrlIOS != null ? imageUrlIOS.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ImageUrlUnfiltered
    @Nullable
    @InterfaceC1498b("android")
    public ImageUrl mAndroidImageUrl() {
        return this.mAndroidImageUrl;
    }

    @Override // com.paymaya.domain.model.ImageUrlUnfiltered
    @Nullable
    @InterfaceC1498b(DeviceInformation.PLATFORM_IOS)
    public ImageUrlIOS mIOSImageUrl() {
        return this.mIOSImageUrl;
    }

    @Override // com.paymaya.domain.model.ImageUrlUnfiltered
    public ImageUrlUnfiltered.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "ImageUrlUnfiltered{mAndroidImageUrl=" + this.mAndroidImageUrl + ", mIOSImageUrl=" + this.mIOSImageUrl + "}";
    }
}
