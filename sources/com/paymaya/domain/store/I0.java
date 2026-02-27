package com.paymaya.domain.store;

import android.content.res.Resources;
import cj.C1110A;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.ServicesFeatureCategoryDetails;
import com.paymaya.domain.model.ServicesFeatureCategoryV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class I0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f11357b;
    public final com.paymaya.data.preference.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f11358d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f11359g;
    public final ArrayList h;
    public final int i;
    public final Object j;

    public I0(Resources mResources, com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService) {
        int i;
        Object obj;
        SecondaryFeature secondaryFeatureK;
        String str;
        List list;
        boolean z4;
        ArrayList arrayList;
        kotlin.jvm.internal.j.g(mResources, "mResources");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f11357b = mResources;
        this.c = mPreference;
        this.f11358d = mFlagConfigurationService;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.f11359g = new ArrayList();
        this.h = new ArrayList();
        this.i = -1;
        boolean z5 = false;
        Map mapH = cj.M.h(new Pair("sendmoney", Integer.valueOf(R.drawable.maya_ic_services_send)), new Pair("receivemoney", Integer.valueOf(mPreference.e().isRequestMoneyTileUpdateEnabled() ? R.drawable.maya_ic_service_myqr_2 : R.drawable.maya_ic_service_myqr)), new Pair("cashin", Integer.valueOf(R.drawable.maya_ic_services_cashin)), new Pair("banktransfer", Integer.valueOf(R.drawable.maya_ic_services_bank)), new Pair("mycards", Integer.valueOf(R.drawable.maya_ic_services_cards)), new Pair("scanqr", Integer.valueOf(R.drawable.maya_ic_services_scan_qr)), new Pair("mayacredit", Integer.valueOf(R.drawable.maya_ic_services_credit)), new Pair("savings", Integer.valueOf(R.drawable.maya_ic_services_savings)), new Pair("travel", Integer.valueOf(R.drawable.maya_ic_services_travel)), new Pair("food", Integer.valueOf(R.drawable.maya_ic_services_food)), new Pair("shop", Integer.valueOf(R.drawable.maya_ic_services_shop)), new Pair("mayaMall", Integer.valueOf(R.drawable.maya_ic_services_mall)), new Pair("retail", Integer.valueOf(R.drawable.maya_ic_services_retail)), new Pair("merchants", Integer.valueOf(R.drawable.maya_ic_services_partners)), new Pair("playMaya", Integer.valueOf(R.drawable.maya_ic_services_play)), new Pair("bills", Integer.valueOf(R.drawable.maya_ic_services_bills)), new Pair("load", Integer.valueOf(R.drawable.maya_ic_services_load)), new Pair("loadsdk", Integer.valueOf(R.drawable.maya_ic_services_load)), new Pair("protect", Integer.valueOf(R.drawable.maya_ic_services_insurance)), new Pair("donate", Integer.valueOf(R.drawable.maya_ic_services_donations)), new Pair("government", Integer.valueOf(R.drawable.maya_ic_services_government)), new Pair("voucher", Integer.valueOf(R.drawable.maya_ic_services_vouchers)), new Pair("missions", Integer.valueOf(R.drawable.maya_ic_services_missions)), new Pair("deals", Integer.valueOf(R.drawable.maya_ic_services_deals)), new Pair("cryptov2", Integer.valueOf(R.drawable.maya_ic_services_crypto)), new Pair("funds", Integer.valueOf(R.drawable.maya_ic_services_funds)), new Pair("lrt1", Integer.valueOf(R.drawable.maya_ic_services_train)), new Pair("merchantrewards", Integer.valueOf(R.drawable.maya_ic_services_merchant_rewards)), new Pair("luckygames", Integer.valueOf(R.drawable.maya_ic_services_lucky_games)), new Pair("insurance", Integer.valueOf(R.drawable.maya_ic_services_insurance)), new Pair("paylater", Integer.valueOf(R.drawable.maya_ic_services_pay_later)), new Pair("stocks", Integer.valueOf(R.drawable.maya_ic_services_stocks)), new Pair("globalstocks", Integer.valueOf(R.drawable.maya_ic_services_us_stocks)), new Pair("globalremittance", Integer.valueOf(R.drawable.maya_ic_services_global_remittance)), new Pair("stocksgame", Integer.valueOf(R.drawable.maya_ic_services_stocks_game)), new Pair("loans", Integer.valueOf(R.drawable.maya_ic_service_personal_loans)), new Pair("personalgoals", Integer.valueOf(R.drawable.maya_ic_services_personal_goals)), new Pair("timedepositplus", Integer.valueOf(R.drawable.maya_ic_services_time_deposit_plus)), new Pair("pbb", 2131231606), new Pair("inviteafriend", Integer.valueOf(R.drawable.maya_ic_services_invite_friend)), new Pair("creditcard", 2131231583), new Pair("rafflegame", Integer.valueOf(R.drawable.maya_ic_services_raffle_game)), new Pair("esims", Integer.valueOf(R.drawable.maya_ic_services_esims)), new Pair("esimboxo", Integer.valueOf(R.drawable.maya_ic_services_esims_v2)), new Pair("stream", Integer.valueOf(R.drawable.maya_ic_services_stream)), new Pair("sparkhackathon", Integer.valueOf(R.drawable.maya_ic_services_spark_hackathon)), new Pair("pal", 2131231603), new Pair("purchasefinancing", Integer.valueOf(R.drawable.maya_ic_services_purchase_financing)), new Pair("scheduler", Integer.valueOf(R.drawable.maya_ic_services_scheduler)), new Pair("giveaway", 2131231591), new Pair("taptopay", 2131231573), new Pair("mayaxp", Integer.valueOf(R.drawable.maya_ic_services_xp)), new Pair("more", Integer.valueOf(R.drawable.maya_ic_service_more)));
        this.j = mapH;
        List<SecondaryFeature> mayaServicesMasterList = this.c.e().getMayaServicesMasterList();
        kotlin.jvm.internal.j.d(mayaServicesMasterList);
        com.paymaya.data.preference.a aVar = this.c;
        List<String> mayaServicesCoreItems = aVar.e().getMayaServicesCoreItems();
        kotlin.jvm.internal.j.f(mayaServicesCoreItems, "getMayaServicesCoreItems(...)");
        List listR = C1110A.R(mayaServicesCoreItems, 5);
        List<ServicesFeatureCategoryV2> mayaServicesCategoryV2 = aVar.e().getMayaServicesCategoryV2();
        int mayaServicesBanner = aVar.e().getMayaServicesBanner();
        List listG = C1132s.g(h(), C(), e(), z(), y());
        Resources resources = this.f11357b;
        String string = resources.getString(R.string.maya_label_shop_and_pay);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String string2 = resources.getString(R.string.maya_format_services_category_color_shop_and_pay);
        if (aVar.e().isLoadV2Enabled()) {
            obj = "luckygames";
            i = mayaServicesBanner;
            secondaryFeatureK = f();
        } else {
            i = mayaServicesBanner;
            obj = "luckygames";
            secondaryFeatureK = AbstractC1213b.K((Number) cj.M.f(mapH, "load"), AbstractC1213b.J(resources, R.string.maya_label_service_load, SecondaryFeature.sBuilder(), "paymaya://shop?category=telco", null));
        }
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails = new ServicesFeatureCategoryDetails("shop_and_pay", string, string2, C1132s.h(secondaryFeatureK, u(), D(), p(), a(), N(), O()));
        String string3 = resources.getString(R.string.maya_label_secure_banking);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails2 = new ServicesFeatureCategoryDetails("secure_banking", string3, resources.getString(R.string.maya_format_services_category_color_secure_banking), C1132s.h(i(), j(), g(), B(), v(), AbstractC1213b.K((Number) cj.M.f(mapH, "personalgoals"), AbstractC1213b.J(resources, R.string.maya_label_service_personal_goals, SecondaryFeature.sBuilder(), "paymaya://savings", null)), AbstractC1213b.K((Number) cj.M.f(mapH, "timedepositplus"), AbstractC1213b.J(resources, R.string.maya_label_service_time_deposit_plus, SecondaryFeature.sBuilder(), "paymaya://savings", null)), J()));
        String string4 = resources.getString(R.string.maya_label_grow_my_money);
        kotlin.jvm.internal.j.f(string4, "getString(...)");
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails3 = new ServicesFeatureCategoryDetails("grow_my_money", string4, resources.getString(R.string.maya_format_services_category_color_grow_my_money), C1132s.h(B(), k(), o(), AbstractC1213b.K((Number) cj.M.f(mapH, "stocks"), AbstractC1213b.J(resources, R.string.maya_label_service_stocks, SecondaryFeature.sBuilder(), "paymaya://stocks", null)), x()));
        String string5 = resources.getString(R.string.maya_label_earn_rewards);
        kotlin.jvm.internal.j.f(string5, "getString(...)");
        ServicesFeatureCategoryDetails servicesFeatureCategoryDetails4 = new ServicesFeatureCategoryDetails("earn_rewards", string5, resources.getString(R.string.maya_format_services_category_color_earn_rewards), C1132s.h(G(), l(), d(), AbstractC1213b.K((Number) cj.M.f(mapH, "merchantrewards"), AbstractC1213b.J(resources, R.string.maya_label_service_merchant_reward, SecondaryFeature.sBuilder(), "paymaya://merchantrewards", null)), t(), F()));
        String string6 = resources.getString(R.string.maya_label_do_more);
        kotlin.jvm.internal.j.f(string6, "getString(...)");
        List listG2 = C1132s.g(servicesFeatureCategoryDetails, servicesFeatureCategoryDetails2, servicesFeatureCategoryDetails3, servicesFeatureCategoryDetails4, new ServicesFeatureCategoryDetails("do_more", string6, resources.getString(R.string.maya_format_services_category_color_do_more), C1132s.h(n(), AbstractC1213b.K((Number) cj.M.f(mapH, "globalremittance"), AbstractC1213b.J(resources, R.string.maya_label_service_global_remittance, SecondaryFeature.sBuilder(), "paymaya://globalremittance", null)), H(), q(), AbstractC1213b.J(resources, R.string.maya_label_service_games, SecondaryFeature.sBuilder(), "paymaya://lucky_games", null).mImageResource(((Number) cj.M.f(mapH, obj)).intValue()).mAgeRestricted(new C1263i(21, null, null)).build(), r(), s(), A(), E(), L())));
        ArrayList arrayList2 = new ArrayList();
        boolean zIsEmpty = mayaServicesMasterList.isEmpty();
        ArrayList arrayList3 = this.h;
        ArrayList arrayList4 = this.f11359g;
        String str2 = "";
        if (zIsEmpty) {
            str = "";
            arrayList4.addAll(listG);
            arrayList3.addAll(listG2);
            R();
        } else {
            ArrayList<SecondaryFeature> arrayList5 = new ArrayList();
            for (Object obj2 : mayaServicesMasterList) {
                if (mapH.containsKey(((SecondaryFeature) obj2).mId())) {
                    arrayList5.add(obj2);
                }
            }
            for (SecondaryFeature secondaryFeature : arrayList5) {
                String strMId = secondaryFeature.mId();
                if (strMId == null) {
                    strMId = "";
                }
                SecondaryFeature secondaryFeatureBuild = SecondaryFeature.sBuilder().mId(secondaryFeature.mId()).mLabel(secondaryFeature.mLabel()).mUri(secondaryFeature.mUri()).mEventName(secondaryFeature.mEventName()).mImageResource(((Number) cj.M.f(mapH, strMId)).intValue()).mIsKycRequired(secondaryFeature.mIsKycRequired()).mFeatureDynamicStatus(secondaryFeature.mFeatureDynamicStatus()).mAgeRestricted(secondaryFeature.mAgeRestricted()).build();
                kotlin.jvm.internal.j.f(secondaryFeatureBuild, "build(...)");
                arrayList2.add(secondaryFeatureBuild);
            }
            boolean zIsEmpty2 = listR.isEmpty();
            List<ServicesFeatureCategoryV2> list2 = mayaServicesCategoryV2;
            boolean z8 = list2 == null || list2.isEmpty();
            if (zIsEmpty2) {
                list = listG2;
                z4 = zIsEmpty2;
                str = "";
                arrayList4.addAll(listG);
            } else {
                ArrayList<String> arrayList6 = new ArrayList();
                for (Object obj3 : listR) {
                    if (mapH.containsKey((String) obj3)) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (String str3 : arrayList6) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        List list3 = listG2;
                        boolean z9 = zIsEmpty2;
                        String str4 = str2;
                        if (zj.z.o(((SecondaryFeature) obj4).mId(), str3, z5)) {
                            arrayList8.add(obj4);
                        }
                        listG2 = list3;
                        zIsEmpty2 = z9;
                        str2 = str4;
                        z5 = false;
                    }
                    cj.x.p(arrayList8, arrayList7);
                    z5 = false;
                }
                list = listG2;
                z4 = zIsEmpty2;
                str = str2;
                arrayList4.addAll(arrayList7);
            }
            this.i = i;
            if (z8) {
                arrayList3.addAll(list);
            } else {
                Iterator it = mayaServicesCategoryV2.iterator();
                while (it.hasNext()) {
                    ServicesFeatureCategoryV2 servicesFeatureCategoryV2 = (ServicesFeatureCategoryV2) it.next();
                    List<String> serviceIds = servicesFeatureCategoryV2.getServiceIds();
                    if (serviceIds != null) {
                        ArrayList<String> arrayList9 = new ArrayList();
                        for (Object obj5 : serviceIds) {
                            if (mapH.containsKey((String) obj5)) {
                                arrayList9.add(obj5);
                            }
                        }
                        arrayList = new ArrayList();
                        for (String str5 : arrayList9) {
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj6 : arrayList2) {
                                Iterator it2 = it;
                                ServicesFeatureCategoryV2 servicesFeatureCategoryV22 = servicesFeatureCategoryV2;
                                if (zj.z.o(((SecondaryFeature) obj6).mId(), str5, false)) {
                                    arrayList10.add(obj6);
                                }
                                it = it2;
                                servicesFeatureCategoryV2 = servicesFeatureCategoryV22;
                            }
                            cj.x.p(arrayList10, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                    Iterator it3 = it;
                    ServicesFeatureCategoryV2 servicesFeatureCategoryV23 = servicesFeatureCategoryV2;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ServicesFeatureCategoryDetails(servicesFeatureCategoryV23.getId(), servicesFeatureCategoryV23.getName(), servicesFeatureCategoryV23.getBgColor(), C1110A.W(arrayList)));
                    }
                    it = it3;
                }
                this.f.addAll(arrayList2);
            }
            if (z4 && z8) {
                R();
            }
        }
        List<String> dashboardSettingsWalletTiles = aVar.e().getDashboardSettingsWalletTiles();
        kotlin.jvm.internal.j.d(dashboardSettingsWalletTiles);
        boolean zIsEmpty3 = dashboardSettingsWalletTiles.isEmpty();
        ArrayList arrayList11 = this.e;
        if (zIsEmpty3) {
            SecondaryFeature secondaryFeatureZ = z();
            kotlin.jvm.internal.j.f(secondaryFeatureZ, "getMayaReceiveMoneyFeature(...)");
            arrayList11.add(secondaryFeatureZ);
            SecondaryFeature secondaryFeatureE = e();
            kotlin.jvm.internal.j.f(secondaryFeatureE, "getMayaBankTransferFeature(...)");
            arrayList11.add(secondaryFeatureE);
            SecondaryFeature secondaryFeatureBuild2 = AbstractC1213b.J(resources, R.string.maya_label_service_pay_later, SecondaryFeature.sBuilder(), "paymaya://paylater", null).mImageResource(((Number) cj.M.f(mapH, "paylater")).intValue()).build();
            kotlin.jvm.internal.j.f(secondaryFeatureBuild2, "getMayaPayLaterCreatorStoreFeature(...)");
            arrayList11.add(secondaryFeatureBuild2);
            SecondaryFeature secondaryFeatureQ = q();
            kotlin.jvm.internal.j.f(secondaryFeatureQ, "getMayaLRT1Feature(...)");
            arrayList11.add(secondaryFeatureQ);
            SecondaryFeature secondaryFeatureF = f();
            kotlin.jvm.internal.j.f(secondaryFeatureF, "getMayaBuyLoadSdkFeature(...)");
            arrayList11.add(secondaryFeatureF);
            SecondaryFeature secondaryFeatureU = u();
            kotlin.jvm.internal.j.f(secondaryFeatureU, "getMayaPayBillsFeature(...)");
            arrayList11.add(secondaryFeatureU);
            SecondaryFeature secondaryFeatureK2 = k();
            kotlin.jvm.internal.j.f(secondaryFeatureK2, "getMayaCryptoV2Feature(...)");
            arrayList11.add(secondaryFeatureK2);
            SecondaryFeature secondaryFeatureG = g();
            kotlin.jvm.internal.j.f(secondaryFeatureG, "getMayaCardsFeature(...)");
            arrayList11.add(secondaryFeatureG);
            SecondaryFeature secondaryFeatureY = y();
            kotlin.jvm.internal.j.f(secondaryFeatureY, "getMayaQrFeature(...)");
            arrayList11.add(secondaryFeatureY);
            SecondaryFeature secondaryFeatureB = B();
            kotlin.jvm.internal.j.f(secondaryFeatureB, "getMayaSavingsFeature(...)");
            arrayList11.add(secondaryFeatureB);
            SecondaryFeature secondaryFeatureJ = j();
            kotlin.jvm.internal.j.f(secondaryFeatureJ, "getMayaCreditFeature(...)");
            arrayList11.add(secondaryFeatureJ);
            SecondaryFeature secondaryFeatureO = o();
            kotlin.jvm.internal.j.f(secondaryFeatureO, "getMayaFundsFeature(...)");
            arrayList11.add(secondaryFeatureO);
            SecondaryFeature secondaryFeatureE2 = E();
            kotlin.jvm.internal.j.f(secondaryFeatureE2, "getMayaTravelFeature(...)");
            arrayList11.add(secondaryFeatureE2);
            SecondaryFeature secondaryFeatureN = n();
            kotlin.jvm.internal.j.f(secondaryFeatureN, "getMayaFoodFeature(...)");
            arrayList11.add(secondaryFeatureN);
            SecondaryFeature secondaryFeatureD = D();
            kotlin.jvm.internal.j.f(secondaryFeatureD, "getMayaShopFeature(...)");
            arrayList11.add(secondaryFeatureD);
            SecondaryFeature secondaryFeatureR = r();
            kotlin.jvm.internal.j.f(secondaryFeatureR, "getMayaMallFeature(...)");
            arrayList11.add(secondaryFeatureR);
            SecondaryFeature secondaryFeatureA = A();
            kotlin.jvm.internal.j.f(secondaryFeatureA, "getMayaRetailFeature(...)");
            arrayList11.add(secondaryFeatureA);
            SecondaryFeature secondaryFeatureS = s();
            kotlin.jvm.internal.j.f(secondaryFeatureS, "getMayaMerchantsFeature(...)");
            arrayList11.add(secondaryFeatureS);
            SecondaryFeature secondaryFeatureW = w();
            kotlin.jvm.internal.j.f(secondaryFeatureW, "getMayaPlayFeature(...)");
            arrayList11.add(secondaryFeatureW);
            SecondaryFeature secondaryFeatureX = x();
            kotlin.jvm.internal.j.f(secondaryFeatureX, "getMayaProtectFeature(...)");
            arrayList11.add(secondaryFeatureX);
            SecondaryFeature secondaryFeatureM = m();
            kotlin.jvm.internal.j.f(secondaryFeatureM, "getMayaDonateFeature(...)");
            arrayList11.add(secondaryFeatureM);
            SecondaryFeature secondaryFeatureP = p();
            kotlin.jvm.internal.j.f(secondaryFeatureP, "getMayaGovernmentFeature(...)");
            arrayList11.add(secondaryFeatureP);
            SecondaryFeature secondaryFeatureT = t();
            kotlin.jvm.internal.j.f(secondaryFeatureT, "getMayaMissionsFeature(...)");
            arrayList11.add(secondaryFeatureT);
            SecondaryFeature secondaryFeatureF2 = F();
            kotlin.jvm.internal.j.f(secondaryFeatureF2, "getMayaVouchersFeature(...)");
            arrayList11.add(secondaryFeatureF2);
            SecondaryFeature secondaryFeatureL = l();
            kotlin.jvm.internal.j.f(secondaryFeatureL, "getMayaDealsFeature(...)");
            arrayList11.add(secondaryFeatureL);
            SecondaryFeature secondaryFeatureV = v();
            kotlin.jvm.internal.j.f(secondaryFeatureV, "getMayaPersonalLoansFeature(...)");
            arrayList11.add(secondaryFeatureV);
            SecondaryFeature secondaryFeatureH = H();
            kotlin.jvm.internal.j.f(secondaryFeatureH, "getPBB(...)");
            arrayList11.add(secondaryFeatureH);
            SecondaryFeature secondaryFeatureD2 = d();
            kotlin.jvm.internal.j.f(secondaryFeatureD2, "getInviteAFriend(...)");
            arrayList11.add(secondaryFeatureD2);
            SecondaryFeature secondaryFeatureK3 = K();
            kotlin.jvm.internal.j.f(secondaryFeatureK3, "getRaffleGame(...)");
            arrayList11.add(secondaryFeatureK3);
            SecondaryFeature secondaryFeatureA2 = a();
            kotlin.jvm.internal.j.f(secondaryFeatureA2, "getESims(...)");
            arrayList11.add(secondaryFeatureA2);
            SecondaryFeature secondaryFeatureB2 = b();
            kotlin.jvm.internal.j.f(secondaryFeatureB2, "getESimsV2(...)");
            arrayList11.add(secondaryFeatureB2);
            SecondaryFeature secondaryFeatureN2 = N();
            kotlin.jvm.internal.j.f(secondaryFeatureN2, "getStream(...)");
            arrayList11.add(secondaryFeatureN2);
            SecondaryFeature secondaryFeatureM2 = M();
            kotlin.jvm.internal.j.f(secondaryFeatureM2, "getSparkHackathon(...)");
            arrayList11.add(secondaryFeatureM2);
            SecondaryFeature secondaryFeatureI = I();
            kotlin.jvm.internal.j.f(secondaryFeatureI, "getPal(...)");
            arrayList11.add(secondaryFeatureI);
            SecondaryFeature secondaryFeatureJ2 = J();
            kotlin.jvm.internal.j.f(secondaryFeatureJ2, "getPurchaseFinancing(...)");
            arrayList11.add(secondaryFeatureJ2);
            SecondaryFeature secondaryFeatureL2 = L();
            kotlin.jvm.internal.j.f(secondaryFeatureL2, "getScheduler(...)");
            arrayList11.add(secondaryFeatureL2);
            SecondaryFeature secondaryFeatureC = c();
            kotlin.jvm.internal.j.f(secondaryFeatureC, "getGiveaway(...)");
            arrayList11.add(secondaryFeatureC);
            SecondaryFeature secondaryFeatureO2 = O();
            kotlin.jvm.internal.j.f(secondaryFeatureO2, "getTapToPay(...)");
            arrayList11.add(secondaryFeatureO2);
            SecondaryFeature secondaryFeatureG2 = G();
            kotlin.jvm.internal.j.f(secondaryFeatureG2, "getMayaXP(...)");
            arrayList11.add(secondaryFeatureG2);
        } else {
            ArrayList<String> arrayList12 = new ArrayList();
            for (Object obj7 : dashboardSettingsWalletTiles) {
                if (mapH.containsKey((String) obj7)) {
                    arrayList12.add(obj7);
                }
            }
            for (String str6 : arrayList12) {
                ArrayList<SecondaryFeature> arrayList13 = new ArrayList();
                for (Object obj8 : arrayList2) {
                    if (zj.z.o(((SecondaryFeature) obj8).mId(), str6, false)) {
                        arrayList13.add(obj8);
                    }
                }
                for (SecondaryFeature secondaryFeature2 : arrayList13) {
                    SecondaryFeature.Builder builderMEventName = SecondaryFeature.sBuilder().mId(secondaryFeature2.mId()).mLabel(secondaryFeature2.mLabel()).mUri(secondaryFeature2.mUri()).mEventName(secondaryFeature2.mEventName());
                    String strMId2 = secondaryFeature2.mId();
                    if (strMId2 == null) {
                        strMId2 = str;
                    }
                    SecondaryFeature secondaryFeatureBuild3 = builderMEventName.mImageResource(((Number) cj.M.f(mapH, strMId2)).intValue()).mIsKycRequired(secondaryFeature2.mIsKycRequired()).mFeatureDynamicStatus(secondaryFeature2.mFeatureDynamicStatus()).mAgeRestricted(secondaryFeature2.mAgeRestricted()).build();
                    kotlin.jvm.internal.j.f(secondaryFeatureBuild3, "build(...)");
                    arrayList11.add(secondaryFeatureBuild3);
                }
            }
        }
        if (!S5.c.b(this.f11358d, A5.b.f137u)) {
            P("cryptov2");
        }
        if (!this.c.e().isFundsEnabled()) {
            Q(new H0(0));
        }
        if (this.c.e().isLoadV2Enabled()) {
            P("load");
        } else {
            P("loadsdk");
        }
        if (!S5.c.b(this.f11358d, A5.b.f115k1)) {
            P("purchasefinancing");
        }
        if (!S5.c.b(this.f11358d, A5.b.e)) {
            P("scheduler");
        }
        if (S5.c.b(this.f11358d, A5.b.f90Z)) {
            P("esims");
        } else {
            P("esimboxo");
        }
        if (S5.c.b(this.f11358d, A5.b.f85W0)) {
            return;
        }
        P("taptopay");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature A() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "retail"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_retail, SecondaryFeature.sBuilder(), "paymaya://retail", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature B() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "savings"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_savings, SecondaryFeature.sBuilder(), "paymaya://savings", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature C() {
        return AbstractC1213b.J(this.f11357b, R.string.maya_label_service_send_money, SecondaryFeature.sBuilder(), "paymaya://sendmoney", null).mImageResource(((Number) cj.M.f(this.j, "sendmoney")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature D() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "shop"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_shop, SecondaryFeature.sBuilder(), "paymaya://shop", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature E() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "travel"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_travel, SecondaryFeature.sBuilder(), "paymaya://transport", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature F() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "voucher"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_vouchers, SecondaryFeature.sBuilder(), "paymaya://vouchers", null));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature G() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "mayaxp"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_maya_xp)).mUri("paymaya://xp"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature H() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "pbb"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_pbb, SecondaryFeature.sBuilder(), "paymaya://pbb", null));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature I() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "pal"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_pal)).mUri("paymaya://philippineairlines"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature J() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "purchasefinancing"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_suki_credit)).mUri("paymaya://purchasefinancing"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature K() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "rafflegame"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_raffle_promo)).mUri("paymaya://rafflegame"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature L() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "scheduler"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_scheduler)).mUri("paymaya://scheduler"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature M() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "sparkhackathon"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_spark_hackathon)).mUri("paymaya://sparkhackathon"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature N() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "stream"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_stream)).mUri("paymaya://stream"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature O() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "taptopay"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_tap_to_pay)).mUri("paymaya://mayapay/pay"));
    }

    public final void P(String str) {
        cj.x.s(this.e, new ac.m(str, 1));
        Q(new ac.m(str, 2));
    }

    public final void Q(Function1 function1) {
        ArrayList arrayList = this.h;
        Rj.g gVarA0 = C1110A.a0(arrayList);
        ArrayList<IndexedValue> arrayList2 = new ArrayList();
        Iterator it = gVarA0.iterator();
        while (true) {
            cj.H h = (cj.H) it;
            if (!h.f9381b.hasNext()) {
                break;
            }
            Object next = h.next();
            List<SecondaryFeature> serviceIds = ((ServicesFeatureCategoryDetails) ((IndexedValue) next).f18164b).getServiceIds();
            if (!(serviceIds instanceof Collection) || !serviceIds.isEmpty()) {
                Iterator<T> it2 = serviceIds.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((Boolean) function1.invoke((SecondaryFeature) it2.next())).booleanValue()) {
                            arrayList2.add(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        for (IndexedValue indexedValue : arrayList2) {
            ServicesFeatureCategoryDetails servicesFeatureCategoryDetails = (ServicesFeatureCategoryDetails) indexedValue.f18164b;
            cj.x.s(servicesFeatureCategoryDetails.getServiceIds(), new Ag.b(1, function1));
            arrayList.set(indexedValue.f18163a, servicesFeatureCategoryDetails);
        }
    }

    public final void R() {
        SecondaryFeature secondaryFeatureC = C();
        kotlin.jvm.internal.j.f(secondaryFeatureC, "getMayaSendMoneyFeature(...)");
        ArrayList arrayList = this.f;
        arrayList.add(secondaryFeatureC);
        SecondaryFeature secondaryFeatureZ = z();
        kotlin.jvm.internal.j.f(secondaryFeatureZ, "getMayaReceiveMoneyFeature(...)");
        arrayList.add(secondaryFeatureZ);
        SecondaryFeature secondaryFeatureE = e();
        kotlin.jvm.internal.j.f(secondaryFeatureE, "getMayaBankTransferFeature(...)");
        arrayList.add(secondaryFeatureE);
        SecondaryFeature secondaryFeatureH = h();
        kotlin.jvm.internal.j.f(secondaryFeatureH, "getMayaCashInFeature(...)");
        arrayList.add(secondaryFeatureH);
        SecondaryFeature secondaryFeatureG = g();
        kotlin.jvm.internal.j.f(secondaryFeatureG, "getMayaCardsFeature(...)");
        arrayList.add(secondaryFeatureG);
        SecondaryFeature secondaryFeatureY = y();
        kotlin.jvm.internal.j.f(secondaryFeatureY, "getMayaQrFeature(...)");
        arrayList.add(secondaryFeatureY);
        SecondaryFeature secondaryFeatureB = B();
        kotlin.jvm.internal.j.f(secondaryFeatureB, "getMayaSavingsFeature(...)");
        arrayList.add(secondaryFeatureB);
        SecondaryFeature secondaryFeatureJ = j();
        kotlin.jvm.internal.j.f(secondaryFeatureJ, "getMayaCreditFeature(...)");
        arrayList.add(secondaryFeatureJ);
        SecondaryFeature secondaryFeatureO = o();
        kotlin.jvm.internal.j.f(secondaryFeatureO, "getMayaFundsFeature(...)");
        arrayList.add(secondaryFeatureO);
        SecondaryFeature secondaryFeatureE2 = E();
        kotlin.jvm.internal.j.f(secondaryFeatureE2, "getMayaTravelFeature(...)");
        arrayList.add(secondaryFeatureE2);
        SecondaryFeature secondaryFeatureN = n();
        kotlin.jvm.internal.j.f(secondaryFeatureN, "getMayaFoodFeature(...)");
        arrayList.add(secondaryFeatureN);
        SecondaryFeature secondaryFeatureD = D();
        kotlin.jvm.internal.j.f(secondaryFeatureD, "getMayaShopFeature(...)");
        arrayList.add(secondaryFeatureD);
        SecondaryFeature secondaryFeatureR = r();
        kotlin.jvm.internal.j.f(secondaryFeatureR, "getMayaMallFeature(...)");
        arrayList.add(secondaryFeatureR);
        SecondaryFeature secondaryFeatureA = A();
        kotlin.jvm.internal.j.f(secondaryFeatureA, "getMayaRetailFeature(...)");
        arrayList.add(secondaryFeatureA);
        SecondaryFeature secondaryFeatureS = s();
        kotlin.jvm.internal.j.f(secondaryFeatureS, "getMayaMerchantsFeature(...)");
        arrayList.add(secondaryFeatureS);
        SecondaryFeature secondaryFeatureW = w();
        kotlin.jvm.internal.j.f(secondaryFeatureW, "getMayaPlayFeature(...)");
        arrayList.add(secondaryFeatureW);
        SecondaryFeature secondaryFeatureU = u();
        kotlin.jvm.internal.j.f(secondaryFeatureU, "getMayaPayBillsFeature(...)");
        arrayList.add(secondaryFeatureU);
        SecondaryFeature secondaryFeatureF = f();
        kotlin.jvm.internal.j.f(secondaryFeatureF, "getMayaBuyLoadSdkFeature(...)");
        arrayList.add(secondaryFeatureF);
        SecondaryFeature secondaryFeatureX = x();
        kotlin.jvm.internal.j.f(secondaryFeatureX, "getMayaProtectFeature(...)");
        arrayList.add(secondaryFeatureX);
        SecondaryFeature secondaryFeatureM = m();
        kotlin.jvm.internal.j.f(secondaryFeatureM, "getMayaDonateFeature(...)");
        arrayList.add(secondaryFeatureM);
        SecondaryFeature secondaryFeatureP = p();
        kotlin.jvm.internal.j.f(secondaryFeatureP, "getMayaGovernmentFeature(...)");
        arrayList.add(secondaryFeatureP);
        SecondaryFeature secondaryFeatureT = t();
        kotlin.jvm.internal.j.f(secondaryFeatureT, "getMayaMissionsFeature(...)");
        arrayList.add(secondaryFeatureT);
        SecondaryFeature secondaryFeatureF2 = F();
        kotlin.jvm.internal.j.f(secondaryFeatureF2, "getMayaVouchersFeature(...)");
        arrayList.add(secondaryFeatureF2);
        SecondaryFeature secondaryFeatureL = l();
        kotlin.jvm.internal.j.f(secondaryFeatureL, "getMayaDealsFeature(...)");
        arrayList.add(secondaryFeatureL);
        SecondaryFeature secondaryFeatureV = v();
        kotlin.jvm.internal.j.f(secondaryFeatureV, "getMayaPersonalLoansFeature(...)");
        arrayList.add(secondaryFeatureV);
        SecondaryFeature secondaryFeatureH2 = H();
        kotlin.jvm.internal.j.f(secondaryFeatureH2, "getPBB(...)");
        arrayList.add(secondaryFeatureH2);
        SecondaryFeature secondaryFeatureK = K();
        kotlin.jvm.internal.j.f(secondaryFeatureK, "getRaffleGame(...)");
        arrayList.add(secondaryFeatureK);
        SecondaryFeature secondaryFeatureI = i();
        kotlin.jvm.internal.j.f(secondaryFeatureI, "getMayaCreditCardFeature(...)");
        arrayList.add(secondaryFeatureI);
        SecondaryFeature secondaryFeatureA2 = a();
        kotlin.jvm.internal.j.f(secondaryFeatureA2, "getESims(...)");
        arrayList.add(secondaryFeatureA2);
        SecondaryFeature secondaryFeatureB2 = b();
        kotlin.jvm.internal.j.f(secondaryFeatureB2, "getESimsV2(...)");
        arrayList.add(secondaryFeatureB2);
        SecondaryFeature secondaryFeatureN2 = N();
        kotlin.jvm.internal.j.f(secondaryFeatureN2, "getStream(...)");
        arrayList.add(secondaryFeatureN2);
        SecondaryFeature secondaryFeatureM2 = M();
        kotlin.jvm.internal.j.f(secondaryFeatureM2, "getSparkHackathon(...)");
        arrayList.add(secondaryFeatureM2);
        SecondaryFeature secondaryFeatureI2 = I();
        kotlin.jvm.internal.j.f(secondaryFeatureI2, "getPal(...)");
        arrayList.add(secondaryFeatureI2);
        SecondaryFeature secondaryFeatureJ2 = J();
        kotlin.jvm.internal.j.f(secondaryFeatureJ2, "getPurchaseFinancing(...)");
        arrayList.add(secondaryFeatureJ2);
        SecondaryFeature secondaryFeatureL2 = L();
        kotlin.jvm.internal.j.f(secondaryFeatureL2, "getScheduler(...)");
        arrayList.add(secondaryFeatureL2);
        SecondaryFeature secondaryFeatureC2 = c();
        kotlin.jvm.internal.j.f(secondaryFeatureC2, "getGiveaway(...)");
        arrayList.add(secondaryFeatureC2);
        SecondaryFeature secondaryFeatureO2 = O();
        kotlin.jvm.internal.j.f(secondaryFeatureO2, "getTapToPay(...)");
        arrayList.add(secondaryFeatureO2);
        SecondaryFeature secondaryFeatureG2 = G();
        kotlin.jvm.internal.j.f(secondaryFeatureG2, "getMayaXP(...)");
        arrayList.add(secondaryFeatureG2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature a() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "esims"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_esims)).mUri("paymaya://esims"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature b() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "esimboxo"), SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_esims_v2)).mUri("paymaya://esimboxo"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature c() {
        return SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_service_giveaway)).mUri("paymaya://giveaway").mImageResource(((Number) cj.M.f(this.j, "giveaway")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature d() {
        return AbstractC1213b.J(this.f11357b, R.string.maya_label_service_invite_friend, SecondaryFeature.sBuilder(), "paymaya://refer", null).mImageResource(((Number) cj.M.f(this.j, "inviteafriend")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature e() {
        return AbstractC1213b.J(this.f11357b, R.string.maya_label_service_bank_transfer, SecondaryFeature.sBuilder(), "paymaya://banktransfer", null).mImageResource(((Number) cj.M.f(this.j, "banktransfer")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature f() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "loadsdk"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_load, SecondaryFeature.sBuilder(), "paymaya://load", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature g() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "mycards"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_cards, SecondaryFeature.sBuilder(), "paymaya://mycards", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature h() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "cashin"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_cash_in, SecondaryFeature.sBuilder(), "paymaya://addmoney", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature i() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "creditcard"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_credit_card, SecondaryFeature.sBuilder(), "paymaya://mycards", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature j() {
        return AbstractC1213b.J(this.f11357b, R.string.maya_label_service_credit, SecondaryFeature.sBuilder(), "paymaya://mayacredit", null).mImageResource(((Number) cj.M.f(this.j, "mayacredit")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature k() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "cryptov2"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_invest, SecondaryFeature.sBuilder(), "paymaya://crypto_v2", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature l() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "deals"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_deals, SecondaryFeature.sBuilder(), "paymaya://deals", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature m() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "donate"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_donate, SecondaryFeature.sBuilder(), "paymaya://donations", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature n() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "food"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_food, SecondaryFeature.sBuilder(), "paymaya://food", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature o() {
        return AbstractC1213b.J(this.f11357b, R.string.maya_label_service_funds, SecondaryFeature.sBuilder(), "paymaya://funds", null).mImageResource(((Number) cj.M.f(this.j, "funds")).intValue()).mIsKycRequired(Boolean.TRUE).build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature p() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "government"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_government, SecondaryFeature.sBuilder(), "paymaya://government", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature q() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "lrt1"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_lrt1, SecondaryFeature.sBuilder(), "paymaya://transport/beep", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature r() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "mayaMall"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_mall, SecondaryFeature.sBuilder(), "paymaya://mall", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature s() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "merchants"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_merchants, SecondaryFeature.sBuilder(), "paymaya://partnermerchant", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature t() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "missions"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_missions, SecondaryFeature.sBuilder(), "paymaya://missions", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature u() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "bills"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_bills, SecondaryFeature.sBuilder(), "paymaya://paybills", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature v() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "loans"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_personal_loans, SecondaryFeature.sBuilder(), "paymaya://loans", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature w() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "playMaya"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_play_maya, SecondaryFeature.sBuilder(), "paymaya://playmaya", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature x() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "protect"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_protect, SecondaryFeature.sBuilder(), "paymaya://protect", null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature y() {
        return AbstractC1213b.K((Number) cj.M.f(this.j, "scanqr"), AbstractC1213b.J(this.f11357b, R.string.maya_label_service_scan_qr, SecondaryFeature.sBuilder(), "paymaya://scanqr", null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final SecondaryFeature z() {
        return SecondaryFeature.sBuilder().mLabel(this.f11357b.getString(R.string.maya_label_my_qr)).mImageResource(((Number) cj.M.f(this.j, "receivemoney")).intValue()).mUri("paymaya://requestmoney").mFeatureDynamicStatus(null).build();
    }
}
