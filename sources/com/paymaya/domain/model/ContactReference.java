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
public final class ContactReference implements Parcelable {
    public static final Parcelable.Creator<ContactReference> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private final String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("mobileNumber")
    private final String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("relationship")
    private final String relationship;

    public static final class Creator implements Parcelable.Creator<ContactReference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReference createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReference(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReference[] newArray(int i) {
            return new ContactReference[i];
        }
    }

    public ContactReference(String firstName, String lastName, String relationship, String mobileNumber) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(relationship, "relationship");
        j.g(mobileNumber, "mobileNumber");
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
        this.mobileNumber = mobileNumber;
    }

    public static /* synthetic */ ContactReference copy$default(ContactReference contactReference, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReference.firstName;
        }
        if ((i & 2) != 0) {
            str2 = contactReference.lastName;
        }
        if ((i & 4) != 0) {
            str3 = contactReference.relationship;
        }
        if ((i & 8) != 0) {
            str4 = contactReference.mobileNumber;
        }
        return contactReference.copy(str, str2, str3, str4);
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

    public final ContactReference copy(String firstName, String lastName, String relationship, String mobileNumber) {
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(relationship, "relationship");
        j.g(mobileNumber, "mobileNumber");
        return new ContactReference(firstName, lastName, relationship, mobileNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReference)) {
            return false;
        }
        ContactReference contactReference = (ContactReference) obj;
        return j.b(this.firstName, contactReference.firstName) && j.b(this.lastName, contactReference.lastName) && j.b(this.relationship, contactReference.relationship) && j.b(this.mobileNumber, contactReference.mobileNumber);
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

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        return a.p(s.x("ContactReference(firstName=", str, ", lastName=", str2, ", relationship="), this.relationship, ", mobileNumber=", this.mobileNumber, ")");
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
