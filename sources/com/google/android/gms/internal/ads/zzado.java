package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzado {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzado() {
    }

    public final boolean zza(int i) {
        int i4;
        int i6;
        int i10;
        int i11;
        if (!zzadp.zzl(i) || (i4 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i10 - 1;
        this.zza = i4;
        this.zzb = zzadp.zza[3 - i6];
        int i13 = zzadp.zzb[i11];
        this.zzd = i13;
        if (i4 == 2) {
            i13 /= 2;
            this.zzd = i13;
        } else if (i4 == 0) {
            i13 /= 4;
            this.zzd = i13;
        }
        int i14 = (i >>> 9) & 1;
        this.zzg = zzadp.zzm(i4, i6);
        if (i6 == 3) {
            int i15 = i4 == 3 ? zzadp.zzc[i12] : zzadp.zzd[i12];
            this.zzf = i15;
            this.zzc = (((i15 * 12) / i13) + i14) * 4;
        } else {
            if (i4 == 3) {
                int i16 = i6 == 2 ? zzadp.zze[i12] : zzadp.zzf[i12];
                this.zzf = i16;
                this.zzc = androidx.camera.core.impl.a.a(i16, 144, i13, i14);
            } else {
                int i17 = zzadp.zzg[i12];
                this.zzf = i17;
                this.zzc = androidx.camera.core.impl.a.a(i6 == 1 ? 72 : 144, i17, i13, i14);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzado(zzado zzadoVar) {
        this.zza = zzadoVar.zza;
        this.zzb = zzadoVar.zzb;
        this.zzc = zzadoVar.zzc;
        this.zzd = zzadoVar.zzd;
        this.zze = zzadoVar.zze;
        this.zzf = zzadoVar.zzf;
        this.zzg = zzadoVar.zzg;
    }
}
