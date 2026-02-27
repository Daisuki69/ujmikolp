package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ComplianceUpdateProfileData implements Parcelable {
    public static final Parcelable.Creator<ComplianceUpdateProfileData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternativeLandline")
    private final AlternativeLandline alternativeLandline;

    @InterfaceC1497a
    @InterfaceC1498b("alternativeMobile")
    private final AlternativeMobile alternativeMobile;

    @InterfaceC1497a
    @InterfaceC1498b("emailContact")
    private final EmailContact emailContact;

    @InterfaceC1497a
    @InterfaceC1498b("fatcaDetails")
    private final FatcaDetails fatcaDetails;

    @InterfaceC1497a
    @InterfaceC1498b("gender")
    private final ProfileGender gender;

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private final ContactName mothersMaidenName;

    @InterfaceC1497a
    @InterfaceC1498b("permanentAddress")
    private final ProfileAddress permanentAddress;

    @InterfaceC1497a
    @InterfaceC1498b("presentAddress")
    private final ProfileAddress presentAddress;

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final UserProfileContactReference profileContactReference;

    @InterfaceC1497a
    @InterfaceC1498b("maritalStatus")
    private final ProfileMaritalStatus profileMaritalStatus;

    @InterfaceC1497a
    @InterfaceC1498b("tin")
    private final ProfileTin tin;

    @InterfaceC1497a
    @InterfaceC1498b("workDetails")
    private final WorkDetails workDetails;

    public static final class Creator implements Parcelable.Creator<ComplianceUpdateProfileData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComplianceUpdateProfileData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ComplianceUpdateProfileData(parcel.readInt() == 0 ? null : AlternativeLandline.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlternativeMobile.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UserProfileContactReference.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EmailContact.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileGender.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileMaritalStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileAddress.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileAddress.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileTin.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WorkDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContactName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FatcaDetails.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComplianceUpdateProfileData[] newArray(int i) {
            return new ComplianceUpdateProfileData[i];
        }
    }

    public ComplianceUpdateProfileData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ ComplianceUpdateProfileData copy$default(ComplianceUpdateProfileData complianceUpdateProfileData, AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, UserProfileContactReference userProfileContactReference, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileAddress profileAddress, ProfileAddress profileAddress2, ProfileTin profileTin, WorkDetails workDetails, ContactName contactName, FatcaDetails fatcaDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeLandline = complianceUpdateProfileData.alternativeLandline;
        }
        if ((i & 2) != 0) {
            alternativeMobile = complianceUpdateProfileData.alternativeMobile;
        }
        if ((i & 4) != 0) {
            userProfileContactReference = complianceUpdateProfileData.profileContactReference;
        }
        if ((i & 8) != 0) {
            emailContact = complianceUpdateProfileData.emailContact;
        }
        if ((i & 16) != 0) {
            profileGender = complianceUpdateProfileData.gender;
        }
        if ((i & 32) != 0) {
            profileMaritalStatus = complianceUpdateProfileData.profileMaritalStatus;
        }
        if ((i & 64) != 0) {
            profileAddress = complianceUpdateProfileData.permanentAddress;
        }
        if ((i & 128) != 0) {
            profileAddress2 = complianceUpdateProfileData.presentAddress;
        }
        if ((i & 256) != 0) {
            profileTin = complianceUpdateProfileData.tin;
        }
        if ((i & 512) != 0) {
            workDetails = complianceUpdateProfileData.workDetails;
        }
        if ((i & 1024) != 0) {
            contactName = complianceUpdateProfileData.mothersMaidenName;
        }
        if ((i & 2048) != 0) {
            fatcaDetails = complianceUpdateProfileData.fatcaDetails;
        }
        ContactName contactName2 = contactName;
        FatcaDetails fatcaDetails2 = fatcaDetails;
        ProfileTin profileTin2 = profileTin;
        WorkDetails workDetails2 = workDetails;
        ProfileAddress profileAddress3 = profileAddress;
        ProfileAddress profileAddress4 = profileAddress2;
        ProfileGender profileGender2 = profileGender;
        ProfileMaritalStatus profileMaritalStatus2 = profileMaritalStatus;
        return complianceUpdateProfileData.copy(alternativeLandline, alternativeMobile, userProfileContactReference, emailContact, profileGender2, profileMaritalStatus2, profileAddress3, profileAddress4, profileTin2, workDetails2, contactName2, fatcaDetails2);
    }

    public final AlternativeLandline component1() {
        return this.alternativeLandline;
    }

    public final WorkDetails component10() {
        return this.workDetails;
    }

    public final ContactName component11() {
        return this.mothersMaidenName;
    }

    public final FatcaDetails component12() {
        return this.fatcaDetails;
    }

    public final AlternativeMobile component2() {
        return this.alternativeMobile;
    }

    public final UserProfileContactReference component3() {
        return this.profileContactReference;
    }

    public final EmailContact component4() {
        return this.emailContact;
    }

    public final ProfileGender component5() {
        return this.gender;
    }

    public final ProfileMaritalStatus component6() {
        return this.profileMaritalStatus;
    }

    public final ProfileAddress component7() {
        return this.permanentAddress;
    }

    public final ProfileAddress component8() {
        return this.presentAddress;
    }

    public final ProfileTin component9() {
        return this.tin;
    }

    public final ComplianceUpdateProfileData copy(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, UserProfileContactReference userProfileContactReference, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileAddress profileAddress, ProfileAddress profileAddress2, ProfileTin profileTin, WorkDetails workDetails, ContactName contactName, FatcaDetails fatcaDetails) {
        return new ComplianceUpdateProfileData(alternativeLandline, alternativeMobile, userProfileContactReference, emailContact, profileGender, profileMaritalStatus, profileAddress, profileAddress2, profileTin, workDetails, contactName, fatcaDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplianceUpdateProfileData)) {
            return false;
        }
        ComplianceUpdateProfileData complianceUpdateProfileData = (ComplianceUpdateProfileData) obj;
        return j.b(this.alternativeLandline, complianceUpdateProfileData.alternativeLandline) && j.b(this.alternativeMobile, complianceUpdateProfileData.alternativeMobile) && j.b(this.profileContactReference, complianceUpdateProfileData.profileContactReference) && j.b(this.emailContact, complianceUpdateProfileData.emailContact) && j.b(this.gender, complianceUpdateProfileData.gender) && j.b(this.profileMaritalStatus, complianceUpdateProfileData.profileMaritalStatus) && j.b(this.permanentAddress, complianceUpdateProfileData.permanentAddress) && j.b(this.presentAddress, complianceUpdateProfileData.presentAddress) && j.b(this.tin, complianceUpdateProfileData.tin) && j.b(this.workDetails, complianceUpdateProfileData.workDetails) && j.b(this.mothersMaidenName, complianceUpdateProfileData.mothersMaidenName) && j.b(this.fatcaDetails, complianceUpdateProfileData.fatcaDetails);
    }

    public final AlternativeLandline getAlternativeLandline() {
        return this.alternativeLandline;
    }

    public final AlternativeMobile getAlternativeMobile() {
        return this.alternativeMobile;
    }

    public final EmailContact getEmailContact() {
        return this.emailContact;
    }

    public final FatcaDetails getFatcaDetails() {
        return this.fatcaDetails;
    }

    public final ProfileGender getGender() {
        return this.gender;
    }

    public final ContactName getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    public final ProfileAddress getPermanentAddress() {
        return this.permanentAddress;
    }

    public final ProfileAddress getPresentAddress() {
        return this.presentAddress;
    }

    public final UserProfileContactReference getProfileContactReference() {
        return this.profileContactReference;
    }

    public final ProfileMaritalStatus getProfileMaritalStatus() {
        return this.profileMaritalStatus;
    }

    public final ProfileTin getTin() {
        return this.tin;
    }

    public final WorkDetails getWorkDetails() {
        return this.workDetails;
    }

    public int hashCode() {
        AlternativeLandline alternativeLandline = this.alternativeLandline;
        int iHashCode = (alternativeLandline == null ? 0 : alternativeLandline.hashCode()) * 31;
        AlternativeMobile alternativeMobile = this.alternativeMobile;
        int iHashCode2 = (iHashCode + (alternativeMobile == null ? 0 : alternativeMobile.hashCode())) * 31;
        UserProfileContactReference userProfileContactReference = this.profileContactReference;
        int iHashCode3 = (iHashCode2 + (userProfileContactReference == null ? 0 : userProfileContactReference.hashCode())) * 31;
        EmailContact emailContact = this.emailContact;
        int iHashCode4 = (iHashCode3 + (emailContact == null ? 0 : emailContact.hashCode())) * 31;
        ProfileGender profileGender = this.gender;
        int iHashCode5 = (iHashCode4 + (profileGender == null ? 0 : profileGender.hashCode())) * 31;
        ProfileMaritalStatus profileMaritalStatus = this.profileMaritalStatus;
        int iHashCode6 = (iHashCode5 + (profileMaritalStatus == null ? 0 : profileMaritalStatus.hashCode())) * 31;
        ProfileAddress profileAddress = this.permanentAddress;
        int iHashCode7 = (iHashCode6 + (profileAddress == null ? 0 : profileAddress.hashCode())) * 31;
        ProfileAddress profileAddress2 = this.presentAddress;
        int iHashCode8 = (iHashCode7 + (profileAddress2 == null ? 0 : profileAddress2.hashCode())) * 31;
        ProfileTin profileTin = this.tin;
        int iHashCode9 = (iHashCode8 + (profileTin == null ? 0 : profileTin.hashCode())) * 31;
        WorkDetails workDetails = this.workDetails;
        int iHashCode10 = (iHashCode9 + (workDetails == null ? 0 : workDetails.hashCode())) * 31;
        ContactName contactName = this.mothersMaidenName;
        int iHashCode11 = (iHashCode10 + (contactName == null ? 0 : contactName.hashCode())) * 31;
        FatcaDetails fatcaDetails = this.fatcaDetails;
        return iHashCode11 + (fatcaDetails != null ? fatcaDetails.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceUpdateProfileData(alternativeLandline=" + this.alternativeLandline + ", alternativeMobile=" + this.alternativeMobile + ", profileContactReference=" + this.profileContactReference + ", emailContact=" + this.emailContact + ", gender=" + this.gender + ", profileMaritalStatus=" + this.profileMaritalStatus + ", permanentAddress=" + this.permanentAddress + ", presentAddress=" + this.presentAddress + ", tin=" + this.tin + ", workDetails=" + this.workDetails + ", mothersMaidenName=" + this.mothersMaidenName + ", fatcaDetails=" + this.fatcaDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        AlternativeLandline alternativeLandline = this.alternativeLandline;
        if (alternativeLandline == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alternativeLandline.writeToParcel(dest, i);
        }
        AlternativeMobile alternativeMobile = this.alternativeMobile;
        if (alternativeMobile == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alternativeMobile.writeToParcel(dest, i);
        }
        UserProfileContactReference userProfileContactReference = this.profileContactReference;
        if (userProfileContactReference == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userProfileContactReference.writeToParcel(dest, i);
        }
        EmailContact emailContact = this.emailContact;
        if (emailContact == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            emailContact.writeToParcel(dest, i);
        }
        ProfileGender profileGender = this.gender;
        if (profileGender == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileGender.writeToParcel(dest, i);
        }
        ProfileMaritalStatus profileMaritalStatus = this.profileMaritalStatus;
        if (profileMaritalStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileMaritalStatus.writeToParcel(dest, i);
        }
        ProfileAddress profileAddress = this.permanentAddress;
        if (profileAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileAddress.writeToParcel(dest, i);
        }
        ProfileAddress profileAddress2 = this.presentAddress;
        if (profileAddress2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileAddress2.writeToParcel(dest, i);
        }
        ProfileTin profileTin = this.tin;
        if (profileTin == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileTin.writeToParcel(dest, i);
        }
        WorkDetails workDetails = this.workDetails;
        if (workDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            workDetails.writeToParcel(dest, i);
        }
        ContactName contactName = this.mothersMaidenName;
        if (contactName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactName.writeToParcel(dest, i);
        }
        FatcaDetails fatcaDetails = this.fatcaDetails;
        if (fatcaDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fatcaDetails.writeToParcel(dest, i);
        }
    }

    public ComplianceUpdateProfileData(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, UserProfileContactReference userProfileContactReference, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileAddress profileAddress, ProfileAddress profileAddress2, ProfileTin profileTin, WorkDetails workDetails, ContactName contactName, FatcaDetails fatcaDetails) {
        this.alternativeLandline = alternativeLandline;
        this.alternativeMobile = alternativeMobile;
        this.profileContactReference = userProfileContactReference;
        this.emailContact = emailContact;
        this.gender = profileGender;
        this.profileMaritalStatus = profileMaritalStatus;
        this.permanentAddress = profileAddress;
        this.presentAddress = profileAddress2;
        this.tin = profileTin;
        this.workDetails = workDetails;
        this.mothersMaidenName = contactName;
        this.fatcaDetails = fatcaDetails;
    }

    public /* synthetic */ ComplianceUpdateProfileData(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, UserProfileContactReference userProfileContactReference, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileAddress profileAddress, ProfileAddress profileAddress2, ProfileTin profileTin, WorkDetails workDetails, ContactName contactName, FatcaDetails fatcaDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alternativeLandline, (i & 2) != 0 ? null : alternativeMobile, (i & 4) != 0 ? null : userProfileContactReference, (i & 8) != 0 ? null : emailContact, (i & 16) != 0 ? null : profileGender, (i & 32) != 0 ? null : profileMaritalStatus, (i & 64) != 0 ? null : profileAddress, (i & 128) != 0 ? null : profileAddress2, (i & 256) != 0 ? null : profileTin, (i & 512) != 0 ? null : workDetails, (i & 1024) != 0 ? null : contactName, (i & 2048) != 0 ? null : fatcaDetails);
    }
}
