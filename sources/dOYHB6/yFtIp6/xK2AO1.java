package dOYHB6.yFtIp6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class xK2AO1 {
    private static Sensor accelerometer;
    public static boolean deviceFaceDown = false;
    private static SensorEventListener listener;
    private static SensorManager sensorManager;

    public static boolean g7GhQ5() {
        return deviceFaceDown;
    }

    public static void register(Context context) {
        sensorManager = (SensorManager) context.getSystemService(numX49.tnTj78("bHfP"));
        accelerometer = sensorManager.getDefaultSensor(1);
        if (accelerometer != null) {
            listener = new SensorEventListener() { // from class: dOYHB6.yFtIp6.xK2AO1.1
                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public void onSensorChanged(SensorEvent sensorEvent) {
                    xK2AO1.deviceFaceDown = sensorEvent.values[2] < -9.0f;
                }
            };
            sensorManager.registerListener(listener, accelerometer, 3);
        }
    }
}
