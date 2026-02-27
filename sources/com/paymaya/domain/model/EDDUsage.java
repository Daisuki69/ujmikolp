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
public final class EDDUsage implements Parcelable {
    public static final Parcelable.Creator<EDDUsage> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("purpose")
    private final String purpose;

    @InterfaceC1497a
    @InterfaceC1498b("remit_to")
    private final String remitTo;

    public static final class Creator implements Parcelable.Creator<EDDUsage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDUsage createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EDDUsage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDUsage[] newArray(int i) {
            return new EDDUsage[i];
        }
    }

    public EDDUsage(String name, String str, String str2) {
        j.g(name, "name");
        this.name = name;
        this.remitTo = str;
        this.purpose = str2;
    }

    public static /* synthetic */ EDDUsage copy$default(EDDUsage eDDUsage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eDDUsage.name;
        }
        if ((i & 2) != 0) {
            str2 = eDDUsage.remitTo;
        }
        if ((i & 4) != 0) {
            str3 = eDDUsage.purpose;
        }
        return eDDUsage.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.remitTo;
    }

    public final String component3() {
        return this.purpose;
    }

    public final EDDUsage copy(String name, String str, String str2) {
        j.g(name, "name");
        return new EDDUsage(name, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDDUsage)) {
            return false;
        }
        EDDUsage eDDUsage = (EDDUsage) obj;
        return j.b(this.name, eDDUsage.name) && j.b(this.remitTo, eDDUsage.remitTo) && j.b(this.purpose, eDDUsage.purpose);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final String getRemitTo() {
        return this.remitTo;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.remitTo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purpose;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.remitTo;
        return s.p(s.x("EDDUsage(name=", str, ", remitTo=", str2, ", purpose="), this.purpose, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.remitTo);
        dest.writeString(this.purpose);
    }

    public /* synthetic */ EDDUsage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
