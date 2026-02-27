package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_BackUpIdentity;
import com.paymaya.domain.model.C$AutoValue_BackUpIdentity;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BackUpIdentity {

    public static abstract class Builder {
        public abstract BackUpIdentity build();

        public abstract Builder mIsVerified(@Nullable Boolean bool);

        public abstract Builder mType(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_BackUpIdentity.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_BackUpIdentity.GsonTypeAdapter(jVar);
    }

    public boolean isVerifiedEmail() {
        return mIsVerified() != null && mIsVerified().booleanValue() && "email".equalsIgnoreCase(mType());
    }

    @Nullable
    @InterfaceC1498b("is_verified")
    public abstract Boolean mIsVerified();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
