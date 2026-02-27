package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PersonalDetailsPatchRequest implements Parcelable {
    public static final Parcelable.Creator<PersonalDetailsPatchRequest> CREATOR = new Creator();

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

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private final MothersMaidenName mothersMaidenName;

    public static final class Creator implements Parcelable.Creator<PersonalDetailsPatchRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsPatchRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PersonalDetailsPatchRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ContactReference.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MothersMaidenName.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsPatchRequest[] newArray(int i) {
            return new PersonalDetailsPatchRequest[i];
        }
    }

    public PersonalDetailsPatchRequest(String str, String gender, String maritalStatus, ContactReference contactReference, MothersMaidenName mothersMaidenName) {
        j.g(gender, "gender");
        j.g(maritalStatus, "maritalStatus");
        this.alternativeMobileNumber = str;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.contactReference = contactReference;
        this.mothersMaidenName = mothersMaidenName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

    public final MothersMaidenName getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
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
