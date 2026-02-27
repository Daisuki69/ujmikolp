package com.paymaya.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_IncomeSource;
import com.paymaya.domain.model.C$AutoValue_IncomeSource;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IncomeSource {

    public static abstract class Builder {
        public abstract IncomeSource build();

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_IncomeSource.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_IncomeSource.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();
}
