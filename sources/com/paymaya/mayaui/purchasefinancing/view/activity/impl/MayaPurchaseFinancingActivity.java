package com.paymaya.mayaui.purchasefinancing.view.activity.impl;

import B5.i;
import D.C0187u;
import D8.C0214w;
import N5.C0456h;
import O5.b;
import S5.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.store.H0;
import com.paymaya.domain.store.K;
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
import kotlin.Unit;
import kotlin.jvm.internal.j;
import p2.C2005a;
import pg.t;
import pg.u;
import ta.InterfaceC2279a;
import ua.a;
import y5.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaPurchaseFinancingActivity extends q implements InterfaceC2279a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13534v = 0;
    public C0214w m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f13536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlutterFragment f13537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f13538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0456h f13539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ConstraintLayout f13540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final H0 f13541t = new H0(21);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActivityResultLauncher f13542u = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this));

    public static String V1(Object obj) {
        Object obj2;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null || (obj2 = map.get(numX49.tnTj78("bj6P"))) == null) {
            return null;
        }
        return obj2.toString();
    }

    public final C0214w W1() {
        C0214w c0214w = this.m;
        if (c0214w != null) {
            return c0214w;
        }
        j.n(numX49.tnTj78("bj6b"));
        throw null;
    }

    public final void X1() {
        E.a(numX49.tnTj78("bj62"), numX49.tnTj78("bj6L"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("bj6r"));
        String strTnTj78 = numX49.tnTj78("bj6Z");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        u uVar = new u(flutterEngine.getDartExecutor(), numX49.tnTj78("bj6k"));
        uVar.b(new a(this));
        this.f13536o = uVar;
    }

    public final void Y1(EnumC1216e enumC1216e) {
        C1220i c1220iK1 = k1();
        C1219h c1219hD = C1219h.d(EnumC1215d.PURCHASE_FINANCING);
        c1219hD.r(enumC1216e);
        c1219hD.n(14);
        c1219hD.i();
        c1220iK1.c(this, c1219hD);
    }

    public final void Z1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 321) {
            if (i4 == 121) {
                t tVar = this.f13538q;
                if (tVar != null) {
                    tVar.success(1);
                }
                this.f13538q = null;
                return;
            }
            if (i4 != 212) {
                return;
            }
            t tVar2 = this.f13538q;
            if (tVar2 != null) {
                tVar2.success(0);
            }
            this.f13538q = null;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        DartExecutor dartExecutor;
        NavigationChannel navigationChannel;
        String string;
        iKNpI8.xCZPS1(this, bundle);
        String strTnTj78 = numX49.tnTj78("bj6B");
        if (bundle != null && !FlutterEngineCache.getInstance().contains(strTnTj78)) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, numX49.tnTj78("bj6u"));
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            j.f(flutterEngineCache, numX49.tnTj78("bj6V"));
            if (flutterEngineCache.get(strTnTj78) == null) {
                flutterEngineCache.put(strTnTj78, new FlutterEngine(applicationContext));
            }
            this.f13535n = true;
        }
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6249H == null) {
            O5.a aVar = aVarE.f6267a;
            C2005a c2005a = new C2005a();
            aVar.getClass();
            aVarE.f6249H = new b(aVar.f4704b, c2005a);
        }
        O5.a aVar2 = aVarE.f6249H.f4751a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        K k8 = (K) aVar2.f4671K.get();
        c cVar = (c) aVar2.f4724k.get();
        j.g(aVar3, numX49.tnTj78("bj6S"));
        j.g(k8, numX49.tnTj78("bj6j"));
        j.g(cVar, numX49.tnTj78("bj6d"));
        this.m = new C0214w(aVar3, k8, cVar);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_purchase_financing, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_purchase_financing);
        if (constraintLayout == null) {
            throw new NullPointerException(numX49.tnTj78("bj6C").concat(viewInflate.getResources().getResourceName(R.id.constraint_layout_purchase_financing)));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
        this.f13539r = new C0456h(constraintLayout2, constraintLayout, 0);
        setContentView(constraintLayout2);
        W1().h(this);
        C0456h c0456h = this.f13539r;
        j.d(c0456h);
        this.f13540s = c0456h.c;
        X1();
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            String strTnTj782 = numX49.tnTj78("bj6i");
            if (extras != null && (string = extras.getString(numX49.tnTj78("bj6E"), strTnTj782)) != null) {
                strTnTj782 = string;
            }
            C0214w c0214wW1 = W1();
            c0214wW1.j();
            if (C2576A.H(strTnTj782)) {
                strTnTj782 = numX49.tnTj78("bj6F");
            }
            MayaPurchaseFinancingActivity mayaPurchaseFinancingActivity = (MayaPurchaseFinancingActivity) ((InterfaceC2279a) c0214wW1.c.get());
            mayaPurchaseFinancingActivity.getClass();
            E.a(numX49.tnTj78("bj6H"), numX49.tnTj78("bj6O"));
            FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(strTnTj78);
            if (flutterEngine != null && (navigationChannel = flutterEngine.getNavigationChannel()) != null) {
                navigationChannel.setInitialRoute(strTnTj782);
            }
            if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bj6U"), numX49.tnTj78("bj6Q"), numX49.tnTj78("bj6t")));
            }
            mayaPurchaseFinancingActivity.f13537p = FlutterFragment.withCachedEngine(strTnTj78).renderMode(RenderMode.texture).build();
            ConstraintLayout constraintLayout3 = mayaPurchaseFinancingActivity.f13540s;
            if (constraintLayout3 == null) {
                j.n(numX49.tnTj78("bj68"));
                throw null;
            }
            int id = constraintLayout3.getId();
            FlutterFragment flutterFragment = mayaPurchaseFinancingActivity.f13537p;
            if (flutterFragment != null) {
                AbstractC1236z.g(mayaPurchaseFinancingActivity, id, flutterFragment);
            } else {
                j.n(numX49.tnTj78("bj6e"));
                throw null;
            }
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6249H = null;
        u uVar = this.f13536o;
        if (uVar == null) {
            j.n(numX49.tnTj78("bj6o"));
            throw null;
        }
        uVar.b(null);
        this.f13538q = null;
        W1().i();
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bj64"));
        super.onDestroy();
        this.f13539r = null;
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
        if (this.f13535n) {
            finish();
        }
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
