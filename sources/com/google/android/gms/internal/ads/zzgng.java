package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzgng {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i4 = 0; i4 < 26; i4++) {
            byte b8 = (byte) (i4 + 10);
            bArr[i4 + 65] = b8;
            bArr[i4 + 97] = b8;
        }
        zza = bArr;
    }

    public static int zza(char c) {
        if (c < 128) {
            return zza[c];
        }
        return -1;
    }
}
