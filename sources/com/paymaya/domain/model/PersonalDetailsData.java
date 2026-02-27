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
public final class PersonalDetailsData implements Parcelable {
    public static final Parcelable.Creator<PersonalDetailsData> CREATOR = new Creator();

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

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private final MothersMaidenName mothersMaidenName;

    public static final class Creator implements Parcelable.Creator<PersonalDetailsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PersonalDetailsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ContactReference.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MothersMaidenName.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsData[] newArray(int i) {
            return new PersonalDetailsData[i];
        }
    }

    public PersonalDetailsData(String customerId, String firstName, String lastName, String str, String str2, String str3, ContactReference contactReference, MothersMaidenName mothersMaidenName) {
        j.g(customerId, "customerId");
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.alternativeMobileNumber = str;
        this.gender = str2;
        this.maritalStatus = str3;
        this.contactReference = contactReference;
        this.mothersMaidenName = mothersMaidenName;
    }

    public static /* synthetic */ PersonalDetailsData copy$default(PersonalDetailsData personalDetailsData, String str, String str2, String str3, String str4, String str5, String str6, ContactReference contactReference, MothersMaidenName mothersMaidenName, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalDetailsData.customerId;
        }
        if ((i & 2) != 0) {
            str2 = personalDetailsData.firstName;
        }
        if ((i & 4) != 0) {
            str3 = personalDetailsData.lastName;
        }
        if ((i & 8) != 0) {
            str4 = personalDetailsData.alternativeMobileNumber;
        }
        if ((i & 16) != 0) {
            str5 = personalDetailsData.gender;
        }
        if ((i & 32) != 0) {
            str6 = personalDetailsData.maritalStatus;
        }
        if ((i & 64) != 0) {
            contactReference = personalDetailsData.contactReference;
        }
        if ((i & 128) != 0) {
            mothersMaidenName = personalDetailsData.mothersMaidenName;
        }
        ContactReference contactReference2 = contactReference;
        MothersMaidenName mothersMaidenName2 = mothersMaidenName;
        String str7 = str5;
        String str8 = str6;
        return personalDetailsData.copy(str, str2, str3, str4, str7, str8, contactReference2, mothersMaidenName2);
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

    public final MothersMaidenName component8() {
        return this.mothersMaidenName;
    }

    public final PersonalDetailsData copy(String customerId, String firstName, String lastName, String str, String str2, String str3, ContactReference contactReference, MothersMaidenName mothersMaidenName) {
        j.g(customerId, "customerId");
        j.g(firstName, "firstName");
        j.g(lastName, "lastName");
        return new PersonalDetailsData(customerId, firstName, lastName, str, str2, str3, contactReference, mothersMaidenName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalDetailsData)) {
            return false;
        }
        PersonalDetailsData personalDetailsData = (PersonalDetailsData) obj;
        return j.b(this.customerId, personalDetailsData.customerId) && j.b(this.firstName, personalDetailsData.firstName) && j.b(this.lastName, personalDetailsData.lastName) && j.b(this.alternativeMobileNumber, personalDetailsData.alternativeMobileNumber) && j.b(this.gender, personalDetailsData.gender) && j.b(this.maritalStatus, personalDetailsData.maritalStatus) && j.b(this.contactReference, personalDetailsData.contactReference) && j.b(this.mothersMaidenName, personalDetailsData.mothersMaidenName);
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

    public final MothersMaidenName getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(this.customerId.hashCode() * 31, 31, this.firstName), 31, this.lastName);
        String str = this.alternativeMobileNumber;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gender;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maritalStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContactReference contactReference = this.contactReference;
        int iHashCode4 = (iHashCode3 + (contactReference == null ? 0 : contactReference.hashCode())) * 31;
        MothersMaidenName mothersMaidenName = this.mothersMaidenName;
        return iHashCode4 + (mothersMaidenName != null ? mothersMaidenName.hashCode() : 0);
    }

    public String toString() {
        String str = this.customerId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.alternativeMobileNumber;
        String str5 = this.gender;
        String str6 = this.maritalStatus;
        ContactReference contactReference = this.contactReference;
        MothersMaidenName mothersMaidenName = this.mothersMaidenName;
        StringBuilder sbX = s.x("PersonalDetailsData(customerId=", str, ", firstName=", str2, ", lastName=");
        c.A(sbX, str3, ", alternativeMobileNumber=", str4, ", gender=");
        c.A(sbX, str5, ", maritalStatus=", str6, ", contactReference=");
        sbX.append(contactReference);
        sbX.append(", mothersMaidenName=");
        sbX.append(mothersMaidenName);
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
        ContactReference contactReference = this.contactReference;
        if (contactReference == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactReference.writeToParcel(dest, i);
        }
        MothersMaidenName mothersMaidenName = this.mothersMaidenName;
        if (mothersMaidenName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mothersMaidenName.writeToParcel(dest, i);
        }
    }
}
