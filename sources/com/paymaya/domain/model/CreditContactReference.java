package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditContactReference implements Parcelable {
    public static final Parcelable.Creator<CreditContactReference> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("mobileNumber")
    private String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("relationship")
    private String relationship;

    public static final class Creator implements Parcelable.Creator<CreditContactReference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditContactReference createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditContactReference(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditContactReference[] newArray(int i) {
            return new CreditContactReference[i];
        }
    }

    public CreditContactReference(String firstName, String lastName, String relationship, String mobileNumber) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(relationship, "relationship");
        j.g(mobileNumber, "mobileNumber");
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.mobileNumber = mobileNumber;
    }

    public static /* synthetic */ CreditContactReference copy$default(CreditContactReference creditContactReference, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditContactReference.firstName;
        }
        if ((i & 2) != 0) {
            str2 = creditContactReference.lastName;
        }
        if ((i & 4) != 0) {
            str3 = creditContactReference.relationship;
        }
        if ((i & 8) != 0) {
            str4 = creditContactReference.mobileNumber;
        }
        return creditContactReference.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.relationship;
    }

    public final String component4() {
        return this.mobileNumber;
    }

    public final CreditContactReference copy(String firstName, String lastName, String relationship, String mobileNumber) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(relationship, "relationship");
        j.g(mobileNumber, "mobileNumber");
        return new CreditContactReference(firstName, lastName, relationship, mobileNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditContactReference)) {
            return false;
        }
        CreditContactReference creditContactReference = (CreditContactReference) obj;
        return j.b(this.firstName, creditContactReference.firstName) && j.b(this.lastName, creditContactReference.lastName) && j.b(this.relationship, creditContactReference.relationship) && j.b(this.mobileNumber, creditContactReference.mobileNumber);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getRelationship() {
        return this.relationship;
    }

    public int hashCode() {
        return this.mobileNumber.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.relationship);
    }

    public final void setFirstName(String str) {
        j.g(str, "<set-?>");
        this.firstName = str;
    }

    public final void setLastName(String str) {
        j.g(str, "<set-?>");
        this.lastName = str;
    }

    public final void setMobileNumber(String str) {
        j.g(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setRelationship(String str) {
        j.g(str, "<set-?>");
        this.relationship = str;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        return a.p(s.x("CreditContactReference(firstName=", str, ", lastName=", str2, ", relationship="), this.relationship, ", mobileNumber=", this.mobileNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.relationship);
        dest.writeString(this.mobileNumber);
    }
}
