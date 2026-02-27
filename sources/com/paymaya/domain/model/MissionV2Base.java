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
public final class MissionV2Base implements Parcelable {
    public static final Parcelable.Creator<MissionV2Base> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("missions")
    private final List<MissionV2> missions;

    public static final class Creator implements Parcelable.Creator<MissionV2Base> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Base createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(MissionV2.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new MissionV2Base(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Base[] newArray(int i) {
            return new MissionV2Base[i];
        }
    }

    public MissionV2Base(List<MissionV2> list) {
        this.missions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionV2Base copy$default(MissionV2Base missionV2Base, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = missionV2Base.missions;
        }
        return missionV2Base.copy(list);
    }

    public final List<MissionV2> component1() {
        return this.missions;
    }

    public final MissionV2Base copy(List<MissionV2> list) {
        return new MissionV2Base(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MissionV2Base) && j.b(this.missions, ((MissionV2Base) obj).missions);
    }

    public final List<MissionV2> getMissions() {
        return this.missions;
    }

    public int hashCode() {
        List<MissionV2> list = this.missions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "MissionV2Base(missions=" + this.missions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<MissionV2> list = this.missions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((MissionV2) itP.next()).writeToParcel(dest, i);
        }
    }
}
