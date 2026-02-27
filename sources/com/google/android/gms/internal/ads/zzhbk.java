package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbk {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i4 = i + 1;
            byte b8 = bArr[i];
            byte b10 = (byte) ((b8 + b8) & 254);
            bArr2[i] = b10;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i4] >> 7) & 1) | b10);
            }
            i = i4;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
        return bArr2;
    }
}
