package com.paymaya.domain.model;

import We.s;
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
public final class MinMaxValue implements Parcelable {
    public static final Parcelable.Creator<MinMaxValue> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("days")
    private final List<Integer> days;

    @InterfaceC1497a
    @InterfaceC1498b("max_value")
    private final int maxValue;

    @InterfaceC1497a
    @InterfaceC1498b("min_value")
    private final int minValue;

    public static final class Creator implements Parcelable.Creator<MinMaxValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinMaxValue createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i10 = 0; i10 != i6; i10++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new MinMaxValue(i, i4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinMaxValue[] newArray(int i) {
            return new MinMaxValue[i];
        }
    }

    public MinMaxValue(int i, int i4, List<Integer> list) {
        this.minValue = i;
        this.maxValue = i4;
        this.days = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MinMaxValue copy$default(MinMaxValue minMaxValue, int i, int i4, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = minMaxValue.minValue;
        }
        if ((i6 & 2) != 0) {
            i4 = minMaxValue.maxValue;
        }
        if ((i6 & 4) != 0) {
            list = minMaxValue.days;
        }
        return minMaxValue.copy(i, i4, list);
    }

    public final int component1() {
        return this.minValue;
    }

    public final int component2() {
        return this.maxValue;
    }

    public final List<Integer> component3() {
        return this.days;
    }

    public final MinMaxValue copy(int i, int i4, List<Integer> list) {
        return new MinMaxValue(i, i4, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinMaxValue)) {
            return false;
        }
        MinMaxValue minMaxValue = (MinMaxValue) obj;
        return this.minValue == minMaxValue.minValue && this.maxValue == minMaxValue.maxValue && j.b(this.days, minMaxValue.days);
    }

    public final List<Integer> getDays() {
        return this.days;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        int i = ((this.minValue * 31) + this.maxValue) * 31;
        List<Integer> list = this.days;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        int i = this.minValue;
        int i4 = this.maxValue;
        return s.r(s.u("MinMaxValue(minValue=", i, ", maxValue=", i4, ", days="), this.days, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.minValue);
        dest.writeInt(this.maxValue);
        List<Integer> list = this.days;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            dest.writeInt(((Number) itP.next()).intValue());
        }
    }
}
