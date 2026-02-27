package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Ekyc;
import g3.InterfaceC1498b;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Ekyc, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Ekyc extends Ekyc {
    private final boolean isPermanentSameWithPresentAddress;
    private final boolean isSocialSecurity;
    private final List<EkycAdditionalDocument> mAdditionalDocuments;
    private final BirthPlace mBirthPlace;
    private final String mDateOfBirth;
    private final EDD mEDDInformation;
    private final String mEmploymentDetail;
    private final String mFirstName;
    private final File mGovernmentIdImage;
    private final String mGovernmentIdUrl;
    private final GovernmentIdentification mGovernmentIdentification;
    private final List<EkycIdentification> mIdList;
    private final String mIncomeSource;
    private final String mLastName;
    private final File mLiveDataFile;
    private final String mLiveDataUrl;
    private final File mLivenessVideoFile;
    private final String mLivenessVideoUrl;
    private final String mMiddleName;
    private final String mMsisdn;
    private final String mNationalityCode;
    private final String mOcrId;
    private final Address mPermanentAddress;
    private final Address mPresentAddress;
    private final String mReferenceId;
    private final String mSocialSecurityOrGsis;
    private final String mStatus;
    private final String mSubmissionType;
    private final String mTin;
    private final String mUserType;
    private final String mWorkNature;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Ekyc$Builder */
    public static class Builder extends Ekyc.Builder {
        private Boolean isPermanentSameWithPresentAddress;
        private Boolean isSocialSecurity;
        private List<EkycAdditionalDocument> mAdditionalDocuments;
        private BirthPlace mBirthPlace;
        private String mDateOfBirth;
        private EDD mEDDInformation;
        private String mEmploymentDetail;
        private String mFirstName;
        private File mGovernmentIdImage;
        private String mGovernmentIdUrl;
        private GovernmentIdentification mGovernmentIdentification;
        private List<EkycIdentification> mIdList;
        private String mIncomeSource;
        private String mLastName;
        private File mLiveDataFile;
        private String mLiveDataUrl;
        private File mLivenessVideoFile;
        private String mLivenessVideoUrl;
        private String mMiddleName;
        private String mMsisdn;
        private String mNationalityCode;
        private String mOcrId;
        private Address mPermanentAddress;
        private Address mPresentAddress;
        private String mReferenceId;
        private String mSocialSecurityOrGsis;
        private String mStatus;
        private String mSubmissionType;
        private String mTin;
        private String mUserType;
        private String mWorkNature;

        public /* synthetic */ Builder(Ekyc ekyc, int i) {
            this(ekyc);
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc build() {
            String strI = this.mMsisdn == null ? " mMsisdn" : "";
            if (this.mFirstName == null) {
                strI = s.i(strI, " mFirstName");
            }
            if (this.mLastName == null) {
                strI = s.i(strI, " mLastName");
            }
            if (this.isSocialSecurity == null) {
                strI = s.i(strI, " isSocialSecurity");
            }
            if (this.isPermanentSameWithPresentAddress == null) {
                strI = s.i(strI, " isPermanentSameWithPresentAddress");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Ekyc(this.mMsisdn, this.mFirstName, this.mMiddleName, this.mLastName, this.mDateOfBirth, this.mBirthPlace, this.mNationalityCode, this.mIncomeSource, this.mWorkNature, this.mPresentAddress, this.mPermanentAddress, this.mLivenessVideoUrl, this.mLiveDataUrl, this.mIdList, this.mAdditionalDocuments, this.mStatus, this.mLivenessVideoFile, this.mLiveDataFile, this.mOcrId, this.mSubmissionType, this.mEDDInformation, this.mSocialSecurityOrGsis, this.mTin, this.mEmploymentDetail, this.mGovernmentIdentification, this.mGovernmentIdUrl, this.mReferenceId, this.mUserType, this.mGovernmentIdImage, this.isSocialSecurity.booleanValue(), this.isPermanentSameWithPresentAddress.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder isPermanentSameWithPresentAddress(boolean z4) {
            this.isPermanentSameWithPresentAddress = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder isSocialSecurity(boolean z4) {
            this.isSocialSecurity = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mAdditionalDocuments(@Nullable List<EkycAdditionalDocument> list) {
            this.mAdditionalDocuments = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mBirthPlace(@Nullable BirthPlace birthPlace) {
            this.mBirthPlace = birthPlace;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mDateOfBirth(@Nullable String str) {
            this.mDateOfBirth = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mEDDInformation(@Nullable EDD edd) {
            this.mEDDInformation = edd;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mEmploymentDetail(@Nullable String str) {
            this.mEmploymentDetail = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mFirstName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mFirstName");
            }
            this.mFirstName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mGovernmentIdImage(@Nullable File file) {
            this.mGovernmentIdImage = file;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mGovernmentIdUrl(@Nullable String str) {
            this.mGovernmentIdUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mGovernmentIdentification(@Nullable GovernmentIdentification governmentIdentification) {
            this.mGovernmentIdentification = governmentIdentification;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mIdList(@Nullable List<EkycIdentification> list) {
            this.mIdList = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mIncomeSource(@Nullable String str) {
            this.mIncomeSource = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mLastName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mLastName");
            }
            this.mLastName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mLiveDataFile(@Nullable File file) {
            this.mLiveDataFile = file;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mLiveDataUrl(@Nullable String str) {
            this.mLiveDataUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mLivenessVideoFile(@Nullable File file) {
            this.mLivenessVideoFile = file;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mLivenessVideoUrl(@Nullable String str) {
            this.mLivenessVideoUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mMiddleName(@Nullable String str) {
            this.mMiddleName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mMsisdn(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMsisdn");
            }
            this.mMsisdn = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mNationalityCode(@Nullable String str) {
            this.mNationalityCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mOcrId(@Nullable String str) {
            this.mOcrId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mPermanentAddress(@Nullable Address address) {
            this.mPermanentAddress = address;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mPresentAddress(@Nullable Address address) {
            this.mPresentAddress = address;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mReferenceId(String str) {
            this.mReferenceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mSocialSecurityOrGsis(@Nullable String str) {
            this.mSocialSecurityOrGsis = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mStatus(@Nullable String str) {
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mSubmissionType(@Nullable String str) {
            this.mSubmissionType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mTin(@Nullable String str) {
            this.mTin = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mUserType(@Nullable String str) {
            this.mUserType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Ekyc.Builder
        public Ekyc.Builder mWorkNature(@Nullable String str) {
            this.mWorkNature = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Ekyc ekyc) {
            this.mMsisdn = ekyc.mMsisdn();
            this.mFirstName = ekyc.mFirstName();
            this.mMiddleName = ekyc.mMiddleName();
            this.mLastName = ekyc.mLastName();
            this.mDateOfBirth = ekyc.mDateOfBirth();
            this.mBirthPlace = ekyc.mBirthPlace();
            this.mNationalityCode = ekyc.mNationalityCode();
            this.mIncomeSource = ekyc.mIncomeSource();
            this.mWorkNature = ekyc.mWorkNature();
            this.mPresentAddress = ekyc.mPresentAddress();
            this.mPermanentAddress = ekyc.mPermanentAddress();
            this.mLivenessVideoUrl = ekyc.mLivenessVideoUrl();
            this.mLiveDataUrl = ekyc.mLiveDataUrl();
            this.mIdList = ekyc.mIdList();
            this.mAdditionalDocuments = ekyc.mAdditionalDocuments();
            this.mStatus = ekyc.mStatus();
            this.mLivenessVideoFile = ekyc.mLivenessVideoFile();
            this.mLiveDataFile = ekyc.mLiveDataFile();
            this.mOcrId = ekyc.mOcrId();
            this.mSubmissionType = ekyc.mSubmissionType();
            this.mEDDInformation = ekyc.mEDDInformation();
            this.mSocialSecurityOrGsis = ekyc.mSocialSecurityOrGsis();
            this.mTin = ekyc.mTin();
            this.mEmploymentDetail = ekyc.mEmploymentDetail();
            this.mGovernmentIdentification = ekyc.mGovernmentIdentification();
            this.mGovernmentIdUrl = ekyc.mGovernmentIdUrl();
            this.mReferenceId = ekyc.mReferenceId();
            this.mUserType = ekyc.mUserType();
            this.mGovernmentIdImage = ekyc.mGovernmentIdImage();
            this.isSocialSecurity = Boolean.valueOf(ekyc.isSocialSecurity());
            this.isPermanentSameWithPresentAddress = Boolean.valueOf(ekyc.isPermanentSameWithPresentAddress());
        }
    }

    public C$$AutoValue_Ekyc(String str, String str2, @Nullable String str3, String str4, @Nullable String str5, @Nullable BirthPlace birthPlace, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Address address, @Nullable Address address2, @Nullable String str9, @Nullable String str10, @Nullable List<EkycIdentification> list, @Nullable List<EkycAdditionalDocument> list2, @Nullable String str11, @Nullable File file, @Nullable File file2, @Nullable String str12, @Nullable String str13, @Nullable EDD edd, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable GovernmentIdentification governmentIdentification, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable File file3, boolean z4, boolean z5) {
        if (str == null) {
            throw new NullPointerException("Null mMsisdn");
        }
        this.mMsisdn = str;
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
        this.mIncomeSource = str7;
        this.mWorkNature = str8;
        this.mPresentAddress = address;
        this.mPermanentAddress = address2;
        this.mLivenessVideoUrl = str9;
        this.mLiveDataUrl = str10;
        this.mIdList = list;
        this.mAdditionalDocuments = list2;
        this.mStatus = str11;
        this.mLivenessVideoFile = file;
        this.mLiveDataFile = file2;
        this.mOcrId = str12;
        this.mSubmissionType = str13;
        this.mEDDInformation = edd;
        this.mSocialSecurityOrGsis = str14;
        this.mTin = str15;
        this.mEmploymentDetail = str16;
        this.mGovernmentIdentification = governmentIdentification;
        this.mGovernmentIdUrl = str17;
        this.mReferenceId = str18;
        this.mUserType = str19;
        this.mGovernmentIdImage = file3;
        this.isSocialSecurity = z4;
        this.isPermanentSameWithPresentAddress = z5;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        BirthPlace birthPlace;
        String str3;
        String str4;
        String str5;
        Address address;
        Address address2;
        String str6;
        String str7;
        List<EkycIdentification> list;
        List<EkycAdditionalDocument> list2;
        String str8;
        File file;
        File file2;
        String str9;
        String str10;
        EDD edd;
        String str11;
        String str12;
        String str13;
        GovernmentIdentification governmentIdentification;
        String str14;
        String str15;
        String str16;
        File file3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ekyc) {
            Ekyc ekyc = (Ekyc) obj;
            if (this.mMsisdn.equals(ekyc.mMsisdn()) && this.mFirstName.equals(ekyc.mFirstName()) && ((str = this.mMiddleName) != null ? str.equals(ekyc.mMiddleName()) : ekyc.mMiddleName() == null) && this.mLastName.equals(ekyc.mLastName()) && ((str2 = this.mDateOfBirth) != null ? str2.equals(ekyc.mDateOfBirth()) : ekyc.mDateOfBirth() == null) && ((birthPlace = this.mBirthPlace) != null ? birthPlace.equals(ekyc.mBirthPlace()) : ekyc.mBirthPlace() == null) && ((str3 = this.mNationalityCode) != null ? str3.equals(ekyc.mNationalityCode()) : ekyc.mNationalityCode() == null) && ((str4 = this.mIncomeSource) != null ? str4.equals(ekyc.mIncomeSource()) : ekyc.mIncomeSource() == null) && ((str5 = this.mWorkNature) != null ? str5.equals(ekyc.mWorkNature()) : ekyc.mWorkNature() == null) && ((address = this.mPresentAddress) != null ? address.equals(ekyc.mPresentAddress()) : ekyc.mPresentAddress() == null) && ((address2 = this.mPermanentAddress) != null ? address2.equals(ekyc.mPermanentAddress()) : ekyc.mPermanentAddress() == null) && ((str6 = this.mLivenessVideoUrl) != null ? str6.equals(ekyc.mLivenessVideoUrl()) : ekyc.mLivenessVideoUrl() == null) && ((str7 = this.mLiveDataUrl) != null ? str7.equals(ekyc.mLiveDataUrl()) : ekyc.mLiveDataUrl() == null) && ((list = this.mIdList) != null ? list.equals(ekyc.mIdList()) : ekyc.mIdList() == null) && ((list2 = this.mAdditionalDocuments) != null ? list2.equals(ekyc.mAdditionalDocuments()) : ekyc.mAdditionalDocuments() == null) && ((str8 = this.mStatus) != null ? str8.equals(ekyc.mStatus()) : ekyc.mStatus() == null) && ((file = this.mLivenessVideoFile) != null ? file.equals(ekyc.mLivenessVideoFile()) : ekyc.mLivenessVideoFile() == null) && ((file2 = this.mLiveDataFile) != null ? file2.equals(ekyc.mLiveDataFile()) : ekyc.mLiveDataFile() == null) && ((str9 = this.mOcrId) != null ? str9.equals(ekyc.mOcrId()) : ekyc.mOcrId() == null) && ((str10 = this.mSubmissionType) != null ? str10.equals(ekyc.mSubmissionType()) : ekyc.mSubmissionType() == null) && ((edd = this.mEDDInformation) != null ? edd.equals(ekyc.mEDDInformation()) : ekyc.mEDDInformation() == null) && ((str11 = this.mSocialSecurityOrGsis) != null ? str11.equals(ekyc.mSocialSecurityOrGsis()) : ekyc.mSocialSecurityOrGsis() == null) && ((str12 = this.mTin) != null ? str12.equals(ekyc.mTin()) : ekyc.mTin() == null) && ((str13 = this.mEmploymentDetail) != null ? str13.equals(ekyc.mEmploymentDetail()) : ekyc.mEmploymentDetail() == null) && ((governmentIdentification = this.mGovernmentIdentification) != null ? governmentIdentification.equals(ekyc.mGovernmentIdentification()) : ekyc.mGovernmentIdentification() == null) && ((str14 = this.mGovernmentIdUrl) != null ? str14.equals(ekyc.mGovernmentIdUrl()) : ekyc.mGovernmentIdUrl() == null) && ((str15 = this.mReferenceId) != null ? str15.equals(ekyc.mReferenceId()) : ekyc.mReferenceId() == null) && ((str16 = this.mUserType) != null ? str16.equals(ekyc.mUserType()) : ekyc.mUserType() == null) && ((file3 = this.mGovernmentIdImage) != null ? file3.equals(ekyc.mGovernmentIdImage()) : ekyc.mGovernmentIdImage() == null) && this.isSocialSecurity == ekyc.isSocialSecurity() && this.isPermanentSameWithPresentAddress == ekyc.isPermanentSameWithPresentAddress()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mMsisdn.hashCode() ^ 1000003) * 1000003) ^ this.mFirstName.hashCode()) * 1000003;
        String str = this.mMiddleName;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mLastName.hashCode()) * 1000003;
        String str2 = this.mDateOfBirth;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        BirthPlace birthPlace = this.mBirthPlace;
        int iHashCode4 = (iHashCode3 ^ (birthPlace == null ? 0 : birthPlace.hashCode())) * 1000003;
        String str3 = this.mNationalityCode;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mIncomeSource;
        int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mWorkNature;
        int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Address address = this.mPresentAddress;
        int iHashCode8 = (iHashCode7 ^ (address == null ? 0 : address.hashCode())) * 1000003;
        Address address2 = this.mPermanentAddress;
        int iHashCode9 = (iHashCode8 ^ (address2 == null ? 0 : address2.hashCode())) * 1000003;
        String str6 = this.mLivenessVideoUrl;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.mLiveDataUrl;
        int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        List<EkycIdentification> list = this.mIdList;
        int iHashCode12 = (iHashCode11 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<EkycAdditionalDocument> list2 = this.mAdditionalDocuments;
        int iHashCode13 = (iHashCode12 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str8 = this.mStatus;
        int iHashCode14 = (iHashCode13 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        File file = this.mLivenessVideoFile;
        int iHashCode15 = (iHashCode14 ^ (file == null ? 0 : file.hashCode())) * 1000003;
        File file2 = this.mLiveDataFile;
        int iHashCode16 = (iHashCode15 ^ (file2 == null ? 0 : file2.hashCode())) * 1000003;
        String str9 = this.mOcrId;
        int iHashCode17 = (iHashCode16 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mSubmissionType;
        int iHashCode18 = (iHashCode17 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        EDD edd = this.mEDDInformation;
        int iHashCode19 = (iHashCode18 ^ (edd == null ? 0 : edd.hashCode())) * 1000003;
        String str11 = this.mSocialSecurityOrGsis;
        int iHashCode20 = (iHashCode19 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.mTin;
        int iHashCode21 = (iHashCode20 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.mEmploymentDetail;
        int iHashCode22 = (iHashCode21 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        GovernmentIdentification governmentIdentification = this.mGovernmentIdentification;
        int iHashCode23 = (iHashCode22 ^ (governmentIdentification == null ? 0 : governmentIdentification.hashCode())) * 1000003;
        String str14 = this.mGovernmentIdUrl;
        int iHashCode24 = (iHashCode23 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.mReferenceId;
        int iHashCode25 = (iHashCode24 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.mUserType;
        int iHashCode26 = (iHashCode25 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        File file3 = this.mGovernmentIdImage;
        return ((((iHashCode26 ^ (file3 != null ? file3.hashCode() : 0)) * 1000003) ^ (this.isSocialSecurity ? 1231 : 1237)) * 1000003) ^ (this.isPermanentSameWithPresentAddress ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.Ekyc
    public boolean isPermanentSameWithPresentAddress() {
        return this.isPermanentSameWithPresentAddress;
    }

    @Override // com.paymaya.domain.model.Ekyc
    public boolean isSocialSecurity() {
        return this.isSocialSecurity;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("additional_docs")
    public List<EkycAdditionalDocument> mAdditionalDocuments() {
        return this.mAdditionalDocuments;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("birth_place")
    public BirthPlace mBirthPlace() {
        return this.mBirthPlace;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("birth_date")
    public String mDateOfBirth() {
        return this.mDateOfBirth;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("edd_information")
    public EDD mEDDInformation() {
        return this.mEDDInformation;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("employment_detail")
    public String mEmploymentDetail() {
        return this.mEmploymentDetail;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @InterfaceC1498b("first_name")
    public String mFirstName() {
        return this.mFirstName;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    public File mGovernmentIdImage() {
        return this.mGovernmentIdImage;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("government_id_url")
    public String mGovernmentIdUrl() {
        return this.mGovernmentIdUrl;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("government_id")
    public GovernmentIdentification mGovernmentIdentification() {
        return this.mGovernmentIdentification;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("ids")
    public List<EkycIdentification> mIdList() {
        return this.mIdList;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("income_source")
    public String mIncomeSource() {
        return this.mIncomeSource;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @InterfaceC1498b("last_name")
    public String mLastName() {
        return this.mLastName;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    public File mLiveDataFile() {
        return this.mLiveDataFile;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("live_data_url")
    public String mLiveDataUrl() {
        return this.mLiveDataUrl;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    public File mLivenessVideoFile() {
        return this.mLivenessVideoFile;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("liveness_video_url")
    public String mLivenessVideoUrl() {
        return this.mLivenessVideoUrl;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("middle_name")
    public String mMiddleName() {
        return this.mMiddleName;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @InterfaceC1498b("msisdn")
    public String mMsisdn() {
        return this.mMsisdn;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("nationality")
    public String mNationalityCode() {
        return this.mNationalityCode;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    public String mOcrId() {
        return this.mOcrId;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("permanent_address")
    public Address mPermanentAddress() {
        return this.mPermanentAddress;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("present_address")
    public Address mPresentAddress() {
        return this.mPresentAddress;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("reference_id")
    public String mReferenceId() {
        return this.mReferenceId;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("social_security")
    public String mSocialSecurityOrGsis() {
        return this.mSocialSecurityOrGsis;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("submission_type")
    public String mSubmissionType() {
        return this.mSubmissionType;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("tin")
    public String mTin() {
        return this.mTin;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    public String mUserType() {
        return this.mUserType;
    }

    @Override // com.paymaya.domain.model.Ekyc
    @Nullable
    @InterfaceC1498b("work_nature")
    public String mWorkNature() {
        return this.mWorkNature;
    }

    @Override // com.paymaya.domain.model.Ekyc
    public Ekyc.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ekyc{mMsisdn=");
        sb2.append(this.mMsisdn);
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
        sb2.append(", mIncomeSource=");
        sb2.append(this.mIncomeSource);
        sb2.append(", mWorkNature=");
        sb2.append(this.mWorkNature);
        sb2.append(", mPresentAddress=");
        sb2.append(this.mPresentAddress);
        sb2.append(", mPermanentAddress=");
        sb2.append(this.mPermanentAddress);
        sb2.append(", mLivenessVideoUrl=");
        sb2.append(this.mLivenessVideoUrl);
        sb2.append(", mLiveDataUrl=");
        sb2.append(this.mLiveDataUrl);
        sb2.append(", mIdList=");
        sb2.append(this.mIdList);
        sb2.append(", mAdditionalDocuments=");
        sb2.append(this.mAdditionalDocuments);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mLivenessVideoFile=");
        sb2.append(this.mLivenessVideoFile);
        sb2.append(", mLiveDataFile=");
        sb2.append(this.mLiveDataFile);
        sb2.append(", mOcrId=");
        sb2.append(this.mOcrId);
        sb2.append(", mSubmissionType=");
        sb2.append(this.mSubmissionType);
        sb2.append(", mEDDInformation=");
        sb2.append(this.mEDDInformation);
        sb2.append(", mSocialSecurityOrGsis=");
        sb2.append(this.mSocialSecurityOrGsis);
        sb2.append(", mTin=");
        sb2.append(this.mTin);
        sb2.append(", mEmploymentDetail=");
        sb2.append(this.mEmploymentDetail);
        sb2.append(", mGovernmentIdentification=");
        sb2.append(this.mGovernmentIdentification);
        sb2.append(", mGovernmentIdUrl=");
        sb2.append(this.mGovernmentIdUrl);
        sb2.append(", mReferenceId=");
        sb2.append(this.mReferenceId);
        sb2.append(", mUserType=");
        sb2.append(this.mUserType);
        sb2.append(", mGovernmentIdImage=");
        sb2.append(this.mGovernmentIdImage);
        sb2.append(", isSocialSecurity=");
        sb2.append(this.isSocialSecurity);
        sb2.append(", isPermanentSameWithPresentAddress=");
        return s.s(sb2, this.isPermanentSameWithPresentAddress, "}");
    }
}
