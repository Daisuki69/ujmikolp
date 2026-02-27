package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ShopCategory;
import com.paymaya.domain.model.C$AutoValue_ShopCategory;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopCategory implements Parcelable {

    public static abstract class Builder {
        public abstract ShopCategory build();

        public abstract Builder mCode(String str);

        public abstract Builder mId(String str);

        public abstract Builder mName(String str);

        public abstract Builder mProductTypes(List<ProductType> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ShopCategory.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ShopCategory.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @Nullable
    @InterfaceC1498b(alternate = {"subcategories"}, value = "product_types")
    public abstract List<ProductType> mProductTypes();
}
