package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ShopCategoryBase;
import com.paymaya.domain.model.C$AutoValue_ShopCategoryBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopCategoryBase implements Parcelable {

    public static abstract class Builder {
        public abstract ShopCategoryBase build();

        public abstract Builder mData(List<ShopCategory> list);

        public abstract Builder mMeta(Meta meta);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ShopCategoryBase.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ShopCategoryBase.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("data")
    public abstract List<ShopCategory> mData();

    @InterfaceC1498b("meta")
    public abstract Meta mMeta();
}
