package com.paymaya.mayaui.cashin.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import G7.t;
import H6.b;
import O5.e;
import S1.s;
import S5.c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.u;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCardPullV2Activity extends q implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f11606p = 0;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f11607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11608o;

    public final a V1() {
        a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("btyR"));
        throw null;
    }

    public final void W1() {
        C.i(numX49.tnTj78("btyp"), numX49.tnTj78("bty0"));
        u uVar = new u(s.e(this).getDartExecutor(), numX49.tnTj78("btyg"));
        uVar.b(new t(this, 6));
        this.f11607n = uVar;
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

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        DartExecutor dartExecutor;
        iKNpI8.xCZPS1(this, bundle);
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        String strTnTj78 = numX49.tnTj78("btyf");
        if (!flutterEngineCache.contains(strTnTj78) && bundle != null) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, numX49.tnTj78("bty1"));
            s.e(applicationContext);
            this.f11608o = true;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
            windowInsetsControllerCompat.show(WindowInsetsCompat.Type.systemBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        } else {
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        }
        W4.a aVarE = W4.a.e();
        if (aVarE.f6252L == null) {
            O5.a aVar = aVarE.f6267a;
            M2.b bVar = new M2.b(2);
            aVar.getClass();
            aVarE.f6252L = new e(aVar.f4704b, bVar);
        }
        O5.a aVar2 = aVarE.f6252L.f4754a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        j.g(aVar3, numX49.tnTj78("btyn"));
        this.m = new a(aVar3, 7, false);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_card_pull_v2_activity, (ViewGroup) null, false);
        int i = R.id.constrain_layout_card_pull_v2;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constrain_layout_card_pull_v2)) != null) {
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                setContentView((ConstraintLayout) viewInflate);
                V1().h(this);
                W1();
                C.i(numX49.tnTj78("btyx"), numX49.tnTj78("btys"));
                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(strTnTj78);
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint(numX49.tnTj78("bty5"), numX49.tnTj78("btyJ"), numX49.tnTj78("btyI")));
                }
                AbstractC1236z.g(this, R.id.constrain_layout_card_pull_v2, FlutterFragment.withCachedEngine(strTnTj78).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build());
                return;
            }
            i = R.id.lottie_view;
        }
        throw new NullPointerException(numX49.tnTj78("btyq").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        u uVar = this.f11607n;
        if (uVar == null) {
            j.n(numX49.tnTj78("btyl"));
            throw null;
        }
        uVar.b(null);
        V1().i();
        W4.a.e().f6252L = null;
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("btyz"));
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
        if (this.f11608o) {
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
