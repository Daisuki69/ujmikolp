package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaXPTier implements Parcelable {
    public static final Parcelable.Creator<MayaXPTier> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("completion")
    private final double completion;

    @InterfaceC1497a
    @InterfaceC1498b("max")
    private final int max;

    @InterfaceC1497a
    @InterfaceC1498b("min")
    private final int min;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<MayaXPTier> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPTier createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaXPTier(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPTier[] newArray(int i) {
            return new MayaXPTier[i];
        }
    }

    public MayaXPTier(String name, int i, int i4, double d10) {
        j.g(name, "name");
        this.name = name;
        this.min = i;
        this.max = i4;
        this.completion = d10;
    }

    public static /* synthetic */ MayaXPTier copy$default(MayaXPTier mayaXPTier, String str, int i, int i4, double d10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = mayaXPTier.name;
        }
        if ((i6 & 2) != 0) {
            i = mayaXPTier.min;
        }
        if ((i6 & 4) != 0) {
            i4 = mayaXPTier.max;
        }
        if ((i6 & 8) != 0) {
            d10 = mayaXPTier.completion;
        }
        int i10 = i4;
        return mayaXPTier.copy(str, i, i10, d10);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.min;
    }

    public final int component3() {
        return this.max;
    }

    public final double component4() {
        return this.completion;
    }

    public final MayaXPTier copy(String name, int i, int i4, double d10) {
        j.g(name, "name");
        return new MayaXPTier(name, i, i4, d10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaXPTier)) {
            return false;
        }
        MayaXPTier mayaXPTier = (MayaXPTier) obj;
        return j.b(this.name, mayaXPTier.name) && this.min == mayaXPTier.min && this.max == mayaXPTier.max && Double.compare(this.completion, mayaXPTier.completion) == 0;
    }

    public final double getCompletion() {
        return this.completion;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.min) * 31) + this.max) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.completion);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public String toString() {
        String str = this.name;
        int i = this.min;
        int i4 = this.max;
        double d10 = this.completion;
        StringBuilder sbR = a.r(i, "MayaXPTier(name=", str, ", min=", ", max=");
        sbR.append(i4);
        sbR.append(", completion=");
        sbR.append(d10);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.min);
        dest.writeInt(this.max);
        dest.writeDouble(this.completion);
    }
}
