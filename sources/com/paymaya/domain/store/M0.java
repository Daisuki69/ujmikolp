package com.paymaya.domain.store;

import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.ShopProviderCategory;
import java.util.List;
import kotlin.Pair;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class M0 implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0 f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11373b;

    public /* synthetic */ M0(O0 o02, String str) {
        this.f11372a = o02;
        this.f11373b = str;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        List items = (List) obj;
        kotlin.jvm.internal.j.g(items, "items");
        O0 o02 = this.f11372a;
        com.paymaya.data.database.repository.B b8 = o02.c;
        b8.f11294a.b("shop_provider", "", null);
        b8.f11294a.c("shop_provider", com.paymaya.data.database.repository.B.a(items));
        String str = this.f11373b;
        if (str != null) {
            com.paymaya.data.preference.a aVar = o02.e;
            aVar.f11330b.edit().putString("key_shop_providers_collection_date", str).apply();
            LocalDateTime localDateTimeE = AbstractC1234x.e(str);
            if (localDateTimeE != null) {
                for (ShopProviderCategory shopProviderCategory : o02.f11379d.a(new Kh.I(9))) {
                    if (shopProviderCategory.getCode() != null) {
                        String str2 = (String) aVar.A().get(shopProviderCategory.getCode());
                        LocalDateTime localDateTimeE2 = str2 != null ? AbstractC1234x.e(str2) : null;
                        if (localDateTimeE2 == null || localDateTimeE.isAfter(localDateTimeE2)) {
                            aVar.s0(shopProviderCategory.getCode(), str);
                        }
                    }
                }
            }
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Response response = (Response) obj;
        kotlin.jvm.internal.j.g(response, "response");
        String str = response.headers().get("Last-Modified");
        LocalDateTime localDateTimeE = AbstractC1234x.e(str);
        String str2 = (String) this.f11372a.e.A().get(this.f11373b);
        LocalDateTime localDateTimeE2 = str2 != null ? AbstractC1234x.e(str2) : null;
        return new Pair(Boolean.valueOf(localDateTimeE2 == null || localDateTimeE == null || localDateTimeE.isAfter(localDateTimeE2)), str);
    }
}
