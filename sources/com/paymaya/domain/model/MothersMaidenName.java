package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MothersMaidenName implements Parcelable {
    public static final Parcelable.Creator<MothersMaidenName> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("hasNoMiddleName")
    private boolean hasNoMiddleName;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("middleName")
    private String middleName;

    public static final class Creator implements Parcelable.Creator<MothersMaidenName> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MothersMaidenName createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MothersMaidenName(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MothersMaidenName[] newArray(int i) {
            return new MothersMaidenName[i];
        }
    }

    public MothersMaidenName(String firstName, String str, String lastName, boolean z4) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        this.firstName = firstName;
        this.middleName = str;
        this.lastName = lastName;
        this.hasNoMiddleName = z4;
    }

    public static /* synthetic */ MothersMaidenName copy$default(MothersMaidenName mothersMaidenName, String str, String str2, String str3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mothersMaidenName.firstName;
        }
        if ((i & 2) != 0) {
            str2 = mothersMaidenName.middleName;
        }
        if ((i & 4) != 0) {
            str3 = mothersMaidenName.lastName;
        }
        if ((i & 8) != 0) {
            z4 = mothersMaidenName.hasNoMiddleName;
        }
        return mothersMaidenName.copy(str, str2, str3, z4);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.middleName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final boolean component4() {
        return this.hasNoMiddleName;
    }

    public final MothersMaidenName copy(String firstName, String str, String lastName, boolean z4) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        return new MothersMaidenName(firstName, str, lastName, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MothersMaidenName)) {
            return false;
        }
        MothersMaidenName mothersMaidenName = (MothersMaidenName) obj;
        return j.b(this.firstName, mothersMaidenName.firstName) && j.b(this.middleName, mothersMaidenName.middleName) && j.b(this.lastName, mothersMaidenName.lastName) && this.hasNoMiddleName == mothersMaidenName.hasNoMiddleName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean getHasNoMiddleName() {
        return this.hasNoMiddleName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public int hashCode() {
        int iHashCode = this.firstName.hashCode() * 31;
        String str = this.middleName;
        return AbstractC1414e.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.lastName) + (this.hasNoMiddleName ? 1231 : 1237);
    }

    public final void setFirstName(String str) {
        j.g(str, "<set-?>");
        this.firstName = str;
    }

    public final void setHasNoMiddleName(boolean z4) {
        this.hasNoMiddleName = z4;
    }

    public final void setLastName(String str) {
        j.g(str, "<set-?>");
        this.lastName = str;
    }

    public final void setMiddleName(String str) {
        this.middleName = str;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.middleName;
        String str3 = this.lastName;
        boolean z4 = this.hasNoMiddleName;
        StringBuilder sbX = s.x("MothersMaidenName(firstName=", str, ", middleName=", str2, ", lastName=");
        sbX.append(str3);
        sbX.append(", hasNoMiddleName=");
        sbX.append(z4);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeInt(this.hasNoMiddleName ? 1 : 0);
    }
}
