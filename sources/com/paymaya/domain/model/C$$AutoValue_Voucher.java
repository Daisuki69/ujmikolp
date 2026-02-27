package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Voucher;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Voucher, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Voucher extends Voucher {
    private final String mAccountName;
    private final int mAssignmentId;
    private final String mBannerUrl;
    private final String mCampaignName;
    private final String mCode;
    private final VoucherDenomination mDenomination;
    private final String mEndDate;
    private final String mExternalPartnerCode;
    private final String mFaq;
    private final boolean mHasReminder;
    private final String mIconUrl;
    private final String mMechanics;
    private final VoucherNotificationSettings mNotificationSettings;
    private final int mPage;
    private final String mRecipient;
    private final String mRedeemedDate;
    private final String mSender;
    private final String mStartDate;
    private final String mStatus;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Voucher$Builder */
    public static class Builder extends Voucher.Builder {
        private String mAccountName;
        private Integer mAssignmentId;
        private String mBannerUrl;
        private String mCampaignName;
        private String mCode;
        private VoucherDenomination mDenomination;
        private String mEndDate;
        private String mExternalPartnerCode;
        private String mFaq;
        private Boolean mHasReminder;
        private String mIconUrl;
        private String mMechanics;
        private VoucherNotificationSettings mNotificationSettings;
        private Integer mPage;
        private String mRecipient;
        private String mRedeemedDate;
        private String mSender;
        private String mStartDate;
        private String mStatus;

        public /* synthetic */ Builder(Voucher voucher, int i) {
            this(voucher);
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher build() {
            String strI = this.mAssignmentId == null ? " mAssignmentId" : "";
            if (this.mAccountName == null) {
                strI = s.i(strI, " mAccountName");
            }
            if (this.mCampaignName == null) {
                strI = s.i(strI, " mCampaignName");
            }
            if (this.mStatus == null) {
                strI = s.i(strI, " mStatus");
            }
            if (this.mStartDate == null) {
                strI = s.i(strI, " mStartDate");
            }
            if (this.mEndDate == null) {
                strI = s.i(strI, " mEndDate");
            }
            if (this.mPage == null) {
                strI = s.i(strI, " mPage");
            }
            if (this.mHasReminder == null) {
                strI = s.i(strI, " mHasReminder");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Voucher(this.mAssignmentId.intValue(), this.mAccountName, this.mCampaignName, this.mCode, this.mSender, this.mRecipient, this.mStatus, this.mStartDate, this.mEndDate, this.mIconUrl, this.mBannerUrl, this.mFaq, this.mMechanics, this.mExternalPartnerCode, this.mDenomination, this.mNotificationSettings, this.mRedeemedDate, this.mPage.intValue(), this.mHasReminder.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mAccountName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mAccountName");
            }
            this.mAccountName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mAssignmentId(int i) {
            this.mAssignmentId = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mBannerUrl(String str) {
            this.mBannerUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mCampaignName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mCampaignName");
            }
            this.mCampaignName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mCode(String str) {
            this.mCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mDenomination(@Nullable VoucherDenomination voucherDenomination) {
            this.mDenomination = voucherDenomination;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mEndDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mEndDate");
            }
            this.mEndDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mExternalPartnerCode(String str) {
            this.mExternalPartnerCode = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mFaq(String str) {
            this.mFaq = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mHasReminder(boolean z4) {
            this.mHasReminder = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mIconUrl(String str) {
            this.mIconUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mMechanics(String str) {
            this.mMechanics = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mNotificationSettings(@Nullable VoucherNotificationSettings voucherNotificationSettings) {
            this.mNotificationSettings = voucherNotificationSettings;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mPage(int i) {
            this.mPage = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mRecipient(String str) {
            this.mRecipient = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mRedeemedDate(String str) {
            this.mRedeemedDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mSender(String str) {
            this.mSender = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mStartDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStartDate");
            }
            this.mStartDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Voucher.Builder
        public Voucher.Builder mStatus(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStatus");
            }
            this.mStatus = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Voucher voucher) {
            this.mAssignmentId = Integer.valueOf(voucher.mAssignmentId());
            this.mAccountName = voucher.mAccountName();
            this.mCampaignName = voucher.mCampaignName();
            this.mCode = voucher.mCode();
            this.mSender = voucher.mSender();
            this.mRecipient = voucher.mRecipient();
            this.mStatus = voucher.mStatus();
            this.mStartDate = voucher.mStartDate();
            this.mEndDate = voucher.mEndDate();
            this.mIconUrl = voucher.mIconUrl();
            this.mBannerUrl = voucher.mBannerUrl();
            this.mFaq = voucher.mFaq();
            this.mMechanics = voucher.mMechanics();
            this.mExternalPartnerCode = voucher.mExternalPartnerCode();
            this.mDenomination = voucher.mDenomination();
            this.mNotificationSettings = voucher.mNotificationSettings();
            this.mRedeemedDate = voucher.mRedeemedDate();
            this.mPage = Integer.valueOf(voucher.mPage());
            this.mHasReminder = Boolean.valueOf(voucher.mHasReminder());
        }
    }

    public C$$AutoValue_Voucher(int i, String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, String str6, String str7, String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable VoucherDenomination voucherDenomination, @Nullable VoucherNotificationSettings voucherNotificationSettings, @Nullable String str14, int i4, boolean z4) {
        this.mAssignmentId = i;
        if (str == null) {
            throw new NullPointerException("Null mAccountName");
        }
        this.mAccountName = str;
        if (str2 == null) {
            throw new NullPointerException("Null mCampaignName");
        }
        this.mCampaignName = str2;
        this.mCode = str3;
        this.mSender = str4;
        this.mRecipient = str5;
        if (str6 == null) {
            throw new NullPointerException("Null mStatus");
        }
        this.mStatus = str6;
        if (str7 == null) {
            throw new NullPointerException("Null mStartDate");
        }
        this.mStartDate = str7;
        if (str8 == null) {
            throw new NullPointerException("Null mEndDate");
        }
        this.mEndDate = str8;
        this.mIconUrl = str9;
        this.mBannerUrl = str10;
        this.mFaq = str11;
        this.mMechanics = str12;
        this.mExternalPartnerCode = str13;
        this.mDenomination = voucherDenomination;
        this.mNotificationSettings = voucherNotificationSettings;
        this.mRedeemedDate = str14;
        this.mPage = i4;
        this.mHasReminder = z4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        VoucherDenomination voucherDenomination;
        VoucherNotificationSettings voucherNotificationSettings;
        String str9;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Voucher) {
            Voucher voucher = (Voucher) obj;
            if (this.mAssignmentId == voucher.mAssignmentId() && this.mAccountName.equals(voucher.mAccountName()) && this.mCampaignName.equals(voucher.mCampaignName()) && ((str = this.mCode) != null ? str.equals(voucher.mCode()) : voucher.mCode() == null) && ((str2 = this.mSender) != null ? str2.equals(voucher.mSender()) : voucher.mSender() == null) && ((str3 = this.mRecipient) != null ? str3.equals(voucher.mRecipient()) : voucher.mRecipient() == null) && this.mStatus.equals(voucher.mStatus()) && this.mStartDate.equals(voucher.mStartDate()) && this.mEndDate.equals(voucher.mEndDate()) && ((str4 = this.mIconUrl) != null ? str4.equals(voucher.mIconUrl()) : voucher.mIconUrl() == null) && ((str5 = this.mBannerUrl) != null ? str5.equals(voucher.mBannerUrl()) : voucher.mBannerUrl() == null) && ((str6 = this.mFaq) != null ? str6.equals(voucher.mFaq()) : voucher.mFaq() == null) && ((str7 = this.mMechanics) != null ? str7.equals(voucher.mMechanics()) : voucher.mMechanics() == null) && ((str8 = this.mExternalPartnerCode) != null ? str8.equals(voucher.mExternalPartnerCode()) : voucher.mExternalPartnerCode() == null) && ((voucherDenomination = this.mDenomination) != null ? voucherDenomination.equals(voucher.mDenomination()) : voucher.mDenomination() == null) && ((voucherNotificationSettings = this.mNotificationSettings) != null ? voucherNotificationSettings.equals(voucher.mNotificationSettings()) : voucher.mNotificationSettings() == null) && ((str9 = this.mRedeemedDate) != null ? str9.equals(voucher.mRedeemedDate()) : voucher.mRedeemedDate() == null) && this.mPage == voucher.mPage() && this.mHasReminder == voucher.mHasReminder()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mAssignmentId ^ 1000003) * 1000003) ^ this.mAccountName.hashCode()) * 1000003) ^ this.mCampaignName.hashCode()) * 1000003;
        String str = this.mCode;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mSender;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mRecipient;
        int iHashCode4 = (((((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ this.mStartDate.hashCode()) * 1000003) ^ this.mEndDate.hashCode()) * 1000003;
        String str4 = this.mIconUrl;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mBannerUrl;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.mFaq;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.mMechanics;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.mExternalPartnerCode;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        VoucherDenomination voucherDenomination = this.mDenomination;
        int iHashCode10 = (iHashCode9 ^ (voucherDenomination == null ? 0 : voucherDenomination.hashCode())) * 1000003;
        VoucherNotificationSettings voucherNotificationSettings = this.mNotificationSettings;
        int iHashCode11 = (iHashCode10 ^ (voucherNotificationSettings == null ? 0 : voucherNotificationSettings.hashCode())) * 1000003;
        String str9 = this.mRedeemedDate;
        return ((((iHashCode11 ^ (str9 != null ? str9.hashCode() : 0)) * 1000003) ^ this.mPage) * 1000003) ^ (this.mHasReminder ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b(alternate = {"accountName"}, value = "account_name")
    public String mAccountName() {
        return this.mAccountName;
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b(alternate = {"assignmentId"}, value = "assignment_id")
    public int mAssignmentId() {
        return this.mAssignmentId;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b(alternate = {"bannerUrl"}, value = "banner_url")
    public String mBannerUrl() {
        return this.mBannerUrl;
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b(alternate = {"campaignName"}, value = "campaign_name")
    public String mCampaignName() {
        return this.mCampaignName;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("code")
    public String mCode() {
        return this.mCode;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("denomination")
    public VoucherDenomination mDenomination() {
        return this.mDenomination;
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b(alternate = {"endDate"}, value = "end_date")
    public String mEndDate() {
        return this.mEndDate;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("external_partner_code")
    public String mExternalPartnerCode() {
        return this.mExternalPartnerCode;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("faq")
    public String mFaq() {
        return this.mFaq;
    }

    @Override // com.paymaya.domain.model.Voucher
    public boolean mHasReminder() {
        return this.mHasReminder;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b(alternate = {"iconUrl"}, value = "icon_url")
    public String mIconUrl() {
        return this.mIconUrl;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("mechanics")
    public String mMechanics() {
        return this.mMechanics;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b(alternate = {"notificationSettings"}, value = "notification_settings")
    public VoucherNotificationSettings mNotificationSettings() {
        return this.mNotificationSettings;
    }

    @Override // com.paymaya.domain.model.Voucher
    public int mPage() {
        return this.mPage;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("recipient")
    public String mRecipient() {
        return this.mRecipient;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("redeemed_date")
    public String mRedeemedDate() {
        return this.mRedeemedDate;
    }

    @Override // com.paymaya.domain.model.Voucher
    @Nullable
    @InterfaceC1498b("sender")
    public String mSender() {
        return this.mSender;
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b(alternate = {"startDate"}, value = "start_date")
    public String mStartDate() {
        return this.mStartDate;
    }

    @Override // com.paymaya.domain.model.Voucher
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.Voucher
    public Voucher.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Voucher{mAssignmentId=");
        sb2.append(this.mAssignmentId);
        sb2.append(", mAccountName=");
        sb2.append(this.mAccountName);
        sb2.append(", mCampaignName=");
        sb2.append(this.mCampaignName);
        sb2.append(", mCode=");
        sb2.append(this.mCode);
        sb2.append(", mSender=");
        sb2.append(this.mSender);
        sb2.append(", mRecipient=");
        sb2.append(this.mRecipient);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mStartDate=");
        sb2.append(this.mStartDate);
        sb2.append(", mEndDate=");
        sb2.append(this.mEndDate);
        sb2.append(", mIconUrl=");
        sb2.append(this.mIconUrl);
        sb2.append(", mBannerUrl=");
        sb2.append(this.mBannerUrl);
        sb2.append(", mFaq=");
        sb2.append(this.mFaq);
        sb2.append(", mMechanics=");
        sb2.append(this.mMechanics);
        sb2.append(", mExternalPartnerCode=");
        sb2.append(this.mExternalPartnerCode);
        sb2.append(", mDenomination=");
        sb2.append(this.mDenomination);
        sb2.append(", mNotificationSettings=");
        sb2.append(this.mNotificationSettings);
        sb2.append(", mRedeemedDate=");
        sb2.append(this.mRedeemedDate);
        sb2.append(", mPage=");
        sb2.append(this.mPage);
        sb2.append(", mHasReminder=");
        return s.s(sb2, this.mHasReminder, "}");
    }
}
