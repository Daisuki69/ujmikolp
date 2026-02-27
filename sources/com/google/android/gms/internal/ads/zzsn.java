package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsn {
    public final zzst zza;
    public final MediaFormat zzb;
    public final zzu zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzsm zzf;

    private zzsn(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzsm zzsmVar) {
        this.zza = zzstVar;
        this.zzb = mediaFormat;
        this.zzc = zzuVar;
        this.zzd = surface;
        this.zzf = zzsmVar;
    }

    public static zzsn zza(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzsm zzsmVar) {
        return new zzsn(zzstVar, mediaFormat, zzuVar, null, null, zzsmVar);
    }

    public static zzsn zzb(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzsn(zzstVar, mediaFormat, zzuVar, surface, null, null);
    }
}
