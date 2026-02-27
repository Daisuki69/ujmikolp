package com.paymaya.mayaui.merchant.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import E8.D;
import E8.E;
import N5.C0444d;
import N5.C0491z;
import T6.f;
import W6.b;
import Wc.c;
import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.store.T;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantOTPFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import fa.ViewOnClickListenerC1479a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import l9.C1803a;
import m9.InterfaceC1858c;
import n9.C1941d;
import p9.InterfaceC2023h;
import p9.InterfaceC2024i;
import p9.InterfaceC2025j;
import p9.InterfaceC2026k;
import p9.InterfaceC2027l;
import p9.InterfaceC2029n;
import p9.InterfaceC2030o;
import pg.u;
import y5.InterfaceC2511c;
import y5.l;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaQRPHMerchantActivity extends l implements InterfaceC1858c, InterfaceC2029n, InterfaceC2025j, InterfaceC2026k, InterfaceC2024i, InterfaceC2027l, InterfaceC2023h, InterfaceC2030o, c, b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f12851t = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f12852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlutterEngine f12853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f12854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f12855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Fragment f12856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f12857s;

    @Override // p9.InterfaceC2030o
    public final void B(String str, Uri uri) {
        n1();
        i.D(this, numX49.tnTj78("bjto"), null, uri);
    }

    @Override // Wc.c
    public final void M() {
        AbstractC1236z.f(this);
    }

    @Override // Wc.c
    public final void O0() {
        n1().s(this, true);
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        j.g(fragment, numX49.tnTj78("bjtK"));
        this.f12856r = fragment;
        if (fragment instanceof MayaQRPHMerchantOTPFragment) {
            K1(getString(R.string.maya_label_one_time_pin));
            t1();
            r1();
            s1();
            return;
        }
        if (fragment instanceof MayaQRPHMerchantPaymentFragment) {
            a aVarX1 = X1();
            if (aVarX1.e.e().isQrWithCheckoutFlowEnabled()) {
                MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) ((InterfaceC1858c) aVarX1.c.get());
                mayaQRPHMerchantActivity.r1();
                mayaQRPHMerchantActivity.s1();
                return;
            } else {
                MayaQRPHMerchantActivity mayaQRPHMerchantActivity2 = (MayaQRPHMerchantActivity) ((InterfaceC1858c) aVarX1.c.get());
                mayaQRPHMerchantActivity2.E1(50);
                mayaQRPHMerchantActivity2.R1();
                mayaQRPHMerchantActivity2.G1(mayaQRPHMerchantActivity2.getString(R.string.maya_label_toolbar_steps_50_percent));
                mayaQRPHMerchantActivity2.S1();
                return;
            }
        }
        if (fragment instanceof MayaQRPHDynamicMerchantPaymentFragment) {
            E1(50);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_50_percent));
            S1();
            return;
        }
        if ((fragment instanceof MayaQRPHMerchantConfirmationFragment) || (fragment instanceof MayaQRPHDynamicMerchantConfirmationFragment)) {
            E1(100);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_100_percent));
            S1();
            return;
        }
        if (fragment instanceof MayaMerchantPaymentReceiptFragment) {
            w1(false);
            O1();
        } else if (fragment instanceof MayaV2MerchantPaymentReceiptFragment) {
            w1(false);
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("bjtw"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    @Override // p9.InterfaceC2030o
    public final void W() {
        String string = getString(R.string.pma_label_help);
        j.f(string, numX49.tnTj78("bjtc"));
        n1().u(this, numX49.tnTj78("bjtm"), string);
    }

    public final a X1() {
        a aVar = this.f12855q;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjtD"));
        throw null;
    }

    public final void Y1() {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bjth"));
        String strTnTj78 = numX49.tnTj78("bjtM");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        this.f12853o = flutterEngine;
        u uVar = new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjtN"));
        this.f12854p = uVar;
        uVar.b(new C1803a(this, 6));
        FlutterEngine flutterEngine2 = this.f12853o;
        String strTnTj782 = numX49.tnTj78("bjt6");
        if (flutterEngine2 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute(numX49.tnTj78("bjta"));
        FlutterEngine flutterEngine3 = this.f12853o;
        if (flutterEngine3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjtG"), numX49.tnTj78("bjt3"), numX49.tnTj78("bjtX")));
    }

    public final void Z1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, str, null, null, null, false, payMayaError, null, false, 445).show(getSupportFragmentManager(), numX49.tnTj78("bjty"));
    }

    public final void a2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.pma_label_cancel_transaction)).setMessage(R.string.pma_label_are_you_sure_you_want_to_cancel_transaction).setPositiveButton(R.string.pma_label_yes_cancel, new D(this, 6)).setNegativeButton(R.string.pma_label_no, new E(6));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-2);
        if (button != null) {
            button.setTextColor(ResourcesCompat.getColor(getResources(), R.color.pma_text_color_dark_grey, null));
        }
    }

    public final void b2(String str, String str2) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, str, str2, getString(R.string.pma_label_try_again), null, false, null, null, false, 497);
        mayaErrorDialogFragmentZ.f11850c0 = new T(this, 28);
        mayaErrorDialogFragmentZ.f11852e0 = new f(mayaErrorDialogFragmentZ, 9);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjtv"));
    }

    @Override // p9.InterfaceC2023h, p9.InterfaceC2030o
    public final void c(String str) {
        n1();
        i.f(this, str);
        finish();
    }

    public final void c2(QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction) {
        MayaQRPHMerchantOTPFragment mayaQRPHMerchantOTPFragment = new MayaQRPHMerchantOTPFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjt7"), qRPHMerchantPaymentTransaction);
        mayaQRPHMerchantOTPFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaQRPHMerchantOTPFragment);
    }

    public final void d2(QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction) {
        Fragment mayaMerchantPaymentReceiptFragment;
        j.g(qRPHMerchantPaymentTransaction, numX49.tnTj78("bjtA"));
        boolean zIsMayaV2TransactionReceiptPayQrEnabled = p1().e().isMayaV2TransactionReceiptPayQrEnabled();
        String strTnTj78 = numX49.tnTj78("bjtY");
        if (zIsMayaV2TransactionReceiptPayQrEnabled) {
            mayaMerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(strTnTj78, qRPHMerchantPaymentTransaction);
            mayaMerchantPaymentReceiptFragment.setArguments(bundle);
        } else {
            mayaMerchantPaymentReceiptFragment = new MayaMerchantPaymentReceiptFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(strTnTj78, qRPHMerchantPaymentTransaction);
            mayaMerchantPaymentReceiptFragment.setArguments(bundle2);
        }
        AbstractC1236z.g(this, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaMerchantPaymentReceiptFragment);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(String str, String str2, QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction) {
        j.g(qRPHMerchantPaymentTransaction, numX49.tnTj78("bjtT"));
        EnumC1215d enumC1215d = EnumC1215d.P2M;
        EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(R.drawable.maya_ic_success, str, str2, new Pair(getString(R.string.maya_dialog_secondary_button_label), new C1941d(this, 0)), new Pair(getString(R.string.maya_dialog_primary_button_label), new C7.f(29, this, qRPHMerchantPaymentTransaction)), null, 96);
        mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bjtR"));
    }

    public final void f2() {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        j.f(string, numX49.tnTj78("bjtp"));
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new C1941d(this, 1)), new Pair(getString(R.string.maya_label_maybe_later), null), null, 96);
        mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bjt0"));
    }

    @Override // Wc.c
    public final void j() {
        getSupportFragmentManager().popBackStack();
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bjtg"));
        n1().k0(this, str);
    }

    @Override // y5.j
    public final void o(String str, String str2) {
        M2.b.Z(0, str, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(getSupportFragmentManager(), numX49.tnTj78("bjtf"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f12856r;
        if (activityResultCaller instanceof InterfaceC2511c) {
            j.e(activityResultCaller, numX49.tnTj78("bjt1"));
            if (((InterfaceC2511c) activityResultCaller).e0()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_qr_ph_merchant, (ViewGroup) null, false);
        int i = R.id.maya_activity_qr_ph_merchant_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_activity_qr_ph_merchant_fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12852n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 17);
                setContentView(constraintLayout);
                C0444d c0444d = this.f12852n;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                O5.a aVar = W4.a.e().q().f4751a;
                this.f21073d = (C1220i) aVar.f4716g.get();
                this.e = (com.paymaya.data.preference.a) aVar.e.get();
                this.f = (i) aVar.f4659D.get();
                this.f21074g = (S5.c) aVar.f4724k.get();
                this.h = (C0187u) aVar.f.get();
                this.i = (C1232v) aVar.f4663F.get();
                this.f12855q = new a((com.paymaya.data.preference.a) aVar.e.get(), 26);
                X1().h(this);
                if (bundle == null) {
                    X1().j();
                }
                C0444d c0444d2 = this.f12852n;
                j.d(c0444d2);
                ((Toolbar) c0444d2.f4073d.e).setNavigationOnClickListener(new ViewOnClickListenerC1479a(this, 20));
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjtn").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6279p = null;
        X1().i();
        super.onDestroy();
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
        return EnumC1215d.QRPH;
    }

    @Override // p9.InterfaceC2023h
    public final boolean w() {
        return false;
    }
}
