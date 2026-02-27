package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.Scopes;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Profile;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Profile extends C$AutoValue_Profile {

    public static final class GsonTypeAdapter extends y {
        private volatile y accountType_adapter;
        private volatile y backUpIdentity_adapter;
        private volatile y boolean__adapter;
        private final j gson;
        private volatile y list__fundSource_adapter;
        private volatile y list__identity_adapter;
        private volatile y privacyPolicy_adapter;
        private volatile y string_adapter;
        private volatile y user_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Profile)";
        }

        @Override // com.google.gson.y
        public Profile read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Profile.Builder builderSBuilder = Profile.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "identities":
                            y yVarG = this.list__identity_adapter;
                            if (yVarG == null) {
                                yVarG = this.gson.g(TypeToken.getParameterized(List.class, Identity.class));
                                this.list__identity_adapter = yVarG;
                            }
                            builderSBuilder.mIdentities((List) yVarG.read(aVar));
                            break;
                        case "profile_id":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mProfileId((String) yVarH.read(aVar));
                            break;
                        case "status":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mStatus((String) yVarH2.read(aVar));
                            break;
                        case "device_token":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mDeviceToken((String) yVarH3.read(aVar));
                            break;
                        case "profile":
                            y yVarH4 = this.user_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(User.class);
                                this.user_adapter = yVarH4;
                            }
                            builderSBuilder.mUser((User) yVarH4.read(aVar));
                            break;
                        case "kyc":
                            y yVarH5 = this.string_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(String.class);
                                this.string_adapter = yVarH5;
                            }
                            builderSBuilder.mKyc((String) yVarH5.read(aVar));
                            break;
                        case "type":
                            y yVarH6 = this.accountType_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(AccountType.class);
                                this.accountType_adapter = yVarH6;
                            }
                            builderSBuilder.mAccountType((AccountType) yVarH6.read(aVar));
                            break;
                        case "token":
                            y yVarH7 = this.string_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(String.class);
                                this.string_adapter = yVarH7;
                            }
                            builderSBuilder.mToken((String) yVarH7.read(aVar));
                            break;
                        case "fund_sources":
                            y yVarG2 = this.list__fundSource_adapter;
                            if (yVarG2 == null) {
                                yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, FundSource.class));
                                this.list__fundSource_adapter = yVarG2;
                            }
                            builderSBuilder.mFundSources((List) yVarG2.read(aVar));
                            break;
                        case "kyc_level":
                            y yVarH8 = this.string_adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(String.class);
                                this.string_adapter = yVarH8;
                            }
                            builderSBuilder.mKycLevel((String) yVarH8.read(aVar));
                            break;
                        case "account_status":
                            y yVarH9 = this.string_adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(String.class);
                                this.string_adapter = yVarH9;
                            }
                            builderSBuilder.mAccountStatus((String) yVarH9.read(aVar));
                            break;
                        case "privacy_policy":
                            y yVarH10 = this.privacyPolicy_adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(PrivacyPolicy.class);
                                this.privacyPolicy_adapter = yVarH10;
                            }
                            builderSBuilder.mPrivacyPolicy((PrivacyPolicy) yVarH10.read(aVar));
                            break;
                        case "re_kyc_reason":
                            y yVarH11 = this.string_adapter;
                            if (yVarH11 == null) {
                                yVarH11 = this.gson.h(String.class);
                                this.string_adapter = yVarH11;
                            }
                            builderSBuilder.mReKycReason((String) yVarH11.read(aVar));
                            break;
                        case "re_kyc_status":
                            y yVarH12 = this.string_adapter;
                            if (yVarH12 == null) {
                                yVarH12 = this.gson.h(String.class);
                                this.string_adapter = yVarH12;
                            }
                            builderSBuilder.mReKycStatus((String) yVarH12.read(aVar));
                            break;
                        case "edd_status":
                            y yVarH13 = this.string_adapter;
                            if (yVarH13 == null) {
                                yVarH13 = this.gson.h(String.class);
                                this.string_adapter = yVarH13;
                            }
                            builderSBuilder.mEddStatus((String) yVarH13.read(aVar));
                            break;
                        case "wallet_id":
                            y yVarH14 = this.string_adapter;
                            if (yVarH14 == null) {
                                yVarH14 = this.gson.h(String.class);
                                this.string_adapter = yVarH14;
                            }
                            builderSBuilder.mWalletId((String) yVarH14.read(aVar));
                            break;
                        case "backup_identity":
                            y yVarH15 = this.backUpIdentity_adapter;
                            if (yVarH15 == null) {
                                yVarH15 = this.gson.h(BackUpIdentity.class);
                                this.backUpIdentity_adapter = yVarH15;
                            }
                            builderSBuilder.mBackupIdentity((BackUpIdentity) yVarH15.read(aVar));
                            break;
                        case "physical_card":
                            y yVarH16 = this.string_adapter;
                            if (yVarH16 == null) {
                                yVarH16 = this.gson.h(String.class);
                                this.string_adapter = yVarH16;
                            }
                            builderSBuilder.mPhysicalCard((String) yVarH16.read(aVar));
                            break;
                        case "can_link_card":
                            y yVarH17 = this.boolean__adapter;
                            if (yVarH17 == null) {
                                yVarH17 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH17;
                            }
                            builderSBuilder.canLinkCard(((Boolean) yVarH17.read(aVar)).booleanValue());
                            break;
                        case "has_gov_id":
                            y yVarH18 = this.boolean__adapter;
                            if (yVarH18 == null) {
                                yVarH18 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH18;
                            }
                            builderSBuilder.mHasGovernmentId(((Boolean) yVarH18.read(aVar)).booleanValue());
                            break;
                        case "network":
                            y yVarH19 = this.string_adapter;
                            if (yVarH19 == null) {
                                yVarH19 = this.gson.h(String.class);
                                this.string_adapter = yVarH19;
                            }
                            builderSBuilder.mNetwork((String) yVarH19.read(aVar));
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, Profile profile) throws IOException {
            if (profile == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("profile_id");
            if (profile.mProfileId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, profile.mProfileId());
            }
            bVar.m(Scopes.PROFILE);
            if (profile.mUser() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.user_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(User.class);
                    this.user_adapter = yVarH2;
                }
                yVarH2.write(bVar, profile.mUser());
            }
            bVar.m("backup_identity");
            if (profile.mBackupIdentity() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.backUpIdentity_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(BackUpIdentity.class);
                    this.backUpIdentity_adapter = yVarH3;
                }
                yVarH3.write(bVar, profile.mBackupIdentity());
            }
            bVar.m("identities");
            if (profile.mIdentities() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__identity_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, Identity.class));
                    this.list__identity_adapter = yVarG;
                }
                yVarG.write(bVar, profile.mIdentities());
            }
            bVar.m("fund_sources");
            if (profile.mFundSources() == null) {
                bVar.r();
            } else {
                y yVarG2 = this.list__fundSource_adapter;
                if (yVarG2 == null) {
                    yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, FundSource.class));
                    this.list__fundSource_adapter = yVarG2;
                }
                yVarG2.write(bVar, profile.mFundSources());
            }
            bVar.m(SessionDescription.ATTR_TYPE);
            if (profile.mAccountType() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.accountType_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(AccountType.class);
                    this.accountType_adapter = yVarH4;
                }
                yVarH4.write(bVar, profile.mAccountType());
            }
            bVar.m(MPDbAdapter.KEY_TOKEN);
            if (profile.mToken() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, profile.mToken());
            }
            bVar.m("kyc");
            if (profile.mKyc() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.string_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(String.class);
                    this.string_adapter = yVarH6;
                }
                yVarH6.write(bVar, profile.mKyc());
            }
            bVar.m("kyc_level");
            if (profile.mKycLevel() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.string_adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(String.class);
                    this.string_adapter = yVarH7;
                }
                yVarH7.write(bVar, profile.mKycLevel());
            }
            bVar.m("re_kyc_status");
            if (profile.mReKycStatus() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.string_adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(String.class);
                    this.string_adapter = yVarH8;
                }
                yVarH8.write(bVar, profile.mReKycStatus());
            }
            bVar.m("re_kyc_reason");
            if (profile.mReKycReason() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.string_adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(String.class);
                    this.string_adapter = yVarH9;
                }
                yVarH9.write(bVar, profile.mReKycReason());
            }
            bVar.m("edd_status");
            if (profile.mEddStatus() == null) {
                bVar.r();
            } else {
                y yVarH10 = this.string_adapter;
                if (yVarH10 == null) {
                    yVarH10 = this.gson.h(String.class);
                    this.string_adapter = yVarH10;
                }
                yVarH10.write(bVar, profile.mEddStatus());
            }
            bVar.m("status");
            if (profile.mStatus() == null) {
                bVar.r();
            } else {
                y yVarH11 = this.string_adapter;
                if (yVarH11 == null) {
                    yVarH11 = this.gson.h(String.class);
                    this.string_adapter = yVarH11;
                }
                yVarH11.write(bVar, profile.mStatus());
            }
            bVar.m("physical_card");
            if (profile.mPhysicalCard() == null) {
                bVar.r();
            } else {
                y yVarH12 = this.string_adapter;
                if (yVarH12 == null) {
                    yVarH12 = this.gson.h(String.class);
                    this.string_adapter = yVarH12;
                }
                yVarH12.write(bVar, profile.mPhysicalCard());
            }
            bVar.m("network");
            if (profile.mNetwork() == null) {
                bVar.r();
            } else {
                y yVarH13 = this.string_adapter;
                if (yVarH13 == null) {
                    yVarH13 = this.gson.h(String.class);
                    this.string_adapter = yVarH13;
                }
                yVarH13.write(bVar, profile.mNetwork());
            }
            bVar.m("can_link_card");
            y yVarH14 = this.boolean__adapter;
            if (yVarH14 == null) {
                yVarH14 = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH14;
            }
            yVarH14.write(bVar, Boolean.valueOf(profile.canLinkCard()));
            bVar.m("privacy_policy");
            if (profile.mPrivacyPolicy() == null) {
                bVar.r();
            } else {
                y yVarH15 = this.privacyPolicy_adapter;
                if (yVarH15 == null) {
                    yVarH15 = this.gson.h(PrivacyPolicy.class);
                    this.privacyPolicy_adapter = yVarH15;
                }
                yVarH15.write(bVar, profile.mPrivacyPolicy());
            }
            bVar.m("device_token");
            if (profile.mDeviceToken() == null) {
                bVar.r();
            } else {
                y yVarH16 = this.string_adapter;
                if (yVarH16 == null) {
                    yVarH16 = this.gson.h(String.class);
                    this.string_adapter = yVarH16;
                }
                yVarH16.write(bVar, profile.mDeviceToken());
            }
            bVar.m("account_status");
            if (profile.mAccountStatus() == null) {
                bVar.r();
            } else {
                y yVarH17 = this.string_adapter;
                if (yVarH17 == null) {
                    yVarH17 = this.gson.h(String.class);
                    this.string_adapter = yVarH17;
                }
                yVarH17.write(bVar, profile.mAccountStatus());
            }
            bVar.m("has_gov_id");
            y yVarH18 = this.boolean__adapter;
            if (yVarH18 == null) {
                yVarH18 = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH18;
            }
            yVarH18.write(bVar, Boolean.valueOf(profile.mHasGovernmentId()));
            bVar.m("wallet_id");
            if (profile.mWalletId() == null) {
                bVar.r();
            } else {
                y yVarH19 = this.string_adapter;
                if (yVarH19 == null) {
                    yVarH19 = this.gson.h(String.class);
                    this.string_adapter = yVarH19;
                }
                yVarH19.write(bVar, profile.mWalletId());
            }
            bVar.k();
        }
    }

    public AutoValue_Profile(String str, User user, @Nullable BackUpIdentity backUpIdentity, List<Identity> list, List<FundSource> list2, AccountType accountType, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, String str8, String str9, String str10, boolean z4, @Nullable PrivacyPolicy privacyPolicy, @Nullable String str11, String str12, boolean z5, @Nullable String str13) {
        new Profile(str, user, backUpIdentity, list, list2, accountType, str2, str3, str4, str5, str6, str7, str8, str9, str10, z4, privacyPolicy, str11, str12, z5, str13) { // from class: com.paymaya.domain.model.$AutoValue_Profile
            private final boolean canLinkCard;
            private final String mAccountStatus;
            private final AccountType mAccountType;
            private final BackUpIdentity mBackupIdentity;
            private final String mDeviceToken;
            private final String mEddStatus;
            private final List<FundSource> mFundSources;
            private final boolean mHasGovernmentId;
            private final List<Identity> mIdentities;
            private final String mKyc;
            private final String mKycLevel;
            private final String mNetwork;
            private final String mPhysicalCard;
            private final PrivacyPolicy mPrivacyPolicy;
            private final String mProfileId;
            private final String mReKycReason;
            private final String mReKycStatus;
            private final String mStatus;
            private final String mToken;
            private final User mUser;
            private final String mWalletId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Profile$Builder */
            public static class Builder extends Profile.Builder {
                private Boolean canLinkCard;
                private String mAccountStatus;
                private AccountType mAccountType;
                private BackUpIdentity mBackupIdentity;
                private String mDeviceToken;
                private String mEddStatus;
                private List<FundSource> mFundSources;
                private Boolean mHasGovernmentId;
                private List<Identity> mIdentities;
                private String mKyc;
                private String mKycLevel;
                private String mNetwork;
                private String mPhysicalCard;
                private PrivacyPolicy mPrivacyPolicy;
                private String mProfileId;
                private String mReKycReason;
                private String mReKycStatus;
                private String mStatus;
                private String mToken;
                private User mUser;
                private String mWalletId;

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile build() {
                    String strI = this.mProfileId == null ? " mProfileId" : "";
                    if (this.mUser == null) {
                        strI = s.i(strI, " mUser");
                    }
                    if (this.mIdentities == null) {
                        strI = s.i(strI, " mIdentities");
                    }
                    if (this.mFundSources == null) {
                        strI = s.i(strI, " mFundSources");
                    }
                    if (this.mAccountType == null) {
                        strI = s.i(strI, " mAccountType");
                    }
                    if (this.mKyc == null) {
                        strI = s.i(strI, " mKyc");
                    }
                    if (this.mStatus == null) {
                        strI = s.i(strI, " mStatus");
                    }
                    if (this.mPhysicalCard == null) {
                        strI = s.i(strI, " mPhysicalCard");
                    }
                    if (this.mNetwork == null) {
                        strI = s.i(strI, " mNetwork");
                    }
                    if (this.canLinkCard == null) {
                        strI = s.i(strI, " canLinkCard");
                    }
                    if (this.mAccountStatus == null) {
                        strI = s.i(strI, " mAccountStatus");
                    }
                    if (this.mHasGovernmentId == null) {
                        strI = s.i(strI, " mHasGovernmentId");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_Profile(this.mProfileId, this.mUser, this.mBackupIdentity, this.mIdentities, this.mFundSources, this.mAccountType, this.mToken, this.mKyc, this.mKycLevel, this.mReKycStatus, this.mReKycReason, this.mEddStatus, this.mStatus, this.mPhysicalCard, this.mNetwork, this.canLinkCard.booleanValue(), this.mPrivacyPolicy, this.mDeviceToken, this.mAccountStatus, this.mHasGovernmentId.booleanValue(), this.mWalletId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder canLinkCard(boolean z4) {
                    this.canLinkCard = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mAccountStatus(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mAccountStatus");
                    }
                    this.mAccountStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mAccountType(AccountType accountType) {
                    if (accountType == null) {
                        throw new NullPointerException("Null mAccountType");
                    }
                    this.mAccountType = accountType;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mBackupIdentity(@Nullable BackUpIdentity backUpIdentity) {
                    this.mBackupIdentity = backUpIdentity;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mDeviceToken(String str) {
                    this.mDeviceToken = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mEddStatus(String str) {
                    this.mEddStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mFundSources(List<FundSource> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mFundSources");
                    }
                    this.mFundSources = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mHasGovernmentId(boolean z4) {
                    this.mHasGovernmentId = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mIdentities(List<Identity> list) {
                    if (list == null) {
                        throw new NullPointerException("Null mIdentities");
                    }
                    this.mIdentities = list;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mKyc(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mKyc");
                    }
                    this.mKyc = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mKycLevel(String str) {
                    this.mKycLevel = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mNetwork(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mNetwork");
                    }
                    this.mNetwork = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mPhysicalCard(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mPhysicalCard");
                    }
                    this.mPhysicalCard = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mPrivacyPolicy(PrivacyPolicy privacyPolicy) {
                    this.mPrivacyPolicy = privacyPolicy;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mProfileId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mProfileId");
                    }
                    this.mProfileId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mReKycReason(String str) {
                    this.mReKycReason = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mReKycStatus(String str) {
                    this.mReKycStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mStatus(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStatus");
                    }
                    this.mStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mToken(String str) {
                    this.mToken = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mUser(User user) {
                    if (user == null) {
                        throw new NullPointerException("Null mUser");
                    }
                    this.mUser = user;
                    return this;
                }

                @Override // com.paymaya.domain.model.Profile.Builder
                public Profile.Builder mWalletId(String str) {
                    this.mWalletId = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mProfileId");
                }
                this.mProfileId = str;
                if (user == null) {
                    throw new NullPointerException("Null mUser");
                }
                this.mUser = user;
                this.mBackupIdentity = backUpIdentity;
                if (list == null) {
                    throw new NullPointerException("Null mIdentities");
                }
                this.mIdentities = list;
                if (list2 == null) {
                    throw new NullPointerException("Null mFundSources");
                }
                this.mFundSources = list2;
                if (accountType == null) {
                    throw new NullPointerException("Null mAccountType");
                }
                this.mAccountType = accountType;
                this.mToken = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mKyc");
                }
                this.mKyc = str3;
                this.mKycLevel = str4;
                this.mReKycStatus = str5;
                this.mReKycReason = str6;
                this.mEddStatus = str7;
                if (str8 == null) {
                    throw new NullPointerException("Null mStatus");
                }
                this.mStatus = str8;
                if (str9 == null) {
                    throw new NullPointerException("Null mPhysicalCard");
                }
                this.mPhysicalCard = str9;
                if (str10 == null) {
                    throw new NullPointerException("Null mNetwork");
                }
                this.mNetwork = str10;
                this.canLinkCard = z4;
                this.mPrivacyPolicy = privacyPolicy;
                this.mDeviceToken = str11;
                if (str12 == null) {
                    throw new NullPointerException("Null mAccountStatus");
                }
                this.mAccountStatus = str12;
                this.mHasGovernmentId = z5;
                this.mWalletId = str13;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("can_link_card")
            public boolean canLinkCard() {
                return this.canLinkCard;
            }

            public boolean equals(Object obj) {
                BackUpIdentity backUpIdentity2;
                String str14;
                String str15;
                String str16;
                String str17;
                String str18;
                PrivacyPolicy privacyPolicy2;
                String str19;
                String str20;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Profile) {
                    Profile profile = (Profile) obj;
                    if (this.mProfileId.equals(profile.mProfileId()) && this.mUser.equals(profile.mUser()) && ((backUpIdentity2 = this.mBackupIdentity) != null ? backUpIdentity2.equals(profile.mBackupIdentity()) : profile.mBackupIdentity() == null) && this.mIdentities.equals(profile.mIdentities()) && this.mFundSources.equals(profile.mFundSources()) && this.mAccountType.equals(profile.mAccountType()) && ((str14 = this.mToken) != null ? str14.equals(profile.mToken()) : profile.mToken() == null) && this.mKyc.equals(profile.mKyc()) && ((str15 = this.mKycLevel) != null ? str15.equals(profile.mKycLevel()) : profile.mKycLevel() == null) && ((str16 = this.mReKycStatus) != null ? str16.equals(profile.mReKycStatus()) : profile.mReKycStatus() == null) && ((str17 = this.mReKycReason) != null ? str17.equals(profile.mReKycReason()) : profile.mReKycReason() == null) && ((str18 = this.mEddStatus) != null ? str18.equals(profile.mEddStatus()) : profile.mEddStatus() == null) && this.mStatus.equals(profile.mStatus()) && this.mPhysicalCard.equals(profile.mPhysicalCard()) && this.mNetwork.equals(profile.mNetwork()) && this.canLinkCard == profile.canLinkCard() && ((privacyPolicy2 = this.mPrivacyPolicy) != null ? privacyPolicy2.equals(profile.mPrivacyPolicy()) : profile.mPrivacyPolicy() == null) && ((str19 = this.mDeviceToken) != null ? str19.equals(profile.mDeviceToken()) : profile.mDeviceToken() == null) && this.mAccountStatus.equals(profile.mAccountStatus()) && this.mHasGovernmentId == profile.mHasGovernmentId() && ((str20 = this.mWalletId) != null ? str20.equals(profile.mWalletId()) : profile.mWalletId() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (((this.mProfileId.hashCode() ^ 1000003) * 1000003) ^ this.mUser.hashCode()) * 1000003;
                BackUpIdentity backUpIdentity2 = this.mBackupIdentity;
                int iHashCode2 = (((((((iHashCode ^ (backUpIdentity2 == null ? 0 : backUpIdentity2.hashCode())) * 1000003) ^ this.mIdentities.hashCode()) * 1000003) ^ this.mFundSources.hashCode()) * 1000003) ^ this.mAccountType.hashCode()) * 1000003;
                String str14 = this.mToken;
                int iHashCode3 = (((iHashCode2 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003) ^ this.mKyc.hashCode()) * 1000003;
                String str15 = this.mKycLevel;
                int iHashCode4 = (iHashCode3 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.mReKycStatus;
                int iHashCode5 = (iHashCode4 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.mReKycReason;
                int iHashCode6 = (iHashCode5 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.mEddStatus;
                int iHashCode7 = (((((((((iHashCode6 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003) ^ this.mStatus.hashCode()) * 1000003) ^ this.mPhysicalCard.hashCode()) * 1000003) ^ this.mNetwork.hashCode()) * 1000003) ^ (this.canLinkCard ? 1231 : 1237)) * 1000003;
                PrivacyPolicy privacyPolicy2 = this.mPrivacyPolicy;
                int iHashCode8 = (iHashCode7 ^ (privacyPolicy2 == null ? 0 : privacyPolicy2.hashCode())) * 1000003;
                String str19 = this.mDeviceToken;
                int iHashCode9 = (((((iHashCode8 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003) ^ this.mAccountStatus.hashCode()) * 1000003) ^ (this.mHasGovernmentId ? 1231 : 1237)) * 1000003;
                String str20 = this.mWalletId;
                return iHashCode9 ^ (str20 != null ? str20.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("account_status")
            public String mAccountStatus() {
                return this.mAccountStatus;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public AccountType mAccountType() {
                return this.mAccountType;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("backup_identity")
            public BackUpIdentity mBackupIdentity() {
                return this.mBackupIdentity;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("device_token")
            public String mDeviceToken() {
                return this.mDeviceToken;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("edd_status")
            public String mEddStatus() {
                return this.mEddStatus;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("fund_sources")
            public List<FundSource> mFundSources() {
                return this.mFundSources;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("has_gov_id")
            public boolean mHasGovernmentId() {
                return this.mHasGovernmentId;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("identities")
            public List<Identity> mIdentities() {
                return this.mIdentities;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("kyc")
            public String mKyc() {
                return this.mKyc;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("kyc_level")
            public String mKycLevel() {
                return this.mKycLevel;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("network")
            public String mNetwork() {
                return this.mNetwork;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("physical_card")
            public String mPhysicalCard() {
                return this.mPhysicalCard;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("privacy_policy")
            public PrivacyPolicy mPrivacyPolicy() {
                return this.mPrivacyPolicy;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("profile_id")
            public String mProfileId() {
                return this.mProfileId;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("re_kyc_reason")
            public String mReKycReason() {
                return this.mReKycReason;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("re_kyc_status")
            public String mReKycStatus() {
                return this.mReKycStatus;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b("status")
            public String mStatus() {
                return this.mStatus;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b(MPDbAdapter.KEY_TOKEN)
            public String mToken() {
                return this.mToken;
            }

            @Override // com.paymaya.domain.model.Profile
            @InterfaceC1498b(Scopes.PROFILE)
            public User mUser() {
                return this.mUser;
            }

            @Override // com.paymaya.domain.model.Profile
            @Nullable
            @InterfaceC1498b("wallet_id")
            public String mWalletId() {
                return this.mWalletId;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Profile{mProfileId=");
                sb2.append(this.mProfileId);
                sb2.append(", mUser=");
                sb2.append(this.mUser);
                sb2.append(", mBackupIdentity=");
                sb2.append(this.mBackupIdentity);
                sb2.append(", mIdentities=");
                sb2.append(this.mIdentities);
                sb2.append(", mFundSources=");
                sb2.append(this.mFundSources);
                sb2.append(", mAccountType=");
                sb2.append(this.mAccountType);
                sb2.append(", mToken=");
                sb2.append(this.mToken);
                sb2.append(", mKyc=");
                sb2.append(this.mKyc);
                sb2.append(", mKycLevel=");
                sb2.append(this.mKycLevel);
                sb2.append(", mReKycStatus=");
                sb2.append(this.mReKycStatus);
                sb2.append(", mReKycReason=");
                sb2.append(this.mReKycReason);
                sb2.append(", mEddStatus=");
                sb2.append(this.mEddStatus);
                sb2.append(", mStatus=");
                sb2.append(this.mStatus);
                sb2.append(", mPhysicalCard=");
                sb2.append(this.mPhysicalCard);
                sb2.append(", mNetwork=");
                sb2.append(this.mNetwork);
                sb2.append(", canLinkCard=");
                sb2.append(this.canLinkCard);
                sb2.append(", mPrivacyPolicy=");
                sb2.append(this.mPrivacyPolicy);
                sb2.append(", mDeviceToken=");
                sb2.append(this.mDeviceToken);
                sb2.append(", mAccountStatus=");
                sb2.append(this.mAccountStatus);
                sb2.append(", mHasGovernmentId=");
                sb2.append(this.mHasGovernmentId);
                sb2.append(", mWalletId=");
                return s.p(sb2, this.mWalletId, "}");
            }
        };
    }
}
