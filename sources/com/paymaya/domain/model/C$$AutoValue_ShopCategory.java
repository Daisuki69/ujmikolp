package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.ShopCategory;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopCategory, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_ShopCategory extends ShopCategory {
    private final String mCode;
    private final String mId;
    private final String mName;
    private final List<ProductType> mProductTypes;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_ShopCategory$Builder */
    public static class Builder extends ShopCategory.Builder {
        private String mCode;
        private String mId;
        private String mName;
        private List<ProductType> mProductTypes;

        @Override // com.paymaya.domain.model.ShopCategory.Builder
        public ShopCategory build() {
            String strI = this.mName == null ? " mName" : "";
            if (this.mId == null) {
                strI = s.i(strI, " mId");
            }
            if (strI.isEmpty()) {
                return new AutoValue_ShopCategory(this.mName, this.mId, this.mCode, this.mProductTypes);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.ShopCategory.Builder
        public ShopCategory.Builder mCode(String str) {
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopCategory.Builder
        public ShopCategory.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopCategory.Builder
        public ShopCategory.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.ShopCategory.Builder
        public ShopCategory.Builder mProductTypes(List<ProductType> list) {
            this.mProductTypes = list;
            return this;
        }
    }

    public C$$AutoValue_ShopCategory(String str, String str2, @Nullable String str3, @Nullable List<ProductType> list) {
        if (str == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str2;
        this.mCode = str3;
        this.mProductTypes = list;
    }

    public boolean equals(Object obj) {
        String str;
        List<ProductType> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShopCategory) {
            ShopCategory shopCategory = (ShopCategory) obj;
            if (this.mName.equals(shopCategory.mName()) && this.mId.equals(shopCategory.mId()) && ((str = this.mCode) != null ? str.equals(shopCategory.mCode()) : shopCategory.mCode() == null) && ((list = this.mProductTypes) != null ? list.equals(shopCategory.mProductTypes()) : shopCategory.mProductTypes() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mName.hashCode() ^ 1000003) * 1000003) ^ this.mId.hashCode()) * 1000003;
        String str = this.mCode;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<ProductType> list = this.mProductTypes;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.ShopCategory
    @Nullable
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.ShopCategory
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.ShopCategory
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.ShopCategory
    @Nullable
    @InterfaceC1498b(alternate = {"subcategories"}, value = "product_types")
    public List<ProductType> mProductTypes() {
        return this.mProductTypes;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShopCategory{mName=");
        sb2.append(this.mName);
        sb2.append(", mId=");
        sb2.append(this.mId);
        sb2.append(", mCode=");
        sb2.append(this.mCode);
        sb2.append(", mProductTypes=");
        return s.r(sb2, this.mProductTypes, "}");
    }
}
