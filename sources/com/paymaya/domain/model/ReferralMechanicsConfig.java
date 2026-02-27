package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ReferralMechanicsConfig;
import com.paymaya.domain.model.C$AutoValue_ReferralMechanicsConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReferralMechanicsConfig {

    public static abstract class Builder {
        public abstract ReferralMechanicsConfig build();

        public abstract Builder mBannerInviteFriends(String str);

        public abstract Builder mEnterInviteCode(String str);

        public abstract Builder mInviteFriends(String str);

        public abstract Builder mShareMessageInviteFriends(String str);

        public abstract Builder mSuccessInviteCode(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ReferralMechanicsConfig.Builder().mEnterInviteCode("").mInviteFriends("").mSuccessInviteCode("").mBannerInviteFriends("").mShareMessageInviteFriends("");
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ReferralMechanicsConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("banner_invite_friends")
    public abstract String mBannerInviteFriends();

    @InterfaceC1498b("enter_invite_code")
    public abstract String mEnterInviteCode();

    @InterfaceC1498b("invite_friends")
    public abstract String mInviteFriends();

    @InterfaceC1498b("share_message_invite_friends")
    public abstract String mShareMessageInviteFriends();

    @InterfaceC1498b("success_invite_code")
    public abstract String mSuccessInviteCode();

    public abstract Builder toBuilder();
}
