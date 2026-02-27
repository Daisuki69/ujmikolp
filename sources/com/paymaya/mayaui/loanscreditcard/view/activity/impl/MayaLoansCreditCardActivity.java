package com.paymaya.mayaui.loanscreditcard.view.activity.impl;

import L9.C0323a;
import Le.j;
import Le.k;
import Na.d;
import V8.a;
import W6.b;
import android.content.Intent;
import android.view.MotionEvent;
import cj.M;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import pg.t;
import pg.u;
import pg.z;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLoansCreditCardActivity extends q implements a, b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f12712u = 0;
    public C0323a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f12714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f12715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Le.a f12716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f12717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f12718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f12719t;

    public final Map V1(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
        }
        return M.l(arrayList);
    }

    public final C0323a W1() {
        C0323a c0323a = this.m;
        if (c0323a != null) {
            return c0323a;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bjFP"));
        throw null;
    }

    public final void X1() {
        C.i(numX49.tnTj78("bjFb"), numX49.tnTj78("bjF2"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, numX49.tnTj78("bjFL"));
        String strTnTj78 = numX49.tnTj78("bjFr");
        FlutterEngine flutterEngine = flutterEngineCache.get(strTnTj78);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(strTnTj78, flutterEngine);
        }
        u uVar = new u(flutterEngine.getDartExecutor(), numX49.tnTj78("bjFZ"));
        uVar.b(new d(this, 26));
        this.f12717r = uVar;
    }

    public final void Y1(EnumC1216e enumC1216e, int i, String str) {
        C1220i c1220iK1 = k1();
        C1219h c1219hD = C1219h.d(EnumC1215d.LOANS_CREDIT_CARD);
        c1219hD.r(enumC1216e);
        c1219hD.n(i);
        c1219hD.i();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put(numX49.tnTj78("bjFk"), str);
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
        if (i == 200) {
            if (i4 == 2) {
                finish();
                return;
            }
            return;
        }
        if (i != 300) {
            if (i == 321) {
                if (i4 == 121) {
                    t tVar = this.f12718s;
                    if (tVar != null) {
                        tVar.success(1);
                    }
                    this.f12718s = null;
                    return;
                }
                if (i4 != 212) {
                    return;
                }
                t tVar2 = this.f12718s;
                if (tVar2 != null) {
                    tVar2.success(0);
                }
                this.f12718s = null;
                return;
            }
            if (i != 1200) {
                return;
            }
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a9 A[PHI: r6
  0x01a9: PHI (r6v22 java.lang.String) = 
  (r6v11 java.lang.String)
  (r6v13 java.lang.String)
  (r6v15 java.lang.String)
  (r6v17 java.lang.String)
  (r6v19 java.lang.String)
  (r6v21 java.lang.String)
 binds: [B:33:0x01a7, B:36:0x01b5, B:39:0x01c2, B:42:0x01cf, B:45:0x01dc, B:48:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity.onCreate(android.os.Bundle):void");
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        u uVar = this.f12717r;
        if (uVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjFG"));
            throw null;
        }
        uVar.b(null);
        this.f12718s = null;
        W1().i();
        W4.a.e().f6248G = null;
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjFX"));
        super.onDestroy();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PluginRegistry plugins;
        kotlin.jvm.internal.j.g(strArr, numX49.tnTj78("bjF3"));
        kotlin.jvm.internal.j.g(iArr, numX49.tnTj78("bjFy"));
        super.onRequestPermissionsResult(i, strArr, iArr);
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(numX49.tnTj78("bjFv"));
        FlutterPlugin flutterPlugin = (flutterEngine == null || (plugins = flutterEngine.getPlugins()) == null) ? null : plugins.get(S4.a.class);
        if (flutterPlugin instanceof z) {
            ((z) flutterPlugin).onRequestPermissionsResult(i, strArr, iArr);
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
        if (this.f12713n) {
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
