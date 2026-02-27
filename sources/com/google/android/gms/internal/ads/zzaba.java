package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaba {
    private final zzaau zza;
    private final zzaav zzf;
    private long zzk;
    private final zzzu zzl;
    private final zzaas zzb = new zzaas();
    private final zzek zzc = new zzek(10);
    private final zzek zzd = new zzek(10);
    private final zzdu zze = new zzdu(16);
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private zzbu zzj = zzbu.zza;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private long zzi = androidx.media3.common.C.TIME_UNSET;

    public zzaba(zzzu zzzuVar, zzaau zzaauVar, zzaav zzaavVar) {
        this.zzl = zzzuVar;
        this.zza = zzaauVar;
        this.zzf = zzaavVar;
    }

    private static Object zzh(zzek zzekVar) {
        zzghc.zza(zzekVar.zzc() > 0);
        while (zzekVar.zzc() > 1) {
            zzekVar.zzd();
        }
        Object objZzd = zzekVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = androidx.media3.common.C.TIME_UNSET;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
        this.zzi = androidx.media3.common.C.TIME_UNSET;
        zzek zzekVar = this.zzd;
        if (zzekVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzekVar)).longValue();
        }
        zzek zzekVar2 = this.zzc;
        if (zzekVar2.zzc() > 0) {
            zzekVar2.zza(0L, (zzbu) zzh(zzekVar2));
        }
    }

    public final void zzb(long j, long j6) throws zzhz {
        while (true) {
            zzdu zzduVar = this.zze;
            if (zzduVar.zzd()) {
                return;
            }
            zzek zzekVar = this.zzd;
            long jZzc = zzduVar.zzc();
            Long l6 = (Long) zzekVar.zze(jZzc);
            if (l6 != null && l6.longValue() != this.zzk) {
                this.zzk = l6.longValue();
                this.zza.zza(2);
            }
            zzaau zzaauVar = this.zza;
            long j7 = this.zzk;
            zzaas zzaasVar = this.zzb;
            int iZzk = zzaauVar.zzk(jZzc, j, j6, j7, false, false, zzaasVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzaasVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzduVar.zzb();
                zzbu zzbuVar = (zzbu) this.zzc.zze(jZzb);
                if (zzbuVar != null && !zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzj)) {
                    this.zzj = zzbuVar;
                    this.zzl.zza(zzbuVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzaasVar.zzb(), jZzb, zzaauVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzduVar.zzb();
                final zzzu zzzuVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzzuVar.zza.zzB().zzc();
                    }
                };
                zzzv zzzvVar = zzzuVar.zza;
                zzzvVar.zzC().execute(runnable);
                ((zzabp) zzzvVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i, int i4) {
        long j = this.zzg;
        this.zzc.zza(j == androidx.media3.common.C.TIME_UNSET ? 0L : j + 1, new zzbu(i, i4, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i);
            this.zzk = j;
        } else {
            zzek zzekVar = this.zzd;
            long j6 = this.zzg;
            zzekVar.zza(j6 == androidx.media3.common.C.TIME_UNSET ? -4611686018427387904L : j6 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != androidx.media3.common.C.TIME_UNSET && this.zzh == j;
    }
}
