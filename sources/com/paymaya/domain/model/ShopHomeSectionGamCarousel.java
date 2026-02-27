package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.ShopHomeSectionItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopHomeSectionGamCarousel implements Parcelable, ShopHomeSectionItem {
    public static final Parcelable.Creator<ShopHomeSectionGamCarousel> CREATOR = new Creator();
    private String listType;
    private String name;
    private int position;

    public static final class Creator implements Parcelable.Creator<ShopHomeSectionGamCarousel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionGamCarousel createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopHomeSectionGamCarousel(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionGamCarousel[] newArray(int i) {
            return new ShopHomeSectionGamCarousel[i];
        }
    }

    public ShopHomeSectionGamCarousel() {
        this(null, null, 0, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        return ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER;
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.listType);
        dest.writeInt(this.position);
    }

    public ShopHomeSectionGamCarousel(String name, String listType, int i) {
        j.g(name, "name");
        j.g(listType, "listType");
        this.name = name;
        this.listType = listType;
        this.position = i;
    }

    public /* synthetic */ ShopHomeSectionGamCarousel(String str, String str2, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i);
    }
}
