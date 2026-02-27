package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopProviderCategoryBase implements Parcelable {
    public static final Parcelable.Creator<ShopProviderCategoryBase> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final List<ShopProviderCategory> data;

    public static final class Creator implements Parcelable.Creator<ShopProviderCategoryBase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderCategoryBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ShopProviderCategory.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ShopProviderCategoryBase(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderCategoryBase[] newArray(int i) {
            return new ShopProviderCategoryBase[i];
        }
    }

    public ShopProviderCategoryBase(List<ShopProviderCategory> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopProviderCategoryBase copy$default(ShopProviderCategoryBase shopProviderCategoryBase, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopProviderCategoryBase.data;
        }
        return shopProviderCategoryBase.copy(list);
    }

    public final List<ShopProviderCategory> component1() {
        return this.data;
    }

    public final ShopProviderCategoryBase copy(List<ShopProviderCategory> list) {
        return new ShopProviderCategoryBase(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopProviderCategoryBase) && j.b(this.data, ((ShopProviderCategoryBase) obj).data);
    }

    public final List<ShopProviderCategory> getData() {
        return this.data;
    }

    public int hashCode() {
        List<ShopProviderCategory> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ShopProviderCategoryBase(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<ShopProviderCategory> list = this.data;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((ShopProviderCategory) itP.next()).writeToParcel(dest, i);
        }
    }
}
