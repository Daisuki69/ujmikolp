package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReminderNotifyFrom implements Parcelable {
    public static final Parcelable.Creator<ReminderNotifyFrom> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("unit")
    private final String unit;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final Integer value;

    public static final class Creator implements Parcelable.Creator<ReminderNotifyFrom> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderNotifyFrom createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReminderNotifyFrom(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderNotifyFrom[] newArray(int i) {
            return new ReminderNotifyFrom[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderNotifyFrom() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReminderNotifyFrom copy$default(ReminderNotifyFrom reminderNotifyFrom, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderNotifyFrom.unit;
        }
        if ((i & 2) != 0) {
            num = reminderNotifyFrom.value;
        }
        return reminderNotifyFrom.copy(str, num);
    }

    public final String component1() {
        return this.unit;
    }

    public final Integer component2() {
        return this.value;
    }

    public final ReminderNotifyFrom copy(String str, Integer num) {
        return new ReminderNotifyFrom(str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderNotifyFrom)) {
            return false;
        }
        ReminderNotifyFrom reminderNotifyFrom = (ReminderNotifyFrom) obj;
        return j.b(this.unit, reminderNotifyFrom.unit) && j.b(this.value, reminderNotifyFrom.value);
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
        return "ReminderNotifyFrom(unit=" + this.unit + ", value=" + this.value + ")";
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

    public ReminderNotifyFrom(String str, Integer num) {
        this.unit = str;
        this.value = num;
    }

    public /* synthetic */ ReminderNotifyFrom(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
