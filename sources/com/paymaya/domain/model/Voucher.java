package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Voucher;
import com.paymaya.domain.model.C$AutoValue_Voucher;
import com.paymaya.domain.model.VoucherListItem;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Voucher implements Parcelable, VoucherListItem {

    public static abstract class Builder {
        public abstract Voucher build();

        public abstract Builder mAccountName(String str);

        public abstract Builder mAssignmentId(int i);

        public abstract Builder mBannerUrl(String str);

        public abstract Builder mCampaignName(String str);

        public abstract Builder mCode(String str);

        public abstract Builder mDenomination(@Nullable VoucherDenomination voucherDenomination);

        public abstract Builder mEndDate(String str);

        public abstract Builder mExternalPartnerCode(String str);

        public abstract Builder mFaq(String str);

        public abstract Builder mHasReminder(boolean z4);

        public abstract Builder mIconUrl(String str);

        public abstract Builder mMechanics(String str);

        public abstract Builder mNotificationSettings(@Nullable VoucherNotificationSettings voucherNotificationSettings);

        public abstract Builder mPage(int i);

        public abstract Builder mRecipient(String str);

        public abstract Builder mRedeemedDate(String str);

        public abstract Builder mSender(String str);

        public abstract Builder mStartDate(String str);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Voucher.Builder().mAssignmentId(0).mPage(0).mHasReminder(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Voucher.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.VoucherListItem
    public VoucherListItem.VIEW_TYPE getViewType() {
        return mStatus().equals("REDEEMED") ? VoucherListItem.VIEW_TYPE.VIEW_TYPE_CLAIMED_VOUCHER : mStatus().equals("EXPIRED") ? VoucherListItem.VIEW_TYPE.VIEW_TYPE_EXPIRED_VOUCHER : VoucherListItem.VIEW_TYPE.VIEW_TYPE_AVAILABLE_VOUCHER;
    }

    @InterfaceC1498b(alternate = {"accountName"}, value = "account_name")
    public abstract String mAccountName();

    @InterfaceC1498b(alternate = {"assignmentId"}, value = "assignment_id")
    public abstract int mAssignmentId();

    @Nullable
    @InterfaceC1498b(alternate = {"bannerUrl"}, value = "banner_url")
    public abstract String mBannerUrl();

    @InterfaceC1498b(alternate = {"campaignName"}, value = "campaign_name")
    public abstract String mCampaignName();

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @Nullable
    @InterfaceC1498b("denomination")
    public abstract VoucherDenomination mDenomination();

    @InterfaceC1498b(alternate = {"endDate"}, value = "end_date")
    public abstract String mEndDate();

    @Nullable
    @InterfaceC1498b("external_partner_code")
    public abstract String mExternalPartnerCode();

    @Nullable
    @InterfaceC1498b("faq")
    public abstract String mFaq();

    public abstract boolean mHasReminder();

    @Nullable
    @InterfaceC1498b(alternate = {"iconUrl"}, value = "icon_url")
    public abstract String mIconUrl();

    @Nullable
    @InterfaceC1498b("mechanics")
    public abstract String mMechanics();

    @Nullable
    @InterfaceC1498b(alternate = {"notificationSettings"}, value = "notification_settings")
    public abstract VoucherNotificationSettings mNotificationSettings();

    public abstract int mPage();

    @Nullable
    @InterfaceC1498b("recipient")
    public abstract String mRecipient();

    @Nullable
    @InterfaceC1498b("redeemed_date")
    public abstract String mRedeemedDate();

    @Nullable
    @InterfaceC1498b("sender")
    public abstract String mSender();

    @InterfaceC1498b(alternate = {"startDate"}, value = "start_date")
    public abstract String mStartDate();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    public abstract Builder toBuilder();
}
