package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Registration;
import com.paymaya.domain.model.C$AutoValue_Registration;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Registration {

    public static abstract class Builder {
        public abstract Registration build();

        public abstract Builder mIdentity(@Nullable Identity identity);

        public abstract Builder mRegistrationId(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Registration.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Registration.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("identity")
    public abstract Identity mIdentity();

    @InterfaceC1498b("registration_id")
    public abstract String mRegistrationId();
}
