package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ProductType;
import com.paymaya.domain.model.C$AutoValue_ProductType;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProductType implements Parcelable {

    public static abstract class Builder {
        public abstract ProductType build();

        public abstract Builder mCategoryId(@Nullable String str);

        public abstract Builder mCode(@Nullable String str);

        public abstract Builder mId(@Nullable String str);

        public abstract Builder mName(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ProductType.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ProductType.GsonTypeAdapter(jVar);
    }

    @Nullable
    public abstract String mCategoryId();

    @Nullable
    @InterfaceC1498b("code")
    public abstract String mCode();

    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract Builder toBuilder();
}
