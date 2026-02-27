package com.paymaya.mayaui.qr.view.activity.impl;

import D.C0187u;
import G7.t;
import Ka.a;
import N5.C0460j;
import N5.C0491z;
import Na.e;
import Na.i;
import S5.c;
import W6.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityNavigator;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.V;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyActivity;
import com.paymaya.ui.qr.view.dialog.impl.RequestMoneyInstructionDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.MyQRFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import de.k;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import p9.InterfaceC2030o;
import pg.u;
import y5.q;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaQRActivity extends q implements a, i, k, e, b, InterfaceC2030o, Y6.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13569r = 0;
    public C0460j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlutterEngine f13570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f13571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f13572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bb.a f13573q;

    @Override // p9.InterfaceC2030o
    public final void B(String str, Uri uri) {
        n1();
        B5.i.D(this, numX49.tnTj78("bjGP"), null, uri);
    }

    @Override // de.k
    public final void F0() {
        new RequestMoneyInstructionDialogFragment().show(getSupportFragmentManager(), numX49.tnTj78("bjGb"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if ((fragment instanceof MayaQRScannerFragment) || (fragment instanceof MayaMLKitQRScannerFragment)) {
            w1(false);
            O1();
            return;
        }
        if (!(fragment instanceof MyQRFragment)) {
            if (fragment instanceof MayaV2MerchantPaymentReceiptFragment) {
                getWindow().addFlags(1024);
                w1(false);
                return;
            }
            return;
        }
        w1(true);
        String string = getString(R.string.pma_label_request_money);
        j.f(string, numX49.tnTj78("bjG2"));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(string);
        }
        x1(true);
        y1(true);
        M1(R.color.light_light);
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("bjGL"));
        n1();
        B5.i.l(this, str, AttributionSource.f10368d);
    }

    public final V[] V1() {
        Object serializableExtra = getIntent().getSerializableExtra(numX49.tnTj78("bjGr"));
        V[] vArr = serializableExtra instanceof V[] ? (V[]) serializableExtra : null;
        return vArr == null ? V.values() : vArr;
    }

    @Override // p9.InterfaceC2030o
    public final void W() {
        String string = getString(R.string.pma_label_help);
        j.f(string, numX49.tnTj78("bjGZ"));
        n1().u(this, numX49.tnTj78("bjGk"), string);
    }

    public final Bb.a W1() {
        Bb.a aVar = this.f13573q;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjGB"));
        throw null;
    }

    public final void X1() {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bjGu"));
        String strTnTj78 = numX49.tnTj78("bjGV");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        this.f13570n = flutterEngine;
        u uVar = new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjGS"));
        this.f13571o = uVar;
        uVar.b(new t(this, 20));
        FlutterEngine flutterEngine2 = this.f13570n;
        String strTnTj782 = numX49.tnTj78("bjGj");
        if (flutterEngine2 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute(numX49.tnTj78("bjGd"));
        FlutterEngine flutterEngine3 = this.f13570n;
        if (flutterEngine3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjGE"), numX49.tnTj78("bjGF"), numX49.tnTj78("bjGi")));
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

    public final void Z1(String str) {
        u uVar = this.f13571o;
        if (uVar == null) {
            j.n(numX49.tnTj78("bjGU"));
            throw null;
        }
        uVar.a(numX49.tnTj78("bjGt"), M.h(new Pair(numX49.tnTj78("bjGH"), numX49.tnTj78("bjGO")), new Pair(numX49.tnTj78("bjGQ"), str)), null);
        n1();
        B5.i.g(this);
    }

    public final void a2(String str, PayMayaError payMayaError, W6.e eVar) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, str, null, null, null, false, payMayaError, null, false, 445);
        mayaErrorDialogFragmentZ.f11850c0 = eVar;
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjGe"));
    }

    public final void b2(String str, String str2, W6.e eVar) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(R.drawable.maya_upload_qr_error, str, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        mayaErrorDialogFragmentZ.f11850c0 = eVar;
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjG8"));
    }

    @Override // p9.InterfaceC2030o
    public final void c(String str) {
        n1();
        B5.i.f(this, str);
        finish();
    }

    public final void c2(Function0 function0, Function0 function02) {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        j.f(string, numX49.tnTj78("bjGC"));
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new La.a(0, function0)), new Pair(getString(R.string.maya_label_maybe_later), new La.a(1, function02)), null, 96);
        mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bjG4"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, android.app.Activity, p9.InterfaceC2030o
    public final void finish() {
        super.finish();
        ActivityNavigator.Companion.applyPopAnimationsToPendingTransition(this);
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bjGo"));
        n1().k0(this, str);
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().v().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13573q = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), 9);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_qr_activity, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0460j(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 3);
                setContentView(constraintLayout);
                C0460j c0460j = this.m;
                j.d(c0460j);
                Q1(c0460j.f4124d);
                W1().h(this);
                if (bundle == null) {
                    W1().j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjGK").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6285v = null;
        W1().i();
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
        return EnumC1215d.PERSONAL_QR;
    }

    @Override // de.k
    public final void r0() {
        n1();
        Intent intent = new Intent(this, (Class<?>) RequestMoneyActivity.class);
        intent.setData(getIntent().getData());
        B5.i.v0(this, intent);
        startActivity(intent);
    }
}
