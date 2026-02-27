package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillerItem;
import com.paymaya.domain.model.C$$AutoValue_BillerCategory;
import com.paymaya.domain.model.C$AutoValue_BillerCategory;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BillerCategory implements Parcelable, BillerItem {

    public static abstract class Builder {
        public abstract BillerCategory build();

        public abstract Builder mListUrl(String str);

        public abstract Builder mName(String str);

        public abstract Builder mSlug(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BillerCategory.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BillerCategory.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.BillerItem
    public BillerItem.VIEW_TYPE getViewType() {
        return BillerItem.VIEW_TYPE.VIEW_TYPE_CATEGORIES;
    }

    @Nullable
    @InterfaceC1498b("iconUrl")
    public abstract String mListUrl();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("slug")
    public abstract String mSlug();

    public abstract Builder toBuilder();
}
