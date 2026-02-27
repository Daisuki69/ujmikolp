package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcur implements com.google.android.gms.ads.internal.overlay.zzq {
    private final zzfcu zzc;
    private final zzfcj zzd;
    private final Clock zze;
    private final zzdsm zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();

    @VisibleForTesting
    final zzfiv zza = zzfiw.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzcur(zzfcu zzfcuVar, zzfcj zzfcjVar, Clock clock, zzdsm zzdsmVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfcuVar;
        this.zzd = zzfcjVar;
        this.zze = clock;
        this.zzf = zzdsmVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdsm zzdsmVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfiw) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznH)).booleanValue()) {
                    zzdsl zzdslVarZza = zzdsmVar.zza();
                    zzdslVarZza.zzc("action", "pclma");
                    zzdslVarZza.zzc("pclmd", strEncodeToString);
                    zzdslVarZza.zzc("gqi", str);
                    zzdslVarZza.zzf();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfiv zzfivVar = this.zza;
                    zzfhp zzfhpVarZza = zzfhq.zza();
                    zzfhpVarZza.zzb(i);
                    zzfhpVarZza.zza(this.zze.currentTimeMillis());
                    zzfivVar.zza((zzfhq) zzfhpVarZza.zzbu());
                    if (i == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdA() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdB() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdC() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdD() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdE() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdY(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdt() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdu() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzdv() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
