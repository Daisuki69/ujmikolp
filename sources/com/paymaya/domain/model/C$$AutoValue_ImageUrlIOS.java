package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.ImageUrlIOS;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrlIOS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ImageUrlIOS extends ImageUrlIOS {
    private final String m3x;
    private final String mRetina;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ImageUrlIOS$Builder */
    public static class Builder extends ImageUrlIOS.Builder {
        private String m3x;
        private String mRetina;

        public /* synthetic */ Builder(ImageUrlIOS imageUrlIOS, int i) {
            this(imageUrlIOS);
        }

        @Override // com.paymaya.domain.model.ImageUrlIOS.Builder
        public ImageUrlIOS build() {
            return new AutoValue_ImageUrlIOS(this.mRetina, this.m3x);
        }

        @Override // com.paymaya.domain.model.ImageUrlIOS.Builder
        public ImageUrlIOS.Builder m3x(String str) {
            this.m3x = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ImageUrlIOS.Builder
        public ImageUrlIOS.Builder mRetina(String str) {
            this.mRetina = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ImageUrlIOS imageUrlIOS) {
            this.mRetina = imageUrlIOS.mRetina();
            this.m3x = imageUrlIOS.m3x();
        }
    }

    public C$$AutoValue_ImageUrlIOS(@Nullable String str, @Nullable String str2) {
        this.mRetina = str;
        this.m3x = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageUrlIOS) {
            ImageUrlIOS imageUrlIOS = (ImageUrlIOS) obj;
            String str = this.mRetina;
            if (str != null ? str.equals(imageUrlIOS.mRetina()) : imageUrlIOS.mRetina() == null) {
                String str2 = this.m3x;
                if (str2 != null ? str2.equals(imageUrlIOS.m3x()) : imageUrlIOS.m3x() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mRetina;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.m3x;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ImageUrlIOS
    @Nullable
    @InterfaceC1498b("3x")
    public String m3x() {
        return this.m3x;
    }

    @Override // com.paymaya.domain.model.ImageUrlIOS
    @Nullable
    @InterfaceC1498b("retina")
    public String mRetina() {
        return this.mRetina;
    }

    @Override // com.paymaya.domain.model.ImageUrlIOS
    public ImageUrlIOS.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageUrlIOS{mRetina=");
        sb2.append(this.mRetina);
        sb2.append(", m3x=");
        return s.p(sb2, this.m3x, "}");
    }
}
