package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzhgq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzhgp zzhgpVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zzb(b8, bArr, i4, zzhgpVar);
        }
        zzhgpVar.zza = b8;
        return i4;
    }

    public static int zzb(int i, byte[] bArr, int i4, zzhgp zzhgpVar) {
        byte b8 = bArr[i4];
        int i6 = i4 + 1;
        int i10 = i & 127;
        if (b8 >= 0) {
            zzhgpVar.zza = i10 | (b8 << 7);
            return i6;
        }
        int i11 = i10 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zzhgpVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzhgpVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzhgpVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzhgpVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzc(byte[] bArr, int i, zzhgp zzhgpVar) {
        long j = bArr[i];
        int i4 = i + 1;
        if (j >= 0) {
            zzhgpVar.zzb = j;
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
        zzhgpVar.zzb = j6;
        return i6;
    }

    public static int zzd(byte[] bArr, int i) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i10 << 16);
    }

    public static long zze(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i, zzhgp zzhgpVar) throws zzhiw {
        int iZza = zza(bArr, i, zzhgpVar);
        int i4 = zzhgpVar.zza;
        if (i4 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            zzhgpVar.zzc = "";
            return iZza;
        }
        zzhgpVar.zzc = zzhlh.zzf(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zzg(byte[] bArr, int i, zzhgp zzhgpVar) throws zzhiw {
        int iZza = zza(bArr, i, zzhgpVar);
        int i4 = zzhgpVar.zza;
        if (i4 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iZza) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            zzhgpVar.zzc = zzhhb.zzb;
            return iZza;
        }
        zzhgpVar.zzc = zzhhb.zzr(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zzh(zzhkk zzhkkVar, byte[] bArr, int i, int i4, zzhgp zzhgpVar) throws IOException {
        Object objZza = zzhkkVar.zza();
        int iZzj = zzj(objZza, zzhkkVar, bArr, i, i4, zzhgpVar);
        zzhkkVar.zzk(objZza);
        zzhgpVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzhkk zzhkkVar, byte[] bArr, int i, int i4, int i6, zzhgp zzhgpVar) throws IOException {
        Object objZza = zzhkkVar.zza();
        int iZzk = zzk(objZza, zzhkkVar, bArr, i, i4, i6, zzhgpVar);
        zzhkkVar.zzk(objZza);
        zzhgpVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzhkk zzhkkVar, byte[] bArr, int i, int i4, zzhgp zzhgpVar) throws IOException {
        int iZzb = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzb = zzb(i6, bArr, iZzb, zzhgpVar);
            i6 = zzhgpVar.zza;
        }
        int i10 = iZzb;
        if (i6 < 0 || i6 > i4 - i10) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i11;
        zzq(i11);
        int i12 = i10 + i6;
        zzhkkVar.zzj(obj, bArr, i10, i12, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return i12;
    }

    public static int zzk(Object obj, zzhkk zzhkkVar, byte[] bArr, int i, int i4, int i6, zzhgp zzhgpVar) throws IOException {
        int i10 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i10;
        zzq(i10);
        int iZzi = ((zzhjv) zzhkkVar).zzi(obj, bArr, i, i4, i6, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i, byte[] bArr, int i4, int i6, zzhit zzhitVar, zzhgp zzhgpVar) {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int iZza = zza(bArr, i4, zzhgpVar);
        zzhiiVar.zzi(zzhgpVar.zza);
        while (iZza < i6) {
            int iZza2 = zza(bArr, iZza, zzhgpVar);
            if (i != zzhgpVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i, zzhit zzhitVar, zzhgp zzhgpVar) throws IOException {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int iZza = zza(bArr, i, zzhgpVar);
        int i4 = zzhgpVar.zza + iZza;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        if (iZza == i4) {
            return iZza;
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzhkk zzhkkVar, int i, byte[] bArr, int i4, int i6, zzhit zzhitVar, zzhgp zzhgpVar) throws IOException {
        int iZzh = zzh(zzhkkVar, bArr, i4, i6, zzhgpVar);
        zzhitVar.add(zzhgpVar.zzc);
        while (iZzh < i6) {
            int iZza = zza(bArr, iZzh, zzhgpVar);
            if (i != zzhgpVar.zza) {
                break;
            }
            iZzh = zzh(zzhkkVar, bArr, iZza, i6, zzhgpVar);
            zzhitVar.add(zzhgpVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i, byte[] bArr, int i4, int i6, zzhkw zzhkwVar, zzhgp zzhgpVar) throws zzhiw {
        if ((i >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzc = zzc(bArr, i4, zzhgpVar);
            zzhkwVar.zzk(i, Long.valueOf(zzhgpVar.zzb));
            return iZzc;
        }
        if (i10 == 1) {
            zzhkwVar.zzk(i, Long.valueOf(zze(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZza = zza(bArr, i4, zzhgpVar);
            int i11 = zzhgpVar.zza;
            if (i11 < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZza) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzhkwVar.zzk(i, zzhhb.zzb);
            } else {
                zzhkwVar.zzk(i, zzhhb.zzr(bArr, iZza, i11));
            }
            return iZza + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzhiw("Protocol message contained an invalid tag (zero).");
            }
            zzhkwVar.zzk(i, Integer.valueOf(zzd(bArr, i4)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        int i13 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZza2 = zza(bArr, i4, zzhgpVar);
            int i15 = zzhgpVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i4 = iZza2;
                break;
            }
            i4 = zzo(i15, bArr, iZza2, i6, zzhkwVarZzb, zzhgpVar);
            i14 = i15;
        }
        zzhgpVar.zze--;
        if (i4 > i6 || i14 != i12) {
            throw new zzhiw("Failed to parse the message.");
        }
        zzhkwVar.zzk(i, zzhkwVarZzb);
        return i4;
    }

    public static int zzp(int i, byte[] bArr, int i4, int i6, zzhgp zzhgpVar) throws zzhiw {
        if ((i >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzc(bArr, i4, zzhgpVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zza(bArr, i4, zzhgpVar) + zzhgpVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zza(bArr, i4, zzhgpVar);
            i12 = zzhgpVar.zza;
            if (i12 == i11) {
                break;
            }
            i4 = zzp(i12, bArr, i4, i6, zzhgpVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw new zzhiw("Failed to parse the message.");
        }
        return i4;
    }

    private static void zzq(int i) throws zzhiw {
        if (i >= zzb) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
