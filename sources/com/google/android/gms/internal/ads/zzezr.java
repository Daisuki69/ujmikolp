package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezr implements zzfab {

    @Nullable
    private zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzfab
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    public final synchronized S1.y zzb(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable zzcuz zzcuzVar) {
        zzcrw zzcrwVarZza;
        try {
            if (zzcuzVar != null) {
                this.zza = zzcuzVar;
            } else {
                this.zza = (zzcuz) zzfaaVar.zza(zzfacVar.zzb).zzh();
            }
            zzcrwVarZza = this.zza.zza();
        } catch (Throwable th2) {
            throw th2;
        }
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ S1.y zzc(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }
}
