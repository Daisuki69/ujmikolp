package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzafo extends zzadj {
    final /* synthetic */ zzadv zza;
    final /* synthetic */ zzafp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafo(zzafp zzafpVar, zzadv zzadvVar, zzadv zzadvVar2) {
        super(zzadvVar);
        this.zza = zzadvVar2;
        Objects.requireNonNull(zzafpVar);
        this.zzb = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadj, com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadt zzadtVarZzc = this.zza.zzc(j);
        zzadw zzadwVar = zzadtVarZzc.zza;
        long j6 = zzadwVar.zzb;
        zzafp zzafpVar = this.zzb;
        zzadw zzadwVar2 = new zzadw(j6, zzafpVar.zza() + zzadwVar.zzc);
        zzadw zzadwVar3 = zzadtVarZzc.zzb;
        return new zzadt(zzadwVar2, new zzadw(zzadwVar3.zzb, zzafpVar.zza() + zzadwVar3.zzc));
    }
}
