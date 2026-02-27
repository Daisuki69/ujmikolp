package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzau {
    public static final zzau zza = new zzau(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzau(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f3) {
        zzghc.zza(f > 0.0f);
        zzghc.zza(f3 > 0.0f);
        this.zzb = f;
        this.zzc = f3;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzau.class == obj.getClass()) {
            zzau zzauVar = (zzau) obj;
            if (this.zzb == zzauVar.zzb && this.zzc == zzauVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToRawIntBits = Float.floatToRawIntBits(this.zzb) + 527;
        return Float.floatToRawIntBits(this.zzc) + (iFloatToRawIntBits * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        String str = zzeo.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j) {
        return j * ((long) this.zzd);
    }
}
