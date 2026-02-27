package com.paymaya.mayaui.cryptocurrency.view.activity.impl;

import B5.i;
import D.C0187u;
import L9.C0323a;
import O5.b;
import S5.c;
import Uh.d;
import W4.a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import l9.C1803a;
import p0.C2004c;
import pg.u;
import x7.InterfaceC2468a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptocurrencyV2Activity extends q implements InterfaceC2468a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f12131o = 0;
    public C0323a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f12132n;

    public final C0323a V1() {
        C0323a c0323a = this.m;
        if (c0323a != null) {
            return c0323a;
        }
        j.n(numX49.tnTj78("btsP"));
        throw null;
    }

    public final void W1(String str, Map map) {
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1200) {
            finish();
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        a aVarE = a.e();
        if (aVarE.f6265Y == null) {
            O5.a aVar = aVarE.f6267a;
            C2004c c2004c = new C2004c();
            aVar.getClass();
            aVarE.f6265Y = new b(aVar.f4704b, c2004c);
        }
        O5.a aVar2 = aVarE.f6265Y.f4751a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        this.m = new C0323a((com.paymaya.data.preference.a) aVar2.e.get(), aVar2.a(), aVar2.J(), aVar2.b(), (c) aVar2.f4724k.get(), (d) aVar2.f4748y.get());
        View viewInflate = getLayoutInflater().inflate(R.layout.pma_activity_cryptocurrency, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException(numX49.tnTj78("btsr"));
        }
        setContentView((ConstraintLayout) viewInflate);
        V1().h(this);
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, numX49.tnTj78("btsb"));
        String strTnTj78 = numX49.tnTj78("bts2");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        u uVar = new u(flutterEngine.getDartExecutor(), numX49.tnTj78("btsL"));
        this.f12132n = uVar;
        uVar.b(new C1803a(this, 29));
        if (bundle == null) {
            V1().j();
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        a.e().f6265Y = null;
        u uVar = this.f12132n;
        if (uVar == null) {
            j.n(numX49.tnTj78("btsk"));
            throw null;
        }
        uVar.b(null);
        V1().i();
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("btsZ"));
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
}
