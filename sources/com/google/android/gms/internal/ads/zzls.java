package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzls {
    public static final zzls zza = new zzls(new zzlr());
    public final zzgke zzb;

    @Nullable
    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d)
    public final Double zzc = null;

    @Nullable
    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d)
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzls(zzlr zzlrVar) {
        this.zzb = zzlrVar.zza();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zzls) && this.zzb.equals(((zzls) obj).zzb);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.zzb, null, null, bool, bool, bool, bool);
    }
}
