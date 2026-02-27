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
public final class KycOption implements Parcelable {
    public static final Parcelable.Creator<KycOption> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("tool_tip")
    private final String toolTip;

    public static final class Creator implements Parcelable.Creator<KycOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycOption createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycOption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycOption[] newArray(int i) {
            return new KycOption[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycOption() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycOption copy$default(KycOption kycOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycOption.name;
        }
        if ((i & 2) != 0) {
            str2 = kycOption.toolTip;
        }
        return kycOption.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.toolTip;
    }

    public final KycOption copy(String str, String str2) {
        return new KycOption(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycOption)) {
            return false;
        }
        KycOption kycOption = (KycOption) obj;
        return j.b(this.name, kycOption.name) && j.b(this.toolTip, kycOption.toolTip);
    }

    public final String getName() {
        return this.name;
    }

    public final String getToolTip() {
        return this.toolTip;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.toolTip;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("KycOption(name=", this.name, ", toolTip=", this.toolTip, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.toolTip);
    }

    public KycOption(String str, String str2) {
        this.name = str;
        this.toolTip = str2;
    }

    public /* synthetic */ KycOption(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
