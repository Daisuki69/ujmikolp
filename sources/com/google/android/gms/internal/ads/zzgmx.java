package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmx {
    public static int zza(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzgmw.zza[roundingMode.ordinal()]) {
            case 1:
                zzgna.zzb(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int zzb(int i, int i4, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i4;
        int i10 = i - (i4 * i6);
        if (i10 == 0) {
            return i6;
        }
        int i11 = ((i ^ i4) >> 31) | 1;
        switch (zzgmw.zza[roundingMode.ordinal()]) {
            case 1:
                zzgna.zzb(false);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i11 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i10);
                int iAbs2 = iAbs - (Math.abs(i4) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i6 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i6;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i6;
                }
            default:
                throw new AssertionError();
        }
        return i6 + i11;
    }
}
