package com.paymaya.mayaui.merchant.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import N5.C0444d;
import S5.c;
import W6.b;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
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
import kotlin.Unit;
import kotlin.jvm.internal.j;
import l9.C1803a;
import m9.InterfaceC1857b;
import p9.InterfaceC2019d;
import p9.InterfaceC2021f;
import p9.InterfaceC2023h;
import p9.InterfaceC2030o;
import pg.u;
import y5.InterfaceC2511c;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaMerchantActivity extends q implements InterfaceC1857b, InterfaceC2021f, InterfaceC2019d, b, InterfaceC2023h, InterfaceC2030o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f12845s = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlutterEngine f12846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f12847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f12848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Fragment f12849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12850r;

    @Override // p9.InterfaceC2030o
    public final void B(String str, Uri uri) {
        n1();
        i.D(this, numX49.tnTj78("bjtP"), null, uri);
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f12849q = fragment;
        if (fragment instanceof MayaMerchantPaymentFragment) {
            a aVarV1 = V1();
            if (aVarV1.e.e().isQrWithCheckoutFlowEnabled()) {
                MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) ((InterfaceC1857b) aVarV1.c.get());
                mayaMerchantActivity.r1();
                mayaMerchantActivity.s1();
                return;
            } else {
                MayaMerchantActivity mayaMerchantActivity2 = (MayaMerchantActivity) ((InterfaceC1857b) aVarV1.c.get());
                mayaMerchantActivity2.E1(50);
                mayaMerchantActivity2.R1();
                mayaMerchantActivity2.G1(mayaMerchantActivity2.getString(R.string.maya_label_toolbar_steps_50_percent));
                mayaMerchantActivity2.S1();
                return;
            }
        }
        if (fragment instanceof MayaMerchantConfirmationFragment) {
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
        j.g(str, numX49.tnTj78("bjtb"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    public final a V1() {
        a aVar = this.f12848p;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjt2"));
        throw null;
    }

    @Override // p9.InterfaceC2030o
    public final void W() {
        String string = getString(R.string.pma_label_help);
        j.f(string, numX49.tnTj78("bjtL"));
        n1().u(this, numX49.tnTj78("bjtr"), string);
    }

    public final void W1() {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bjtZ"));
        String strTnTj78 = numX49.tnTj78("bjtk");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        this.f12846n = flutterEngine;
        u uVar = new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjtB"));
        this.f12847o = uVar;
        uVar.b(new C1803a(this, 5));
        FlutterEngine flutterEngine2 = this.f12846n;
        String strTnTj782 = numX49.tnTj78("bjtu");
        if (flutterEngine2 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute(numX49.tnTj78("bjtV"));
        FlutterEngine flutterEngine3 = this.f12846n;
        if (flutterEngine3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjtj"), numX49.tnTj78("bjtd"), numX49.tnTj78("bjtS")));
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
        j.g(str, numX49.tnTj78("bjti"));
        n1().k0(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f12849q;
        if (activityResultCaller instanceof InterfaceC2511c) {
            j.e(activityResultCaller, numX49.tnTj78("bjtE"));
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
        this.f12848p = new a((com.paymaya.data.preference.a) aVar.e.get(), 24);
        V1().h(this);
        if (bundle == null) {
            V1().j();
        }
        C0444d c0444d2 = this.m;
        j.d(c0444d2);
        ((Toolbar) c0444d2.f4073d.e).setNavigationOnClickListener(new ViewOnClickListenerC1479a(this, 19));
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
        return EnumC1215d.P2M;
    }

    @Override // p9.InterfaceC2023h
    public final boolean w() {
        return false;
    }
}
