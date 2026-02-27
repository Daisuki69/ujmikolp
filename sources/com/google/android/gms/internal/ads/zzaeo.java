package com.google.android.gms.internal.ads;

import androidx.media3.extractor.avi.AviExtractor;

/* JADX INFO: loaded from: classes3.dex */
final class zzaeo implements zzaek {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i, int i4, int i6, int i10) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
    }

    public static zzaeo zzb(zzef zzefVar) {
        int iZzC = zzefVar.zzC();
        zzefVar.zzk(8);
        int iZzC2 = zzefVar.zzC();
        int iZzC3 = zzefVar.zzC();
        zzefVar.zzk(4);
        int iZzC4 = zzefVar.zzC();
        zzefVar.zzk(12);
        return new zzaeo(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return AviExtractor.FOURCC_avih;
    }
}
