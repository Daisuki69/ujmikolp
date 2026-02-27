package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgwk {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i4 = 0;
        long j6 = 0;
        long j7 = 0;
        long j9 = 0;
        long j10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i4 >= length) {
                long j11 = j + (j6 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j7 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = ((j15 >> 26) * 5) + j10;
                long j18 = j17 >> 26;
                long j19 = j17 & 67108863;
                long j20 = j19 + 5;
                long j21 = (j6 & 67108863) + j18;
                long j22 = j21 + (j20 >> 26);
                long j23 = (j22 >> 26) + j12;
                long j24 = j14 + (j23 >> 26);
                long j25 = (j16 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j21 & j26) | (j22 & 67108863 & j27);
                long j29 = (j12 & j26) | (j23 & 67108863 & j27);
                long j30 = (j14 & j26) | (j24 & 67108863 & j27);
                long j31 = (j16 & j26) | (j25 & j27);
                long jZzb = (((j19 & j26) | (j20 & 67108863 & j27) | (j28 << 26)) & KeyboardMap.kValueMask) + zzb(bArr, 16);
                long jZzb2 = (((j28 >> 6) | (j29 << 20)) & KeyboardMap.kValueMask) + zzb(bArr, 20);
                long jZzb3 = (((j30 << 14) | (j29 >> 12)) & KeyboardMap.kValueMask) + zzb(bArr, 24);
                long jZzb4 = (((j30 >> 18) | (j31 << 8)) & KeyboardMap.kValueMask) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & KeyboardMap.kValueMask, 0);
                long j32 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j32 & KeyboardMap.kValueMask, 4);
                long j33 = jZzb3 + (j32 >> 32);
                zzd(bArr4, j33 & KeyboardMap.kValueMask, 8);
                zzd(bArr4, (jZzb4 + (j33 >> 32)) & KeyboardMap.kValueMask, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i4);
            System.arraycopy(bArr2, i4, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long j34 = jZzc5 * 5;
            long j35 = jZzc4 * 5;
            long j36 = jZzc3 * 5;
            long jZzc6 = j10 + zzc(bArr3, 0, 0);
            long jZzc7 = j6 + zzc(bArr3, 3, 2);
            long jZzc8 = j + zzc(bArr3, 6, 4);
            long jZzc9 = j7 + zzc(bArr3, 9, 6);
            long jZzc10 = j9 + (zzc(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j37 = jZzc7 * jZzc;
            long j38 = jZzc7 * jZzc2;
            long j39 = jZzc8 * jZzc;
            long j40 = jZzc7 * jZzc3;
            long j41 = jZzc8 * jZzc2;
            long j42 = jZzc9 * jZzc;
            long j43 = jZzc7 * jZzc4;
            long j44 = jZzc8 * jZzc3;
            long j45 = jZzc9 * jZzc2;
            long j46 = jZzc10 * jZzc;
            long j47 = (jZzc2 * 5 * jZzc10) + (jZzc9 * j36) + (jZzc8 * j35) + (jZzc7 * j34) + (jZzc6 * jZzc);
            long j48 = j47 & 67108863;
            long j49 = jZzc9 * j35;
            long j50 = j36 * jZzc10;
            long j51 = j50 + j49 + (jZzc8 * j34) + (jZzc6 * jZzc2) + j37 + (j47 >> 26);
            long j52 = j35 * jZzc10;
            long j53 = j52 + (jZzc9 * j34) + (jZzc6 * jZzc3) + j38 + j39 + (j51 >> 26);
            long j54 = (jZzc10 * j34) + (jZzc6 * jZzc4) + j40 + j41 + j42 + (j53 >> 26);
            long j55 = (jZzc6 * jZzc5) + j43 + j44 + j45 + j46 + (j54 >> 26);
            long j56 = ((j55 >> 26) * 5) + j48;
            j6 = (j51 & 67108863) + (j56 >> 26);
            i4 += 16;
            j = j53 & 67108863;
            j7 = j54 & 67108863;
            j9 = j55 & 67108863;
            i = 17;
            j10 = j56 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((long) (((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i10 << 16))) & KeyboardMap.kValueMask;
    }

    private static long zzc(byte[] bArr, int i, int i4) {
        return (zzb(bArr, i) >> i4) & 67108863;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        for (int i4 = 0; i4 < 4; i4++) {
            bArr[i + i4] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
