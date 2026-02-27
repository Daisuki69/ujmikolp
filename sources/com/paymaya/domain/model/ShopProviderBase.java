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
public final class ShopProviderBase implements Parcelable {
    public static final Parcelable.Creator<ShopProviderBase> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final List<ShopProvider> data;

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final Meta meta;

    public static final class Creator implements Parcelable.Creator<ShopProviderBase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ShopProvider.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ShopProviderBase(arrayList, (Meta) parcel.readParcelable(ShopProviderBase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopProviderBase[] newArray(int i) {
            return new ShopProviderBase[i];
        }
    }

    public ShopProviderBase(List<ShopProvider> list, Meta meta) {
        this.data = list;
        this.meta = meta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopProviderBase copy$default(ShopProviderBase shopProviderBase, List list, Meta meta, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopProviderBase.data;
        }
        if ((i & 2) != 0) {
            meta = shopProviderBase.meta;
        }
        return shopProviderBase.copy(list, meta);
    }

    public final List<ShopProvider> component1() {
        return this.data;
    }

    public final Meta component2() {
        return this.meta;
    }

    public final ShopProviderBase copy(List<ShopProvider> list, Meta meta) {
        return new ShopProviderBase(list, meta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopProviderBase)) {
            return false;
        }
        ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
        return j.b(this.data, shopProviderBase.data) && j.b(this.meta, shopProviderBase.meta);
    }

    public final List<ShopProvider> getData() {
        return this.data;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        List<ShopProvider> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Meta meta = this.meta;
        return iHashCode + (meta != null ? meta.hashCode() : 0);
    }

    public String toString() {
        return "ShopProviderBase(data=" + this.data + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<ShopProvider> list = this.data;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((ShopProvider) itP.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.meta, i);
    }
}
