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
public final class EducationalAttainment implements Parcelable {
    public static final Parcelable.Creator<EducationalAttainment> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String code;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<EducationalAttainment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationalAttainment createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EducationalAttainment(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationalAttainment[] newArray(int i) {
            return new EducationalAttainment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EducationalAttainment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EducationalAttainment copy$default(EducationalAttainment educationalAttainment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationalAttainment.code;
        }
        if ((i & 2) != 0) {
            str2 = educationalAttainment.name;
        }
        return educationalAttainment.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final EducationalAttainment copy(String str, String str2) {
        return new EducationalAttainment(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationalAttainment)) {
            return false;
        }
        EducationalAttainment educationalAttainment = (EducationalAttainment) obj;
        return j.b(this.code, educationalAttainment.code) && j.b(this.name, educationalAttainment.name);
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
        return s.l("EducationalAttainment(code=", this.code, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    public EducationalAttainment(String str, String str2) {
        this.code = str;
        this.name = str2;
    }

    public /* synthetic */ EducationalAttainment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
