package bg;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.Arrays;

/* JADX INFO: renamed from: bg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1011o implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1033d f9102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O4.k f9103b;
    public final C0965G0 c;

    public C1011o(Context context, int i, O4.k _doOnSensorChanged, C0965G0 c0965g0) {
        kotlin.jvm.internal.j.h(context, "context");
        kotlin.jvm.internal.j.h(_doOnSensorChanged, "_doOnSensorChanged");
        this.f9103b = _doOnSensorChanged;
        this.c = c0965g0;
        this.f9102a = C1034e.b(new C1007k(context, 1));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        kotlin.jvm.internal.j.h(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        kotlin.jvm.internal.j.h(event, "event");
        int i = event.accuracy;
        long j = event.timestamp;
        float[] fArr = event.values;
        kotlin.jvm.internal.j.c(fArr, "event.values");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.j.f(fArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        this.f9103b.invoke(new m0(i, j, fArrCopyOf));
    }
}
