package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdg implements zzga {
    private final zzga zza;
    private final long zzb;
    private final zzga zzc;
    private long zzd;
    private Uri zze;

    public zzcdg(zzga zzgaVar, int i, zzga zzgaVar2) {
        this.zza = zzgaVar;
        this.zzb = i;
        this.zzc = zzgaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws IOException {
        int i6;
        long j = this.zzd;
        long j6 = this.zzb;
        if (j < j6) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i4, j6 - j));
            long j7 = this.zzd + ((long) iZza);
            this.zzd = j7;
            i6 = iZza;
            j = j7;
        } else {
            i6 = 0;
        }
        if (j < j6) {
            return i6;
        }
        int iZza2 = this.zzc.zza(bArr, i + i6, i4 - i6);
        int i10 = i6 + iZza2;
        this.zzd += (long) iZza2;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Uri uri;
        zzge zzgeVar2;
        Uri uri2 = zzgeVar.zza;
        this.zze = uri2;
        long j = zzgeVar.zze;
        long j6 = this.zzb;
        zzge zzgeVar3 = null;
        if (j >= j6) {
            uri = uri2;
            zzgeVar2 = null;
        } else {
            long j7 = zzgeVar.zzf;
            long jMin = j6 - j;
            if (j7 != -1) {
                jMin = Math.min(j7, jMin);
            }
            uri = uri2;
            zzgeVar2 = new zzge(uri, j, jMin, null);
        }
        long j9 = zzgeVar.zzf;
        if (j9 == -1 || j + j9 > j6) {
            zzgeVar3 = new zzge(uri, Math.max(j6, j), j9 != -1 ? Math.min(j9, (j + j9) - j6) : -1L, null);
        }
        long jZzb = zzgeVar2 != null ? this.zza.zzb(zzgeVar2) : 0L;
        long jZzb2 = zzgeVar3 != null ? this.zzc.zzb(zzgeVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Map zzj() {
        return zzgkc.zza();
    }
}
