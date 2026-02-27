package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzael implements zzadv {
    final /* synthetic */ zzaen zza;
    private final long zzb;

    public zzael(zzaen zzaenVar, long j) {
        Objects.requireNonNull(zzaenVar);
        this.zza = zzaenVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzaen zzaenVar = this.zza;
        zzadt zzadtVarZzg = zzaenVar.zza()[0].zzg(j);
        for (int i = 1; i < zzaenVar.zza().length; i++) {
            zzadt zzadtVarZzg2 = zzaenVar.zza()[i].zzg(j);
            if (zzadtVarZzg2.zza.zzc < zzadtVarZzg.zza.zzc) {
                zzadtVarZzg = zzadtVarZzg2;
            }
        }
        return zzadtVarZzg;
    }
}
