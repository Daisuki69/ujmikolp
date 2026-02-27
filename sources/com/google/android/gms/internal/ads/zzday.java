package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzday implements zzcyy {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbu)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznI)).intValue();

    @VisibleForTesting
    public zzday() {
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zzdU(zzfcu zzfcuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbv)).booleanValue()) {
            try {
                zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
                this.zza = zzfcmVar.zzc;
                this.zzb = zzfcmVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
