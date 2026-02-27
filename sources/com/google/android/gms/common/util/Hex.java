package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b8 : bArr) {
            char[] cArr2 = zzb;
            cArr[i] = cArr2[(b8 & 255) >>> 4];
            cArr[i + 1] = cArr2[b8 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @NonNull
    @KeepForSdk
    public static byte[] stringToBytes(@NonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i4 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i4), 16);
            i = i4;
        }
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr, boolean z4) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z4 || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = zza;
            sb2.append(cArr[(bArr[i] & 240) >>> 4]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        return sb2.toString();
    }
}
