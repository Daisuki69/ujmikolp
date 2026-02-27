package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.collection.ScatterMapKt;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i, int i4, int i6) {
        int i10;
        int i11 = i;
        while (true) {
            i10 = (i4 & (-4)) + i;
            if (i11 >= i10) {
                break;
            }
            int i12 = ((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24)) * ScatterMapKt.MurmurHashC1;
            int i13 = i6 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
            i6 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i14 = i4 & 3;
        if (i14 == 1) {
            int i15 = ((bArr[i10] & 255) | i) * ScatterMapKt.MurmurHashC1;
            i6 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        } else {
            if (i14 != 2) {
                i = i14 == 3 ? (bArr[i10 + 2] & 255) << 16 : 0;
            }
            i |= (bArr[i10 + 1] & 255) << 8;
            int i152 = ((bArr[i10] & 255) | i) * ScatterMapKt.MurmurHashC1;
            i6 ^= ((i152 >>> 17) | (i152 << 15)) * 461845907;
        }
        int i16 = i6 ^ i4;
        int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
        int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
        return i18 ^ (i18 >>> 16);
    }
}
