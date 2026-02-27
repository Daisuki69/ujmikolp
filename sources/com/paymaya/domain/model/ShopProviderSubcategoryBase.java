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
public final class ShopProviderSubcategoryBase implements Parcelable {
    public static final Parcelable.Creator<ShopProviderSubcategoryBase> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final List<ShopProviderSubcategory> data;

    public static final class Creator implements Parcelable.Creator<ShopProviderSubcategoryBase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderSubcategoryBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ShopProviderSubcategory.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ShopProviderSubcategoryBase(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderSubcategoryBase[] newArray(int i) {
            return new ShopProviderSubcategoryBase[i];
        }
    }

    public ShopProviderSubcategoryBase(List<ShopProviderSubcategory> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopProviderSubcategoryBase copy$default(ShopProviderSubcategoryBase shopProviderSubcategoryBase, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopProviderSubcategoryBase.data;
        }
        return shopProviderSubcategoryBase.copy(list);
    }

    public final List<ShopProviderSubcategory> component1() {
        return this.data;
    }

    public final ShopProviderSubcategoryBase copy(List<ShopProviderSubcategory> list) {
        return new ShopProviderSubcategoryBase(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopProviderSubcategoryBase) && j.b(this.data, ((ShopProviderSubcategoryBase) obj).data);
    }

    public final List<ShopProviderSubcategory> getData() {
        return this.data;
    }

    public int hashCode() {
        List<ShopProviderSubcategory> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ShopProviderSubcategoryBase(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<ShopProviderSubcategory> list = this.data;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((ShopProviderSubcategory) itP.next()).writeToParcel(dest, i);
        }
    }
}
