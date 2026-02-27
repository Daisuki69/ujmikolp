package com.paymaya.mayaui.inboxsupport.view.activity.impl;

import B5.i;
import C5.b;
import D.C0187u;
import Gh.f;
import L9.C0323a;
import O5.d;
import S5.c;
import W4.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import of.p;
import oi.C1983a;
import p0.C2004c;
import pg.r;
import pg.t;
import pg.u;
import v0.C2333a;
import y5.q;
import y8.InterfaceC2515a;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaInboxSupportActivity extends q implements InterfaceC2515a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f12415v = 0;
    public C0323a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f12417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlutterFragment f12418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f12419q = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public J5.b f12420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f12421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ActivityResultLauncher f12422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t f12423u;

    public final C0323a V1() {
        C0323a c0323a = this.m;
        if (c0323a != null) {
            return c0323a;
        }
        j.n(numX49.tnTj78("bjBP"));
        throw null;
    }

    public final void W1(r rVar) {
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(numX49.tnTj78("bjBb"));
        if (flutterEngine == null) {
            return;
        }
        new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("bjB2")).a(rVar.f19112a, rVar.f19113b, null);
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        FlutterFragment flutterFragment = this.f12418p;
        if (flutterFragment != null) {
            flutterFragment.onActivityResult(i, i4, intent);
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        boolean zContains = FlutterEngineCache.getInstance().contains(numX49.tnTj78("bjBL"));
        if (bundle != null && !zContains) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, numX49.tnTj78("bjBr"));
            p.h(applicationContext);
            this.f12416n = true;
        }
        super.onCreate(bundle);
        a aVarE = a.e();
        if (aVarE.f6242A == null) {
            O5.a aVar = aVarE.f6267a;
            C2004c c2004c = new C2004c();
            aVar.getClass();
            aVarE.f6242A = new d(aVar.f4704b, c2004c);
        }
        O5.a aVar2 = aVarE.f6242A.f4753a;
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
        C1261h c1261hD = aVar2.d();
        j.g(aVar3, numX49.tnTj78("bjBZ"));
        j.g(cVar, numX49.tnTj78("bjBk"));
        this.m = new C0323a(aVar3, cVar, c1293x0J, c1265jE, c1261hD);
        this.f12420r = (J5.b) aVar2.f4744v0.get();
        Uh.d dVar = (Uh.d) aVar2.m0.get();
        if (dVar == null) {
            j.n(numX49.tnTj78("bjBV"));
            throw null;
        }
        f fVar = new f(new C1983a(this, 26), Eh.d.f1366d);
        dVar.g(fVar);
        this.f12421s = fVar;
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_inbox_chat, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException(numX49.tnTj78("bjBu"));
        }
        setContentView((FrameLayout) viewInflate);
        V1().h(this);
        this.f12422t = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new C2333a(2));
        u uVar = new u(p.h(this).getDartExecutor(), numX49.tnTj78("bjBB"));
        uVar.b(new y9.d(this, 4));
        this.f12417o = uVar;
        V1().j();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        u uVar = this.f12417o;
        if (uVar != null) {
            uVar.b(null);
        }
        V1().i();
        a.e().f6242A = null;
        f fVar = this.f12421s;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        this.f12421s = null;
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjBS"));
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        j.g(intent, numX49.tnTj78("bjBj"));
        super.onNewIntent(intent);
        FlutterFragment flutterFragment = this.f12418p;
        if (flutterFragment != null) {
            flutterFragment.onNewIntent(intent);
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        j.g(strArr, numX49.tnTj78("bjBd"));
        j.g(iArr, numX49.tnTj78("bjBi"));
        super.onRequestPermissionsResult(i, strArr, iArr);
        FlutterFragment flutterFragment = this.f12418p;
        if (flutterFragment != null) {
            flutterFragment.onRequestPermissionsResult(i, strArr, iArr);
        }
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
        if (this.f12416n) {
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
