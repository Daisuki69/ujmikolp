package com.paymaya.domain.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_DashboardSettingsTab;
import com.paymaya.domain.model.C$AutoValue_DashboardSettingsTab;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DashboardSettingsTab {

    public static abstract class Builder {
        public abstract DashboardSettingsTab build();

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_DashboardSettingsTab.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_DashboardSettingsTab.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract Builder toBuilder();
}
