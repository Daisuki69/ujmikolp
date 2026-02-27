package com.paymaya.domain.store;

import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopPurchaseHistory;
import ej.C1449a;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11376a;

    public /* synthetic */ N0(int i) {
        this.f11376a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11376a) {
            case 0:
                String displayName = ((ShopProvider) obj).getDisplayName();
                Locale locale = Locale.ROOT;
                String lowerCase = displayName.toLowerCase(locale);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((ShopProvider) obj2).getDisplayName().toLowerCase(locale);
                kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
                return C1449a.a(lowerCase, lowerCase2);
            case 1:
                return C1449a.a(Boolean.valueOf(((ShopProvider) obj).getPriority() == null), Boolean.valueOf(((ShopProvider) obj2).getPriority() == null));
            default:
                ShopPurchaseHistory shopPurchaseHistory = (ShopPurchaseHistory) obj2;
                ShopPurchaseHistory shopPurchaseHistory2 = (ShopPurchaseHistory) obj;
                return C1449a.a(Long.valueOf(shopPurchaseHistory.mCreatedAt() == null ? 0L : shopPurchaseHistory.getLocalDateTime().getMillis()), Long.valueOf(shopPurchaseHistory2.mCreatedAt() != null ? shopPurchaseHistory2.getLocalDateTime().getMillis() : 0L));
        }
    }
}
