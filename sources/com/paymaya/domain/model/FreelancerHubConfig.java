package com.paymaya.domain.model;

import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_FreelancerHubConfig;
import com.paymaya.domain.model.C$AutoValue_FreelancerHubConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FreelancerHubConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract FreelancerHubConfig build();

        public abstract Builder mEnabled(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            Builder builderMEnabled = new C$AutoValue_FreelancerHubConfig.Builder().mEnabled(Boolean.FALSE);
            j.f(builderMEnabled, "mEnabled(...)");
            return builderMEnabled;
        }

        public final y typeAdapter(com.google.gson.j jVar) {
            return new AutoValue_FreelancerHubConfig.GsonTypeAdapter(jVar);
        }

        private Companion() {
        }
    }

    public static final Builder sBuilder() {
        return Companion.sBuilder();
    }

    public static final y typeAdapter(com.google.gson.j jVar) {
        return Companion.typeAdapter(jVar);
    }

    @InterfaceC1498b(Constants.ENABLED)
    public abstract Boolean mEnabled();

    public abstract Builder toBuilder();
}
