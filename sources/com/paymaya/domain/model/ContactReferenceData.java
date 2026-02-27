package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferenceData implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternativeMobileNumber")
    private final String alternativeMobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final ContactReference contactReference;

    @InterfaceC1497a
    @InterfaceC1498b("customerId")
    private final String customerId;

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private final String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("gender")
    private final String gender;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("maritalStatus")
    private final String maritalStatus;

    public static final class Creator implements Parcelable.Creator<ContactReferenceData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferenceData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ContactReference.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceData[] newArray(int i) {
            return new ContactReferenceData[i];
        }
    }

    public ContactReferenceData(String customerId, String firstName, String lastName, String alternativeMobileNumber, String gender, String maritalStatus, ContactReference contactReference) {
        j.g(customerId, "customerId");
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(alternativeMobileNumber, "alternativeMobileNumber");
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        j.g(contactReference, "contactReference");
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.alternativeMobileNumber = alternativeMobileNumber;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.contactReference = contactReference;
    }

    public static /* synthetic */ ContactReferenceData copy$default(ContactReferenceData contactReferenceData, String str, String str2, String str3, String str4, String str5, String str6, ContactReference contactReference, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferenceData.customerId;
        }
        if ((i & 2) != 0) {
            str2 = contactReferenceData.firstName;
        }
        if ((i & 4) != 0) {
            str3 = contactReferenceData.lastName;
        }
        if ((i & 8) != 0) {
            str4 = contactReferenceData.alternativeMobileNumber;
        }
        if ((i & 16) != 0) {
            str5 = contactReferenceData.gender;
        }
        if ((i & 32) != 0) {
            str6 = contactReferenceData.maritalStatus;
        }
        if ((i & 64) != 0) {
            contactReference = contactReferenceData.contactReference;
        }
        String str7 = str6;
        ContactReference contactReference2 = contactReference;
        String str8 = str5;
        String str9 = str3;
        return contactReferenceData.copy(str, str2, str9, str4, str8, str7, contactReference2);
    }

    public final String component1() {
        return this.customerId;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.alternativeMobileNumber;
    }

    public final String component5() {
        return this.gender;
    }

    public final String component6() {
        return this.maritalStatus;
    }

    public final ContactReference component7() {
        return this.contactReference;
    }

    public final ContactReferenceData copy(String customerId, String firstName, String lastName, String alternativeMobileNumber, String gender, String maritalStatus, ContactReference contactReference) {
        j.g(customerId, "customerId");
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(alternativeMobileNumber, "alternativeMobileNumber");
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        j.g(contactReference, "contactReference");
        return new ContactReferenceData(customerId, firstName, lastName, alternativeMobileNumber, gender, maritalStatus, contactReference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReferenceData)) {
            return false;
        }
        ContactReferenceData contactReferenceData = (ContactReferenceData) obj;
        return j.b(this.customerId, contactReferenceData.customerId) && j.b(this.firstName, contactReferenceData.firstName) && j.b(this.lastName, contactReferenceData.lastName) && j.b(this.alternativeMobileNumber, contactReferenceData.alternativeMobileNumber) && j.b(this.gender, contactReferenceData.gender) && j.b(this.maritalStatus, contactReferenceData.maritalStatus) && j.b(this.contactReference, contactReferenceData.contactReference);
    }

    public final String getAlternativeMobileNumber() {
        return this.alternativeMobileNumber;
    }

    public final ContactReference getContactReference() {
        return this.contactReference;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMaritalStatus() {
        return this.maritalStatus;
    }

    public int hashCode() {
        return this.contactReference.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.customerId.hashCode() * 31, 31, this.firstName), 31, this.lastName), 31, this.alternativeMobileNumber), 31, this.gender), 31, this.maritalStatus);
    }

    public String toString() {
        String str = this.customerId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.alternativeMobileNumber;
        String str5 = this.gender;
        String str6 = this.maritalStatus;
        ContactReference contactReference = this.contactReference;
        StringBuilder sbX = s.x("ContactReferenceData(customerId=", str, ", firstName=", str2, ", lastName=");
        c.A(sbX, str3, ", alternativeMobileNumber=", str4, ", gender=");
        c.A(sbX, str5, ", maritalStatus=", str6, ", contactReference=");
        sbX.append(contactReference);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.customerId);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.alternativeMobileNumber);
        dest.writeString(this.gender);
        dest.writeString(this.maritalStatus);
        this.contactReference.writeToParcel(dest, i);
    }
}
