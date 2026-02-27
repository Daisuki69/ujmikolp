package io.flutter.view;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f17496b;

    public v(x xVar, DisplayManager displayManager) {
        this.f17496b = xVar;
        this.f17495a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            float refreshRate = this.f17495a.getDisplay(0).getRefreshRate();
            x xVar = this.f17496b;
            xVar.f17499a = (long) (1.0E9d / ((double) refreshRate));
            xVar.f17500b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
