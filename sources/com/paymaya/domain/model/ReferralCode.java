package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ReferralCode;
import com.paymaya.domain.model.C$AutoValue_ReferralCode;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReferralCode {

    public static abstract class Builder {
        public abstract ReferralCode build();

        public abstract Builder mReferralCode(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ReferralCode.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ReferralCode.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("referral_code")
    public abstract String mReferralCode();
}
