package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_LoadUpPartner;
import com.paymaya.domain.model.C$AutoValue_LoadUpPartner;
import com.paymaya.domain.model.LoadUpPartnerItem;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadUpPartner implements Parcelable, LoadUpPartnerItem {

    public static abstract class Builder {
        public abstract LoadUpPartner build();

        public abstract Builder mChannel(String str);

        public abstract Builder mIconUrl(ImageUrl imageUrl);

        public abstract Builder mId(String str);

        public abstract Builder mLimitMax(Amount amount);

        public abstract Builder mLimitMin(Amount amount);

        public abstract Builder mMaintenance(MaintenanceDate maintenanceDate);

        public abstract Builder mName(String str);

        public abstract Builder mNoFeeDisplay(boolean z4);

        public abstract Builder mNote(String str);

        public abstract Builder mSlug(String str);

        public abstract Builder mSteps(@Nullable String str);

        public abstract Builder mSubtitle(@Nullable String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_LoadUpPartner.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_LoadUpPartner.GsonTypeAdapter(jVar);
    }

    public String getLimitMaxValue() {
        return mLimitMax().mValue();
    }

    public String getLimitMinValue() {
        return mLimitMin().mValue();
    }

    @Override // com.paymaya.domain.model.LoadUpPartnerItem
    public LoadUpPartnerItem.VIEW_TYPE getViewType() {
        return LoadUpPartnerItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    @Nullable
    @InterfaceC1498b(AppsFlyerProperties.CHANNEL)
    public abstract String mChannel();

    @InterfaceC1498b("icon_url")
    public abstract ImageUrl mIconUrl();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("limit_max")
    public abstract Amount mLimitMax();

    @InterfaceC1498b("limit_min")
    public abstract Amount mLimitMin();

    @InterfaceC1498b("maintenance")
    public abstract MaintenanceDate mMaintenance();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("no_fee_display")
    public abstract boolean mNoFeeDisplay();

    @Nullable
    @InterfaceC1498b("note")
    public abstract String mNote();

    @InterfaceC1498b("slug")
    public abstract String mSlug();

    @Nullable
    @InterfaceC1498b("steps")
    public abstract String mSteps();

    @Nullable
    @InterfaceC1498b("subtitle")
    public abstract String mSubtitle();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    public abstract Builder toBuilder();
}
