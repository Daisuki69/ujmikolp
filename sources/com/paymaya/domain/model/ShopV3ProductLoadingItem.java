package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopV3ListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopV3ProductLoadingItem implements ShopV3ListItem, Parcelable {
    public static final Parcelable.Creator<ShopV3ProductLoadingItem> CREATOR = new Creator();
    private final ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM viewTypeShopProductItem;

    public static final class Creator implements Parcelable.Creator<ShopV3ProductLoadingItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopV3ProductLoadingItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopV3ProductLoadingItem(ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopV3ProductLoadingItem[] newArray(int i) {
            return new ShopV3ProductLoadingItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShopV3ProductLoadingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.paymaya.domain.model.ShopV3ListItem
    public ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM getViewTypeShopProductItem() {
        return this.viewTypeShopProductItem;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.viewTypeShopProductItem.name());
    }

    public ShopV3ProductLoadingItem(ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM viewTypeShopProductItem) {
        j.g(viewTypeShopProductItem, "viewTypeShopProductItem");
        this.viewTypeShopProductItem = viewTypeShopProductItem;
    }

    public /* synthetic */ ShopV3ProductLoadingItem(ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM view_type_shop_product_item, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PROVIDER_PRODUCT_LOADING : view_type_shop_product_item);
    }
}
