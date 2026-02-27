package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyt extends zzdbq {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private final zzdsm zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;

    @Nullable
    private ScheduledFuture zzj;

    @Nullable
    private ScheduledFuture zzk;

    public zzcyt(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdsm zzdsmVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
        this.zzd = zzdsmVar;
    }

    private final synchronized void zzf(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.elapsedRealtime() + j;
            this.zzj = this.zzb.schedule(new zzcyr(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzg(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            this.zzf = this.zzc.elapsedRealtime() + j;
            this.zzk = this.zzb.schedule(new zzcys(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.elapsedRealtime();
            }
            this.zzi = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzg;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzg = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzob)).booleanValue()) {
                long j6 = this.zze;
                if (jElapsedRealtime >= j6 || j6 - jElapsedRealtime > millis) {
                    zzf(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzor)).booleanValue()) {
                        zzdsl zzdslVarZza = this.zzd.zza();
                        zzdslVarZza.zzc("action", "rtnc");
                        zzdslVarZza.zzf();
                    }
                }
            } else {
                long j7 = this.zze;
                if (jElapsedRealtime > j7 || j7 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzh;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzh = millis;
                return;
            }
            long jElapsedRealtime = this.zzc.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzob)).booleanValue()) {
                if (jElapsedRealtime == this.zzf) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j6 = this.zzf;
                if (jElapsedRealtime >= j6 || j6 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j7 = this.zzf;
                if (jElapsedRealtime > j7 || j7 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
