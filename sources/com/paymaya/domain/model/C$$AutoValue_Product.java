package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Product;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Product, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Product extends Product {
    private final boolean isPromo;
    private final Amount mAmountDiscounted;
    private final Amount mAmountOriginal;
    private final String mCategory;
    private final String mDescription;
    private final Details mDetails;
    private final boolean mDisabled;
    private final String mIconUrl;
    private final String mId;
    private final String mImageUrl;
    private final boolean mIsRecentlyPurchased;
    private final String mName;
    private final int mPage;
    private final int mPriority;
    private final String mProductCode;
    private final ProductProviderDetails mProductProviderDetails;
    private final String mProductType;
    private final List<ProductType> mProductTypes;
    private final List<ShopCategory> mShopCategories;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Product$Builder */
    public static class Builder extends Product.Builder {
        private Boolean isPromo;
        private Amount mAmountDiscounted;
        private Amount mAmountOriginal;
        private String mCategory;
        private String mDescription;
        private Details mDetails;
        private Boolean mDisabled;
        private String mIconUrl;
        private String mId;
        private String mImageUrl;
        private Boolean mIsRecentlyPurchased;
        private String mName;
        private Integer mPage;
        private Integer mPriority;
        private String mProductCode;
        private ProductProviderDetails mProductProviderDetails;
        private String mProductType;
        private List<ProductType> mProductTypes;
        private List<ShopCategory> mShopCategories;

        public /* synthetic */ Builder(Product product, int i) {
            this(product);
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product build() {
            String strI = this.mName == null ? " mName" : "";
            if (this.mAmountOriginal == null) {
                strI = s.i(strI, " mAmountOriginal");
            }
            if (this.isPromo == null) {
                strI = s.i(strI, " isPromo");
            }
            if (this.mId == null) {
                strI = s.i(strI, " mId");
            }
            if (this.mDisabled == null) {
                strI = s.i(strI, " mDisabled");
            }
            if (this.mPriority == null) {
                strI = s.i(strI, " mPriority");
            }
            if (this.mPage == null) {
                strI = s.i(strI, " mPage");
            }
            if (this.mIsRecentlyPurchased == null) {
                strI = s.i(strI, " mIsRecentlyPurchased");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Product(this.mName, this.mProductType, this.mProductTypes, this.mShopCategories, this.mImageUrl, this.mIconUrl, this.mDescription, this.mProductCode, this.mAmountOriginal, this.mAmountDiscounted, this.isPromo.booleanValue(), this.mId, this.mCategory, this.mDisabled.booleanValue(), this.mDetails, this.mPriority.intValue(), this.mProductProviderDetails, this.mPage.intValue(), this.mIsRecentlyPurchased.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder isPromo(boolean z4) {
            this.isPromo = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mAmountDiscounted(Amount amount) {
            this.mAmountDiscounted = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mAmountOriginal(Amount amount) {
            if (amount == null) {
                throw new NullPointerException("Null mAmountOriginal");
            }
            this.mAmountOriginal = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mCategory(String str) {
            this.mCategory = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mDescription(String str) {
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mDetails(Details details) {
            this.mDetails = details;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mDisabled(boolean z4) {
            this.mDisabled = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mIconUrl(String str) {
            this.mIconUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mIsRecentlyPurchased(boolean z4) {
            this.mIsRecentlyPurchased = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mPage(int i) {
            this.mPage = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mPriority(int i) {
            this.mPriority = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mProductCode(String str) {
            this.mProductCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mProductProviderDetails(ProductProviderDetails productProviderDetails) {
            this.mProductProviderDetails = productProviderDetails;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mProductType(String str) {
            this.mProductType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mProductTypes(List<ProductType> list) {
            this.mProductTypes = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Product.Builder
        public Product.Builder mShopCategories(List<ShopCategory> list) {
            this.mShopCategories = list;
            return this;
        }

        public Builder() {
        }

        private Builder(Product product) {
            this.mName = product.mName();
            this.mProductType = product.mProductType();
            this.mProductTypes = product.mProductTypes();
            this.mShopCategories = product.mShopCategories();
            this.mImageUrl = product.mImageUrl();
            this.mIconUrl = product.mIconUrl();
            this.mDescription = product.mDescription();
            this.mProductCode = product.mProductCode();
            this.mAmountOriginal = product.mAmountOriginal();
            this.mAmountDiscounted = product.mAmountDiscounted();
            this.isPromo = Boolean.valueOf(product.isPromo());
            this.mId = product.mId();
            this.mCategory = product.mCategory();
            this.mDisabled = Boolean.valueOf(product.mDisabled());
            this.mDetails = product.mDetails();
            this.mPriority = Integer.valueOf(product.mPriority());
            this.mProductProviderDetails = product.mProductProviderDetails();
            this.mPage = Integer.valueOf(product.mPage());
            this.mIsRecentlyPurchased = Boolean.valueOf(product.mIsRecentlyPurchased());
        }
    }

    public C$$AutoValue_Product(String str, @Nullable String str2, @Nullable List<ProductType> list, @Nullable List<ShopCategory> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, Amount amount, @Nullable Amount amount2, boolean z4, String str7, @Nullable String str8, boolean z5, @Nullable Details details, int i, @Nullable ProductProviderDetails productProviderDetails, int i4, boolean z8) {
        if (str == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str;
        this.mProductType = str2;
        this.mProductTypes = list;
        this.mShopCategories = list2;
        this.mImageUrl = str3;
        this.mIconUrl = str4;
        this.mDescription = str5;
        this.mProductCode = str6;
        if (amount == null) {
            throw new NullPointerException("Null mAmountOriginal");
        }
        this.mAmountOriginal = amount;
        this.mAmountDiscounted = amount2;
        this.isPromo = z4;
        if (str7 == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str7;
        this.mCategory = str8;
        this.mDisabled = z5;
        this.mDetails = details;
        this.mPriority = i;
        this.mProductProviderDetails = productProviderDetails;
        this.mPage = i4;
        this.mIsRecentlyPurchased = z8;
    }

    public boolean equals(Object obj) {
        String str;
        List<ProductType> list;
        List<ShopCategory> list2;
        String str2;
        String str3;
        String str4;
        String str5;
        Amount amount;
        String str6;
        Details details;
        ProductProviderDetails productProviderDetails;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Product) {
            Product product = (Product) obj;
            if (this.mName.equals(product.mName()) && ((str = this.mProductType) != null ? str.equals(product.mProductType()) : product.mProductType() == null) && ((list = this.mProductTypes) != null ? list.equals(product.mProductTypes()) : product.mProductTypes() == null) && ((list2 = this.mShopCategories) != null ? list2.equals(product.mShopCategories()) : product.mShopCategories() == null) && ((str2 = this.mImageUrl) != null ? str2.equals(product.mImageUrl()) : product.mImageUrl() == null) && ((str3 = this.mIconUrl) != null ? str3.equals(product.mIconUrl()) : product.mIconUrl() == null) && ((str4 = this.mDescription) != null ? str4.equals(product.mDescription()) : product.mDescription() == null) && ((str5 = this.mProductCode) != null ? str5.equals(product.mProductCode()) : product.mProductCode() == null) && this.mAmountOriginal.equals(product.mAmountOriginal()) && ((amount = this.mAmountDiscounted) != null ? amount.equals(product.mAmountDiscounted()) : product.mAmountDiscounted() == null) && this.isPromo == product.isPromo() && this.mId.equals(product.mId()) && ((str6 = this.mCategory) != null ? str6.equals(product.mCategory()) : product.mCategory() == null) && this.mDisabled == product.mDisabled() && ((details = this.mDetails) != null ? details.equals(product.mDetails()) : product.mDetails() == null) && this.mPriority == product.mPriority() && ((productProviderDetails = this.mProductProviderDetails) != null ? productProviderDetails.equals(product.mProductProviderDetails()) : product.mProductProviderDetails() == null) && this.mPage == product.mPage() && this.mIsRecentlyPurchased == product.mIsRecentlyPurchased()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.mName.hashCode() ^ 1000003) * 1000003;
        String str = this.mProductType;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<ProductType> list = this.mProductTypes;
        int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<ShopCategory> list2 = this.mShopCategories;
        int iHashCode4 = (iHashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str2 = this.mImageUrl;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mIconUrl;
        int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mDescription;
        int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mProductCode;
        int iHashCode8 = (((iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.mAmountOriginal.hashCode()) * 1000003;
        Amount amount = this.mAmountDiscounted;
        int iHashCode9 = (((((iHashCode8 ^ (amount == null ? 0 : amount.hashCode())) * 1000003) ^ (this.isPromo ? 1231 : 1237)) * 1000003) ^ this.mId.hashCode()) * 1000003;
        String str6 = this.mCategory;
        int iHashCode10 = (((iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003) ^ (this.mDisabled ? 1231 : 1237)) * 1000003;
        Details details = this.mDetails;
        int iHashCode11 = (((iHashCode10 ^ (details == null ? 0 : details.hashCode())) * 1000003) ^ this.mPriority) * 1000003;
        ProductProviderDetails productProviderDetails = this.mProductProviderDetails;
        return ((((iHashCode11 ^ (productProviderDetails != null ? productProviderDetails.hashCode() : 0)) * 1000003) ^ this.mPage) * 1000003) ^ (this.mIsRecentlyPurchased ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b("promo")
    public boolean isPromo() {
        return this.isPromo;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("discounted_amount")
    public Amount mAmountDiscounted() {
        return this.mAmountDiscounted;
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b("original_amount")
    public Amount mAmountOriginal() {
        return this.mAmountOriginal;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("category")
    public String mCategory() {
        return this.mCategory;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("details")
    public Details mDetails() {
        return this.mDetails;
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b("disabled")
    public boolean mDisabled() {
        return this.mDisabled;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("icon_url")
    public String mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("image_url")
    public String mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.Product
    public boolean mIsRecentlyPurchased() {
        return this.mIsRecentlyPurchased;
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Product
    public int mPage() {
        return this.mPage;
    }

    @Override // com.paymaya.domain.model.Product
    @InterfaceC1498b("priority")
    public int mPriority() {
        return this.mPriority;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("product_code")
    public String mProductCode() {
        return this.mProductCode;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("provider_details")
    public ProductProviderDetails mProductProviderDetails() {
        return this.mProductProviderDetails;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("product_type")
    public String mProductType() {
        return this.mProductType;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("product_types")
    public List<ProductType> mProductTypes() {
        return this.mProductTypes;
    }

    @Override // com.paymaya.domain.model.Product
    @Nullable
    @InterfaceC1498b("categories")
    public List<ShopCategory> mShopCategories() {
        return this.mShopCategories;
    }

    @Override // com.paymaya.domain.model.Product
    public Product.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Product{mName=");
        sb2.append(this.mName);
        sb2.append(", mProductType=");
        sb2.append(this.mProductType);
        sb2.append(", mProductTypes=");
        sb2.append(this.mProductTypes);
        sb2.append(", mShopCategories=");
        sb2.append(this.mShopCategories);
        sb2.append(", mImageUrl=");
        sb2.append(this.mImageUrl);
        sb2.append(", mIconUrl=");
        sb2.append(this.mIconUrl);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mProductCode=");
        sb2.append(this.mProductCode);
        sb2.append(", mAmountOriginal=");
        sb2.append(this.mAmountOriginal);
        sb2.append(", mAmountDiscounted=");
        sb2.append(this.mAmountDiscounted);
        sb2.append(", isPromo=");
        sb2.append(this.isPromo);
        sb2.append(", mId=");
        sb2.append(this.mId);
        sb2.append(", mCategory=");
        sb2.append(this.mCategory);
        sb2.append(", mDisabled=");
        sb2.append(this.mDisabled);
        sb2.append(", mDetails=");
        sb2.append(this.mDetails);
        sb2.append(", mPriority=");
        sb2.append(this.mPriority);
        sb2.append(", mProductProviderDetails=");
        sb2.append(this.mProductProviderDetails);
        sb2.append(", mPage=");
        sb2.append(this.mPage);
        sb2.append(", mIsRecentlyPurchased=");
        return s.s(sb2, this.mIsRecentlyPurchased, "}");
    }
}
