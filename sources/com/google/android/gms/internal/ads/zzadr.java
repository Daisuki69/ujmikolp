package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadr {
    public static List zza(byte[] bArr) {
        long jZze = zze(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzi(jZze)));
        arrayList.add(zzh(zzi(3840L)));
        return arrayList;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b8 = byteBuffer.get(26);
            int i4 = 28;
            int i6 = 28;
            for (int i10 = 0; i10 < b8; i10++) {
                i6 += byteBuffer.get(i10 + 27);
            }
            byte b10 = byteBuffer.get(i6 + 26);
            for (int i11 = 0; i11 < b10; i11++) {
                i4 += byteBuffer.get(i6 + 27 + i11);
            }
            i = i6 + i4;
        }
        int i12 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((zzg(byteBuffer.get(i12), byteBuffer.limit() - i12 > 1 ? byteBuffer.get(i12 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int zze(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean zzf(long j, long j6) {
        return j - j6 <= zzi(3840L) / 1000;
    }

    private static long zzg(byte b8, byte b10) {
        int i;
        int i4 = b8 & 255;
        int i6 = b8 & 3;
        if (i6 != 0) {
            i = 2;
            if (i6 != 1 && i6 != 2) {
                i = b10 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i = 1;
        }
        int i10 = i4 >> 3;
        int i11 = i10 & 3;
        return ((long) i) * ((long) (i10 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i11 : i10 >= 12 ? 10000 << (i10 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    private static byte[] zzh(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long zzi(long j) {
        return (j * 1000000000) / 48000;
    }
}
