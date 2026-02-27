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
public final class CreditContactReferenceResponse implements Parcelable {
    public static final Parcelable.Creator<CreditContactReferenceResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternativeMobileNumber")
    private final String alternativeMobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final CreditContactReference contactReference;

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

    public static final class Creator implements Parcelable.Creator<CreditContactReferenceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditContactReferenceResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditContactReferenceResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CreditContactReference.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditContactReferenceResponse[] newArray(int i) {
            return new CreditContactReferenceResponse[i];
        }
    }

    public CreditContactReferenceResponse(String customerId, String firstName, String lastName, String alternativeMobileNumber, String gender, String maritalStatus, CreditContactReference contactReference) {
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

    public static /* synthetic */ CreditContactReferenceResponse copy$default(CreditContactReferenceResponse creditContactReferenceResponse, String str, String str2, String str3, String str4, String str5, String str6, CreditContactReference creditContactReference, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditContactReferenceResponse.customerId;
        }
        if ((i & 2) != 0) {
            str2 = creditContactReferenceResponse.firstName;
        }
        if ((i & 4) != 0) {
            str3 = creditContactReferenceResponse.lastName;
        }
        if ((i & 8) != 0) {
            str4 = creditContactReferenceResponse.alternativeMobileNumber;
        }
        if ((i & 16) != 0) {
            str5 = creditContactReferenceResponse.gender;
        }
        if ((i & 32) != 0) {
            str6 = creditContactReferenceResponse.maritalStatus;
        }
        if ((i & 64) != 0) {
            creditContactReference = creditContactReferenceResponse.contactReference;
        }
        String str7 = str6;
        CreditContactReference creditContactReference2 = creditContactReference;
        String str8 = str5;
        String str9 = str3;
        return creditContactReferenceResponse.copy(str, str2, str9, str4, str8, str7, creditContactReference2);
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

    public final CreditContactReference component7() {
        return this.contactReference;
    }

    public final CreditContactReferenceResponse copy(String customerId, String firstName, String lastName, String alternativeMobileNumber, String gender, String maritalStatus, CreditContactReference contactReference) {
        j.g(customerId, "customerId");
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        j.g(alternativeMobileNumber, "alternativeMobileNumber");
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        j.g(contactReference, "contactReference");
        return new CreditContactReferenceResponse(customerId, firstName, lastName, alternativeMobileNumber, gender, maritalStatus, contactReference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditContactReferenceResponse)) {
            return false;
        }
        CreditContactReferenceResponse creditContactReferenceResponse = (CreditContactReferenceResponse) obj;
        return j.b(this.customerId, creditContactReferenceResponse.customerId) && j.b(this.firstName, creditContactReferenceResponse.firstName) && j.b(this.lastName, creditContactReferenceResponse.lastName) && j.b(this.alternativeMobileNumber, creditContactReferenceResponse.alternativeMobileNumber) && j.b(this.gender, creditContactReferenceResponse.gender) && j.b(this.maritalStatus, creditContactReferenceResponse.maritalStatus) && j.b(this.contactReference, creditContactReferenceResponse.contactReference);
    }

    public final String getAlternativeMobileNumber() {
        return this.alternativeMobileNumber;
    }

    public final CreditContactReference getContactReference() {
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
        CreditContactReference creditContactReference = this.contactReference;
        StringBuilder sbX = s.x("CreditContactReferenceResponse(customerId=", str, ", firstName=", str2, ", lastName=");
        c.A(sbX, str3, ", alternativeMobileNumber=", str4, ", gender=");
        c.A(sbX, str5, ", maritalStatus=", str6, ", contactReference=");
        sbX.append(creditContactReference);
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
