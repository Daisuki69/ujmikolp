package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzh {
    public static final zzzb zza = new zzzb(2, androidx.media3.common.C.TIME_UNSET, null);
    public static final zzzb zzb = new zzzb(3, androidx.media3.common.C.TIME_UNSET, null);
    private final zzzn zzc = P.a(zzeo.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzza.zza);

    @Nullable
    private zzzc zzd;

    @Nullable
    private IOException zze;

    public zzzh(String str) {
    }

    public static zzzb zza(boolean z4, long j) {
        return new zzzb(z4 ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzzd zzzdVar, zzyz zzyzVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzzc(this, looperMyLooper, zzzdVar, zzyzVar, i, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        zzzcVar.zzc(false);
    }

    public final void zzg(@Nullable zzze zzzeVar) {
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zzc(true);
        }
        zzzn zzznVar = this.zzc;
        zzznVar.execute(new zzzf(zzzeVar));
        zzznVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zza(i);
        }
    }

    public final /* synthetic */ zzzn zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzzc zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzzc zzzcVar) {
        this.zzd = zzzcVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
