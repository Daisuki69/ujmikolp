package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzgwc {
    private static final int[] zza = zzd(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    public static void zzb(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            zzc(iArr, 0, 4, 8, 12);
            zzc(iArr, 1, 5, 9, 13);
            zzc(iArr, 2, 6, 10, 14);
            zzc(iArr, 3, 7, 11, 15);
            zzc(iArr, 0, 5, 10, 15);
            zzc(iArr, 1, 6, 11, 12);
            zzc(iArr, 2, 7, 8, 13);
            zzc(iArr, 3, 4, 9, 14);
        }
    }

    public static void zzc(int[] iArr, int i, int i4, int i6, int i10) {
        int i11 = iArr[i] + iArr[i4];
        iArr[i] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i6] + i13;
        iArr[i6] = i14;
        int i15 = iArr[i4] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i4] = i16;
        int i17 = iArr[i] + i16;
        iArr[i] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i6] + i19;
        iArr[i6] = i20;
        int i21 = iArr[i4] ^ i20;
        iArr[i4] = (i21 >>> (-7)) | (i21 << 7);
    }

    public static int[] zzd(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    public static int[] zze(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zzb(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
