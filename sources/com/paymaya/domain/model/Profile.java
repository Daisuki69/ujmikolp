package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.Scopes;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Profile;
import com.paymaya.domain.model.C$AutoValue_Profile;
import g3.InterfaceC1498b;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Profile {

    public static abstract class Builder {
        public abstract Profile build();

        public abstract Builder canLinkCard(boolean z4);

        public abstract Builder mAccountStatus(String str);

        public abstract Builder mAccountType(AccountType accountType);

        public abstract Builder mBackupIdentity(@Nullable BackUpIdentity backUpIdentity);

        public abstract Builder mDeviceToken(String str);

        public abstract Builder mEddStatus(String str);

        public abstract Builder mFundSources(List<FundSource> list);

        public abstract Builder mHasGovernmentId(boolean z4);

        public abstract Builder mIdentities(List<Identity> list);

        public abstract Builder mKyc(String str);

        public abstract Builder mKycLevel(String str);

        public abstract Builder mNetwork(String str);

        public abstract Builder mPhysicalCard(String str);

        public abstract Builder mPrivacyPolicy(PrivacyPolicy privacyPolicy);

        public abstract Builder mProfileId(String str);

        public abstract Builder mReKycReason(String str);

        public abstract Builder mReKycStatus(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mToken(String str);

        public abstract Builder mUser(User user);

        public abstract Builder mWalletId(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Profile.Builder().canLinkCard(false).mHasGovernmentId(false);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Profile.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("can_link_card")
    public abstract boolean canLinkCard();

    @InterfaceC1498b("account_status")
    public abstract String mAccountStatus();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract AccountType mAccountType();

    @Nullable
    @InterfaceC1498b("backup_identity")
    public abstract BackUpIdentity mBackupIdentity();

    @Nullable
    @InterfaceC1498b("device_token")
    public abstract String mDeviceToken();

    @Nullable
    @InterfaceC1498b("edd_status")
    public abstract String mEddStatus();

    @InterfaceC1498b("fund_sources")
    public abstract List<FundSource> mFundSources();

    @InterfaceC1498b("has_gov_id")
    public abstract boolean mHasGovernmentId();

    @InterfaceC1498b("identities")
    public abstract List<Identity> mIdentities();

    @InterfaceC1498b("kyc")
    public abstract String mKyc();

    @Nullable
    @InterfaceC1498b("kyc_level")
    public abstract String mKycLevel();

    @InterfaceC1498b("network")
    public abstract String mNetwork();

    @InterfaceC1498b("physical_card")
    public abstract String mPhysicalCard();

    @Nullable
    @InterfaceC1498b("privacy_policy")
    public abstract PrivacyPolicy mPrivacyPolicy();

    @InterfaceC1498b("profile_id")
    public abstract String mProfileId();

    @Nullable
    @InterfaceC1498b("re_kyc_reason")
    public abstract String mReKycReason();

    @Nullable
    @InterfaceC1498b("re_kyc_status")
    public abstract String mReKycStatus();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b(MPDbAdapter.KEY_TOKEN)
    public abstract String mToken();

    @InterfaceC1498b(Scopes.PROFILE)
    public abstract User mUser();

    @Nullable
    @InterfaceC1498b("wallet_id")
    public abstract String mWalletId();
}
