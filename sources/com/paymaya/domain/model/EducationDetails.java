package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EducationDetails implements Parcelable {
    public static final Parcelable.Creator<EducationDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("educationalAttainment")
    private final String educationalAttainment;

    public static final class Creator implements Parcelable.Creator<EducationDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EducationDetails(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationDetails[] newArray(int i) {
            return new EducationDetails[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EducationDetails() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EducationDetails copy$default(EducationDetails educationDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationDetails.educationalAttainment;
        }
        return educationDetails.copy(str);
    }

    public final String component1() {
        return this.educationalAttainment;
    }

    public final EducationDetails copy(String str) {
        return new EducationDetails(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationDetails) && j.b(this.educationalAttainment, ((EducationDetails) obj).educationalAttainment);
    }

    public final String getEducationalAttainment() {
        return this.educationalAttainment;
    }

    public int hashCode() {
        String str = this.educationalAttainment;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("EducationDetails(educationalAttainment=", this.educationalAttainment, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.educationalAttainment);
    }

    public EducationDetails(String str) {
        this.educationalAttainment = str;
    }

    public /* synthetic */ EducationDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
