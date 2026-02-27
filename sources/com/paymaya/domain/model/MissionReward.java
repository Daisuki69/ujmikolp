package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionReward;
import com.paymaya.domain.model.C$AutoValue_MissionReward;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionReward implements Parcelable {

    public static abstract class Builder {
        public abstract MissionReward build();

        public abstract Builder mDescription(@Nullable String str);

        public abstract Builder mName(@Nullable String str);

        public abstract Builder mPreviewIcon(@Nullable String str);

        public abstract Builder mTitle(@Nullable String str);

        public abstract Builder mType(@Nullable String str);

        public abstract Builder mValue(double d10);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionReward.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionReward.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("description")
    public abstract String mDescription();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("preview_icon")
    public abstract String mPreviewIcon();

    @Nullable
    @InterfaceC1498b("title")
    public abstract String mTitle();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @InterfaceC1498b("value")
    public abstract double mValue();
}
