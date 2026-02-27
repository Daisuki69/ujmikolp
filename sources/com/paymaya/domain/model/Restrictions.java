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
public final class Restrictions implements Parcelable {
    public static final Parcelable.Creator<Restrictions> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("entries")
    private List<Restriction> restrictions;

    public static final class Creator implements Parcelable.Creator<Restrictions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Restrictions createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(Restriction.CREATOR, parcel, arrayList, I4, 1);
            }
            return new Restrictions(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Restrictions[] newArray(int i) {
            return new Restrictions[i];
        }
    }

    public Restrictions() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Restrictions copy$default(Restrictions restrictions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = restrictions.restrictions;
        }
        return restrictions.copy(list);
    }

    public final List<Restriction> component1() {
        return this.restrictions;
    }

    public final Restrictions copy(List<Restriction> restrictions) {
        j.g(restrictions, "restrictions");
        return new Restrictions(restrictions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Restrictions) && j.b(this.restrictions, ((Restrictions) obj).restrictions);
    }

    public final List<Restriction> getRestrictions() {
        return this.restrictions;
    }

    public int hashCode() {
        return this.restrictions.hashCode();
    }

    public final void setRestrictions(List<Restriction> list) {
        j.g(list, "<set-?>");
        this.restrictions = list;
    }

    public String toString() {
        return "Restrictions(restrictions=" + this.restrictions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.restrictions, dest);
        while (itQ.hasNext()) {
            ((Restriction) itQ.next()).writeToParcel(dest, i);
        }
    }

    public Restrictions(List<Restriction> restrictions) {
        j.g(restrictions, "restrictions");
        this.restrictions = restrictions;
    }

    public Restrictions(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list);
    }
}
