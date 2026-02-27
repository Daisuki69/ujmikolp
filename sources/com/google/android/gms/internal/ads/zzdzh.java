package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzh implements zzdzj {
    private final Map zza;
    private final zzgpd zzb;
    private final zzcyw zzc;

    public zzdzh(Map map, zzgpd zzgpdVar, zzcyw zzcywVar) {
        this.zza = map;
        this.zzb = zzgpdVar;
        this.zzc = zzcywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final S1.y zza(final zzbuv zzbuvVar) {
        this.zzc.zzdT(zzbuvVar);
        S1.y yVarZzc = zzgot.zzc(new zzdwz(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziW)).split(",")) {
            final zzhqm zzhqmVar = (zzhqm) this.zza.get(str.trim());
            if (zzhqmVar != null) {
                yVarZzc = zzgot.zzh(yVarZzc, zzdwz.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzg
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ S1.y zza(Object obj) {
                        return ((zzdzj) zzhqmVar.zzb()).zza(zzbuvVar);
                    }
                }, this.zzb);
            }
        }
        zzgot.zzq(yVarZzc, new zzdzf(this), zzbzh.zzg);
        return yVarZzc;
    }

    public final /* synthetic */ zzcyw zzb() {
        return this.zzc;
    }
}
