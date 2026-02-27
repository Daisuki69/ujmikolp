package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebi implements zzcxg, zzcvv {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzebs zzd;

    public zzebi(zzebs zzebsVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzebsVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z4) {
        int i;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgG)).intValue();
            }
            if (i < iIntValue) {
                this.zzd.zza(z4);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzb(true);
    }
}
