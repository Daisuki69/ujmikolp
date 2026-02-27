package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaRegistrationV2Config;
import com.paymaya.domain.model.C$AutoValue_MayaRegistrationV2Config;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaRegistrationV2Config {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaRegistrationV2Config build();

        public abstract Builder mShortenedReg(Boolean bool);

        public abstract Builder mShowDataPrivacyOnAppLaunch(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            return new C$AutoValue_MayaRegistrationV2Config.Builder().mShowDataPrivacyOnAppLaunch(Boolean.TRUE).mShortenedReg(Boolean.FALSE);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_MayaRegistrationV2Config.GsonTypeAdapter(jVar);
        }

        private Companion() {
        }
    }

    public static final Builder sBuilder() {
        return Companion.sBuilder();
    }

    public static final y typeAdapter(j jVar) {
        return Companion.typeAdapter(jVar);
    }

    @InterfaceC1498b("shortened_reg_android")
    public abstract Boolean mShortenedReg();

    @InterfaceC1498b("show_data_privacy_on_app_launch_android")
    public abstract Boolean mShowDataPrivacyOnAppLaunch();

    public abstract Builder toBuilder();
}
