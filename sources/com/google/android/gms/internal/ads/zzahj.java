package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzahj implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahj(long[] jArr, long[] jArr2, long j, long j6, long j7, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j7;
        this.zze = i;
    }

    @Nullable
    public static zzahj zzd(long j, long j6, zzado zzadoVar, zzef zzefVar) {
        int iZzs;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzk(6);
        int iZzB = zzefVar2.zzB();
        long j7 = zzadoVar.zzc;
        long j9 = iZzB;
        if (zzefVar2.zzB() <= 0) {
            return null;
        }
        long jZzr = zzeo.zzr((((long) r4) * ((long) zzadoVar.zzg)) - 1, zzadoVar.zzd);
        int iZzt = zzefVar2.zzt();
        int iZzt2 = zzefVar2.zzt();
        int iZzt3 = zzefVar2.zzt();
        zzefVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i = 0;
        long j10 = j6 + ((long) zzadoVar.zzc);
        while (i < iZzt) {
            long j11 = j7;
            jArr[i] = (((long) i) * jZzr) / ((long) iZzt);
            jArr2[i] = j10;
            if (iZzt3 == 1) {
                iZzs = zzefVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzefVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzefVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzefVar2.zzH();
            }
            j10 += ((long) iZzs) * ((long) iZzt2);
            i++;
            zzefVar2 = zzefVar;
            iZzt = iZzt;
            j7 = j11;
        }
        long j12 = j6 + j7;
        long jMax = j12 + j9;
        if (j != -1 && j != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(jMax).length());
            androidx.media3.datasource.cache.c.z(sb2, "VBRI data size mismatch: ", j, ", ");
            sb2.append(jMax);
            zzds.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + String.valueOf(jMax).length() + 43 + 28);
            androidx.media3.datasource.cache.c.z(sb3, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
            sb3.append(j10);
            sb3.append("\nSeeking will be inaccurate.");
            zzds.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j10);
        }
        return new zzahj(jArr, jArr2, jZzr, j12, jMax, zzadoVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long[] jArr = this.zza;
        int iZzm = zzeo.zzm(jArr, j, true, true);
        long j6 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzadw zzadwVar = new zzadw(j6, jArr2[iZzm]);
        if (zzadwVar.zzb >= j || iZzm == jArr.length - 1) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = iZzm + 1;
        return new zzadt(zzadwVar, new zzadw(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        return this.zza[zzeo.zzm(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zze;
    }
}
