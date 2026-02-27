package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdp {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final ScheduledExecutorService zzc;

    public zzbdp(Context context, ScheduledExecutorService scheduledExecutorService, zzbdr zzbdrVar, zzfib zzfibVar) {
        this.zzc = scheduledExecutorService;
    }

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }

    public final S1.y zzb() {
        return (zzgol) zzgot.zzi(zzgol.zzw(zzgot.zza(null)), ((Long) zzbeh.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }
}
