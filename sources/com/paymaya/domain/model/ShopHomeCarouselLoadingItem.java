package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopHomeCarouselLoadingItem implements ShopHomeCarouselListItem, Parcelable {
    public static final Parcelable.Creator<ShopHomeCarouselLoadingItem> CREATOR = new Creator();
    private final ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM viewTypeShopHomeCarouselItem;

    public static final class Creator implements Parcelable.Creator<ShopHomeCarouselLoadingItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeCarouselLoadingItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopHomeCarouselLoadingItem(ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeCarouselLoadingItem[] newArray(int i) {
            return new ShopHomeCarouselLoadingItem[i];
        }
    }

    public ShopHomeCarouselLoadingItem(ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM viewTypeShopHomeCarouselItem) {
        j.g(viewTypeShopHomeCarouselItem, "viewTypeShopHomeCarouselItem");
        this.viewTypeShopHomeCarouselItem = viewTypeShopHomeCarouselItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.paymaya.domain.model.ShopHomeCarouselListItem
    public ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem() {
        return this.viewTypeShopHomeCarouselItem;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.viewTypeShopHomeCarouselItem.name());
    }
}
