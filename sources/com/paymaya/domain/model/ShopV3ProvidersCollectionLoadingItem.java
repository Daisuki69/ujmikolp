package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopV3ProvidersCollectionLoadingItem implements ShopV3ProvidersCollectionItem, Parcelable {
    public static final Parcelable.Creator<ShopV3ProvidersCollectionLoadingItem> CREATOR = new Creator();
    private final ShopV3ProvidersCollectionItem.ViewType viewTypeProvidersCollectionItem;

    public static final class Creator implements Parcelable.Creator<ShopV3ProvidersCollectionLoadingItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopV3ProvidersCollectionLoadingItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopV3ProvidersCollectionLoadingItem(ShopV3ProvidersCollectionItem.ViewType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopV3ProvidersCollectionLoadingItem[] newArray(int i) {
            return new ShopV3ProvidersCollectionLoadingItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShopV3ProvidersCollectionLoadingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.paymaya.domain.model.ShopV3ProvidersCollectionItem
    public ShopV3ProvidersCollectionItem.ViewType getViewTypeProvidersCollectionItem() {
        return this.viewTypeProvidersCollectionItem;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.viewTypeProvidersCollectionItem.name());
    }

    public ShopV3ProvidersCollectionLoadingItem(ShopV3ProvidersCollectionItem.ViewType viewTypeProvidersCollectionItem) {
        j.g(viewTypeProvidersCollectionItem, "viewTypeProvidersCollectionItem");
        this.viewTypeProvidersCollectionItem = viewTypeProvidersCollectionItem;
    }

    public /* synthetic */ ShopV3ProvidersCollectionLoadingItem(ShopV3ProvidersCollectionItem.ViewType viewType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_LOADING : viewType);
    }
}
