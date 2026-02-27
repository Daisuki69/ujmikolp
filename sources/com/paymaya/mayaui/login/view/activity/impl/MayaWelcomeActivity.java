package com.paymaya.mayaui.login.view.activity.impl;

import A5.m;
import A7.j;
import B5.i;
import D.C0187u;
import Ne.d;
import O5.a;
import Rg.g;
import S5.c;
import W6.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import b9.InterfaceC0927c;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import h9.InterfaceC1543b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n3.C1916a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaWelcomeActivity extends q implements InterfaceC0927c, InterfaceC1543b, eb.q, b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f12735u = 0;
    public j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f12736n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC1033d f12738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ActivityResultLauncher f12739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ActivityResultLauncher f12740r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1033d f12742t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f12737o = new g(24);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function1 f12741s = new g(25);

    public MayaWelcomeActivity() {
        final int i = 0;
        this.f12738p = C1034e.b(new Function0(this) { // from class: c9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeActivity f9317b;

            {
                this.f9317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaWelcomeActivity mayaWelcomeActivity = this.f9317b;
                switch (i) {
                    case 0:
                        int i4 = MayaWelcomeActivity.f12735u;
                        return C1916a.b(mayaWelcomeActivity);
                    default:
                        int i6 = MayaWelcomeActivity.f12735u;
                        return S5.c.b(mayaWelcomeActivity.m1(), A5.b.f53B1) ? new ActivityTransition(R.anim.maya_fade_in, R.anim.maya_slide_out_to_right, R.anim.maya_fade_out, R.anim.maya_slide_in_from_left) : mayaWelcomeActivity.c;
                }
            }
        });
        final int i4 = 0;
        this.f12739q = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeActivity f9319b;

            {
                this.f9319b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaWelcomeActivity mayaWelcomeActivity = this.f9319b;
                ActivityResult it = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i6 = MayaWelcomeActivity.f12735u;
                        kotlin.jvm.internal.j.g(it, "it");
                        mayaWelcomeActivity.f12737o.invoke(it);
                        break;
                    default:
                        int i10 = MayaWelcomeActivity.f12735u;
                        kotlin.jvm.internal.j.g(it, "it");
                        mayaWelcomeActivity.f12741s.invoke(it);
                        break;
                }
            }
        });
        final int i6 = 1;
        this.f12740r = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeActivity f9319b;

            {
                this.f9319b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaWelcomeActivity mayaWelcomeActivity = this.f9319b;
                ActivityResult it = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        int i62 = MayaWelcomeActivity.f12735u;
                        kotlin.jvm.internal.j.g(it, "it");
                        mayaWelcomeActivity.f12737o.invoke(it);
                        break;
                    default:
                        int i10 = MayaWelcomeActivity.f12735u;
                        kotlin.jvm.internal.j.g(it, "it");
                        mayaWelcomeActivity.f12741s.invoke(it);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f12742t = C1034e.b(new Function0(this) { // from class: c9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaWelcomeActivity f9317b;

            {
                this.f9317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaWelcomeActivity mayaWelcomeActivity = this.f9317b;
                switch (i10) {
                    case 0:
                        int i42 = MayaWelcomeActivity.f12735u;
                        return C1916a.b(mayaWelcomeActivity);
                    default:
                        int i62 = MayaWelcomeActivity.f12735u;
                        return S5.c.b(mayaWelcomeActivity.m1(), A5.b.f53B1) ? new ActivityTransition(R.anim.maya_fade_in, R.anim.maya_slide_out_to_right, R.anim.maya_fade_out, R.anim.maya_slide_in_from_left) : mayaWelcomeActivity.c;
                }
            }
        });
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    public final void V1(Function1 function1) {
        this.f12737o = function1;
        n1();
        String name = MayaLoginActivity.class.getName();
        Intent intent = new Intent(this, (Class<?>) MayaAnimatedFullScreenActivity.class);
        intent.putExtra(numX49.tnTj78("bjHD"), name);
        this.f12739q.launch(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return (ActivityTransition) this.f12742t.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        m mVar = this.f12736n;
        if (mVar != null) {
            mVar.e = false;
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjHh"));
            throw null;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().p().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new j((c) aVar.f4724k.get(), (m) aVar.f4653A.get(), (com.paymaya.data.preference.a) aVar.e.get());
        this.f12736n = (m) aVar.f4653A.get();
        super.onCreate(bundle);
        setContentView(R.layout.maya_activity_welcome);
        j jVar = this.m;
        if (jVar != null) {
            jVar.h(this);
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjHM"));
            throw null;
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().c = null;
        d dVar = (d) this.f12738p.getValue();
        if (dVar != null) {
            Ne.c cVar = dVar.f4395g;
            if (cVar != null) {
                dVar.f4393b.removeLocationUpdates(cVar);
                dVar.f4395g = null;
            }
            dVar.h.d();
        }
        j jVar = this.m;
        if (jVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjHN"));
            throw null;
        }
        jVar.i();
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

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.WELCOME;
    }
}
