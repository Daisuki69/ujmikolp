package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgea {
    private final zzfvz zza;
    private final zzftp zzb;

    public zzgea(zzftp zzftpVar, zzfvz zzfvzVar) {
        this.zza = zzfvzVar;
        this.zzb = zzftpVar;
    }

    public final zzgdy zza(int i) {
        return new zzgdy(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(15203, -1L, null, str);
    }

    public final void zzd(int i, Throwable th2) {
        this.zza.zzb(i - 1, -1L, th2, null);
    }

    public final S1.y zze(int i, S1.y yVar) {
        zzgdy zzgdyVarZza = zza(i);
        zzgdyVarZza.zza();
        zzgot.zzq(yVar, new zzgdz(this, zzgdyVarZza), zzgpk.zza());
        return yVar;
    }
}
