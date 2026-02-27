package Xb;

import N5.F0;
import N5.r1;
import ac.F;
import ac.G;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import ue.C2309A;
import ue.C2310B;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6598d;
    public final C1285t0 e;
    public final com.paymaya.data.preference.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C1285t0 c1285t0, com.paymaya.data.preference.a mPreference, Uh.d dVar, int i) {
        super(dVar);
        this.f6598d = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                super(dVar);
                this.e = c1285t0;
                this.f = mPreference;
                break;
            case 2:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                super(dVar);
                this.e = c1285t0;
                this.f = mPreference;
                break;
            case 3:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                super(dVar);
                this.e = c1285t0;
                this.f = mPreference;
                break;
            default:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = c1285t0;
                this.f = mPreference;
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        switch (this.f6598d) {
            case 0:
                super.j();
                ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).K1();
                return;
            case 1:
                super.j();
                ((MayaShopSearchFragment) ((bc.o) this.c.get())).L1();
                if (this.f.e().isLoadV2Enabled()) {
                    ConstraintLayout constraintLayout = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14165d0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mViewLoadV2Banner");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout2 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14165d0;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mViewLoadV2Banner");
                    throw null;
                }
            case 2:
                super.j();
                ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).D1();
                return;
            default:
                super.j();
                ((ShopV3SearchFragment) ((ve.m) this.c.get())).C1();
                return;
        }
    }

    public final void k(String searchQuery) {
        switch (this.f6598d) {
            case 0:
                kotlin.jvm.internal.j.g(searchQuery, "searchQuery");
                new Lh.d(new Lh.d(new Lh.h(C1285t0.f(this.e, this.f.e().mShopConfig().mDefaultCategory(), searchQuery, ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).H1(), 1), zh.b.a(), 0), new v(this, searchQuery, 0), 2), new v(this, searchQuery, 1), 0).e();
                break;
            case 1:
                kotlin.jvm.internal.j.g(searchQuery, "searchQuery");
                new Lh.d(new Lh.d(new Lh.h(C1285t0.e(this.e, this.f.e().mShopConfig().mDefaultCategory(), searchQuery, 1), zh.b.a(), 0), new D(this, searchQuery, 0), 2), new D(this, searchQuery, 1), 0).e();
                break;
            case 2:
                kotlin.jvm.internal.j.g(searchQuery, "searchQuery");
                new Lh.d(new Lh.d(new Lh.h(C1285t0.f(this.e, this.f.e().mShopConfig().mDefaultCategory(), searchQuery, ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).C1(), 1), zh.b.a(), 0), new se.j(this, searchQuery, 0), 2), new se.j(this, searchQuery, 1), 0).e();
                break;
            default:
                kotlin.jvm.internal.j.g(searchQuery, "searchQuery");
                new Lh.d(new Lh.d(new Lh.h(C1285t0.e(this.e, this.f.e().mShopConfig().mDefaultCategory(), searchQuery, 1), zh.b.a(), 0), new se.m(this, searchQuery, 0), 2), new se.m(this, searchQuery, 1), 0).e();
                break;
        }
    }

    public final void l() {
        switch (this.f6598d) {
            case 0:
                String str = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14095j0;
                if (!((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14091f0 && str.length() >= 2) {
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14091f0 = true;
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).J1();
                    F f = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14092g0;
                    if (f != null) {
                        ArrayList arrayList = f.f7086b;
                        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new G(arrayList, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                        arrayList.clear();
                        diffResultCalculateDiff.dispatchUpdatesTo(f);
                    }
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14090e0 = 1;
                    k(str);
                    break;
                }
                break;
            case 1:
                String str2 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14173l0;
                if (!((MayaShopSearchFragment) ((bc.o) this.c.get())).f14171j0 && str2.length() >= 2) {
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14171j0 = true;
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).K1();
                    F f3 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14167f0;
                    if (f3 != null) {
                        ArrayList arrayList2 = f3.f7086b;
                        DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new G(arrayList2, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff2, "calculateDiff(...)");
                        arrayList2.clear();
                        diffResultCalculateDiff2.dispatchUpdatesTo(f3);
                    }
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14170i0 = 1;
                    k(str2);
                    break;
                }
                break;
            case 2:
                String str3 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14853i0;
                if (!((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14849e0 && str3.length() >= 2) {
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14849e0 = true;
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).z1();
                    C2309A c2309a = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0;
                    if (c2309a != null) {
                        ArrayList arrayList3 = c2309a.f20283b;
                        DiffUtil.DiffResult diffResultCalculateDiff3 = DiffUtil.calculateDiff(new C2310B(arrayList3, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff3, "calculateDiff(...)");
                        arrayList3.clear();
                        diffResultCalculateDiff3.dispatchUpdatesTo(c2309a);
                    }
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14848d0 = 1;
                    k(str3);
                    break;
                }
                break;
            default:
                String str4 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14894j0;
                if (!((ShopV3SearchFragment) ((ve.m) this.c.get())).f14890f0 && str4.length() >= 2) {
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14890f0 = true;
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).z1();
                    C2309A c2309a2 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14891g0;
                    if (c2309a2 != null) {
                        ArrayList arrayList4 = c2309a2.f20283b;
                        DiffUtil.DiffResult diffResultCalculateDiff4 = DiffUtil.calculateDiff(new C2310B(arrayList4, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff4, "calculateDiff(...)");
                        arrayList4.clear();
                        diffResultCalculateDiff4.dispatchUpdatesTo(c2309a2);
                    }
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14889e0 = 1;
                    k(str4);
                    break;
                }
                break;
        }
    }

    public final void m(List list) {
        F f;
        F f3;
        C2309A c2309a;
        C2309A c2309a2;
        switch (this.f6598d) {
            case 0:
                List list2 = list;
                if ((list2 != null && !list2.isEmpty()) || (f = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14092g0) == null || f.getItemCount() != 0) {
                    if (list != null) {
                        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get());
                        mayaShopProviderProductsListSearchFragment.getClass();
                        F f7 = mayaShopProviderProductsListSearchFragment.f14092g0;
                        if (f7 != null) {
                            f7.e(list);
                        }
                    }
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).K1();
                    return;
                }
                MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment2 = (MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get());
                Group group = mayaShopProviderProductsListSearchFragment2.f14086a0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mLoadingGroup");
                    throw null;
                }
                group.setVisibility(8);
                NestedScrollView nestedScrollView = mayaShopProviderProductsListSearchFragment2.f14084Y;
                if (nestedScrollView == null) {
                    kotlin.jvm.internal.j.n("mSearchResultsScrollView");
                    throw null;
                }
                nestedScrollView.setVisibility(8);
                Group group2 = mayaShopProviderProductsListSearchFragment2.f14087b0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mNoSearchResultsGroup");
                    throw null;
                }
                group2.setVisibility(0);
                F0 f02 = mayaShopProviderProductsListSearchFragment2.f14088c0;
                if (f02 != null) {
                    f02.f3618b.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
            case 1:
                List list3 = list;
                if ((list3 != null && !list3.isEmpty()) || (f3 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14167f0) == null || f3.getItemCount() != 0) {
                    if (list != null) {
                        MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) ((bc.o) this.c.get());
                        mayaShopSearchFragment.getClass();
                        F f10 = mayaShopSearchFragment.f14167f0;
                        if (f10 != null) {
                            f10.e(list);
                        }
                    }
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).L1();
                    return;
                }
                MayaShopSearchFragment mayaShopSearchFragment2 = (MayaShopSearchFragment) ((bc.o) this.c.get());
                Group group3 = mayaShopSearchFragment2.f14161Z;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("mLoadingGroup");
                    throw null;
                }
                group3.setVisibility(8);
                NestedScrollView nestedScrollView2 = mayaShopSearchFragment2.f14159X;
                if (nestedScrollView2 == null) {
                    kotlin.jvm.internal.j.n("mSearchResultsScrollView");
                    throw null;
                }
                nestedScrollView2.setVisibility(8);
                Group group4 = mayaShopSearchFragment2.f14162a0;
                if (group4 == null) {
                    kotlin.jvm.internal.j.n("mNoSearchResultsGroup");
                    throw null;
                }
                group4.setVisibility(0);
                F0 f03 = mayaShopSearchFragment2.f14163b0;
                if (f03 != null) {
                    f03.f3618b.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
            case 2:
                List list4 = list;
                if ((list4 == null || list4.isEmpty()) && (c2309a = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0) != null && c2309a.getItemCount() == 0) {
                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment = (ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get());
                    shopV3ProviderProductsListSearchFragment.w1();
                    shopV3ProviderProductsListSearchFragment.A1().setVisibility(8);
                    r1 r1Var = shopV3ProviderProductsListSearchFragment.f14846b0;
                    kotlin.jvm.internal.j.d(r1Var);
                    ((Group) r1Var.f4198b).setVisibility(0);
                    return;
                }
                if (list != null) {
                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment2 = (ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get());
                    shopV3ProviderProductsListSearchFragment2.getClass();
                    C2309A c2309a3 = shopV3ProviderProductsListSearchFragment2.f14850f0;
                    if (c2309a3 != null) {
                        c2309a3.e(list);
                    }
                }
                ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).D1();
                return;
            default:
                List list5 = list;
                if ((list5 != null && !list5.isEmpty()) || (c2309a2 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14891g0) == null || c2309a2.getItemCount() != 0) {
                    if (list != null) {
                        ShopV3SearchFragment shopV3SearchFragment = (ShopV3SearchFragment) ((ve.m) this.c.get());
                        shopV3SearchFragment.getClass();
                        C2309A c2309a4 = shopV3SearchFragment.f14891g0;
                        if (c2309a4 != null) {
                            c2309a4.e(list);
                        }
                    }
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).C1();
                    return;
                }
                ShopV3SearchFragment shopV3SearchFragment2 = (ShopV3SearchFragment) ((ve.m) this.c.get());
                shopV3SearchFragment2.w1();
                RecyclerView recyclerView = shopV3SearchFragment2.f14887c0;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewItems");
                    throw null;
                }
                recyclerView.setVisibility(8);
                r1 r1Var2 = shopV3SearchFragment2.f14886b0;
                kotlin.jvm.internal.j.d(r1Var2);
                ((Group) r1Var2.f4198b).setVisibility(0);
                return;
        }
    }

    public final void n(PayMayaError payMayaError, String str) {
        final int i = 1;
        final int i4 = 0;
        switch (this.f6598d) {
            case 0:
                y5.s sVar = (bc.i) this.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("provider", ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).H1());
                c1219hH.j.put("keyword", str);
                c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get());
                Group group = mayaShopProviderProductsListSearchFragment.f14086a0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mLoadingGroup");
                    throw null;
                }
                group.setVisibility(8);
                NestedScrollView nestedScrollView = mayaShopProviderProductsListSearchFragment.f14084Y;
                if (nestedScrollView == null) {
                    kotlin.jvm.internal.j.n("mSearchResultsScrollView");
                    throw null;
                }
                nestedScrollView.setVisibility(8);
                Group group2 = mayaShopProviderProductsListSearchFragment.f14087b0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mNoSearchResultsGroup");
                    throw null;
                }
                group2.setVisibility(8);
                F0 f02 = mayaShopProviderProductsListSearchFragment.f14088c0;
                if (f02 == null) {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
                f02.f3618b.setVisibility(0);
                F0 f03 = mayaShopProviderProductsListSearchFragment.f14088c0;
                if (f03 == null) {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
                f03.e.setText(mayaShopProviderProductsListSearchFragment.getString(R.string.maya_label_that_didnt_load_right));
                F0 f04 = mayaShopProviderProductsListSearchFragment.f14088c0;
                if (f04 == null) {
                    kotlin.jvm.internal.j.n("mErrorView");
                    throw null;
                }
                f04.f3619d.setText(mayaShopProviderProductsListSearchFragment.getString(R.string.maya_label_connection_issue));
                F f = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14092g0;
                if (f != null && f.f7087d) {
                    f.f(false);
                }
                ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14091f0 = false;
                return;
            case 1:
                int iMErrorCode = payMayaError.mErrorCode();
                String strMSpiel = payMayaError.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
                if (this.f.e().isShopEventsV2Enabled()) {
                    MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) ((bc.o) this.c.get());
                    mayaShopSearchFragment.getClass();
                    C1219h c1219hE = C1219h.e("SHOP_ERROR_SCREEN");
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put("section", "Search");
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    String strValueOf = String.valueOf(iMErrorCode);
                    if (strValueOf != null) {
                        c1219hE.j.put("keyword", strValueOf);
                    }
                    EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put(Constants.REASON, strMSpiel);
                    mayaShopSearchFragment.z1(c1219hE);
                } else {
                    y5.s sVar2 = (bc.o) this.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put("keyword", str);
                    c1219hH2.j.put(Constants.REASON, strMSpiel);
                    c1219hH2.i();
                    ((MayaBaseFragment) sVar2).A1(c1219hH2);
                }
                F f3 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14167f0;
                if (f3 != null && f3.getItemCount() == 0) {
                    MayaShopSearchFragment mayaShopSearchFragment2 = (MayaShopSearchFragment) ((bc.o) this.c.get());
                    Group group3 = mayaShopSearchFragment2.f14161Z;
                    if (group3 == null) {
                        kotlin.jvm.internal.j.n("mLoadingGroup");
                        throw null;
                    }
                    group3.setVisibility(8);
                    NestedScrollView nestedScrollView2 = mayaShopSearchFragment2.f14159X;
                    if (nestedScrollView2 == null) {
                        kotlin.jvm.internal.j.n("mSearchResultsScrollView");
                        throw null;
                    }
                    nestedScrollView2.setVisibility(8);
                    Group group4 = mayaShopSearchFragment2.f14162a0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n("mNoSearchResultsGroup");
                        throw null;
                    }
                    group4.setVisibility(8);
                    F0 f05 = mayaShopSearchFragment2.f14163b0;
                    if (f05 == null) {
                        kotlin.jvm.internal.j.n("mErrorView");
                        throw null;
                    }
                    f05.f3618b.setVisibility(0);
                    F0 f06 = mayaShopSearchFragment2.f14163b0;
                    if (f06 == null) {
                        kotlin.jvm.internal.j.n("mErrorView");
                        throw null;
                    }
                    f06.e.setText(mayaShopSearchFragment2.getString(R.string.maya_label_that_didnt_load_right));
                    F0 f07 = mayaShopSearchFragment2.f14163b0;
                    if (f07 == null) {
                        kotlin.jvm.internal.j.n("mErrorView");
                        throw null;
                    }
                    f07.f3619d.setText(mayaShopSearchFragment2.getString(R.string.maya_label_connection_issue));
                } else {
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).L1();
                }
                ((MayaShopSearchFragment) ((bc.o) this.c.get())).H1();
                ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14171j0 = false;
                return;
            case 2:
                Object obj = (ve.g) this.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put("provider", ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).C1());
                c1219hH3.j.put("keyword", str);
                c1219hH3.j.put(Constants.REASON, payMayaError.mSpiel());
                ((BaseFragment) obj).o1(c1219hH3);
                C2309A c2309a = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0;
                if (c2309a == null || c2309a.getItemCount() != 0) {
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).D1();
                } else if (payMayaError.isNetworkError()) {
                    ve.g gVar = (ve.g) this.c.get();
                    String strMSpiel2 = payMayaError.mSpiel();
                    final ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment = (ShopV3ProviderProductsListSearchFragment) gVar;
                    shopV3ProviderProductsListSearchFragment.getClass();
                    shopV3ProviderProductsListSearchFragment.y1(100, strMSpiel2, new View.OnClickListener() { // from class: we.w
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment2 = shopV3ProviderProductsListSearchFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3ProviderProductsListSearchFragment2.B1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment3 = shopV3ProviderProductsListSearchFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3ProviderProductsListSearchFragment3.B1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                } else {
                    ve.g gVar2 = (ve.g) this.c.get();
                    String strMSpiel3 = payMayaError.mSpiel();
                    final ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment2 = (ShopV3ProviderProductsListSearchFragment) gVar2;
                    shopV3ProviderProductsListSearchFragment2.getClass();
                    shopV3ProviderProductsListSearchFragment2.y1(200, strMSpiel3, new View.OnClickListener() { // from class: we.w
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment22 = shopV3ProviderProductsListSearchFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3ProviderProductsListSearchFragment22.B1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment3 = shopV3ProviderProductsListSearchFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3ProviderProductsListSearchFragment3.B1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                }
                C2309A c2309a2 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0;
                if (c2309a2 != null && c2309a2.f20284d) {
                    c2309a2.f(false);
                }
                ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14849e0 = false;
                return;
            default:
                Object obj2 = (ve.m) this.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(12);
                EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH4.j.put("keyword", str);
                c1219hH4.j.put(Constants.REASON, payMayaError.mSpiel());
                ((BaseFragment) obj2).o1(c1219hH4);
                C2309A c2309a3 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14891g0;
                if (c2309a3 == null || c2309a3.getItemCount() != 0) {
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).C1();
                } else if (payMayaError.isNetworkError()) {
                    ve.m mVar = (ve.m) this.c.get();
                    String strMSpiel4 = payMayaError.mSpiel();
                    final ShopV3SearchFragment shopV3SearchFragment = (ShopV3SearchFragment) mVar;
                    shopV3SearchFragment.getClass();
                    shopV3SearchFragment.y1(100, strMSpiel4, new View.OnClickListener() { // from class: we.N
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    ShopV3SearchFragment shopV3SearchFragment2 = shopV3SearchFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3SearchFragment2.A1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3SearchFragment shopV3SearchFragment3 = shopV3SearchFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3SearchFragment3.A1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                } else {
                    ve.m mVar2 = (ve.m) this.c.get();
                    String strMSpiel5 = payMayaError.mSpiel();
                    final ShopV3SearchFragment shopV3SearchFragment2 = (ShopV3SearchFragment) mVar2;
                    shopV3SearchFragment2.getClass();
                    shopV3SearchFragment2.y1(200, strMSpiel5, new View.OnClickListener() { // from class: we.N
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    ShopV3SearchFragment shopV3SearchFragment22 = shopV3SearchFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3SearchFragment22.A1().l();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3SearchFragment shopV3SearchFragment3 = shopV3SearchFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3SearchFragment3.A1().l();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                }
                ((ShopV3SearchFragment) ((ve.m) this.c.get())).B1();
                ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14890f0 = false;
                return;
        }
    }

    public final void o(String str, List list) {
        switch (this.f6598d) {
            case 0:
                if (this.f.e().isShopEventsV2Enabled()) {
                    C1219h c1219hE = C1219h.e("SHOP_SEARCH_RESULTS");
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put("section", ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).H1());
                    c1219hE.j.put("no_of_results", String.valueOf(list != null ? list.size() : 0));
                    ((MayaBaseFragment) ((bc.i) this.c.get())).z1(c1219hE);
                } else {
                    y5.s sVar = (bc.i) this.c.get();
                    C1219h c1219hH = AbstractC2329d.h(14);
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put("provider", ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).H1());
                    c1219hH.j.put("keyword", str);
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                }
                String str2 = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14095j0;
                if (!kotlin.jvm.internal.j.b(str2, str) && str2.length() >= 2) {
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).J1();
                    F f = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14092g0;
                    if (f != null) {
                        ArrayList arrayList = f.f7086b;
                        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new G(arrayList, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                        arrayList.clear();
                        diffResultCalculateDiff.dispatchUpdatesTo(f);
                    }
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14090e0 = 1;
                    k(str2);
                } else {
                    m(list);
                    F f3 = ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14092g0;
                    if (f3 != null && f3.f7087d) {
                        f3.f(false);
                    }
                    ((MayaShopProviderProductsListSearchFragment) ((bc.i) this.c.get())).f14091f0 = false;
                }
                break;
            case 1:
                if (this.f.e().isShopEventsV2Enabled()) {
                    C1219h c1219hE2 = C1219h.e("SHOP_SEARCH_RESULTS");
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE2.j.put("section", "Global");
                    c1219hE2.j.put("no_of_results", String.valueOf(list != null ? list.size() : 0));
                    ((MayaBaseFragment) ((bc.o) this.c.get())).z1(c1219hE2);
                } else {
                    y5.s sVar2 = (bc.o) this.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(14);
                    EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put("keyword", str);
                    c1219hH2.i();
                    ((MayaBaseFragment) sVar2).A1(c1219hH2);
                }
                String str3 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14173l0;
                if (!kotlin.jvm.internal.j.b(str3, str) && str3.length() >= 2) {
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).K1();
                    F f7 = ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14167f0;
                    if (f7 != null) {
                        ArrayList arrayList2 = f7.f7086b;
                        DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new G(arrayList2, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff2, "calculateDiff(...)");
                        arrayList2.clear();
                        diffResultCalculateDiff2.dispatchUpdatesTo(f7);
                    }
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14170i0 = 1;
                    k(str3);
                } else {
                    m(list);
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).H1();
                    ((MayaShopSearchFragment) ((bc.o) this.c.get())).f14171j0 = false;
                }
                break;
            case 2:
                Object obj = (ve.g) this.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(14);
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH3.j.put("provider", ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).C1());
                c1219hH3.j.put("keyword", str);
                ((BaseFragment) obj).o1(c1219hH3);
                String str4 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14853i0;
                if (!kotlin.jvm.internal.j.b(str4, str) && str4.length() >= 2) {
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).z1();
                    C2309A c2309a = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0;
                    if (c2309a != null) {
                        ArrayList arrayList3 = c2309a.f20283b;
                        DiffUtil.DiffResult diffResultCalculateDiff3 = DiffUtil.calculateDiff(new C2310B(arrayList3, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff3, "calculateDiff(...)");
                        arrayList3.clear();
                        diffResultCalculateDiff3.dispatchUpdatesTo(c2309a);
                    }
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14848d0 = 1;
                    k(str4);
                } else {
                    m(list);
                    C2309A c2309a2 = ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14850f0;
                    if (c2309a2 != null && c2309a2.f20284d) {
                        c2309a2.f(false);
                    }
                    ((ShopV3ProviderProductsListSearchFragment) ((ve.g) this.c.get())).f14849e0 = false;
                }
                break;
            default:
                Object obj2 = (ve.m) this.c.get();
                C1219h c1219hH4 = AbstractC2329d.h(14);
                EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH4.j.put("keyword", str);
                ((BaseFragment) obj2).o1(c1219hH4);
                String str5 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14894j0;
                if (!kotlin.jvm.internal.j.b(str5, str) && str5.length() >= 2) {
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).z1();
                    C2309A c2309a3 = ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14891g0;
                    if (c2309a3 != null) {
                        ArrayList arrayList4 = c2309a3.f20283b;
                        DiffUtil.DiffResult diffResultCalculateDiff4 = DiffUtil.calculateDiff(new C2310B(arrayList4, C1112C.f9377a));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff4, "calculateDiff(...)");
                        arrayList4.clear();
                        diffResultCalculateDiff4.dispatchUpdatesTo(c2309a3);
                    }
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14889e0 = 1;
                    k(str5);
                } else {
                    m(list);
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).B1();
                    ((ShopV3SearchFragment) ((ve.m) this.c.get())).f14890f0 = false;
                }
                break;
        }
    }
}
