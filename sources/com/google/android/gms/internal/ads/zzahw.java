package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes3.dex */
final class zzahw implements zzahs {
    private final zzef zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzahw(zzeu zzeuVar) {
        zzef zzefVar = zzeuVar.zza;
        this.zza = zzefVar;
        zzefVar.zzh(12);
        this.zzc = zzefVar.zzH() & 255;
        this.zzb = zzefVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        if (i4 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
