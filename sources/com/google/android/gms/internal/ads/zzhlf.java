package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhlf extends zzhle {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhlf.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhle
    public final String zzb(byte[] bArr, int i, int i4) throws zzhiw {
        int i6;
        int length = bArr.length;
        if ((((length - i) - i4) | i | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i10 = i + i4;
        char[] cArr = new char[i4];
        int i11 = 0;
        while (i < i10) {
            byte b8 = bArr[i];
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
            byte b10 = bArr[i];
            if (zzhld.zza(b10)) {
                cArr[i12] = (char) b10;
                i12++;
                i = i13;
                while (i < i10) {
                    byte b11 = bArr[i];
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
                    zzhld.zzd(b10, bArr[i13], cArr, i12);
                } else if (zzhld.zzc(b10)) {
                    if (i13 >= i10 - 1) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    i6 = i12 + 1;
                    int i14 = i + 2;
                    i += 3;
                    zzhld.zze(b10, bArr[i13], bArr[i14], cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i13];
                    int i15 = i + 3;
                    byte b13 = bArr[i + 2];
                    i += 4;
                    zzhld.zzf(b10, b12, b13, bArr[i15], cArr, i12);
                    i12 += 2;
                }
                i12 = i6;
            }
        }
        return new String(cArr, 0, i12);
    }
}
