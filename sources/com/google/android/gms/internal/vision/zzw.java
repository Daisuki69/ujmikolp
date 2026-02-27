package com.google.android.gms.internal.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw {
    public static Bitmap zza(Bitmap bitmap, zzs zzsVar) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (zzsVar.zze != 0) {
            Matrix matrix = new Matrix();
            int i4 = zzsVar.zze;
            if (i4 == 0) {
                i = 0;
            } else if (i4 == 1) {
                i = 90;
            } else if (i4 == 2) {
                i = 180;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("Unsupported rotation degree.");
                }
                i = 270;
            }
            matrix.postRotate(i);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        int i6 = zzsVar.zze;
        if (i6 != 1 && i6 != 3) {
            return bitmap;
        }
        zzsVar.zza = height;
        zzsVar.zzb = width;
        return bitmap;
    }

    public static ByteBuffer zza(Bitmap bitmap, boolean z4) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i);
        int i4 = i;
        for (int i6 = 0; i6 < i; i6++) {
            int i10 = i6 % width;
            int i11 = i6 / width;
            int pixel = bitmap.getPixel(i10, i11);
            float fRed = Color.red(pixel);
            float fGreen = Color.green(pixel);
            float fBlue = Color.blue(pixel);
            byteBufferAllocateDirect.put(i6, (byte) ((0.114f * fBlue) + (0.587f * fGreen) + (0.299f * fRed)));
            if (i11 % 2 == 0 && i10 % 2 == 0) {
                float f = (fBlue * 0.5f) + ((-0.331f) * fGreen) + ((-0.169f) * fRed) + 128.0f;
                float f3 = fBlue * (-0.081f);
                int i12 = i4 + 1;
                byteBufferAllocateDirect.put(i4, (byte) f);
                i4 += 2;
                byteBufferAllocateDirect.put(i12, (byte) (f3 + (fGreen * (-0.419f)) + (fRed * 0.5f) + 128.0f));
            }
        }
        return byteBufferAllocateDirect;
    }
}
