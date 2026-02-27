package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_EkycAccountType;
import com.paymaya.domain.model.C$AutoValue_EkycAccountType;
import com.paymaya.domain.model.EkycAccountTypeAdapterItem;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EkycAccountType implements Parcelable, EkycAccountTypeAdapterItem {

    public static abstract class Builder {
        public abstract EkycAccountType build();

        public abstract Builder mAccountType(String str);

        public abstract Builder mClassification(String str);

        public abstract Builder mName(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_EkycAccountType.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_EkycAccountType.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.EkycAccountTypeAdapterItem
    public EkycAccountTypeAdapterItem.VIEW_TYPE getViewType() {
        return EkycAccountTypeAdapterItem.VIEW_TYPE.VIEW_TYPE_ACCOUNT_TYPE;
    }

    @InterfaceC1498b("account_type")
    public abstract String mAccountType();

    @InterfaceC1498b("classification")
    public abstract String mClassification();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
