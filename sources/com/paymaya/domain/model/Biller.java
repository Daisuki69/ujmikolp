package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillerItem;
import com.paymaya.domain.model.C$$AutoValue_Biller;
import com.paymaya.domain.model.C$AutoValue_Biller;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Biller implements Parcelable, BillerItem {

    public static abstract class Builder {
        public abstract Biller build();

        public abstract Builder mAccountNumber(@Nullable String str);

        public abstract Builder mActive(@Nullable Boolean bool);

        public abstract Builder mCategory(@Nullable String str);

        public abstract Builder mCategorySlug(@Nullable String str);

        public abstract Builder mConfirmationUrl(@Nullable ImageUrl imageUrl);

        public abstract Builder mDynamicFields(@Nullable List<BillerDynamicField> list);

        public abstract Builder mHasOtherCharges(@Nullable Boolean bool);

        public abstract Builder mIconUrl(@Nullable ImageUrl imageUrl);

        public abstract Builder mListUrl(@Nullable ImageUrl imageUrl);

        public abstract Builder mMetadata(@Nullable BillerMetadata billerMetadata);

        public abstract Builder mName(@Nullable String str);

        public abstract Builder mOtherFields(@Nullable List<UIComponent> list);

        public abstract Builder mPaymentMethod(@Nullable List<String> list);

        public abstract Builder mSlug(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Biller.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Biller.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.BillerItem
    public BillerItem.VIEW_TYPE getViewType() {
        return BillerItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    @Nullable
    @InterfaceC1498b("account_number")
    public abstract String mAccountNumber();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public abstract Boolean mActive();

    @Nullable
    @InterfaceC1498b("category")
    public abstract String mCategory();

    @Nullable
    @InterfaceC1498b("categorySlug")
    public abstract String mCategorySlug();

    @Nullable
    @InterfaceC1498b("confirmationUrl")
    public abstract ImageUrl mConfirmationUrl();

    @Nullable
    @InterfaceC1498b("other_fields")
    public abstract List<BillerDynamicField> mDynamicFields();

    @Nullable
    @InterfaceC1498b("hasOtherCharges")
    public abstract Boolean mHasOtherCharges();

    @Nullable
    @InterfaceC1498b("iconUrl")
    public abstract ImageUrl mIconUrl();

    @Nullable
    @InterfaceC1498b("listUrl")
    public abstract ImageUrl mListUrl();

    @Nullable
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    public abstract BillerMetadata mMetadata();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b("otherFields")
    public abstract List<UIComponent> mOtherFields();

    @Nullable
    @InterfaceC1498b("paymentMethods")
    public abstract List<String> mPaymentMethod();

    @InterfaceC1498b("slug")
    public abstract String mSlug();

    public abstract Builder toBuilder();
}
