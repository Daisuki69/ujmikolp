package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_UIComponent;
import com.paymaya.domain.model.C$AutoValue_UIComponent;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UIComponent implements Parcelable {

    public static abstract class Builder {
        public abstract UIComponent build();

        public abstract Builder dateFormat(String str);

        public abstract Builder day(boolean z4);

        public abstract Builder defaultValue(String str);

        public abstract Builder month(boolean z4);

        public abstract Builder parameter(String str);

        public abstract Builder placeholder(String str);

        public abstract Builder regex(String str);

        public abstract Builder required(boolean z4);

        public abstract Builder type(String str);

        public abstract Builder values(List<UIValue> list);

        public abstract Builder year(boolean z4);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_UIComponent.Builder().required(false).day(false).month(false).year(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_UIComponent.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("dateFormat")
    public abstract String dateFormat();

    @InterfaceC1498b("day")
    public abstract boolean day();

    @Nullable
    @InterfaceC1498b("defaultValue")
    public abstract String defaultValue();

    @InterfaceC1498b("month")
    public abstract boolean month();

    @InterfaceC1498b(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)
    public abstract String parameter();

    @InterfaceC1498b("placeholder")
    public abstract String placeholder();

    @Nullable
    @InterfaceC1498b("regex")
    public abstract String regex();

    @InterfaceC1498b("required")
    public abstract boolean required();

    public abstract Builder toBuilder();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String type();

    @Nullable
    @InterfaceC1498b("values")
    public abstract List<UIValue> values();

    @InterfaceC1498b("year")
    public abstract boolean year();
}
