package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.AutoValue_ShopHome;
import com.paymaya.domain.model.C$AutoValue_ShopHome;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShopHome {

    public static abstract class Builder {
        public abstract ShopHome build();

        public abstract Builder mSections(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ShopHome.Builder().mSections("[{\"name\":\"Favorites\",\"list_type\":\"favorites\",\"position\":1},{\"name\":\"Buy Again\",\"position\":2,\"list_type\":\"buy_again\"},{\"name\":\"Most Popular\",\"position\":3,\"list_type\":\"most_popular\"},{\"name\":\"\",\"position\":4,\"list_type\":\"deals_gam\"},{\"name\":\"Deals & Promos\",\"list_type\":\"deals\",\"position\":5},{\"name\":\"Load\",\"position\":6,\"list_type\":\"load\"},{\"name\":\"Brands for you\",\"position\":7,\"list_type\":\"brands\"}]");
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ShopHome.GsonTypeAdapter(jVar);
    }

    public List<ShopHomeSectionTemplate> getSectionsAsList() {
        return (List) A.f10366a.f(mSections(), new TypeToken<List<ShopHomeSectionTemplate>>() { // from class: com.paymaya.domain.model.ShopHome.1
        }.getType());
    }

    @InterfaceC1498b("sections")
    public abstract String mSections();

    public abstract Builder toBuilder();
}
