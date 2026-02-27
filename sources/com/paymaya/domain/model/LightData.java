package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class LightData implements Parcelable {
    public static final Parcelable.Creator<LightData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("light_data")
    private final String lightData;

    public static final class Creator implements Parcelable.Creator<LightData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LightData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new LightData(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LightData[] newArray(int i) {
            return new LightData[i];
        }
    }

    public LightData(String lightData) {
        j.g(lightData, "lightData");
        this.lightData = lightData;
    }

    public static /* synthetic */ LightData copy$default(LightData lightData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lightData.lightData;
        }
        return lightData.copy(str);
    }

    public final String component1() {
        return this.lightData;
    }

    public final LightData copy(String lightData) {
        j.g(lightData, "lightData");
        return new LightData(lightData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LightData) && j.b(this.lightData, ((LightData) obj).lightData);
    }

    public final String getLightData() {
        return this.lightData;
    }

    public int hashCode() {
        return this.lightData.hashCode();
    }

    public String toString() {
        return s.j("LightData(lightData=", this.lightData, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.lightData);
    }
}
