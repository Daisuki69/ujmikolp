package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.AutoValue_ShopConfig;
import com.paymaya.domain.model.C$AutoValue_ShopConfig;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopConfig {

    public static abstract class Builder {
        public abstract ShopConfig build();

        public abstract Builder mDefaultCategory(String str);

        public abstract Builder mDefaultProductTypes(List<String> list);

        public abstract Builder mHome(ShopHome shopHome);

        public abstract Builder mTreatsNetworks(List<String> list);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ShopConfig.Builder().mHome(ShopHome.sBuilder().build()).mTreatsNetworks(new ArrayList()).mDefaultCategory("Load").mDefaultProductTypes(new ArrayList(AbstractC1233w.f11233a));
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ShopConfig.GsonTypeAdapter(jVar);
    }

    public List<String> getTrimmedDefaultProductTypes() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = mDefaultProductTypes().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trim());
        }
        return arrayList;
    }

    @InterfaceC1498b("default_category")
    public abstract String mDefaultCategory();

    @InterfaceC1498b("default_product_types")
    public abstract List<String> mDefaultProductTypes();

    @InterfaceC1498b("home")
    public abstract ShopHome mHome();

    @InterfaceC1498b("treats_networks")
    public abstract List<String> mTreatsNetworks();

    public abstract Builder toBuilder();
}
