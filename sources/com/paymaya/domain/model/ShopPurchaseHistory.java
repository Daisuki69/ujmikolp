package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.C$$AutoValue_ShopPurchaseHistory;
import com.paymaya.domain.model.C$AutoValue_ShopPurchaseHistory;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import g3.InterfaceC1498b;
import java.util.List;
import java.util.Locale;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopPurchaseHistory implements Parcelable, Dated, ShopHomeCarouselListItem {

    public static abstract class Builder {
        public abstract ShopPurchaseHistory build();

        public abstract Builder mAvailableReceipt(boolean z4);

        public abstract Builder mCode(String str);

        public abstract Builder mCreatedAt(String str);

        public abstract Builder mIconUrl(String str);

        public abstract Builder mImageUrl(String str);

        public abstract Builder mIsGifted(boolean z4);

        public abstract Builder mNetwork(String str);

        public abstract Builder mOrderReferenceNumber(String str);

        public abstract Builder mOtherFields(List<OrderProviderField> list);

        public abstract Builder mPage(int i);

        public abstract Builder mPaymentTrn(String str);

        public abstract Builder mPrice(double d10);

        public abstract Builder mProductDescription(String str);

        public abstract Builder mProductId(String str);

        public abstract Builder mProductName(String str);

        public abstract Builder mRecipient(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mUpdatedAt(String str);

        public abstract Builder mWithReceipt(boolean z4);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ShopPurchaseHistory.Builder().mPage(0).mIsGifted(false).mWithReceipt(false).mAvailableReceipt(false).mPrice(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ShopPurchaseHistory.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.Dated
    public DateTime getLocalDateTime() {
        return AbstractC1234x.b(mCreatedAt());
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDateHeader(Locale locale) {
        return AbstractC1234x.h(getLocalDateTime());
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDisplay(Locale locale) {
        return AbstractC1234x.f11250d.withLocale(AbstractC1234x.l()).print(getLocalDateTime());
    }

    @Override // com.paymaya.domain.model.Dated
    public String getMayaLocalDateTimeForDateHeader(Locale locale, boolean z4) {
        return AbstractC1234x.h(getLocalDateTime());
    }

    @Override // com.paymaya.domain.model.ShopHomeCarouselListItem
    @NonNull
    public ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM getViewTypeShopHomeCarouselItem() {
        return ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE;
    }

    @InterfaceC1498b("available_receipt")
    public abstract boolean mAvailableReceipt();

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @Nullable
    @InterfaceC1498b(MPDbAdapter.KEY_CREATED_AT)
    public abstract String mCreatedAt();

    @Nullable
    @InterfaceC1498b("icon_url")
    public abstract String mIconUrl();

    @Nullable
    @InterfaceC1498b("image_url")
    public abstract String mImageUrl();

    @InterfaceC1498b("gifted")
    public abstract boolean mIsGifted();

    @Nullable
    @InterfaceC1498b("network")
    public abstract String mNetwork();

    @InterfaceC1498b("order_reference_number")
    public abstract String mOrderReferenceNumber();

    @Nullable
    @InterfaceC1498b("other_fields")
    public abstract List<OrderProviderField> mOtherFields();

    public abstract int mPage();

    @Nullable
    @InterfaceC1498b("payment_trn")
    public abstract String mPaymentTrn();

    @InterfaceC1498b("price")
    public abstract double mPrice();

    @Nullable
    @InterfaceC1498b("product_description")
    public abstract String mProductDescription();

    @InterfaceC1498b("product_id")
    public abstract String mProductId();

    @Nullable
    @InterfaceC1498b("product_name")
    public abstract String mProductName();

    @Nullable
    @InterfaceC1498b("recipient")
    public abstract String mRecipient();

    @InterfaceC1498b("status")
    public abstract String mStatus();

    @Nullable
    @InterfaceC1498b("updated_at")
    public abstract String mUpdatedAt();

    @InterfaceC1498b("with_receipt")
    public abstract boolean mWithReceipt();

    public abstract Builder toBuilder();
}
