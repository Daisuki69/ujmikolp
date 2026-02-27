package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfci {
    private final Clock zza;
    private final zzdsm zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfci(Clock clock, zzdsm zzdsmVar) {
        this.zza = clock;
        this.zzb = zzdsmVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgt)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzf(int i, int i4) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i) {
                    return;
                }
                this.zze = i4;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznS)).booleanValue()) {
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc("action", "mbs_state");
            zzdslVarZza.zzc("mbs_state", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            zzdslVarZza.zzd();
        }
        if (z4) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 2;
        }
        return z4;
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 3;
        }
        return z4;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
