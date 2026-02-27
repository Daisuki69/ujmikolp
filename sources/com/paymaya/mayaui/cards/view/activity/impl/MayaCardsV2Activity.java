package com.paymaya.mayaui.cards.view.activity.impl;

import B5.i;
import D.C0187u;
import G6.e;
import N5.G0;
import O5.g;
import S5.c;
import T6.b;
import W4.a;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.reflect.TypeToken;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.User;
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
import kotlin.Pair;
import kotlin.jvm.internal.j;
import p2.C2005a;
import pg.r;
import pg.t;
import pg.u;
import z6.InterfaceC2553a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCardsV2Activity extends b implements InterfaceC2553a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f11591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FlutterFragment f11592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11593r = numX49.tnTj78("btGP");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11594s = numX49.tnTj78("btGb");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11595t = R.id.constraint_layout_cards_v2;

    @Override // T6.b
    public final ViewBinding V1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_cards_v2_activity, (ViewGroup) null, false);
        int i = R.id.constraint_layout_cards_v2;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_cards_v2)) != null) {
            i = R.id.lottie_view;
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                return new G0((ConstraintLayout) viewInflate, 4);
            }
        }
        throw new NullPointerException(numX49.tnTj78("btG2").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // T6.b
    public final Map W1() {
        Map<String, Boolean> flutterAvailability = l2().f1781d.e().getFlutterAvailability();
        j.f(flutterAvailability, numX49.tnTj78("btGL"));
        return flutterAvailability;
    }

    @Override // T6.b
    public final String X1() {
        return this.f11593r;
    }

    @Override // T6.b
    public final String Y1() {
        return this.f11594s;
    }

    @Override // T6.b
    public final void Z1(t tVar) {
        l2().m(tVar);
    }

    @Override // T6.b
    public final void a2(t tVar) {
        AbstractC1331a.t(numX49.tnTj78("btGr"), l2().f1781d.k(), tVar);
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
        j.g(str, numX49.tnTj78("btGZ"));
        l2().q(str);
    }

    @Override // T6.b
    public final void g2() {
        a aVarE = a.e();
        if (aVarE.f6270b0 == null) {
            O5.a aVar = aVarE.f6267a;
            C2005a c2005a = new C2005a();
            aVar.getClass();
            aVarE.f6270b0 = new g(aVar.f4704b, c2005a);
        }
        O5.a aVar2 = aVarE.f6270b0.f4756a;
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
        j.g(aVar3, numX49.tnTj78("btGk"));
        j.g(cVar, numX49.tnTj78("btGB"));
        this.f11591p = new e(aVar3, cVar, c1293x0J, c1265jE, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // T6.b
    public final boolean i2(r rVar, t tVar) {
        String str = rVar.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case 699375000:
                    if (str.equals(numX49.tnTj78("btGt"))) {
                        String str2 = (String) rVar.a(numX49.tnTj78("btGU"));
                        if (str2 != null) {
                            n1();
                            i.y(this, str2);
                        }
                    }
                    break;
                case 827711050:
                    if (str.equals(numX49.tnTj78("btGQ"))) {
                        tVar.success(l2().k());
                    }
                    break;
                case 1084793699:
                    if (str.equals(numX49.tnTj78("btGH"))) {
                        String str3 = (String) rVar.a(numX49.tnTj78("btGO"));
                        if (str3 != null) {
                            n1();
                            i.g0(this, str3);
                        }
                    }
                    break;
                case 1359507637:
                    if (str.equals(numX49.tnTj78("btGF"))) {
                        n1();
                        i.g0(this, null);
                    }
                    break;
                case 1811096719:
                    if (str.equals(numX49.tnTj78("btGu"))) {
                        e eVarL2 = l2();
                        User userJ = eVarL2.f.j();
                        BackUpIdentity backUpIdentityA = eVarL2.f1782g.a();
                        String strTnTj78 = (backUpIdentityA == null || !backUpIdentityA.isVerifiedEmail()) ? numX49.tnTj78("btGV") : backUpIdentityA.mValue();
                        com.paymaya.data.preference.a aVar = eVarL2.f1781d;
                        tVar.success(M.h(new Pair(numX49.tnTj78("btGS"), aVar.k()), new Pair(numX49.tnTj78("btGj"), userJ.mFirstName()), new Pair(numX49.tnTj78("btGd"), userJ.mLastName()), new Pair(numX49.tnTj78("btGi"), aVar.r()), new Pair(numX49.tnTj78("btGE"), strTnTj78)));
                    }
                    break;
            }
            return true;
        }
        return false;
    }

    @Override // T6.b
    public final void j2() {
        a.e().f6270b0 = null;
    }

    public final e l2() {
        e eVar = this.f11591p;
        if (eVar != null) {
            return eVar;
        }
        j.n(numX49.tnTj78("btGe"));
        throw null;
    }

    @Override // T6.b, y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Map mapE;
        DartExecutor dartExecutor;
        NavigationChannel navigationChannel;
        DartExecutor dartExecutor2;
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        l2().h(this);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(numX49.tnTj78("btG8"), numX49.tnTj78("btGC")) : null;
        if (bundle != null || string == null) {
            return;
        }
        e eVarL2 = l2();
        try {
            if (C2576A.H(string)) {
                mapE = M.e();
            } else {
                mapE = (Map) new com.google.gson.j().f(string, new TypeToken<Map<String, ? extends Object>>() { // from class: com.paymaya.mayaui.cards.presenter.impl.MayaCardsV2ActivityPresenter$present$args$type$1
                }.getType());
                if (mapE == null) {
                    mapE = M.e();
                }
            }
        } catch (Exception unused) {
            mapE = M.e();
        }
        MayaCardsV2Activity mayaCardsV2Activity = (MayaCardsV2Activity) ((InterfaceC2553a) eVarL2.c.get());
        mayaCardsV2Activity.getClass();
        C.i(numX49.tnTj78("btG4"), numX49.tnTj78("btGo"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        String str = mayaCardsV2Activity.f11593r;
        FlutterEngine flutterEngine = flutterEngineCache.get(str);
        if (flutterEngine == null || (dartExecutor2 = flutterEngine.getDartExecutor()) == null || !dartExecutor2.isExecutingDart()) {
            if (flutterEngine != null && (navigationChannel = flutterEngine.getNavigationChannel()) != null) {
                navigationChannel.setInitialRoute(numX49.tnTj78("btGK"));
            }
            if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("btGm"), numX49.tnTj78("btGw"), numX49.tnTj78("btGc")));
            }
        }
        u uVar = mayaCardsV2Activity.f5800n;
        if (uVar == null) {
            j.n(numX49.tnTj78("btGh"));
            throw null;
        }
        uVar.a(numX49.tnTj78("btGD"), mapE, null);
        FlutterFragment flutterFragment = mayaCardsV2Activity.f11592q;
        if (flutterFragment == null || !flutterFragment.isAdded()) {
            FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine(str).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build();
            mayaCardsV2Activity.f11592q = flutterFragmentBuild;
            AbstractC1236z.g(mayaCardsV2Activity, mayaCardsV2Activity.f11595t, flutterFragmentBuild);
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
