package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzaeq {
    private final zzaep zza;
    private final zzaeb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzaeq(int i, zzaep zzaepVar, zzaeb zzaebVar) {
        this.zza = zzaepVar;
        int iZzc = zzaepVar.zzc();
        boolean z4 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z4 = false;
            }
        }
        zzghc.zza(z4);
        this.zzc = zzj(i, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzaepVar.zzd();
        this.zzb = zzaebVar;
        this.zzd = iZzc == 2 ? zzj(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzaepVar.zzd;
    }

    private final long zzh(int i) {
        return (this.zze * ((long) i)) / ((long) this.zzf);
    }

    private final zzadw zzi(int i) {
        return new zzadw(((long) this.zzn[i]) * zzh(1), this.zzm[i]);
    }

    private static int zzj(int i, int i4) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i4;
    }

    public final void zza(long j, boolean z4) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z4) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final boolean zzc(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final boolean zze(zzacv zzacvVar) throws IOException {
        int i = this.zzh;
        zzaeb zzaebVar = this.zzb;
        int iZzy = i - zzaebVar.zzy(zzacvVar, i, false);
        this.zzh = iZzy;
        boolean z4 = iZzy == 0;
        if (z4) {
            if (this.zzg > 0) {
                zzaebVar.zzx(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z4;
    }

    public final void zzf(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzeo.zzm(this.zzm, j, true, true)];
        }
    }

    public final zzadt zzg(long j) {
        if (this.zzk == 0) {
            zzadw zzadwVar = new zzadw(0L, this.zzl);
            return new zzadt(zzadwVar, zzadwVar);
        }
        int iZzh = (int) (j / zzh(1));
        int iZzl = zzeo.zzl(this.zzn, iZzh, true, true);
        if (this.zzn[iZzl] == iZzh) {
            zzadw zzadwVarZzi = zzi(iZzl);
            return new zzadt(zzadwVarZzi, zzadwVarZzi);
        }
        zzadw zzadwVarZzi2 = zzi(iZzl);
        int i = iZzl + 1;
        return i < this.zzm.length ? new zzadt(zzadwVarZzi2, zzi(i)) : new zzadt(zzadwVarZzi2, zzadwVarZzi2);
    }
}
