package com.paymaya.mayaui.autodebitarrangement.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import O5.b;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import de.m;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.InterfaceC1767a;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.u;
import x3.d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAutoDebitArrangementActivity extends q implements InterfaceC1767a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f11527p = 0;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f11529o;

    public final a V1() {
        a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("btNP"));
        throw null;
    }

    public final void W1() {
        C.i(numX49.tnTj78("btNb"), numX49.tnTj78("btN2"));
        u uVar = new u(d.e(this).getDartExecutor(), numX49.tnTj78("btNL"));
        uVar.b(new m(this, 29));
        this.f11529o = uVar;
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
        if (bundle != null && !FlutterEngineCache.getInstance().contains(numX49.tnTj78("btNr"))) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, numX49.tnTj78("btNZ"));
            d.e(applicationContext);
            this.f11528n = true;
        }
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6251K == null) {
            O5.a aVar = aVarE.f6267a;
            N4.d dVar = new N4.d(23);
            aVar.getClass();
            aVarE.f6251K = new b(aVar.f4704b, dVar);
        }
        O5.a aVar2 = aVarE.f6251K.f4751a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar2.e.get();
        j.g(aVar3, numX49.tnTj78("btNk"));
        this.m = new a(aVar3, 22, false);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_auto_debit_arrangement, (ViewGroup) null, false);
        int i = R.id.constraint_layout_auto_debit_arrangment;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_auto_debit_arrangment)) != null) {
            i = R.id.lottie_view;
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
                setContentView((ConstraintLayout) viewInflate);
                V1().h(this);
                W1();
                V1().j();
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("btNB").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6251K = null;
        u uVar = this.f11529o;
        if (uVar != null) {
            uVar.b(null);
        }
        V1().i();
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("btNu"));
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
        if (this.f11528n) {
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
