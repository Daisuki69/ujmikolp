package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaComplianceConfig;
import com.paymaya.domain.model.C$AutoValue_MayaComplianceConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaComplianceConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaComplianceConfig build();

        public abstract Builder mDosri(Boolean bool);

        public abstract Builder mFatca(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_MayaComplianceConfig.Builder builder = new C$AutoValue_MayaComplianceConfig.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mFatca(bool).mDosri(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_MayaComplianceConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("dosri_android")
    public abstract Boolean mDosri();

    @InterfaceC1498b("fatca_android")
    public abstract Boolean mFatca();

    public abstract Builder toBuilder();
}
