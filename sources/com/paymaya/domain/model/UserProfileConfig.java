package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_UserProfileConfig;
import com.paymaya.domain.model.C$AutoValue_UserProfileConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UserProfileConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract UserProfileConfig build();

        public abstract Builder mIsUserProfileUpdateEnabled(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            return new C$AutoValue_UserProfileConfig.Builder().mIsUserProfileUpdateEnabled(Boolean.FALSE);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_UserProfileConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("update_v1_android")
    public abstract Boolean mIsUserProfileUpdateEnabled();

    public abstract Builder toBuilder();
}
