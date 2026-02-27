package com.paymaya.mayaui.shop.view.activity.impl;

import B5.i;
import D.C0187u;
import N5.A1;
import N5.B;
import N5.C0460j;
import N5.C0491z;
import S5.c;
import Y6.a;
import Y6.d;
import Y6.e;
import Y6.o;
import Yb.b;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import bc.k;
import cc.D;
import cc.G;
import cc.I;
import cc.InterfaceC1087A;
import cc.InterfaceC1091d;
import cc.InterfaceC1094g;
import cc.InterfaceC1096i;
import cc.InterfaceC1097j;
import cc.m;
import cc.n;
import cc.s;
import cc.u;
import cc.x;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopReceiptFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ReceiptFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import we.InterfaceC2408M;
import we.InterfaceC2414c;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaShopV2Activity extends q implements b, InterfaceC1091d, InterfaceC1094g, InterfaceC1096i, I, x, m, G, InterfaceC2408M, InterfaceC2414c, D, s, n, cc.q, u, InterfaceC1087A, InterfaceC1097j, W6.b, e, d, a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f13985B = 0;
    public Bundle m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0460j f13986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f13987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13988p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f13989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FlutterEngine f13990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pg.u f13991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FlutterEngine f13992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pg.u f13993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PaymentConfirmationSummary f13995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bb.a f13996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13997y;

    public static final void Z1(MayaShopV2Activity mayaShopV2Activity) {
        if (mayaShopV2Activity.p1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(11));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put(numX49.tnTj78("bVcP"), numX49.tnTj78("bVcb"));
            map.put(numX49.tnTj78("bVc2"), mayaShopV2Activity.f13989q);
            mayaShopV2Activity.k1().b(c1219hE);
        }
        mayaShopV2Activity.onBackPressed();
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f13987o = fragment;
        boolean z4 = true;
        x1(true);
        w1(true);
        boolean z5 = fragment instanceof MayaShopFragment;
        if (!z5 && !(fragment instanceof MayaShopSearchFragment)) {
            z4 = false;
        }
        this.f13988p = z4;
        invalidateOptionsMenu();
        if (z5) {
            K1(getString(R.string.maya_shop_title));
            T1();
            r1();
            s1();
            u1();
            this.f13989q = numX49.tnTj78("bVcL");
            return;
        }
        if (fragment instanceof MayaShopSearchFragment) {
            K1(getString(R.string.maya_shop_title));
            T1();
            r1();
            s1();
            u1();
            this.f13989q = numX49.tnTj78("bVcr");
            return;
        }
        if (fragment instanceof MayaShopProvidersCollectionFragment) {
            K1(getString(R.string.maya_shop_providers_title));
            U1();
            return;
        }
        if (fragment instanceof MayaShopProviderProductsListFragment) {
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (fragment instanceof MayaShopPaymentFragment) {
            Bb.a aVarV1 = V1();
            if (aVarV1.e.e().isMayaShopWithCheckoutFlowEnabled()) {
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) ((b) aVarV1.c.get());
                mayaShopV2Activity.K1(mayaShopV2Activity.getString(R.string.maya_buy_title));
                mayaShopV2Activity.T1();
                mayaShopV2Activity.r1();
                mayaShopV2Activity.s1();
                mayaShopV2Activity.U1();
                return;
            }
            MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) ((b) aVarV1.c.get());
            mayaShopV2Activity2.t1();
            mayaShopV2Activity2.E1(50);
            mayaShopV2Activity2.R1();
            mayaShopV2Activity2.G1(mayaShopV2Activity2.getString(R.string.maya_label_toolbar_steps_50_percent));
            mayaShopV2Activity2.S1();
            mayaShopV2Activity2.U1();
            return;
        }
        if (fragment instanceof MayaShopPaymentConfirmationFragment) {
            t1();
            E1(100);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_100_percent));
            S1();
            U1();
            return;
        }
        if (fragment instanceof MayaContactsSelectionFragment) {
            K1(getString(R.string.maya_label_all_contacts_title));
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (fragment instanceof MayaShopProviderProductsListSearchFragment) {
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (fragment instanceof MayaShopReceiptFragment) {
            w1(false);
            return;
        }
        if (fragment instanceof ShopV3ReceiptFragment) {
            w1(false);
            O1();
        } else if (fragment instanceof MayaShopPurchaseHistoryFragment) {
            K1(getString(R.string.maya_shop_history_title));
            U1();
        } else if (fragment instanceof MayaShopPurchaseHistoryReceiptFragment) {
            w1(false);
        } else if (fragment instanceof MayaAllowContactsPermissionFragment) {
            J1(R.string.maya_label_all_contacts_title);
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("bVcZ"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    @Override // Y6.d
    public final void U() {
        AbstractC1236z.e(this, MayaContactsSelectionFragment.class, true);
    }

    public final Bb.a V1() {
        Bb.a aVar = this.f13996x;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bVck"));
        throw null;
    }

    public final Bundle W1() {
        Bundle bundle = this.m;
        return bundle == null ? new Bundle() : bundle;
    }

    public final void X1() {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bVcB"));
        String strTnTj78 = numX49.tnTj78("bVcu");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        this.f13990r = flutterEngine;
        pg.u uVar = new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bVcV"));
        this.f13991s = uVar;
        uVar.b(new Zb.a(this, 0));
        FlutterEngine flutterEngine2 = this.f13990r;
        String strTnTj782 = numX49.tnTj78("bVcS");
        if (flutterEngine2 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute(numX49.tnTj78("bVcj"));
        FlutterEngine flutterEngine3 = this.f13990r;
        if (flutterEngine3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bVci"), numX49.tnTj78("bVcE"), numX49.tnTj78("bVcd")));
    }

    public final void Y1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, str, null, null, null, false, payMayaError, null, false, 445).show(getSupportFragmentManager(), numX49.tnTj78("bVcF"));
    }

    public final void a2(ShopProvider shopProvider) {
        j.g(shopProvider, numX49.tnTj78("bVcH"));
        Fragment fragment = this.f13987o;
        MayaShopProviderPageFragment mayaShopProviderPageFragment = fragment instanceof MayaShopProviderPageFragment ? (MayaShopProviderPageFragment) fragment : null;
        if (mayaShopProviderPageFragment != null) {
            MayaResizingTabLayout mayaResizingTabLayout = mayaShopProviderPageFragment.f14045r0;
            if (mayaResizingTabLayout == null) {
                j.n(numX49.tnTj78("bVct"));
                throw null;
            }
            mayaResizingTabLayout.setVisibility(8);
            A1 a12 = mayaShopProviderPageFragment.f14047v0;
            if (a12 == null) {
                j.n(numX49.tnTj78("bVcQ"));
                throw null;
            }
            a12.f3548b.setVisibility(0);
            B b8 = mayaShopProviderPageFragment.w0;
            if (b8 == null) {
                j.n(numX49.tnTj78("bVcO"));
                throw null;
            }
            ((LinearLayout) b8.f3550b).setVisibility(0);
            mayaShopProviderPageFragment.P1().t();
        }
    }

    public final void b2(ProductV3 productV3) {
        String id = productV3 != null ? productV3.getId() : null;
        MayaShopPaymentFragment mayaShopPaymentFragment = new MayaShopPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVcU"), id);
        bundle.putString(numX49.tnTj78("bVce"), numX49.tnTj78("bVc8"));
        mayaShopPaymentFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_fragment_container, mayaShopPaymentFragment);
    }

    public final void c2(ProductV3 productV3) {
        String id = productV3 != null ? productV3.getId() : null;
        MayaShopPaymentFragment mayaShopPaymentFragment = new MayaShopPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVcC"), id);
        bundle.putString(numX49.tnTj78("bVc4"), numX49.tnTj78("bVco"));
        mayaShopPaymentFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_fragment_container, mayaShopPaymentFragment);
    }

    public final void d2(String str) {
        pg.u uVar = this.f13991s;
        if (uVar == null) {
            j.n(numX49.tnTj78("bVcD"));
            throw null;
        }
        uVar.a(numX49.tnTj78("bVcm"), M.h(new Pair(numX49.tnTj78("bVcK"), numX49.tnTj78("bVcw")), new Pair(numX49.tnTj78("bVcc"), str)), null);
        n1();
        i.g(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(ShopProvider shopProvider) {
        j.g(shopProvider, numX49.tnTj78("bVch"));
        Bb.a aVarV1 = V1();
        boolean zIsMayaShopProviderSubcategoriesEnabled = aVarV1.e.e().isMayaShopProviderSubcategoriesEnabled();
        String strTnTj78 = numX49.tnTj78("bVcM");
        if (zIsMayaShopProviderSubcategoriesEnabled) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) ((b) aVarV1.c.get());
            mayaShopV2Activity.getClass();
            MayaShopProviderPageFragment mayaShopProviderPageFragment = new MayaShopProviderPageFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(strTnTj78, shopProvider);
            bundle.putString(numX49.tnTj78("bVcN"), numX49.tnTj78("bVc6"));
            mayaShopProviderPageFragment.setArguments(bundle);
            AbstractC1236z.h(mayaShopV2Activity, R.id.frame_layout_fragment_container, mayaShopProviderPageFragment);
            return;
        }
        MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) ((b) aVarV1.c.get());
        mayaShopV2Activity2.getClass();
        String str = MayaShopProviderProductsListFragment.f14064E0;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(strTnTj78, shopProvider);
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = new MayaShopProviderProductsListFragment();
        mayaShopProviderProductsListFragment.setArguments(bundle2);
        AbstractC1236z.h(mayaShopV2Activity2, R.id.frame_layout_fragment_container, mayaShopProviderProductsListFragment);
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        setResult(5);
        finish();
    }

    public final void f2(ShopProvider shopProvider) {
        j.g(shopProvider, numX49.tnTj78("bVca"));
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bVcX"), shopProvider);
        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = new MayaShopProviderProductsListSearchFragment();
        mayaShopProviderProductsListSearchFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_fragment_container, mayaShopProviderProductsListSearchFragment);
    }

    @Override // Y6.a
    public final void g() {
        MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) ((b) V1().c.get());
        mayaShopV2Activity.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bVcG"), numX49.tnTj78("bVc3"));
        MayaContactsSelectionFragment mayaContactsSelectionFragment = new MayaContactsSelectionFragment();
        mayaContactsSelectionFragment.setArguments(bundle);
        AbstractC1236z.h(mayaShopV2Activity, R.id.frame_layout_fragment_container, mayaContactsSelectionFragment);
    }

    public final void g2() {
        C0460j c0460j = this.f13986n;
        j.d(c0460j);
        ConstraintLayout constraintLayout = c0460j.f4123b;
        j.f(constraintLayout, numX49.tnTj78("bVcy"));
        b0.e(this, constraintLayout, null, R.string.maya_label_code_successfully_copied, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
    }

    @Override // we.InterfaceC2414c
    public final void h(String str) {
        n1().l0(this, str);
    }

    @Override // we.InterfaceC2414c
    public final void i(Order order, PaymentConfirmationSummary paymentConfirmationSummary) {
        Fragment shopV3ReceiptFragment;
        String strTnTj78 = numX49.tnTj78("bVcv");
        j.g(order, strTnTj78);
        j.g(paymentConfirmationSummary, numX49.tnTj78("bVc7"));
        boolean zIsMayaV2TransactionReceiptShopEnabled = p1().e().isMayaV2TransactionReceiptShopEnabled();
        String strTnTj782 = numX49.tnTj78("bVcA");
        if (zIsMayaV2TransactionReceiptShopEnabled) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(strTnTj78, order);
            bundle.putParcelable(strTnTj782, paymentConfirmationSummary);
            shopV3ReceiptFragment = new MayaShopReceiptFragment();
            shopV3ReceiptFragment.setArguments(bundle);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(strTnTj78, order);
            bundle2.putParcelable(strTnTj782, paymentConfirmationSummary);
            shopV3ReceiptFragment = new ShopV3ReceiptFragment();
            shopV3ReceiptFragment.setArguments(bundle2);
        }
        AbstractC1236z.h(this, R.id.frame_layout_fragment_container, shopV3ReceiptFragment);
    }

    @Override // Y6.a
    public final void k() {
        if (this.f13987o instanceof MayaAllowContactsPermissionFragment) {
            AbstractC1236z.e(this, MayaAllowContactsPermissionFragment.class, true);
        }
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bVcY"));
        n1().k0(this, str);
    }

    public final void o(String str, String str2) {
        M2.b.Z(0, str, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(getSupportFragmentManager(), numX49.tnTj78("bVcT"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Amount amountOriginal;
        ActivityResultCaller activityResultCaller = this.f13987o;
        if (activityResultCaller instanceof MayaShopReceiptFragment) {
            finish();
            return;
        }
        boolean z4 = activityResultCaller instanceof MayaShopPaymentFragment;
        String strTnTj78 = numX49.tnTj78("bVcR");
        String strTnTj782 = numX49.tnTj78("bVcp");
        if (z4) {
            j.e(activityResultCaller, numX49.tnTj78("bVc0"));
            MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) activityResultCaller);
            if (mayaShopPaymentFragment.t1().e().isShopEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(14));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hE.j.put(strTnTj782, strTnTj78);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                String str = mayaShopPaymentFragment.f14032o0;
                if (str != null) {
                    c1219hE.j.put(numX49.tnTj78("bVcg"), str);
                }
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                ProductV3 productV3 = mayaShopPaymentFragment.t0;
                String currencyFormattedValue = null;
                String productCode = productV3 != null ? productV3.getProductCode() : null;
                if (productCode != null) {
                    c1219hE.j.put(numX49.tnTj78("bVcf"), productCode);
                }
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                ProductV3 productV32 = mayaShopPaymentFragment.t0;
                String name = productV32 != null ? productV32.getName() : null;
                if (name != null) {
                    c1219hE.j.put(numX49.tnTj78("bVc1"), name);
                }
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                ProductV3 productV33 = mayaShopPaymentFragment.t0;
                String provider = productV33 != null ? productV33.getProvider() : null;
                if (provider != null) {
                    c1219hE.j.put(numX49.tnTj78("bVcn"), provider);
                }
                EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                ProductV3 productV34 = mayaShopPaymentFragment.t0;
                if (productV34 != null && (amountOriginal = productV34.getAmountOriginal()) != null) {
                    currencyFormattedValue = amountOriginal.getCurrencyFormattedValue();
                }
                if (currencyFormattedValue != null) {
                    c1219hE.j.put(numX49.tnTj78("bVcx"), currencyFormattedValue);
                }
                mayaShopPaymentFragment.o1().b(c1219hE);
            }
        } else if (activityResultCaller instanceof MayaShopPurchaseHistoryFragment) {
            j.e(activityResultCaller, numX49.tnTj78("bVcs"));
            MayaShopPurchaseHistoryFragment mayaShopPurchaseHistoryFragment = (MayaShopPurchaseHistoryFragment) ((k) activityResultCaller);
            if (mayaShopPurchaseHistoryFragment.f10246K.e().isShopEventsV2Enabled()) {
                C1219h c1219hE2 = C1219h.e(AbstractC1213b.q(8));
                EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hE2.j.put(strTnTj782, strTnTj78);
                mayaShopPurchaseHistoryFragment.f10245B.b(c1219hE2);
            }
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().z().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13996x = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), 15);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_v2_shop, (ViewGroup) null, false);
        int i = R.id.frame_layout_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f13986n = new C0460j(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 0);
                setContentView(constraintLayout);
                C0460j c0460j = this.f13986n;
                j.d(c0460j);
                Q1(c0460j.f4124d);
                V1().h(this);
                X1();
                if (bundle == null) {
                    V1().j();
                }
                C0460j c0460j2 = this.f13986n;
                j.d(c0460j2);
                ((Toolbar) c0460j2.f4124d.e).setNavigationOnClickListener(new o(this, 2));
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bVc5").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.maya_menu_shop, menu);
        Integer numValueOf = menu != null ? Integer.valueOf(menu.size()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            return true;
        }
        int iIntValue = numValueOf.intValue();
        for (int i = 0; i < iIntValue; i++) {
            MenuItem item = menu.getItem(i);
            if (item != null) {
                item.setVisible(this.f13988p);
            }
        }
        return true;
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().m = null;
        V1().i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                g1();
            } else if (itemId != R.id.maya_menu_shop_purchase_history_icon) {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            } else {
                C1220i c1220iK1 = k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.PURCHASE_HISTORY);
                c1220iK1.c(this, c1219hD);
                n1().G(this, "KYUUBI_PENDING");
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.SHOP;
    }

    @Override // we.InterfaceC2414c
    public final void y(String str) {
        n1();
        i.k(this, str);
    }
}
