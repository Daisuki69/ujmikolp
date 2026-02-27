package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzli extends zzud {
    private final zzbd zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzli(zzlj zzljVar, zzbe zzbeVar) {
        super(zzbeVar);
        Objects.requireNonNull(zzljVar);
        this.zzc = new zzbd();
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z4) {
        zzbe zzbeVar = this.zzb;
        zzbc zzbcVarZzd = zzbeVar.zzd(i, zzbcVar, z4);
        if (zzbeVar.zzb(zzbcVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbcVarZzd.zza(zzbcVar.zza, zzbcVar.zzb, zzbcVar.zzc, zzbcVar.zzd, 0L, zzb.zza, true);
            return zzbcVarZzd;
        }
        zzbcVarZzd.zzf = true;
        return zzbcVarZzd;
    }
}
