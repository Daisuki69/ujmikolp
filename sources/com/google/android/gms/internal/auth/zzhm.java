package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes3.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i4) {
        byte b8 = bArr[i - 1];
        int i6 = i4 - i;
        if (i6 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i6 == 1) {
            byte b10 = bArr[i];
            if (b8 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b8;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i];
        byte b12 = bArr[i + 1];
        if (b8 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b8);
    }

    public static String zzb(byte[] bArr, int i, int i4) throws zzfa {
        int length = bArr.length;
        if ((i | i4 | ((length - i) - i4)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i6 = i + i4;
        char[] cArr = new char[i4];
        int i10 = 0;
        while (i < i6) {
            byte b8 = bArr[i];
            if (!zzhj.zzd(b8)) {
                break;
            }
            i++;
            cArr[i10] = (char) b8;
            i10++;
        }
        int i11 = i10;
        while (i < i6) {
            int i12 = i + 1;
            byte b10 = bArr[i];
            if (zzhj.zzd(b10)) {
                cArr[i11] = (char) b10;
                i11++;
                i = i12;
                while (i < i6) {
                    byte b11 = bArr[i];
                    if (!zzhj.zzd(b11)) {
                        break;
                    }
                    i++;
                    cArr[i11] = (char) b11;
                    i11++;
                }
            } else if (b10 < -32) {
                if (i12 >= i6) {
                    throw zzfa.zzb();
                }
                i += 2;
                zzhj.zzc(b10, bArr[i12], cArr, i11);
                i11++;
            } else if (b10 < -16) {
                if (i12 >= i6 - 1) {
                    throw zzfa.zzb();
                }
                int i13 = i + 2;
                i += 3;
                zzhj.zzb(b10, bArr[i12], bArr[i13], cArr, i11);
                i11++;
            } else {
                if (i12 >= i6 - 2) {
                    throw zzfa.zzb();
                }
                int i14 = i + 2;
                int i15 = i + 3;
                i += 4;
                zzhj.zza(b10, bArr[i12], bArr[i14], bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i, int i4) {
        return zza.zzb(bArr, i, i4);
    }
}
