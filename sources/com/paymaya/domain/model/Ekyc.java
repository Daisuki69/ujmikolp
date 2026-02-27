package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_Ekyc;
import com.paymaya.domain.model.C$AutoValue_Ekyc;
import g3.InterfaceC1498b;
import java.io.File;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ekyc implements Parcelable {

    public static abstract class Builder {
        public abstract Ekyc build();

        public abstract Builder isPermanentSameWithPresentAddress(boolean z4);

        public abstract Builder isSocialSecurity(boolean z4);

        public abstract Builder mAdditionalDocuments(@Nullable List<EkycAdditionalDocument> list);

        public abstract Builder mBirthPlace(@Nullable BirthPlace birthPlace);

        public abstract Builder mDateOfBirth(@Nullable String str);

        public abstract Builder mEDDInformation(@Nullable EDD edd);

        public abstract Builder mEmploymentDetail(@Nullable String str);

        public abstract Builder mFirstName(String str);

        public abstract Builder mGovernmentIdImage(@Nullable File file);

        public abstract Builder mGovernmentIdUrl(@Nullable String str);

        public abstract Builder mGovernmentIdentification(@Nullable GovernmentIdentification governmentIdentification);

        public abstract Builder mIdList(@Nullable List<EkycIdentification> list);

        public abstract Builder mIncomeSource(@Nullable String str);

        public abstract Builder mLastName(String str);

        public abstract Builder mLiveDataFile(@Nullable File file);

        public abstract Builder mLiveDataUrl(@Nullable String str);

        public abstract Builder mLivenessVideoFile(@Nullable File file);

        public abstract Builder mLivenessVideoUrl(@Nullable String str);

        public abstract Builder mMiddleName(@Nullable String str);

        public abstract Builder mMsisdn(String str);

        public abstract Builder mNationalityCode(@Nullable String str);

        public abstract Builder mOcrId(@Nullable String str);

        public abstract Builder mPermanentAddress(@Nullable Address address);

        public abstract Builder mPresentAddress(@Nullable Address address);

        public abstract Builder mReferenceId(String str);

        public abstract Builder mSocialSecurityOrGsis(@Nullable String str);

        public abstract Builder mStatus(@Nullable String str);

        public abstract Builder mSubmissionType(@Nullable String str);

        public abstract Builder mTin(@Nullable String str);

        public abstract Builder mUserType(@Nullable String str);

        public abstract Builder mWorkNature(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Ekyc.Builder().mMsisdn("").mFirstName("").mMiddleName(null).mLastName("").mDateOfBirth(null).mBirthPlace(null).mNationalityCode(null).mIncomeSource(null).mWorkNature(null).mPresentAddress(null).mPermanentAddress(null).mLivenessVideoUrl(null).mLiveDataUrl(null).mLiveDataFile(null).mIdList(null).mAdditionalDocuments(null).mStatus(null).mLivenessVideoFile(null).mOcrId(null).mSubmissionType(null).mSocialSecurityOrGsis(null).mTin(null).mEmploymentDetail(null).mGovernmentIdentification(null).mGovernmentIdUrl(null).mReferenceId(null).mGovernmentIdImage(null).isSocialSecurity(false).isPermanentSameWithPresentAddress(true).mEDDInformation(null).mUserType(null);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Ekyc.GsonTypeAdapter(jVar);
    }

    public String getAccountType() {
        if (isLegalAged() && isFilipino()) {
            return "type1";
        }
        if (!isLegalAged() && isFilipino()) {
            return "type2";
        }
        if (isLegalAged() && !isFilipino()) {
            return "type3";
        }
        if (isLegalAged() || isFilipino()) {
            return null;
        }
        return "type4";
    }

    public String getFullName() {
        if (C.e(mMiddleName())) {
            return a.j(mFirstName(), Global.BLANK, mLastName());
        }
        return mFirstName() + Global.BLANK + mMiddleName() + Global.BLANK + mLastName();
    }

    public boolean isFilipino() {
        return "PH".equalsIgnoreCase(mNationalityCode());
    }

    public boolean isLegalAged() {
        LocalDate localDate = LocalDateTime.parse(mDateOfBirth(), AbstractC1234x.f11252k).toLocalDate();
        LocalDate localDateMinusYears = LocalDate.now().minusYears(18);
        return localDate.isBefore(localDateMinusYears) || localDate.isEqual(localDateMinusYears);
    }

    public boolean isNewEkycFlow() {
        return mSubmissionType() != null;
    }

    public abstract boolean isPermanentSameWithPresentAddress();

    public abstract boolean isSocialSecurity();

    @Nullable
    @InterfaceC1498b("additional_docs")
    public abstract List<EkycAdditionalDocument> mAdditionalDocuments();

    @Nullable
    @InterfaceC1498b("birth_place")
    public abstract BirthPlace mBirthPlace();

    @Nullable
    @InterfaceC1498b("birth_date")
    public abstract String mDateOfBirth();

    @Nullable
    @InterfaceC1498b("edd_information")
    public abstract EDD mEDDInformation();

    @Nullable
    @InterfaceC1498b("employment_detail")
    public abstract String mEmploymentDetail();

    @InterfaceC1498b("first_name")
    public abstract String mFirstName();

    @Nullable
    public abstract File mGovernmentIdImage();

    @Nullable
    @InterfaceC1498b("government_id_url")
    public abstract String mGovernmentIdUrl();

    @Nullable
    @InterfaceC1498b("government_id")
    public abstract GovernmentIdentification mGovernmentIdentification();

    @Nullable
    @InterfaceC1498b("ids")
    public abstract List<EkycIdentification> mIdList();

    @Nullable
    @InterfaceC1498b("income_source")
    public abstract String mIncomeSource();

    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    @Nullable
    public abstract File mLiveDataFile();

    @Nullable
    @InterfaceC1498b("live_data_url")
    public abstract String mLiveDataUrl();

    @Nullable
    public abstract File mLivenessVideoFile();

    @Nullable
    @InterfaceC1498b("liveness_video_url")
    public abstract String mLivenessVideoUrl();

    @Nullable
    @InterfaceC1498b("middle_name")
    public abstract String mMiddleName();

    @InterfaceC1498b("msisdn")
    public abstract String mMsisdn();

    @Nullable
    @InterfaceC1498b("nationality")
    public abstract String mNationalityCode();

    @Nullable
    public abstract String mOcrId();

    @Nullable
    @InterfaceC1498b("permanent_address")
    public abstract Address mPermanentAddress();

    @Nullable
    @InterfaceC1498b("present_address")
    public abstract Address mPresentAddress();

    @Nullable
    @InterfaceC1498b("reference_id")
    public abstract String mReferenceId();

    @Nullable
    @InterfaceC1498b("social_security")
    public abstract String mSocialSecurityOrGsis();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("submission_type")
    public abstract String mSubmissionType();

    @Nullable
    @InterfaceC1498b("tin")
    public abstract String mTin();

    @Nullable
    public abstract String mUserType();

    @Nullable
    @InterfaceC1498b("work_nature")
    public abstract String mWorkNature();

    public abstract Builder toBuilder();
}
