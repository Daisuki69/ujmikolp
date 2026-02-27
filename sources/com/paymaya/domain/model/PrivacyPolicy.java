package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_PrivacyPolicy;
import com.paymaya.domain.model.C$AutoValue_PrivacyPolicy;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PrivacyPolicy {

    public static abstract class Builder {
        public abstract PrivacyPolicy build();

        public abstract Builder mStatus(String str);

        public abstract Builder mVersion(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_PrivacyPolicy.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_PrivacyPolicy.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("version")
    public abstract String mVersion();
}
