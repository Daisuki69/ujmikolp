package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MaritalStatus implements Parcelable {
    public static final Parcelable.Creator<MaritalStatus> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<MaritalStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaritalStatus createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MaritalStatus(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaritalStatus[] newArray(int i) {
            return new MaritalStatus[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaritalStatus() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaritalStatus copy$default(MaritalStatus maritalStatus, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maritalStatus.code;
        }
        if ((i & 2) != 0) {
            str2 = maritalStatus.name;
        }
        return maritalStatus.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final MaritalStatus copy(String str, String str2) {
        return new MaritalStatus(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaritalStatus)) {
            return false;
        }
        MaritalStatus maritalStatus = (MaritalStatus) obj;
        return j.b(this.code, maritalStatus.code) && j.b(this.name, maritalStatus.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("MaritalStatus(code=", this.code, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    public MaritalStatus(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ MaritalStatus(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
