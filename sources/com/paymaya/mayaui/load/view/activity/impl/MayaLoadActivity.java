package com.paymaya.mayaui.load.view.activity.impl;

import B5.i;
import D.C0187u;
import O5.e;
import R8.a;
import S5.c;
import W6.b;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.store.Z0;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.u;
import x3.d;
import y5.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLoadActivity extends q implements a, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f12708q = 0;
    public M7.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f12710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f12711p;

    public final M7.a V1() {
        M7.a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjEP"));
        throw null;
    }

    public final void W1() {
        FlutterEngine flutterEngineC = d.c(this);
        u uVar = new u(flutterEngineC.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjEb"));
        uVar.b(new S8.a(this, 0));
        this.f12711p = uVar;
        flutterEngineC.getNavigationChannel().setInitialRoute(numX49.tnTj78("bjE2"));
        flutterEngineC.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjEr"), numX49.tnTj78("bjEZ"), numX49.tnTj78("bjEL")));
    }

    public final void X1() {
        C.i(numX49.tnTj78("bjEk"), numX49.tnTj78("bjEB"));
        u uVar = new u(d.d(this).getDartExecutor(), numX49.tnTj78("bjEu"));
        uVar.b(new S8.a(this, 1));
        this.f12710o = uVar;
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

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        DartExecutor dartExecutor;
        NavigationChannel navigationChannel;
        iKNpI8.xCZPS1(this, bundle);
        String strTnTj78 = numX49.tnTj78("bjEV");
        if (bundle != null && !FlutterEngineCache.getInstance().contains(strTnTj78)) {
            Context applicationContext = getApplicationContext();
            String strTnTj782 = numX49.tnTj78("bjES");
            j.f(applicationContext, strTnTj782);
            d.d(applicationContext);
            Context applicationContext2 = getApplicationContext();
            j.f(applicationContext2, strTnTj782);
            d.c(applicationContext2);
            this.f12709n = true;
        }
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6250I == null) {
            O5.a aVar = aVarE.f6267a;
            M2.b bVar = new M2.b(13);
            aVar.getClass();
            aVarE.f6250I = new e(aVar.f4704b, bVar);
        }
        O5.a aVar2 = aVarE.f6250I.f4754a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        Z0 z0X = aVar2.X();
        c cVar = (c) aVar2.f4724k.get();
        j.g(aVar3, numX49.tnTj78("bjEj"));
        j.g(cVar, numX49.tnTj78("bjEd"));
        this.m = new M7.a(aVar3, cVar, z0X);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_load, (ViewGroup) null, false);
        int i = R.id.constraint_layout_load;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_load)) != null) {
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                setContentView((ConstraintLayout) viewInflate);
                V1().h(this);
                X1();
                W1();
                Bundle extras = getIntent().getExtras();
                String strTnTj783 = numX49.tnTj78("bjEi");
                String string = extras != null ? extras.getString(numX49.tnTj78("bjEE"), strTnTj783) : null;
                if (bundle != null || string == null) {
                    return;
                }
                M7.a aVarV1 = V1();
                aVarV1.j();
                String strV = C2576A.V(string, numX49.tnTj78("bjEF"), strTnTj783);
                a aVar4 = (a) aVarV1.c.get();
                String strConcat = numX49.tnTj78("bjEH").concat(strV);
                MayaLoadActivity mayaLoadActivity = (MayaLoadActivity) aVar4;
                mayaLoadActivity.getClass();
                j.g(strConcat, numX49.tnTj78("bjEO"));
                C.i(numX49.tnTj78("bjEQ"), numX49.tnTj78("bjEt"));
                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(strTnTj78);
                if (flutterEngine != null && (navigationChannel = flutterEngine.getNavigationChannel()) != null) {
                    navigationChannel.setInitialRoute(strConcat);
                }
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bjE8"), numX49.tnTj78("bjEU"), numX49.tnTj78("bjEe")));
                }
                AbstractC1236z.g(mayaLoadActivity, R.id.constraint_layout_load, FlutterFragment.withCachedEngine(strTnTj78).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build());
                return;
            }
            i = R.id.lottie_view;
        }
        throw new NullPointerException(numX49.tnTj78("bjEC").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6250I = null;
        u uVar = this.f12710o;
        if (uVar != null) {
            uVar.b(null);
        }
        u uVar2 = this.f12711p;
        if (uVar2 != null) {
            uVar2.b(null);
        }
        V1().i();
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjE4"));
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjEo"));
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
        if (this.f12709n) {
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
