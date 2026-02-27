package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_OTP;
import com.paymaya.domain.model.C$AutoValue_OTP;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OTP {

    public static abstract class Builder {
        public abstract OTP build();

        public abstract Builder mOtpId(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_OTP.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_OTP.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("otp_id")
    public abstract String mOtpId();
}
