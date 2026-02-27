package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import com.paymaya.domain.model.MfaTencentErrorResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbu {
    public static final zzbu zza = new zzbu(0, 0, 1.0f);

    @IntRange(from = 0)
    public final int zzb;

    @IntRange(from = 0)
    public final int zzc;

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false)
    public final float zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbu(@IntRange(from = 0) int i, @IntRange(from = 0) int i4, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbu) {
            zzbu zzbuVar = (zzbu) obj;
            if (this.zzb == zzbuVar.zzb && this.zzc == zzbuVar.zzc && this.zzd == zzbuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT;
        float f = this.zzd;
        return Float.floatToRawIntBits(f) + (((i * 31) + this.zzc) * 31);
    }
}
