package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Bitmap;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd {
    public static ByteBuffer zza(Bitmap bitmap, boolean z4) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i);
        int i4 = 0;
        int i6 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            int i11 = 0;
            while (i11 < width) {
                int i12 = iArr[i6];
                int i13 = i12 >> 16;
                int i14 = i12 >> 8;
                int i15 = i12 & 255;
                int i16 = i4 + 1;
                int i17 = i13 & 255;
                int i18 = i14 & 255;
                byteBufferAllocateDirect.put(i4, (byte) Math.min(255, ((((i15 * 25) + ((i18 * TsExtractor.TS_STREAM_TYPE_AC3) + (i17 * 66))) + 128) >> 8) + 16));
                if (i10 % 2 == 0 && i6 % 2 == 0) {
                    int i19 = i17 * 112;
                    int i20 = (((i19 - (i18 * 94)) - (i15 * 18)) + 128) >> 8;
                    int i21 = (((((i17 * (-38)) - (i18 * 74)) + (i15 * 112)) + 128) >> 8) + 128;
                    int i22 = i + 1;
                    byteBufferAllocateDirect.put(i, (byte) Math.min(255, i20 + 128));
                    i += 2;
                    byteBufferAllocateDirect.put(i22, (byte) Math.min(255, i21));
                }
                i6++;
                i11++;
                i4 = i16;
            }
        }
        return byteBufferAllocateDirect;
    }
}
