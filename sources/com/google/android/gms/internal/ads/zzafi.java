package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafi implements zzacu {
    private final zzef zza = new zzef(4);
    private final zzadx zzb = new zzadx(-1, -1, MimeTypes.IMAGE_HEIF);

    private final boolean zza(zzacv zzacvVar, int i) throws IOException {
        zzef zzefVar = this.zza;
        zzefVar.zza(4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 4, false);
        return zzefVar.zzz() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        ((zzacl) zzacvVar).zzj(4, false);
        return zza(zzacvVar, Atom.TYPE_ftyp) && zza(zzacvVar, Sniffer.BRAND_HEIC);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        return this.zzb.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zzb.zzh(j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }
}
