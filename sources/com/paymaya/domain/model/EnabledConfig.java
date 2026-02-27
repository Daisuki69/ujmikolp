package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_EnabledConfig;
import com.paymaya.domain.model.C$AutoValue_EnabledConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EnabledConfig {

    public static abstract class Builder {
        public abstract EnabledConfig build();

        public abstract Builder mIsEnabled(boolean z4);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_EnabledConfig.Builder().mIsEnabled(false);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_EnabledConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(Constants.ENABLED)
    public abstract boolean mIsEnabled();

    public abstract Builder toBuilder();
}
