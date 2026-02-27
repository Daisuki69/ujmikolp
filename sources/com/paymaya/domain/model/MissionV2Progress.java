package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2Progress implements Parcelable {
    public static final Parcelable.Creator<MissionV2Progress> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("aggregate_ctr")
    private final Double aggregateCounter;

    @InterfaceC1497a
    @InterfaceC1498b("aggregate_spend")
    private final Double aggregateSpend;

    @InterfaceC1497a
    @InterfaceC1498b("completed")
    private final boolean completed;

    @InterfaceC1497a
    @InterfaceC1498b("counter")
    private final int counter;

    @InterfaceC1497a
    @InterfaceC1498b("round")
    private final int round;

    @InterfaceC1497a
    @InterfaceC1498b("spend_reqmt")
    private final Double spendRequirement;

    @InterfaceC1497a
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    private final int target;

    public static final class Creator implements Parcelable.Creator<MissionV2Progress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Progress createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MissionV2Progress(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Progress[] newArray(int i) {
            return new MissionV2Progress[i];
        }
    }

    public MissionV2Progress(int i, int i4, int i6, boolean z4, Double d10, Double d11, Double d12) {
        this.round = i;
        this.counter = i4;
        this.target = i6;
        this.completed = z4;
        this.aggregateCounter = d10;
        this.aggregateSpend = d11;
        this.spendRequirement = d12;
    }

    public static /* synthetic */ MissionV2Progress copy$default(MissionV2Progress missionV2Progress, int i, int i4, int i6, boolean z4, Double d10, Double d11, Double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = missionV2Progress.round;
        }
        if ((i10 & 2) != 0) {
            i4 = missionV2Progress.counter;
        }
        if ((i10 & 4) != 0) {
            i6 = missionV2Progress.target;
        }
        if ((i10 & 8) != 0) {
            z4 = missionV2Progress.completed;
        }
        if ((i10 & 16) != 0) {
            d10 = missionV2Progress.aggregateCounter;
        }
        if ((i10 & 32) != 0) {
            d11 = missionV2Progress.aggregateSpend;
        }
        if ((i10 & 64) != 0) {
            d12 = missionV2Progress.spendRequirement;
        }
        Double d13 = d11;
        Double d14 = d12;
        Double d15 = d10;
        int i11 = i6;
        return missionV2Progress.copy(i, i4, i11, z4, d15, d13, d14);
    }

    public final int component1() {
        return this.round;
    }

    public final int component2() {
        return this.counter;
    }

    public final int component3() {
        return this.target;
    }

    public final boolean component4() {
        return this.completed;
    }

    public final Double component5() {
        return this.aggregateCounter;
    }

    public final Double component6() {
        return this.aggregateSpend;
    }

    public final Double component7() {
        return this.spendRequirement;
    }

    public final MissionV2Progress copy(int i, int i4, int i6, boolean z4, Double d10, Double d11, Double d12) {
        return new MissionV2Progress(i, i4, i6, z4, d10, d11, d12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2Progress)) {
            return false;
        }
        MissionV2Progress missionV2Progress = (MissionV2Progress) obj;
        return this.round == missionV2Progress.round && this.counter == missionV2Progress.counter && this.target == missionV2Progress.target && this.completed == missionV2Progress.completed && j.b(this.aggregateCounter, missionV2Progress.aggregateCounter) && j.b(this.aggregateSpend, missionV2Progress.aggregateSpend) && j.b(this.spendRequirement, missionV2Progress.spendRequirement);
    }

    public final Double getAggregateCounter() {
        return this.aggregateCounter;
    }

    public final Double getAggregateSpend() {
        return this.aggregateSpend;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final int getCounter() {
        return this.counter;
    }

    public final int getRound() {
        return this.round;
    }

    public final Double getSpendRequirement() {
        return this.spendRequirement;
    }

    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        int i = ((((((this.round * 31) + this.counter) * 31) + this.target) * 31) + (this.completed ? 1231 : 1237)) * 31;
        Double d10 = this.aggregateCounter;
        int iHashCode = (i + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.aggregateSpend;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.spendRequirement;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        int i = this.round;
        int i4 = this.counter;
        int i6 = this.target;
        boolean z4 = this.completed;
        Double d10 = this.aggregateCounter;
        Double d11 = this.aggregateSpend;
        Double d12 = this.spendRequirement;
        StringBuilder sbU = s.u("MissionV2Progress(round=", i, ", counter=", i4, ", target=");
        sbU.append(i6);
        sbU.append(", completed=");
        sbU.append(z4);
        sbU.append(", aggregateCounter=");
        sbU.append(d10);
        sbU.append(", aggregateSpend=");
        sbU.append(d11);
        sbU.append(", spendRequirement=");
        sbU.append(d12);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.round);
        dest.writeInt(this.counter);
        dest.writeInt(this.target);
        dest.writeInt(this.completed ? 1 : 0);
        Double d10 = this.aggregateCounter;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.aggregateSpend;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.spendRequirement;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MissionV2Progress(int i, int i4, int i6, boolean z4, Double d10, Double d11, Double d12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = i10 & 16;
        Double dValueOf = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        this(i, i4, i6, z4, i11 != 0 ? dValueOf : d10, (i10 & 32) != 0 ? dValueOf : d11, (i10 & 64) != 0 ? dValueOf : d12);
    }
}
