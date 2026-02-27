package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeax {
    private final zzbup zza;

    public zzeax(zzbup zzbupVar) {
        this.zza = zzbupVar;
    }

    public final void zza() {
        S1.y yVarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
            zzbzk.zzb(yVarZza, "persistFlags");
        } else {
            zzbzk.zza(yVarZza, "persistFlags");
        }
    }
}
