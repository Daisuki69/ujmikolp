package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AccessToken;
import com.paymaya.domain.model.C$AutoValue_AccessToken;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccessToken {

    public static abstract class Builder {
        public abstract AccessToken build();

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccessToken.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccessToken.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("access_token")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
