package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.FavoriteContentPreview;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteContentPreview, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_FavoriteContentPreview extends FavoriteContentPreview {
    private final ImageUrlUnfiltered mMedia;
    private final String mMeta;
    private final String mPhotoUri;
    private final String mText1;
    private final String mText2;
    private final String mText3;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_FavoriteContentPreview$Builder */
    public static class Builder extends FavoriteContentPreview.Builder {
        private ImageUrlUnfiltered mMedia;
        private String mMeta;
        private String mPhotoUri;
        private String mText1;
        private String mText2;
        private String mText3;

        public /* synthetic */ Builder(FavoriteContentPreview favoriteContentPreview, int i) {
            this(favoriteContentPreview);
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview build() {
            return new AutoValue_FavoriteContentPreview(this.mText1, this.mText2, this.mText3, this.mMeta, this.mMedia, this.mPhotoUri);
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mMedia(@Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mMedia = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mMeta(@Nullable String str) {
            this.mMeta = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mPhotoUri(@Nullable String str) {
            this.mPhotoUri = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mText1(@Nullable String str) {
            this.mText1 = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mText2(@Nullable String str) {
            this.mText2 = str;
            return this;
        }

        @Override // com.paymaya.domain.model.FavoriteContentPreview.Builder
        public FavoriteContentPreview.Builder mText3(@Nullable String str) {
            this.mText3 = str;
            return this;
        }

        public Builder() {
        }

        private Builder(FavoriteContentPreview favoriteContentPreview) {
            this.mText1 = favoriteContentPreview.mText1();
            this.mText2 = favoriteContentPreview.mText2();
            this.mText3 = favoriteContentPreview.mText3();
            this.mMeta = favoriteContentPreview.mMeta();
            this.mMedia = favoriteContentPreview.mMedia();
            this.mPhotoUri = favoriteContentPreview.mPhotoUri();
        }
    }

    public C$$AutoValue_FavoriteContentPreview(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ImageUrlUnfiltered imageUrlUnfiltered, @Nullable String str5) {
        this.mText1 = str;
        this.mText2 = str2;
        this.mText3 = str3;
        this.mMeta = str4;
        this.mMedia = imageUrlUnfiltered;
        this.mPhotoUri = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FavoriteContentPreview) {
            FavoriteContentPreview favoriteContentPreview = (FavoriteContentPreview) obj;
            String str = this.mText1;
            if (str != null ? str.equals(favoriteContentPreview.mText1()) : favoriteContentPreview.mText1() == null) {
                String str2 = this.mText2;
                if (str2 != null ? str2.equals(favoriteContentPreview.mText2()) : favoriteContentPreview.mText2() == null) {
                    String str3 = this.mText3;
                    if (str3 != null ? str3.equals(favoriteContentPreview.mText3()) : favoriteContentPreview.mText3() == null) {
                        String str4 = this.mMeta;
                        if (str4 != null ? str4.equals(favoriteContentPreview.mMeta()) : favoriteContentPreview.mMeta() == null) {
                            ImageUrlUnfiltered imageUrlUnfiltered = this.mMedia;
                            if (imageUrlUnfiltered != null ? imageUrlUnfiltered.equals(favoriteContentPreview.mMedia()) : favoriteContentPreview.mMedia() == null) {
                                String str5 = this.mPhotoUri;
                                if (str5 != null ? str5.equals(favoriteContentPreview.mPhotoUri()) : favoriteContentPreview.mPhotoUri() == null) {
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
        String str = this.mText1;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mText2;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mText3;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mMeta;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered = this.mMedia;
        int iHashCode5 = (iHashCode4 ^ (imageUrlUnfiltered == null ? 0 : imageUrlUnfiltered.hashCode())) * 1000003;
        String str5 = this.mPhotoUri;
        return iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    @InterfaceC1498b("media")
    public ImageUrlUnfiltered mMedia() {
        return this.mMedia;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    @InterfaceC1498b("meta")
    public String mMeta() {
        return this.mMeta;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    public String mPhotoUri() {
        return this.mPhotoUri;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    @InterfaceC1498b("text1")
    public String mText1() {
        return this.mText1;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    @InterfaceC1498b("text2")
    public String mText2() {
        return this.mText2;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    @Nullable
    @InterfaceC1498b("text3")
    public String mText3() {
        return this.mText3;
    }

    @Override // com.paymaya.domain.model.FavoriteContentPreview
    public FavoriteContentPreview.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteContentPreview{mText1=");
        sb2.append(this.mText1);
        sb2.append(", mText2=");
        sb2.append(this.mText2);
        sb2.append(", mText3=");
        sb2.append(this.mText3);
        sb2.append(", mMeta=");
        sb2.append(this.mMeta);
        sb2.append(", mMedia=");
        sb2.append(this.mMedia);
        sb2.append(", mPhotoUri=");
        return s.p(sb2, this.mPhotoUri, "}");
    }
}
