package com.tencent.could.huiyansdk.manager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SensorManager f15680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f15681b;
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15682d;

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                float f = sensorEvent.values[0];
                c cVar = d.this.f15682d;
                if (cVar != null) {
                    cVar.a(f);
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15684a = new d();
    }

    public interface c {
        void a(float f);
    }

    public void a() {
        SensorManager sensorManager;
        if (!this.c || (sensorManager = this.f15680a) == null) {
            return;
        }
        this.c = false;
        sensorManager.unregisterListener(this.f15681b);
        this.f15682d = null;
    }
}
