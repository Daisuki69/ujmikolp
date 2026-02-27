package com.paymaya.ui.common.view.activity.impl;

import B5.i;
import O5.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.paymaya.R;
import com.paymaya.domain.model.ActivityTransition;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FullScreenFlutterActivity extends FlutterActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f14371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterEngine f14372b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14373d;
    public boolean c = true;
    public final ActivityTransition e = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left);

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.c) {
            ActivityTransition activityTransition = this.e;
            overridePendingTransition(activityTransition.getBackStackReEntryAnim(), activityTransition.getExitAnim());
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        String stringExtra = getIntent().getStringExtra(numX49.tnTj78("bV7j"));
        if (stringExtra == null) {
            stringExtra = numX49.tnTj78("bV7d");
        }
        if ((!FlutterEngineCache.getInstance().contains(stringExtra) && stringExtra.length() > 0) || bundle != null) {
            this.f14372b = new FlutterEngine(getContext());
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            FlutterEngine flutterEngine = this.f14372b;
            if (flutterEngine == null) {
                j.n(numX49.tnTj78("bV7i"));
                throw null;
            }
            flutterEngineCache.put(stringExtra, flutterEngine);
            this.f14373d = true;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        String strTnTj78 = numX49.tnTj78("bV7E");
        boolean z4 = intent.hasExtra(strTnTj78) && getIntent().getBooleanExtra(strTnTj78, true);
        this.c = z4;
        if (z4) {
            ActivityTransition activityTransition = this.e;
            overridePendingTransition(activityTransition.getEntranceAnim(), activityTransition.getBackStackExitAnim());
        }
        this.f14371a = (i) ((a) W4.a.e().a().c).f4659D.get();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
        if (this.f14373d) {
            finish();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        i iVar = this.f14371a;
        if (iVar != null) {
            iVar.u0(this);
        } else {
            j.n(numX49.tnTj78("bV7F"));
            throw null;
        }
    }
}
