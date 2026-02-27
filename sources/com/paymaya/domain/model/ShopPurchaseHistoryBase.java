package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ShopPurchaseHistoryBase;
import com.paymaya.domain.model.C$AutoValue_ShopPurchaseHistoryBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopPurchaseHistoryBase implements Parcelable {

    public static abstract class Builder {
        public abstract ShopPurchaseHistoryBase build();

        public abstract Builder mData(List<ShopPurchaseHistory> list);

        public abstract Builder mMeta(Meta meta);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ShopPurchaseHistoryBase.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ShopPurchaseHistoryBase.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("data")
    public abstract List<ShopPurchaseHistory> mData();

    @InterfaceC1498b("meta")
    public abstract Meta mMeta();
}
