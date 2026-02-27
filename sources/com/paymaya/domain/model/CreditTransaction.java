package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditTransaction implements Parcelable {
    public static final Parcelable.Creator<CreditTransaction> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("items")
    private final List<CreditTransactionItem> items;

    @InterfaceC1497a
    @InterfaceC1498b("totalPages")
    private final int totalPages;

    public static final class Creator implements Parcelable.Creator<CreditTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTransaction createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            while (I4 != i4) {
                I4 = AbstractC1213b.I(CreditTransactionItem.CREATOR, parcel, arrayList, I4, 1);
            }
            return new CreditTransaction(i, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditTransaction[] newArray(int i) {
            return new CreditTransaction[i];
        }
    }

    public CreditTransaction(int i, List<CreditTransactionItem> items) {
        j.g(items, "items");
        this.totalPages = i;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditTransaction copy$default(CreditTransaction creditTransaction, int i, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = creditTransaction.totalPages;
        }
        if ((i4 & 2) != 0) {
            list = creditTransaction.items;
        }
        return creditTransaction.copy(i, list);
    }

    public final int component1() {
        return this.totalPages;
    }

    public final List<CreditTransactionItem> component2() {
        return this.items;
    }

    public final CreditTransaction copy(int i, List<CreditTransactionItem> items) {
        j.g(items, "items");
        return new CreditTransaction(i, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditTransaction)) {
            return false;
        }
        CreditTransaction creditTransaction = (CreditTransaction) obj;
        return this.totalPages == creditTransaction.totalPages && j.b(this.items, creditTransaction.items);
    }

    public final List<CreditTransactionItem> getItems() {
        return this.items;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.totalPages * 31);
    }

    public String toString() {
        return "CreditTransaction(totalPages=" + this.totalPages + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.totalPages);
        Iterator itQ = AbstractC1213b.Q(this.items, dest);
        while (itQ.hasNext()) {
            ((CreditTransactionItem) itQ.next()).writeToParcel(dest, i);
        }
    }

    public CreditTransaction(int i, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? C1112C.f9377a : list);
    }
}
