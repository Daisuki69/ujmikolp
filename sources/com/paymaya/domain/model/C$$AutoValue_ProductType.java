package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.ProductType;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductType, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ProductType extends ProductType {
    private final String mCategoryId;
    private final String mCode;
    private final String mId;
    private final String mName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ProductType$Builder */
    public static class Builder extends ProductType.Builder {
        private String mCategoryId;
        private String mCode;
        private String mId;
        private String mName;

        public /* synthetic */ Builder(ProductType productType, int i) {
            this(productType);
        }

        @Override // com.paymaya.domain.model.ProductType.Builder
        public ProductType build() {
            return new AutoValue_ProductType(this.mName, this.mId, this.mCode, this.mCategoryId);
        }

        @Override // com.paymaya.domain.model.ProductType.Builder
        public ProductType.Builder mCategoryId(@Nullable String str) {
            this.mCategoryId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ProductType.Builder
        public ProductType.Builder mCode(@Nullable String str) {
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ProductType.Builder
        public ProductType.Builder mId(@Nullable String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ProductType.Builder
        public ProductType.Builder mName(@Nullable String str) {
            this.mName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(ProductType productType) {
            this.mName = productType.mName();
            this.mId = productType.mId();
            this.mCode = productType.mCode();
            this.mCategoryId = productType.mCategoryId();
        }
    }

    public C$$AutoValue_ProductType(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.mName = str;
        this.mId = str2;
        this.mCode = str3;
        this.mCategoryId = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProductType) {
            ProductType productType = (ProductType) obj;
            String str = this.mName;
            if (str != null ? str.equals(productType.mName()) : productType.mName() == null) {
                String str2 = this.mId;
                if (str2 != null ? str2.equals(productType.mId()) : productType.mId() == null) {
                    String str3 = this.mCode;
                    if (str3 != null ? str3.equals(productType.mCode()) : productType.mCode() == null) {
                        String str4 = this.mCategoryId;
                        if (str4 != null ? str4.equals(productType.mCategoryId()) : productType.mCategoryId() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mId;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mCode;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mCategoryId;
        return iHashCode3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ProductType
    @Nullable
    public String mCategoryId() {
        return this.mCategoryId;
    }

    @Override // com.paymaya.domain.model.ProductType
    @Nullable
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.ProductType
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.ProductType
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.ProductType
    public ProductType.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProductType{mName=");
        sb2.append(this.mName);
        sb2.append(", mId=");
        sb2.append(this.mId);
        sb2.append(", mCode=");
        sb2.append(this.mCode);
        sb2.append(", mCategoryId=");
        return s.p(sb2, this.mCategoryId, "}");
    }
}
