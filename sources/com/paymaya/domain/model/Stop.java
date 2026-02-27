package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Stop;
import com.paymaya.domain.model.C$AutoValue_Stop;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Stop implements Parcelable, MayaChoicesAdapterItem {

    public static abstract class Builder {
        public abstract Stop build();

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Stop.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Stop.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.MayaChoicesAdapterItem
    @NonNull
    public String getItemAsString() {
        return mName();
    }

    @Override // com.paymaya.domain.model.MayaChoicesAdapterItem
    public int getViewType() {
        return 1;
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract Builder toBuilder();
}
