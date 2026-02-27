package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaForgotPasswordConfig;
import com.paymaya.domain.model.C$AutoValue_MayaForgotPasswordConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaForgotPasswordConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaForgotPasswordConfig build();

        public abstract Builder mFrameworkV2Android(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            return new C$AutoValue_MayaForgotPasswordConfig.Builder().mFrameworkV2Android(Boolean.FALSE);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_MayaForgotPasswordConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("framework_v2_android")
    public abstract Boolean mFrameworkV2Android();

    public abstract Builder toBuilder();
}
