package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzko {
    public final zzup zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzko(zzup zzupVar, long j, long j6, long j7, long j9, boolean z4, boolean z5, boolean z8, boolean z9, boolean z10) {
        boolean z11 = true;
        zzghc.zza(!z10 || z8);
        if (z9 && !z8) {
            z11 = false;
        }
        zzghc.zza(z11);
        this.zza = zzupVar;
        this.zzb = j;
        this.zzc = j6;
        this.zzd = j7;
        this.zze = j9;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z8;
        this.zzi = z9;
        this.zzj = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzko.class == obj.getClass()) {
            zzko zzkoVar = (zzko) obj;
            if (this.zzb == zzkoVar.zzb && this.zzc == zzkoVar.zzc && this.zzd == zzkoVar.zzd && this.zze == zzkoVar.zze && this.zzh == zzkoVar.zzh && this.zzi == zzkoVar.zzi && this.zzj == zzkoVar.zzj && Objects.equals(this.zza, zzkoVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j6 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j6)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzko zza(long j) {
        return j == this.zzb ? this : new zzko(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzko zzb(long j) {
        return j == this.zzc ? this : new zzko(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
