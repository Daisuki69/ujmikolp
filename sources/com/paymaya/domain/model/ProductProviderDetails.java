package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ProductProviderDetails;
import com.paymaya.domain.model.C$AutoValue_ProductProviderDetails;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProductProviderDetails implements Parcelable {

    public static abstract class Builder {
        public abstract ProductProviderDetails build();

        public abstract Builder mProductProviderFields(List<ProductProviderField> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ProductProviderDetails.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ProductProviderDetails.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("fields")
    public abstract List<ProductProviderField> mProductProviderFields();

    public abstract Builder toBuilder();
}
