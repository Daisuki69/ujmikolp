package com.paymaya.mayaui.cashin.view.activity.impl;

import Bb.a;
import C7.f;
import C7.g;
import D.C0187u;
import H6.c;
import K6.h;
import L6.B;
import L6.F;
import L6.G;
import L6.H;
import L6.InterfaceC0315a;
import L6.InterfaceC0316b;
import L6.InterfaceC0319e;
import L6.InterfaceC0320f;
import L6.i;
import L6.k;
import L6.n;
import L6.r;
import L6.s;
import L6.t;
import L6.y;
import N5.C0444d;
import N5.C0491z;
import W6.b;
import Y6.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullLinkedAccountsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInPartnerFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInReceiptFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import pg.u;
import y5.InterfaceC2511c;
import y5.q;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCashInActivity extends q implements c, L6.q, e, k, n, b, r, InterfaceC0319e, i, InterfaceC0320f, W6.i, InterfaceC0316b, B, s, F, y, t, H, G, InterfaceC0315a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f11609r = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f11610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f11611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlutterEngine f11612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u f11613q;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f11611o = fragment;
        y1(true);
        x1(true);
        I1(17);
        C1(R.drawable.maya_ic_navigation_back);
        if (fragment instanceof MayaCashInFragment) {
            w1(true);
            K1(getString(R.string.maya_label_service_cash_in));
            r1();
            T1();
            return;
        }
        if (fragment instanceof MayaMaintenanceFragment) {
            w1(true);
            K1(getString(R.string.maya_label_service_cash_in));
            T1();
            r1();
            return;
        }
        if (fragment instanceof MayaCashInCodeFormFragment) {
            w1(true);
            MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) fragment;
            K1(mayaCashInCodeFormFragment.f11650A0);
            r1();
            if (mayaCashInCodeFormFragment.f11659z0) {
                t1();
                return;
            } else {
                T1();
                return;
            }
        }
        boolean z4 = fragment instanceof MayaWesternUnionFragment;
        String strTnTj78 = numX49.tnTj78("bty8");
        if (z4) {
            w1(true);
            K1(strTnTj78);
            r1();
            t1();
            return;
        }
        if (fragment instanceof MayaCashInCodeFragment) {
            w1(false);
            return;
        }
        if (fragment instanceof MayaCashInPartnerFragment) {
            K1(getString(R.string.maya_label_cash_in_via_partner));
            r1();
            T1();
            return;
        }
        if (fragment instanceof MayaBankPullFragment) {
            w1(true);
            K1(strTnTj78);
            t1();
            return;
        }
        if (fragment instanceof MayaBankPullV2Fragment) {
            w1(true);
            K1(getString(R.string.maya_label_service_cash_in));
            T1();
            return;
        }
        if (fragment instanceof MayaBankPullLinkedAccountsFragment) {
            w1(true);
            K1(getString(R.string.maya_label_bank_pull_linked_bank_accounts));
            T1();
            return;
        }
        if (fragment instanceof MayaBankPullConfirmationFragment) {
            w1(true);
            K1(strTnTj78);
            t1();
            return;
        }
        if (fragment instanceof MayaCashInWebFragment) {
            w1(true);
            T1();
            C1(R.drawable.maya_ic_close);
            I1(8388627);
            return;
        }
        if (fragment instanceof MayaVaultedCardsFragment) {
            w1(true);
            t1();
            return;
        }
        if (fragment instanceof MayaCashInViaCardFormFragment) {
            w1(true);
            r1();
            if (((MayaCashInViaCardFormFragment) fragment).f11755v0) {
                t1();
                return;
            } else {
                T1();
                return;
            }
        }
        if (fragment instanceof MayaCashInViaCardConfirmationFragment) {
            w1(true);
            t1();
            return;
        }
        if (fragment instanceof MayaWesternUnionConfirmationFragment) {
            w1(true);
            K1(strTnTj78);
            t1();
        } else if (fragment instanceof MayaAutoCashinWalletSettingsFragment) {
            w1(true);
            K1(strTnTj78);
            t1();
        } else if (fragment instanceof MayaCashInReceiptFragment) {
            w1(false);
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("btyC"));
        n1();
        B5.i.l(this, str, AttributionSource.f10368d);
    }

    public final void V1() {
        MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(this, MayaBankPullFragment.class));
        if (mayaBankPullFragment != null) {
            mayaBankPullFragment.f10359n0 = false;
        }
        a aVarW1 = W1();
        if (aVarW1.e.e().isMayaCashInV3BankPullEnabled()) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) ((c) aVarW1.c.get());
            mayaCashInActivity.getClass();
            AbstractC1236z.e(mayaCashInActivity, MayaBankPullV2Fragment.class, false);
        } else {
            MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) ((c) aVarW1.c.get());
            mayaCashInActivity2.getClass();
            AbstractC1236z.e(mayaCashInActivity2, MayaBankPullFragment.class, false);
        }
    }

    public final a W1() {
        a aVar = this.f11610n;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bty4"));
        throw null;
    }

    public final void X1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    public final void Y1(int i, String str, String str2, ExecutePullFunds executePullFunds, BankPullPaymentOption bankPullPaymentOption, Function2 function2) {
        d.n(i, str, str2, new Pair(getString(R.string.maya_label_done), new I6.c(this, 10)), new Pair(getString(R.string.maya_label_view_receipt), new g(function2, executePullFunds, bankPullPaymentOption)), null, 96).show(getSupportFragmentManager(), numX49.tnTj78("btyo"));
    }

    public final void Z1(int i, String str, String str2, ExecutePullFunds executePullFunds, Function1 function1) {
        d.n(i, str, str2, new Pair(getString(R.string.maya_label_done), new I6.c(this, 9)), new Pair(getString(R.string.maya_label_view_receipt), new f(function1, executePullFunds)), null, 96).show(getSupportFragmentManager(), numX49.tnTj78("btyK"));
    }

    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("btyw"));
    }

    public final void a2(String str, String str2, View.OnClickListener onClickListener, W6.e eVar) {
        j.g(str2, numX49.tnTj78("btyc"));
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231379, getString(R.string.maya_label_bank_pull_unlink_account_title), getString(R.string.maya_format_bank_pull_unlink_account_description, str, str2), getString(R.string.maya_label_unlink), getString(R.string.pma_label_cancel), false, null, onClickListener, false, 352);
        mayaErrorDialogFragmentZ.f11850c0 = eVar;
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("btym"));
    }

    public final void b2(String str) {
        j.g(str, numX49.tnTj78("btyD"));
        String string = getString(R.string.maya_label_account_unlink_success_title);
        j.f(string, numX49.tnTj78("btyh"));
        d.n(R.drawable.maya_ic_success, string, getString(R.string.maya_format_account_unlink_success_message, str), new Pair(getString(R.string.maya_label_back_to_cash_in), new I6.c(this, 6)), null, null, 112).show(getSupportFragmentManager(), numX49.tnTj78("btyM"));
    }

    public final void c2() {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        j.f(string, numX49.tnTj78("btyN"));
        d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new I6.c(this, 11)), new Pair(getString(R.string.maya_label_maybe_later), null), null, 96).show(getSupportFragmentManager(), numX49.tnTj78("bty6"));
    }

    public final void d2(ExecutePullFunds executePullFunds) {
        String string = getString(R.string.maya_label_youre_almost_there);
        String strTnTj78 = numX49.tnTj78("btya");
        j.f(string, strTnTj78);
        String string2 = getString(R.string.maya_format_card_cash_in_processing_description, executePullFunds != null ? executePullFunds.getCardSchemeName() : null, executePullFunds != null ? executePullFunds.getCardLastFour() : null);
        j.f(string2, strTnTj78);
        Z1(R.drawable.maya_ic_processing_white, string, string2, executePullFunds, new Ag.f(1, this, MayaCashInActivity.class, numX49.tnTj78("btyG"), numX49.tnTj78("btyX"), 0, 22));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bty3"));
        n1().k0(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        a aVarW1 = W1();
        if (aVarW1.e.e().isAppEventsV2CashInEnabled()) {
            ActivityResultCaller activityResultCaller = ((MayaCashInActivity) ((c) aVarW1.c.get())).f11611o;
            boolean z4 = activityResultCaller instanceof h;
            String strTnTj78 = numX49.tnTj78("btyy");
            if (z4) {
                j.e(activityResultCaller, numX49.tnTj78("btyv"));
                ((MayaCashInFragment) ((h) activityResultCaller)).P1().p(strTnTj78);
            } else if (activityResultCaller instanceof K6.f) {
                j.e(activityResultCaller, numX49.tnTj78("bty7"));
                ((MayaCashInCodeFormFragment) ((K6.f) activityResultCaller)).R1().t(strTnTj78);
            }
        }
        ActivityResultCaller activityResultCaller2 = this.f11611o;
        if (activityResultCaller2 instanceof InterfaceC2511c) {
            j.e(activityResultCaller2, numX49.tnTj78("btyA"));
            if (((InterfaceC2511c) activityResultCaller2).e0()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().i().f4751a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(aVar2, numX49.tnTj78("btyY"));
        this.f11610n = new a(aVar2, 8, false);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_cash_in, (ViewGroup) null, false);
        int i = R.id.coordinator_layout_container;
        if (((CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, R.id.coordinator_layout_container)) != null) {
            i = R.id.frame_layout_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
            if (frameLayout != null) {
                i = R.id.toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
                if (viewFindChildViewById != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 4);
                    setContentView(constraintLayout);
                    C0444d c0444d = this.m;
                    j.d(c0444d);
                    Q1(c0444d.f4073d);
                    W1().h(this);
                    if (bundle == null) {
                        W1().j();
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("btyT").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6280q = null;
        W1().i();
        super.onDestroy();
        this.m = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
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
        return EnumC1215d.CASH_IN;
    }
}
