package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Operator;
import com.paymaya.domain.model.C$AutoValue_Operator;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Operator implements Parcelable {

    public static abstract class Builder {
        public abstract Operator build();

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Operator.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Operator.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
