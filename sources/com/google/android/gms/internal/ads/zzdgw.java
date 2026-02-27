package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdgw implements zzcqv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhqm zzd;
    private final zzdje zze;

    public zzdgw(Map map, Map map2, Map map3, zzhqm zzhqmVar, zzdje zzdjeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhqmVar;
        this.zze = zzdjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    @Nullable
    public final zzedz zza(int i, String str) {
        zzedz zzedzVarZza;
        zzedz zzedzVar = (zzedz) this.zza.get(str);
        if (zzedzVar != null) {
            return zzedzVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzegf zzegfVar = (zzegf) this.zzc.get(str);
            if (zzegfVar != null) {
                return zzcra.zza(zzegfVar);
            }
            zzedzVarZza = (zzedz) this.zzb.get(str);
            if (zzedzVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzedzVarZza = ((zzcqv) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcra.zzb(zzedzVarZza);
    }
}
