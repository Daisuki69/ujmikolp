package com.paymaya.mayaui.merchant.view.activity.impl;

import B5.i;
import D.C0187u;
import Ee.a;
import N5.C0444d;
import S5.c;
import W6.b;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.widget.Button;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import m9.InterfaceC1856a;
import p9.InterfaceC2017b;
import p9.InterfaceC2018c;
import p9.InterfaceC2023h;
import p9.InterfaceC2030o;
import y5.InterfaceC2511c;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDynamicMerchantActivity extends q implements InterfaceC1856a, InterfaceC2018c, InterfaceC2017b, InterfaceC2023h, InterfaceC2030o, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12840r = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CountDownTimer f12841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MayaAlertBottomSheetDialogFragment f12842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f12843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Fragment f12844q;

    @Override // p9.InterfaceC2030o
    public final void B(String str, Uri uri) {
        n1();
        i.D(this, numX49.tnTj78("bjtF"), null, uri);
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f12844q = fragment;
        if (fragment instanceof MayaDynamicMerchantPaymentFragment) {
            E1(50);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_50_percent));
            S1();
            return;
        }
        if (fragment instanceof MayaDynamicMerchantConfirmationFragment) {
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
        j.g(str, numX49.tnTj78("bjtH"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    public final a V1() {
        a aVar = this.f12843p;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjtO"));
        throw null;
    }

    @Override // p9.InterfaceC2030o
    public final void W() {
        String string = getString(R.string.pma_label_help);
        j.f(string, numX49.tnTj78("bjtQ"));
        n1().u(this, numX49.tnTj78("bjtt"), string);
    }

    public final void W1(MerchantPayment merchantPayment) {
        Fragment mayaMerchantPaymentReceiptFragment;
        setResult(9);
        boolean zIsMayaV2TransactionReceiptPayQrEnabled = p1().e().isMayaV2TransactionReceiptPayQrEnabled();
        String strTnTj78 = numX49.tnTj78("bjtU");
        if (zIsMayaV2TransactionReceiptPayQrEnabled) {
            mayaMerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(strTnTj78, merchantPayment);
            mayaMerchantPaymentReceiptFragment.setArguments(bundle);
        } else {
            mayaMerchantPaymentReceiptFragment = new MayaMerchantPaymentReceiptFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(strTnTj78, merchantPayment);
            mayaMerchantPaymentReceiptFragment.setArguments(bundle2);
        }
        AbstractC1236z.g(this, R.id.maya_activity_merchant_fragment_container, mayaMerchantPaymentReceiptFragment);
    }

    @Override // p9.InterfaceC2023h, p9.InterfaceC2030o
    public final void c(String str) {
        n1();
        i.f(this, str);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bjte"));
        n1().k0(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f12844q;
        if (activityResultCaller instanceof InterfaceC2511c) {
            j.e(activityResultCaller, numX49.tnTj78("bjt8"));
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
        C0444d c0444dA = C0444d.a(getLayoutInflater());
        this.m = c0444dA;
        setContentView(c0444dA.f4072b);
        C0444d c0444d = this.m;
        j.d(c0444d);
        Q1(c0444d.f4073d);
        O5.a aVar = W4.a.e().q().f4751a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12843p = new a(2);
        V1().h(this);
        setResult(0);
        if (bundle == null) {
            V1().j();
        }
        C0444d c0444d2 = this.m;
        j.d(c0444d2);
        ((Toolbar) c0444d2.f4073d.e).setNavigationOnClickListener(new ViewOnClickListenerC1479a(this, 18));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6279p = null;
        V1().i();
        super.onDestroy();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment = this.f12842o;
        if (mayaAlertBottomSheetDialogFragment != null) {
            String string = getString(R.string.maya_label_back_to_merchant);
            j.f(string, numX49.tnTj78("bjtC"));
            Button button = mayaAlertBottomSheetDialogFragment.f11814W;
            if (button == null) {
                j.n(numX49.tnTj78("bjt4"));
                throw null;
            }
            button.setText(string);
        }
        CountDownTimer countDownTimer = this.f12841n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
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
        return EnumC1215d.DYNAMIC_P2M;
    }

    @Override // p9.InterfaceC2023h
    public final boolean w() {
        return V1().e;
    }
}
