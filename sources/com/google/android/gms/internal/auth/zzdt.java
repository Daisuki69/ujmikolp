package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i4 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i4);
        return iZzj + i4;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i4, int i6, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i, i4, i6, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i4, zzds zzdsVar) throws IOException {
        int iZzk = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzk = zzk(i6, bArr, iZzk, zzdsVar);
            i6 = zzdsVar.zza;
        }
        int i10 = iZzk;
        if (i6 < 0 || i6 > i4 - i10) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i11 = i10 + i6;
        zzghVar.zzg(objZzd, bArr, i10, i11, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i11;
    }

    public static int zze(zzgh zzghVar, int i, byte[] bArr, int i4, int i6, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int iZzd = zzd(zzghVar, bArr, i4, i6, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (iZzd < i6) {
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i6, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i, zzdsVar);
        int i4 = zzdsVar.zza + iZzj;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i4) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i4, zzez.zzb);
        return iZzj + i4;
    }

    public static int zzh(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i4);
        return iZzj + i4;
    }

    public static int zzi(int i, byte[] bArr, int i4, int i6, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzm = zzm(bArr, i4, zzdsVar);
            zzgzVar.zzf(i, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i10 == 1) {
            zzgzVar.zzf(i, Long.valueOf(zzn(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZzj = zzj(bArr, i4, zzdsVar);
            int i11 = zzdsVar.zza;
            if (i11 < 0) {
                throw zzfa.zzc();
            }
            if (i11 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            if (i11 == 0) {
                zzgzVar.zzf(i, zzee.zzb);
            } else {
                zzgzVar.zzf(i, zzee.zzk(bArr, iZzj, i11));
            }
            return iZzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i, Integer.valueOf(zzb(bArr, i4)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i13 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZzj2 = zzj(bArr, i4, zzdsVar);
            i13 = zzdsVar.zza;
            if (i13 == i12) {
                i4 = iZzj2;
                break;
            }
            i4 = zzi(i13, bArr, iZzj2, i6, zzgzVarZzc, zzdsVar);
        }
        if (i4 > i6 || i13 != i12) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i, zzgzVarZzc);
        return i4;
    }

    public static int zzj(byte[] bArr, int i, zzds zzdsVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zzk(b8, bArr, i4, zzdsVar);
        }
        zzdsVar.zza = b8;
        return i4;
    }

    public static int zzk(int i, byte[] bArr, int i4, zzds zzdsVar) {
        int i6 = i & 127;
        int i10 = i4 + 1;
        byte b8 = bArr[i4];
        if (b8 >= 0) {
            zzdsVar.zza = i6 | (b8 << 7);
            return i10;
        }
        int i11 = i6 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzdsVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdsVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzdsVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzdsVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzl(int i, byte[] bArr, int i4, int i6, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i4, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (iZzj < i6) {
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zzds zzdsVar) {
        int i4 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdsVar.zzb = j;
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
        zzdsVar.zzb = j6;
        return i6;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
