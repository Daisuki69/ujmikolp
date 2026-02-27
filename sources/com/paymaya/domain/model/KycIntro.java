package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycIntro implements Parcelable {
    public static final Parcelable.Creator<KycIntro> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data_privacy_description")
    private final String dataPrivacyDescription;

    @InterfaceC1497a
    @InterfaceC1498b("data_privacy_header")
    private final String dataPrivacyHeader;

    @InterfaceC1497a
    @InterfaceC1498b("do_it_later_btn_title")
    private final String doItLaterBtnTitle;

    @InterfaceC1497a
    @InterfaceC1498b("invite_code_description")
    private final String inviteCodeDescription;

    @InterfaceC1497a
    @InterfaceC1498b("kyc0_unlock_everything_header")
    private final String kyc0UnlockEverythingHeader;

    @InterfaceC1497a
    @InterfaceC1498b("kyc0_upgrade_intro_description")
    private final String kyc0UpgradeIntroDescription;

    @InterfaceC1497a
    @InterfaceC1498b("kyc0_upgrade_intro_header")
    private final String kyc0UpgradeIntroHeader;

    @InterfaceC1497a
    @InterfaceC1498b("kyc0_upgrade_now_header")
    private final String kyc0UpgradeNowHeader;

    @InterfaceC1497a
    @InterfaceC1498b("kyc1_unlock_everything_header")
    private final String kyc1UnlockEverythingHeader;

    @InterfaceC1497a
    @InterfaceC1498b("kyc1_upgrade_intro_description")
    private final String kyc1UpgradeIntroDescription;

    @InterfaceC1497a
    @InterfaceC1498b("kyc1_upgrade_intro_header")
    private final String kyc1UpgradeIntroHeader;

    @InterfaceC1497a
    @InterfaceC1498b("kyc1_upgrade_now_header")
    private final String kyc1UpgradeNowHeader;

    @InterfaceC1497a
    @InterfaceC1498b("new_registration_upgrade_intro_description")
    private final String newRegistrationUpgradeIntroDescription;

    @InterfaceC1497a
    @InterfaceC1498b("new_registration_upgrade_intro_header")
    private final String newRegistrationUpgradeIntroHeader;

    @InterfaceC1497a
    @InterfaceC1498b("safe_transaction_description")
    private final String safeTransactionDescription;

    @InterfaceC1497a
    @InterfaceC1498b("safe_transaction_header")
    private final String safeTransactionHeader;

    @InterfaceC1497a
    @InterfaceC1498b("unlock_everything_details")
    private final KycUnlockEverythingDetails unlockEverythingDetails;

    @InterfaceC1497a
    @InterfaceC1498b("upgrade_btn_title_kyc0")
    private final String upgradeBtnTitleKyc0;

    @InterfaceC1497a
    @InterfaceC1498b("upgrade_btn_title_kyc1")
    private final String upgradeBtnTitleKyc1;

    @InterfaceC1497a
    @InterfaceC1498b("upgrade_now_description")
    private final String upgradeNowDescription;

    @InterfaceC1497a
    @InterfaceC1498b("upgrade_steps_guide")
    private final KycUpgradeStepsGuide upgradeStepsGuide;

    public static final class Creator implements Parcelable.Creator<KycIntro> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIntro createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycIntro(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : KycUpgradeStepsGuide.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? KycUnlockEverythingDetails.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIntro[] newArray(int i) {
            return new KycIntro[i];
        }
    }

    public KycIntro() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public static /* synthetic */ KycIntro copy$default(KycIntro kycIntro, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, KycUpgradeStepsGuide kycUpgradeStepsGuide, String str11, String str12, KycUnlockEverythingDetails kycUnlockEverythingDetails, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        String str20;
        String str21;
        String str22 = (i & 1) != 0 ? kycIntro.newRegistrationUpgradeIntroHeader : str;
        String str23 = (i & 2) != 0 ? kycIntro.newRegistrationUpgradeIntroDescription : str2;
        String str24 = (i & 4) != 0 ? kycIntro.kyc0UpgradeIntroHeader : str3;
        String str25 = (i & 8) != 0 ? kycIntro.kyc0UpgradeIntroDescription : str4;
        String str26 = (i & 16) != 0 ? kycIntro.kyc1UpgradeIntroHeader : str5;
        String str27 = (i & 32) != 0 ? kycIntro.kyc1UpgradeIntroDescription : str6;
        String str28 = (i & 64) != 0 ? kycIntro.inviteCodeDescription : str7;
        String str29 = (i & 128) != 0 ? kycIntro.kyc0UpgradeNowHeader : str8;
        String str30 = (i & 256) != 0 ? kycIntro.kyc1UpgradeNowHeader : str9;
        String str31 = (i & 512) != 0 ? kycIntro.upgradeNowDescription : str10;
        KycUpgradeStepsGuide kycUpgradeStepsGuide2 = (i & 1024) != 0 ? kycIntro.upgradeStepsGuide : kycUpgradeStepsGuide;
        String str32 = (i & 2048) != 0 ? kycIntro.kyc0UnlockEverythingHeader : str11;
        String str33 = (i & 4096) != 0 ? kycIntro.kyc1UnlockEverythingHeader : str12;
        KycUnlockEverythingDetails kycUnlockEverythingDetails2 = (i & 8192) != 0 ? kycIntro.unlockEverythingDetails : kycUnlockEverythingDetails;
        String str34 = str22;
        String str35 = (i & 16384) != 0 ? kycIntro.safeTransactionHeader : str13;
        String str36 = (i & 32768) != 0 ? kycIntro.safeTransactionDescription : str14;
        String str37 = (i & 65536) != 0 ? kycIntro.dataPrivacyHeader : str15;
        String str38 = (i & 131072) != 0 ? kycIntro.dataPrivacyDescription : str16;
        String str39 = (i & 262144) != 0 ? kycIntro.upgradeBtnTitleKyc0 : str17;
        String str40 = (i & 524288) != 0 ? kycIntro.upgradeBtnTitleKyc1 : str18;
        if ((i & 1048576) != 0) {
            str21 = str40;
            str20 = kycIntro.doItLaterBtnTitle;
        } else {
            str20 = str19;
            str21 = str40;
        }
        return kycIntro.copy(str34, str23, str24, str25, str26, str27, str28, str29, str30, str31, kycUpgradeStepsGuide2, str32, str33, kycUnlockEverythingDetails2, str35, str36, str37, str38, str39, str21, str20);
    }

    public final String component1() {
        return this.newRegistrationUpgradeIntroHeader;
    }

    public final String component10() {
        return this.upgradeNowDescription;
    }

    public final KycUpgradeStepsGuide component11() {
        return this.upgradeStepsGuide;
    }

    public final String component12() {
        return this.kyc0UnlockEverythingHeader;
    }

    public final String component13() {
        return this.kyc1UnlockEverythingHeader;
    }

    public final KycUnlockEverythingDetails component14() {
        return this.unlockEverythingDetails;
    }

    public final String component15() {
        return this.safeTransactionHeader;
    }

    public final String component16() {
        return this.safeTransactionDescription;
    }

    public final String component17() {
        return this.dataPrivacyHeader;
    }

    public final String component18() {
        return this.dataPrivacyDescription;
    }

    public final String component19() {
        return this.upgradeBtnTitleKyc0;
    }

    public final String component2() {
        return this.newRegistrationUpgradeIntroDescription;
    }

    public final String component20() {
        return this.upgradeBtnTitleKyc1;
    }

    public final String component21() {
        return this.doItLaterBtnTitle;
    }

    public final String component3() {
        return this.kyc0UpgradeIntroHeader;
    }

    public final String component4() {
        return this.kyc0UpgradeIntroDescription;
    }

    public final String component5() {
        return this.kyc1UpgradeIntroHeader;
    }

    public final String component6() {
        return this.kyc1UpgradeIntroDescription;
    }

    public final String component7() {
        return this.inviteCodeDescription;
    }

    public final String component8() {
        return this.kyc0UpgradeNowHeader;
    }

    public final String component9() {
        return this.kyc1UpgradeNowHeader;
    }

    public final KycIntro copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, KycUpgradeStepsGuide kycUpgradeStepsGuide, String str11, String str12, KycUnlockEverythingDetails kycUnlockEverythingDetails, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        return new KycIntro(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, kycUpgradeStepsGuide, str11, str12, kycUnlockEverythingDetails, str13, str14, str15, str16, str17, str18, str19);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycIntro)) {
            return false;
        }
        KycIntro kycIntro = (KycIntro) obj;
        return j.b(this.newRegistrationUpgradeIntroHeader, kycIntro.newRegistrationUpgradeIntroHeader) && j.b(this.newRegistrationUpgradeIntroDescription, kycIntro.newRegistrationUpgradeIntroDescription) && j.b(this.kyc0UpgradeIntroHeader, kycIntro.kyc0UpgradeIntroHeader) && j.b(this.kyc0UpgradeIntroDescription, kycIntro.kyc0UpgradeIntroDescription) && j.b(this.kyc1UpgradeIntroHeader, kycIntro.kyc1UpgradeIntroHeader) && j.b(this.kyc1UpgradeIntroDescription, kycIntro.kyc1UpgradeIntroDescription) && j.b(this.inviteCodeDescription, kycIntro.inviteCodeDescription) && j.b(this.kyc0UpgradeNowHeader, kycIntro.kyc0UpgradeNowHeader) && j.b(this.kyc1UpgradeNowHeader, kycIntro.kyc1UpgradeNowHeader) && j.b(this.upgradeNowDescription, kycIntro.upgradeNowDescription) && j.b(this.upgradeStepsGuide, kycIntro.upgradeStepsGuide) && j.b(this.kyc0UnlockEverythingHeader, kycIntro.kyc0UnlockEverythingHeader) && j.b(this.kyc1UnlockEverythingHeader, kycIntro.kyc1UnlockEverythingHeader) && j.b(this.unlockEverythingDetails, kycIntro.unlockEverythingDetails) && j.b(this.safeTransactionHeader, kycIntro.safeTransactionHeader) && j.b(this.safeTransactionDescription, kycIntro.safeTransactionDescription) && j.b(this.dataPrivacyHeader, kycIntro.dataPrivacyHeader) && j.b(this.dataPrivacyDescription, kycIntro.dataPrivacyDescription) && j.b(this.upgradeBtnTitleKyc0, kycIntro.upgradeBtnTitleKyc0) && j.b(this.upgradeBtnTitleKyc1, kycIntro.upgradeBtnTitleKyc1) && j.b(this.doItLaterBtnTitle, kycIntro.doItLaterBtnTitle);
    }

    public final String getDataPrivacyDescription() {
        return this.dataPrivacyDescription;
    }

    public final String getDataPrivacyHeader() {
        return this.dataPrivacyHeader;
    }

    public final String getDoItLaterBtnTitle() {
        return this.doItLaterBtnTitle;
    }

    public final String getInviteCodeDescription() {
        return this.inviteCodeDescription;
    }

    public final String getKyc0UnlockEverythingHeader() {
        return this.kyc0UnlockEverythingHeader;
    }

    public final String getKyc0UpgradeIntroDescription() {
        return this.kyc0UpgradeIntroDescription;
    }

    public final String getKyc0UpgradeIntroHeader() {
        return this.kyc0UpgradeIntroHeader;
    }

    public final String getKyc0UpgradeNowHeader() {
        return this.kyc0UpgradeNowHeader;
    }

    public final String getKyc1UnlockEverythingHeader() {
        return this.kyc1UnlockEverythingHeader;
    }

    public final String getKyc1UpgradeIntroDescription() {
        return this.kyc1UpgradeIntroDescription;
    }

    public final String getKyc1UpgradeIntroHeader() {
        return this.kyc1UpgradeIntroHeader;
    }

    public final String getKyc1UpgradeNowHeader() {
        return this.kyc1UpgradeNowHeader;
    }

    public final String getNewRegistrationUpgradeIntroDescription() {
        return this.newRegistrationUpgradeIntroDescription;
    }

    public final String getNewRegistrationUpgradeIntroHeader() {
        return this.newRegistrationUpgradeIntroHeader;
    }

    public final String getSafeTransactionDescription() {
        return this.safeTransactionDescription;
    }

    public final String getSafeTransactionHeader() {
        return this.safeTransactionHeader;
    }

    public final KycUnlockEverythingDetails getUnlockEverythingDetails() {
        return this.unlockEverythingDetails;
    }

    public final String getUpgradeBtnTitleKyc0() {
        return this.upgradeBtnTitleKyc0;
    }

    public final String getUpgradeBtnTitleKyc1() {
        return this.upgradeBtnTitleKyc1;
    }

    public final String getUpgradeNowDescription() {
        return this.upgradeNowDescription;
    }

    public final KycUpgradeStepsGuide getUpgradeStepsGuide() {
        return this.upgradeStepsGuide;
    }

    public int hashCode() {
        String str = this.newRegistrationUpgradeIntroHeader;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.newRegistrationUpgradeIntroDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kyc0UpgradeIntroHeader;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kyc0UpgradeIntroDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.kyc1UpgradeIntroHeader;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.kyc1UpgradeIntroDescription;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.inviteCodeDescription;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.kyc0UpgradeNowHeader;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.kyc1UpgradeNowHeader;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.upgradeNowDescription;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        KycUpgradeStepsGuide kycUpgradeStepsGuide = this.upgradeStepsGuide;
        int iHashCode11 = (iHashCode10 + (kycUpgradeStepsGuide == null ? 0 : kycUpgradeStepsGuide.hashCode())) * 31;
        String str11 = this.kyc0UnlockEverythingHeader;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.kyc1UnlockEverythingHeader;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        KycUnlockEverythingDetails kycUnlockEverythingDetails = this.unlockEverythingDetails;
        int iHashCode14 = (iHashCode13 + (kycUnlockEverythingDetails == null ? 0 : kycUnlockEverythingDetails.hashCode())) * 31;
        String str13 = this.safeTransactionHeader;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.safeTransactionDescription;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dataPrivacyHeader;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.dataPrivacyDescription;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.upgradeBtnTitleKyc0;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.upgradeBtnTitleKyc1;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.doItLaterBtnTitle;
        return iHashCode20 + (str19 != null ? str19.hashCode() : 0);
    }

    public String toString() {
        String str = this.newRegistrationUpgradeIntroHeader;
        String str2 = this.newRegistrationUpgradeIntroDescription;
        String str3 = this.kyc0UpgradeIntroHeader;
        String str4 = this.kyc0UpgradeIntroDescription;
        String str5 = this.kyc1UpgradeIntroHeader;
        String str6 = this.kyc1UpgradeIntroDescription;
        String str7 = this.inviteCodeDescription;
        String str8 = this.kyc0UpgradeNowHeader;
        String str9 = this.kyc1UpgradeNowHeader;
        String str10 = this.upgradeNowDescription;
        KycUpgradeStepsGuide kycUpgradeStepsGuide = this.upgradeStepsGuide;
        String str11 = this.kyc0UnlockEverythingHeader;
        String str12 = this.kyc1UnlockEverythingHeader;
        KycUnlockEverythingDetails kycUnlockEverythingDetails = this.unlockEverythingDetails;
        String str13 = this.safeTransactionHeader;
        String str14 = this.safeTransactionDescription;
        String str15 = this.dataPrivacyHeader;
        String str16 = this.dataPrivacyDescription;
        String str17 = this.upgradeBtnTitleKyc0;
        String str18 = this.upgradeBtnTitleKyc1;
        String str19 = this.doItLaterBtnTitle;
        StringBuilder sbX = s.x("KycIntro(newRegistrationUpgradeIntroHeader=", str, ", newRegistrationUpgradeIntroDescription=", str2, ", kyc0UpgradeIntroHeader=");
        c.A(sbX, str3, ", kyc0UpgradeIntroDescription=", str4, ", kyc1UpgradeIntroHeader=");
        c.A(sbX, str5, ", kyc1UpgradeIntroDescription=", str6, ", inviteCodeDescription=");
        c.A(sbX, str7, ", kyc0UpgradeNowHeader=", str8, ", kyc1UpgradeNowHeader=");
        c.A(sbX, str9, ", upgradeNowDescription=", str10, ", upgradeStepsGuide=");
        sbX.append(kycUpgradeStepsGuide);
        sbX.append(", kyc0UnlockEverythingHeader=");
        sbX.append(str11);
        sbX.append(", kyc1UnlockEverythingHeader=");
        sbX.append(str12);
        sbX.append(", unlockEverythingDetails=");
        sbX.append(kycUnlockEverythingDetails);
        sbX.append(", safeTransactionHeader=");
        c.A(sbX, str13, ", safeTransactionDescription=", str14, ", dataPrivacyHeader=");
        c.A(sbX, str15, ", dataPrivacyDescription=", str16, ", upgradeBtnTitleKyc0=");
        c.A(sbX, str17, ", upgradeBtnTitleKyc1=", str18, ", doItLaterBtnTitle=");
        return s.p(sbX, str19, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.newRegistrationUpgradeIntroHeader);
        dest.writeString(this.newRegistrationUpgradeIntroDescription);
        dest.writeString(this.kyc0UpgradeIntroHeader);
        dest.writeString(this.kyc0UpgradeIntroDescription);
        dest.writeString(this.kyc1UpgradeIntroHeader);
        dest.writeString(this.kyc1UpgradeIntroDescription);
        dest.writeString(this.inviteCodeDescription);
        dest.writeString(this.kyc0UpgradeNowHeader);
        dest.writeString(this.kyc1UpgradeNowHeader);
        dest.writeString(this.upgradeNowDescription);
        KycUpgradeStepsGuide kycUpgradeStepsGuide = this.upgradeStepsGuide;
        if (kycUpgradeStepsGuide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycUpgradeStepsGuide.writeToParcel(dest, i);
        }
        dest.writeString(this.kyc0UnlockEverythingHeader);
        dest.writeString(this.kyc1UnlockEverythingHeader);
        KycUnlockEverythingDetails kycUnlockEverythingDetails = this.unlockEverythingDetails;
        if (kycUnlockEverythingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycUnlockEverythingDetails.writeToParcel(dest, i);
        }
        dest.writeString(this.safeTransactionHeader);
        dest.writeString(this.safeTransactionDescription);
        dest.writeString(this.dataPrivacyHeader);
        dest.writeString(this.dataPrivacyDescription);
        dest.writeString(this.upgradeBtnTitleKyc0);
        dest.writeString(this.upgradeBtnTitleKyc1);
        dest.writeString(this.doItLaterBtnTitle);
    }

    public KycIntro(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, KycUpgradeStepsGuide kycUpgradeStepsGuide, String str11, String str12, KycUnlockEverythingDetails kycUnlockEverythingDetails, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.newRegistrationUpgradeIntroHeader = str;
        this.newRegistrationUpgradeIntroDescription = str2;
        this.kyc0UpgradeIntroHeader = str3;
        this.kyc0UpgradeIntroDescription = str4;
        this.kyc1UpgradeIntroHeader = str5;
        this.kyc1UpgradeIntroDescription = str6;
        this.inviteCodeDescription = str7;
        this.kyc0UpgradeNowHeader = str8;
        this.kyc1UpgradeNowHeader = str9;
        this.upgradeNowDescription = str10;
        this.upgradeStepsGuide = kycUpgradeStepsGuide;
        this.kyc0UnlockEverythingHeader = str11;
        this.kyc1UnlockEverythingHeader = str12;
        this.unlockEverythingDetails = kycUnlockEverythingDetails;
        this.safeTransactionHeader = str13;
        this.safeTransactionDescription = str14;
        this.dataPrivacyHeader = str15;
        this.dataPrivacyDescription = str16;
        this.upgradeBtnTitleKyc0 = str17;
        this.upgradeBtnTitleKyc1 = str18;
        this.doItLaterBtnTitle = str19;
    }

    public /* synthetic */ KycIntro(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, KycUpgradeStepsGuide kycUpgradeStepsGuide, String str11, String str12, KycUnlockEverythingDetails kycUnlockEverythingDetails, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : kycUpgradeStepsGuide, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : kycUnlockEverythingDetails, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? null : str19);
    }
}
