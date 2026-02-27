package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditUserPreference implements Parcelable {
    public static final Parcelable.Creator<CreditUserPreference> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("period_end_day_of_month")
    private final int endDayOfMonth;

    @InterfaceC1497a
    @InterfaceC1498b("period_start_day_of_month")
    private final int startDayOfMonth;

    public static final class Creator implements Parcelable.Creator<CreditUserPreference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditUserPreference createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditUserPreference(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditUserPreference[] newArray(int i) {
            return new CreditUserPreference[i];
        }
    }

    public CreditUserPreference(int i, int i4) {
        this.startDayOfMonth = i;
        this.endDayOfMonth = i4;
    }

    public static /* synthetic */ CreditUserPreference copy$default(CreditUserPreference creditUserPreference, int i, int i4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = creditUserPreference.startDayOfMonth;
        }
        if ((i6 & 2) != 0) {
            i4 = creditUserPreference.endDayOfMonth;
        }
        return creditUserPreference.copy(i, i4);
    }

    public final int component1() {
        return this.startDayOfMonth;
    }

    public final int component2() {
        return this.endDayOfMonth;
    }

    public final CreditUserPreference copy(int i, int i4) {
        return new CreditUserPreference(i, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditUserPreference)) {
            return false;
        }
        CreditUserPreference creditUserPreference = (CreditUserPreference) obj;
        return this.startDayOfMonth == creditUserPreference.startDayOfMonth && this.endDayOfMonth == creditUserPreference.endDayOfMonth;
    }

    public final int getEndDayOfMonth() {
        return this.endDayOfMonth;
    }

    public final int getStartDayOfMonth() {
        return this.startDayOfMonth;
    }

    public int hashCode() {
        return (this.startDayOfMonth * 31) + this.endDayOfMonth;
    }

    public String toString() {
        return a.h("CreditUserPreference(startDayOfMonth=", this.startDayOfMonth, ", endDayOfMonth=", this.endDayOfMonth, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.startDayOfMonth);
        dest.writeInt(this.endDayOfMonth);
    }
}
