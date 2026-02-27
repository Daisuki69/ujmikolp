package com.paymaya.domain.store;

import cj.C1110A;
import cj.C1112C;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.MayaXPEntrypointData;
import com.paymaya.domain.model.MayaXPScoreData;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.ProfileCmsData;
import com.paymaya.domain.model.ReferralEligibilityV2;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.model.ShopProviderCategoryBase;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.model.ShopProviderSubcategoryBase;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements Ch.f, Ch.g, Ch.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f11410b = new Z(0);
    public static final Z c = new Z(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z f11411d = new Z(2);
    public static final Z e = new Z(3);
    public static final Z f = new Z(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Z f11412g = new Z(5);
    public static final Z h = new Z(6);
    public static final Z i = new Z(7);
    public static final Z j = new Z(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z f11413k = new Z(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z f11414l = new Z(10);
    public static final Z m = new Z(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Z f11415n = new Z(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Z f11416o = new Z(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Z f11417p = new Z(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Z f11418q = new Z(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z f11419r = new Z(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11420a;

    public /* synthetic */ Z(int i4) {
        this.f11420a = i4;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        ProfileCmsData profileCmsData = (ProfileCmsData) obj;
        MayaUpdateProfileData mayaUpdateProfileData = (MayaUpdateProfileData) obj2;
        kotlin.jvm.internal.j.g(profileCmsData, "profileCmsData");
        kotlin.jvm.internal.j.g(mayaUpdateProfileData, "mayaUpdateProfileData");
        return new Pair(profileCmsData, mayaUpdateProfileData);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f11420a) {
            case 0:
                ArrayList list = (ArrayList) obj;
                kotlin.jvm.internal.j.g(list, "list");
                return list;
            case 1:
                ArrayList list2 = (ArrayList) obj;
                kotlin.jvm.internal.j.g(list2, "list");
                return list2;
            case 2:
            default:
                ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                List<ShopPurchaseHistory> listMData = shopPurchaseHistoryBase.mData();
                kotlin.jvm.internal.j.f(listMData, "mData(...)");
                return C1110A.Q(new N0(2), listMData);
            case 3:
                Response response = (Response) obj;
                kotlin.jvm.internal.j.g(response, "response");
                return Ah.p.c(new Pair(Boolean.valueOf(response.isSuccessful()), response.body()));
            case 4:
                Response response2 = (Response) obj;
                kotlin.jvm.internal.j.g(response2, "response");
                return Ah.p.c(new Pair(Boolean.valueOf(response2.isSuccessful()), response2.body()));
            case 5:
                MayaXPScoreData it = (MayaXPScoreData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return it.getData();
            case 6:
                MayaXPEntrypointData it2 = (MayaXPEntrypointData) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                return it2.getData();
            case 7:
                MissionV2Base missionsV2Base = (MissionV2Base) obj;
                kotlin.jvm.internal.j.g(missionsV2Base, "missionsV2Base");
                List<MissionV2> missions = missionsV2Base.getMissions();
                if (missions == null) {
                    missions = C1112C.f9377a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : missions) {
                    if (zj.z.o(((MissionV2) obj2).getStatus(), "completed", true)) {
                        arrayList.add(obj2);
                    }
                }
                return new MissionV2Base(arrayList);
            case 8:
                MissionV2Base missionsV2Base2 = (MissionV2Base) obj;
                kotlin.jvm.internal.j.g(missionsV2Base2, "missionsV2Base");
                List<MissionV2> missions2 = missionsV2Base2.getMissions();
                if (missions2 == null) {
                    missions2 = C1112C.f9377a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : missions2) {
                    if (zj.z.o(((MissionV2) obj3).getStatus(), "ongoing", true)) {
                        arrayList2.add(obj3);
                    }
                }
                return new MissionV2Base(arrayList2);
            case 9:
                ProductV3Base productBase = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productBase, "productBase");
                List<ProductV3> records = productBase.getRecords();
                return records == null ? C1112C.f9377a : records;
            case 10:
                ProductV3Base productBase2 = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productBase2, "productBase");
                List<ProductV3> records2 = productBase2.getRecords();
                return records2 == null ? C1112C.f9377a : records2;
            case 11:
                ReferralEligibilityV2 it3 = (ReferralEligibilityV2) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                return it3.getData();
            case 12:
                ShopProviderCategoryBase it4 = (ShopProviderCategoryBase) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                List<ShopProviderCategory> data = it4.getData();
                return data == null ? C1112C.f9377a : data;
            case 13:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, "shopProviderBase");
                List<ShopProvider> data2 = shopProviderBase.getData();
                List listQ = data2 != null ? C1110A.Q(new N0(0), data2) : null;
                return listQ == null ? C1112C.f9377a : listQ;
            case 14:
                ShopProviderSubcategoryBase subcategoryBase = (ShopProviderSubcategoryBase) obj;
                kotlin.jvm.internal.j.g(subcategoryBase, "subcategoryBase");
                List<ShopProviderSubcategory> data3 = subcategoryBase.getData();
                return data3 == null ? C1112C.f9377a : data3;
        }
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        CTInboxMessage ctInboxMessage = (CTInboxMessage) obj;
        kotlin.jvm.internal.j.g(ctInboxMessage, "ctInboxMessage");
        return AbstractC1233w.h.contains(ctInboxMessage.f9562n.get(0));
    }
}
