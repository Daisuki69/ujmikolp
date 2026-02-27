package Xb;

import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: Xb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0612a implements Ch.g, Ch.f, Ch.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0612a f6557b = new C0612a(0);
    public static final C0612a c = new C0612a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0612a f6558d = new C0612a(2);
    public static final C0612a e = new C0612a(3);
    public static final C0612a f = new C0612a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0612a f6559g = new C0612a(5);
    public static final C0612a h = new C0612a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6560a;

    public /* synthetic */ C0612a(int i) {
        this.f6560a = i;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        yk.a.e();
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f6560a) {
            case 1:
                ShopProviderBase providerBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(providerBase, "providerBase");
                return new Pair(providerBase, null);
            case 2:
                List purchaseHistoryList = (List) obj;
                kotlin.jvm.internal.j.g(purchaseHistoryList, "purchaseHistoryList");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : purchaseHistoryList) {
                    List<OrderProviderField> listMOtherFields = ((ShopPurchaseHistory) obj2).mOtherFields();
                    if (listMOtherFields != null) {
                        List<OrderProviderField> list = listMOtherFields;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.j.b(((OrderProviderField) it.next()).mIsHidden(), Boolean.TRUE)) {
                                }
                                break;
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                return arrayList;
            case 3:
                List filteredHistoryList = (List) obj;
                kotlin.jvm.internal.j.g(filteredHistoryList, "filteredHistoryList");
                return new Pair(filteredHistoryList, null);
            case 4:
                ShopProviderBase providerBase2 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(providerBase2, "providerBase");
                return new Pair(providerBase2, null);
            default:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, "productV3Base");
                return new Pair(productV3Base, null);
        }
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        return ((PushNotification) obj) instanceof ShopPurchaseHistoryPushNotification;
    }
}
