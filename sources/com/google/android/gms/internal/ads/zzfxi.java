package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfxi {

    @Nullable
    private MotionEvent zzb;
    private final ArrayDeque zza = new ArrayDeque();
    private zzfxg zzc = new zzfxg();

    public final synchronized void zza(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.zzb = MotionEvent.obtain(motionEvent);
            }
            this.zzc.zza(motionEvent);
            ArrayDeque arrayDeque = this.zza;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new zzfxh(motionEvent));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(Map map) {
        try {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.zzc);
            ArrayDeque arrayDeque = this.zza;
            map.put("ro", arrayDeque.toArray(new zzfxh[arrayDeque.size()]));
            this.zzc = new zzfxg();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.zzb;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.zzb = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
