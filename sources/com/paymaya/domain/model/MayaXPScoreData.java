package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaXPScoreData implements Parcelable {
    public static final Parcelable.Creator<MayaXPScoreData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final MayaXPScore data;

    public static final class Creator implements Parcelable.Creator<MayaXPScoreData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPScoreData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaXPScoreData(MayaXPScore.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPScoreData[] newArray(int i) {
            return new MayaXPScoreData[i];
        }
    }

    public MayaXPScoreData(MayaXPScore data) {
        j.g(data, "data");
        this.data = data;
    }

    public static /* synthetic */ MayaXPScoreData copy$default(MayaXPScoreData mayaXPScoreData, MayaXPScore mayaXPScore, int i, Object obj) {
        if ((i & 1) != 0) {
            mayaXPScore = mayaXPScoreData.data;
        }
        return mayaXPScoreData.copy(mayaXPScore);
    }

    public final MayaXPScore component1() {
        return this.data;
    }

    public final MayaXPScoreData copy(MayaXPScore data) {
        j.g(data, "data");
        return new MayaXPScoreData(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MayaXPScoreData) && j.b(this.data, ((MayaXPScoreData) obj).data);
    }

    public final MayaXPScore getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "MayaXPScoreData(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.data.writeToParcel(dest, i);
    }
}
