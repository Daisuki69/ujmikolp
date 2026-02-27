package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapb extends Thread {
    private final BlockingQueue zza;
    private final zzapa zzb;
    private final zzaor zzc;
    private volatile boolean zzd = false;
    private final zzaoy zze;

    public zzapb(BlockingQueue blockingQueue, zzapa zzapaVar, zzaor zzaorVar, zzaoy zzaoyVar) {
        this.zza = blockingQueue;
        this.zzb = zzapaVar;
        this.zzc = zzaorVar;
        this.zze = zzaoyVar;
    }

    private void zzb() throws InterruptedException {
        zzaph zzaphVar = (zzaph) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaphVar.zze(3);
        try {
            try {
                zzaphVar.zzc("network-queue-take");
                zzaphVar.zzl();
                TrafficStats.setThreadStatsTag(zzaphVar.zzb());
                zzapd zzapdVarZza = this.zzb.zza(zzaphVar);
                zzaphVar.zzc("network-http-complete");
                if (zzapdVarZza.zze && zzaphVar.zzq()) {
                    zzaphVar.zzd("not-modified");
                    zzaphVar.zzw();
                } else {
                    zzapn zzapnVarZzr = zzaphVar.zzr(zzapdVarZza);
                    zzaphVar.zzc("network-parse-complete");
                    zzaoq zzaoqVar = zzapnVarZzr.zzb;
                    if (zzaoqVar != null) {
                        this.zzc.zzb(zzaphVar.zzi(), zzaoqVar);
                        zzaphVar.zzc("network-cache-written");
                    }
                    zzaphVar.zzp();
                    this.zze.zza(zzaphVar, zzapnVarZzr, null);
                    zzaphVar.zzv(zzapnVarZzr);
                }
            } catch (zzapq e) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaphVar, e);
                zzaphVar.zzw();
            } catch (Exception e7) {
                zzapt.zzd(e7, "Unhandled exception %s", e7.toString());
                zzapq zzapqVar = new zzapq(e7);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaphVar, zzapqVar);
                zzaphVar.zzw();
            }
            zzaphVar.zze(4);
        } catch (Throwable th2) {
            zzaphVar.zze(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapt.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
