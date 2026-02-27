package x1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.media3.extractor.ts.TsExtractor;

/* JADX INFO: renamed from: x1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2452b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f20855a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f20856b = new float[16];
    public final float[] c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f20857d = new float[3];
    public final Display e;
    public final InterfaceC2451a[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20858g;

    public C2452b(Display display, InterfaceC2451a... interfaceC2451aArr) {
        this.e = display;
        this.f = interfaceC2451aArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f20855a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.e.getRotation();
        float[] fArr3 = this.f20856b;
        if (rotation != 0) {
            int i4 = TsExtractor.TS_STREAM_TYPE_AC3;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i4 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i4 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i4, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f20857d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z4 = this.f20858g;
        float[] fArr5 = this.c;
        if (!z4) {
            B1.a.a(fArr5, fArr2);
            this.f20858g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC2451a[] interfaceC2451aArr = this.f;
        for (int i6 = 0; i6 < 2; i6++) {
            interfaceC2451aArr[i6].onOrientationChange(fArr2, f);
        }
    }
}
