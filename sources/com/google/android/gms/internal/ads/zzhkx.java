package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhkx extends zzhkv {
    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzhkw) obj).zzk(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i4) {
        ((zzhkw) obj).zzk((i << 3) | 5, Integer.valueOf(i4));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzhkw) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zzhhb zzhhbVar) {
        ((zzhkw) obj).zzk((i << 3) | 2, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzhkw) obj).zzk((i << 3) | 3, (zzhkw) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* synthetic */ Object zzf() {
        return zzhkw.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* synthetic */ Object zzg(Object obj) {
        zzhkw zzhkwVar = (zzhkw) obj;
        zzhkwVar.zzd();
        return zzhkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        if (zzhkwVar != zzhkw.zza()) {
            return zzhkwVar;
        }
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        zzhihVar.zzt = zzhkwVarZzb;
        return zzhkwVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzhih) obj).zzt = (zzhkw) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    public final void zzj(Object obj) {
        ((zzhih) obj).zzt.zzd();
    }
}
