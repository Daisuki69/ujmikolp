package com.google.android.gms.internal.ads;

import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoo {
    public static Pair zza(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZze = zze(randomAccessFile, 0);
        return pairZze != null ? pairZze : zze(randomAccessFile, 65535);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zzc(ByteBuffer byteBuffer, long j) {
        zzf(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j < 0 || j > KeyboardMap.kValueMask) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.j(j, "uint32 value of out range: ", new StringBuilder(String.valueOf(j).length() + 27)));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j);
    }

    public static long zzd(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 12);
    }

    private static Pair zze(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i4;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzf(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i4 = -1;
        } else {
            int i6 = iCapacity - 22;
            int iMin = Math.min(i6, 65535);
            for (int i10 = 0; i10 < iMin; i10++) {
                i4 = i6 - i10;
                if (byteBufferAllocate.getInt(i4) == 101010256 && ((char) byteBufferAllocate.getShort(i4 + 20)) == i10) {
                    break;
                }
            }
            i4 = -1;
        }
        if (i4 == -1) {
            return null;
        }
        byteBufferAllocate.position(i4);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i4)));
    }

    private static void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzg(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & KeyboardMap.kValueMask;
    }
}
