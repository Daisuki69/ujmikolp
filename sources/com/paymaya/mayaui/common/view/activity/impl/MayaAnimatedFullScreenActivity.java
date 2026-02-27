package com.paymaya.mayaui.common.view.activity.impl;

import B5.i;
import Bb.f;
import D.C0187u;
import Kh.C0308m;
import Kh.Q;
import M8.d3;
import Na.d;
import O5.a;
import Q6.e;
import S5.c;
import S6.b;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.store.K;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAnimatedFullScreenActivity extends q implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11784o = 0;
    public f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ActivityResultLauncher f11785n = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new d(this, 20));

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = (a) W4.a.e().a().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new f((K) aVar.f4671K.get());
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(R.layout.activity_maya_animated_full_screen);
        f fVar = this.m;
        String strTnTj78 = numX49.tnTj78("btAPb");
        Gh.f fVar2 = null;
        if (fVar == null) {
            j.n(strTnTj78);
            throw null;
        }
        fVar.h(this);
        String stringExtra = getIntent().getStringExtra(numX49.tnTj78("btAP2"));
        if (stringExtra == null) {
            stringExtra = numX49.tnTj78("btAPL");
        }
        f fVar3 = this.m;
        if (fVar3 == null) {
            j.n(strTnTj78);
            throw null;
        }
        C5.a aVar2 = new C5.a();
        aVar2.f739a = true;
        String strTnTj782 = numX49.tnTj78("btAPr");
        aVar2.e(strTnTj782);
        Uh.b bVar = ((K) fVar3.e).e;
        if (bVar != null) {
            Long l6 = AbstractC1233w.f11247v;
            j.f(l6, numX49.tnTj78("btAPZ"));
            Q qI = bVar.i(l6.longValue(), TimeUnit.MILLISECONDS);
            Bb.c cVar = new Bb.c(8, fVar3, stringExtra, aVar2);
            Gh.f fVar4 = new Gh.f(e.f, e.f5270g);
            try {
                qI.g(new C0308m(fVar4, cVar));
                fVar2 = fVar4;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                E1.c.k(th2);
                NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("btAPk"));
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        }
        if (fVar2 == null || fVar2.b()) {
            yk.a.f();
            fVar3.s(stringExtra);
            aVar2.f(strTnTj782);
        } else {
            fVar3.e(fVar2);
            yk.a.f();
        }
        getOnBackPressedDispatcher().addCallback(new d3(true, 1));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
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
    }
}
