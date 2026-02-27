package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferencePatchRequest implements Parcelable {
    public static final Parcelable.Creator<ContactReferencePatchRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternativeMobileNumber")
    private final String alternativeMobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final ContactReference contactReference;

    @InterfaceC1497a
    @InterfaceC1498b("gender")
    private final String gender;

    @InterfaceC1497a
    @InterfaceC1498b("maritalStatus")
    private final String maritalStatus;

    public static final class Creator implements Parcelable.Creator<ContactReferencePatchRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferencePatchRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferencePatchRequest(parcel.readString(), parcel.readString(), parcel.readString(), ContactReference.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferencePatchRequest[] newArray(int i) {
            return new ContactReferencePatchRequest[i];
        }
    }

    public ContactReferencePatchRequest(String str, String gender, String maritalStatus, ContactReference contactReference) {
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        j.g(contactReference, "contactReference");
        this.alternativeMobileNumber = str;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.contactReference = contactReference;
    }

    public static /* synthetic */ ContactReferencePatchRequest copy$default(ContactReferencePatchRequest contactReferencePatchRequest, String str, String str2, String str3, ContactReference contactReference, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferencePatchRequest.alternativeMobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = contactReferencePatchRequest.gender;
        }
        if ((i & 4) != 0) {
            str3 = contactReferencePatchRequest.maritalStatus;
        }
        if ((i & 8) != 0) {
            contactReference = contactReferencePatchRequest.contactReference;
        }
        return contactReferencePatchRequest.copy(str, str2, str3, contactReference);
    }

    public final String component1() {
        return this.alternativeMobileNumber;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.maritalStatus;
    }

    public final ContactReference component4() {
        return this.contactReference;
    }

    public final ContactReferencePatchRequest copy(String str, String gender, String maritalStatus, ContactReference contactReference) {
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        j.g(contactReference, "contactReference");
        return new ContactReferencePatchRequest(str, gender, maritalStatus, contactReference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReferencePatchRequest)) {
            return false;
        }
        ContactReferencePatchRequest contactReferencePatchRequest = (ContactReferencePatchRequest) obj;
        return j.b(this.alternativeMobileNumber, contactReferencePatchRequest.alternativeMobileNumber) && j.b(this.gender, contactReferencePatchRequest.gender) && j.b(this.maritalStatus, contactReferencePatchRequest.maritalStatus) && j.b(this.contactReference, contactReferencePatchRequest.contactReference);
    }

    public final String getAlternativeMobileNumber() {
        return this.alternativeMobileNumber;
    }

    public final ContactReference getContactReference() {
        return this.contactReference;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getMaritalStatus() {
        return this.maritalStatus;
    }

    public int hashCode() {
        String str = this.alternativeMobileNumber;
        return this.contactReference.hashCode() + AbstractC1414e.c(AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.gender), 31, this.maritalStatus);
    }

    public String toString() {
        String str = this.alternativeMobileNumber;
        String str2 = this.gender;
        String str3 = this.maritalStatus;
        ContactReference contactReference = this.contactReference;
        StringBuilder sbX = s.x("ContactReferencePatchRequest(alternativeMobileNumber=", str, ", gender=", str2, ", maritalStatus=");
        sbX.append(str3);
        sbX.append(", contactReference=");
        sbX.append(contactReference);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.alternativeMobileNumber);
        dest.writeString(this.gender);
        dest.writeString(this.maritalStatus);
        this.contactReference.writeToParcel(dest, i);
    }
}
