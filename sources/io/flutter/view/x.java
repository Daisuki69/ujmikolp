package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public static x e;
    public static v f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f17500b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17499a = -1;
    public w c = new w(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f17501d = new u(this);

    public x(FlutterJNI flutterJNI) {
        this.f17500b = flutterJNI;
    }

    public static x a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new x(flutterJNI);
        }
        if (f == null) {
            x xVar = e;
            Objects.requireNonNull(xVar);
            v vVar = new v(xVar, displayManager);
            f = vVar;
            displayManager.registerDisplayListener(vVar, null);
        }
        if (e.f17499a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.f17499a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }
}
