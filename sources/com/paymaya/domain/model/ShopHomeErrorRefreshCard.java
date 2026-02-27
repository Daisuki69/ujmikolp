package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopHomeErrorRefreshCard implements Parcelable, ShopHomeCarouselListItem {
    public static final Parcelable.Creator<ShopHomeErrorRefreshCard> CREATOR = new Creator();
    private final String errorMessage;
    private final String refreshTarget;

    public static final class Creator implements Parcelable.Creator<ShopHomeErrorRefreshCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeErrorRefreshCard createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopHomeErrorRefreshCard(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeErrorRefreshCard[] newArray(int i) {
            return new ShopHomeErrorRefreshCard[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShopHomeErrorRefreshCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShopHomeErrorRefreshCard copy$default(ShopHomeErrorRefreshCard shopHomeErrorRefreshCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopHomeErrorRefreshCard.errorMessage;
        }
        if ((i & 2) != 0) {
            str2 = shopHomeErrorRefreshCard.refreshTarget;
        }
        return shopHomeErrorRefreshCard.copy(str, str2);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final String component2() {
        return this.refreshTarget;
    }

    public final ShopHomeErrorRefreshCard copy(String errorMessage, String str) {
        j.g(errorMessage, "errorMessage");
        return new ShopHomeErrorRefreshCard(errorMessage, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHomeErrorRefreshCard)) {
            return false;
        }
        ShopHomeErrorRefreshCard shopHomeErrorRefreshCard = (ShopHomeErrorRefreshCard) obj;
        return j.b(this.errorMessage, shopHomeErrorRefreshCard.errorMessage) && j.b(this.refreshTarget, shopHomeErrorRefreshCard.refreshTarget);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getRefreshTarget() {
        return this.refreshTarget;
    }

    @Override // com.paymaya.domain.model.ShopHomeCarouselListItem
    public ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem() {
        return ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_ERROR_REFRESH;
    }

    public int hashCode() {
        int iHashCode = this.errorMessage.hashCode() * 31;
        String str = this.refreshTarget;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return s.l("ShopHomeErrorRefreshCard(errorMessage=", this.errorMessage, ", refreshTarget=", this.refreshTarget, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.errorMessage);
        dest.writeString(this.refreshTarget);
    }

    public ShopHomeErrorRefreshCard(String errorMessage, String str) {
        j.g(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        this.refreshTarget = str;
    }

    public /* synthetic */ ShopHomeErrorRefreshCard(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
