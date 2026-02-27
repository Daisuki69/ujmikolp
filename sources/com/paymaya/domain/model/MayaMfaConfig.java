package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaMfaConfig;
import com.paymaya.domain.model.C$AutoValue_MayaMfaConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaMfaConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaMfaConfig build();

        public abstract Builder mFaceAuthFormAndroid(Boolean bool);

        public abstract Builder mFrameworkV1Android(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_MayaMfaConfig.Builder builder = new C$AutoValue_MayaMfaConfig.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mFrameworkV1Android(bool).mFaceAuthFormAndroid(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_MayaMfaConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("face_auth_form_android")
    public abstract Boolean mFaceAuthFormAndroid();

    @InterfaceC1498b("framework_v1_android")
    public abstract Boolean mFrameworkV1Android();

    public abstract Builder toBuilder();
}
