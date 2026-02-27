package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.ads.AbstractC1173g;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk {
    private static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long zzb(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long zza(long j, long j6, long j7) {
        long j9 = (j ^ j6) * j7;
        long j10 = ((j9 ^ (j9 >>> 47)) ^ j6) * j7;
        return (j10 ^ (j10 >>> 47)) * j7;
    }

    public static long zza(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            throw new IndexOutOfBoundsException(AbstractC1173g.q(67, length, "Out of bound index with offput: 0 and length: "));
        }
        char c = '/';
        char c10 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = ((long) (length << 1)) - 7286425919675154353L;
                long jZzb = zzb(bArr2, 0) * (-5435081209227447693L);
                long jZzb2 = zzb(bArr2, 8);
                long jZzb3 = zzb(bArr2, length - 8) * j;
                return zza(Long.rotateRight(jZzb3, 30) + Long.rotateRight(jZzb + jZzb2, 43) + (zzb(bArr2, length - 16) * (-7286425919675154353L)), Long.rotateRight(jZzb2 - 7286425919675154353L, 18) + jZzb + jZzb3, j);
            }
            if (length >= 8) {
                long j6 = ((long) (length << 1)) - 7286425919675154353L;
                long jZzb4 = zzb(bArr2, 0) - 7286425919675154353L;
                long jZzb5 = zzb(bArr2, length - 8);
                return zza((Long.rotateRight(jZzb5, 37) * j6) + jZzb4, (Long.rotateRight(jZzb4, 25) + jZzb5) * j6, j6);
            }
            if (length >= 4) {
                return zza(((long) length) + ((((long) zza(bArr2, 0)) & KeyboardMap.kValueMask) << 3), ((long) zza(bArr2, length - 4)) & KeyboardMap.kValueMask, ((long) (length << 1)) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j7 = (((long) (length + ((bArr2[length - 1] & 255) << 2))) * (-4348849565147123417L)) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * (-7286425919675154353L));
            return (j7 ^ (j7 >>> 47)) * (-7286425919675154353L);
        }
        char c11 = '@';
        if (length <= 64) {
            long j9 = ((long) (length << 1)) - 7286425919675154353L;
            long jZzb6 = zzb(bArr2, 0) * (-7286425919675154353L);
            long jZzb7 = zzb(bArr2, 8);
            long jZzb8 = zzb(bArr2, length - 8) * j9;
            long jRotateRight = Long.rotateRight(jZzb8, 30) + Long.rotateRight(jZzb6 + jZzb7, 43) + (zzb(bArr2, length - 16) * (-7286425919675154353L));
            long jZza = zza(jRotateRight, Long.rotateRight(jZzb7 - 7286425919675154353L, 18) + jZzb6 + jZzb8, j9);
            long jZzb9 = zzb(bArr2, 16) * j9;
            long jZzb10 = zzb(bArr2, 24);
            long jZzb11 = (jRotateRight + zzb(bArr2, length - 32)) * j9;
            return zza(Long.rotateRight(jZzb11, 30) + Long.rotateRight(jZzb9 + jZzb10, 43) + ((jZza + zzb(bArr2, length - 24)) * j9), Long.rotateRight(jZzb10 + jZzb6, 18) + jZzb9 + jZzb11, j9);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jZzb12 = zzb(bArr2, 0) + 95310865018149119L;
        int i = length - 1;
        int i4 = (i / 64) << 6;
        int i6 = i & 63;
        int i10 = i4 + i6;
        int i11 = i10 - 63;
        long j10 = 2480279821605975764L;
        long j11 = 1390051526045402406L;
        int i12 = i6;
        int i13 = 0;
        while (true) {
            char c12 = c10;
            long jRotateRight2 = Long.rotateRight(jZzb12 + j10 + jArr[c10] + zzb(bArr2, i13 + 8), 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(j10 + jArr[1] + zzb(bArr2, i13 + 48), 42) * (-5435081209227447693L);
            long j12 = jRotateRight2 ^ jArr2[1];
            char c13 = c11;
            long jZzb13 = jArr[c12] + zzb(bArr2, i13 + 40) + jRotateRight3;
            long jRotateRight4 = Long.rotateRight(j11 + jArr2[c12], 33) * (-5435081209227447693L);
            char c14 = c;
            int i14 = i12;
            zza(bArr2, i13, jArr[1] * (-5435081209227447693L), j12 + jArr2[c12], jArr);
            int i15 = i13;
            long[] jArr3 = jArr;
            zza(bArr2, i15 + 32, jRotateRight4 + jArr2[1], jZzb13 + zzb(bArr2, i15 + 16), jArr2);
            i13 = i15 + 64;
            if (i13 == i4) {
                long j13 = ((j12 & 255) << 1) - 5435081209227447693L;
                long j14 = jArr2[c12] + ((long) i14);
                jArr2[c12] = j14;
                long j15 = jArr3[c12] + j14;
                jArr3[c12] = j15;
                jArr2[c12] = jArr2[c12] + j15;
                long jRotateRight5 = Long.rotateRight(jRotateRight4 + jZzb13 + jArr3[c12] + zzb(bArr2, i10 - 55), 37) * j13;
                long jRotateRight6 = Long.rotateRight(jZzb13 + jArr3[1] + zzb(bArr2, i10 - 15), 42) * j13;
                long j16 = jRotateRight5 ^ (jArr2[1] * 9);
                long jZzb14 = (jArr3[c12] * 9) + zzb(bArr2, i10 - 23) + jRotateRight6;
                long jRotateRight7 = Long.rotateRight(j12 + jArr2[c12], 33) * j13;
                zza(bArr2, i11, jArr3[1] * j13, jArr2[c12] + j16, jArr3);
                zza(bArr2, i10 - 31, jArr2[1] + jRotateRight7, zzb(bArr2, i10 - 47) + jZzb14, jArr2);
                return zza((((jZzb14 >>> c14) ^ jZzb14) * (-4348849565147123417L)) + zza(jArr3[c12], jArr2[c12], j13) + j16, zza(jArr3[1], jArr2[1], j13) + jRotateRight7, j13);
            }
            bArr2 = bArr;
            jZzb12 = jRotateRight4;
            jArr = jArr3;
            c10 = c12;
            j11 = j12;
            c11 = c13;
            j10 = jZzb13;
            i12 = i14;
            c = c14;
        }
    }

    private static void zza(byte[] bArr, int i, long j, long j6, long[] jArr) {
        long jZzb = zzb(bArr, i);
        long jZzb2 = zzb(bArr, i + 8);
        long jZzb3 = zzb(bArr, i + 16);
        long jZzb4 = zzb(bArr, i + 24);
        long j7 = j + jZzb;
        long j9 = jZzb2 + j7 + jZzb3;
        long jRotateRight = Long.rotateRight(j9, 44) + Long.rotateRight(j6 + j7 + jZzb4, 21);
        jArr[0] = j9 + jZzb4;
        jArr[1] = jRotateRight + j7;
    }
}
