package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_InstapayAccount;
import com.paymaya.domain.model.C$AutoValue_InstapayAccount;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InstapayAccount implements Parcelable {

    public static abstract class Builder {
        public abstract InstapayAccount build();

        public abstract Builder mName(String str);

        public abstract Builder mNumber(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_InstapayAccount.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_InstapayAccount.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("number")
    public abstract String mNumber();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
