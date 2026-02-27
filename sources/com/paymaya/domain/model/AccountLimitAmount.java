package com.paymaya.domain.model;

import androidx.camera.video.AudioStats;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AccountLimitAmount;
import com.paymaya.domain.model.C$AutoValue_AccountLimitAmount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountLimitAmount {

    public static abstract class Builder {
        public abstract AccountLimitAmount build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mLimit(double d10);

        public abstract Builder mRemaining(double d10);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccountLimitAmount.Builder().mLimit(AudioStats.AUDIO_AMPLITUDE_NONE).mRemaining(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccountLimitAmount.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @InterfaceC1498b("limit")
    public abstract double mLimit();

    @InterfaceC1498b("remaining")
    public abstract double mRemaining();
}
