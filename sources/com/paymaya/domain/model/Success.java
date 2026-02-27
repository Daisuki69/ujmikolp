package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Success;
import com.paymaya.domain.model.C$AutoValue_Success;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Success {

    public static abstract class Builder {
        public abstract Success build();

        public abstract Builder mMessage(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Success.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Success.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("message")
    public abstract String mMessage();

    public abstract Builder toBuilder();
}
