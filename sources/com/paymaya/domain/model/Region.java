package com.paymaya.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Region;
import com.paymaya.domain.model.C$AutoValue_Region;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Region {

    public static abstract class Builder {
        public abstract Region build();

        public abstract Builder mRegionId(String str);

        public abstract Builder mRegionLocale(String str);

        public abstract Builder mRegionName(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Region.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Region.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("regionId")
    public abstract String mRegionId();

    @InterfaceC1498b("locale")
    public abstract String mRegionLocale();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mRegionName();
}
