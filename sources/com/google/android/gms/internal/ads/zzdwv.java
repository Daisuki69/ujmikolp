package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwv extends zzfrr {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwu zzf;
    private boolean zzg;

    public zzdwv(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzdwu zzdwuVar) {
        this.zzf = zzdwuVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjM)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjO)).intValue());
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjM)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f7 = fArr[2] / 9.80665f;
            float f10 = f7 * f7;
            if (((float) Math.sqrt(f10 + (f3 * f3) + (f * f))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjN)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjO)).intValue()) <= jCurrentTimeMillis) {
                    if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjP)).intValue()) < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzdwu zzdwuVar = this.zzf;
                    if (zzdwuVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjQ)).intValue()) {
                            zzdvs zzdvsVar = (zzdvs) zzdwuVar;
                            zzdvsVar.zzo(new zzdvp(zzdvsVar), zzdvr.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
