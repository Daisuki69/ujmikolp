package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxn extends zzbxs {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    private final Clock zzj;

    public zzbxn(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxr zzbxrVar) {
        this.zzj = clock;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(zzgVar);
        this.zzb = zzhpxVarZza2;
        this.zzc = zzhpw.zza(zzbxh.zza(zzhpxVarZza, zzhpxVarZza2));
        zzhpx zzhpxVarZza3 = zzhpy.zza(clock);
        this.zzd = zzhpxVarZza3;
        zzhpx zzhpxVarZza4 = zzhpy.zza(zzbxrVar);
        this.zze = zzhpxVarZza4;
        zzhqg zzhqgVarZza = zzhpw.zza(zzbxj.zza(zzhpxVarZza3, zzhpxVarZza2, zzhpxVarZza4));
        this.zzf = zzhqgVarZza;
        zzbxl zzbxlVarZzc = zzbxl.zzc(zzhpxVarZza3, zzhqgVarZza);
        this.zzg = zzbxlVarZzc;
        this.zzh = zzhpw.zza(zzbxy.zza(zzhpxVarZza, zzbxlVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final zzbxk zza() {
        return new zzbxk(this.zzj, (zzbxi) this.zzf.zzb());
    }
}
