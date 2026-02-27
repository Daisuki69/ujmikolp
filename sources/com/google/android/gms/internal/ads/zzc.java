package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    public static final zzc zza = new zzc(0, 0, 1, 1, 0, false, null);

    @Nullable
    private AudioAttributes zzb;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzc(int i, int i4, int i6, int i10, int i11, boolean z4, byte[] bArr) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzc.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2092275855;
    }

    public final AudioAttributes zza() {
        if (this.zzb == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.zzb = usage.build();
        }
        return this.zzb;
    }
}
