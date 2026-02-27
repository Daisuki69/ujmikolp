package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileData implements Parcelable {
    public static final Parcelable.Creator<ProfileData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("alternativeLandline")
    private AlternativeLandline alternativeLandline;

    @InterfaceC1497a
    @InterfaceC1498b("alternativeMobile")
    private AlternativeMobile alternativeMobile;

    @InterfaceC1497a
    @InterfaceC1498b("educationDetails")
    private EducationDetails educationDetails;

    @InterfaceC1497a
    @InterfaceC1498b("emailContact")
    private EmailContact emailContact;

    @InterfaceC1497a
    @InterfaceC1498b("gender")
    private ProfileGender gender;

    @InterfaceC1497a
    @InterfaceC1498b("mothersMaidenName")
    private ContactName mothersMaidenName;

    @InterfaceC1497a
    @InterfaceC1498b("maritalStatus")
    private ProfileMaritalStatus profileMaritalStatus;

    @InterfaceC1497a
    @InterfaceC1498b("sss")
    private ProfileTin sss;

    @InterfaceC1497a
    @InterfaceC1498b("tin")
    private ProfileTin tin;

    public static final class Creator implements Parcelable.Creator<ProfileData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileData(parcel.readInt() == 0 ? null : AlternativeLandline.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlternativeMobile.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EmailContact.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileGender.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileMaritalStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileTin.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContactName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EducationDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProfileTin.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileData[] newArray(int i) {
            return new ProfileData[i];
        }
    }

    public ProfileData() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ ProfileData copy$default(ProfileData profileData, AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileTin profileTin, ContactName contactName, EducationDetails educationDetails, ProfileTin profileTin2, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeLandline = profileData.alternativeLandline;
        }
        if ((i & 2) != 0) {
            alternativeMobile = profileData.alternativeMobile;
        }
        if ((i & 4) != 0) {
            emailContact = profileData.emailContact;
        }
        if ((i & 8) != 0) {
            profileGender = profileData.gender;
        }
        if ((i & 16) != 0) {
            profileMaritalStatus = profileData.profileMaritalStatus;
        }
        if ((i & 32) != 0) {
            profileTin = profileData.tin;
        }
        if ((i & 64) != 0) {
            contactName = profileData.mothersMaidenName;
        }
        if ((i & 128) != 0) {
            educationDetails = profileData.educationDetails;
        }
        if ((i & 256) != 0) {
            profileTin2 = profileData.sss;
        }
        EducationDetails educationDetails2 = educationDetails;
        ProfileTin profileTin3 = profileTin2;
        ProfileTin profileTin4 = profileTin;
        ContactName contactName2 = contactName;
        ProfileMaritalStatus profileMaritalStatus2 = profileMaritalStatus;
        EmailContact emailContact2 = emailContact;
        return profileData.copy(alternativeLandline, alternativeMobile, emailContact2, profileGender, profileMaritalStatus2, profileTin4, contactName2, educationDetails2, profileTin3);
    }

    public final AlternativeLandline component1() {
        return this.alternativeLandline;
    }

    public final AlternativeMobile component2() {
        return this.alternativeMobile;
    }

    public final EmailContact component3() {
        return this.emailContact;
    }

    public final ProfileGender component4() {
        return this.gender;
    }

    public final ProfileMaritalStatus component5() {
        return this.profileMaritalStatus;
    }

    public final ProfileTin component6() {
        return this.tin;
    }

    public final ContactName component7() {
        return this.mothersMaidenName;
    }

    public final EducationDetails component8() {
        return this.educationDetails;
    }

    public final ProfileTin component9() {
        return this.sss;
    }

    public final ProfileData copy(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileTin profileTin, ContactName contactName, EducationDetails educationDetails, ProfileTin profileTin2) {
        return new ProfileData(alternativeLandline, alternativeMobile, emailContact, profileGender, profileMaritalStatus, profileTin, contactName, educationDetails, profileTin2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileData)) {
            return false;
        }
        ProfileData profileData = (ProfileData) obj;
        return j.b(this.alternativeLandline, profileData.alternativeLandline) && j.b(this.alternativeMobile, profileData.alternativeMobile) && j.b(this.emailContact, profileData.emailContact) && j.b(this.gender, profileData.gender) && j.b(this.profileMaritalStatus, profileData.profileMaritalStatus) && j.b(this.tin, profileData.tin) && j.b(this.mothersMaidenName, profileData.mothersMaidenName) && j.b(this.educationDetails, profileData.educationDetails) && j.b(this.sss, profileData.sss);
    }

    public final AlternativeLandline getAlternativeLandline() {
        return this.alternativeLandline;
    }

    public final AlternativeMobile getAlternativeMobile() {
        return this.alternativeMobile;
    }

    public final EducationDetails getEducationDetails() {
        return this.educationDetails;
    }

    public final EmailContact getEmailContact() {
        return this.emailContact;
    }

    public final ProfileGender getGender() {
        return this.gender;
    }

    public final ContactName getMothersMaidenName() {
        return this.mothersMaidenName;
    }

    public final ProfileMaritalStatus getProfileMaritalStatus() {
        return this.profileMaritalStatus;
    }

    public final ProfileTin getSss() {
        return this.sss;
    }

    public final ProfileTin getTin() {
        return this.tin;
    }

    public int hashCode() {
        AlternativeLandline alternativeLandline = this.alternativeLandline;
        int iHashCode = (alternativeLandline == null ? 0 : alternativeLandline.hashCode()) * 31;
        AlternativeMobile alternativeMobile = this.alternativeMobile;
        int iHashCode2 = (iHashCode + (alternativeMobile == null ? 0 : alternativeMobile.hashCode())) * 31;
        EmailContact emailContact = this.emailContact;
        int iHashCode3 = (iHashCode2 + (emailContact == null ? 0 : emailContact.hashCode())) * 31;
        ProfileGender profileGender = this.gender;
        int iHashCode4 = (iHashCode3 + (profileGender == null ? 0 : profileGender.hashCode())) * 31;
        ProfileMaritalStatus profileMaritalStatus = this.profileMaritalStatus;
        int iHashCode5 = (iHashCode4 + (profileMaritalStatus == null ? 0 : profileMaritalStatus.hashCode())) * 31;
        ProfileTin profileTin = this.tin;
        int iHashCode6 = (iHashCode5 + (profileTin == null ? 0 : profileTin.hashCode())) * 31;
        ContactName contactName = this.mothersMaidenName;
        int iHashCode7 = (iHashCode6 + (contactName == null ? 0 : contactName.hashCode())) * 31;
        EducationDetails educationDetails = this.educationDetails;
        int iHashCode8 = (iHashCode7 + (educationDetails == null ? 0 : educationDetails.hashCode())) * 31;
        ProfileTin profileTin2 = this.sss;
        return iHashCode8 + (profileTin2 != null ? profileTin2.hashCode() : 0);
    }

    public final void setAlternativeLandline(AlternativeLandline alternativeLandline) {
        this.alternativeLandline = alternativeLandline;
    }

    public final void setAlternativeMobile(AlternativeMobile alternativeMobile) {
        this.alternativeMobile = alternativeMobile;
    }

    public final void setEducationDetails(EducationDetails educationDetails) {
        this.educationDetails = educationDetails;
    }

    public final void setEmailContact(EmailContact emailContact) {
        this.emailContact = emailContact;
    }

    public final void setGender(ProfileGender profileGender) {
        this.gender = profileGender;
    }

    public final void setMothersMaidenName(ContactName contactName) {
        this.mothersMaidenName = contactName;
    }

    public final void setProfileMaritalStatus(ProfileMaritalStatus profileMaritalStatus) {
        this.profileMaritalStatus = profileMaritalStatus;
    }

    public final void setSss(ProfileTin profileTin) {
        this.sss = profileTin;
    }

    public final void setTin(ProfileTin profileTin) {
        this.tin = profileTin;
    }

    public String toString() {
        return "ProfileData(alternativeLandline=" + this.alternativeLandline + ", alternativeMobile=" + this.alternativeMobile + ", emailContact=" + this.emailContact + ", gender=" + this.gender + ", profileMaritalStatus=" + this.profileMaritalStatus + ", tin=" + this.tin + ", mothersMaidenName=" + this.mothersMaidenName + ", educationDetails=" + this.educationDetails + ", sss=" + this.sss + ")";
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
        ProfileTin profileTin = this.tin;
        if (profileTin == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileTin.writeToParcel(dest, i);
        }
        ContactName contactName = this.mothersMaidenName;
        if (contactName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactName.writeToParcel(dest, i);
        }
        EducationDetails educationDetails = this.educationDetails;
        if (educationDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            educationDetails.writeToParcel(dest, i);
        }
        ProfileTin profileTin2 = this.sss;
        if (profileTin2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            profileTin2.writeToParcel(dest, i);
        }
    }

    public ProfileData(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileTin profileTin, ContactName contactName, EducationDetails educationDetails, ProfileTin profileTin2) {
        this.alternativeLandline = alternativeLandline;
        this.alternativeMobile = alternativeMobile;
        this.emailContact = emailContact;
        this.gender = profileGender;
        this.profileMaritalStatus = profileMaritalStatus;
        this.tin = profileTin;
        this.mothersMaidenName = contactName;
        this.educationDetails = educationDetails;
        this.sss = profileTin2;
    }

    public /* synthetic */ ProfileData(AlternativeLandline alternativeLandline, AlternativeMobile alternativeMobile, EmailContact emailContact, ProfileGender profileGender, ProfileMaritalStatus profileMaritalStatus, ProfileTin profileTin, ContactName contactName, EducationDetails educationDetails, ProfileTin profileTin2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alternativeLandline, (i & 2) != 0 ? null : alternativeMobile, (i & 4) != 0 ? null : emailContact, (i & 8) != 0 ? null : profileGender, (i & 16) != 0 ? null : profileMaritalStatus, (i & 32) != 0 ? null : profileTin, (i & 64) != 0 ? null : contactName, (i & 128) != 0 ? null : educationDetails, (i & 256) != 0 ? null : profileTin2);
    }
}
