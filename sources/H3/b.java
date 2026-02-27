package H3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import n4.C1922f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1922f f2087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f2088b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f2087a != null) {
            if (f <= 45.0f) {
                this.f2088b.post(new a(this, true, 0));
            } else if (f >= 450.0f) {
                this.f2088b.post(new a(this, false, 0));
            }
        }
    }
}
