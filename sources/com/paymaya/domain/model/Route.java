package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Route;
import com.paymaya.domain.model.C$AutoValue_Route;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Route implements Parcelable {

    public static abstract class Builder {
        public abstract Route build();

        public abstract Builder mDestination(Stop stop);

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mOperator(String str);

        public abstract Builder mOrigin(Stop stop);

        public abstract Builder mStops(List<Stop> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Route.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Route.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("destination")
    public abstract Stop mDestination();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("operator")
    public abstract String mOperator();

    @InterfaceC1498b("origin")
    public abstract Stop mOrigin();

    @Nullable
    @InterfaceC1498b("stops")
    public abstract List<Stop> mStops();

    public abstract Builder toBuilder();
}
