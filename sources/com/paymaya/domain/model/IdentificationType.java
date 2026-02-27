package com.paymaya.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_IdentificationType;
import com.paymaya.domain.model.C$AutoValue_IdentificationType;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IdentificationType {

    public static abstract class Builder {
        public abstract IdentificationType build();

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_IdentificationType.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_IdentificationType.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();
}
