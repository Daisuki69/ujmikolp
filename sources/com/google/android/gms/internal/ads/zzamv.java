package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamv implements zzand {
    private zzu zza;
    private zzel zzb;
    private zzaeb zzc;

    public zzamv(String str, String str2) {
        zzs zzsVar = new zzs();
        zzsVar.zzl(MimeTypes.VIDEO_MP2T);
        zzsVar.zzm(str);
        this.zza = zzsVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
        this.zzb = zzelVar;
        zzanrVar.zza();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzc = zzaebVarZzu;
        zzaebVarZzu.zzu(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        this.zzb.getClass();
        String str = zzeo.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == androidx.media3.common.C.TIME_UNSET || jZzc == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        zzu zzuVar = this.zza;
        if (jZzc != zzuVar.zzt) {
            zzs zzsVarZza = zzuVar.zza();
            zzsVarZza.zzr(jZzc);
            zzu zzuVarZzM = zzsVarZza.zzM();
            this.zza = zzuVarZzM;
            this.zzc.zzu(zzuVarZzM);
        }
        int iZzd = zzefVar.zzd();
        this.zzc.zzz(zzefVar, iZzd);
        this.zzc.zzx(jZzb, 1, iZzd, 0, null);
    }
}
