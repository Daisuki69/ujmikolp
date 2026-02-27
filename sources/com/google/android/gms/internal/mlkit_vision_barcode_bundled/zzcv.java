package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i, zzcuVar);
        int i4 = zzcuVar.zza;
        if (i4 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iZzj) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            zzcuVar.zzc = zzdf.zzb;
            return iZzj;
        }
        zzcuVar.zzc = zzdf.zzr(bArr, iZzj, i4);
        return iZzj + i4;
    }

    public static int zzb(int i, byte[] bArr, int i4, int i6, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) throws IOException {
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object objValueOf = null;
        if (zzhfVar == zzhf.zzn) {
            zzj(bArr, i4, zzcuVar);
            throw null;
        }
        switch (zzhfVar.ordinal()) {
            case 0:
                i4 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i4)));
                break;
            case 1:
                i4 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i4)));
                break;
            case 2:
            case 3:
                i4 = zzm(bArr, i4, zzcuVar);
                objValueOf = Long.valueOf(zzcuVar.zzb);
                break;
            case 4:
            case 12:
                i4 = zzj(bArr, i4, zzcuVar);
                objValueOf = Integer.valueOf(zzcuVar.zza);
                break;
            case 5:
            case 15:
                i4 += 8;
                objValueOf = Long.valueOf(zzq(bArr, i4));
                break;
            case 6:
            case 14:
                i4 += 4;
                objValueOf = Integer.valueOf(zzc(bArr, i4));
                break;
            case 7:
                i4 = zzm(bArr, i4, zzcuVar);
                objValueOf = Boolean.valueOf(zzcuVar.zzb != 0);
                break;
            case 8:
                i4 = zzh(bArr, i4, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 9:
                int i10 = ((i >>> 3) << 3) | 4;
                zzge zzgeVarZzb = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze = zzdxVar.zze(zzefVar.zzb);
                if (objZze == null) {
                    objZze = zzgeVarZzb.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze);
                }
                return zzn(objZze, zzgeVarZzb, bArr, i4, i6, i10, zzcuVar);
            case 10:
                zzge zzgeVarZzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze2 = zzdxVar.zze(zzefVar.zzb);
                if (objZze2 == null) {
                    objZze2 = zzgeVarZzb2.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze2);
                }
                return zzo(objZze2, zzgeVarZzb2, bArr, i4, i6, zzcuVar);
            case 11:
                i4 = zza(bArr, i4, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i4 = zzj(bArr, i4, zzcuVar);
                objValueOf = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                break;
            case 17:
                i4 = zzm(bArr, i4, zzcuVar);
                objValueOf = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                break;
        }
        zzdxVar.zzi(zzefVar.zzb, objValueOf);
        return i4;
    }

    public static int zzc(byte[] bArr, int i) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i10 << 16);
    }

    public static int zzd(zzge zzgeVar, byte[] bArr, int i, int i4, int i6, zzcu zzcuVar) throws IOException {
        Object objZze = zzgeVar.zze();
        int iZzn = zzn(objZze, zzgeVar, bArr, i, i4, i6, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzge zzgeVar, byte[] bArr, int i, int i4, zzcu zzcuVar) throws IOException {
        Object objZze = zzgeVar.zze();
        int iZzo = zzo(objZze, zzgeVar, bArr, i, i4, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzo;
    }

    public static int zzf(zzge zzgeVar, int i, byte[] bArr, int i4, int i6, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        int iZze = zze(zzgeVar, bArr, i4, i6, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (iZze < i6) {
            int iZzj = zzj(bArr, iZze, zzcuVar);
            if (i != zzcuVar.zza) {
                break;
            }
            iZze = zze(zzgeVar, bArr, iZzj, i6, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return iZze;
    }

    public static int zzg(byte[] bArr, int i, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i, zzcuVar);
        int i4 = zzcuVar.zza + iZzj;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (iZzj == i4) {
            return iZzj;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzh(byte[] bArr, int i, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i, zzcuVar);
        int i4 = zzcuVar.zza;
        if (i4 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            zzcuVar.zzc = "";
            return iZzj;
        }
        zzcuVar.zzc = new String(bArr, iZzj, i4, zzep.zza);
        return iZzj + i4;
    }

    public static int zzi(int i, byte[] bArr, int i4, int i6, zzgt zzgtVar, zzcu zzcuVar) throws zzer {
        if ((i >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzm = zzm(bArr, i4, zzcuVar);
            zzgtVar.zzj(i, Long.valueOf(zzcuVar.zzb));
            return iZzm;
        }
        if (i10 == 1) {
            zzgtVar.zzj(i, Long.valueOf(zzq(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZzj = zzj(bArr, i4, zzcuVar);
            int i11 = zzcuVar.zza;
            if (i11 < 0) {
                throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZzj) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzgtVar.zzj(i, zzdf.zzb);
            } else {
                zzgtVar.zzj(i, zzdf.zzr(bArr, iZzj, i11));
            }
            return iZzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzer("Protocol message contained an invalid tag (zero).");
            }
            zzgtVar.zzj(i, Integer.valueOf(zzc(bArr, i4)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        zzgt zzgtVarZzf = zzgt.zzf();
        int i13 = zzcuVar.zze + 1;
        zzcuVar.zze = i13;
        zzr(i13);
        int i14 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZzj2 = zzj(bArr, i4, zzcuVar);
            int i15 = zzcuVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i4 = iZzj2;
                break;
            }
            i4 = zzi(i15, bArr, iZzj2, i6, zzgtVarZzf, zzcuVar);
            i14 = i15;
        }
        zzcuVar.zze--;
        if (i4 > i6 || i14 != i12) {
            throw new zzer("Failed to parse the message.");
        }
        zzgtVar.zzj(i, zzgtVarZzf);
        return i4;
    }

    public static int zzj(byte[] bArr, int i, zzcu zzcuVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zzk(b8, bArr, i4, zzcuVar);
        }
        zzcuVar.zza = b8;
        return i4;
    }

    public static int zzk(int i, byte[] bArr, int i4, zzcu zzcuVar) {
        byte b8 = bArr[i4];
        int i6 = i4 + 1;
        int i10 = i & 127;
        if (b8 >= 0) {
            zzcuVar.zza = i10 | (b8 << 7);
            return i6;
        }
        int i11 = i10 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zzcuVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzcuVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzcuVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzcuVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzl(int i, byte[] bArr, int i4, int i6, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i4, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (iZzj < i6) {
            int iZzj2 = zzj(bArr, iZzj, zzcuVar);
            if (i != zzcuVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zzcu zzcuVar) {
        long j = bArr[i];
        int i4 = i + 1;
        if (j >= 0) {
            zzcuVar.zzb = j;
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
        zzcuVar.zzb = j6;
        return i6;
    }

    public static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i, int i4, int i6, zzcu zzcuVar) throws IOException {
        int i10 = zzcuVar.zze + 1;
        zzcuVar.zze = i10;
        zzr(i10);
        int iZzc = ((zzfp) zzgeVar).zzc(obj, bArr, i, i4, i6, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i, int i4, zzcu zzcuVar) throws IOException {
        int iZzk = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzk = zzk(i6, bArr, iZzk, zzcuVar);
            i6 = zzcuVar.zza;
        }
        int i10 = iZzk;
        if (i6 < 0 || i6 > i4 - i10) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzcuVar.zze + 1;
        zzcuVar.zze = i11;
        zzr(i11);
        int i12 = i10 + i6;
        zzgeVar.zzh(obj, bArr, i10, i12, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return i12;
    }

    public static int zzp(int i, byte[] bArr, int i4, int i6, zzcu zzcuVar) throws zzer {
        if ((i >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzm(bArr, i4, zzcuVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zzj(bArr, i4, zzcuVar) + zzcuVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zzj(bArr, i4, zzcuVar);
            i12 = zzcuVar.zza;
            if (i12 == i11) {
                break;
            }
            i4 = zzp(i12, bArr, i4, i6, zzcuVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw new zzer("Failed to parse the message.");
        }
        return i4;
    }

    public static long zzq(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzr(int i) throws zzer {
        if (i >= zzb) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
