package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_RedirectUrls;
import com.paymaya.domain.model.C$AutoValue_RedirectUrls;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RedirectUrls implements Parcelable {

    public static abstract class Builder {
        public abstract RedirectUrls build();

        public abstract Builder mCancel(String str);

        public abstract Builder mFailure(String str);

        public abstract Builder mSuccess(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_RedirectUrls.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_RedirectUrls.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("cancel")
    public abstract String mCancel();

    @InterfaceC1498b("failure")
    public abstract String mFailure();

    @InterfaceC1498b("success")
    public abstract String mSuccess();

    public abstract Builder toBuilder();
}
