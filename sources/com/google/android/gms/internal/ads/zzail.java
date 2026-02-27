package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
final class zzail {
    public final zzais zza;
    public final zzaiv zzb;
    public final zzaeb zzc;

    @Nullable
    public final zzaec zzd;
    public int zze;

    @Nullable
    public zzu zzf;

    public zzail(zzais zzaisVar, zzaiv zzaivVar, zzaeb zzaebVar) {
        this.zza = zzaisVar;
        this.zzb = zzaivVar;
        this.zzc = zzaebVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzaisVar.zzg.zzo) ? new zzaec() : null;
    }
}
