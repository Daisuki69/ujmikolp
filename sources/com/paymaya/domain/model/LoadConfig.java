package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_LoadConfig;
import com.paymaya.domain.model.C$AutoValue_LoadConfig;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadConfig {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract LoadConfig build();

        public abstract Builder mFavorites(Boolean bool);

        public abstract Builder mRecommender(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_LoadConfig.Builder builder = new C$AutoValue_LoadConfig.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mFavorites(bool).mRecommender(bool);
        }

        public final y typeAdapter(j jVar) {
            return new AutoValue_LoadConfig.GsonTypeAdapter(jVar);
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

    @InterfaceC1498b("favorites")
    public abstract Boolean mFavorites();

    @InterfaceC1498b("recommender")
    public abstract Boolean mRecommender();

    public abstract Builder toBuilder();
}
