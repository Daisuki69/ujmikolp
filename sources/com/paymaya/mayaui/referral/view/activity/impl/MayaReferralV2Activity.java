package com.paymaya.mayaui.referral.view.activity.impl;

import B5.i;
import D.C0187u;
import D.C0190x;
import G7.l;
import M8.C0332a;
import M8.M1;
import N4.d;
import O5.e;
import S5.c;
import Sa.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import cj.M;
import cj.r;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import d4.AbstractC1331a;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.u;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaReferralV2Activity extends q implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f13660p = 0;
    public Ra.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f13661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13662o;

    public final Ra.a V1() {
        Ra.a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjvP"));
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

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        iKNpI8.xCZPS1(this, bundle);
        String strTnTj78 = numX49.tnTj78("bjvb");
        String strTnTj782 = numX49.tnTj78("bjv2");
        String strTnTj783 = numX49.tnTj78("bjvL");
        String strTnTj784 = numX49.tnTj78("bjvr");
        if (bundle != null && !FlutterEngineCache.getInstance().contains(strTnTj784)) {
            Context applicationContext = getApplicationContext();
            String strTnTj785 = numX49.tnTj78("bjvZ");
            j.f(applicationContext, strTnTj785);
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            String strTnTj786 = numX49.tnTj78("bjvk");
            j.f(flutterEngineCache, strTnTj786);
            if (flutterEngineCache.get(strTnTj784) == null) {
                flutterEngineCache.put(strTnTj784, new FlutterEngine(applicationContext));
            }
            Context applicationContext2 = getApplicationContext();
            j.f(applicationContext2, strTnTj785);
            FlutterEngineCache flutterEngineCache2 = FlutterEngineCache.getInstance();
            j.f(flutterEngineCache2, strTnTj786);
            String strTnTj787 = numX49.tnTj78("bjvB");
            if (flutterEngineCache2.get(strTnTj787) == null) {
                flutterEngineCache2.put(strTnTj787, new FlutterEngine(applicationContext2));
            }
            this.f13662o = true;
        }
        W4.a aVarE = W4.a.e();
        if (aVarE.f6282s == null) {
            O5.a aVar = aVarE.f6267a;
            d dVar = new d(13);
            aVar.getClass();
            aVarE.f6282s = new e(aVar.f4704b, dVar);
        }
        O5.a aVar2 = aVarE.f6282s.f4754a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        this.m = new Ra.a((com.paymaya.data.preference.a) aVar2.e.get(), aVar2.v(), aVar2.J());
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_referral_v2_activity, (ViewGroup) null, false);
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_activity_referral_v2_fragment_container)) == null) {
            throw new NullPointerException(numX49.tnTj78("bjvT").concat(viewInflate.getResources().getResourceName(R.id.maya_activity_referral_v2_fragment_container)));
        }
        setContentView((ConstraintLayout) viewInflate);
        V1().h(this);
        if (FlutterEngineCache.getInstance().contains(strTnTj784)) {
            FlutterEngineCache.getInstance().remove(strTnTj784);
        }
        l lVar = new l(new M1(1, this, MayaReferralV2Activity.class, numX49.tnTj78("bjvV"), numX49.tnTj78("bjvu"), 0, 21), new C0332a(this, 29), new M1(1, V1(), Ra.a.class, numX49.tnTj78("bjvi"), numX49.tnTj78("bjvd"), 0, 22), new M1(1, V1(), Ra.a.class, numX49.tnTj78("bjvF"), numX49.tnTj78("bjvE"), 0, 23), new M1(1, V1(), Ra.a.class, numX49.tnTj78("bjvO"), numX49.tnTj78("bjvH"), 0, 24), new M1(1, this, MayaReferralV2Activity.class, numX49.tnTj78("bjve"), numX49.tnTj78("bjvU"), 0, 26), new Ta.a(0, V1(), Ra.a.class, numX49.tnTj78("bjvj"), numX49.tnTj78("bjvS"), 0, 0), new M1(1, this, MayaReferralV2Activity.class, numX49.tnTj78("bjvt"), numX49.tnTj78("bjvQ"), 0, 25), new M1(1, V1(), Ra.a.class, numX49.tnTj78("bjvC"), numX49.tnTj78("bjv8"), 0, 27), new Ta.a(0, V1(), Ra.a.class, numX49.tnTj78("bjvo"), numX49.tnTj78("bjv4"), 0, 1), new C0190x(0, V1(), Ra.a.class, numX49.tnTj78("bjvw"), numX49.tnTj78("bjvK"), 0, 29));
        this.f13661n = lVar;
        lVar.b();
        lVar.c();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(numX49.tnTj78("bjvc"));
            if (stringExtra == null) {
                stringExtra = numX49.tnTj78("bjvm");
            }
            String strTnTj788 = numX49.tnTj78("bjvD");
            String stringExtra2 = intent.getStringExtra(strTnTj788);
            if (stringExtra2 == null) {
                stringExtra2 = numX49.tnTj78("bjvh");
            }
            String strTnTj789 = numX49.tnTj78("bjvM");
            String stringExtra3 = intent.getStringExtra(strTnTj789);
            if (stringExtra3 == null) {
                stringExtra3 = strTnTj783;
            }
            l lVar2 = this.f13661n;
            if (lVar2 == null) {
                j.n(numX49.tnTj78("bjvY"));
                throw null;
            }
            if (stringExtra3 == null) {
                throw new NullPointerException(numX49.tnTj78("bjvA"));
            }
            if (stringExtra3.equals(strTnTj783)) {
                i = 1;
            } else if (stringExtra3.equals(strTnTj782)) {
                i = 2;
            } else if (stringExtra3.equals(numX49.tnTj78("bjvN"))) {
                i = 3;
            } else {
                if (!stringExtra3.equals(strTnTj78)) {
                    throw new IllegalArgumentException(numX49.tnTj78("bjv7").concat(stringExtra3));
                }
                i = 4;
            }
            List listC = r.c(strTnTj783);
            AbstractC1331a.r(i, numX49.tnTj78("bjv6"));
            lVar2.f1894q = stringExtra;
            u uVar = lVar2.h;
            if (uVar == null) {
                j.n(numX49.tnTj78("bjvv"));
                throw null;
            }
            Pair pair = new Pair(numX49.tnTj78("bjva"), stringExtra);
            if (i == 1) {
                strTnTj78 = strTnTj783;
            } else if (i == 2) {
                strTnTj78 = strTnTj782;
            } else if (i == 3) {
                strTnTj78 = numX49.tnTj78("bjvX");
            } else if (i != 4) {
                throw null;
            }
            Pair pair2 = new Pair(strTnTj789, strTnTj78);
            Pair pair3 = new Pair(numX49.tnTj78("bjvG"), listC);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            uVar.a(numX49.tnTj78("bjv3"), M.h(pair, pair2, pair3, new Pair(strTnTj788, stringExtra2)), null);
        }
        FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine(strTnTj784).renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build();
        if (flutterFragmentBuild != null) {
            AbstractC1236z.g(this, R.id.maya_activity_referral_v2_fragment_container, flutterFragmentBuild);
        } else {
            j.n(numX49.tnTj78("bjvy"));
            throw null;
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6282s = null;
        if (this.f13661n == null) {
            j.n(numX49.tnTj78("bjvp"));
            throw null;
        }
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjvR"));
        V1().i();
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
        if (this.f13662o) {
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
