package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileDataBuilder {
    private AlternativeLandline alternativeLandline;
    private AlternativeMobile alternativeMobile;
    private EducationDetails educationDetails;
    private EmailContact emailContact;
    private ProfileGender gender;
    private ContactName mothersMaidenName;
    private ProfileMaritalStatus profileMaritalStatus;
    private ProfileTin sss;
    private ProfileTin tin;

    public final ProfileData build() {
        return new ProfileData(this.alternativeLandline, this.alternativeMobile, this.emailContact, this.gender, this.profileMaritalStatus, this.tin, this.mothersMaidenName, this.educationDetails, this.sss);
    }

    public final ProfileDataBuilder setAlternativeLandline(AlternativeLandline alternativeLandline) {
        this.alternativeLandline = alternativeLandline;
        return this;
    }

    public final ProfileDataBuilder setAlternativeMobile(AlternativeMobile alternativeMobile) {
        this.alternativeMobile = alternativeMobile;
        return this;
    }

    public final ProfileDataBuilder setEducationDetails(EducationDetails educationDetails) {
        this.educationDetails = educationDetails;
        return this;
    }

    public final ProfileDataBuilder setEmailContact(EmailContact emailContact) {
        this.emailContact = emailContact;
        return this;
    }

    public final ProfileDataBuilder setGender(ProfileGender profileGender) {
        this.gender = profileGender;
        return this;
    }

    public final ProfileDataBuilder setMothersMaidenName(ContactName contactName) {
        this.mothersMaidenName = contactName;
        return this;
    }

    public final ProfileDataBuilder setProfileMaritalStatus(ProfileMaritalStatus profileMaritalStatus) {
        this.profileMaritalStatus = profileMaritalStatus;
        return this;
    }

    public final ProfileDataBuilder setSss(ProfileTin profileTin) {
        this.sss = profileTin;
        return this;
    }

    public final ProfileDataBuilder setTin(ProfileTin profileTin) {
        this.tin = profileTin;
        return this;
    }
}
