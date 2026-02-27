package se;

import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: se.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2255a implements Ch.g, Ch.f, Ch.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2255a f20048b = new C2255a(0);
    public static final C2255a c = new C2255a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2255a f20049d = new C2255a(2);
    public static final C2255a e = new C2255a(3);
    public static final C2255a f = new C2255a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2255a f20050g = new C2255a(5);
    public static final C2255a h = new C2255a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20051a;

    public /* synthetic */ C2255a(int i) {
        this.f20051a = i;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        yk.a.e();
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f20051a) {
            case 1:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, numX49.tnTj78("bF3PE"));
                return new Pair(shopProviderBase, null);
            case 2:
                List list = (List) obj;
                kotlin.jvm.internal.j.g(list, numX49.tnTj78("bF3Pi"));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    List<OrderProviderField> listMOtherFields = ((ShopPurchaseHistory) obj2).mOtherFields();
                    if (listMOtherFields != null) {
                        List<OrderProviderField> list2 = listMOtherFields;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
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
                List list3 = (List) obj;
                kotlin.jvm.internal.j.g(list3, numX49.tnTj78("bF3Pd"));
                return new Pair(list3, null);
            case 4:
                ShopProviderBase shopProviderBase2 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase2, numX49.tnTj78("bF3Pj"));
                return new Pair(shopProviderBase2, null);
            default:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, numX49.tnTj78("bF3PS"));
                return new Pair(productV3Base, null);
        }
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        return ((PushNotification) obj) instanceof ShopPurchaseHistoryPushNotification;
    }
}
