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
public final class ProductV3Base implements Parcelable {
    public static final Parcelable.Creator<ProductV3Base> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("records")
    private final List<ProductV3> records;

    public static final class Creator implements Parcelable.Creator<ProductV3Base> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductV3Base createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(ProductV3.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new ProductV3Base(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductV3Base[] newArray(int i) {
            return new ProductV3Base[i];
        }
    }

    public ProductV3Base(List<ProductV3> list) {
        this.records = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductV3Base copy$default(ProductV3Base productV3Base, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productV3Base.records;
        }
        return productV3Base.copy(list);
    }

    public final List<ProductV3> component1() {
        return this.records;
    }

    public final ProductV3Base copy(List<ProductV3> list) {
        return new ProductV3Base(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductV3Base) && j.b(this.records, ((ProductV3Base) obj).records);
    }

    public final List<ProductV3> getRecords() {
        return this.records;
    }

    public int hashCode() {
        List<ProductV3> list = this.records;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ProductV3Base(records=" + this.records + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<ProductV3> list = this.records;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((ProductV3) itP.next()).writeToParcel(dest, i);
        }
    }
}
