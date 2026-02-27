package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzhl {
    public static int zza(byte[] bArr, int i, zzhn zzhnVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zza(b8, bArr, i4, zzhnVar);
        }
        zzhnVar.zza = b8;
        return i4;
    }

    public static int zzb(byte[] bArr, int i, zzhn zzhnVar) {
        int i4 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzhnVar.zzb = j;
            return i4;
        }
        int i6 = i + 2;
        byte b8 = bArr[i4];
        long j6 = (j & 127) | (((long) (b8 & 127)) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i6 + 1;
            byte b10 = bArr[i6];
            i10 += 7;
            j6 |= ((long) (b10 & 127)) << i10;
            b8 = b10;
            i6 = i11;
        }
        zzhnVar.zzb = j6;
        return i6;
    }

    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    public static int zze(byte[] bArr, int i, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza;
        if (i4 < 0) {
            throw zzjk.zzb();
        }
        if (i4 > bArr.length - iZza) {
            throw zzjk.zza();
        }
        if (i4 == 0) {
            zzhnVar.zzc = zzht.zza;
            return iZza;
        }
        zzhnVar.zzc = zzht.zza(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zzc(byte[] bArr, int i, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza;
        if (i4 < 0) {
            throw zzjk.zzb();
        }
        if (i4 == 0) {
            zzhnVar.zzc = "";
            return iZza;
        }
        zzhnVar.zzc = new String(bArr, iZza, i4, zzjf.zza);
        return iZza + i4;
    }

    public static int zzd(byte[] bArr, int i, zzhn zzhnVar) throws zzjk {
        int iZza = zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza;
        if (i4 < 0) {
            throw zzjk.zzb();
        }
        if (i4 == 0) {
            zzhnVar.zzc = "";
            return iZza;
        }
        zzhnVar.zzc = zzmd.zzb(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zza(int i, byte[] bArr, int i4, zzhn zzhnVar) {
        int i6 = i & 127;
        int i10 = i4 + 1;
        byte b8 = bArr[i4];
        if (b8 >= 0) {
            zzhnVar.zza = i6 | (b8 << 7);
            return i10;
        }
        int i11 = i6 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzhnVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzhnVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzhnVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzhnVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zza(zzlc zzlcVar, byte[] bArr, int i, int i4, zzhn zzhnVar) throws IOException {
        int iZza = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZza = zza(i6, bArr, iZza, zzhnVar);
            i6 = zzhnVar.zza;
        }
        int i10 = iZza;
        if (i6 >= 0 && i6 <= i4 - i10) {
            Object objZza = zzlcVar.zza();
            int i11 = i10 + i6;
            zzlcVar.zza(objZza, bArr, i10, i11, zzhnVar);
            zzlcVar.zzc(objZza);
            zzhnVar.zzc = objZza;
            return i11;
        }
        throw zzjk.zza();
    }

    public static int zza(zzlc zzlcVar, byte[] bArr, int i, int i4, int i6, zzhn zzhnVar) throws IOException {
        zzko zzkoVar = (zzko) zzlcVar;
        Object objZza = zzkoVar.zza();
        int iZza = zzkoVar.zza(objZza, bArr, i, i4, i6, zzhnVar);
        zzkoVar.zzc(objZza);
        zzhnVar.zzc = objZza;
        return iZza;
    }

    public static int zza(int i, byte[] bArr, int i4, int i6, zzjl<?> zzjlVar, zzhn zzhnVar) {
        zzjd zzjdVar = (zzjd) zzjlVar;
        int iZza = zza(bArr, i4, zzhnVar);
        zzjdVar.zzc(zzhnVar.zza);
        while (iZza < i6) {
            int iZza2 = zza(bArr, iZza, zzhnVar);
            if (i != zzhnVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhnVar);
            zzjdVar.zzc(zzhnVar.zza);
        }
        return iZza;
    }

    public static int zza(byte[] bArr, int i, zzjl<?> zzjlVar, zzhn zzhnVar) throws IOException {
        zzjd zzjdVar = (zzjd) zzjlVar;
        int iZza = zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza + iZza;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzhnVar);
            zzjdVar.zzc(zzhnVar.zza);
        }
        if (iZza == i4) {
            return iZza;
        }
        throw zzjk.zza();
    }

    public static int zza(zzlc<?> zzlcVar, int i, byte[] bArr, int i4, int i6, zzjl<?> zzjlVar, zzhn zzhnVar) throws IOException {
        int iZza = zza(zzlcVar, bArr, i4, i6, zzhnVar);
        zzjlVar.add(zzhnVar.zzc);
        while (iZza < i6) {
            int iZza2 = zza(bArr, iZza, zzhnVar);
            if (i != zzhnVar.zza) {
                break;
            }
            iZza = zza(zzlcVar, bArr, iZza2, i6, zzhnVar);
            zzjlVar.add(zzhnVar.zzc);
        }
        return iZza;
    }

    public static int zza(int i, byte[] bArr, int i4, int i6, zzlx zzlxVar, zzhn zzhnVar) throws zzjk {
        if ((i >>> 3) == 0) {
            throw zzjk.zzd();
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzb = zzb(bArr, i4, zzhnVar);
            zzlxVar.zza(i, Long.valueOf(zzhnVar.zzb));
            return iZzb;
        }
        if (i10 == 1) {
            zzlxVar.zza(i, Long.valueOf(zzb(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZza = zza(bArr, i4, zzhnVar);
            int i11 = zzhnVar.zza;
            if (i11 >= 0) {
                if (i11 > bArr.length - iZza) {
                    throw zzjk.zza();
                }
                if (i11 == 0) {
                    zzlxVar.zza(i, zzht.zza);
                } else {
                    zzlxVar.zza(i, zzht.zza(bArr, iZza, i11));
                }
                return iZza + i11;
            }
            throw zzjk.zzb();
        }
        if (i10 != 3) {
            if (i10 == 5) {
                zzlxVar.zza(i, Integer.valueOf(zza(bArr, i4)));
                return i4 + 4;
            }
            throw zzjk.zzd();
        }
        zzlx zzlxVarZzb = zzlx.zzb();
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZza2 = zza(bArr, i4, zzhnVar);
            i13 = zzhnVar.zza;
            if (i13 == i12) {
                i4 = iZza2;
                break;
            }
            i4 = zza(i13, bArr, iZza2, i6, zzlxVarZzb, zzhnVar);
        }
        if (i4 <= i6 && i13 == i12) {
            zzlxVar.zza(i, zzlxVarZzb);
            return i4;
        }
        throw zzjk.zzg();
    }

    public static int zza(int i, byte[] bArr, int i4, int i6, zzhn zzhnVar) throws zzjk {
        if ((i >>> 3) == 0) {
            throw zzjk.zzd();
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzb(bArr, i4, zzhnVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zza(bArr, i4, zzhnVar) + zzhnVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw zzjk.zzd();
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zza(bArr, i4, zzhnVar);
            i12 = zzhnVar.zza;
            if (i12 == i11) {
                break;
            }
            i4 = zza(i12, bArr, i4, i6, zzhnVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw zzjk.zzg();
        }
        return i4;
    }
}
