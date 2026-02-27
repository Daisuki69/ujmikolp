package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Identity;
import com.paymaya.domain.model.C$AutoValue_Identity;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Identity implements Parcelable {

    public static abstract class Builder {
        public abstract Identity build();

        public abstract Builder mRegistrationId(@Nullable String str);

        public abstract Builder mType(String str);

        public abstract Builder mValue(String str);

        public abstract Builder mVerified(@Nullable Boolean bool);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Identity.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Identity.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("registration_id")
    public abstract String mRegistrationId();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @InterfaceC1498b("value")
    public abstract String mValue();

    @Nullable
    @InterfaceC1498b("verified")
    public abstract Boolean mVerified();
}
