package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PersonalDetailsPatchResponse implements Parcelable {
    public static final Parcelable.Creator<PersonalDetailsPatchResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final ContactReferenceId contactReference;

    @InterfaceC1497a
    @InterfaceC1498b("gender")
    private final GenderId gender;

    @InterfaceC1497a
    @InterfaceC1498b("maritalStatus")
    private final MaritalStatusId maritalStatus;

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private final MothersMaidenNameId mothersMaidenName;

    public static final class Creator implements Parcelable.Creator<PersonalDetailsPatchResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsPatchResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PersonalDetailsPatchResponse(parcel.readInt() == 0 ? null : ContactReferenceId.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GenderId.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MaritalStatusId.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MothersMaidenNameId.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalDetailsPatchResponse[] newArray(int i) {
            return new PersonalDetailsPatchResponse[i];
        }
    }

    public PersonalDetailsPatchResponse(ContactReferenceId contactReferenceId, GenderId genderId, MaritalStatusId maritalStatusId, MothersMaidenNameId mothersMaidenNameId) {
        this.contactReference = contactReferenceId;
        this.gender = genderId;
        this.maritalStatus = maritalStatusId;
        this.mothersMaidenName = mothersMaidenNameId;
    }

    public static /* synthetic */ PersonalDetailsPatchResponse copy$default(PersonalDetailsPatchResponse personalDetailsPatchResponse, ContactReferenceId contactReferenceId, GenderId genderId, MaritalStatusId maritalStatusId, MothersMaidenNameId mothersMaidenNameId, int i, Object obj) {
        if ((i & 1) != 0) {
            contactReferenceId = personalDetailsPatchResponse.contactReference;
        }
        if ((i & 2) != 0) {
            genderId = personalDetailsPatchResponse.gender;
        }
        if ((i & 4) != 0) {
            maritalStatusId = personalDetailsPatchResponse.maritalStatus;
        }
        if ((i & 8) != 0) {
            mothersMaidenNameId = personalDetailsPatchResponse.mothersMaidenName;
        }
        return personalDetailsPatchResponse.copy(contactReferenceId, genderId, maritalStatusId, mothersMaidenNameId);
    }

    public final ContactReferenceId component1() {
        return this.contactReference;
    }

    public final GenderId component2() {
        return this.gender;
    }

    public final MaritalStatusId component3() {
        return this.maritalStatus;
    }

    public final MothersMaidenNameId component4() {
        return this.mothersMaidenName;
    }

    public final PersonalDetailsPatchResponse copy(ContactReferenceId contactReferenceId, GenderId genderId, MaritalStatusId maritalStatusId, MothersMaidenNameId mothersMaidenNameId) {
        return new PersonalDetailsPatchResponse(contactReferenceId, genderId, maritalStatusId, mothersMaidenNameId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalDetailsPatchResponse)) {
            return false;
        }
        PersonalDetailsPatchResponse personalDetailsPatchResponse = (PersonalDetailsPatchResponse) obj;
        return j.b(this.contactReference, personalDetailsPatchResponse.contactReference) && j.b(this.gender, personalDetailsPatchResponse.gender) && j.b(this.maritalStatus, personalDetailsPatchResponse.maritalStatus) && j.b(this.mothersMaidenName, personalDetailsPatchResponse.mothersMaidenName);
    }

    public final ContactReferenceId getContactReference() {
        return this.contactReference;
    }

    public final GenderId getGender() {
        return this.gender;
    }

    public final MaritalStatusId getMaritalStatus() {
        return this.maritalStatus;
    }

    public final MothersMaidenNameId getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    public int hashCode() {
        ContactReferenceId contactReferenceId = this.contactReference;
        int iHashCode = (contactReferenceId == null ? 0 : contactReferenceId.hashCode()) * 31;
        GenderId genderId = this.gender;
        int iHashCode2 = (iHashCode + (genderId == null ? 0 : genderId.hashCode())) * 31;
        MaritalStatusId maritalStatusId = this.maritalStatus;
        int iHashCode3 = (iHashCode2 + (maritalStatusId == null ? 0 : maritalStatusId.hashCode())) * 31;
        MothersMaidenNameId mothersMaidenNameId = this.mothersMaidenName;
        return iHashCode3 + (mothersMaidenNameId != null ? mothersMaidenNameId.hashCode() : 0);
    }

    public String toString() {
        return "PersonalDetailsPatchResponse(contactReference=" + this.contactReference + ", gender=" + this.gender + ", maritalStatus=" + this.maritalStatus + ", mothersMaidenName=" + this.mothersMaidenName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        ContactReferenceId contactReferenceId = this.contactReference;
        if (contactReferenceId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactReferenceId.writeToParcel(dest, i);
        }
        GenderId genderId = this.gender;
        if (genderId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            genderId.writeToParcel(dest, i);
        }
        MaritalStatusId maritalStatusId = this.maritalStatus;
        if (maritalStatusId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            maritalStatusId.writeToParcel(dest, i);
        }
        MothersMaidenNameId mothersMaidenNameId = this.mothersMaidenName;
        if (mothersMaidenNameId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mothersMaidenNameId.writeToParcel(dest, i);
        }
    }
}
