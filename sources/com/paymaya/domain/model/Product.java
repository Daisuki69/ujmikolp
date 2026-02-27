package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Product;
import com.paymaya.domain.model.C$AutoValue_Product;
import com.paymaya.domain.model.ShopListItem;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Product implements Parcelable, ShopListItem {

    public static abstract class Builder {
        public abstract Product build();

        public abstract Builder isPromo(boolean z4);

        public abstract Builder mAmountDiscounted(Amount amount);

        public abstract Builder mAmountOriginal(Amount amount);

        public abstract Builder mCategory(String str);

        public abstract Builder mDescription(String str);

        public abstract Builder mDetails(Details details);

        public abstract Builder mDisabled(boolean z4);

        public abstract Builder mIconUrl(String str);

        public abstract Builder mId(String str);

        public abstract Builder mImageUrl(String str);

        public abstract Builder mIsRecentlyPurchased(boolean z4);

        public abstract Builder mName(String str);

        public abstract Builder mPage(int i);

        public abstract Builder mPriority(int i);

        public abstract Builder mProductCode(String str);

        public abstract Builder mProductProviderDetails(ProductProviderDetails productProviderDetails);

        public abstract Builder mProductType(String str);

        public abstract Builder mProductTypes(List<ProductType> list);

        public abstract Builder mShopCategories(List<ShopCategory> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Product.Builder().isPromo(false).mPriority(0).mDisabled(false).mIsRecentlyPurchased(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Product.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.ShopListItem
    public ShopListItem.VIEW_TYPE getViewType() {
        return ShopListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT;
    }

    @InterfaceC1498b("promo")
    public abstract boolean isPromo();

    @Nullable
    @InterfaceC1498b("discounted_amount")
    public abstract Amount mAmountDiscounted();

    @InterfaceC1498b("original_amount")
    public abstract Amount mAmountOriginal();

    @Nullable
    @InterfaceC1498b("category")
    public abstract String mCategory();

    @Nullable
    @InterfaceC1498b("description")
    public abstract String mDescription();

    @Nullable
    @InterfaceC1498b("details")
    public abstract Details mDetails();

    @InterfaceC1498b("disabled")
    public abstract boolean mDisabled();

    @Nullable
    @InterfaceC1498b("icon_url")
    public abstract String mIconUrl();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("image_url")
    public abstract String mImageUrl();

    public abstract boolean mIsRecentlyPurchased();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract int mPage();

    @InterfaceC1498b("priority")
    public abstract int mPriority();

    @Nullable
    @InterfaceC1498b("product_code")
    public abstract String mProductCode();

    @Nullable
    @InterfaceC1498b("provider_details")
    public abstract ProductProviderDetails mProductProviderDetails();

    @Nullable
    @InterfaceC1498b("product_type")
    public abstract String mProductType();

    @Nullable
    @InterfaceC1498b("product_types")
    public abstract List<ProductType> mProductTypes();

    @Nullable
    @InterfaceC1498b("categories")
    public abstract List<ShopCategory> mShopCategories();

    public abstract Builder toBuilder();
}
