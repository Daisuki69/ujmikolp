package com.paymaya.mayaui.dashboard.view.fragment.impl;

import B5.i;
import S5.c;
import android.os.Bundle;
import android.view.MotionEvent;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.preference.a;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSecurityFlutterScreen extends FlutterFragmentActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Function0 f12178g;
    public i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12179d;
    public C1220i e;
    public c f;

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineConfigurator
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        j.g(flutterEngine, numX49.tnTj78("btJP"));
        super.configureFlutterEngine(flutterEngine);
        new u(flutterEngine.getDartExecutor().getBinaryMessenger(), numX49.tnTj78("btJL")).b(new Bb.c(2, this, getIntent().getStringExtra(numX49.tnTj78("btJb")), getIntent().getStringExtra(numX49.tnTj78("btJ2"))));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final i g1() {
        i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        j.n(numX49.tnTj78("btJr"));
        throw null;
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.c = (i) aVar.f4659D.get();
        this.f12179d = (a) aVar.e.get();
        this.e = (C1220i) aVar.f4716g.get();
        this.f = (c) aVar.f4724k.get();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
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
