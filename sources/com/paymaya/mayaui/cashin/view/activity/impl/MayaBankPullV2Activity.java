package com.paymaya.mayaui.cashin.view.activity.impl;

import B5.i;
import D.C0187u;
import G6.e;
import H6.a;
import Kh.I;
import N5.G0;
import O5.c;
import T6.b;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import d4.AbstractC1331a;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import java.util.Map;
import kotlin.jvm.internal.j;
import pg.r;
import pg.t;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaBankPullV2Activity extends b implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f11601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FlutterFragment f11602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11603r = numX49.tnTj78("btyP");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11604s = numX49.tnTj78("btyb");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11605t = R.id.constrain_layout_bank_pull_v2;

    @Override // T6.b
    public final ViewBinding V1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_bank_pull_v2_activity, (ViewGroup) null, false);
        int i = R.id.constrain_layout_bank_pull_v2;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constrain_layout_bank_pull_v2)) != null) {
            i = R.id.lottie_view;
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                return new G0((ConstraintLayout) viewInflate, 3);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bty2").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // T6.b
    public final Map W1() {
        Map<String, Boolean> flutterAvailability = l2().f1781d.e().getFlutterAvailability();
        j.f(flutterAvailability, numX49.tnTj78("btyL"));
        return flutterAvailability;
    }

    @Override // T6.b
    public final String X1() {
        return this.f11603r;
    }

    @Override // T6.b
    public final String Y1() {
        return this.f11604s;
    }

    @Override // T6.b
    public final void Z1(t tVar) {
        l2().m(tVar);
    }

    @Override // T6.b
    public final void a2(t tVar) {
        AbstractC1331a.t(numX49.tnTj78("btyr"), l2().f1781d.k(), tVar);
    }

    @Override // T6.b
    public final void b2(t tVar) {
        l2().n(tVar);
    }

    @Override // T6.b
    public final void c2(t tVar) {
        l2().o(tVar);
    }

    @Override // T6.b
    public final void d2(t tVar) {
        l2().p(tVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // T6.b
    public final void e2(String str) {
        j.g(str, numX49.tnTj78("btyZ"));
        l2().q(str);
    }

    @Override // T6.b
    public final void g2() {
        W4.a aVarE = W4.a.e();
        if (aVarE.f6253M == null) {
            O5.a aVar = aVarE.f6267a;
            I i = new I(2);
            aVar.getClass();
            aVarE.f6253M = new c(aVar.f4704b, i);
        }
        O5.a aVar2 = aVarE.f6253M.f4752a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (S5.c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        S5.c cVar = (S5.c) aVar2.f4724k.get();
        C1293x0 c1293x0J = aVar2.J();
        C1265j c1265jE = aVar2.e();
        j.g(aVar3, numX49.tnTj78("btyk"));
        j.g(cVar, numX49.tnTj78("btyB"));
        this.f11601p = new e(aVar3, cVar, c1293x0J, c1265jE, 0);
    }

    @Override // T6.b
    public final boolean i2(r rVar, t tVar) {
        String str = rVar.f19112a;
        boolean zB = j.b(str, numX49.tnTj78("btyu"));
        String strTnTj78 = numX49.tnTj78("btyV");
        if (zB) {
            FlutterEngineCache.getInstance().remove(strTnTj78);
            n1();
            i.i(this);
            return true;
        }
        if (!j.b(str, numX49.tnTj78("btyS"))) {
            return false;
        }
        yk.a.a();
        FlutterEngineCache.getInstance().remove(strTnTj78);
        f2();
        return true;
    }

    @Override // T6.b
    public final void j2() {
        W4.a.e().f6253M = null;
    }

    public final e l2() {
        e eVar = this.f11601p;
        if (eVar != null) {
            return eVar;
        }
        j.n(numX49.tnTj78("btyj"));
        throw null;
    }

    @Override // T6.b, y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        DartExecutor dartExecutor;
        NavigationChannel navigationChannel;
        DartExecutor dartExecutor2;
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        l2().h(this);
        Bundle extras = getIntent().getExtras();
        String strTnTj78 = numX49.tnTj78("btyd");
        String string = extras != null ? extras.getString(numX49.tnTj78("btyi"), strTnTj78) : null;
        k2();
        if (bundle != null || string == null) {
            return;
        }
        e eVarL2 = l2();
        eVarL2.j();
        String strV = C2576A.V(string, numX49.tnTj78("btyE"), strTnTj78);
        a aVar = (a) eVarL2.c.get();
        String strConcat = numX49.tnTj78("btyF").concat(strV);
        MayaBankPullV2Activity mayaBankPullV2Activity = (MayaBankPullV2Activity) aVar;
        mayaBankPullV2Activity.getClass();
        j.g(strConcat, numX49.tnTj78("btyH"));
        C.i(numX49.tnTj78("btyO"), numX49.tnTj78("btyQ"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        String str = mayaBankPullV2Activity.f11603r;
        FlutterEngine flutterEngine = flutterEngineCache.get(str);
        if (flutterEngine == null || (dartExecutor2 = flutterEngine.getDartExecutor()) == null || !dartExecutor2.isExecutingDart()) {
            if (flutterEngine != null && (navigationChannel = flutterEngine.getNavigationChannel()) != null) {
                navigationChannel.setInitialRoute(strConcat);
            }
            if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("btye"), numX49.tnTj78("btyt"), numX49.tnTj78("btyU")));
            }
        }
        FlutterFragment flutterFragment = mayaBankPullV2Activity.f11602q;
        if (flutterFragment == null || !flutterFragment.isAdded()) {
            FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine(str).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build();
            mayaBankPullV2Activity.f11602q = flutterFragmentBuild;
            AbstractC1236z.g(mayaBankPullV2Activity, mayaBankPullV2Activity.f11605t, flutterFragmentBuild);
        }
    }

    @Override // T6.b, y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        l2().i();
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

    @Override // T6.b, y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
    }
}
