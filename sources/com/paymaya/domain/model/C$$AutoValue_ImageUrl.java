package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.ImageUrl;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrl, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ImageUrl extends ImageUrl {
    private final String mHdpi;
    private final String mMdpi;
    private final String mXhdpi;
    private final String mXxhdpi;
    private final String mXxxhdpi;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrl$Builder */
    public static class Builder extends ImageUrl.Builder {
        private String mHdpi;
        private String mMdpi;
        private String mXhdpi;
        private String mXxhdpi;
        private String mXxxhdpi;

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl build() {
            return new AutoValue_ImageUrl(this.mXhdpi, this.mMdpi, this.mHdpi, this.mXxhdpi, this.mXxxhdpi);
        }

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl.Builder mHdpi(@Nullable String str) {
            this.mHdpi = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl.Builder mMdpi(@Nullable String str) {
            this.mMdpi = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl.Builder mXhdpi(@Nullable String str) {
            this.mXhdpi = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl.Builder mXxhdpi(@Nullable String str) {
            this.mXxhdpi = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrl.Builder
        public ImageUrl.Builder mXxxhdpi(@Nullable String str) {
            this.mXxxhdpi = str;
            return this;
        }
    }

    public C$$AutoValue_ImageUrl(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.mXhdpi = str;
        this.mMdpi = str2;
        this.mHdpi = str3;
        this.mXxhdpi = str4;
        this.mXxxhdpi = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageUrl) {
            ImageUrl imageUrl = (ImageUrl) obj;
            String str = this.mXhdpi;
            if (str != null ? str.equals(imageUrl.mXhdpi()) : imageUrl.mXhdpi() == null) {
                String str2 = this.mMdpi;
                if (str2 != null ? str2.equals(imageUrl.mMdpi()) : imageUrl.mMdpi() == null) {
                    String str3 = this.mHdpi;
                    if (str3 != null ? str3.equals(imageUrl.mHdpi()) : imageUrl.mHdpi() == null) {
                        String str4 = this.mXxhdpi;
                        if (str4 != null ? str4.equals(imageUrl.mXxhdpi()) : imageUrl.mXxhdpi() == null) {
                            String str5 = this.mXxxhdpi;
                            if (str5 != null ? str5.equals(imageUrl.mXxxhdpi()) : imageUrl.mXxxhdpi() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mXhdpi;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mMdpi;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mHdpi;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mXxhdpi;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mXxxhdpi;
        return iHashCode4 ^ (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ImageUrl
    @Nullable
    @InterfaceC1498b("hdpi")
    public String mHdpi() {
        return this.mHdpi;
    }

    @Override // com.paymaya.domain.model.ImageUrl
    @Nullable
    @InterfaceC1498b("mdpi")
    public String mMdpi() {
        return this.mMdpi;
    }

    @Override // com.paymaya.domain.model.ImageUrl
    @Nullable
    @InterfaceC1498b("xhdpi")
    public String mXhdpi() {
        return this.mXhdpi;
    }

    @Override // com.paymaya.domain.model.ImageUrl
    @Nullable
    @InterfaceC1498b("xxhdpi")
    public String mXxhdpi() {
        return this.mXxhdpi;
    }

    @Override // com.paymaya.domain.model.ImageUrl
    @Nullable
    @InterfaceC1498b("xxxhdpi")
    public String mXxxhdpi() {
        return this.mXxxhdpi;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageUrl{mXhdpi=");
        sb2.append(this.mXhdpi);
        sb2.append(", mMdpi=");
        sb2.append(this.mMdpi);
        sb2.append(", mHdpi=");
        sb2.append(this.mHdpi);
        sb2.append(", mXxhdpi=");
        sb2.append(this.mXxhdpi);
        sb2.append(", mXxxhdpi=");
        return s.p(sb2, this.mXxxhdpi, "}");
    }
}
