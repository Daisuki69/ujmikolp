package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzacg {
    protected final zzaca zza;
    protected final zzacf zzb;

    @Nullable
    protected zzacc zzc;
    private final int zzd;

    public zzacg(zzacd zzacdVar, zzacf zzacfVar, long j, long j6, long j7, long j9, long j10, long j11, int i) {
        this.zzb = zzacfVar;
        this.zzd = i;
        this.zza = new zzaca(zzacdVar, j, 0L, j7, j9, j10, j11);
    }

    public static final int zzf(zzacv zzacvVar, long j, zzads zzadsVar) {
        if (j == zzacvVar.zzn()) {
            return 0;
        }
        zzadsVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzacv zzacvVar, long j) throws IOException {
        long jZzn = j - zzacvVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzacvVar.zzf((int) jZzn);
        return true;
    }

    public final zzadv zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzacc zzaccVar = this.zzc;
        if (zzaccVar == null || zzaccVar.zze() != j) {
            zzaca zzacaVar = this.zza;
            this.zzc = new zzacc(j, zzacaVar.zzd(j), 0L, zzacaVar.zze(), zzacaVar.zzf(), zzacaVar.zzg(), zzacaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        while (true) {
            zzacc zzaccVar = this.zzc;
            zzaccVar.getClass();
            long jZzb = zzaccVar.zzb();
            long jZzc = zzaccVar.zzc();
            long jZzh = zzaccVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzacvVar, jZzb, zzadsVar);
            }
            if (!zzg(zzacvVar, jZzh)) {
                return zzf(zzacvVar, jZzh, zzadsVar);
            }
            zzacvVar.zzl();
            zzace zzaceVarZza = this.zzb.zza(zzacvVar, zzaccVar.zzd());
            int iZzd = zzaceVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzacvVar, jZzh, zzadsVar);
            }
            if (iZzd == -2) {
                zzaccVar.zzf(zzaceVarZza.zze(), zzaceVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzacvVar, zzaceVarZza.zzf());
                    zze(true, zzaceVarZza.zzf());
                    return zzf(zzacvVar, zzaceVarZza.zzf(), zzadsVar);
                }
                zzaccVar.zzg(zzaceVarZza.zze(), zzaceVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z4, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
