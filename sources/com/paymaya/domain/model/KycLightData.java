package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycLightData implements Parcelable {
    public static final Parcelable.Creator<KycLightData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("lightData")
    private final String lightData;

    public static final class Creator implements Parcelable.Creator<KycLightData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycLightData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycLightData(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycLightData[] newArray(int i) {
            return new KycLightData[i];
        }
    }

    public KycLightData(String lightData) {
        j.g(lightData, "lightData");
        this.lightData = lightData;
    }

    public static /* synthetic */ KycLightData copy$default(KycLightData kycLightData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycLightData.lightData;
        }
        return kycLightData.copy(str);
    }

    public final String component1() {
        return this.lightData;
    }

    public final KycLightData copy(String lightData) {
        j.g(lightData, "lightData");
        return new KycLightData(lightData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycLightData) && j.b(this.lightData, ((KycLightData) obj).lightData);
    }

    public final String getLightData() {
        return this.lightData;
    }

    public int hashCode() {
        return this.lightData.hashCode();
    }

    public String toString() {
        return s.j("KycLightData(lightData=", this.lightData, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.lightData);
    }
}
