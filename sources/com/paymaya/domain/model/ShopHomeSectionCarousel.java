package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.ShopHomeSectionItem;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopHomeSectionCarousel implements Parcelable, ShopHomeSectionItem {
    public static final Parcelable.Creator<ShopHomeSectionCarousel> CREATOR = new Creator();
    private List<? extends ShopHomeCarouselListItem> list;
    private String listType;
    private int maxItemsShown;
    private String name;
    private int position;
    private String viewAllTarget;

    public static final class Creator implements Parcelable.Creator<ShopHomeSectionCarousel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionCarousel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i6 = 0; i6 != i4; i6++) {
                    arrayList2.add(parcel.readParcelable(ShopHomeSectionCarousel.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new ShopHomeSectionCarousel(string, string2, i, arrayList, parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionCarousel[] newArray(int i) {
            return new ShopHomeSectionCarousel[i];
        }
    }

    public ShopHomeSectionCarousel(String name, String listType, int i, List<? extends ShopHomeCarouselListItem> list, int i4, String str) {
        j.g(name, "name");
        j.g(listType, "listType");
        this.name = name;
        this.listType = listType;
        this.position = i;
        this.list = list;
        this.maxItemsShown = i4;
        this.viewAllTarget = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopHomeSectionCarousel copy$default(ShopHomeSectionCarousel shopHomeSectionCarousel, String str, String str2, int i, List list, int i4, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = shopHomeSectionCarousel.name;
        }
        if ((i6 & 2) != 0) {
            str2 = shopHomeSectionCarousel.listType;
        }
        if ((i6 & 4) != 0) {
            i = shopHomeSectionCarousel.position;
        }
        if ((i6 & 8) != 0) {
            list = shopHomeSectionCarousel.list;
        }
        if ((i6 & 16) != 0) {
            i4 = shopHomeSectionCarousel.maxItemsShown;
        }
        if ((i6 & 32) != 0) {
            str3 = shopHomeSectionCarousel.viewAllTarget;
        }
        int i10 = i4;
        String str4 = str3;
        return shopHomeSectionCarousel.copy(str, str2, i, list, i10, str4);
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

    public final List<ShopHomeCarouselListItem> component4() {
        return this.list;
    }

    public final int component5() {
        return this.maxItemsShown;
    }

    public final String component6() {
        return this.viewAllTarget;
    }

    public final ShopHomeSectionCarousel copy(String name, String listType, int i, List<? extends ShopHomeCarouselListItem> list, int i4, String str) {
        j.g(name, "name");
        j.g(listType, "listType");
        return new ShopHomeSectionCarousel(name, listType, i, list, i4, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHomeSectionCarousel)) {
            return false;
        }
        ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) obj;
        return j.b(this.name, shopHomeSectionCarousel.name) && j.b(this.listType, shopHomeSectionCarousel.listType) && this.position == shopHomeSectionCarousel.position && j.b(this.list, shopHomeSectionCarousel.list) && this.maxItemsShown == shopHomeSectionCarousel.maxItemsShown && j.b(this.viewAllTarget, shopHomeSectionCarousel.viewAllTarget);
    }

    public final List<ShopHomeCarouselListItem> getList() {
        return this.list;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public String getListType() {
        return this.listType;
    }

    public final int getMaxItemsShown() {
        return this.maxItemsShown;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public String getName() {
        return this.name;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public int getPosition() {
        return this.position;
    }

    public final String getViewAllTarget() {
        return this.viewAllTarget;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public ShopHomeSectionItem.VIEW_TYPE getViewType() {
        return ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL;
    }

    public int hashCode() {
        int iC = (AbstractC1414e.c(this.name.hashCode() * 31, 31, this.listType) + this.position) * 31;
        List<? extends ShopHomeCarouselListItem> list = this.list;
        int iHashCode = (((iC + (list == null ? 0 : list.hashCode())) * 31) + this.maxItemsShown) * 31;
        String str = this.viewAllTarget;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setList(List<? extends ShopHomeCarouselListItem> list) {
        this.list = list;
    }

    @Override // com.paymaya.domain.model.ShopHomeSectionItem
    public void setListType(String str) {
        j.g(str, "<set-?>");
        this.listType = str;
    }

    public final void setMaxItemsShown(int i) {
        this.maxItemsShown = i;
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

    public final void setViewAllTarget(String str) {
        this.viewAllTarget = str;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.listType;
        int i = this.position;
        List<? extends ShopHomeCarouselListItem> list = this.list;
        int i4 = this.maxItemsShown;
        String str3 = this.viewAllTarget;
        StringBuilder sbX = s.x("ShopHomeSectionCarousel(name=", str, ", listType=", str2, ", position=");
        sbX.append(i);
        sbX.append(", list=");
        sbX.append(list);
        sbX.append(", maxItemsShown=");
        sbX.append(i4);
        sbX.append(", viewAllTarget=");
        sbX.append(str3);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.listType);
        dest.writeInt(this.position);
        List<? extends ShopHomeCarouselListItem> list = this.list;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                dest.writeParcelable((Parcelable) itP.next(), i);
            }
        }
        dest.writeInt(this.maxItemsShown);
        dest.writeString(this.viewAllTarget);
    }

    public /* synthetic */ ShopHomeSectionCarousel(String str, String str2, int i, List list, int i4, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i6 & 8) != 0 ? null : list, (i6 & 16) != 0 ? 5 : i4, (i6 & 32) != 0 ? null : str3);
    }
}
