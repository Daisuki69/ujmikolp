package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzhle {
    public static final String zzc(ByteBuffer byteBuffer, int i, int i4) throws zzhiw {
        int i6;
        if ((((byteBuffer.limit() - i) - i4) | i | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i10 = i + i4;
        char[] cArr = new char[i4];
        int i11 = 0;
        while (i < i10) {
            byte b8 = byteBuffer.get(i);
            if (!zzhld.zza(b8)) {
                break;
            }
            i++;
            cArr[i11] = (char) b8;
            i11++;
        }
        int i12 = i11;
        while (i < i10) {
            int i13 = i + 1;
            byte b10 = byteBuffer.get(i);
            if (zzhld.zza(b10)) {
                cArr[i12] = (char) b10;
                i12++;
                i = i13;
                while (i < i10) {
                    byte b11 = byteBuffer.get(i);
                    if (zzhld.zza(b11)) {
                        i++;
                        cArr[i12] = (char) b11;
                        i12++;
                    }
                }
            } else {
                if (zzhld.zzb(b10)) {
                    if (i13 >= i10) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    i6 = i12 + 1;
                    i += 2;
                    zzhld.zzd(b10, byteBuffer.get(i13), cArr, i12);
                } else if (zzhld.zzc(b10)) {
                    if (i13 >= i10 - 1) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    i6 = i12 + 1;
                    int i14 = i + 2;
                    i += 3;
                    zzhld.zze(b10, byteBuffer.get(i13), byteBuffer.get(i14), cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = byteBuffer.get(i13);
                    int i15 = i + 3;
                    byte b13 = byteBuffer.get(i + 2);
                    i += 4;
                    zzhld.zzf(b10, b12, b13, byteBuffer.get(i15), cArr, i12);
                    i12 += 2;
                }
                i12 = i6;
            }
        }
        return new String(cArr, 0, i12);
    }

    public abstract int zza(int i, byte[] bArr, int i4, int i6);

    public abstract String zzb(byte[] bArr, int i, int i4) throws zzhiw;
}
