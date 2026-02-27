package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzc {

    @Nullable
    private zzgpd zza;

    @Nullable
    private zzdsm zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private long zze = -1;
    private long zzf = -1;

    public final void zza(zzgpd zzgpdVar, zzdsm zzdsmVar) {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza = zzgpdVar;
        this.zzb = zzdsmVar;
        this.zze = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzou)).longValue();
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzov)).longValue();
    }

    public final void zzb() {
        zzgpd zzgpdVar;
        if (!this.zzc.get() || this.zze < 0 || this.zzf < 0 || !this.zzd.compareAndSet(false, true) || (zzgpdVar = this.zza) == null) {
            return;
        }
        zzgpdVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        zzdsm zzdsmVar;
        while (this.zzd.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbza
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zze);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzow)).booleanValue() && (zzdsmVar = this.zzb) != null) {
                        zzdsl zzdslVarZza = zzdsmVar.zza();
                        zzdslVarZza.zzc("action", "paa");
                        zzdslVarZza.zzf();
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzf);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
