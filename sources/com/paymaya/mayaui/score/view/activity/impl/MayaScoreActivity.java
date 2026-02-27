package com.paymaya.mayaui.score.view.activity.impl;

import B5.i;
import D.C0187u;
import M7.a;
import S5.c;
import W6.b;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import l9.C1803a;
import p3.t;
import pg.u;
import wb.InterfaceC2389a;
import x3.d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaScoreActivity extends q implements InterfaceC2389a, b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f13733p = 0;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f13735o;

    public final a V1() {
        a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bj0P"));
        throw null;
    }

    public final void W1() {
        C.i(numX49.tnTj78("bj0b"), numX49.tnTj78("bj02"));
        u uVar = new u(d.f(this).getDartExecutor(), numX49.tnTj78("bj0L"));
        uVar.b(new C1803a(this, 26));
        this.f13735o = uVar;
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
        iKNpI8.xCZPS1(this, bundle);
        boolean zContains = FlutterEngineCache.getInstance().contains(numX49.tnTj78("bj0r"));
        if (bundle != null && !zContains) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, numX49.tnTj78("bj0Z"));
            d.f(applicationContext);
            this.f13734n = true;
        }
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6268a0 == null) {
            O5.a aVar = aVarE.f6267a;
            t tVar = new t();
            aVar.getClass();
            aVarE.f6268a0 = new O5.b(aVar.f4704b, tVar);
        }
        O5.a aVar2 = aVarE.f6268a0.f4751a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        c cVar = (c) aVar2.f4724k.get();
        j.g(aVar3, numX49.tnTj78("bj0k"));
        j.g(cVar, numX49.tnTj78("bj0B"));
        this.m = new a(aVar3, cVar, 6);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_score, (ViewGroup) null, false);
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_score)) == null) {
            throw new NullPointerException(numX49.tnTj78("bj0u").concat(viewInflate.getResources().getResourceName(R.id.constraint_layout_score)));
        }
        setContentView((ConstraintLayout) viewInflate);
        V1().h(this);
        W1();
        V1().j();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6268a0 = null;
        u uVar = this.f13735o;
        if (uVar != null) {
            uVar.b(null);
        }
        V1().i();
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bj0V"));
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
        if (this.f13734n) {
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
