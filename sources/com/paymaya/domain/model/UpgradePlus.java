package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_UpgradePlus;
import com.paymaya.domain.model.C$AutoValue_UpgradePlus;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UpgradePlus implements Parcelable {

    public static abstract class Builder {
        public abstract UpgradePlus build();

        public abstract Builder isPermanentSameWithPresentAddress(boolean z4);

        public abstract Builder isSocialSecurity(boolean z4);

        public abstract Builder mAdditionalIncomeSource(@Nullable String str);

        public abstract Builder mAdditionalWorkNature(@Nullable String str);

        public abstract Builder mBirthPlace(@Nullable BirthPlace birthPlace);

        public abstract Builder mCustomerPhoto(@Nullable File file);

        public abstract Builder mDateOfBirth(@Nullable String str);

        public abstract Builder mEmploymentDetail(@Nullable String str);

        public abstract Builder mFirstName(String str);

        public abstract Builder mGovernmentIdImage(@Nullable File file);

        public abstract Builder mGovernmentIdUrl(@Nullable String str);

        public abstract Builder mGovernmentIdentification(@Nullable GovernmentIdentification governmentIdentification);

        public abstract Builder mIncomeSource(@Nullable String str);

        public abstract Builder mLastName(String str);

        public abstract Builder mMiddleName(@Nullable String str);

        public abstract Builder mMobileNumber(@Nullable String str);

        public abstract Builder mNationalityCode(@Nullable String str);

        public abstract Builder mPermanentAddress(@Nullable Address address);

        public abstract Builder mPresentAddress(@Nullable Address address);

        public abstract Builder mReferenceId(String str);

        public abstract Builder mSocialSecurityOrGsis(@Nullable String str);

        public abstract Builder mTin(@Nullable String str);

        public abstract Builder mWorkNature(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_UpgradePlus.Builder().mMobileNumber(null).mFirstName("").mMiddleName(null).mLastName("").mDateOfBirth("").mBirthPlace(null).mNationalityCode("").mPresentAddress(null).mPermanentAddress(null).mSocialSecurityOrGsis("").mTin("").mIncomeSource("").mWorkNature("").mAdditionalIncomeSource("").mAdditionalWorkNature("").mEmploymentDetail(null).mGovernmentIdentification(null).mGovernmentIdUrl("").mReferenceId("").mGovernmentIdImage(null).mCustomerPhoto(null).isSocialSecurity(false).isPermanentSameWithPresentAddress(true);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_UpgradePlus.GsonTypeAdapter(jVar);
    }

    public String getFullName() {
        if (C.e(mMiddleName())) {
            return a.j(mFirstName(), Global.BLANK, mLastName());
        }
        return mFirstName() + Global.BLANK + mMiddleName() + Global.BLANK + mLastName();
    }

    public abstract boolean isPermanentSameWithPresentAddress();

    public abstract boolean isSocialSecurity();

    @Nullable
    public abstract String mAdditionalIncomeSource();

    @Nullable
    public abstract String mAdditionalWorkNature();

    @Nullable
    @InterfaceC1498b("birth_place")
    public abstract BirthPlace mBirthPlace();

    @Nullable
    public abstract File mCustomerPhoto();

    @Nullable
    @InterfaceC1498b("birth_date")
    public abstract String mDateOfBirth();

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
    @InterfaceC1498b("income_source")
    public abstract String mIncomeSource();

    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    @Nullable
    @InterfaceC1498b("middle_name")
    public abstract String mMiddleName();

    @Nullable
    @InterfaceC1498b("msisdn")
    public abstract String mMobileNumber();

    @Nullable
    @InterfaceC1498b("nationality")
    public abstract String mNationalityCode();

    @Nullable
    @InterfaceC1498b("permanent_address")
    public abstract Address mPermanentAddress();

    @Nullable
    @InterfaceC1498b("present_address")
    public abstract Address mPresentAddress();

    @InterfaceC1498b("reference_id")
    public abstract String mReferenceId();

    @Nullable
    @InterfaceC1498b("social_security")
    public abstract String mSocialSecurityOrGsis();

    @Nullable
    @InterfaceC1498b("tin")
    public abstract String mTin();

    @Nullable
    @InterfaceC1498b("work_nature")
    public abstract String mWorkNature();

    public abstract Builder toBuilder();
}
