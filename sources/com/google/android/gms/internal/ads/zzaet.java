package com.google.android.gms.internal.ads;

import androidx.media3.extractor.avi.AviExtractor;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
final class zzaet implements zzaek {
    public final String zza;

    private zzaet(String str) {
        this.zza = str;
    }

    public static zzaet zzb(zzef zzefVar) {
        return new zzaet(zzefVar.zzK(zzefVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return AviExtractor.FOURCC_strn;
    }
}
