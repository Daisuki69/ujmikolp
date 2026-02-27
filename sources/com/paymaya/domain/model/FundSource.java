package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_FundSource;
import com.paymaya.domain.model.C$AutoValue_FundSource;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FundSource implements Parcelable {

    public static abstract class Builder {
        public abstract FundSource build();

        public abstract Builder mCardProfile(CardProfile cardProfile);

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mTransactionEnabled(Boolean bool);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_FundSource.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_FundSource.GsonTypeAdapter(jVar);
    }

    public boolean isBrandPayMaya() {
        return mCardProfile().mBrand().equalsIgnoreCase("Paymaya");
    }

    public boolean isSchemeMastercard() {
        return mCardProfile().mScheme().equalsIgnoreCase("Mastercard");
    }

    public boolean isSchemeVisa() {
        return mCardProfile().mScheme().equalsIgnoreCase("Visa");
    }

    public boolean isStatusActivePhysical() {
        return mStatus().equals("plus") || mStatus().equals("instant_nonkyc");
    }

    public boolean isStatusActiveVirtual() {
        return mStatus().equals("virtual_card");
    }

    public boolean isTypeBlocked() {
        return mType().equalsIgnoreCase("blocked");
    }

    public boolean isTypeBuyCard() {
        return mType().equals("dummy_buy_card");
    }

    public boolean isTypePhysical() {
        return mType().equals("physical");
    }

    public boolean isTypeVirtual() {
        return mType().equals("virtual");
    }

    @Nullable
    @InterfaceC1498b("card_profile")
    public abstract CardProfile mCardProfile();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("transaction_enabled")
    public abstract Boolean mTransactionEnabled();

    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
