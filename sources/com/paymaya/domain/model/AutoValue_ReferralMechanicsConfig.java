package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ReferralMechanicsConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ReferralMechanicsConfig extends C$AutoValue_ReferralMechanicsConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ReferralMechanicsConfig)";
        }

        @Override // com.google.gson.y
        public ReferralMechanicsConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ReferralMechanicsConfig.Builder builderSBuilder = ReferralMechanicsConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "success_invite_code":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mSuccessInviteCode((String) yVarH.read(aVar));
                            break;
                        case "share_message_invite_friends":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mShareMessageInviteFriends((String) yVarH2.read(aVar));
                            break;
                        case "enter_invite_code":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mEnterInviteCode((String) yVarH3.read(aVar));
                            break;
                        case "invite_friends":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mInviteFriends((String) yVarH4.read(aVar));
                            break;
                        case "banner_invite_friends":
                            y yVarH5 = this.string_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(String.class);
                                this.string_adapter = yVarH5;
                            }
                            builderSBuilder.mBannerInviteFriends((String) yVarH5.read(aVar));
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
        public void write(b bVar, ReferralMechanicsConfig referralMechanicsConfig) throws IOException {
            if (referralMechanicsConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("enter_invite_code");
            if (referralMechanicsConfig.mEnterInviteCode() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, referralMechanicsConfig.mEnterInviteCode());
            }
            bVar.m("invite_friends");
            if (referralMechanicsConfig.mInviteFriends() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, referralMechanicsConfig.mInviteFriends());
            }
            bVar.m("success_invite_code");
            if (referralMechanicsConfig.mSuccessInviteCode() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, referralMechanicsConfig.mSuccessInviteCode());
            }
            bVar.m("banner_invite_friends");
            if (referralMechanicsConfig.mBannerInviteFriends() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, referralMechanicsConfig.mBannerInviteFriends());
            }
            bVar.m("share_message_invite_friends");
            if (referralMechanicsConfig.mShareMessageInviteFriends() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, referralMechanicsConfig.mShareMessageInviteFriends());
            }
            bVar.k();
        }
    }

    public AutoValue_ReferralMechanicsConfig(String str, String str2, String str3, String str4, String str5) {
        new ReferralMechanicsConfig(str, str2, str3, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_ReferralMechanicsConfig
            private final String mBannerInviteFriends;
            private final String mEnterInviteCode;
            private final String mInviteFriends;
            private final String mShareMessageInviteFriends;
            private final String mSuccessInviteCode;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ReferralMechanicsConfig$Builder */
            public static class Builder extends ReferralMechanicsConfig.Builder {
                private String mBannerInviteFriends;
                private String mEnterInviteCode;
                private String mInviteFriends;
                private String mShareMessageInviteFriends;
                private String mSuccessInviteCode;

                public /* synthetic */ Builder(ReferralMechanicsConfig referralMechanicsConfig, int i) {
                    this(referralMechanicsConfig);
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig build() {
                    String strI = this.mEnterInviteCode == null ? " mEnterInviteCode" : "";
                    if (this.mInviteFriends == null) {
                        strI = s.i(strI, " mInviteFriends");
                    }
                    if (this.mSuccessInviteCode == null) {
                        strI = s.i(strI, " mSuccessInviteCode");
                    }
                    if (this.mBannerInviteFriends == null) {
                        strI = s.i(strI, " mBannerInviteFriends");
                    }
                    if (this.mShareMessageInviteFriends == null) {
                        strI = s.i(strI, " mShareMessageInviteFriends");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_ReferralMechanicsConfig(this.mEnterInviteCode, this.mInviteFriends, this.mSuccessInviteCode, this.mBannerInviteFriends, this.mShareMessageInviteFriends);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig.Builder mBannerInviteFriends(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mBannerInviteFriends");
                    }
                    this.mBannerInviteFriends = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig.Builder mEnterInviteCode(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mEnterInviteCode");
                    }
                    this.mEnterInviteCode = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig.Builder mInviteFriends(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mInviteFriends");
                    }
                    this.mInviteFriends = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig.Builder mShareMessageInviteFriends(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mShareMessageInviteFriends");
                    }
                    this.mShareMessageInviteFriends = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ReferralMechanicsConfig.Builder
                public ReferralMechanicsConfig.Builder mSuccessInviteCode(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mSuccessInviteCode");
                    }
                    this.mSuccessInviteCode = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(ReferralMechanicsConfig referralMechanicsConfig) {
                    this.mEnterInviteCode = referralMechanicsConfig.mEnterInviteCode();
                    this.mInviteFriends = referralMechanicsConfig.mInviteFriends();
                    this.mSuccessInviteCode = referralMechanicsConfig.mSuccessInviteCode();
                    this.mBannerInviteFriends = referralMechanicsConfig.mBannerInviteFriends();
                    this.mShareMessageInviteFriends = referralMechanicsConfig.mShareMessageInviteFriends();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mEnterInviteCode");
                }
                this.mEnterInviteCode = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mInviteFriends");
                }
                this.mInviteFriends = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mSuccessInviteCode");
                }
                this.mSuccessInviteCode = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null mBannerInviteFriends");
                }
                this.mBannerInviteFriends = str4;
                if (str5 == null) {
                    throw new NullPointerException("Null mShareMessageInviteFriends");
                }
                this.mShareMessageInviteFriends = str5;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ReferralMechanicsConfig) {
                    ReferralMechanicsConfig referralMechanicsConfig = (ReferralMechanicsConfig) obj;
                    if (this.mEnterInviteCode.equals(referralMechanicsConfig.mEnterInviteCode()) && this.mInviteFriends.equals(referralMechanicsConfig.mInviteFriends()) && this.mSuccessInviteCode.equals(referralMechanicsConfig.mSuccessInviteCode()) && this.mBannerInviteFriends.equals(referralMechanicsConfig.mBannerInviteFriends()) && this.mShareMessageInviteFriends.equals(referralMechanicsConfig.mShareMessageInviteFriends())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((this.mEnterInviteCode.hashCode() ^ 1000003) * 1000003) ^ this.mInviteFriends.hashCode()) * 1000003) ^ this.mSuccessInviteCode.hashCode()) * 1000003) ^ this.mBannerInviteFriends.hashCode()) * 1000003) ^ this.mShareMessageInviteFriends.hashCode();
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            @InterfaceC1498b("banner_invite_friends")
            public String mBannerInviteFriends() {
                return this.mBannerInviteFriends;
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            @InterfaceC1498b("enter_invite_code")
            public String mEnterInviteCode() {
                return this.mEnterInviteCode;
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            @InterfaceC1498b("invite_friends")
            public String mInviteFriends() {
                return this.mInviteFriends;
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            @InterfaceC1498b("share_message_invite_friends")
            public String mShareMessageInviteFriends() {
                return this.mShareMessageInviteFriends;
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            @InterfaceC1498b("success_invite_code")
            public String mSuccessInviteCode() {
                return this.mSuccessInviteCode;
            }

            @Override // com.paymaya.domain.model.ReferralMechanicsConfig
            public ReferralMechanicsConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ReferralMechanicsConfig{mEnterInviteCode=");
                sb2.append(this.mEnterInviteCode);
                sb2.append(", mInviteFriends=");
                sb2.append(this.mInviteFriends);
                sb2.append(", mSuccessInviteCode=");
                sb2.append(this.mSuccessInviteCode);
                sb2.append(", mBannerInviteFriends=");
                sb2.append(this.mBannerInviteFriends);
                sb2.append(", mShareMessageInviteFriends=");
                return s.p(sb2, this.mShareMessageInviteFriends, "}");
            }
        };
    }
}
