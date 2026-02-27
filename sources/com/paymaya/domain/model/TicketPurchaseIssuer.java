package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TicketPurchaseIssuer;
import com.paymaya.domain.model.C$AutoValue_TicketPurchaseIssuer;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TicketPurchaseIssuer implements Parcelable {

    public static abstract class Builder {
        public abstract TicketPurchaseIssuer build();

        public abstract Builder mId(String str);

        public abstract Builder mImageUrl(ImageUrlUnfiltered imageUrlUnfiltered);

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TicketPurchaseIssuer.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TicketPurchaseIssuer.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("confirmation_url")
    public abstract ImageUrlUnfiltered mImageUrl();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract Builder toBuilder();
}
