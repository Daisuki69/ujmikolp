package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FavoriteReminder implements Parcelable {
    public static final Parcelable.Creator<FavoriteReminder> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("day")
    private final String day;

    @InterfaceC1497a
    @InterfaceC1498b("display")
    private final ReminderDisplay display;

    @InterfaceC1497a
    @InterfaceC1498b("notify_from")
    private final ReminderNotifyFrom notifyFrom;

    @InterfaceC1497a
    @InterfaceC1498b("time")
    private final String time;

    @InterfaceC1497a
    @InterfaceC1498b("utc_offset")
    private final String utcOffset;

    public static final class Creator implements Parcelable.Creator<FavoriteReminder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteReminder createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new FavoriteReminder(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReminderDisplay.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ReminderNotifyFrom.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteReminder[] newArray(int i) {
            return new FavoriteReminder[i];
        }
    }

    public FavoriteReminder() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FavoriteReminder copy$default(FavoriteReminder favoriteReminder, String str, String str2, String str3, ReminderDisplay reminderDisplay, ReminderNotifyFrom reminderNotifyFrom, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoriteReminder.day;
        }
        if ((i & 2) != 0) {
            str2 = favoriteReminder.time;
        }
        if ((i & 4) != 0) {
            str3 = favoriteReminder.utcOffset;
        }
        if ((i & 8) != 0) {
            reminderDisplay = favoriteReminder.display;
        }
        if ((i & 16) != 0) {
            reminderNotifyFrom = favoriteReminder.notifyFrom;
        }
        ReminderNotifyFrom reminderNotifyFrom2 = reminderNotifyFrom;
        String str4 = str3;
        return favoriteReminder.copy(str, str2, str4, reminderDisplay, reminderNotifyFrom2);
    }

    public final String component1() {
        return this.day;
    }

    public final String component2() {
        return this.time;
    }

    public final String component3() {
        return this.utcOffset;
    }

    public final ReminderDisplay component4() {
        return this.display;
    }

    public final ReminderNotifyFrom component5() {
        return this.notifyFrom;
    }

    public final FavoriteReminder copy(String str, String str2, String str3, ReminderDisplay reminderDisplay, ReminderNotifyFrom reminderNotifyFrom) {
        return new FavoriteReminder(str, str2, str3, reminderDisplay, reminderNotifyFrom);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteReminder)) {
            return false;
        }
        FavoriteReminder favoriteReminder = (FavoriteReminder) obj;
        return j.b(this.day, favoriteReminder.day) && j.b(this.time, favoriteReminder.time) && j.b(this.utcOffset, favoriteReminder.utcOffset) && j.b(this.display, favoriteReminder.display) && j.b(this.notifyFrom, favoriteReminder.notifyFrom);
    }

    public final String getDay() {
        return this.day;
    }

    public final ReminderDisplay getDisplay() {
        return this.display;
    }

    public final ReminderNotifyFrom getNotifyFrom() {
        return this.notifyFrom;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getUtcOffset() {
        return this.utcOffset;
    }

    public int hashCode() {
        String str = this.day;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.utcOffset;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ReminderDisplay reminderDisplay = this.display;
        int iHashCode4 = (iHashCode3 + (reminderDisplay == null ? 0 : reminderDisplay.hashCode())) * 31;
        ReminderNotifyFrom reminderNotifyFrom = this.notifyFrom;
        return iHashCode4 + (reminderNotifyFrom != null ? reminderNotifyFrom.hashCode() : 0);
    }

    public String toString() {
        String str = this.day;
        String str2 = this.time;
        String str3 = this.utcOffset;
        ReminderDisplay reminderDisplay = this.display;
        ReminderNotifyFrom reminderNotifyFrom = this.notifyFrom;
        StringBuilder sbX = s.x("FavoriteReminder(day=", str, ", time=", str2, ", utcOffset=");
        sbX.append(str3);
        sbX.append(", display=");
        sbX.append(reminderDisplay);
        sbX.append(", notifyFrom=");
        sbX.append(reminderNotifyFrom);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.day);
        dest.writeString(this.time);
        dest.writeString(this.utcOffset);
        ReminderDisplay reminderDisplay = this.display;
        if (reminderDisplay == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reminderDisplay.writeToParcel(dest, i);
        }
        ReminderNotifyFrom reminderNotifyFrom = this.notifyFrom;
        if (reminderNotifyFrom == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reminderNotifyFrom.writeToParcel(dest, i);
        }
    }

    public FavoriteReminder(String str, String str2, String str3, ReminderDisplay reminderDisplay, ReminderNotifyFrom reminderNotifyFrom) {
        this.day = str;
        this.time = str2;
        this.utcOffset = str3;
        this.display = reminderDisplay;
        this.notifyFrom = reminderNotifyFrom;
    }

    public /* synthetic */ FavoriteReminder(String str, String str2, String str3, ReminderDisplay reminderDisplay, ReminderNotifyFrom reminderNotifyFrom, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : reminderDisplay, (i & 16) != 0 ? null : reminderNotifyFrom);
    }
}
