package p8;

import B5.i;
import Ch.c;
import Ch.e;
import Ch.f;
import G5.InterfaceC0254d;
import L9.C0323a;
import N5.C0491z;
import N5.E1;
import We.InterfaceC0604h;
import Xb.A;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import ch.InterfaceC1106e;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import hh.InterfaceC1569b;
import hh.InterfaceC1570c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import l9.C1819q;
import pc.EnumC2032a;
import ph.C2070f1;
import rc.C2196c;
import rc.k;
import rc.m;
import rc.o;
import t4.j;
import t8.d;
import v.AbstractC2329d;
import wc.InterfaceC2392c;
import wc.InterfaceC2393d;
import wc.InterfaceC2394e;
import we.ViewOnClickListenerC2420i;
import yc.l;
import yc.p;
import yd.h;
import zd.n;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements c, InterfaceC0254d, InterfaceC1570c, j, e, f, InterfaceC0604h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19074b;

    public a(A7.j jVar, MfaMeta mfaMeta) {
        this.f19073a = 19;
        this.f19074b = jVar;
    }

    @Override // G5.InterfaceC0254d
    public void T() {
        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) this.f19074b;
        ((C1819q) mayaQRPHMerchantPaymentFragment.Q1()).m(mayaQRPHMerchantPaymentFragment.P1());
    }

    @Override // hh.InterfaceC1570c
    public Object a(Object obj, Object obj2) {
        ((InterfaceC1569b) this.f19074b).accept(obj, (InterfaceC1106e) obj2);
        return obj;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Bundle bundle;
        ArrayList arrayList;
        switch (this.f19073a) {
            case 0:
                A7.j jVar = (A7.j) this.f19074b;
                jVar.getClass();
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    C0491z c0491z = ((MayaInboxFragment) ((s8.b) jVar.c.get())).f12406U;
                    kotlin.jvm.internal.j.d(c0491z);
                    ((ViewPager) c0491z.h).setVisibility(8);
                    MayaInboxFragment mayaInboxFragment = (MayaInboxFragment) ((s8.b) jVar.c.get());
                    C0491z c0491z2 = mayaInboxFragment.f12406U;
                    kotlin.jvm.internal.j.d(c0491z2);
                    ((Group) c0491z2.e).setVisibility(0);
                    C0491z c0491z3 = mayaInboxFragment.f12406U;
                    kotlin.jvm.internal.j.d(c0491z3);
                    ((TabLayout) c0491z3.f).setVisibility(8);
                    return;
                }
                MayaInboxFragment mayaInboxFragment2 = (MayaInboxFragment) ((s8.b) jVar.c.get());
                C0491z c0491z4 = mayaInboxFragment2.f12406U;
                kotlin.jvm.internal.j.d(c0491z4);
                ((Group) c0491z4.e).setVisibility(8);
                C0491z c0491z5 = mayaInboxFragment2.f12406U;
                kotlin.jvm.internal.j.d(c0491z5);
                ((TabLayout) c0491z5.f).setVisibility(0);
                MayaInboxFragment mayaInboxFragment3 = (MayaInboxFragment) ((s8.b) jVar.c.get());
                FragmentManager childFragmentManager = mayaInboxFragment3.getChildFragmentManager();
                kotlin.jvm.internal.j.f(childFragmentManager, "getChildFragmentManager(...)");
                List list2 = AbstractC1233w.h;
                kotlin.jvm.internal.j.f(list2, "getInboxTags(...)");
                mayaInboxFragment3.f12408W = new E9.e(childFragmentManager, list2, 2);
                C0491z c0491z6 = mayaInboxFragment3.f12406U;
                kotlin.jvm.internal.j.d(c0491z6);
                ((ViewPager) c0491z6.h).setAdapter(mayaInboxFragment3.f12408W);
                C0491z c0491z7 = mayaInboxFragment3.f12406U;
                kotlin.jvm.internal.j.d(c0491z7);
                C0491z c0491z8 = mayaInboxFragment3.f12406U;
                kotlin.jvm.internal.j.d(c0491z8);
                ((TabLayout) c0491z7.f).setupWithViewPager((ViewPager) c0491z8.h);
                C0491z c0491z9 = mayaInboxFragment3.f12406U;
                kotlin.jvm.internal.j.d(c0491z9);
                ((ViewPager) c0491z9.h).setVisibility(0);
                C0491z c0491z10 = mayaInboxFragment3.f12406U;
                kotlin.jvm.internal.j.d(c0491z10);
                int tabCount = ((TabLayout) c0491z10.f).getTabCount();
                if (tabCount >= 0) {
                    int i = 0;
                    while (true) {
                        C0491z c0491z11 = mayaInboxFragment3.f12406U;
                        kotlin.jvm.internal.j.d(c0491z11);
                        if (((TabLayout) c0491z11.f).getTabAt(i) != null) {
                            C0491z c0491z12 = mayaInboxFragment3.f12406U;
                            kotlin.jvm.internal.j.d(c0491z12);
                            View childAt = ((TabLayout) c0491z12.f).getChildAt(0);
                            kotlin.jvm.internal.j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) childAt).getChildAt(i).setId(i != 0 ? i != 1 ? R.id.pma_fragment_inbox_sliding_tab_updates : R.id.pma_fragment_inbox_sliding_tab_promos : R.id.pma_fragment_inbox_sliding_tab_all);
                        }
                        if (i != tabCount) {
                            i++;
                        }
                    }
                }
                d dVar = ((MayaInboxFragment) ((s8.b) jVar.c.get())).f12409X;
                String string = (dVar == null || (bundle = ((MayaInboxV2Activity) dVar).f12401o) == null) ? null : bundle.getString("inbox_last_fragment");
                if (string == null || string.length() == 0) {
                    return;
                }
                MayaInboxFragment mayaInboxFragment4 = (MayaInboxFragment) ((s8.b) jVar.c.get());
                E9.e eVar = mayaInboxFragment4.f12408W;
                kotlin.jvm.internal.j.d(eVar);
                List list3 = eVar.f1339b;
                kotlin.jvm.internal.j.g(list3, "<this>");
                int iIndexOf = list3.indexOf(string);
                if (iIndexOf > -1) {
                    C0491z c0491z13 = mayaInboxFragment4.f12406U;
                    kotlin.jvm.internal.j.d(c0491z13);
                    ((ViewPager) c0491z13.h).setCurrentItem(iIndexOf);
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 12:
            case 18:
            default:
                MFAChallengeInformationV2 mfaChallengeInfo = (MFAChallengeInformationV2) obj;
                kotlin.jvm.internal.j.g(mfaChallengeInfo, "mfaChallengeInfo");
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) ((x9.c) ((A7.j) this.f19074b).c.get());
                mayaMultiTypeOtpFragment.getClass();
                y9.f fVar = mayaMultiTypeOtpFragment.f12943W;
                if (fVar != null) {
                    ((MayaMfaActivity) fVar).f12929p = mfaChallengeInfo;
                    return;
                }
                return;
            case 4:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                qc.d dVar2 = (qc.d) this.f19074b;
                PayMayaError payMayaErrorF = dVar2.f(throwable, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                dVar2.n(payMayaErrorF, 3, true);
                return;
            case 5:
                MayaUpdateProfileData updateProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(updateProfileData, "updateProfileData");
                C2196c c2196c = (C2196c) this.f19074b;
                String str = c2196c.i;
                if (str == null) {
                    MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                    mayaUnderWritingRequirementsFragment.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("UPDATE_PROFILE_DATA", updateProfileData);
                    mayaUnderWritingRequirementsFragment.requireActivity().setResult(121, intent);
                    mayaUnderWritingRequirementsFragment.requireActivity().finish();
                    return;
                }
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment2 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) c2196c.c.get());
                mayaUnderWritingRequirementsFragment2.getClass();
                l lVar = mayaUnderWritingRequirementsFragment2.f14255a0;
                if (lVar != null) {
                    MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) lVar;
                    mayaUpdateProfileActivity.n1();
                    i.k(mayaUpdateProfileActivity, str);
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.j.g((MayaUpdateProfileData) obj, "it");
                ((MayaBaseFragment) ((InterfaceC2393d) ((rc.i) this.f19074b).c.get())).w1();
                rc.i iVar = (rc.i) this.f19074b;
                if (iVar.f19907r == null) {
                    ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).g2("");
                    MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) ((rc.i) this.f19074b).c.get());
                    mayaUserContactReferenceFragment.requireActivity().setResult(121);
                    mayaUserContactReferenceFragment.requireActivity().finish();
                    return;
                }
                InterfaceC2393d interfaceC2393d = (InterfaceC2393d) iVar.c.get();
                String str2 = ((rc.i) this.f19074b).f19907r;
                if (str2 == null) {
                    str2 = "https://paymaya.com/app/";
                }
                ((MayaUserContactReferenceFragment) interfaceC2393d).g2(str2);
                InterfaceC2393d interfaceC2393d2 = (InterfaceC2393d) ((rc.i) this.f19074b).c.get();
                String str3 = ((rc.i) this.f19074b).f19907r;
                String str4 = str3 != null ? str3 : "https://paymaya.com/app/";
                p pVar = ((MayaUserContactReferenceFragment) interfaceC2393d2).f14259a0;
                if (pVar != null) {
                    MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) pVar;
                    mayaUserProfileUpdateActivity.n1();
                    i.k(mayaUserProfileUpdateActivity, str4);
                    return;
                }
                return;
            case 7:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((k) this.f19074b).z(p02);
                return;
            case 8:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaBaseFragment) ((InterfaceC2394e) ((m) this.f19074b).c.get())).w1();
                ((m) this.f19074b).n(it, EnumC2032a.c, true);
                return;
            case 9:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                ((MayaBaseFragment) ((wc.f) ((o) this.f19074b).c.get())).w1();
                ((o) this.f19074b).n(it2, EnumC2032a.c, true);
                return;
            case 10:
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                A7.j jVar2 = (A7.j) this.f19074b;
                PayMayaError payMayaErrorF2 = jVar2.f(throwable2, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                ((BaseFragment) ((h) jVar2.c.get())).o1(AbstractC2329d.h(12));
                EDDIntroFragment eDDIntroFragment = (EDDIntroFragment) ((h) jVar2.c.get());
                eDDIntroFragment.getClass();
                n nVar = eDDIntroFragment.f14540T;
                if (nVar != null) {
                    ((EDDActivity) nVar).y1(payMayaErrorF2);
                    return;
                }
                return;
            case 11:
                Ze.a permission = (Ze.a) obj;
                kotlin.jvm.internal.j.g(permission, "permission");
                sd.h hVar = (sd.h) this.f19074b;
                boolean z4 = permission.f6934b;
                yk.a.a();
                if (z4) {
                    Group group = ((EKycPhotoCaptureFragment) ((yd.l) hVar.c.get())).f14568W;
                    if (group == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupDenyPermission");
                        throw null;
                    }
                    group.setVisibility(8);
                    hVar.n();
                    ((EKycPhotoCaptureFragment) ((yd.l) hVar.c.get())).C1();
                    return;
                }
                return;
            case 13:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                Xb.h hVar2 = (Xb.h) this.f19074b;
                PayMayaError payMayaErrorF3 = hVar2.f(it3, false);
                kotlin.jvm.internal.j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                ue.d dVar3 = ((ShopV3PageFragment) ((ve.d) hVar2.c.get())).f14805d0;
                if (dVar3 == null || (arrayList = dVar3.c) == null || !arrayList.isEmpty()) {
                    ((ShopV3PageFragment) ((ve.d) hVar2.c.get())).w1();
                    return;
                }
                if (payMayaErrorF3.isSessionTimeout()) {
                    final ShopV3PageFragment shopV3PageFragment = (ShopV3PageFragment) ((ve.d) hVar2.c.get());
                    shopV3PageFragment.getClass();
                    final int i4 = 0;
                    shopV3PageFragment.x1(200, new View.OnClickListener() { // from class: we.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    ShopV3PageFragment shopV3PageFragment2 = shopV3PageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment2.z1();
                                        shopV3PageFragment2.A1().k();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    ShopV3PageFragment shopV3PageFragment3 = shopV3PageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment3.A1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3PageFragment shopV3PageFragment4 = shopV3PageFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment4.A1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    return;
                }
                if (payMayaErrorF3.isNetworkError()) {
                    final ShopV3PageFragment shopV3PageFragment2 = (ShopV3PageFragment) ((ve.d) hVar2.c.get());
                    shopV3PageFragment2.getClass();
                    final int i6 = 2;
                    shopV3PageFragment2.x1(100, new View.OnClickListener() { // from class: we.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    ShopV3PageFragment shopV3PageFragment22 = shopV3PageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment22.z1();
                                        shopV3PageFragment22.A1().k();
                                        return;
                                    } finally {
                                    }
                                case 1:
                                    ShopV3PageFragment shopV3PageFragment3 = shopV3PageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment3.A1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3PageFragment shopV3PageFragment4 = shopV3PageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PageFragment4.A1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    return;
                }
                ve.d dVar4 = (ve.d) hVar2.c.get();
                String strMSpiel = payMayaErrorF3.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                final ShopV3PageFragment shopV3PageFragment3 = (ShopV3PageFragment) dVar4;
                shopV3PageFragment3.getClass();
                final int i10 = 1;
                shopV3PageFragment3.y1(200, strMSpiel, new View.OnClickListener() { // from class: we.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                ShopV3PageFragment shopV3PageFragment22 = shopV3PageFragment3;
                                Callback.onClick_enter(view);
                                try {
                                    shopV3PageFragment22.z1();
                                    shopV3PageFragment22.A1().k();
                                    return;
                                } finally {
                                }
                            case 1:
                                ShopV3PageFragment shopV3PageFragment32 = shopV3PageFragment3;
                                Callback.onClick_enter(view);
                                try {
                                    shopV3PageFragment32.A1().k();
                                    return;
                                } finally {
                                }
                            default:
                                ShopV3PageFragment shopV3PageFragment4 = shopV3PageFragment3;
                                Callback.onClick_enter(view);
                                try {
                                    shopV3PageFragment4.A1().k();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
                return;
            case 14:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, "accountBalance");
                se.f fVar2 = (se.f) this.f19074b;
                fVar2.getClass();
                ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((ve.e) fVar2.c.get());
                shopV3PaymentFragment.getClass();
                shopV3PaymentFragment.f14819h0 = accountBalance;
                List listA = fVar2.f20060g.a();
                kotlin.jvm.internal.j.f(listA, "getFundSources(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listA) {
                    if (kotlin.jvm.internal.j.b(((FundSource) obj2).mTransactionEnabled(), Boolean.TRUE)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    E1 e12 = ((ShopV3PaymentFragment) ((ve.e) fVar2.c.get())).f14814c0;
                    kotlin.jvm.internal.j.d(e12);
                    e12.i.setVisibility(8);
                    E1 e13 = ((ShopV3PaymentFragment) ((ve.e) fVar2.c.get())).f14814c0;
                    kotlin.jvm.internal.j.d(e13);
                    e13.f3597g.setVisibility(8);
                } else {
                    ShopV3PaymentFragment shopV3PaymentFragment2 = (ShopV3PaymentFragment) ((ve.e) fVar2.c.get());
                    shopV3PaymentFragment2.getClass();
                    com.paymaya.common.adapter.a aVar = shopV3PaymentFragment2.f14816e0;
                    if (aVar == null) {
                        kotlin.jvm.internal.j.n("mFundSourceAdapter");
                        throw null;
                    }
                    aVar.f10231a = new ArrayList(arrayList2);
                    E1 e14 = ((ShopV3PaymentFragment) ((ve.e) fVar2.c.get())).f14814c0;
                    kotlin.jvm.internal.j.d(e14);
                    e14.i.setVisibility(0);
                    E1 e15 = ((ShopV3PaymentFragment) ((ve.e) fVar2.c.get())).f14814c0;
                    kotlin.jvm.internal.j.d(e15);
                    e15.f3597g.setVisibility(0);
                }
                for (FundSource fundSource : fVar2.f20060g.a()) {
                    if (fundSource.isTypeVirtual()) {
                        String fundSourceText = fVar2.k(fundSource, accountBalance);
                        ShopV3PaymentFragment shopV3PaymentFragment3 = (ShopV3PaymentFragment) ((ve.e) fVar2.c.get());
                        shopV3PaymentFragment3.getClass();
                        kotlin.jvm.internal.j.g(fundSourceText, "fundSourceText");
                        shopV3PaymentFragment3.D1().setText(fundSourceText);
                        ShopV3PaymentFragment shopV3PaymentFragment4 = (ShopV3PaymentFragment) ((ve.e) fVar2.c.get());
                        shopV3PaymentFragment4.getClass();
                        shopV3PaymentFragment4.f14823l0 = fundSource;
                        return;
                    }
                }
                return;
            case 15:
                Throwable throwable3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable3, "throwable");
                se.i iVar2 = (se.i) this.f19074b;
                PayMayaError payMayaErrorF4 = iVar2.f(throwable3, false);
                kotlin.jvm.internal.j.f(payMayaErrorF4, "paymayaErrorHandling(...)");
                iVar2.m(payMayaErrorF4);
                return;
            case 16:
                Throwable throwable4 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable4, "throwable");
                se.l lVar2 = (se.l) this.f19074b;
                PayMayaError payMayaErrorF5 = lVar2.f(throwable4, false);
                kotlin.jvm.internal.j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                lVar2.m(payMayaErrorF5);
                return;
            case 17:
                ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                ((A) this.f19074b).m(shopPurchaseHistoryBase);
                return;
            case 19:
                MFAChallengeInformationV2 mfaChallengeInfo2 = (MFAChallengeInformationV2) obj;
                kotlin.jvm.internal.j.g(mfaChallengeInfo2, "mfaChallengeInfo");
                y9.b bVar = ((MayaMfaFaceAuthFragment) ((x9.a) ((A7.j) this.f19074b).c.get())).f12936X;
                if (bVar != null) {
                    ((MayaMfaActivity) bVar).f12929p = mfaChallengeInfo2;
                }
                A7.j jVar3 = (A7.j) this.f19074b;
                jVar3.getClass();
                String tencentToken = mfaChallengeInfo2.getTencentToken();
                if (tencentToken == null) {
                    A7.j.s(jVar3, null, 3);
                    return;
                }
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) jVar3.c.get());
                mayaMfaFaceAuthFragment.getClass();
                C2070f1 c2070f1 = new C2070f1(mayaMfaFaceAuthFragment, 17);
                mayaMfaFaceAuthFragment.K1();
                HuiYanOsApi.startHuiYanAuth(tencentToken, mayaMfaFaceAuthFragment.f14176W, c2070f1);
                return;
            case 20:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                ((MayaBaseFragment) ((x9.b) ((Bb.f) this.f19074b).c.get())).w1();
                qk.i.D((x9.b) ((Bb.f) this.f19074b).c.get());
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Throwable throwable = (Throwable) obj;
        kotlin.jvm.internal.j.g(throwable, "throwable");
        AccountBalance accountBalanceB = ((C1247a) ((C0323a) this.f19074b).f2878g).b();
        return accountBalanceB != null ? Ah.p.c(accountBalanceB) : Ah.p.b(throwable);
    }

    @Override // Ch.e
    public Unit c(Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        List<ShopProvider> data;
        List<ShopProvider> data2;
        List<ProductV3> records;
        int i = 1;
        int i4 = 0;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        Pair pair3 = (Pair) obj3;
        Pair pair4 = (Pair) obj4;
        kotlin.jvm.internal.j.g(pair, "<destruct>");
        kotlin.jvm.internal.j.g(pair2, "<destruct>");
        kotlin.jvm.internal.j.g(pair3, "<destruct>");
        kotlin.jvm.internal.j.g(pair4, "<destruct>");
        Throwable th2 = (Throwable) pair.f18161b;
        ProductV3Base productV3Base = (ProductV3Base) pair2.f18160a;
        Throwable th3 = (Throwable) pair2.f18161b;
        ShopProviderBase shopProviderBase = (ShopProviderBase) pair3.f18160a;
        Throwable th4 = (Throwable) pair3.f18161b;
        ShopProviderBase shopProviderBase2 = (ShopProviderBase) pair4.f18160a;
        Throwable th5 = (Throwable) pair4.f18161b;
        se.e eVar = (se.e) this.f19074b;
        Throwable[] thArr = {th2, th3, th4, th5};
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < 4; i6++) {
            Throwable th6 = thArr[i6];
            if (th6 != null) {
                PayMayaError payMayaErrorF = eVar.f(th6, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout()) {
                    throw new Exception(th6);
                }
                arrayList.add(payMayaErrorF);
            }
        }
        if ((productV3Base == null || (records = productV3Base.getRecords()) == null || records.isEmpty()) && ((shopProviderBase == null || (data2 = shopProviderBase.getData()) == null || data2.isEmpty()) && (shopProviderBase2 == null || (data = shopProviderBase2.getData()) == null || data.isEmpty()))) {
            se.e eVar2 = (se.e) this.f19074b;
            eVar2.getClass();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((ve.c) eVar2.c.get());
                    shopV3HomePageFragment.getClass();
                    shopV3HomePageFragment.x1(200, new ViewOnClickListenerC2420i(shopV3HomePageFragment, i));
                    break;
                }
                if (((PayMayaError) it.next()).isNetworkError()) {
                    ShopV3HomePageFragment shopV3HomePageFragment2 = (ShopV3HomePageFragment) ((ve.c) eVar2.c.get());
                    shopV3HomePageFragment2.getClass();
                    shopV3HomePageFragment2.x1(100, new ViewOnClickListenerC2420i(shopV3HomePageFragment2, i4));
                    break;
                }
            }
        }
        return Unit.f18162a;
    }

    @Override // t4.j
    public void i() {
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception e) {
        kotlin.jvm.internal.j.g(e, "e");
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) this.f19074b;
        ImageView imageView = shopV3ProviderProductsListFragment.f14835d0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mBannerImageView");
            throw null;
        }
        imageView.setVisibility(8);
        LottieAnimationView lottieAnimationView = shopV3ProviderProductsListFragment.f14836e0;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mBannerLoadingLottieView");
            throw null;
        }
    }

    @Override // t4.j
    public void onRefresh() {
        MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) this.f19074b;
        ((l7.b) mayaCreatorStoreFragment.Q1()).n();
        LottieAnimationView lottieAnimationView = mayaCreatorStoreFragment.f12114r0;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieView");
            throw null;
        }
        lottieAnimationView.d();
        l7.b bVar = (l7.b) mayaCreatorStoreFragment.Q1();
        bVar.h = false;
        String str = bVar.f18252g;
        C1280q0 c1280q0 = bVar.f18251d;
        c1280q0.b(str, null);
        c1280q0.a(str);
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = (ShopV3ProviderProductsListFragment) this.f19074b;
        ImageView imageView = shopV3ProviderProductsListFragment.f14835d0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mBannerImageView");
            throw null;
        }
        imageView.setVisibility(0);
        LottieAnimationView lottieAnimationView = shopV3ProviderProductsListFragment.f14836e0;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mBannerLoadingLottieView");
            throw null;
        }
    }

    @Override // G5.InterfaceC0254d
    public void u() {
        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) this.f19074b;
        ((C1819q) mayaQRPHMerchantPaymentFragment.Q1()).m(mayaQRPHMerchantPaymentFragment.P1());
    }

    public /* synthetic */ a(Object obj, int i) {
        this.f19073a = i;
        this.f19074b = obj;
    }

    public a(Qi.c cVar) {
        this.f19073a = 18;
        Objects.requireNonNull(cVar);
        this.f19074b = cVar;
    }

    public a() {
        this.f19073a = 25;
        this.f19074b = new CopyOnWriteArrayList();
    }
}
