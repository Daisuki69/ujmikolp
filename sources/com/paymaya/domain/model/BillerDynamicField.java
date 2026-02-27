package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BillerDynamicField;
import com.paymaya.domain.model.C$AutoValue_BillerDynamicField;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerDynamicField implements Parcelable {

    public static abstract class Builder {
        public abstract BillerDynamicField build();

        public abstract Builder mLabel(@Nullable String str);

        public abstract Builder mParameter(@Nullable String str);

        public abstract Builder mValue(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillerDynamicField.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerDynamicField.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("placeholder")
    public abstract String mLabel();

    @Nullable
    @InterfaceC1498b(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)
    public abstract String mParameter();

    @Nullable
    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
