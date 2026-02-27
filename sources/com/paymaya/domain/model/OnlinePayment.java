package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_OnlinePayment;
import com.paymaya.domain.model.C$AutoValue_OnlinePayment;
import com.paymaya.domain.model.OnlinePaymentListItem;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OnlinePayment implements OnlinePaymentListItem {

    public static abstract class Builder {
        public abstract OnlinePayment build();

        public abstract Builder mBackgroundUrl(String str);

        public abstract Builder mCategory(String str);

        public abstract Builder mCode(String str);

        public abstract Builder mExternalLink(String str);

        public abstract Builder mIconUrl(String str);

        public abstract Builder mId(String str);

        public abstract Builder mLogoUrl(String str);

        public abstract Builder mMaintenance(MaintenanceDate maintenanceDate);

        public abstract Builder mName(String str);

        public abstract Builder mPriority(int i);

        public abstract Builder mTags(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_OnlinePayment.Builder().mPriority(0);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_OnlinePayment.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.OnlinePaymentListItem
    public OnlinePaymentListItem.VIEW_TYPE getViewType() {
        return OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    public boolean isAvailable() {
        return mMaintenance() == null || mMaintenance().isAvailable();
    }

    public boolean isFlutter() {
        return mTags() != null && mTags().contains("flutter");
    }

    public boolean isInternal() {
        return mTags() != null && mTags().contains("internal");
    }

    public boolean isKycRequired() {
        return mTags() != null && mTags().contains("kyc1");
    }

    public boolean isMiniApp() {
        return mTags() != null && mTags().contains("miniapp");
    }

    @Nullable
    @InterfaceC1498b("background_url")
    public abstract String mBackgroundUrl();

    @InterfaceC1498b("category")
    public abstract String mCategory();

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @InterfaceC1498b("link")
    public abstract String mExternalLink();

    @Nullable
    @InterfaceC1498b("icon_url")
    public abstract String mIconUrl();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("logo_url")
    public abstract String mLogoUrl();

    @Nullable
    @InterfaceC1498b("maintenance")
    public abstract MaintenanceDate mMaintenance();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("priority")
    public abstract int mPriority();

    @Nullable
    @InterfaceC1498b("tags")
    public abstract List<String> mTags();

    public abstract Builder toBuilder();
}
