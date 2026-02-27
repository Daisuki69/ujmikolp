package com.google.android.gms.internal.ads;

import androidx.media3.common.PlaybackException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzre implements zzqj {
    public zzre(zzrd zzrdVar) {
    }

    public static int zza(int i, int i4, int i6) {
        return zzgne.zza(((((long) i) * ((long) i4)) * ((long) i6)) / 1000000);
    }

    public static final int zzb(int i, int i4, int i6, int i10, int i11, int i12) {
        int i13 = 250000;
        if (i6 == 0) {
            int iZza = zza(250000, i11, i10);
            int iZza2 = zza(750000, i11, i10);
            String str = zzeo.zza;
            return Math.max(iZza, Math.min(i * 4, iZza2));
        }
        if (i6 == 1) {
            return zzgne.zza((((long) zzc(i4)) * 50000000) / 1000000);
        }
        if (i4 == 5) {
            i13 = 500000;
        } else if (i4 == 8) {
            i13 = PlaybackException.CUSTOM_ERROR_CODE_BASE;
            i4 = 8;
        }
        return zzgne.zza((((long) i13) * ((long) (i12 != -1 ? zzgmx.zzb(i12, 8, RoundingMode.CEILING) : zzc(i4)))) / 1000000);
    }

    private static int zzc(int i) {
        int iZzf = zzacy.zzf(i);
        zzghc.zzh(iZzf != -2147483647);
        return iZzf;
    }
}
