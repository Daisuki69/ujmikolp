package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dynatrace.android.agent.Global;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2Validity implements Parcelable {
    public static final Parcelable.Creator<MissionV2Validity> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("unit")
    private final String unit;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final int value;

    public static final class Creator implements Parcelable.Creator<MissionV2Validity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Validity createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MissionV2Validity(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Validity[] newArray(int i) {
            return new MissionV2Validity[i];
        }
    }

    public MissionV2Validity(int i, String unit) {
        j.g(unit, "unit");
        this.value = i;
        this.unit = unit;
    }

    public static /* synthetic */ MissionV2Validity copy$default(MissionV2Validity missionV2Validity, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = missionV2Validity.value;
        }
        if ((i4 & 2) != 0) {
            str = missionV2Validity.unit;
        }
        return missionV2Validity.copy(i, str);
    }

    public final int component1() {
        return this.value;
    }

    public final String component2() {
        return this.unit;
    }

    public final MissionV2Validity copy(int i, String unit) {
        j.g(unit, "unit");
        return new MissionV2Validity(i, unit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2Validity)) {
            return false;
        }
        MissionV2Validity missionV2Validity = (MissionV2Validity) obj;
        return this.value == missionV2Validity.value && j.b(this.unit, missionV2Validity.unit);
    }

    public final String getPartialCompletionText() {
        return this.value + Global.BLANK + this.unit;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.unit.hashCode() + (this.value * 31);
    }

    public String toString() {
        return "MissionV2Validity(value=" + this.value + ", unit=" + this.unit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.value);
        dest.writeString(this.unit);
    }
}
