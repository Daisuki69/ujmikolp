package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionAction;
import com.paymaya.domain.model.C$AutoValue_MissionAction;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionAction implements Parcelable {

    public static abstract class Builder {
        public abstract MissionAction build();

        public abstract Builder mCompleted(boolean z4);

        public abstract Builder mDescription(@Nullable String str);

        public abstract Builder mName(String str);

        public abstract Builder mOngoing(@Nullable Boolean bool);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionAction.Builder().mCompleted(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionAction.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("completed")
    public abstract boolean mCompleted();

    @Nullable
    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("ongoing")
    public abstract Boolean mOngoing();
}
