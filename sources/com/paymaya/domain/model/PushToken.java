package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PushToken;
import com.paymaya.domain.model.C$AutoValue_PushToken;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PushToken implements Parcelable {

    public static abstract class Builder {
        public abstract PushToken build();

        public abstract Builder mToken(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PushToken.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PushToken.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("push_token")
    public abstract String mToken();
}
