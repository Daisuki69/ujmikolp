package com.journeyapps.barcodescanner;

import H3.g;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.lBzGT9.pYp6Y3;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.yFtIp6.ht2aO8;
import m4.h;
import n4.C1920d;

/* JADX INFO: loaded from: classes3.dex */
public class CaptureActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f10146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DecoratedBarcodeView f10147b;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        h hVar = this.f10146a;
        hVar.e = true;
        hVar.f.a();
        hVar.h.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f10147b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
        h hVar = this.f10146a;
        hVar.f.a();
        BarcodeView barcodeView = hVar.f18360b.f10148a;
        C1920d cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f18602g && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        h hVar = this.f10146a;
        hVar.getClass();
        if (i == 250) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                hVar.b();
            } else {
                hVar.f18360b.f10148a.c();
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
        h hVar = this.f10146a;
        CaptureActivity captureActivity = hVar.f18359a;
        if (ContextCompat.checkSelfPermission(captureActivity, "android.permission.CAMERA") == 0) {
            hVar.f18360b.f10148a.c();
        } else if (!hVar.f18363k) {
            pYp6Y3.requestPermissions(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            hVar.f18363k = true;
        }
        g gVar = hVar.f;
        if (!gVar.c) {
            ht2aO8.registerReceiver(gVar.f2092a, gVar.f2093b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            gVar.c = true;
        }
        gVar.f2094d.removeCallbacksAndMessages(null);
        if (gVar.f) {
            gVar.f2094d.postDelayed(gVar.e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f10146a.c);
    }

    @Override // android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // android.app.Activity
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
