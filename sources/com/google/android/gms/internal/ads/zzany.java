package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
final class zzany implements zzanx {
    private final zzacx zza;
    private final zzaeb zzb;
    private final zzaob zzc;
    private final zzu zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzany(zzacx zzacxVar, zzaeb zzaebVar, zzaob zzaobVar, String str, int i) throws zzas {
        this.zza = zzacxVar;
        this.zzb = zzaebVar;
        this.zzc = zzaobVar;
        int i4 = zzaobVar.zzb * zzaobVar.zze;
        int i6 = zzaobVar.zzd;
        int i10 = i4 / 8;
        if (i6 != i10) {
            throw zzas.zzb(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i10).length() + 28 + String.valueOf(i6).length()), "Expected block size: ", i10, "; got: ", i6), null);
        }
        int i11 = zzaobVar.zzc * i10;
        int i12 = i11 * 8;
        int iMax = Math.max(i10, i11 / 10);
        this.zze = iMax;
        zzs zzsVar = new zzs();
        zzsVar.zzl(MimeTypes.AUDIO_WAV);
        zzsVar.zzm(str);
        zzsVar.zzh(i12);
        zzsVar.zzi(i12);
        zzsVar.zzn(iMax);
        zzsVar.zzE(zzaobVar.zzb);
        zzsVar.zzF(zzaobVar.zzc);
        zzsVar.zzG(i);
        this.zzd = zzsVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(int i, long j) {
        this.zza.zzw(new zzaoe(this.zzc, 1, i, j));
        this.zzb.zzu(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final boolean zzc(zzacv zzacvVar, long j) throws IOException {
        int i;
        int i4;
        long j6 = j;
        while (j6 > 0 && (i = this.zzg) < (i4 = this.zze)) {
            int iZzy = this.zzb.zzy(zzacvVar, (int) Math.min(i4 - i, j6), true);
            if (iZzy == -1) {
                j6 = 0;
            } else {
                this.zzg += iZzy;
                j6 -= (long) iZzy;
            }
        }
        zzaob zzaobVar = this.zzc;
        int i6 = this.zzg;
        int i10 = zzaobVar.zzd;
        int i11 = i6 / i10;
        if (i11 > 0) {
            long jZzt = this.zzf + zzeo.zzt(this.zzh, 1000000L, zzaobVar.zzc, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.zzg - i12;
            this.zzb.zzx(jZzt, 1, i12, i13, null);
            this.zzh += (long) i11;
            this.zzg = i13;
        }
        return j6 <= 0;
    }
}
