package com.paymaya.ui.common.view.activity.impl;

import B5.i;
import O5.a;
import android.os.Bundle;
import android.view.MotionEvent;
import com.paymaya.R;
import com.paymaya.domain.model.ActivityTransition;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.FlutterActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FlutterDialogActivity extends FlutterActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f14369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityTransition f14370b = new ActivityTransition(R.anim.maya_hold, R.anim.maya_hold, R.anim.maya_hold, R.anim.maya_hold);

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        ActivityTransition activityTransition = this.f14370b;
        overridePendingTransition(activityTransition.getBackStackReEntryAnim(), activityTransition.getExitAnim());
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        ActivityTransition activityTransition = this.f14370b;
        overridePendingTransition(activityTransition.getEntranceAnim(), activityTransition.getBackStackExitAnim());
        this.f14369a = (i) ((a) W4.a.e().a().c).f4659D.get();
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
        i iVar = this.f14369a;
        if (iVar != null) {
            iVar.u0(this);
        } else {
            j.n(numX49.tnTj78("bV7P"));
            throw null;
        }
    }
}
