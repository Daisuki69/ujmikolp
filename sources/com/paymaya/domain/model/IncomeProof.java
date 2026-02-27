package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IncomeProof implements Parcelable {
    public static final Parcelable.Creator<IncomeProof> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public static final class Creator implements Parcelable.Creator<IncomeProof> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncomeProof createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new IncomeProof(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncomeProof[] newArray(int i) {
            return new IncomeProof[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IncomeProof() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IncomeProof copy$default(IncomeProof incomeProof, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = incomeProof.name;
        }
        if ((i & 2) != 0) {
            str2 = incomeProof.type;
        }
        return incomeProof.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.type;
    }

    public final IncomeProof copy(String str, String str2) {
        return new IncomeProof(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomeProof)) {
            return false;
        }
        IncomeProof incomeProof = (IncomeProof) obj;
        return j.b(this.name, incomeProof.name) && j.b(this.type, incomeProof.type);
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("IncomeProof(name=", this.name, ", type=", this.type, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.type);
    }

    public IncomeProof(String str, String str2) {
        this.name = str;
        this.type = str2;
    }

    public /* synthetic */ IncomeProof(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
