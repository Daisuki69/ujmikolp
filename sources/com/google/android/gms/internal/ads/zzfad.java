package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfad implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzfad(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzfad zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzfad(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfab zzb() {
        Context context = (Context) this.zza.zzb();
        zzfen zzfenVar = (zzfen) this.zzb.zzb();
        zzfff zzfffVar = (zzfff) this.zzc.zzb();
        zzbyq zzbyqVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgK)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z4 = false;
        if (zzbyqVarZzi != null && zzbyqVarZzi.zzi()) {
            z4 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzha)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgJ)).booleanValue() || z4) {
                zzffe zzffeVarZza = zzfffVar.zza(zzfev.AppOpen, context, zzfenVar, new zzeze(new zzezd()));
                zzezs zzezsVar = new zzezs(new zzezr());
                zzfer zzferVar = zzffeVarZza.zza;
                zzgpd zzgpdVar = zzbzh.zza;
                return new zzezi(zzezsVar, new zzezo(zzferVar, zzgpdVar), zzffeVarZza.zzb, zzferVar.zze().zzf, zzgpdVar);
            }
        }
        return new zzezr();
    }
}
