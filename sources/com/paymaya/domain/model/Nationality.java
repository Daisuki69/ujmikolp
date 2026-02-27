package com.paymaya.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Nationality;
import com.paymaya.domain.model.C$AutoValue_Nationality;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Nationality {

    public static abstract class Builder {
        public abstract Nationality build();

        public abstract Builder mCode(String str);

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Nationality.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Nationality.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("code")
    public abstract String mCode();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();
}
