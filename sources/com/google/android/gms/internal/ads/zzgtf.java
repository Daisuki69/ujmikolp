package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzgtf implements zzgzb {
    static final /* synthetic */ zzgtf zza = new zzgtf();

    private /* synthetic */ zzgtf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public final /* synthetic */ Object zza(zzgqd zzgqdVar) throws GeneralSecurityException {
        zzgtq zzgtqVar = (zzgtq) zzgqdVar;
        int i = zzgth.zza;
        String strZzb = zzgtqVar.zzd().zzb();
        zzgrg zzgrgVarZzd = zzgtqVar.zzd().zzd();
        zzgpx zzgpxVarZzb = zzgqq.zza(strZzb).zzb();
        int i4 = zzgte.zza;
        try {
            return zzgwj.zzc(new zzgte(zzhdw.zzd(zzgqu.zza(zzgrgVarZzd), zzhhr.zza()), zzgpxVarZzb), zzgtqVar.zzb());
        } catch (zzhiw e) {
            throw new GeneralSecurityException(e);
        }
    }
}
