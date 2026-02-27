package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_OrderProviderField;
import com.paymaya.domain.model.C$AutoValue_OrderProviderField;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OrderProviderField implements Parcelable {

    public static abstract class Builder {
        public abstract OrderProviderField build();

        public abstract Builder mCode(String str);

        public abstract Builder mIsHidden(@Nullable Boolean bool);

        public abstract Builder mName(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_OrderProviderField.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_OrderProviderField.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("code")
    public abstract String mCode();

    @Nullable
    @InterfaceC1498b("hidden")
    public abstract Boolean mIsHidden();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
