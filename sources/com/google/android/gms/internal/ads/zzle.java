package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzle {
    private final Object zza;

    @Nullable
    @GuardedBy("lock")
    private Looper zzb;

    @Nullable
    @GuardedBy("lock")
    private HandlerThread zzc;

    @GuardedBy("lock")
    private int zzd;

    public zzle() {
        throw null;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z4 = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z4 = true;
                    }
                    zzghc.zzh(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                zzghc.zzh(this.zzd > 0);
                int i = this.zzd - 1;
                this.zzd = i;
                if (i == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzle(@Nullable Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }
}
