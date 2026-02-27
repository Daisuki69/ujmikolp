package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaRegistrationConfig;
import com.paymaya.domain.model.C$AutoValue_MayaRegistrationConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaRegistrationConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaRegistrationConfig build();

        public abstract Builder mAutoProvision(Boolean bool);

        public abstract Builder mConsentCheckAll(Boolean bool);

        public abstract Builder mRequireMiddleName(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_MayaRegistrationConfig.Builder builder = new C$AutoValue_MayaRegistrationConfig.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mConsentCheckAll(bool).mRequireMiddleName(bool).mAutoProvision(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_MayaRegistrationConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("auto_provision_android")
    public abstract Boolean mAutoProvision();

    @InterfaceC1498b("consent_check_all")
    public abstract Boolean mConsentCheckAll();

    @InterfaceC1498b("require_middle_name_android")
    public abstract Boolean mRequireMiddleName();

    public abstract Builder toBuilder();
}
