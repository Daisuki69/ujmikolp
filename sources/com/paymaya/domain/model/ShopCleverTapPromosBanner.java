package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopHomeSectionItem;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopCleverTapPromosBanner implements Parcelable, ShopHomeSectionItem {
    public static final Parcelable.Creator<ShopCleverTapPromosBanner> CREATOR = new Creator();
    private String listType;
    private String name;
    private int position;

    public static final class Creator implements Parcelable.Creator<ShopCleverTapPromosBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopCleverTapPromosBanner createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopCleverTapPromosBanner(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopCleverTapPromosBanner[] newArray(int i) {
            return new ShopCleverTapPromosBanner[i];
        }
    }

    public ShopCleverTapPromosBanner() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ShopCleverTapPromosBanner copy$default(ShopCleverTapPromosBanner shopCleverTapPromosBanner, String str, String str2, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shopCleverTapPromosBanner.name;
        }
        if ((i4 & 2) != 0) {
            str2 = shopCleverTapPromosBanner.listType;
        }
        if ((i4 & 4) != 0) {
            i = shopCleverTapPromosBanner.position;
        }
        return shopCleverTapPromosBanner.copy(str, str2, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.listType;
    }

    public final int component3() {
        return this.position;
    }

    public final ShopCleverTapPromosBanner copy(String name, String listType, int i) {
        j.g(name, "name");
        j.g(listType, "listType");
        return new ShopCleverTapPromosBanner(name, listType, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopCleverTapPromosBanner)) {
            return false;
        }
        ShopCleverTapPromosBanner shopCleverTapPromosBanner = (ShopCleverTapPromosBanner) obj;
        return j.b(this.name, shopCleverTapPromosBanner.name) && j.b(this.listType, shopCleverTapPromosBanner.listType) && this.position == shopCleverTapPromosBanner.position;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public String getListType() {
        return this.listType;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public String getName() {
        return this.name;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public int getPosition() {
        return this.position;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public ShopHomeSectionItem.VIEW_TYPE getViewType() {
        return ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER;
    }

    public int hashCode() {
        return AbstractC1414e.c(this.name.hashCode() * 31, 31, this.listType) + this.position;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public void setListType(String str) {
        j.g(str, "<set-?>");
        this.listType = str;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public void setName(String str) {
        j.g(str, "<set-?>");
        this.name = str;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public void setPosition(int i) {
        this.position = i;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.listType;
        return s.o(s.x("ShopCleverTapPromosBanner(name=", str, ", listType=", str2, ", position="), ")", this.position);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.listType);
        dest.writeInt(this.position);
    }

    public ShopCleverTapPromosBanner(String name, String listType, int i) {
        j.g(name, "name");
        j.g(listType, "listType");
        this.name = name;
        this.listType = listType;
        this.position = i;
    }

    public /* synthetic */ ShopCleverTapPromosBanner(String str, String str2, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i);
    }
}
