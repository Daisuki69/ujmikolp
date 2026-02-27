package com.google.android.gms.vision.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {
    public static Bitmap zza(ByteBuffer byteBuffer, int i, int i4, int i6) throws IOException {
        byte[] bArrArray;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArrArray = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBuffer.get(bArr, 0, iLimit);
            bArrArray = bArr;
        }
        byte[] bArrZza = zza(bArrArray, i, i4);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZza, 0, bArrZza.length);
        return zza(bitmapDecodeByteArray, i6, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    private static byte[] zza(@NonNull byte[] bArr, int i, int i4) throws IOException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i4, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            yuvImage.compressToJpeg(new Rect(0, 0, i, i4), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    public static Bitmap zza(Bitmap bitmap, int i, int i4, int i6) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i4, i6, matrix, true);
    }

    @RequiresApi(19)
    public static ByteBuffer zza(Image.Plane[] planeArr, int i, int i4) {
        int i6 = i * i4;
        byte[] bArr = new byte[((i6 / 4) * 2) + i6];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i10 = (i6 * 2) / 4;
        boolean z4 = buffer2.remaining() == i10 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z4) {
            planeArr[0].getBuffer().get(bArr, 0, i6);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i6, 1);
            buffer3.get(bArr, i6 + 1, i10 - 1);
        } else {
            zza(planeArr[0], i, i4, bArr, 0, 1);
            zza(planeArr[1], i, i4, bArr, i6 + 1, 2);
            zza(planeArr[2], i, i4, bArr, i6, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    @TargetApi(19)
    private static void zza(Image.Plane plane, int i, int i4, byte[] bArr, int i6, int i10) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i11 = i / (i4 / rowStride);
        int rowStride2 = 0;
        for (int i12 = 0; i12 < rowStride; i12++) {
            int pixelStride = rowStride2;
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i6] = buffer.get(pixelStride);
                i6 += i10;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
