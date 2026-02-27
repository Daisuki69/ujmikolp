package com.paymaya.mayaui.pay.view.impl;

import B5.i;
import D.C0187u;
import G6.e;
import N5.G0;
import Na.d;
import O5.f;
import Rg.g;
import S5.c;
import T6.b;
import W9.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.V;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.cards.view.activity.impl.MayaCardsV2Activity;
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
public final class MayaPayActivity extends b implements a, W6.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f13326w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f13327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FlutterFragment f13328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f13329r = new g(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ActivityResultLauncher f13330s = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new d(this, 28));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f13331t = numX49.tnTj78("bjcP");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f13332u = numX49.tnTj78("bjcb");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13333v = R.id.constraint_layout_pay;

    @Override // T6.b
    public final ViewBinding V1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_pay, (ViewGroup) null, false);
        int i = R.id.constraint_layout_pay;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_pay)) != null) {
            i = R.id.lottie_view;
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                return new G0((ConstraintLayout) viewInflate, 2);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjc2").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // T6.b
    public final Map W1() {
        Map<String, Boolean> flutterAvailability = l2().f1781d.e().getFlutterAvailability();
        j.f(flutterAvailability, numX49.tnTj78("bjcL"));
        return flutterAvailability;
    }

    @Override // T6.b
    public final String X1() {
        return this.f13331t;
    }

    @Override // T6.b
    public final String Y1() {
        return this.f13332u;
    }

    @Override // T6.b
    public final void Z1(t tVar) {
        l2().m(tVar);
    }

    @Override // T6.b
    public final void a2(t tVar) {
        AbstractC1331a.t(numX49.tnTj78("bjcr"), l2().f1781d.l(), tVar);
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
        j.g(str, numX49.tnTj78("bjcZ"));
        l2().q(str);
    }

    @Override // T6.b
    public final void g2() {
        W4.a aVarE = W4.a.e();
        if (aVarE.J == null) {
            O5.a aVar = aVarE.f6267a;
            z2.d dVar = new z2.d(15);
            aVar.getClass();
            aVarE.J = new f(aVar.f4704b, dVar);
        }
        O5.a aVar2 = aVarE.J.f4755a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        c cVar = (c) aVar2.f4724k.get();
        C1293x0 c1293x0J = aVar2.J();
        C1265j c1265jE = aVar2.e();
        j.g(aVar3, numX49.tnTj78("bjck"));
        j.g(cVar, numX49.tnTj78("bjcB"));
        this.f13327p = new e(aVar3, cVar, c1293x0J, c1265jE, 1);
    }

    @Override // T6.b
    public final boolean i2(r rVar, t tVar) {
        String str = rVar.f19112a;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case 699375000:
                if (!str.equals(numX49.tnTj78("bjcH"))) {
                    return false;
                }
                String str2 = (String) rVar.a(numX49.tnTj78("bjcO"));
                if (str2 != null) {
                    n1();
                    i.y(this, str2);
                }
                return true;
            case 784396546:
                if (!str.equals(numX49.tnTj78("bjcE"))) {
                    return false;
                }
                n1();
                i.V(this, numX49.tnTj78("bjcF"));
                return true;
            case 827711050:
                if (!str.equals(numX49.tnTj78("bjci"))) {
                    return false;
                }
                tVar.success(l2().k());
                return true;
            case 1276855828:
                if (!str.equals(numX49.tnTj78("bjcj"))) {
                    return false;
                }
                Object obj = rVar.f19113b;
                if (obj != null) {
                    String strK = new com.google.gson.j().k(obj);
                    n1();
                    Intent intent = new Intent(this, (Class<?>) MayaCardsV2Activity.class);
                    intent.putExtra(numX49.tnTj78("bjcd"), strK);
                    intent.setData(getIntent().getData());
                    startActivity(intent);
                    return true;
                }
                return true;
            case 1387240653:
                if (!str.equals(numX49.tnTj78("bjcV"))) {
                    return false;
                }
                i iVarN1 = n1();
                Boolean bool = Boolean.TRUE;
                iVarN1.C(this, this.f13330s, numX49.tnTj78("bjcS"), bool, V.values(), bool, getString(R.string.maya_label_qrph_code));
                return true;
            case 2054491766:
                if (!str.equals(numX49.tnTj78("bjcu"))) {
                    return false;
                }
                n1();
                i.c(this);
                return true;
            default:
                return false;
        }
    }

    @Override // T6.b
    public final void j2() {
        W4.a.e().J = null;
    }

    public final e l2() {
        e eVar = this.f13327p;
        if (eVar != null) {
            return eVar;
        }
        j.n(numX49.tnTj78("bjcQ"));
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
        String strTnTj78 = numX49.tnTj78("bjct");
        String string = extras != null ? extras.getString(numX49.tnTj78("bjcU"), strTnTj78) : null;
        k2();
        if (bundle != null || string == null) {
            return;
        }
        e eVarL2 = l2();
        eVarL2.j();
        String strV = C2576A.V(string, numX49.tnTj78("bjce"), strTnTj78);
        a aVar = (a) eVarL2.c.get();
        String strConcat = numX49.tnTj78("bjc8").concat(strV);
        MayaPayActivity mayaPayActivity = (MayaPayActivity) aVar;
        mayaPayActivity.getClass();
        j.g(strConcat, numX49.tnTj78("bjcC"));
        C.i(numX49.tnTj78("bjc4"), numX49.tnTj78("bjco"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        String str = mayaPayActivity.f13331t;
        FlutterEngine flutterEngine = flutterEngineCache.get(str);
        if (flutterEngine == null || (dartExecutor2 = flutterEngine.getDartExecutor()) == null || !dartExecutor2.isExecutingDart()) {
            if (flutterEngine != null && (navigationChannel = flutterEngine.getNavigationChannel()) != null) {
                navigationChannel.setInitialRoute(strConcat);
            }
            if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjcc"), numX49.tnTj78("bjcK"), numX49.tnTj78("bjcw")));
            }
        }
        FlutterFragment flutterFragment = mayaPayActivity.f13328q;
        if (flutterFragment == null || !flutterFragment.isAdded()) {
            FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine(str).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build();
            mayaPayActivity.f13328q = flutterFragmentBuild;
            AbstractC1236z.g(mayaPayActivity, mayaPayActivity.f13333v, flutterFragmentBuild);
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
