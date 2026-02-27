package com.paymaya.domain.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_AccountType;
import com.paymaya.domain.model.C$AutoValue_AccountType;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountType {

    public static abstract class Builder {
        public abstract AccountType build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mDescription(String str);

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mRegion(Region region);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccountType.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccountType.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b(TtmlNode.TAG_REGION)
    public abstract Region mRegion();

    @InterfaceC1498b("status")
    public abstract String mStatus();
}
