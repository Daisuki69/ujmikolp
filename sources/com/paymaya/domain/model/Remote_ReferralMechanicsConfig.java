package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ReferralMechanicsConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ReferralMechanicsConfig<T extends ReferralMechanicsConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ReferralMechanicsConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mBannerInviteFriends() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "banner_invite_friends");
    }

    public String mEnterInviteCode() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "enter_invite_code");
    }

    public String mInviteFriends() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "invite_friends");
    }

    public String mShareMessageInviteFriends() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "share_message_invite_friends");
    }

    public String mSuccessInviteCode() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "success_invite_code");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "enter_invite_code"), this.mTarget.mEnterInviteCode());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "invite_friends"), this.mTarget.mInviteFriends());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "success_invite_code"), this.mTarget.mSuccessInviteCode());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "banner_invite_friends"), this.mTarget.mBannerInviteFriends());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "share_message_invite_friends"), this.mTarget.mShareMessageInviteFriends());
    }

    public void updateConfig() {
        ReferralMechanicsConfig.Builder builder = this.mTarget.toBuilder();
        builder.mEnterInviteCode(this.mRemoteConfig.g(mEnterInviteCode()));
        builder.mInviteFriends(this.mRemoteConfig.g(mInviteFriends()));
        builder.mSuccessInviteCode(this.mRemoteConfig.g(mSuccessInviteCode()));
        builder.mBannerInviteFriends(this.mRemoteConfig.g(mBannerInviteFriends()));
        builder.mShareMessageInviteFriends(this.mRemoteConfig.g(mShareMessageInviteFriends()));
        this.mTarget = (T) builder.build();
    }
}
