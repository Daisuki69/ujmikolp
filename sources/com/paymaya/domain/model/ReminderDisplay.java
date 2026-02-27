package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReminderDisplay implements Parcelable {
    public static final Parcelable.Creator<ReminderDisplay> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("unit")
    private final String unit;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final Integer value;

    public static final class Creator implements Parcelable.Creator<ReminderDisplay> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderDisplay createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReminderDisplay(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderDisplay[] newArray(int i) {
            return new ReminderDisplay[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderDisplay() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReminderDisplay copy$default(ReminderDisplay reminderDisplay, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderDisplay.unit;
        }
        if ((i & 2) != 0) {
            num = reminderDisplay.value;
        }
        return reminderDisplay.copy(str, num);
    }

    public final String component1() {
        return this.unit;
    }

    public final Integer component2() {
        return this.value;
    }

    public final ReminderDisplay copy(String str, Integer num) {
        return new ReminderDisplay(str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderDisplay)) {
            return false;
        }
        ReminderDisplay reminderDisplay = (ReminderDisplay) obj;
        return j.b(this.unit, reminderDisplay.unit) && j.b(this.value, reminderDisplay.value);
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.unit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.value;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ReminderDisplay(unit=" + this.unit + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.unit);
        Integer num = this.value;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
    }

    public ReminderDisplay(String str, Integer num) {
        this.unit = str;
        this.value = num;
    }

    public /* synthetic */ ReminderDisplay(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
