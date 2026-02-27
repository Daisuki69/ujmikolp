package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Validation;
import com.paymaya.domain.model.C$AutoValue_Validation;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Validation {

    public static abstract class Builder {
        public abstract Validation build();

        public abstract Builder mName(String str);

        public abstract Builder mPattern(@Nullable String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Validation.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Validation.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("pattern")
    public abstract String mPattern();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
