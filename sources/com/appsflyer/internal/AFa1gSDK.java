package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
final class AFa1gSDK implements SensorEventListener {
    private final int AFInAppEventType;

    @NonNull
    private final String AFKeystoreWrapper;

    @Nullable
    private Executor afDebugLog;
    private double afErrorLog;
    private long afInfoLog;
    private final int afRDLog;

    @NonNull
    private final String valueOf;
    private final float[][] AFInAppEventParameterName = new float[2][];
    private final long[] values = new long[2];

    public AFa1gSDK(Sensor sensor) {
        int type = sensor.getType();
        this.AFInAppEventType = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.valueOf = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFKeystoreWrapper = str;
        this.afRDLog = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    @NonNull
    private synchronized Executor AFKeystoreWrapper() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @NonNull
    private static List<Float> values(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final void AFInAppEventType(@NonNull Map<AFa1gSDK, Map<String, Object>> map, boolean z4) {
        if (!valueOf()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFInAppEventType());
            return;
        }
        map.put(this, AFInAppEventType());
        if (z4) {
            int length = this.AFInAppEventParameterName.length;
            for (int i = 0; i < length; i++) {
                this.AFInAppEventParameterName[i] = null;
            }
            int length2 = this.values.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.values[i4] = 0;
            }
            this.afErrorLog = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.afInfoLog = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFa1gSDK)) {
            return false;
        }
        AFa1gSDK aFa1gSDK = (AFa1gSDK) obj;
        return AFInAppEventType(aFa1gSDK.AFInAppEventType, aFa1gSDK.valueOf, aFa1gSDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return this.afRDLog;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFKeystoreWrapper().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9428a.valueOf(sensorEvent);
                }
            });
        } else {
            valueOf(sensorEvent);
        }
    }

    private boolean valueOf() {
        return this.AFInAppEventParameterName[0] != null;
    }

    private static double AFKeystoreWrapper(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public void valueOf(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.AFInAppEventParameterName;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.values[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventParameterName[1] = fArrCopyOf;
            this.values[1] = jCurrentTimeMillis;
            this.afErrorLog = AFKeystoreWrapper(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j - this.afInfoLog) {
            this.afInfoLog = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.values[1] = jCurrentTimeMillis;
                return;
            }
            double dAFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (dAFKeystoreWrapper > this.afErrorLog) {
                this.AFInAppEventParameterName[1] = Arrays.copyOf(fArr, fArr.length);
                this.values[1] = jCurrentTimeMillis;
                this.afErrorLog = dAFKeystoreWrapper;
            }
        }
    }

    private boolean AFInAppEventType(int i, @NonNull String str, @NonNull String str2) {
        return this.AFInAppEventType == i && this.valueOf.equals(str) && this.AFKeystoreWrapper.equals(str2);
    }

    @NonNull
    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventType));
        concurrentHashMap.put("sN", this.valueOf);
        concurrentHashMap.put("sV", this.AFKeystoreWrapper);
        float[] fArr = this.AFInAppEventParameterName[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.AFInAppEventParameterName[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }
}
