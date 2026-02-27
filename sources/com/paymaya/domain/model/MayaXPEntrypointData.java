package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaXPEntrypointData implements Parcelable {
    public static final Parcelable.Creator<MayaXPEntrypointData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final MayaXPEntrypointEasyCredit data;

    public static final class Creator implements Parcelable.Creator<MayaXPEntrypointData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPEntrypointData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaXPEntrypointData(MayaXPEntrypointEasyCredit.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPEntrypointData[] newArray(int i) {
            return new MayaXPEntrypointData[i];
        }
    }

    public MayaXPEntrypointData(MayaXPEntrypointEasyCredit data) {
        j.g(data, "data");
        this.data = data;
    }

    public static /* synthetic */ MayaXPEntrypointData copy$default(MayaXPEntrypointData mayaXPEntrypointData, MayaXPEntrypointEasyCredit mayaXPEntrypointEasyCredit, int i, Object obj) {
        if ((i & 1) != 0) {
            mayaXPEntrypointEasyCredit = mayaXPEntrypointData.data;
        }
        return mayaXPEntrypointData.copy(mayaXPEntrypointEasyCredit);
    }

    public final MayaXPEntrypointEasyCredit component1() {
        return this.data;
    }

    public final MayaXPEntrypointData copy(MayaXPEntrypointEasyCredit data) {
        j.g(data, "data");
        return new MayaXPEntrypointData(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MayaXPEntrypointData) && j.b(this.data, ((MayaXPEntrypointData) obj).data);
    }

    public final MayaXPEntrypointEasyCredit getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "MayaXPEntrypointData(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.data.writeToParcel(dest, i);
    }
}
