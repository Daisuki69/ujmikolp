package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.UpgradePlus;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UpgradePlus, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_UpgradePlus extends UpgradePlus {
    private final boolean isPermanentSameWithPresentAddress;
    private final boolean isSocialSecurity;
    private final String mAdditionalIncomeSource;
    private final String mAdditionalWorkNature;
    private final BirthPlace mBirthPlace;
    private final File mCustomerPhoto;
    private final String mDateOfBirth;
    private final String mEmploymentDetail;
    private final String mFirstName;
    private final File mGovernmentIdImage;
    private final String mGovernmentIdUrl;
    private final GovernmentIdentification mGovernmentIdentification;
    private final String mIncomeSource;
    private final String mLastName;
    private final String mMiddleName;
    private final String mMobileNumber;
    private final String mNationalityCode;
    private final Address mPermanentAddress;
    private final Address mPresentAddress;
    private final String mReferenceId;
    private final String mSocialSecurityOrGsis;
    private final String mTin;
    private final String mWorkNature;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UpgradePlus$Builder */
    public static class Builder extends UpgradePlus.Builder {
        private Boolean isPermanentSameWithPresentAddress;
        private Boolean isSocialSecurity;
        private String mAdditionalIncomeSource;
        private String mAdditionalWorkNature;
        private BirthPlace mBirthPlace;
        private File mCustomerPhoto;
        private String mDateOfBirth;
        private String mEmploymentDetail;
        private String mFirstName;
        private File mGovernmentIdImage;
        private String mGovernmentIdUrl;
        private GovernmentIdentification mGovernmentIdentification;
        private String mIncomeSource;
        private String mLastName;
        private String mMiddleName;
        private String mMobileNumber;
        private String mNationalityCode;
        private Address mPermanentAddress;
        private Address mPresentAddress;
        private String mReferenceId;
        private String mSocialSecurityOrGsis;
        private String mTin;
        private String mWorkNature;

        public /* synthetic */ Builder(UpgradePlus upgradePlus, int i) {
            this(upgradePlus);
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus build() {
            String strI = this.mFirstName == null ? " mFirstName" : "";
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (this.mReferenceId == null) {
                strI = s.i(strI, " mReferenceId");
            }
            if (this.isSocialSecurity == null) {
                strI = s.i(strI, " isSocialSecurity");
            }
            if (this.isPermanentSameWithPresentAddress == null) {
                strI = s.i(strI, " isPermanentSameWithPresentAddress");
            }
            if (strI.isEmpty()) {
                return new AutoValue_UpgradePlus(this.mMobileNumber, this.mFirstName, this.mMiddleName, this.mLastName, this.mDateOfBirth, this.mBirthPlace, this.mNationalityCode, this.mPresentAddress, this.mPermanentAddress, this.mSocialSecurityOrGsis, this.mTin, this.mIncomeSource, this.mWorkNature, this.mAdditionalIncomeSource, this.mAdditionalWorkNature, this.mEmploymentDetail, this.mGovernmentIdentification, this.mGovernmentIdUrl, this.mReferenceId, this.mGovernmentIdImage, this.mCustomerPhoto, this.isSocialSecurity.booleanValue(), this.isPermanentSameWithPresentAddress.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder isPermanentSameWithPresentAddress(boolean z4) {
            this.isPermanentSameWithPresentAddress = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder isSocialSecurity(boolean z4) {
            this.isSocialSecurity = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mAdditionalIncomeSource(@Nullable String str) {
            this.mAdditionalIncomeSource = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mAdditionalWorkNature(@Nullable String str) {
            this.mAdditionalWorkNature = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mBirthPlace(@Nullable BirthPlace birthPlace) {
            this.mBirthPlace = birthPlace;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mCustomerPhoto(@Nullable File file) {
            this.mCustomerPhoto = file;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mDateOfBirth(@Nullable String str) {
            this.mDateOfBirth = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mEmploymentDetail(@Nullable String str) {
            this.mEmploymentDetail = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mGovernmentIdImage(@Nullable File file) {
            this.mGovernmentIdImage = file;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mGovernmentIdUrl(@Nullable String str) {
            this.mGovernmentIdUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mGovernmentIdentification(@Nullable GovernmentIdentification governmentIdentification) {
            this.mGovernmentIdentification = governmentIdentification;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mIncomeSource(@Nullable String str) {
            this.mIncomeSource = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mMiddleName(@Nullable String str) {
            this.mMiddleName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mMobileNumber(@Nullable String str) {
            this.mMobileNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mNationalityCode(@Nullable String str) {
            this.mNationalityCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mPermanentAddress(@Nullable Address address) {
            this.mPermanentAddress = address;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mPresentAddress(@Nullable Address address) {
            this.mPresentAddress = address;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mReferenceId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mReferenceId");
            }
            this.mReferenceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mSocialSecurityOrGsis(@Nullable String str) {
            this.mSocialSecurityOrGsis = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mTin(@Nullable String str) {
            this.mTin = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UpgradePlus.Builder
        public UpgradePlus.Builder mWorkNature(@Nullable String str) {
            this.mWorkNature = str;
            return this;
        }

        public Builder() {
        }

        private Builder(UpgradePlus upgradePlus) {
            this.mMobileNumber = upgradePlus.mMobileNumber();
            this.mFirstName = upgradePlus.mFirstName();
            this.mMiddleName = upgradePlus.mMiddleName();
            this.mLastName = upgradePlus.mLastName();
            this.mDateOfBirth = upgradePlus.mDateOfBirth();
            this.mBirthPlace = upgradePlus.mBirthPlace();
            this.mNationalityCode = upgradePlus.mNationalityCode();
            this.mPresentAddress = upgradePlus.mPresentAddress();
            this.mPermanentAddress = upgradePlus.mPermanentAddress();
            this.mSocialSecurityOrGsis = upgradePlus.mSocialSecurityOrGsis();
            this.mTin = upgradePlus.mTin();
            this.mIncomeSource = upgradePlus.mIncomeSource();
            this.mWorkNature = upgradePlus.mWorkNature();
            this.mAdditionalIncomeSource = upgradePlus.mAdditionalIncomeSource();
            this.mAdditionalWorkNature = upgradePlus.mAdditionalWorkNature();
            this.mEmploymentDetail = upgradePlus.mEmploymentDetail();
            this.mGovernmentIdentification = upgradePlus.mGovernmentIdentification();
            this.mGovernmentIdUrl = upgradePlus.mGovernmentIdUrl();
            this.mReferenceId = upgradePlus.mReferenceId();
            this.mGovernmentIdImage = upgradePlus.mGovernmentIdImage();
            this.mCustomerPhoto = upgradePlus.mCustomerPhoto();
            this.isSocialSecurity = Boolean.valueOf(upgradePlus.isSocialSecurity());
            this.isPermanentSameWithPresentAddress = Boolean.valueOf(upgradePlus.isPermanentSameWithPresentAddress());
        }
    }

    public C$$AutoValue_UpgradePlus(@Nullable String str, String str2, @Nullable String str3, String str4, @Nullable String str5, @Nullable BirthPlace birthPlace, @Nullable String str6, @Nullable Address address, @Nullable Address address2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable GovernmentIdentification governmentIdentification, @Nullable String str14, String str15, @Nullable File file, @Nullable File file2, boolean z4, boolean z5) {
        this.mMobileNumber = str;
        if (str2 == null) {
            throw new NullPointerException("Null mFirstName");
        }
        this.mFirstName = str2;
        this.mMiddleName = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mLastName");
        }
        this.mLastName = str4;
        this.mDateOfBirth = str5;
        this.mBirthPlace = birthPlace;
        this.mNationalityCode = str6;
        this.mPresentAddress = address;
        this.mPermanentAddress = address2;
        this.mSocialSecurityOrGsis = str7;
        this.mTin = str8;
        this.mIncomeSource = str9;
        this.mWorkNature = str10;
        this.mAdditionalIncomeSource = str11;
        this.mAdditionalWorkNature = str12;
        this.mEmploymentDetail = str13;
        this.mGovernmentIdentification = governmentIdentification;
        this.mGovernmentIdUrl = str14;
        if (str15 == null) {
            throw new NullPointerException("Null mReferenceId");
        }
        this.mReferenceId = str15;
        this.mGovernmentIdImage = file;
        this.mCustomerPhoto = file2;
        this.isSocialSecurity = z4;
        this.isPermanentSameWithPresentAddress = z5;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        BirthPlace birthPlace;
        String str3;
        Address address;
        Address address2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        GovernmentIdentification governmentIdentification;
        String str11;
        File file;
        File file2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpgradePlus) {
            UpgradePlus upgradePlus = (UpgradePlus) obj;
            String str12 = this.mMobileNumber;
            if (str12 != null ? str12.equals(upgradePlus.mMobileNumber()) : upgradePlus.mMobileNumber() == null) {
                if (this.mFirstName.equals(upgradePlus.mFirstName()) && ((str = this.mMiddleName) != null ? str.equals(upgradePlus.mMiddleName()) : upgradePlus.mMiddleName() == null) && this.mLastName.equals(upgradePlus.mLastName()) && ((str2 = this.mDateOfBirth) != null ? str2.equals(upgradePlus.mDateOfBirth()) : upgradePlus.mDateOfBirth() == null) && ((birthPlace = this.mBirthPlace) != null ? birthPlace.equals(upgradePlus.mBirthPlace()) : upgradePlus.mBirthPlace() == null) && ((str3 = this.mNationalityCode) != null ? str3.equals(upgradePlus.mNationalityCode()) : upgradePlus.mNationalityCode() == null) && ((address = this.mPresentAddress) != null ? address.equals(upgradePlus.mPresentAddress()) : upgradePlus.mPresentAddress() == null) && ((address2 = this.mPermanentAddress) != null ? address2.equals(upgradePlus.mPermanentAddress()) : upgradePlus.mPermanentAddress() == null) && ((str4 = this.mSocialSecurityOrGsis) != null ? str4.equals(upgradePlus.mSocialSecurityOrGsis()) : upgradePlus.mSocialSecurityOrGsis() == null) && ((str5 = this.mTin) != null ? str5.equals(upgradePlus.mTin()) : upgradePlus.mTin() == null) && ((str6 = this.mIncomeSource) != null ? str6.equals(upgradePlus.mIncomeSource()) : upgradePlus.mIncomeSource() == null) && ((str7 = this.mWorkNature) != null ? str7.equals(upgradePlus.mWorkNature()) : upgradePlus.mWorkNature() == null) && ((str8 = this.mAdditionalIncomeSource) != null ? str8.equals(upgradePlus.mAdditionalIncomeSource()) : upgradePlus.mAdditionalIncomeSource() == null) && ((str9 = this.mAdditionalWorkNature) != null ? str9.equals(upgradePlus.mAdditionalWorkNature()) : upgradePlus.mAdditionalWorkNature() == null) && ((str10 = this.mEmploymentDetail) != null ? str10.equals(upgradePlus.mEmploymentDetail()) : upgradePlus.mEmploymentDetail() == null) && ((governmentIdentification = this.mGovernmentIdentification) != null ? governmentIdentification.equals(upgradePlus.mGovernmentIdentification()) : upgradePlus.mGovernmentIdentification() == null) && ((str11 = this.mGovernmentIdUrl) != null ? str11.equals(upgradePlus.mGovernmentIdUrl()) : upgradePlus.mGovernmentIdUrl() == null) && this.mReferenceId.equals(upgradePlus.mReferenceId()) && ((file = this.mGovernmentIdImage) != null ? file.equals(upgradePlus.mGovernmentIdImage()) : upgradePlus.mGovernmentIdImage() == null) && ((file2 = this.mCustomerPhoto) != null ? file2.equals(upgradePlus.mCustomerPhoto()) : upgradePlus.mCustomerPhoto() == null) && this.isSocialSecurity == upgradePlus.isSocialSecurity() && this.isPermanentSameWithPresentAddress == upgradePlus.isPermanentSameWithPresentAddress()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mMobileNumber;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mFirstName.hashCode()) * 1000003;
        String str2 = this.mMiddleName;
        int iHashCode2 = (((iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.mLastName.hashCode()) * 1000003;
        String str3 = this.mDateOfBirth;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        BirthPlace birthPlace = this.mBirthPlace;
        int iHashCode4 = (iHashCode3 ^ (birthPlace == null ? 0 : birthPlace.hashCode())) * 1000003;
        String str4 = this.mNationalityCode;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Address address = this.mPresentAddress;
        int iHashCode6 = (iHashCode5 ^ (address == null ? 0 : address.hashCode())) * 1000003;
        Address address2 = this.mPermanentAddress;
        int iHashCode7 = (iHashCode6 ^ (address2 == null ? 0 : address2.hashCode())) * 1000003;
        String str5 = this.mSocialSecurityOrGsis;
        int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.mTin;
        int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.mIncomeSource;
        int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.mWorkNature;
        int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.mAdditionalIncomeSource;
        int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mAdditionalWorkNature;
        int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.mEmploymentDetail;
        int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        GovernmentIdentification governmentIdentification = this.mGovernmentIdentification;
        int iHashCode15 = (iHashCode14 ^ (governmentIdentification == null ? 0 : governmentIdentification.hashCode())) * 1000003;
        String str12 = this.mGovernmentIdUrl;
        int iHashCode16 = (((iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003) ^ this.mReferenceId.hashCode()) * 1000003;
        File file = this.mGovernmentIdImage;
        int iHashCode17 = (iHashCode16 ^ (file == null ? 0 : file.hashCode())) * 1000003;
        File file2 = this.mCustomerPhoto;
        return ((((iHashCode17 ^ (file2 != null ? file2.hashCode() : 0)) * 1000003) ^ (this.isSocialSecurity ? 1231 : 1237)) * 1000003) ^ (this.isPermanentSameWithPresentAddress ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    public boolean isPermanentSameWithPresentAddress() {
        return this.isPermanentSameWithPresentAddress;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    public boolean isSocialSecurity() {
        return this.isSocialSecurity;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    public String mAdditionalIncomeSource() {
        return this.mAdditionalIncomeSource;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    public String mAdditionalWorkNature() {
        return this.mAdditionalWorkNature;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("birth_place")
    public BirthPlace mBirthPlace() {
        return this.mBirthPlace;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    public File mCustomerPhoto() {
        return this.mCustomerPhoto;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("birth_date")
    public String mDateOfBirth() {
        return this.mDateOfBirth;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("employment_detail")
    public String mEmploymentDetail() {
        return this.mEmploymentDetail;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    public File mGovernmentIdImage() {
        return this.mGovernmentIdImage;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("government_id_url")
    public String mGovernmentIdUrl() {
        return this.mGovernmentIdUrl;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("government_id")
    public GovernmentIdentification mGovernmentIdentification() {
        return this.mGovernmentIdentification;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("income_source")
    public String mIncomeSource() {
        return this.mIncomeSource;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("middle_name")
    public String mMiddleName() {
        return this.mMiddleName;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("msisdn")
    public String mMobileNumber() {
        return this.mMobileNumber;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("nationality")
    public String mNationalityCode() {
        return this.mNationalityCode;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("permanent_address")
    public Address mPermanentAddress() {
        return this.mPermanentAddress;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("present_address")
    public Address mPresentAddress() {
        return this.mPresentAddress;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @InterfaceC1498b("reference_id")
    public String mReferenceId() {
        return this.mReferenceId;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("social_security")
    public String mSocialSecurityOrGsis() {
        return this.mSocialSecurityOrGsis;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("tin")
    public String mTin() {
        return this.mTin;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    @Nullable
    @InterfaceC1498b("work_nature")
    public String mWorkNature() {
        return this.mWorkNature;
    }

    @Override // com.paymaya.domain.model.UpgradePlus
    public UpgradePlus.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpgradePlus{mMobileNumber=");
        sb2.append(this.mMobileNumber);
        sb2.append(", mFirstName=");
        sb2.append(this.mFirstName);
        sb2.append(", mMiddleName=");
        sb2.append(this.mMiddleName);
        sb2.append(", mLastName=");
        sb2.append(this.mLastName);
        sb2.append(", mDateOfBirth=");
        sb2.append(this.mDateOfBirth);
        sb2.append(", mBirthPlace=");
        sb2.append(this.mBirthPlace);
        sb2.append(", mNationalityCode=");
        sb2.append(this.mNationalityCode);
        sb2.append(", mPresentAddress=");
        sb2.append(this.mPresentAddress);
        sb2.append(", mPermanentAddress=");
        sb2.append(this.mPermanentAddress);
        sb2.append(", mSocialSecurityOrGsis=");
        sb2.append(this.mSocialSecurityOrGsis);
        sb2.append(", mTin=");
        sb2.append(this.mTin);
        sb2.append(", mIncomeSource=");
        sb2.append(this.mIncomeSource);
        sb2.append(", mWorkNature=");
        sb2.append(this.mWorkNature);
        sb2.append(", mAdditionalIncomeSource=");
        sb2.append(this.mAdditionalIncomeSource);
        sb2.append(", mAdditionalWorkNature=");
        sb2.append(this.mAdditionalWorkNature);
        sb2.append(", mEmploymentDetail=");
        sb2.append(this.mEmploymentDetail);
        sb2.append(", mGovernmentIdentification=");
        sb2.append(this.mGovernmentIdentification);
        sb2.append(", mGovernmentIdUrl=");
        sb2.append(this.mGovernmentIdUrl);
        sb2.append(", mReferenceId=");
        sb2.append(this.mReferenceId);
        sb2.append(", mGovernmentIdImage=");
        sb2.append(this.mGovernmentIdImage);
        sb2.append(", mCustomerPhoto=");
        sb2.append(this.mCustomerPhoto);
        sb2.append(", isSocialSecurity=");
        sb2.append(this.isSocialSecurity);
        sb2.append(", isPermanentSameWithPresentAddress=");
        return s.s(sb2, this.isPermanentSameWithPresentAddress, "}");
    }
}
