package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmz {
    public static long zza(long j, long j6, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j7 = j / j6;
        long j9 = j - (j6 * j7);
        if (j9 == 0) {
            return j7;
        }
        int i = ((int) ((j ^ j6) >> 63)) | 1;
        switch (zzgmy.zza[roundingMode.ordinal()]) {
            case 1:
                zzgna.zzb(false);
                return j7;
            case 2:
                return j7;
            case 3:
                if (i >= 0) {
                    return j7;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j7;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j9);
                long jAbs2 = jAbs - (Math.abs(j6) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j7) == 0)) {
                        return j7;
                    }
                } else if (jAbs2 <= 0) {
                    return j7;
                }
            default:
                throw new AssertionError();
        }
        return j7 + ((long) i);
    }

    public static long zzb(long j, long j6) {
        zzgna.zza(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, j);
        zzgna.zza("b", j6);
        if (j == 0) {
            return j6;
        }
        if (j6 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j6);
        long j7 = j6 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j7) {
            long j9 = jNumberOfTrailingZeros - j7;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            jNumberOfTrailingZeros = j11 >> Long.numberOfTrailingZeros(j11);
            j7 += j10;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzc(long j, long j6) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j6;
        }
        long j7 = j ^ j6;
        long j9 = (j7 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j6 == Long.MIN_VALUE) & (j < 0)))) {
            long j10 = j * j6;
            if (j == 0 || j10 / j == j6) {
                return j10;
            }
        }
        return j9;
    }
}
